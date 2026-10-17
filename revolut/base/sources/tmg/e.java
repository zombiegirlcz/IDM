package tmg;

import fmg.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f272213a;

    static {
        int[] iArr = new int[w.values().length];
        try {
            iArr[w.CONTENT_IMAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[w.CONTENT_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f272213a = iArr;
    }
}
