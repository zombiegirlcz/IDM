package l4h;

import nel.z;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f192140a;

    static {
        int[] iArr = new int[z.values().length];
        try {
            iArr[z.BOND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z.CFD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f192140a = iArr;
    }
}
