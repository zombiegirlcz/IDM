package ybe;

import com.revolut.feature.apm.core.models.payments_authorisations.PaymentAuthorisationState;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f312285a;

    static {
        int[] iArr = new int[PaymentAuthorisationState.values().length];
        try {
            iArr[PaymentAuthorisationState.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentAuthorisationState.SUSPENDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f312285a = iArr;
    }
}
