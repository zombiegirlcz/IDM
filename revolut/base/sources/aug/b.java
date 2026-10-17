package aug;

import wel.i;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9820a;

    static {
        int[] iArr = new int[i.values().length];
        try {
            iArr[i.TERMINATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i.SUSPENDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[i.OFFBOARDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[i.CREATED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[i.ACTIVATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f9820a = iArr;
    }
}
