package yi4;

import hs3.x1;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f314232a;

    static {
        int[] iArr = new int[x1.values().length];
        try {
            iArr[x1.WARNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x1.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[x1.PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[x1.SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f314232a = iArr;
    }
}
