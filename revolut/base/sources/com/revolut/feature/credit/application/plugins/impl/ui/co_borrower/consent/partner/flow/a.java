package com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.flow;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.flow.CoBorrowerConsentPartnerFlowContract$Step;
import cp5.d;
import e84.e;
import kotlin.jvm.internal.Intrinsics;
import nx2.f;
import o64.b;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f67231p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        f fVar = new f(this, 21);
        this.f67231p = d.a(this, CoBorrowerConsentPartnerFlowContract$Step.GiveConsent.f67230a, f0.f322471a, fVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67231p;
    }
}
