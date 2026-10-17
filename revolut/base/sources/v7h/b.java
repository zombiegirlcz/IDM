package v7h;

import v7h.a;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f286657a;

    static {
        int[] iArr = new int[a.EnumC1582a.values().length];
        try {
            iArr[a.EnumC1582a.SECURITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.EnumC1582a.CRYPTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.EnumC1582a.COMMODITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f286657a = iArr;
    }
}
