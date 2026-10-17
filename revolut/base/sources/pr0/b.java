package pr0;

import bw0.j;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f238914a;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.ADD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.SUBTRACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j.DIVIDE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[j.MULTIPLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f238914a = iArr;
    }
}
