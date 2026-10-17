package mif;

import nif.j0;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f205790a;

    static {
        int[] iArr = new int[j0.values().length];
        f205790a = iArr;
        try {
            iArr[j0.FULLY_EXCLUDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f205790a[j0.PARTIALLY_EXCLUDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
