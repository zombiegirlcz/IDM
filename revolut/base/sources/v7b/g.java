package v7b;

import r5b.l;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f286583a;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.PREMIUM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.METAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l.ULTRA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l.PRIVATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f286583a = iArr;
    }
}
