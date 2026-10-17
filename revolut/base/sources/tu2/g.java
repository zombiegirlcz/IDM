package tu2;

import rp0.p;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f274523a;

    static {
        int[] iArr = new int[p.values().length];
        try {
            iArr[p.USER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p.PROGRAMMATICALLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f274523a = iArr;
    }
}
