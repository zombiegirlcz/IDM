package go;

import xjg.m;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f145065a;

    static {
        int[] iArr = new int[m.values().length];
        try {
            iArr[m.SYSTEM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m.NIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m.DAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f145065a = iArr;
    }
}
