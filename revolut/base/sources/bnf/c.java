package bnf;

import tof.p0;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f17136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f17137c;

    static {
        int[] iArr = new int[p0.values().length];
        try {
            iArr[p0.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p0.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[p0.BUY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f17135a = iArr;
        int[] iArr2 = new int[io3.l.values().length];
        try {
            iArr2[io3.l.TAX_ADV_PROXY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        f17136b = iArr2;
        int[] iArr3 = new int[tof.c.values().length];
        try {
            iArr3[tof.c.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[tof.c.PRO.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[tof.c.JOINT.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[tof.c.JOINT_INHERITANCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[tof.c.CREDIT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[tof.c.VAULT.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[tof.c.GROUP_VAULT.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[tof.c.JOINT_VAULT.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[tof.c.JUNIOR_VAULT.ordinal()] = 9;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[tof.c.PRO_VAULT.ordinal()] = 10;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[tof.c.SAVINGS.ordinal()] = 11;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[tof.c.JOINT_SAVINGS.ordinal()] = 12;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[tof.c.JUNIOR_SAVINGS.ordinal()] = 13;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[tof.c.LOYALTY_VAULT.ordinal()] = 14;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[tof.c.JUNIOR_PERSONAL.ordinal()] = 15;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[tof.c.INVEST_ISA.ordinal()] = 16;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[tof.c.INVEST_CUSTODIAN_JISA.ordinal()] = 17;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr3[tof.c.INVEST_PERSONAL_JISA.ordinal()] = 18;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr3[tof.c.INVEST_GIA_JOINT.ordinal()] = 19;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr3[tof.c.INVEST_GIA.ordinal()] = 20;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr3[tof.c.REVX_FIAT.ordinal()] = 21;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr3[tof.c.UNKNOWN.ordinal()] = 22;
        } catch (NoSuchFieldError unused26) {
        }
        f17137c = iArr3;
    }
}
