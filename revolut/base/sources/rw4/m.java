package rw4;

import ll4.b0;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f257838a;

    static {
        int[] iArr = new int[b0.values().length];
        try {
            iArr[b0.FULLY_SECURED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b0.PARTIALLY_SECURED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f257838a = iArr;
    }
}
