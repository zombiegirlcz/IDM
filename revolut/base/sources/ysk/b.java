package ysk;

import xsk.n;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f316506a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.ANNUALLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.QUARTERLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f316506a = iArr;
    }
}
