package ppe;

import ype.i;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f238597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f238598b;

    static {
        int[] iArr = new int[i.values().length];
        try {
            iArr[i.DELETE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i.NOT_NOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[i.CANT_PROVIDE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f238597a = iArr;
        int[] iArr2 = new int[rpe.f.values().length];
        try {
            iArr2[rpe.f.MISSING_TIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[rpe.f.MISSING_RESIDENCY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f238598b = iArr2;
    }
}
