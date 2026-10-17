package f59;

import a59.b;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f132287a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.CRYPTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.WEALTH_INSIGHTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f132287a = iArr;
    }
}
