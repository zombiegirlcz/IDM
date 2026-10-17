package com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.flow;

import c84.t;
import com.revolut.feature.credit.application.plugins.api.CreditApplicationPluginsApi$Toggles$CoBorrowerConsentInitiatorRevTags;
import com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrower;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.flow.CoBorrowerConsentInitiatorFlowContract$Step;
import cp5.d;
import e84.e;
import iu3.g;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends t implements l64.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CoBorrowerConsentInitiatorFlowContract$InputData f67222p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pw3.a f67223q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ln3.b f67224r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f67225s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CoBorrowerConsentInitiatorFlowContract$InputData inputData, pw3.a coBorrowerConsentInitiatorInteractor, ln3.b contactsChooserNavigationScreenProvider, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(coBorrowerConsentInitiatorInteractor, "coBorrowerConsentInitiatorInteractor");
        Intrinsics.checkNotNullParameter(contactsChooserNavigationScreenProvider, "contactsChooserNavigationScreenProvider");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67222p = inputData;
        this.f67223q = coBorrowerConsentInitiatorInteractor;
        this.f67224r = contactsChooserNavigationScreenProvider;
        cnc.t tVar = new cnc.t(this, 1);
        this.f67225s = d.a(this, CoBorrowerConsentInitiatorFlowContract$Step.Initial.f67216a, f0.f322471a, tVar);
    }

    public final boolean P2() {
        return ((jte.d) ((gte.a) this.o.d)).c(CreditApplicationPluginsApi$Toggles$CoBorrowerConsentInitiatorRevTags.f66275c);
    }

    public final void Q2(g gVar, CoBorrower coBorrower) {
        h.t2(this, this.f67225s, new CoBorrowerConsentInitiatorFlowContract$Step.RequestConsent(zv3.a.BACK, gVar, coBorrower), true, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (this.f67225s.d() instanceof CoBorrowerConsentInitiatorFlowContract$Step.Initial) {
            n2(new kze.h(this, null, 2), new whi.b(6));
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67225s;
    }
}
