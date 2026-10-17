package bt0;

import ip0.oe0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18238a;

    static {
        int[] iArr = new int[oe0.values().length];
        try {
            iArr[oe0.ALWAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[oe0.TOOLTIP_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[oe0.NEVER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f18238a = iArr;
    }
}
