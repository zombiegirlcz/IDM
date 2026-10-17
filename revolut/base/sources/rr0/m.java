package rr0;

import mx0.d2;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f256629a;

    static {
        int[] iArr = new int[d2.values().length];
        try {
            iArr[d2.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d2.FULLSCREEN_VIDEO_DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f256629a = iArr;
    }
}
