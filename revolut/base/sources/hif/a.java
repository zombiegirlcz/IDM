package hif;

import tof.g;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f152602a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.FULLY_EXCLUDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.PARTIALLY_EXCLUDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.INCLUDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f152602a = iArr;
    }
}
