package com.revolut.feature.apm.core.ui.impl.ui.transfer;

import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.ApmTransferFlowContract$Step;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData;
import cp5.d;
import e0b.c;
import e52.b;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import s42.e;
import s42.f;
import yji.n;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements e {
    public final ApmTransferContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e52.a f62420p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b3a.a f62421q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wj0.a f62422r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f62423s;

    public a(ApmTransferContract$InputData flowInputData, e52.a errorHandlerExtension, b3a.a chatTransferNavigationProvider, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(errorHandlerExtension, "errorHandlerExtension");
        Intrinsics.checkNotNullParameter(chatTransferNavigationProvider, "chatTransferNavigationProvider");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.o = flowInputData;
        this.f62420p = errorHandlerExtension;
        this.f62421q = chatTransferNavigationProvider;
        this.f62422r = idempotencyKeyHolder;
        this.f62423s = d.a(this, new ApmTransferFlowContract$Step.Amount(new TransferAmountContract$InputData.NewTransfer(flowInputData.f62280a, flowInputData.f62281b, flowInputData.k, flowInputData.f62284h, flowInputData.i, flowInputData.f62288n, flowInputData.e, flowInputData.f62285j)), f0.f322471a, new f(this, 0));
    }

    @Override // yji.l
    public final void I1() {
        this.f62422r.a("payments_apm_transfer");
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        b bVar = (b) this.f62420p;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        z zVarB = bVar.f122716l.b(throwable);
        if (zVarB != null) {
            n.j2(bVar, bVar.L2(new y0(null, zVarB, false, 5)), null, new c(bVar, null, 14), 3);
            return true;
        }
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return false;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f62423s;
    }
}
