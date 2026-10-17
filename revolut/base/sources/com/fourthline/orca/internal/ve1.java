package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ve1 implements ls0 {
    @Override // com.fourthline.orca.internal.ls0
    public gw a(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return new gw("/v1/onboarding/signatures/" + id10 + "/details");
    }

    @Override // com.fourthline.orca.internal.ls0
    public gw b(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return new gw("/v1/onboarding/signatures/" + id10 + "/authorize");
    }

    @Override // com.fourthline.orca.internal.ls0
    public gw c(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return new gw("/v1/onboarding/signatures/" + id10 + "/resendOtp");
    }

    @Override // com.fourthline.orca.internal.ls0
    public gw d(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return new gw("/v1/onboarding/signatures/" + id10);
    }

    @Override // com.fourthline.orca.internal.ls0
    public gw e(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return new gw("/v1/onboarding/signatures/" + id10 + "/confirm");
    }

    @Override // com.fourthline.orca.internal.ls0
    public gw f(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return new gw("/v1/onboarding/signatures/" + id10 + "/selfie");
    }

    @Override // com.fourthline.orca.internal.ls0
    public gw a(String id10, String documentId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        return new gw("/v1/onboarding/signatures/" + id10 + "/documentsToSign/" + documentId);
    }
}
