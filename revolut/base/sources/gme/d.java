package gme;

import j19.j1;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f144811a;

    static {
        int[] iArr = new int[j1.values().length];
        try {
            iArr[j1.CASHBACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j1.PROMOCODE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j1.REV_POINTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f144811a = iArr;
    }
}
