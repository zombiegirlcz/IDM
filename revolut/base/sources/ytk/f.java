package ytk;

import mel.s;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f316837a;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s.MIDDLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s.BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f316837a = iArr;
    }
}
