package ywg;

import pwg.o;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f317434a;

    static {
        int[] iArr = new int[o.values().length];
        try {
            iArr[o.ASSET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o.COLLECTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f317434a = iArr;
    }
}
