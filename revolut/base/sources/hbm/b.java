package hbm;

import uam.j;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f150759a;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.CenterInside.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.CenterCrop.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j.TopCrop.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f150759a = iArr;
    }
}
