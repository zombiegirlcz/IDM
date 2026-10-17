package com.revolut.feature.apm.upi.impl.flow.pending_payment;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.common.ui.R$string;
import kgm.i;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import oz1.j;
import y8a.g;
import yf2.b;
import yf2.d;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b {

    @NotNull
    public static final d Companion = new d();
    public final UpiPendingPaymentFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f62997p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f62998q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.i f62999r;

    public a(UpiPendingPaymentFlowContract$InputData inputData, i upiMandateInteractor, j apmPaymentsAuthorisationsPendingActionInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(upiMandateInteractor, "upiMandateInteractor");
        Intrinsics.checkNotNullParameter(apmPaymentsAuthorisationsPendingActionInteractor, "apmPaymentsAuthorisationsPendingActionInteractor");
        this.o = inputData;
        this.f62997p = upiMandateInteractor;
        this.f62998q = apmPaymentsAuthorisationsPendingActionInteractor;
        this.f62999r = d8l.d.a(this, new g(this, 21));
    }

    @Override // yki.j
    public final void M0() {
        n2(new y7i.h(this, null, 10), new whi.b(6));
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        l.a1(this, X1(new y0(null, new z(new TextLocalisedClause(R$string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new yf2.g(this, null, 0), 3);
        return true;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f62999r;
    }
}
