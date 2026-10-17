package jul;

import k4l.r0;
import nel.z;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f178690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f178691b;

    static {
        int[] iArr = new int[r0.values().length];
        try {
            iArr[r0.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r0.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r0.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[r0.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f178690a = iArr;
        int[] iArr2 = new int[z.values().length];
        try {
            iArr2[z.BOND.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[z.FUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[z.MUTUAL_FUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[z.STRUCTURED_NOTE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f178691b = iArr2;
    }
}
