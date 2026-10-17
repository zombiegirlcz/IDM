package com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation;

import com.revolut.feature.external_accounts.api.navigation.BrazilInboundMandateConfirmationDescriptor$InputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation.BrazilInboundMandateConfirmationFlowContract$Step;
import cp5.d;
import hk6.k;
import kotlin.jvm.internal.Intrinsics;
import oj6.g;
import oki.h;
import wj6.m;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements oj6.b {
    public final BrazilInboundMandateConfirmationDescriptor$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f72584p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f72585q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f72586r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final pj6.a f72587s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f72588t;

    public c(BrazilInboundMandateConfirmationDescriptor$InputData inputData, m updatedLimitRelay, k updatedExpiryDateRelay, g updatedInstitutionRelay, pj6.a steeringInfoBottomSheetProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(updatedLimitRelay, "updatedLimitRelay");
        Intrinsics.checkNotNullParameter(updatedExpiryDateRelay, "updatedExpiryDateRelay");
        Intrinsics.checkNotNullParameter(updatedInstitutionRelay, "updatedInstitutionRelay");
        Intrinsics.checkNotNullParameter(steeringInfoBottomSheetProvider, "steeringInfoBottomSheetProvider");
        this.o = inputData;
        this.f72584p = updatedLimitRelay;
        this.f72585q = updatedExpiryDateRelay;
        this.f72586r = updatedInstitutionRelay;
        this.f72587s = steeringInfoBottomSheetProvider;
        oa4.c cVar = new oa4.c(this, 21);
        this.f72588t = d.a(this, BrazilInboundMandateConfirmationFlowContract$Step.MandatePreview.f72577a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f72588t;
    }
}
