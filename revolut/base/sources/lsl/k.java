package lsl;

import k4l.r0;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f199708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f199709b;

    static {
        int[] iArr = new int[bfl.g.values().length];
        try {
            iArr[bfl.g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bfl.g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f199708a = iArr;
        int[] iArr2 = new int[r0.values().length];
        try {
            iArr2[r0.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[r0.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[r0.LIMIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[r0.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f199709b = iArr2;
    }
}
