package nph;

import zel.f;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f218219a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.STOCKS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.ETP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.BOND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[f.CFD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f218219a = iArr;
    }
}
