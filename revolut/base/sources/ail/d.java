package ail;

import zel.k;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5309a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.TOP_GAINERS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.TOP_LOSERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f5309a = iArr;
    }
}
