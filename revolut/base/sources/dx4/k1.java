package dx4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f120646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f120647b;

    static {
        int[] iArr = new int[g1.values().length];
        try {
            iArr[g1.ACCENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g1.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g1.WARNING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[g1.DANGER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[g1.INACTIVE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[g1.WHITE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[g1.BLACK.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f120646a = iArr;
        int[] iArr2 = new int[f1.values().length];
        try {
            iArr2[f1.ALERT.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[f1.AWAITING.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[f1.BANK.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[f1.BOOST.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[f1.CALENDAR_DATE.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[f1.CAMERA.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[f1.CANCELLED.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[f1.CARD.ordinal()] = 8;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[f1.CHECKED.ordinal()] = 9;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[f1.CLEANING.ordinal()] = 10;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[f1.CONTRAST.ordinal()] = 11;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[f1.DISLIKE.ordinal()] = 12;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[f1.EDIT.ordinal()] = 13;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[f1.ERROR.ordinal()] = 14;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[f1.FAVOURITES.ordinal()] = 15;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[f1.FROZEN.ordinal()] = 16;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[f1.IMAGE.ordinal()] = 17;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[f1.INCOME.ordinal()] = 18;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[f1.INFO.ordinal()] = 19;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[f1.LIKE.ordinal()] = 20;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[f1.LIGHTNING.ordinal()] = 21;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[f1.LINK.ordinal()] = 22;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[f1.LOCKED.ordinal()] = 23;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[f1.NO_BOOST.ordinal()] = 24;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr2[f1.ORDER_DOWNWARDS.ordinal()] = 25;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr2[f1.ORDER_UPWARDS.ordinal()] = 26;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr2[f1.OUTGOING.ordinal()] = 27;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr2[f1.PAUSED.ordinal()] = 28;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr2[f1.PENDING.ordinal()] = 29;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr2[f1.PHONE.ordinal()] = 30;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr2[f1.PREMIUM.ordinal()] = 31;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr2[f1.QUESTION.ordinal()] = 32;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr2[f1.RECURRING.ordinal()] = 33;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr2[f1.REFUND.ordinal()] = 34;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr2[f1.REVERT.ordinal()] = 35;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr2[f1.SENDING.ordinal()] = 36;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr2[f1.SHIELD.ordinal()] = 37;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr2[f1.SPARE_CHANGE.ordinal()] = 38;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr2[f1.SUSPICIOUS.ordinal()] = 39;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr2[f1.TOP_UP.ordinal()] = 40;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr2[f1.WEALTH.ordinal()] = 41;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr2[f1.TRAVEL.ordinal()] = 42;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr2[f1.CASHBACK.ordinal()] = 43;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr2[f1.PRICE_TAG.ordinal()] = 44;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr2[f1.REV_POINTS.ordinal()] = 45;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr2[f1.ARROW_EXCHANGE.ordinal()] = 46;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr2[f1.ARROW_SPLIT.ordinal()] = 47;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr2[f1.FEES.ordinal()] = 48;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr2[f1.MERGE.ordinal()] = 49;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr2[f1.SYMBOL_CHANGE.ordinal()] = 50;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr2[f1.MEGAPHONE.ordinal()] = 51;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr2[f1.MOON.ordinal()] = 52;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr2[f1.MORE.ordinal()] = 53;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr2[f1.TITAN.ordinal()] = 54;
        } catch (NoSuchFieldError unused61) {
        }
        f120647b = iArr2;
    }
}
