package com.revolut.feature.credit.card.impl.ui.limit_hub.flow;

import com.revolut.feature.credit.card.impl.ui.limit_hub.flow.CreditCardLimitHubFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import mnl.g;
import mt4.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {
    public final CreditCardLimitHubFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f69535p;

    public a(CreditCardLimitHubFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        g gVar = new g(this, 13);
        this.f69535p = d.a(this, CreditCardLimitHubFlowContract$Step.Manage.f69533a, f0.f322471a, gVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69535p;
    }
}
