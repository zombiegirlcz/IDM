package xea;

import io3.k;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f304559a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.DELISTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k.INACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f304559a = iArr;
    }
}
