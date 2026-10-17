package com.revolut.retail.feature.esim.impl.ui.flows.post_checkout;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.flow.BackStackEntry;
import com.revolut.retail.feature.esim.impl.ui.flows.post_checkout.EsimPostCheckoutFlowContract$Step;
import cp5.d;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ogj.b;
import ogj.c;
import oki.h;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {
    public final EsimPostCheckoutFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f100865p;

    public a(EsimPostCheckoutFlowContract$InputData inputData) {
        EsimPostCheckoutFlowContract$Step esimPostCheckoutFlowContract$Step;
        List listC;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        EsimPostCheckoutFlowContract$Step esimPostCheckoutFlowContract$Step2 = inputData.f100857a;
        boolean z = esimPostCheckoutFlowContract$Step2 instanceof EsimPostCheckoutFlowContract$Step.EsimHome;
        EsimPostCheckoutFlowContract$Step.EsimHome esimHome = EsimPostCheckoutFlowContract$Step.EsimHome.f100859a;
        if (z || (esimPostCheckoutFlowContract$Step2 instanceof EsimPostCheckoutFlowContract$Step.ShareEsim) || (esimPostCheckoutFlowContract$Step2 instanceof EsimPostCheckoutFlowContract$Step.InstallationInstructions)) {
            esimPostCheckoutFlowContract$Step = esimHome;
        } else {
            if (!(esimPostCheckoutFlowContract$Step2 instanceof EsimPostCheckoutFlowContract$Step.NumberTransferConfirmation)) {
                throw new NoWhenBranchMatchedException();
            }
            esimPostCheckoutFlowContract$Step = esimPostCheckoutFlowContract$Step2;
        }
        if (z || (esimPostCheckoutFlowContract$Step2 instanceof EsimPostCheckoutFlowContract$Step.ShareEsim) || (esimPostCheckoutFlowContract$Step2 instanceof EsimPostCheckoutFlowContract$Step.InstallationInstructions)) {
            listC = f0.f322471a;
        } else {
            if (!(esimPostCheckoutFlowContract$Step2 instanceof EsimPostCheckoutFlowContract$Step.NumberTransferConfirmation)) {
                throw new NoWhenBranchMatchedException();
            }
            listC = u.c(new BackStackEntry(esimHome, TransitionAnimation.SLIDE_END_TO_START.f98395a));
        }
        this.f100865p = d.a(this, esimPostCheckoutFlowContract$Step, listC, new c(this, 0));
    }

    @Override // yji.l
    public final void I1() {
        if (this.f226127l) {
            return;
        }
        EsimPostCheckoutFlowContract$Step esimPostCheckoutFlowContract$Step = this.o.f100857a;
        if ((esimPostCheckoutFlowContract$Step instanceof EsimPostCheckoutFlowContract$Step.EsimHome) || (esimPostCheckoutFlowContract$Step instanceof EsimPostCheckoutFlowContract$Step.NumberTransferConfirmation)) {
            return;
        }
        if (!(esimPostCheckoutFlowContract$Step instanceof EsimPostCheckoutFlowContract$Step.ShareEsim) && !(esimPostCheckoutFlowContract$Step instanceof EsimPostCheckoutFlowContract$Step.InstallationInstructions)) {
            throw new NoWhenBranchMatchedException();
        }
        h.w2(this.f100865p, esimPostCheckoutFlowContract$Step, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f100865p;
    }
}
