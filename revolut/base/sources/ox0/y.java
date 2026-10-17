package ox0;

import aw0.e4;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f230519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f230520b;

    static {
        int[] iArr = new int[e4.values().length];
        try {
            iArr[e4.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e4.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f230519a = iArr;
        int[] iArr2 = new int[lw0.n.values().length];
        try {
            iArr2[lw0.n.REGULAR_SEARCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[lw0.n.AI_SEARCH.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f230520b = iArr2;
    }
}
