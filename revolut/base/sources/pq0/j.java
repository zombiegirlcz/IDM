package pq0;

import ip0.tp;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f238653a;

    static {
        int[] iArr = new int[tp.values().length];
        try {
            iArr[tp.CIRCLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tp.RECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f238653a = iArr;
    }
}
