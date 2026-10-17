package rq7;

import com.revolut.feature.insurance_car.impl.data.model.RenewalDetails;
import kl7.k2;
import kl7.m1;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f256505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f256506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f256507c;

    static {
        int[] iArr = new int[k2.values().length];
        try {
            iArr[k2.DOCS_REQUESTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k2.TELEMATICS_DEVICE_ACTIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k2.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k2.DOCS_IN_REVIEW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[k2.TEMPORARY_CERT_ORDER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[k2.ANNUAL_CERT_ORDER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[k2.TELEMATICS_DEVICE_UNPLUGGED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f256505a = iArr;
        int[] iArr2 = new int[m1.values().length];
        try {
            iArr2[m1.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[m1.CANCELLING.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[m1.INACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[m1.INITIALISING.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[m1.CANCELLED.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[m1.LAPSED.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        f256506b = iArr2;
        int[] iArr3 = new int[RenewalDetails.Status.values().length];
        try {
            iArr3[RenewalDetails.Status.OFFERED.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[RenewalDetails.Status.SUSPENDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[RenewalDetails.Status.DECLINED.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[RenewalDetails.Status.DISMISSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused17) {
        }
        f256507c = iArr3;
    }
}
