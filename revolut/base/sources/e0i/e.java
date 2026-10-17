package e0i;

import kyh.g;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f121723a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f121723a = iArr;
    }
}
