package com.revolut.feature.pix.impl.flow.alias_registration;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.api.model.AliasRegistrationResult;
import com.revolut.feature.pix.api.model.AliasRegistrationType;
import com.revolut.feature.pix.api.model.PhoneNumber;
import com.revolut.feature.pix.api.model.TokenVerificationRequest;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.alias_registration.AliasRegistrationContract$Step;
import com.revolut.feature.pix.screens.token_verification.TokenVerificationScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import y8a.b;
import y8a.c;
import y8a.g;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements y8a.a {
    public final AliasRegistrationContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f80582p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f80583q;

    public a(AliasRegistrationContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f80582p = e.b(this, new AliasRegistrationContract$State(inputData.f80575b));
        AliasRegistrationType aliasRegistrationType = inputData.f80575b;
        this.f80583q = cp5.d.a(this, aliasRegistrationType != null ? new AliasRegistrationContract$Step.RegisterAlias(aliasRegistrationType) : AliasRegistrationContract$Step.SelectType.f80580a, f0.f322471a, new g(this, 0));
    }

    public final void I2(AliasRegistrationResult aliasRegistrationResult) {
        boolean z = aliasRegistrationResult instanceof AliasRegistrationResult.PortabilityRequired;
        yki.a aVar = this.f80583q;
        if (z) {
            h.t2(this, aVar, new AliasRegistrationContract$Step.RequestPortability(((AliasRegistrationResult.PortabilityRequired) aliasRegistrationResult).j()), true, null, false, 12);
            return;
        }
        if (aliasRegistrationResult instanceof AliasRegistrationResult.Success) {
            C2(new b(((AliasRegistrationResult.Success) aliasRegistrationResult).f80387a));
        } else if (Intrinsics.f(aliasRegistrationResult, AliasRegistrationResult.Pending.f80384a)) {
            C2(c.f311643a);
        } else {
            if (!(aliasRegistrationResult instanceof AliasRegistrationResult.Failed)) {
                throw new NoWhenBranchMatchedException();
            }
            h.D2(aVar);
        }
    }

    public final void J2(AliasRegistrationType aliasRegistrationType) {
        boolean z;
        int i;
        TokenVerificationRequest phone;
        H2(this.f80582p, new y8a.h(aliasRegistrationType, 0));
        boolean z3 = aliasRegistrationType instanceof AliasRegistrationType.Inputtable;
        ModalDestination.Style.FULLSCREEN_IMMEDIATE fullscreen_immediate = ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a;
        yki.a aVar = this.f80583q;
        if (!z3) {
            if (!Intrinsics.f(aliasRegistrationType, AliasRegistrationType.RandomKey.f80393a) && !Intrinsics.f(aliasRegistrationType, AliasRegistrationType.UserDocument.f80394a)) {
                throw new NoWhenBranchMatchedException();
            }
            h.w2(aVar, new AliasRegistrationContract$Step.RegisterAlias(aliasRegistrationType), fullscreen_immediate);
            return;
        }
        AliasRegistrationType.Inputtable inputtable = (AliasRegistrationType.Inputtable) aliasRegistrationType;
        Object value = inputtable.getValue();
        yki.a aVar2 = this.f80583q;
        if (value == null || (((z = inputtable instanceof AliasRegistrationType.Phone)) && ((AliasRegistrationType.Phone) inputtable).f80391b.f80396b.length() == 0)) {
            h.t2(this, aVar2, new AliasRegistrationContract$Step.InputAlias(inputtable), true, null, false, 12);
            return;
        }
        if (inputtable.getF80392c() != null) {
            h.w2(aVar, new AliasRegistrationContract$Step.RegisterAlias(inputtable), fullscreen_immediate);
            return;
        }
        AccountId accountId = this.o.f80574a;
        Intrinsics.checkNotNullParameter(inputtable, "<this>");
        boolean z4 = inputtable instanceof AliasRegistrationType.Email;
        if (z4) {
            i = R$string.pix_verify_ownership_email_title;
        } else {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.pix_verify_ownership_phone_title;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        Intrinsics.checkNotNullParameter(inputtable, "<this>");
        if (z4) {
            String str = ((AliasRegistrationType.Email) inputtable).f80388b;
            if (str == null) {
                str = "";
            }
            phone = new TokenVerificationRequest.Email(str, TokenVerificationRequest.Operation.CREATE_ALIAS);
        } else {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            PhoneNumber phoneNumber = ((AliasRegistrationType.Phone) inputtable).f80391b;
            phone = new TokenVerificationRequest.Phone(a0.d.r(hx7.a.J(phoneNumber.f80395a), phoneNumber.f80396b), TokenVerificationRequest.Operation.CREATE_ALIAS);
        }
        h.t2(this, aVar2, new AliasRegistrationContract$Step.VerifyOwnership(new TokenVerificationScreenContract$InputData(accountId, textLocalisedClause, phone)), true, null, false, 12);
    }

    @Override // qki.e
    public final d getState() {
        return this.f80582p;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f80583q;
    }
}
