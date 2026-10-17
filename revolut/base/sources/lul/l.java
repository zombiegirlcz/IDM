package lul;

import k4l.r0;
import nel.z;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f200260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f200261b;

    static {
        int[] iArr = new int[r0.values().length];
        try {
            iArr[r0.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r0.RECURRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r0.LIMIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[r0.STOP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f200260a = iArr;
        int[] iArr2 = new int[z.values().length];
        try {
            iArr2[z.FUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        f200261b = iArr2;
    }
}
