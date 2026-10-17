package zka;

import bka.j0;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f322932a;

    static {
        int[] iArr = new int[j0.values().length];
        try {
            iArr[j0.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j0.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f322932a = iArr;
    }
}
