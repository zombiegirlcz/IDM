package ls4;

import ql4.v;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f199625a;

    static {
        int[] iArr = new int[v.values().length];
        try {
            iArr[v.POST_PURCHASE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v.STATEMENT_DEFERRAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[v.PRE_PURCHASE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f199625a = iArr;
    }
}
