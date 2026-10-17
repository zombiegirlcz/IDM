package com.revolut.feature.apm.iris.impl.ui.pay;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.models.recipients.IrisContact;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.feature.apm.iris.api.R$string;
import com.revolut.feature.apm.iris.impl.common.ApmTransferDestinationIris;
import com.revolut.feature.apm.iris.impl.data.models.IrisQrScanDetails;
import com.revolut.feature.apm.iris.impl.ui.pay.IrisPayFlowContract$Step;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$InputData;
import hrf.f;
import iv0.p;
import j2c.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import tak.d;
import yki.i;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends h implements j62.b {
    public final IrisPayFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s52.a f62517p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k62.b f62518q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f62519r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a62.a f62520s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f62521t;

    public b(IrisPayFlowContract$InputData inputData, s52.a qrHandler, k62.b payInteractor, d pendingPaymentExtension, a62.a errorHandlerExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(qrHandler, "qrHandler");
        Intrinsics.checkNotNullParameter(payInteractor, "payInteractor");
        Intrinsics.checkNotNullParameter(pendingPaymentExtension, "pendingPaymentExtension");
        Intrinsics.checkNotNullParameter(errorHandlerExtension, "errorHandlerExtension");
        this.o = inputData;
        this.f62517p = qrHandler;
        this.f62518q = payInteractor;
        this.f62519r = pendingPaymentExtension;
        this.f62520s = errorHandlerExtension;
        this.f62521t = d8l.d.a(this, new n(this, 8));
    }

    public static final void I2(b bVar, IrisQrScanDetails irisQrScanDetails) {
        i iVar = bVar.f62521t;
        if (!(irisQrScanDetails instanceof IrisQrScanDetails.Transfer)) {
            if (irisQrScanDetails instanceof IrisQrScanDetails.ConfirmPayment) {
                h.u2(bVar, iVar, new IrisPayFlowContract$Step.PendingPayment(new PendingPaymentContract$InputData.Apm(((IrisQrScanDetails.ConfirmPayment) irisQrScanDetails).f62497a, true)), null, 6);
                return;
            } else {
                if (irisQrScanDetails != null) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar.C2(j62.d.f171664a);
                return;
            }
        }
        IrisQrScanDetails.Transfer transfer = (IrisQrScanDetails.Transfer) irisQrScanDetails;
        IrisContact irisContact = transfer.f62498a;
        f fVar = f.OUTGOING;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.apm_descriptor_transfer_iris_amount_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.apm_descriptor_transfer_iris_review_title, null, null, 14);
        ApmTransferDestinationIris apmTransferDestinationIris = new ApmTransferDestinationIris(transfer.f62498a);
        IrisPayFlowContract$InputData irisPayFlowContract$InputData = bVar.o;
        h.u2(bVar, iVar, new IrisPayFlowContract$Step.Transfer(new ApmTransferContract$InputData(irisContact, fVar, textLocalisedClause, textLocalisedClause2, apmTransferDestinationIris, t52.b.b(irisPayFlowContract$InputData.f62513b), null, irisPayFlowContract$InputData.f62513b, null, 11200)), null, 6);
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new yi5.b(26));
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (((a62.b) this.f62520s).Z2(throwable, new p(this, 14))) {
            return true;
        }
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return false;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f62521t;
    }
}
