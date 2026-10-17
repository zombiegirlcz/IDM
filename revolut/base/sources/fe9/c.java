package fe9;

import wl0.o;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f134474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f134475b;

    static {
        int[] iArr = new int[o.values().length];
        try {
            iArr[o.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o.FINGERPRINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o.FACE_UNLOCK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f134474a = iArr;
        int[] iArr2 = new int[wl0.i.values().length];
        try {
            iArr2[wl0.i.GOOGLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[wl0.i.CUSTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f134475b = iArr2;
    }
}
