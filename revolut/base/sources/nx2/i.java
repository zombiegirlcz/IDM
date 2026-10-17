package nx2;

import h93.l0;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f220104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f220105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f220106c;

    static {
        int[] iArr = new int[l0.values().length];
        try {
            iArr[l0.CRYPTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f220104a = iArr;
        int[] iArr2 = new int[xfa.b.values().length];
        try {
            iArr2[xfa.b.ONBOARDING_CARD_SELECTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        f220105b = iArr2;
        int[] iArr3 = new int[c93.e.values().length];
        try {
            iArr3[c93.e.PHYSICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr3[c93.e.VIRTUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr3[c93.e.DISPOSABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f220106c = iArr3;
    }
}
