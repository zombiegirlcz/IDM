package b0a;

import mx0.e4;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f11626a;

    static {
        int[] iArr = new int[e4.values().length];
        try {
            iArr[e4.ONLY_TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e4.TEXT_AND_START_BUTTON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e4.TEXT_AND_START_BUTTON_ACTIVATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f11626a = iArr;
    }
}
