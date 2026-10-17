package xl7;

import kl7.m2;
import kl7.o0;
import kl7.s0;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f306946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f306947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f306948c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[s0.values().length];
        try {
            iArr[s0.DIESEL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s0.ELECTRIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s0.HYDROGEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[s0.LPG.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[s0.PETROL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[s0.HYBRID.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[s0.ETHANOL_PETROL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[s0.PETROL_ELECTRIC.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[s0.PETROL_GAS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[s0.DIESEL_ELECTRIC.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[s0.DIESEL_PLUG_IN_ELECTRIC.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[s0.PETROL_PLUG_IN_ELECTRIC.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        f306946a = iArr;
        int[] iArr2 = new int[m2.values().length];
        try {
            iArr2[m2.AUTOMATIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[m2.MANUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        f306947b = iArr2;
        int[] iArr3 = new int[kl7.c.values().length];
        try {
            iArr3[kl7.c.CABRIOLET.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[kl7.c.COUPE.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[kl7.c.ESTATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[kl7.c.HATCHBACK.ordinal()] = 4;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[kl7.c.SALOON.ordinal()] = 5;
        } catch (NoSuchFieldError unused19) {
        }
        f306948c = iArr3;
        int[] iArr4 = new int[o0.values().length];
        try {
            iArr4[o0.LESS_THAN_1000.ordinal()] = 1;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr4[o0.FROM_1000_TO_5000.ordinal()] = 2;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr4[o0.FROM_5000_TO_25000.ordinal()] = 3;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr4[o0.FROM_25000_TO_50000.ordinal()] = 4;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr4[o0.FROM_50000_TO_75000.ordinal()] = 5;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr4[o0.FROM_75000_TO_100000.ordinal()] = 6;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr4[o0.MORE_THAN_100000.ordinal()] = 7;
        } catch (NoSuchFieldError unused26) {
        }
        d = iArr4;
    }
}
