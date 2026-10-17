package com.revolut.feature.pix.impl.flow.portability_details;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.feature.pix.api.model.PixKeyStatus;
import com.revolut.feature.pix.api.model.TokenVerificationRequest;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.portability_details.PortabilityDetailsContract$Step;
import com.revolut.feature.pix.screens.token_verification.TokenVerificationScreenContract$InputData;
import cp5.d;
import g75.i;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import s8a.c;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements gba.a {
    public final PortabilityDetailsContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f80672p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gba.c f80673q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wj0.a f80674r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f80675s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f80676t;

    public a(PortabilityDetailsContract$InputData inputData, c interactor, gba.c dialogProvider, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.o = inputData;
        this.f80672p = interactor;
        this.f80673q = dialogProvider;
        this.f80674r = idempotencyKeyHolder;
        PixKeyStatus f80406b = inputData.f80669b.getF80406b();
        PixKeyStatus.UnderPortability.DifferentOwnership differentOwnership = f80406b instanceof PixKeyStatus.UnderPortability.DifferentOwnership ? (PixKeyStatus.UnderPortability.DifferentOwnership) f80406b : null;
        boolean z = false;
        if (differentOwnership != null && differentOwnership.f) {
            z = true;
        }
        this.f80675s = z;
        this.f80676t = d.a(this, z ? I2() : PortabilityDetailsContract$Step.ReviewDetails.f80670a, f0.f322471a, new i(this, 11));
    }

    @Override // yji.l
    public final void I1() {
        wj0.a aVar = this.f80674r;
        aVar.a("deny_alias_migration");
        aVar.a("finish_alias_migration");
    }

    public final PortabilityDetailsContract$Step.VerifyOwnership I2() {
        Pair pair;
        boolean z = this.f80675s;
        TokenVerificationRequest.Operation operation = z ? TokenVerificationRequest.Operation.CONFIRM_CLAIM : TokenVerificationRequest.Operation.DENY_CLAIM;
        PortabilityDetailsContract$InputData portabilityDetailsContract$InputData = this.o;
        PixKey pixKey = portabilityDetailsContract$InputData.f80669b;
        PixKey pixKey2 = portabilityDetailsContract$InputData.f80669b;
        if (pixKey instanceof PixKey.Email) {
            pair = new Pair(Integer.valueOf(z ? R$string.pix_verify_ownership_email_title : R$string.pix_reply_ownership_claim_decline_token_verification_title_email), new TokenVerificationRequest.Email(((PixKey.Email) pixKey2).f80401a, operation));
        } else {
            if (!(pixKey instanceof PixKey.PhoneNumber)) {
                throw new IllegalStateException("Impossible to claim ownership of key types: document or random");
            }
            pair = new Pair(Integer.valueOf(z ? R$string.pix_verify_ownership_phone_title : R$string.pix_reply_ownership_claim_decline_token_verification_title_phone), new TokenVerificationRequest.Phone(((PixKey.PhoneNumber) pixKey2).f80403a, operation));
        }
        return new PortabilityDetailsContract$Step.VerifyOwnership(new TokenVerificationScreenContract$InputData(portabilityDetailsContract$InputData.f80668a, new TextLocalisedClause(((Number) pair.f186385a).intValue(), null, null, 14), (TokenVerificationRequest) pair.f186386b));
    }

    @Override // yki.g
    public final b s() {
        return this.f80676t;
    }
}
