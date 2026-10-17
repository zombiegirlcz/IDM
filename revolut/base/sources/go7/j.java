package go7;

import kl7.a1;
import kl7.b1;
import kl7.y0;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f145099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f145100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f145101c;

    static {
        int[] iArr = new int[b1.values().length];
        try {
            iArr[b1.PAYMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b1.REFUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f145099a = iArr;
        int[] iArr2 = new int[a1.values().length];
        try {
            iArr2[a1.ADDITIONAL_DRIVER_ADD.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[a1.ADDITIONAL_DRIVER_REMOVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[a1.VEHICLE_REPLACE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[a1.VEHICLE_ADD.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[a1.VEHICLE_SUBSTITUTE.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[a1.DRIVING_LICENCE_UPDATE.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[a1.CANCEL_MTA.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[a1.UNKNOWN.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        f145100b = iArr2;
        int[] iArr3 = new int[y0.values().length];
        try {
            iArr3[y0.INSUFFICIENT_BALANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        f145101c = iArr3;
    }
}
