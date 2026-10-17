package pt0;

import aw0.o4;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f239570a;

    static {
        int[] iArr = new int[o4.values().length];
        try {
            iArr[o4.FULL_CIRCLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o4.SEMI_CIRCLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o4.HALF_CIRCLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f239570a = iArr;
    }
}
