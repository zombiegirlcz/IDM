package m6i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f203214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f203215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f203216c;

    static {
        int[] iArr = new int[tof.c.values().length];
        try {
            iArr[tof.c.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tof.c.PRO_VAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[tof.c.PRO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[tof.c.VAULT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[tof.c.GROUP_VAULT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[tof.c.SAVINGS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[tof.c.JOINT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[tof.c.JOINT_VAULT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[tof.c.JOINT_SAVINGS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[tof.c.LOYALTY_VAULT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[tof.c.CREDIT.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[tof.c.JUNIOR_PERSONAL.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[tof.c.JUNIOR_VAULT.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[tof.c.JUNIOR_SAVINGS.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[tof.c.INVEST_CUSTODIAN_JISA.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[tof.c.INVEST_PERSONAL_JISA.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[tof.c.INVEST_ISA.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[tof.c.INVEST_GIA.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[tof.c.INVEST_GIA_JOINT.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[tof.c.REVX_FIAT.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[tof.c.UNKNOWN.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[tof.c.JOINT_INHERITANCE.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        f203214a = iArr;
        int[] iArr2 = new int[cfl.j.values().length];
        try {
            iArr2[cfl.j.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[cfl.j.PERSONAL_JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[cfl.j.YOUTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused25) {
        }
        f203215b = iArr2;
        int[] iArr3 = new int[j8l.a.values().length];
        try {
            iArr3[j8l.a.FIAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr3[j8l.a.JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr3[j8l.a.JOINT_VAULT.ordinal()] = 3;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr3[j8l.a.JOINT_SAVINGS.ordinal()] = 4;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr3[j8l.a.PRO.ordinal()] = 5;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr3[j8l.a.PRO_VAULT.ordinal()] = 6;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr3[j8l.a.VAULT.ordinal()] = 7;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr3[j8l.a.SAVINGS.ordinal()] = 8;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr3[j8l.a.CREDIT_CARD.ordinal()] = 9;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr3[j8l.a.INVEST_CASH_HOLDING.ordinal()] = 10;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr3[j8l.a.JOINT_INVEST_CASH_HOLDING.ordinal()] = 11;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr3[j8l.a.CRYPTO.ordinal()] = 12;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr3[j8l.a.COMMODITIES.ordinal()] = 13;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr3[j8l.a.REVX_FIAT.ordinal()] = 14;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr3[j8l.a.REV_POINTS_POCKET.ordinal()] = 15;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr3[j8l.a.JUNIOR_FIAT.ordinal()] = 16;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr3[j8l.a.JUNIOR_VAULT.ordinal()] = 17;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr3[j8l.a.JUNIOR_SAVINGS.ordinal()] = 18;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr3[j8l.a.SPOT_MARGIN_COLLATERAL.ordinal()] = 19;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr3[j8l.a.FUTURES_COLLATERAL.ordinal()] = 20;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr3[j8l.a.TEEN_FIAT.ordinal()] = 21;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr3[j8l.a.TEEN_VAULT.ordinal()] = 22;
        } catch (NoSuchFieldError unused47) {
        }
        f203216c = iArr3;
    }
}
