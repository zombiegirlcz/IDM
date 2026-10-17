package ug6;

import com.revolut.domain.models.openbanking.ExternalPaymentStatus$State;
import com.revolut.domain.models.openbanking.ExternalPaymentStatus$Type;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f279936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f279937b;

    static {
        int[] iArr = new int[ExternalPaymentStatus$State.values().length];
        try {
            iArr[ExternalPaymentStatus$State.CANCELLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ExternalPaymentStatus$State.REJECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ExternalPaymentStatus$State.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ExternalPaymentStatus$State.AWAITING_AUTHORIZATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ExternalPaymentStatus$State.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f279936a = iArr;
        int[] iArr2 = new int[ExternalPaymentStatus$Type.values().length];
        try {
            iArr2[ExternalPaymentStatus$Type.ONE_OFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ExternalPaymentStatus$Type.LINKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f279937b = iArr2;
    }
}
