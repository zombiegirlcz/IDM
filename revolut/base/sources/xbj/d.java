package xbj;

import wk5.n;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f304084a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.RESTRICTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.NOT_RESTRICTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f304084a = iArr;
    }
}
