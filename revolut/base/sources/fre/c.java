package fre;

import do3.v;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f137476a;

    static {
        int[] iArr = new int[v.values().length];
        try {
            iArr[v.INITIATED_BY_USER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v.FINCRIME_SOFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[v.FINCRIME_HARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f137476a = iArr;
    }
}
