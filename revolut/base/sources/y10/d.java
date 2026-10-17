package y10;

import z30.n;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f310261a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.EMOJI.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n.ASSETS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[n.STARS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f310261a = iArr;
    }
}
