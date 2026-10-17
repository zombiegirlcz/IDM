package com.revolut.feature.credit.application.plugins.impl.ui.credit_health.flow;

import com.revolut.feature.credit.application.models.credit_health.CreditHealthAction;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_health.flow.CreditHealthFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import cp5.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l0c.v;
import l84.c;
import l84.g;
import oki.h;
import org.jetbrains.annotations.NotNull;
import xq3.r;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends h implements l84.a {

    @NotNull
    private static final g Companion = new g();
    public final CreditHealthFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r f67398p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f67399q;

    public b(CreditHealthFlowContract$InputData inputData, r creditHealthInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditHealthInteractor, "creditHealthInteractor");
        this.o = inputData;
        this.f67398p = creditHealthInteractor;
        v vVar = new v(this, 16);
        this.f67399q = d.a(this, CreditHealthFlowContract$Step.Loading.f67396a, f0.f322471a, vVar);
    }

    @Override // yji.l
    public final void I1() {
        l2(new a(this, null), new yi5.b(26));
    }

    public final void I2(CreditHealthAction creditHealthAction) {
        if (creditHealthAction instanceof CreditHealthAction.Popup) {
            h.w2(this.f67399q, new CreditHealthFlowContract$Step.Popup(((CreditHealthAction.Popup) creditHealthAction).f66225a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else if (creditHealthAction instanceof CreditHealthAction.CloseApplication) {
            C2(l84.b.f192777a);
        } else if (creditHealthAction instanceof CreditHealthAction.Proceed) {
            C2(l84.d.f192779a);
        } else {
            if (!(creditHealthAction instanceof CreditHealthAction.Deeplink)) {
                throw new NoWhenBranchMatchedException();
            }
            C2(new c(((CreditHealthAction.Deeplink) creditHealthAction).f66224a));
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67399q;
    }
}
