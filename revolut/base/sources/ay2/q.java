package ay2;

import h93.j0;
import h93.l0;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f11052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f11053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f11054c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[c93.o.values().length];
        try {
            iArr[c93.o.VAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c93.o.IGST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c93.o.CGST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c93.o.SGST.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[c93.o.GMF.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[c93.o.STAMP_DUTY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[c93.o.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f11052a = iArr;
        int[] iArr2 = new int[e93.b.values().length];
        try {
            iArr2[e93.b.VISA.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[e93.b.MC.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[e93.b.MAESTRO.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[e93.b.MULTIBANCO.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[e93.b.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        f11053b = iArr2;
        int[] iArr3 = new int[hx2.m.values().length];
        try {
            iArr3[hx2.m.GO_VIRTUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[hx2.m.GO_PHYSICAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        f11054c = iArr3;
        int[] iArr4 = new int[c93.e.values().length];
        try {
            iArr4[c93.e.VIRTUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[c93.e.PHYSICAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[c93.e.DISPOSABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        d = iArr4;
        int[] iArr5 = new int[n10.b.values().length];
        try {
            iArr5[n10.b.VIRTUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr5[n10.b.PHYSICAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr5[n10.b.DISPOSABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused20) {
        }
        e = iArr5;
        int[] iArr6 = new int[j0.values().length];
        try {
            iArr6[j0.RETAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr6[j0.FAMILY.ordinal()] = 2;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr6[j0.YOUTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr6[j0.PRO.ordinal()] = 4;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr6[j0.JOINT_ACCOUNT.ordinal()] = 5;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr6[j0.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused26) {
        }
        int[] iArr7 = new int[l0.values().length];
        try {
            iArr7[l0.BRAZIL_LOCAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr7[l0.BRAZIL_GLOBAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr7[l0.INDIA_LOCAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr7[l0.INDIA_GLOBAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr7[l0.MEXICO_MCY.ordinal()] = 5;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr7[l0.DEBIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr7[l0.CREDIT.ordinal()] = 7;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr7[l0.INSTALMENT.ordinal()] = 8;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr7[l0.CRYPTO.ordinal()] = 9;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr7[l0.US_SECURED_CREDIT.ordinal()] = 10;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr7[l0.UNKNOWN.ordinal()] = 11;
        } catch (NoSuchFieldError unused37) {
        }
    }
}
