package com.onfido.android.sdk.capture.common.cryptography;

import com.onfido.api.client.token.sdk.ApplicantId;
import com.onfido.javax.inject.Provider;
import el.b;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes17.dex */
public final class PayloadHelper_Factory implements b {
    private final Provider applicantIdProvider;
    private final Provider cryptographyProvider;
    private final Provider jsonParserProvider;

    public PayloadHelper_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.cryptographyProvider = provider;
        this.jsonParserProvider = provider2;
        this.applicantIdProvider = provider3;
    }

    public static PayloadHelper_Factory create(Provider provider, Provider provider2, Provider provider3) {
        return new PayloadHelper_Factory(provider, provider2, provider3);
    }

    public static PayloadHelper newInstance(Cryptography cryptography, Json json, ApplicantId applicantId) {
        return new PayloadHelper(cryptography, json, applicantId);
    }

    @Override // com.onfido.javax.inject.Provider
    public PayloadHelper get() {
        return newInstance((Cryptography) this.cryptographyProvider.get(), (Json) this.jsonParserProvider.get(), (ApplicantId) this.applicantIdProvider.get());
    }
}
