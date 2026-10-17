package kx6;

import sr6.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f190437a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.UNIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.HOUR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.DAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f190437a = iArr;
    }
}
