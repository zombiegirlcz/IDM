package eje;

import dy0.o;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f126870a;

    static {
        int[] iArr = new int[o.values().length];
        try {
            iArr[o.RIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o.LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o.BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f126870a = iArr;
    }
}
