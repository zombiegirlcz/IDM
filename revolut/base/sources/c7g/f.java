package c7g;

import a7g.q;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21978a;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.COLLAPSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q.FILTERS_EXPANDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q.SEARCH_INPUT_EXPANDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f21978a = iArr;
    }
}
