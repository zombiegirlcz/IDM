package pv;

import gv.e;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f239968a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.SHUTTER_BUTTON_CLICKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.SUCCESS_DETECTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f239968a = iArr;
    }
}
