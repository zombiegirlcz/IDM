package mjk;

import ggk.w0;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f206062a;

    static {
        int[] iArr = new int[w0.values().length];
        try {
            iArr[w0.CELL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[w0.DETAILS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[w0.TEXT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[w0.MEDIA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f206062a = iArr;
    }
}
