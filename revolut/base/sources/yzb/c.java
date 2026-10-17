package yzb;

import afa.s;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.api.product.ApmAani;
import com.revolut.feature.external_accounts.impl.repository.network.IndiaNetBankingService;
import com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.IndiaAppRedirectionFlowContract$Step;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig$PersonalizedOffersFullscreen$Destination;
import com.revolut.feature.shops.api.navigation.AdsFullScreenPromptType;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.EsimCheckoutScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.invitation.e;
import com.revolut.sso.impl.ui.external_entry.external_entry.ExternalEntryFlowContract$State;
import dfj.k0;
import dfj.w;
import efm.d0;
import efm.r;
import ej9.e0;
import ggc.j0;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import nyb.b0;
import skm.p0;
import ti9.g;
import unj.p;
import wm3.j;
import wsg.n;
import yhm.o;
import yji.l;
import z55.z;
import z67.d;
import z75.v;
import zh9.u0;
import zhb.k;
import zhm.u;
import zjc.h;
import zmb.f;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f318063w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f318063w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c((com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.flow.a) this.f318063w, continuation, 0);
            case 1:
                return new c((com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a) this.f318063w, continuation, 1);
            case 2:
                return new c((com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a) this.f318063w, continuation, 2);
            case 3:
                return new c((com.revolut.feature.giro.impl.ui.a) this.f318063w, continuation, 3);
            case 4:
                return new c((com.revolut.feature.apm.multibanco.impl.ui.home.a) this.f318063w, continuation, 4);
            case 5:
                return new c((com.revolut.feature.credit.loan.impl.ui.rev10.repaymentbreakdown.a) this.f318063w, continuation, 5);
            case 6:
                return new c((com.revolut.feature.revolutpay.impl.ui.flow.summary.b) this.f318063w, continuation, 6);
            case 7:
                return new c((com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.a) this.f318063w, continuation, 7);
            case 8:
                return new c((zba.i) this.f318063w, continuation, 8);
            case 9:
                return new c((zd3.i) this.f318063w, continuation, 9);
            case 10:
                return new c((zdb.i) this.f318063w, continuation, 10);
            case 11:
                return new c((com.revolut.feature.crypto.exchange.fees.impl.ui.c) this.f318063w, continuation, 11);
            case 12:
                return new c((com.revolut.feature.pay_bills_taxes.impl.ui.flow.form.b) this.f318063w, continuation, 12);
            case 13:
                return new c((com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.a) this.f318063w, continuation, 13);
            case 14:
                return new c((com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow.b) this.f318063w, continuation, 14);
            case 15:
                return new c((EsimCheckoutScreen) this.f318063w, continuation, 15);
            case 16:
                return new c((com.revolut.retail.feature.esim.impl.ui.screens.checkout.a) this.f318063w, continuation, 16);
            case 17:
                return new c((e) this.f318063w, continuation, 17);
            case 18:
                return new c((zh6.c) this.f318063w, continuation, 18);
            case 19:
                return new c((k) this.f318063w, continuation, 19);
            case 20:
                return new c((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_keep.a) this.f318063w, continuation, 20);
            case 21:
                return new c((com.revolut.feature.tab.credit.impl.ui.restore.a) this.f318063w, continuation, 21);
            case 22:
                return new c((com.revolut.feature.pay_later.impl.ui.paymentoptions.options.a) this.f318063w, continuation, 22);
            case 23:
                return new c((h) this.f318063w, continuation, 23);
            case 24:
                return new c((com.revolut.feature.apm.aani.impl.ui.settings.a) this.f318063w, continuation, 24);
            case 25:
                return new c((com.revolut.feature.pay_with_smile.impl.ui.flow.create_passcode.c) this.f318063w, continuation, 25);
            case 26:
                return new c((f) this.f318063w, continuation, 26);
            case 27:
                return new c((zmg.e) this.f318063w, continuation, 27);
            case 28:
                return new c((com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a) this.f318063w, continuation, 28);
            default:
                return new c((com.revolut.sso.impl.ui.external_entry.external_entry.a) this.f318063w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objA;
        Object objI2;
        Object objB;
        Object objC;
        Object objB2;
        Object netBankingInstitutions;
        Object objB3;
        Object objB0;
        Object objI;
        String str;
        Object objS2;
        int i = 28;
        int i2 = 2;
        int i3 = 12;
        int i5 = 0;
        int i6 = 26;
        String strN = null;
        boolean z = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z6 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z29 = false;
        boolean z31 = false;
        boolean z41 = false;
        boolean z49 = false;
        boolean z54 = false;
        int i21 = 1;
        switch (this.u) {
            case 0:
                com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.flow.a aVar = (com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.flow.a) this.f318063w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    o.b(obj2);
                    eub.k kVar = aVar.f83839p;
                    this.v = 1;
                    objA = ((b0) kVar).a(this);
                    if (objA == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objA = obj2;
                }
                if (((Boolean) objA).booleanValue()) {
                    aVar.C1(new ShopsFeatureConfig$PersonalizedOffersFullscreen$Destination(aVar.o.f83836a, u.c(new AdsFullScreenPromptType.AdsPersonalizedOffers(true))));
                    oki.h.D2(aVar.f83841r);
                } else {
                    aVar.l2(new yv1.k(aVar, z ? 1 : 0, 9), new yi5.b(i6));
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    o.b(obj2);
                    com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a aVar4 = (com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a) this.f318063w;
                    j jVar = new j(aVar4, z3 ? 1 : 0, 24);
                    this.v = 1;
                    if (aVar4.p2(this, jVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a aVar6 = (com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a) this.f318063w;
                z zVar = new z(aVar6, z4 ? 1 : 0, i21);
                this.v = 1;
                Object objB4 = pu7.a.B(aVar6.k, "show manage repayment accounts", zVar, this);
                return objB4 == aVar5 ? aVar5 : objB4;
            case 3:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    o.b(obj2);
                    com.revolut.feature.giro.impl.ui.a aVar8 = (com.revolut.feature.giro.impl.ui.a) this.f318063w;
                    d dVar = new d(aVar8, null);
                    this.v = 1;
                    if (aVar8.p2(this, dVar) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    o.b(obj2);
                    lx1.d dVar2 = ((com.revolut.feature.apm.multibanco.impl.ui.home.a) this.f318063w).f62593p;
                    n02.b bVar = n02.b.MBWAY;
                    this.v = 1;
                    if (((fy1.o) dVar2).g(bVar, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 != 0) {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.loan.impl.ui.rev10.repaymentbreakdown.a aVar11 = (com.revolut.feature.credit.loan.impl.ui.rev10.repaymentbreakdown.a) this.f318063w;
                v vVar = new v(aVar11, z6 ? 1 : 0, i21);
                this.v = 1;
                Object objB5 = pu7.a.B(aVar11.k, "repay", vVar, this);
                return objB5 == aVar10 ? aVar10 : objB5;
            case 6:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    o.b(obj2);
                    com.revolut.feature.revolutpay.impl.ui.flow.summary.b bVar2 = (com.revolut.feature.revolutpay.impl.ui.flow.summary.b) this.f318063w;
                    com.revolut.feature.revolutpay.impl.ui.flow.summary.a aVar13 = new com.revolut.feature.revolutpay.impl.ui.flow.summary.a(bVar2, null);
                    this.v = 1;
                    if (bVar2.p2(this, aVar13) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.a aVar14 = (com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.a) this.f318063w;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    o.b(obj2);
                    if (aVar14.f78444q.d() instanceof IndiaAppRedirectionFlowContract$Step.DownloadIndiaApp) {
                        return Unit.f186387a;
                    }
                    this.v = 1;
                    objI2 = com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.a.I2(aVar14, this);
                    if (objI2 == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objI2 = obj2;
                }
                IndiaAppRedirectionFlowContract$Step indiaAppRedirectionFlowContract$Step = (IndiaAppRedirectionFlowContract$Step) objI2;
                if (indiaAppRedirectionFlowContract$Step instanceof IndiaAppRedirectionFlowContract$Step.DownloadIndiaApp) {
                    oki.h.t2(aVar14, aVar14.f78444q, indiaAppRedirectionFlowContract$Step, false, null, false, 12);
                }
                return Unit.f186387a;
            case 8:
                zba.i iVar = (zba.i) this.f318063w;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    o.b(obj2);
                    n nVar = iVar.f320862p;
                    xi0.b.Companion.getClass();
                    d0 d0VarR = osg.b.r(nVar, xi0.b.D, null, null, null, 62);
                    this.v = 1;
                    objB = nim.a.b(d0VarR, this);
                    if (objB == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB = obj2;
                }
                iVar.H2(iVar.f320863q, new s((io3.d) objB, 21));
                return Unit.f186387a;
            case 9:
                zd3.i iVar2 = (zd3.i) this.f318063w;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    o.b(obj2);
                    r rVarE = iVar2.f321308p.e();
                    this.v = 1;
                    objC = nim.a.c(rVarE, this);
                    if (objC == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objC = obj2;
                }
                iVar2.x2(new zd3.h((Data) objC, i2));
                return Unit.f186387a;
            case 10:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                zdb.i iVar3 = (zdb.i) this.f318063w;
                zdb.h hVar = new zdb.h(iVar3, z11 ? 1 : 0, i21);
                this.v = 1;
                Object objB6 = pu7.a.B(iVar3.k, "cancel_reservation", hVar, this);
                return objB6 == aVar18 ? aVar18 : objB6;
            case 11:
                com.revolut.feature.crypto.exchange.fees.impl.ui.c cVar = (com.revolut.feature.crypto.exchange.fees.impl.ui.c) this.f318063w;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    o.b(obj2);
                    d0 d0VarC = ((gi5.d) cVar.f70845t).c(null);
                    this.v = 1;
                    objB2 = nim.a.b(d0VarC, this);
                    if (objB2 == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB2 = obj2;
                }
                cVar.H2(cVar.v, new bke.o((sh5.c) objB2, 17));
                return Unit.f186387a;
            case 12:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    o.b(obj2);
                    com.revolut.feature.pay_bills_taxes.impl.ui.flow.form.b bVar3 = (com.revolut.feature.pay_bills_taxes.impl.ui.flow.form.b) this.f318063w;
                    com.revolut.feature.pay_bills_taxes.impl.ui.flow.form.a aVar21 = new com.revolut.feature.pay_bills_taxes.impl.ui.flow.form.a(bVar3, null);
                    this.v = 1;
                    if (bVar3.p2(this, aVar21) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.a aVar23 = (com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.a) this.f318063w;
                    zg4.b bVar4 = new zg4.b(aVar23, null, 0);
                    this.v = 1;
                    if (aVar23.p2(this, bVar4) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    o.b(obj2);
                    com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow.b bVar5 = (com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow.b) this.f318063w;
                    this.v = 1;
                    if (com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow.b.I2(bVar5, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    o.b(obj2);
                    EsimCheckoutScreen esimCheckoutScreen = (EsimCheckoutScreen) this.f318063w;
                    KProperty[] kPropertyArr = EsimCheckoutScreen.f100904a0;
                    wej.a aVarD3 = esimCheckoutScreen.d3();
                    ScreenContentRecyclerView screenEsimCheckoutRecyclerView = aVarD3.d;
                    Intrinsics.checkNotNullExpressionValue(screenEsimCheckoutRecyclerView, "screenEsimCheckoutRecyclerView");
                    NavBarWithToolbar navBarWithToolbar = aVarD3.f296798c;
                    CollapsingActionButton collapsingActionButton = aVarD3.f296797b;
                    this.v = 1;
                    if (p.a(screenEsimCheckoutRecyclerView, navBarWithToolbar, collapsingActionButton, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                com.revolut.retail.feature.esim.impl.ui.screens.checkout.a aVar26 = (com.revolut.retail.feature.esim.impl.ui.screens.checkout.a) this.f318063w;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    o.b(obj2);
                    w wVar = aVar26.f100921q;
                    EsimGiftRecipient esimGiftRecipient = aVar26.f100920p.f100909c;
                    if (esimGiftRecipient != null) {
                        aVar26.G.getClass();
                        strN = ugc.a.n(esimGiftRecipient);
                    }
                    this.v = 1;
                    Object objB7 = ((nfj.p) wVar.f114137a).b(this, strN, true);
                    if (objB7 != aVar27) {
                        objB7 = Unit.f186387a;
                    }
                    if (objB7 == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                aVar26.H2(aVar26.H, new zg6.c(8));
                aVar26.I.a();
                return Unit.f186387a;
            case 17:
                e eVar = (e) this.f318063w;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    o.b(obj2);
                    j jVar2 = new j(eVar, z12 ? 1 : 0, i);
                    this.v = 1;
                    if (eVar.p2(this, jVar2) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return l.b1(eVar, eVar.X1(new mii.k("id_invite_cancelled", new TextLocalisedClause(R$string.family_plans_management_cancel_invitation_success_shot, null, null, 14), null, null, null, 28)), null, new z3f.b(eVar, z29 ? 1 : 0, i3), 3);
            case 18:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    o.b(obj2);
                    IndiaNetBankingService indiaNetBankingService = ((zh6.c) this.f318063w).f322239a;
                    this.v = 1;
                    netBankingInstitutions = indiaNetBankingService.getNetBankingInstitutions(this);
                    if (netBankingInstitutions == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    netBankingInstitutions = obj2;
                }
                List listA = ((yh6.b) netBankingInstitutions).getLimits();
                ArrayList arrayList = new ArrayList(zhm.w.t(listA, 10));
                Iterator it8 = listA.iterator();
                while (it8.hasNext()) {
                    arrayList.add(md6.s.x((hg6.b) it8.next()));
                }
                return arrayList;
            case 19:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    o.b(obj2);
                    k kVar2 = (k) this.f318063w;
                    com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input.a aVar31 = new com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input.a(kVar2, null);
                    this.v = 1;
                    if (kVar2.p2(this, aVar31) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_keep.a aVar32 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_keep.a) this.f318063w;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    o.b(obj2);
                    d0 d0VarE = aVar32.f103187p.e();
                    this.v = 1;
                    objB3 = nim.a.b(d0VarE, this);
                    if (objB3 == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i110 != 1) {
                        if (i110 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                    objB3 = obj2;
                }
                hha.d dVar3 = (hha.d) objB3;
                Intrinsics.h(dVar3);
                this.v = 2;
                if (pu7.a.B(aVar32.k, "keep_plan", new yg5.r(aVar32, dVar3, z31 ? 1 : 0, i), this) == aVar33) {
                    return aVar33;
                }
                return Unit.f186387a;
            case 21:
                com.revolut.feature.tab.credit.impl.ui.restore.a aVar34 = (com.revolut.feature.tab.credit.impl.ui.restore.a) this.f318063w;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    o.b(obj2);
                    vie.i iVar4 = aVar34.f89772p;
                    this.v = 1;
                    if (iVar4.c(true, this) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                aVar34.C1(new BridgeDestination(jbb.a.a(ibb.c.f, new TabAccountsLaunchConfig(aVar34.o.f89770a, null), null, null, 12)));
                oki.h.D2(aVar34.f89773q);
                return Unit.f186387a;
            case 22:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    o.b(obj2);
                    xh9.a aVar37 = ((com.revolut.feature.pay_later.impl.ui.paymentoptions.options.a) this.f318063w).f78888p;
                    this.v = 1;
                    e0 e0Var = (e0) ((g) aVar37).f271456a;
                    e0Var.getClass();
                    ej9.d0 d0Var = new ej9.d0(e0Var, z41 ? 1 : 0, i21);
                    p0 p0Var = p0.f264001a;
                    Object objJ = skm.e0.J(elm.f.f127540b, d0Var, this);
                    Object obj3 = objJ;
                    if (objJ != aVar36) {
                        obj3 = Unit.f186387a;
                    }
                    if (obj3 != aVar36) {
                        obj3 = Unit.f186387a;
                    }
                    if (obj3 == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                h hVar2 = (h) this.f318063w;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    o.b(obj2);
                    zjc.g gVar = new zjc.g(i5, z49 ? 1 : 0, hVar2);
                    this.v = 1;
                    objB0 = u0.b0(hVar2.X(), "EXISTING_SUBSCRIPTION_CHECK_SECONDARY_BUTTON_LOADING_TAG", gVar, this);
                    if (objB0 == aVar38) {
                        return aVar38;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB0 = obj2;
                }
                hVar2.C2(new zjc.e(((j0) objB0).f143638a));
                return Unit.f186387a;
            case 24:
                com.revolut.feature.apm.aani.impl.ui.settings.a aVar39 = (com.revolut.feature.apm.aani.impl.ui.settings.a) this.f318063w;
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    o.b(obj2);
                    zl1.l lVar = aVar39.o;
                    this.v = 1;
                    ikf.g gVar2 = new ikf.g((iz1.h) lVar.f323166b, ApmAani.f61807c, z54 ? 1 : 0, i6);
                    p0 p0Var2 = p0.f264001a;
                    if (skm.e0.J(elm.f.f127540b, gVar2, this) == aVar40) {
                        return aVar40;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                aVar39.B2();
                return Unit.f186387a;
            case 25:
                com.revolut.feature.pay_with_smile.impl.ui.flow.create_passcode.c cVar2 = (com.revolut.feature.pay_with_smile.impl.ui.flow.create_passcode.c) this.f318063w;
                fim.a aVar41 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    o.b(obj2);
                    efm.k kVarC = cVar2.f78964q.d.c();
                    this.v = 1;
                    objI = nim.a.i(kVarC, this);
                    if (objI == aVar41) {
                        return aVar41;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objI = obj2;
                }
                do3.n nVar2 = (do3.n) objI;
                if (nVar2 == null || (str = nVar2.i) == null) {
                    m70.a.c(t0.f186434a);
                    str = "";
                }
                cVar2.H2(cVar2.f78967t, new yui.v(str, 19));
                return Unit.f186387a;
            case 26:
                fim.a aVar42 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    o.b(obj2);
                    ijb.a aVar43 = ((f) this.f318063w).f323442b;
                    this.v = 1;
                    if (ijb.a.e(aVar43, null, this, 1) == aVar42) {
                        return aVar42;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar44 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    o.b(obj2);
                    smd.s sVar = ((zmg.e) this.f318063w).d;
                    this.v = 1;
                    if (sVar.S(this) == aVar44) {
                        return aVar44;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                ((zmg.e) this.f318063w).f323513c.f25421c = true;
                return Unit.f186387a;
            case 28:
                fim.a aVar45 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    o.b(obj2);
                    k0 k0Var = ((com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a) this.f318063w).f101429r;
                    this.v = 1;
                    if (k0Var.e(this) == aVar45) {
                        return aVar45;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar46 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    o.b(obj2);
                    com.revolut.sso.impl.ui.external_entry.external_entry.a aVar47 = (com.revolut.sso.impl.ui.external_entry.external_entry.a) this.f318063w;
                    this.v = 1;
                    ExternalEntryFlowContract$State externalEntryFlowContract$State = (ExternalEntryFlowContract$State) aVar47.A2().f98429a;
                    if (externalEntryFlowContract$State instanceof ExternalEntryFlowContract$State.GetAuthCode) {
                        String str2 = ((ExternalEntryFlowContract$State.GetAuthCode) externalEntryFlowContract$State).f106545a;
                        if (str2 == null || kotlin.text.d0.W(str2)) {
                            objS2 = aVar47.S2(this);
                            if (objS2 != aVar46) {
                                objS2 = Unit.f186387a;
                            }
                        } else {
                            objS2 = aVar47.T2(str2, this);
                            if (objS2 != aVar46) {
                                objS2 = Unit.f186387a;
                            }
                        }
                    } else {
                        if (!(externalEntryFlowContract$State instanceof ExternalEntryFlowContract$State.NotSupported)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objS2 = Unit.f186387a;
                    }
                    if (objS2 == aVar46) {
                        return aVar46;
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
