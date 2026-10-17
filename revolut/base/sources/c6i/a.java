package c6i;

import b6i.j;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f21808b;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f21807a = iArr;
        int[] iArr2 = new int[k1j.a.values().length];
        try {
            iArr2[k1j.a.NON_EXISTING_CURRENCY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[k1j.a.JOINT_NON_EXISTING_CURRENCY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[k1j.a.CRYPTO_NON_EXISTING_CURRENCY.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[k1j.a.COMMODITIES_NON_EXISTING_CURRENCY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[k1j.a.PRO_NON_EXISTING_CURRENCY.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        f21808b = iArr2;
    }
}
