import java.util.Scanner;

public class bancodedadospais{
    public static void main(String[] args)
    {int reinicio;
        reinicio = 1;
        while(reinicio == 1){ 
        Scanner scan                   = new Scanner(System.in);
        int     contador;
        String  paisesamericadosul[]   = new String[19];
        String  paisesamericadonorte[] = new String[19];
        String  paiseseuropa[]         = new String[38];
        String  paisesasia[]           = new String[50];
        String  paisesafrica[]         = new String[55];
        String  paisesoceania[]        = new String[19];
        
        System.out.println("\n\n\n------------------\nPROGRAMA INICIADO\n------------------");
        System.out.println("Qual Continente voce deseja selecionar?\n     America do sul.......[1]\n     America do Norte.....[2]\n     Europa...............[3]\n     Africa...............[4]\n     Azia.................[5]\n     Oceania..............[6]");
        int escolhacontinente;
        escolhacontinente = scan.nextInt();
//america do sul

        reinicio =2;
        paisesamericadosul[1]= "...............Brasil.";
        paisesamericadosul[2]= "............Argentina.";
        paisesamericadosul[3]= ".............Colombia.";
        paisesamericadosul[4]= ".................Peru.";
        paisesamericadosul[5]= "................Chile.";
        paisesamericadosul[6]= "..............Equador.";
        paisesamericadosul[7]= "............Venezuela.";
        paisesamericadosul[8]= "..............Bolivia.";
        paisesamericadosul[9]= ".............Suriname.";
        paisesamericadosul[10]="...............Guyana.";
        paisesamericadosul[11]="...............Uruguai";
        paisesamericadosul[12]="..............Paraguai";
        paisesamericadosul[13]="...............Curação";
        paisesamericadosul[14]=".................Aruba";
        paisesamericadosul[15]=".......Guiana Francesa";
        paisesamericadosul[16]="........Islas Malvinas";
        paisesamericadosul[17]="...Trinidad and Tobago";
        paisesamericadosul[18]=".Caribbean Netherlands";

        //america do norte
        paisesamericadonorte[1]="Canada...............";
        paisesamericadonorte[2]="Estados Unidos.......";
        paisesamericadonorte[3]="Dinamarca(Groelandia)";
        paisesamericadonorte[4]="Mexico...............";

        //europa


        paiseseuropa[1]= "Alemanha............";
        paiseseuropa[2]= "Andorra.............";
        paiseseuropa[3]= "Austria.............";
        paiseseuropa[4]= "Belgica.............";
        paiseseuropa[5]= "Bielorussia.........";
        paiseseuropa[6]= "Bósnia e Herzegovina";
        paiseseuropa[7]= "Bulgaria............";
        paiseseuropa[8]= "Cazaquistao.........";
        paiseseuropa[9]= "Chipre..............";
        paiseseuropa[10]="Croacia.............";
        paiseseuropa[11]="Dinamarca...........";
        paiseseuropa[12]="Eslovaquia..........";
        paiseseuropa[13]="Eslovênia...........";
        paiseseuropa[14]="Espanha.............";
        paiseseuropa[15]="Estonia.............";
        paiseseuropa[16]="Islandia............";
        paiseseuropa[17]="Italia..............";
        paiseseuropa[18]="Letonia.............";
        paiseseuropa[19]="Liechtenstein.......";
        paiseseuropa[20]="Lituania............";
        paiseseuropa[21]="Luxemburgo..........";
        paiseseuropa[22]="Malta...............";
        paiseseuropa[23]="Moldávia............";
        paiseseuropa[24]="Monaco..............";
        paiseseuropa[25]="Montenegro..........";
        paiseseuropa[26]="Noruega.............";
        paiseseuropa[27]="Paises Baixos.......";
        paiseseuropa[28]="Polonia.............";
        paiseseuropa[29]="Portugal............";
        paiseseuropa[30]="Tchéquia............";
        paiseseuropa[31]="Macedonia do norte..";
        paiseseuropa[32]="Tchéquia............";
        paiseseuropa[33]="Reino Unido.........";
        paiseseuropa[34]="Finlândia...........";
        paiseseuropa[35]="França..............";
        paiseseuropa[36]="Grécia..............";
        paiseseuropa[37]="Hungria.............";


        //africa

                
        paisesafrica[1]="Angola (Luanda)...........................";
        paisesafrica[2]="Argélia (Argel)...........................";
        paisesafrica[3]="Benim (Porto Novo)........................";
        paisesafrica[4]="Botswana (Gaborone).......................";
        paisesafrica[5]="Burquina Faso (Ouagadougou)...............";
        paisesafrica[6]="Burundi (Gitega)..........................";
        paisesafrica[7]="Camarões (Yaoundé)........................";
        paisesafrica[8]="Chade (N'djamena).........................";
        paisesafrica[9]="Costa do Marfim (Abidjan).................";
        paisesafrica[10]="Djibouti (Djibouti)......................";
        paisesafrica[11]="Egito (Cairo)............................";
        paisesafrica[12]="Eritreia (Asmara)........................";
        paisesafrica[13]="Etiópia (Adis Abeba).....................";
        paisesafrica[14]="Gabão (Libreville).......................";
        paisesafrica[15]="Gâmbia (Banjul)..........................";
        paisesafrica[16]="Gana (Acra)..............................";
        paisesafrica[17]="Guiné (Conacri)..........................";
        paisesafrica[18]="Guiné-Bissau (Bissau)....................";
        paisesafrica[19]="Guiné Equatorial (Malabo)................";
        paisesafrica[20]="Ilhas de Madagascar (Antananarivo).......";
        paisesafrica[21]="Ilhas de Cabo Verde (Praia)..............";
        paisesafrica[22]="Ilha de Comores (Moroni).................";
        paisesafrica[23]="Ilhas de São Tomé e Príncipe (São Tomé)..";
        paisesafrica[24]="Ilhas Seychelles (Victoria)..............";
        paisesafrica[25]="Lesoto (Maseru)..........................";
        paisesafrica[26]="Libéria (Monróvia).......................";
        paisesafrica[27]="Líbia (Trípoli)..........................";
        paisesafrica[28]="Malawi (Lilongwe)........................";
        paisesafrica[29]="Mali (Bamako)............................";
        paisesafrica[30]="Marrocos (Rabat).........................";
        paisesafrica[31]="Mauritânia (Nouakchott)..................";
        paisesafrica[32]="Moçambique (Maputo)......................";
        paisesafrica[33]="Namíbia (Windhoek).......................";
        paisesafrica[34]="Níger (Niamey)...........................";
        paisesafrica[35]="Nigéria (Abuja)..........................";
        paisesafrica[36]="Quênia (Nairóbi).........................";
        paisesafrica[37]="República Centro-Africana (Bangui).......";
        paisesafrica[38]="República Democrática do Congo (Kinshasa)";
        paisesafrica[39]="República do Congo (Brazzaville).........";
        paisesafrica[40]="República de Maurício (Port Louis).......";
        paisesafrica[41]="Ruanda (Kigali)..........................";
        paisesafrica[42]="Senegal (Dacar)..........................";
        paisesafrica[43]="Serra Leoa (Freetown)....................";
        paisesafrica[44]="Somália (Mogadíscio).....................";
        paisesafrica[45]="Eswatini (Lobamba).......................";
        paisesafrica[46]="Sudão (Cartum)...........................";
        paisesafrica[47]="Sudão do Sul (Juba)......................";
        paisesafrica[48]="Tanzânia (Dodoma)........................";
        paisesafrica[49]="Togo (Lomé)..............................";
        paisesafrica[50]="Tunísia (Tunes)..........................";
        paisesafrica[51]="Uganda (Kampala).........................";
        paisesafrica[52]="Zâmbia (Lusaka)..........................";
        paisesafrica[53]="Zimbábue (Harare)........................";
        paisesafrica[54]="África do Sul (Cidade do Cabo)...........";

        //asia

        paisesasia[1]="Afeganistão (Cabul).........";
        paisesasia[2]="Arábia Saudita (Riad).......";
        paisesasia[3]="Armênia* (Yerevan)..........";
        paisesasia[4]="Azerbaijão* (Baku)..........";
        paisesasia[5]="Bahrein (Manama).>..........";
        paisesasia[6]="Bangladesh (Daca)>..........";
        paisesasia[7]="Brunei (Bandar Seri Begawan)";
        paisesasia[8]="Butão (Timbu)...............";
        paisesasia[9]="Camboja (Phnom Penh)........";
        paisesasia[10]="Cazaquistão (Nursultan)....";
        paisesasia[11]="Catar (Doha)...............";
        paisesasia[12]="China (Pequim).............";
        paisesasia[13]="Chipre* (Nicósia)..........";
        paisesasia[14]="Cingapura (Cingapura)......";
        paisesasia[15]="Coreia do Norte (Pyongyang)";
        paisesasia[16]="Coreia do Sul (Seul).......";
        paisesasia[17]="Japão (Tóquio).............";
        paisesasia[18]="Israel (Jerusalém).........";
        paisesasia[19]="Iraque (Bagdá).............";
        paisesasia[20]="Irã (Teerã)................";
        paisesasia[21]="Indonésia* (Jacarta).......";
        paisesasia[22]="Índia (Nova Deli)..........";
        paisesasia[23]="Iêmen (Sana)...............";
        paisesasia[24]="Geórgia* (Tbilisi).........";
        paisesasia[25]="Filipinas (Manila).........";
        paisesasia[26]="Emirados Árabes (Abu Dhabi)";
        paisesasia[27]="Egito* (Cairo).............";
        paisesasia[28]="Jordânia (Amã).............";
        paisesasia[29]="Kuwait (Kuwait)............";
        paisesasia[30]="Laos (Vienciana)...........";
        paisesasia[31]="Líbano (Beirute)...........";
        paisesasia[32]="Malásia (Kuala Lumpur).....";
        paisesasia[33]="Maldivas (Malé)............";
        paisesasia[34]="Mianmar (Nay Puy Taw)......";
        paisesasia[35]="Mongólia (Ulan Bator)......";
        paisesasia[36]="Omã (Mascate)..............";
        paisesasia[37]="Nepal (Katmandu)...........";
        paisesasia[38]="Paquistão (Islamabad)......";
        paisesasia[39]="Quirguistão (Bishkek)......";
        paisesasia[40]="Rússia* (Moscou)...........";
        paisesasia[41]="Síria (Damasco)............";
        paisesasia[42]="Sri Lanka (Kotte)..........";
        paisesasia[43]="Tajiquistão (Dushanbe).....";
        paisesasia[44]="Tailândia (Bangkok)........";
        paisesasia[45]="Vietnã (Hanói).............";
        paisesasia[46]="Timor-Leste* (Díli)........";
        paisesasia[47]="Turcomenistão (Asgabate)...";
        paisesasia[48]="Turquia* (Ancara)..........";
        paisesasia[49]="Uzbequistão (Tashkent).....";

        //oceania

        paisesoceania[1]="Austrália (Capital: Camberra).....................";
        paisesoceania[2]="Estados Federados da Micronésia (Capital: Palikir)";
        paisesoceania[3]="Fiji (Capital: Suva)..............................";
        paisesoceania[4]="Ilhas Marshall (Capital: Majuro)..................";
        paisesoceania[5]="Ilhas Salomão (Capital: Honiara)..................";
        paisesoceania[6]="Kiribati (Capital: Tarawa do Sul).................";
        paisesoceania[7]="Nauru (Capital: Yaren)............................";
        paisesoceania[8]="Nova Zelândia (Capital: Wellington)...............";
        paisesoceania[9]="Palau (Capital: Ngerulmud)........................";
        paisesoceania[10]="Papua-Nova Guiné (Capital: Port Moresby).........";
        paisesoceania[11]="Samoa (Capital: Apia)............................";
        paisesoceania[12]="Tonga (Capital: Nuku'alofa)......................";
        paisesoceania[13]="Tuvalu (Capital: Funafuti )......................";
        paisesoceania[14]="Vanuatu (Capital: Port Vila......................";



        if(escolhacontinente == 1)
        { 
            System.out.println("paises da america do sul");
                for(contador = 1; contador<19;contador++)
                {
                    System.out.printf("\n%s[%d]",paisesamericadosul[contador],contador);
                }
            System.out.printf("\n\nDeseja ver outro continente?Sim[1]Nao[2]");
            reinicio = scan.nextInt();
        
        }
//america do norte

        if(escolhacontinente == 2)
        {   
            System.out.printf("\npaises da america do norte");
                for(contador =1; contador<=4;contador++)
                { 
                    System.out.printf("\n%s[%d]",paisesamericadonorte[contador],contador);
                }
            System.out.printf("\n\nDeseja ver outro continente?Sim[1]Nao[2]");
            reinicio = scan.nextInt();
        }
        //europa
        if(escolhacontinente ==3)
        {
            System.out.printf("\npaises da Europa\n");
                for(contador = 1; contador <=37;contador++)
                    {
                    System.out.printf("\n%s[%d]",paiseseuropa[contador],contador);
                    }
            System.out.printf("\n\nDeseja ver outro continente?Sim[1]Nao[2]");
            reinicio = scan.nextInt();
        }


       //africa 
        if(escolhacontinente==4)
        {
            System.out.printf("\nPaises da Africa\n");
                for(contador = 1; contador<=54;contador++)
                    { 
                    System.out.printf("\n%s[%d]",paisesafrica[contador],contador);
                    }
            System.out.printf("\n\nDeseja ver outro continente?Sim[1]Nao[2]");
            reinicio = scan.nextInt();
        }


    //asia
        if(escolhacontinente == 5)
        {
            System.out.printf("\nPaises da Asia\n");
                for(contador = 1; contador<=49;contador++)
                    { 
                    System.out.printf("\n%s[%d]",paisesasia[contador],contador);
                    }
        System.out.printf("\n\nDeseja ver outro continente?Sim[1]Nao[2]");
        reinicio = scan.nextInt();
        }


    //oceania
        if(escolhacontinente == 6)
        {
            System.out.println("\nPaises da oceania\n");
                for(contador= 1;contador<=14;contador++)
                { 
                    System.out.printf("\n%s[%d]",paisesoceania[contador],contador);
                }
            System.out.printf("\n\nDeseja ver outro continente?Sim[1]Nao[2]");
            reinicio = scan.nextInt();
        }

        
    }
} }