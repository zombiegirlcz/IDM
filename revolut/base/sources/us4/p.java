package us4;

import ql4.v;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f282437a;

    static {
        int[] iArr = new int[v.values().length];
        try {
            iArr[v.STATEMENT_DEFERRAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v.POST_PURCHASE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[v.PRE_PURCHASE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f282437a = iArr;
    }
}
