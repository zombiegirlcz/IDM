package com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details;

import cli.g;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.card_design.api.CardDesignCatalogueDestination;
import com.revolut.feature.insurance_embedded.impl.R$string;
import com.revolut.feature.insurance_embedded.impl.data.model.ActivateCoverageWidget;
import com.revolut.feature.insurance_embedded.impl.data.model.OrderCardWidget;
import com.revolut.feature.insurance_embedded.impl.data.model.PricingPlanBanner;
import com.revolut.feature.insurance_embedded.impl.data.model.Promotion;
import com.revolut.feature.insurance_embedded.impl.data.model.d0;
import com.revolut.feature.insurance_embedded.impl.data.model.f0;
import com.revolut.feature.insurance_embedded.impl.data.model.g0;
import com.revolut.feature.insurance_embedded.impl.data.model.i;
import com.revolut.feature.insurance_embedded.impl.data.model.i0;
import com.revolut.feature.insurance_embedded.impl.data.model.j;
import com.revolut.feature.insurance_embedded.impl.data.model.k;
import com.revolut.feature.insurance_embedded.impl.data.model.n;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.InsuranceDetailsLayoutScreenContract$ModalStep;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.a;
import com.revolut.kompot.common.ModalDestination;
import ffk.t;
import gu7.l2;
import gu7.m0;
import h93.j0;
import h93.l0;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import mu7.c;
import oki.h;
import pnf.f;
import pv7.m;
import pv7.q;
import pv7.s;
import pv7.v;
import wli.x;
import xv7.p;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements q {
    public final InsuranceDetailsLayoutScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tr7.a f76120p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f76121q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p f76122r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t f76123s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f76124t;
    public final sv7.a u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f76125w;

    public b(v stateMapper, InsuranceDetailsLayoutScreenContract$InputData inputData, tr7.a copyToClipboardHelper, x deeplinkHandler, p pricingPlanBannerMapper, t pricingPlanInteractor, c insuranceDetailsLayoutInteractor, sv7.a contactsControllerModelExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(copyToClipboardHelper, "copyToClipboardHelper");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(pricingPlanBannerMapper, "pricingPlanBannerMapper");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(insuranceDetailsLayoutInteractor, "insuranceDetailsLayoutInteractor");
        Intrinsics.checkNotNullParameter(contactsControllerModelExtension, "contactsControllerModelExtension");
        this.o = inputData;
        this.f76120p = copyToClipboardHelper;
        this.f76121q = deeplinkHandler;
        this.f76122r = pricingPlanBannerMapper;
        this.f76123s = pricingPlanInteractor;
        this.f76124t = insuranceDetailsLayoutInteractor;
        this.u = contactsControllerModelExtension;
        this.v = d.b(this, new m(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f76125w = e.a(this, new psl.m(20));
    }

    @Override // yji.l
    public final void I1() {
        InsuranceDetailsLayoutScreenContract$InputData insuranceDetailsLayoutScreenContract$InputData = this.o;
        l.a1(this, c.a(this.f76124t, insuranceDetailsLayoutScreenContract$InputData.f76112a, insuranceDetailsLayoutScreenContract$InputData.f76113b, 4), null, null, new s(this, null, 0), 3);
        l.a1(this, vkm.q.Q(this.v.B(new pui.a(9)), new pkf.x(null, this, 13)), null, null, new s(this, null, 1), 3);
        l.a1(this, rd0.e.b(this.f76123s.q()), null, null, new s(this, null, 2), 3);
    }

    public final void I2(String str) {
        n2(new f(this, str, null, 19), new whi.b(6));
    }

    public final void J2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        boolean z = obj2 instanceof k;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.f76125w;
        if (z) {
            k kVar = (k) obj2;
            if (!(kVar instanceof com.revolut.feature.insurance_embedded.impl.data.model.l)) {
                if (!(kVar instanceof n)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.v2(aVar, new InsuranceDetailsLayoutScreenContract$ModalStep.ConditionsDetails(((n) kVar).f76016b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return;
            } else {
                com.revolut.feature.insurance_embedded.impl.data.model.l lVar = (com.revolut.feature.insurance_embedded.impl.data.model.l) kVar;
                tr7.a.b(this.f76120p, lVar.f76004c, new TextLocalisedClause(R$string.embedded_insurance_insurance_details_copy_accessibility_label, u.c(lVar.f76003b), null, 12), 2);
                return;
            }
        }
        if (obj2 instanceof f0) {
            f0 f0Var = (f0) obj2;
            if (f0Var instanceof g0) {
                I2(((g0) f0Var).f75992b);
                return;
            } else {
                if (!(f0Var instanceof i0)) {
                    throw new NoWhenBranchMatchedException();
                }
                C2(new pv7.p(((i0) f0Var).f75996b.f75905a));
                return;
            }
        }
        if (obj2 instanceof l2) {
            C2(a.C0508a.f76116a);
            return;
        }
        if (obj2 instanceof m0) {
            C2(a.b.f76117a);
            return;
        }
        if (obj2 instanceof j) {
            j jVar = (j) obj2;
            if (jVar instanceof com.revolut.feature.insurance_embedded.impl.data.model.h) {
                C2(a.c.f76118a);
                return;
            } else {
                if (!(jVar instanceof i)) {
                    throw new NoWhenBranchMatchedException();
                }
                C2(a.d.f76119a);
                return;
            }
        }
        if (obj2 instanceof OrderCardWidget) {
            C1(new CardDesignCatalogueDestination(null, c93.e.PHYSICAL, j0.RETAIL, l0.DEBIT, null, null, null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, 16777200));
            return;
        }
        if (obj2 instanceof ActivateCoverageWidget) {
            h.v2(aVar, new InsuranceDetailsLayoutScreenContract$ModalStep.CoverageActivation((ActivateCoverageWidget) obj2), ModalDestination.Style.POPUP.f98311a);
            return;
        }
        if (obj2 instanceof PricingPlanBanner) {
            PricingPlanBanner pricingPlanBanner = (PricingPlanBanner) obj2;
            ou7.a.c(this, pricingPlanBanner.f75958b, pricingPlanBanner.f75959c);
        } else {
            if (obj2 instanceof Promotion) {
                I2(((Promotion) obj2).f75962b);
                return;
            }
            if (obj2 instanceof nr7.c) {
                I2(((nr7.c) obj2).f218591a);
            } else if (obj2 instanceof d0) {
                ((sv7.c) this.u).Z2((d0) obj2);
            }
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f76125w;
    }

    @Override // cli.z
    public final g getState() {
        return this.v;
    }
}
