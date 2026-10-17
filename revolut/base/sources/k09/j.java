package k09;

import u09.h0;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f179998a;

    static {
        int[] iArr = new int[h0.values().length];
        try {
            iArr[h0.WARNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h0.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h0.SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f179998a = iArr;
    }
}
