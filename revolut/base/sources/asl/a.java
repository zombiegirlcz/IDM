package asl;

import k4l.q0;
import k4l.r0;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f8953b;

    static {
        int[] iArr = new int[q0.values().length];
        try {
            iArr[q0.GOOD_TIL_EXT_MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f8952a = iArr;
        int[] iArr2 = new int[r0.values().length];
        try {
            iArr2[r0.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[r0.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[r0.RECURRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[r0.LIMIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        f8953b = iArr2;
    }
}
