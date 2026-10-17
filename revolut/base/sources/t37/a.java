package t37;

import ds6.j;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f267670a;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.INCOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.SOCIAL_SECURITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j.VAT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f267670a = iArr;
    }
}
