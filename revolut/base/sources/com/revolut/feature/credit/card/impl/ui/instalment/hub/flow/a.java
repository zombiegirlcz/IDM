package com.revolut.feature.credit.card.impl.ui.instalment.hub.flow;

import com.revolut.feature.credit.card.impl.ui.instalment.hub.flow.CreditCardInstalmentHubFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import cp5.d;
import eh3.s;
import es4.b;
import hs4.f;
import hs4.g;
import hs4.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {
    public final CreditCardInstalmentHubFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f69407p;

    public a(CreditCardInstalmentHubFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        s sVar = new s(this, 24);
        this.f69407p = d.a(this, CreditCardInstalmentHubFlowContract$Step.Hub.f69401a, f0.f322471a, sVar);
    }

    public final void I2(yki.b bVar, i iVar) {
        boolean z = iVar instanceof f;
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        if (z) {
            h.w2(bVar, new CreditCardInstalmentHubFlowContract$Step.PostPurchaseDetails(((f) iVar).f154989a), popup);
        } else if (iVar instanceof g) {
            h.w2(bVar, new CreditCardInstalmentHubFlowContract$Step.PrePurchaseDetails(((g) iVar).f154990a), popup);
        } else {
            if (!(iVar instanceof hs4.h)) {
                throw new NoWhenBranchMatchedException();
            }
            h.w2(bVar, new CreditCardInstalmentHubFlowContract$Step.StatementFinancingDetails(((hs4.h) iVar).f154991a), popup);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69407p;
    }
}
