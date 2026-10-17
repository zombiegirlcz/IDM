package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoBannerActionConfirmation;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoBannerInfo;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubPlan;
import com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsFeatureConfig;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.CobrandedCardsPlanHubScreenContract$ActionBannerPayload;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.CobrandedCardsPlanHubScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import g4b.a0;
import g7b.o;
import g7b.r;
import g7b.t;
import g7b.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import r10.f;
import vkm.q;
import w4l.i;
import wli.x;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends h implements o {

    @NotNull
    private static final r Companion = new r();
    public final q5b.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c6b.b f82585p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f82586q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g7b.a f82587r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i7d.o f82588s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f82589t;
    public final c6b.c u;
    public final vii.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f82590w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f82591x;

    public e(n stateMapper, q5b.b cobrandedCardsPlansInteractor, c6b.b cobrandedCardsBillingInteractor, x deeplinkHandler, g7b.a modalsMapper, i7d.o helpWidgetControllerModelExtension, f subscribeActionHandler, c6b.c cardBenefitsExpandStateInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(cobrandedCardsPlansInteractor, "cobrandedCardsPlansInteractor");
        Intrinsics.checkNotNullParameter(cobrandedCardsBillingInteractor, "cobrandedCardsBillingInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(modalsMapper, "modalsMapper");
        Intrinsics.checkNotNullParameter(helpWidgetControllerModelExtension, "helpWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(subscribeActionHandler, "subscribeActionHandler");
        Intrinsics.checkNotNullParameter(cardBenefitsExpandStateInteractor, "cardBenefitsExpandStateInteractor");
        this.o = cobrandedCardsPlansInteractor;
        this.f82585p = cobrandedCardsBillingInteractor;
        this.f82586q = deeplinkHandler;
        this.f82587r = modalsMapper;
        this.f82588s = helpWidgetControllerModelExtension;
        this.f82589t = subscribeActionHandler;
        this.u = cardBenefitsExpandStateInteractor;
        this.v = new vii.b(i.f294643c);
        this.f82590w = mra.d.b(this, new g7b.n(new Data(null, null, true, 3, null), null, f0.f322471a, true), stateMapper, null, false, 12);
        this.f82591x = hx7.e.a(this, new g75.i(this, 2));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.v, new t(2, this, continuation)), null, null, new v(1, this, continuation), 3);
        g64.c cVar = new g64.c(7);
        y yVar = this.f82590w;
        l.a1(this, q.Q(q.q(new a0(yVar.B(cVar), 4)), new t(0, this, continuation)), null, null, new v(0, this, continuation), 3);
        l.a1(this, q.Q(q.q(yVar.B(new g64.c(6))), new t(1, this, continuation)), null, null, new a2g.q(this, continuation, 24), 3);
    }

    public final void I2(String str) {
        l2(new g1k.i(this, str, null, 15), new yi5.b(26));
    }

    public final void J2(Object obj2) {
        boolean z = obj2 instanceof CobrandedCardsPlanHubScreenContract$ActionBannerPayload;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.f82591x;
        if (!z) {
            if (obj2 instanceof CobrandedCardsPlanHubInfoBannerInfo) {
                h.v2(aVar, new CobrandedCardsPlanHubScreenContract$ModalStep.BannerInfo((CobrandedCardsPlanHubInfoBannerInfo) obj2), bottom_dialog);
            }
        } else {
            CobrandedCardsPlanHubScreenContract$ActionBannerPayload cobrandedCardsPlanHubScreenContract$ActionBannerPayload = (CobrandedCardsPlanHubScreenContract$ActionBannerPayload) obj2;
            CobrandedCardsPlanHubInfoBannerActionConfirmation cobrandedCardsPlanHubInfoBannerActionConfirmation = cobrandedCardsPlanHubScreenContract$ActionBannerPayload.getF82576b().f82344c;
            if (cobrandedCardsPlanHubInfoBannerActionConfirmation != null) {
                h.v2(aVar, new CobrandedCardsPlanHubScreenContract$ModalStep.BannerActionConfirmation(cobrandedCardsPlanHubScreenContract$ActionBannerPayload, cobrandedCardsPlanHubInfoBannerActionConfirmation), bottom_dialog);
            } else {
                K2(cobrandedCardsPlanHubScreenContract$ActionBannerPayload);
            }
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f82591x;
    }

    public final void K2(CobrandedCardsPlanHubScreenContract$ActionBannerPayload cobrandedCardsPlanHubScreenContract$ActionBannerPayload) {
        Continuation continuation = null;
        if (cobrandedCardsPlanHubScreenContract$ActionBannerPayload instanceof CobrandedCardsPlanHubScreenContract$ActionBannerPayload.Subscribe) {
            l2(new d(this, (CobrandedCardsPlanHubScreenContract$ActionBannerPayload.Subscribe) cobrandedCardsPlanHubScreenContract$ActionBannerPayload, null), new yi5.b(26));
            return;
        }
        if (cobrandedCardsPlanHubScreenContract$ActionBannerPayload instanceof CobrandedCardsPlanHubScreenContract$ActionBannerPayload.Url) {
            I2(((CobrandedCardsPlanHubScreenContract$ActionBannerPayload.Url) cobrandedCardsPlanHubScreenContract$ActionBannerPayload).f82575a);
            return;
        }
        if (cobrandedCardsPlanHubScreenContract$ActionBannerPayload instanceof CobrandedCardsPlanHubScreenContract$ActionBannerPayload.CancelCardTermination) {
            l2(new a(this, ((CobrandedCardsPlanHubScreenContract$ActionBannerPayload.CancelCardTermination) cobrandedCardsPlanHubScreenContract$ActionBannerPayload).f82569a.d, null), new yi5.b(26));
            return;
        }
        if (!(cobrandedCardsPlanHubScreenContract$ActionBannerPayload instanceof CobrandedCardsPlanHubScreenContract$ActionBannerPayload.OrderCard)) {
            throw new NoWhenBranchMatchedException();
        }
        CobrandedCardsPlanHubPlan cobrandedCardsPlanHubPlan = ((CobrandedCardsPlanHubScreenContract$ActionBannerPayload.OrderCard) cobrandedCardsPlanHubScreenContract$ActionBannerPayload).f82571b;
        if (cobrandedCardsPlanHubPlan.d != null) {
            C1(new CobrandedCardsFeatureConfig.OrderCardDestination(cobrandedCardsPlanHubPlan));
        } else {
            l2(new g1k.i(this, cobrandedCardsPlanHubPlan, continuation, 14), new g64.c(8));
        }
    }

    @Override // cli.z
    public final g getState() {
        return this.f82590w;
    }
}
