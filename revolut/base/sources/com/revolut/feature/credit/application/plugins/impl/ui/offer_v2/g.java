package com.revolut.feature.credit.application.plugins.impl.ui.offer_v2;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$OfferUpdateContext;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import cv3.b0;
import cv3.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ma2.s;
import mf4.a0;
import mf4.c0;
import mf4.d0;
import oki.h;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends t implements mf4.d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final OfferV2FlowContract$InputData f68150p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mf4.e f68151q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f64.a f68152r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f68153s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final mf4.a f68154t;
    public final wx4.b u;
    public final yki.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(OfferV2FlowContract$InputData inputData, mf4.e offerFlowInteractor, f64.a repaymentTypeSelectionDialogFactory, j60.a bottomDialogExtension, mf4.a offerDocumentControllerModelExtension, wx4.b creditProductArticleChecker, e84.e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(offerFlowInteractor, "offerFlowInteractor");
        Intrinsics.checkNotNullParameter(repaymentTypeSelectionDialogFactory, "repaymentTypeSelectionDialogFactory");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(offerDocumentControllerModelExtension, "offerDocumentControllerModelExtension");
        Intrinsics.checkNotNullParameter(creditProductArticleChecker, "creditProductArticleChecker");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68150p = inputData;
        this.f68151q = offerFlowInteractor;
        this.f68152r = repaymentTypeSelectionDialogFactory;
        this.f68153s = bottomDialogExtension;
        this.f68154t = offerDocumentControllerModelExtension;
        this.u = creditProductArticleChecker;
        hs3.c f68095b = inputData.f68089a.getF68095b();
        this.v = cp5.d.a(this, f68095b != null ? new OfferV2FlowContract$Step.AnimatedIntro(f68095b) : OfferV2FlowContract$Step.Initial.f68109a, f0.f322471a, new m84.e(this, 14));
    }

    public static final void P2(g gVar, OfferV2FlowContract$OfferUpdateContext offerV2FlowContract$OfferUpdateContext) {
        b0 b0Var;
        mf4.e eVar = gVar.f68151q;
        if (offerV2FlowContract$OfferUpdateContext instanceof OfferV2FlowContract$OfferUpdateContext.Calculator) {
            b0Var = ((a0) eVar).f204836g;
        } else {
            if (!(offerV2FlowContract$OfferUpdateContext instanceof OfferV2FlowContract$OfferUpdateContext.LoanOffer)) {
                throw new NoWhenBranchMatchedException();
            }
            b0Var = ((a0) eVar).f;
        }
        hu3.a aVar = b0Var != null ? b0Var.f109240g : null;
        if (aVar != null) {
            h.w2(gVar.v, new OfferV2FlowContract$Step.ChangeRepaymentDay(aVar, offerV2FlowContract$OfferUpdateContext), ModalDestination.Style.POPUP.f98311a);
        }
    }

    @Override // yji.l
    public final void I1() {
        OfferV2FlowContract$Step offerV2FlowContract$Step = (OfferV2FlowContract$Step) this.v.d();
        Continuation continuation = null;
        if (offerV2FlowContract$Step instanceof OfferV2FlowContract$Step.AnimatedIntro) {
            l2(new mf4.f0(this, continuation, 4), new yi5.b(26));
        } else if (offerV2FlowContract$Step instanceof OfferV2FlowContract$Step.Initial) {
            l2(new mf4.f0(this, continuation, 3), new yi5.b(26));
        }
    }

    public final void Q2(i iVar, boolean z) {
        int i = d0.f204850c[iVar.ordinal()];
        if (i == 1) {
            l2(new e(this, z, null), new yi5.b(26));
            return;
        }
        if (i == 2) {
            h.t2(this, this.v, new OfferV2FlowContract$Step.Calculator(null, 7), z, null, false, 12);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "OfferV2FlowModel", "Unknown intro product article action for OfferV2FlowModel", null, h0Var);
        }
    }

    public final void R2(c0 c0Var) {
        this.f68154t.b3(c0Var.f204846b.f265635a, new s(this, c0Var, 11));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
