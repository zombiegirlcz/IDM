package com.revolut.feature.credit.card.impl.ui.repay.boleto.flow;

import au4.b;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.flow.CreditCardRepayBoletoFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.flow.CreditCardRepayBoletoFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import d8l.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {
    public final CreditCardRepayBoletoFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f69559p;

    public a(CreditCardRepayBoletoFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f69559p = d.a(this, new anc.b(this, 16));
    }

    @Override // yki.j
    public final void M0() {
        CreditCardRepayBoletoFlowContract$InputData creditCardRepayBoletoFlowContract$InputData = this.o;
        boolean z = creditCardRepayBoletoFlowContract$InputData instanceof CreditCardRepayBoletoFlowContract$InputData.Create;
        i iVar = this.f69559p;
        if (z) {
            h.t2(this, iVar, new CreditCardRepayBoletoFlowContract$Step.CreateBoleto(((CreditCardRepayBoletoFlowContract$InputData.Create) creditCardRepayBoletoFlowContract$InputData).f69552a), false, null, false, 12);
        } else {
            if (!(creditCardRepayBoletoFlowContract$InputData instanceof CreditCardRepayBoletoFlowContract$InputData.Details)) {
                throw new NoWhenBranchMatchedException();
            }
            CreditCardRepayBoletoFlowContract$InputData.Details details = (CreditCardRepayBoletoFlowContract$InputData.Details) creditCardRepayBoletoFlowContract$InputData;
            h.w2(iVar, new CreditCardRepayBoletoFlowContract$Step.BoletoDetails(details.f69553a, details.f69554b, true), ModalDestination.Style.POPUP.f98311a);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69559p;
    }
}
