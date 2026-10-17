package pkf;

import tof.v6;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f237109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f237110b;

    static {
        int[] iArr = new int[tof.f0.values().length];
        try {
            iArr[tof.f0.USER_CANCELLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tof.f0.REVOLUT_CANCELLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[tof.f0.CROSSPOCKET_CUT_OFF_TIME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[tof.f0.GAMBLING_RESTRICTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[tof.f0.POTENTIAL_FRAUD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[tof.f0.TRANSFER_ADDRESS_REJECTED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[tof.f0.TRANSFER_REJECTED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[tof.f0.TECHNICAL_ERROR.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[tof.f0.UNKNOWN.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f237109a = iArr;
        int[] iArr2 = new int[v6.values().length];
        try {
            iArr2[v6.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[v6.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        f237110b = iArr2;
    }
}
