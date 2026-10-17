package to;

import ecm.o1;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f272487a;

    static {
        int[] iArr = new int[o1.values().length];
        try {
            iArr[o1.UNARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o1.CLIENT_STREAMING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o1.SERVER_STREAMING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[o1.BIDI_STREAMING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f272487a = iArr;
    }
}
