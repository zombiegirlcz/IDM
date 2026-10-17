package com.revolut.tracking.v3;

/* JADX INFO: loaded from: classes12.dex */
public enum d {
    RETAIL(1),
    BUSINESS(2),
    SSO(3),
    BACKOFFICE(4),
    PEOPLE(5),
    TERMINAL(6),
    ACQUIRING(7),
    JUNIOR(8),
    CRYPTO_EXCHANGE(9),
    PROCESSING(10),
    POS(11),
    DOCS(12),
    KYC(13),
    PIGEON(14),
    RAMP(15),
    SHOPPER(16),
    DANTE(17),
    EOR(18),
    WEB_UI_KIT(19),
    CHAT_UI(20),
    RELEASE_PLATFORM(21),
    IDAVE(22),
    DATA_CATALOG(23),
    AI(24),
    SHOP(25),
    RESERVATIONS(26),
    TEEN(27),
    PRODUCT_NOT_SET(0);

    private final int value;

    d(int i) {
        this.value = i;
    }

    public static d a(int i) {
        switch (i) {
            case 0:
                return PRODUCT_NOT_SET;
            case 1:
                return RETAIL;
            case 2:
                return BUSINESS;
            case 3:
                return SSO;
            case 4:
                return BACKOFFICE;
            case 5:
                return PEOPLE;
            case 6:
                return TERMINAL;
            case 7:
                return ACQUIRING;
            case 8:
                return JUNIOR;
            case 9:
                return CRYPTO_EXCHANGE;
            case 10:
                return PROCESSING;
            case 11:
                return POS;
            case 12:
                return DOCS;
            case 13:
                return KYC;
            case 14:
                return PIGEON;
            case 15:
                return RAMP;
            case 16:
                return SHOPPER;
            case 17:
                return DANTE;
            case 18:
                return EOR;
            case 19:
                return WEB_UI_KIT;
            case 20:
                return CHAT_UI;
            case 21:
                return RELEASE_PLATFORM;
            case 22:
                return IDAVE;
            case 23:
                return DATA_CATALOG;
            case 24:
                return AI;
            case 25:
                return SHOP;
            case 26:
                return RESERVATIONS;
            case 27:
                return TEEN;
            default:
                return null;
        }
    }
}
