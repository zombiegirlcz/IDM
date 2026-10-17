package aq5;

import wk5.n;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8265a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.NOT_RESTRICTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.RESTRICTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f8265a = iArr;
    }
}
