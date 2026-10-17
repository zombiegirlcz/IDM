package o6l;

import i93.e;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f222636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f222637b;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.ECOMMERCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.ATM_WITHDRAWAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.CONTACTLESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e.POINT_OF_SALE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f222636a = iArr;
        int[] iArr2 = new int[b.values().length];
        try {
            iArr2[b.OWNERSHIP_UNVERIFIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[b.TERMINATED_REACTIVABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[b.NON_REACTIVABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[b.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f222637b = iArr2;
    }
}
