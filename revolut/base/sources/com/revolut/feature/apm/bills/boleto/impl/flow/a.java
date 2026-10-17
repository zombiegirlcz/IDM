package com.revolut.feature.apm.bills.boleto.impl.flow;

import com.revolut.feature.apm.bills.boleto.impl.flow.BoletoTransferFlowContract$Step;
import com.revolut.feature.apm.bills.core.api.model.search.boleto.BillSearchBoletoResult;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import fn1.b;
import fn1.c;
import fn1.e;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qki.d;
import vkm.j2;
import vkm.q;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {

    @NotNull
    private static final e Companion = new e();
    public final j2 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j2 f61183p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f61184q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f61185r;

    public a(c inputData) {
        LocalDate localDate;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        BillSearchBoletoResult billSearchBoletoResult = inputData.f136508a;
        Long lValueOf = (billSearchBoletoResult.u || (localDate = billSearchBoletoResult.f61441t) == null) ? null : Long.valueOf(ebm.a.P(localDate));
        this.o = q.c(new TransferScheduleData(lValueOf != null ? lValueOf.longValue() : 0L, (jli.c) null, 6));
        this.f61183p = q.c(billSearchBoletoResult);
        this.f61184q = hx7.e.b(this, new BoletoTransferFlowContract$State(billSearchBoletoResult));
        this.f61185r = cp5.d.a(this, billSearchBoletoResult.f61440s ? BoletoTransferFlowContract$Step.Amount.f61178a : new BoletoTransferFlowContract$Step.Review(0), f0.f322471a, new fb.c(this, inputData, 3));
    }

    @Override // qki.e
    public final d getState() {
        return this.f61184q;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f61185r;
    }
}
