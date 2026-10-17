package yv;

import yw.e;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f317060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f317061b;

    static {
        int[] iArr = new int[yw.a.values().length];
        try {
            iArr[yw.a.FRONT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yw.a.BACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f317060a = iArr;
        int[] iArr2 = new int[e.values().length];
        try {
            iArr2[e.SD.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[e.HD.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[e.FHD.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[e.UHD.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[e.HIGHEST.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        f317061b = iArr2;
    }
}
