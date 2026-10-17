package jjj;

import dej.h3;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f175004a;

    static {
        int[] iArr = new int[h3.values().length];
        try {
            iArr[h3.PERIOD_DAYS_PASSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h3.DATA_USAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h3.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f175004a = iArr;
    }
}
