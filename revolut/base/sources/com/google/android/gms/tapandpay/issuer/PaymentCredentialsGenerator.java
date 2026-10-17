package com.google.android.gms.tapandpay.issuer;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
public interface PaymentCredentialsGenerator {
    @NonNull
    GetPaymentCredentialsResponse generate(@NonNull GetPaymentCredentialsRequest getPaymentCredentialsRequest);

    boolean getGoogleOpaquePaymentCardSupported();
}
