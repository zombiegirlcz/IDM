package ixk;

import nel.p0;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f169572a;

    static {
        int[] iArr = new int[p0.values().length];
        try {
            iArr[p0.OPEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p0.AFTER_HOURS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[p0.PRE_MARKET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[p0.UNDEFINED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[p0.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f169572a = iArr;
    }
}
