package w9a;

import g8a.m;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f295705a;

    static {
        int[] iArr = new int[m.values().length];
        try {
            iArr[m.CANCELLED_BY_RECIPIENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m.CANCELLED_BY_SERVICE_PROVIDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m.DECLINED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[m.ENDED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[m.EXPIRED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[m.FAILED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f295705a = iArr;
    }
}
