package sv1;

import zz1.e;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f265826a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.CREATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.PROCESSING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f265826a = iArr;
    }
}
