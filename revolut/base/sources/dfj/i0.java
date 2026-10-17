package dfj;

import dej.o1;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f113995a;

    static {
        int[] iArr = new int[o1.values().length];
        try {
            iArr[o1.INSTALLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o1.DOWNLOADED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o1.READY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[o1.UNINSTALLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[o1.ORDERED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[o1.FAILED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[o1.INACTIVE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[o1.UNKNOWN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f113995a = iArr;
    }
}
