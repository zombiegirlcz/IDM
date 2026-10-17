package s43;

import q43.b0;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f259751a;

    static {
        int[] iArr = new int[b0.values().length];
        try {
            iArr[b0.FIAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b0.PERSONAL_VAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b0.CRYPTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f259751a = iArr;
    }
}
