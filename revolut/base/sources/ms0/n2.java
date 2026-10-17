package ms0;

import aw0.a9;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f208337a;

    static {
        int[] iArr = new int[a9.values().length];
        try {
            iArr[a9.PLAY_ONCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a9.LOOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f208337a = iArr;
    }
}
