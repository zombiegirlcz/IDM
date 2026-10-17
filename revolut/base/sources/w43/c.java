package w43;

import h93.l0;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f294495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f294496b;

    static {
        int[] iArr = new int[i93.b.values().length];
        try {
            iArr[i93.b.FIAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i93.b.CRYPTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[i93.b.REGULAR_VAULT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[i93.b.PRO_REGULAR_VAULT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f294495a = iArr;
        int[] iArr2 = new int[l0.values().length];
        try {
            iArr2[l0.INDIA_LOCAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[l0.INDIA_GLOBAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f294496b = iArr2;
    }
}
