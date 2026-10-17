package c64;

import a83.j0;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.revolut.data.model.Data;
import com.revolut.domain.models.openbanking.instructions.InstitutionInstructions;
import com.revolut.domain.models.openbanking.instructions.InstructionsDomain;
import com.revolut.feature.credit.application.plugins.impl.ui.form.FormFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.funds_confirmation.OpenBankingFundsConfirmationScreenContract$InputData;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceNumberData;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.ImplicitActivityDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import cul.k1;
import cul.m1;
import d6j.n0;
import d7j.f0;
import dej.t1;
import dfj.k4;
import ft3.h1;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import vkm.j2;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f21619w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f21620x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f21619w = obj2;
        this.f21620x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d((e) this.f21619w, (l) this.f21620x, continuation, 0);
            case 1:
                return new d((c7e.g) this.f21619w, (String) this.f21620x, continuation, 1);
            case 2:
                return new d((c7e.n) this.f21619w, (String) this.f21620x, continuation, 2);
            case 3:
                return new d((com.revolut.feature_retail_user_declarations.email_verification.b) this.f21619w, (String) this.f21620x, continuation, 3);
            case 4:
                return new d((cbk.o) this.f21619w, (sak.c) this.f21620x, continuation, 4);
            case 5:
                return new d((cc7.h) this.f21619w, (String) this.f21620x, continuation, 5);
            case 6:
                return new d((com.revolut.feature.credit.application.plugins.impl.ui.offer.e) this.f21619w, (ff4.p) this.f21620x, continuation, 6);
            case 7:
                return new d((com.revolut.feature.external_accounts.impl.mandate.create_mandate.b) this.f21619w, (ch6.i) this.f21620x, continuation, 7);
            case 8:
                return new d((cj6.n) this.f21620x, continuation, 8);
            case 9:
                return new d((com.revolut.feature.shops.impl.ui.details.a) this.f21619w, (ShopsCampaignOffer) this.f21620x, continuation, 9);
            case 10:
                return new d((com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e) this.f21619w, (String) this.f21620x, continuation, 10);
            case 11:
                return new d((com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.b) this.f21619w, (e54.p) this.f21620x, continuation, 11);
            case 12:
                return new d((com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.c) this.f21619w, (o74.l) this.f21620x, continuation, 12);
            case 13:
                return new d((com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.c) this.f21619w, (yb4.h) this.f21620x, continuation, 13);
            case 14:
                return new d((cc4.c) this.f21620x, continuation, 14);
            case 15:
                return new d((com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e) this.f21619w, (Map) this.f21620x, continuation, 15);
            case 16:
                return new d((com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.a) this.f21619w, (x35.e) this.f21620x, continuation, 16);
            case 17:
                return new d((com.revolut.feature.credit.application.plugins.impl.ui.user_selection.flow.b) this.f21619w, (ArrayList) this.f21620x, continuation, 17);
            case 18:
                return new d((com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a) this.f21619w, (String) this.f21620x, continuation, 18);
            case 19:
                return new d((Amount) this.f21619w, (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f21620x, continuation, 19);
            case 20:
                return new d((com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f21620x, continuation, 20);
            case 21:
                return new d((com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f21619w, (String) this.f21620x, continuation, 21);
            case 22:
                return new d((com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f21619w, (BigDecimal) this.f21620x, continuation, 22);
            case 23:
                return new d((cw6.l) this.f21619w, (FreelancerInvoiceNumberData) this.f21620x, continuation, 23);
            case 24:
                return new d((CoroutineScope) this.f21619w, (com.revolut.retail.feature.impl.userauth.flow.f) this.f21620x, continuation, 24);
            case 25:
                return new d((cxe.h) this.f21619w, (com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c) this.f21620x, continuation, 25);
            case 26:
                return new d((n0) this.f21620x, continuation, 26);
            case 27:
                return new d((com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g) this.f21620x, continuation, 27);
            case 28:
                return new d((dba.i) this.f21619w, (f5j.a) this.f21620x, continuation, 28);
            default:
                return new d((k4) this.f21619w, (Ref$ObjectRef) this.f21620x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objD;
        Object objB;
        Object objB2;
        ei6.d dVar;
        Object objB3;
        Object objC;
        Object objD2;
        Object objJ;
        Object objC2;
        ty3.a aVar;
        Object objJ2;
        Object objP2;
        com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar;
        List list;
        Object next;
        jxe.c cVar;
        jxe.l lVar;
        Object objB4;
        n0 n0Var;
        Object objI2;
        Object objN;
        ExchangeOrderDraft exchangeOrderDraft;
        int i = this.u;
        int i2 = 5;
        int i3 = 4;
        int i5 = 14;
        int i6 = 6;
        int i21 = 2;
        boolean z = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z6 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z29 = false;
        boolean z31 = false;
        boolean z41 = false;
        Object obj3 = this.f21620x;
        int i22 = 1;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    e eVar2 = (e) this.f21619w;
                    c cVar2 = new c((l) obj3, eVar2, null);
                    this.v = 1;
                    if (eVar2.p2(this, cVar2) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                jhi.b bVarG = mo3.a.g(((s6e.z) ((c7e.g) this.f21619w).f21940q).u((String) obj3), null, null, 3);
                this.v = 1;
                Object objX = vkm.q.x(bVarG, this);
                return objX == aVar3 ? aVar3 : objX;
            case 2:
                c7e.n nVar = (c7e.n) this.f21619w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    g6e.g gVar = nVar.o;
                    this.v = 1;
                    objD = ((v6e.r) gVar).d((String) obj3, this);
                    if (objD == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objD = obj2;
                }
                return nVar.A2(new BridgeDestination((NaviCommand) objD));
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                pai.a aVar6 = ((com.revolut.feature_retail_user_declarations.email_verification.b) this.f21619w).f97612q;
                this.v = 1;
                Object objA = ((pai.e) aVar6).a((String) obj3, this);
                return objA == aVar5 ? aVar5 : objA;
            case 4:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (cbk.o.d3((cbk.o) this.f21619w, (sak.c) obj3, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    yb7.a aVar9 = ((cc7.h) this.f21619w).f22951n;
                    String surveyId = (String) obj3;
                    aVar9.getClass();
                    Intrinsics.checkNotNullParameter(surveyId, "surveyId");
                    vb7.f fVar = aVar9.f312204a;
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(surveyId, "surveyId");
                    pfm.h hVar = new pfm.h(new to7.f(fVar, surveyId, i5), 1);
                    Intrinsics.checkNotNullExpressionValue(hVar, "defer(...)");
                    this.v = 1;
                    if (nim.a.a(hVar, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                rx3.b bVar = ((com.revolut.feature.credit.application.plugins.impl.ui.offer.e) this.f21619w).f68084q;
                String str = ((ff4.p) obj3).f134737b.f265635a;
                this.v = 1;
                v34.a aVar11 = bVar.f258018a;
                aVar11.getClass();
                v06.i iVar = new v06.i(aVar11, str, z4 ? 1 : 0, i2);
                p0 p0Var = p0.f264001a;
                Object objJ3 = e0.J(elm.f.f127540b, iVar, this);
                return objJ3 == aVar10 ? aVar10 : objJ3;
            case 7:
                com.revolut.feature.external_accounts.impl.mandate.create_mandate.b bVar2 = (com.revolut.feature.external_accounts.impl.mandate.create_mandate.b) this.f21619w;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    ch6.i iVar2 = (ch6.i) obj3;
                    ufm.i iVarA = bVar2.f72442p.a(iVar2.f24129a.f66107a, iVar2.f24130b, iVar2.f24131c, bVar2.o.f72437b);
                    this.v = 1;
                    objB = nim.a.b(iVarA, this);
                    if (objB == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                Uri uri2 = (Uri) objB;
                Intrinsics.h(uri2);
                bVar2.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new ActivityNavigateCommand(new ImplicitActivityDestination("android.intent.action.VIEW", null, null, null, uri2, 14), null, null, null, 0, null, null, null, null, false, 1022))));
                return Unit.f186387a;
            case 8:
                cj6.n nVar2 = (cj6.n) obj3;
                OpenBankingFundsConfirmationScreenContract$InputData openBankingFundsConfirmationScreenContract$InputData = nVar2.o;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    ufm.n nVarA = ((mg6.c) nVar2.f24618p).a(openBankingFundsConfirmationScreenContract$InputData.d);
                    this.v = 1;
                    objB2 = nim.a.b(nVarA, this);
                    if (objB2 == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i99 != 1) {
                        if (i99 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ei6.d dVar2 = (ei6.d) this.f21619w;
                        yhm.o.b(obj2);
                        dVar = dVar2;
                        objB3 = obj2;
                        return new Pair(dVar, (ri6.d) ((od0.i) objB3).g());
                    }
                    yhm.o.b(obj2);
                    objB2 = obj2;
                }
                x61.f fVar2 = (x61.f) objB2;
                String str2 = fVar2.f303016a;
                byte[] bArr = fVar2.f303017b;
                dVar = new ei6.d(str2, bArr != null ? BitmapFactory.decodeByteArray(bArr, 0, bArr.length) : null);
                ri6.c cVar3 = nVar2.f24619q;
                String clientId = openBankingFundsConfirmationScreenContract$InputData.d;
                String request = openBankingFundsConfirmationScreenContract$InputData.f72528c;
                String redirectUri = openBankingFundsConfirmationScreenContract$InputData.e;
                cVar3.getClass();
                Intrinsics.checkNotNullParameter(clientId, "clientId");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
                mg6.c cVar4 = (mg6.c) cVar3.f254559a;
                Intrinsics.checkNotNullParameter(clientId, "clientId");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
                hf6.i iVar3 = (hf6.i) cVar4.f205160a;
                iVar3.getClass();
                Intrinsics.checkNotNullParameter(clientId, "clientId");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
                efm.d0<if6.l> fundsConfirmation = iVar3.f151760a.getFundsConfirmation(clientId, request, redirectUri);
                int i100 = 16;
                hae.k kVar = new hae.k(new he4.r(15), i100);
                fundsConfirmation.getClass();
                ufm.i iVar4 = new ufm.i(fundsConfirmation, kVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                ufm.i iVar5 = new ufm.i(te0.w.i0(iVar4), new rea.j(new ri6.a(cVar3, z ? 1 : 0), i100), 0);
                Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                this.f21619w = dVar;
                this.v = 2;
                objB3 = nim.a.b(iVar5, this);
                if (objB3 == aVar13) {
                    return aVar13;
                }
                return new Pair(dVar, (ri6.d) ((od0.i) objB3).g());
            case 9:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.shops.impl.ui.details.a aVar15 = (com.revolut.feature.shops.impl.ui.details.a) this.f21619w;
                    bvb.n nVar3 = new bvb.n(aVar15, (ShopsCampaignOffer) obj3, (Continuation) null);
                    this.v = 1;
                    if (u0.b0(aVar15.X(), "SHOPS_CHECKOUT_BUTTON_TAG", nVar3, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                try {
                    if (i102 == 0) {
                        yhm.o.b(obj2);
                        String str3 = (String) obj3;
                        oe6.a aVar17 = ((com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e) this.f21619w).f72987r;
                        InstructionsDomain instructionsDomain = InstructionsDomain.AddMoneyOneOff;
                        this.v = 1;
                        objC = ((w21.o) ((xg6.j) aVar17).f305582a).c(str3, instructionsDomain, this);
                        if (objC == aVar16) {
                            return aVar16;
                        }
                    } else {
                        if (i102 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objC = obj2;
                    }
                    return (InstitutionInstructions) objC;
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    return null;
                }
            case 11:
                com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.b bVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.b) this.f21619w;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    sw3.c cVar5 = bVar3.f67308p;
                    h1 h1VarA9 = bVar3.o.a9();
                    Long l2 = new Long(((e54.o) ((e54.p) obj3)).f122757a);
                    this.v = 1;
                    objD2 = cVar5.d(h1VarA9, null, l2, this);
                    if (objD2 == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objD2 = obj2;
                }
                bVar3.H2(bVar3.f67312t, new h74.o((lu3.c) objD2, 0));
                return Unit.f186387a;
            case 12:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.c cVar6 = (com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.c) this.f21619w;
                tw3.a aVar20 = cVar6.f67319p;
                h1 h1VarA92 = cVar6.f67320q.a9();
                o74.l lVar2 = (o74.l) obj3;
                ly3.g gVar2 = new ly3.g(lVar2.f222713b, lVar2.f222712a);
                this.v = 1;
                y24.a aVar21 = aVar20.f274901a;
                aVar21.getClass();
                xge.f fVar3 = new xge.f(aVar21, gVar2, h1VarA92, null, 23);
                p0 p0Var2 = p0.f264001a;
                Object objJ4 = e0.J(elm.f.f127540b, fVar3, this);
                return objJ4 == aVar19 ? aVar19 : objJ4;
            case 13:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 != 0) {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.c cVar7 = (com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.c) this.f21619w;
                ix3.a aVar23 = cVar7.f67759p;
                h1 h1VarA93 = cVar7.f67760q.a9();
                sy3.d dVar3 = ((yb4.g) ((yb4.h) obj3)).f312186a;
                this.v = 1;
                k34.a aVar24 = aVar23.f169334a;
                aVar24.getClass();
                i4g.d dVar4 = new i4g.d(20, h1VarA93, aVar24, dVar3, (Continuation) null);
                p0 p0Var3 = p0.f264001a;
                Object objJ5 = e0.J(elm.f.f127540b, dVar4, this);
                return objJ5 == aVar22 ? aVar22 : objJ5;
            case 14:
                cc4.c cVar8 = (cc4.c) obj3;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    jx3.a aVar26 = cVar8.f22936q;
                    h1 h1VarA94 = cVar8.f22935p.a9();
                    this.v = 1;
                    l34.b bVar4 = aVar26.f179059a;
                    bVar4.getClass();
                    l34.a aVar27 = new l34.a(bVar4, h1VarA94, z6 ? 1 : 0, z3 ? 1 : 0);
                    p0 p0Var4 = p0.f264001a;
                    objJ = e0.J(elm.f.f127540b, aVar27, this);
                    if (objJ == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i106 != 1) {
                        if (i106 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (ty3.a) this.f21619w;
                        yhm.o.b(obj2);
                        objC2 = obj2;
                        oki.h.t2(cVar8, cVar8.f22938s, new FormFlowContract$Step((UUID) objC2, aVar.f275462a), false, null, false, 14);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objJ = obj2;
                }
                ty3.a aVar28 = (ty3.a) objJ;
                ra0.h hVar2 = cVar8.f22937r;
                String str4 = aVar28.f275462a;
                Map map = aVar28.f275463b;
                this.f21619w = aVar28;
                this.v = 2;
                objC2 = hVar2.c(str4, map, this);
                if (objC2 == aVar25) {
                    return aVar25;
                }
                aVar = aVar28;
                oki.h.t2(cVar8, cVar8.f22938s, new FormFlowContract$Step((UUID) objC2, aVar.f275462a), false, null, false, 14);
                return Unit.f186387a;
            case 15:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 != 0) {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e eVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e) this.f21619w;
                kx3.a aVar30 = eVar3.f67782p;
                this.v = 1;
                m34.c cVar9 = aVar30.f190377a;
                cVar9.getClass();
                lr.l lVar3 = new lr.l(cVar9, eVar3.f67783q.a9(), (Map) obj3, (Continuation) null, 12);
                p0 p0Var5 = p0.f264001a;
                Object objJ6 = e0.J(elm.f.f127540b, lVar3, this);
                return objJ6 == aVar29 ? aVar29 : objJ6;
            case 16:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 != 0) {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.a aVar32 = (com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.a) this.f21619w;
                ey3.a aVar33 = aVar32.f68352q;
                h1 h1VarA95 = aVar32.f68351p.a9();
                this.v = 1;
                i44.b bVar5 = aVar33.f130563a;
                bVar5.getClass();
                hsd.c cVar10 = new hsd.c((x35.e) obj3, bVar5, h1VarA95, (Continuation) null, 12);
                p0 p0Var6 = p0.f264001a;
                Object objJ7 = e0.J(elm.f.f127540b, cVar10, this);
                return objJ7 == aVar31 ? aVar31 : objJ7;
            case 17:
                com.revolut.feature.credit.application.plugins.impl.ui.user_selection.flow.b bVar6 = (com.revolut.feature.credit.application.plugins.impl.ui.user_selection.flow.b) this.f21619w;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    gy3.a aVar35 = bVar6.f68497q;
                    h1 h1VarA96 = bVar6.f68496p.a9();
                    ArrayList arrayList = (ArrayList) obj3;
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(new fz3.a(((zm3.l) it8.next()).N0()));
                    }
                    fz3.b bVar7 = new fz3.b(arrayList2);
                    this.v = 1;
                    k44.c cVar11 = aVar35.f147818a;
                    cVar11.getClass();
                    k0g.b bVar8 = new k0g.b(cVar11, bVar7, h1VarA96, (Continuation) null, 6);
                    p0 p0Var7 = p0.f264001a;
                    objJ2 = e0.J(elm.f.f127540b, bVar8, this);
                    if (objJ2 == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i109 != 1) {
                        if (i109 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objJ2 = obj2;
                }
                this.v = 2;
                if (c84.t.N2(bVar6, (it3.d) objJ2, this, 2) == aVar34) {
                    return aVar34;
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    al4.d dVar5 = ((com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a) this.f21619w).f69127q;
                    this.v = 1;
                    dp4.e eVar4 = ((om4.l) dVar5).f226624a;
                    eVar4.getClass();
                    dp4.d dVar6 = new dp4.d(eVar4, (String) obj3, z11 ? 1 : 0, i22);
                    p0 p0Var8 = p0.f264001a;
                    Object objJ8 = e0.J(elm.f.f127540b, dVar6, this);
                    Object obj4 = objJ8;
                    if (objJ8 != aVar36) {
                        obj4 = Unit.f186387a;
                    }
                    if (obj4 != aVar36) {
                        obj4 = Unit.f186387a;
                    }
                    if (obj4 == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    Amount amount = (Amount) this.f21619w;
                    if (amount == null) {
                        return null;
                    }
                    this.v = 1;
                    if (com.revolut.trading.orders.ui.invest.placement.screens.edit.e.J2((com.revolut.trading.orders.ui.invest.placement.screens.edit.e) obj3, amount, this) == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar5 = (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) obj3;
                    k1 k1Var = new k1(eVar5, z12 ? 1 : 0, i3);
                    this.f21619w = eVar5;
                    this.v = 1;
                    objP2 = eVar5.p2(this, k1Var);
                    if (objP2 == aVar38) {
                        return aVar38;
                    }
                    eVar = eVar5;
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar = (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f21619w;
                    yhm.o.b(obj2);
                    objP2 = obj2;
                }
                return eVar.C1((aii.u) objP2);
            case 21:
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar6 = (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f21619w;
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    Data data = ((cul.v) ((j2) eVar6.m0.f22677a).getValue()).S;
                    if (data != null && (list = (List) data.getContent()) != null) {
                        String str5 = (String) obj3;
                        Iterator it9 = list.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                next = it9.next();
                                if (Intrinsics.f(((pel.f) next).getId(), str5)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        pel.f fVar4 = (pel.f) next;
                        if (fVar4 != null) {
                            if (fVar4 instanceof pel.e) {
                                pel.e eVar7 = (pel.e) fVar4;
                                int i114 = m1.f109137a[eVar7.f235401c.ordinal()];
                                if (i114 == 1) {
                                    int iIntValueExact = eVar7.a().setScale(0, RoundingMode.HALF_UP).intValueExact();
                                    this.v = 1;
                                    if (eVar6.k3(iIntValueExact, this) == aVar39) {
                                        return aVar39;
                                    }
                                } else if (i114 != 2 && i114 != 3 && i114 != 4 && i114 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (fVar4 instanceof pel.b) {
                                eVar6.j3(((pel.b) fVar4).f235398b);
                            } else if (fVar4 instanceof pel.c) {
                                k1 k1Var2 = new k1(eVar6, z29 ? 1 : 0, i6);
                                this.v = 2;
                                if (eVar6.p2(this, k1Var2) == aVar39) {
                                    return aVar39;
                                }
                            } else if (fVar4 instanceof pel.a) {
                                this.v = 3;
                                if (eVar6.k3(100, this) == aVar39) {
                                    return aVar39;
                                }
                            } else {
                                if (!(fVar4 instanceof v6j.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                hx7.e.n(new Exception("Unsupported trading order keyboard suggestion: ".concat(fVar4.getClass().getName())));
                            }
                        }
                    }
                    return Unit.f186387a;
                }
                if (i113 != 1 && i113 != 2 && i113 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                return Unit.f186387a;
            case 22:
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar8 = (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f21619w;
                cli.y yVar = eVar8.m0;
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    eVar8.H2(yVar, new b4b.x(i21, (BigDecimal) obj3));
                    bbk.z zVar = new bbk.z(yVar.B(new cul.p0(19)), 24);
                    afa.e eVar9 = new afa.e(2, 1, null);
                    this.v = 1;
                    if (vkm.q.y(zVar, eVar9, this) == aVar40) {
                        return aVar40;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                eVar8.H.S(true);
                return Unit.f186387a;
            case 23:
                fim.a aVar41 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 != 0) {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                cw6.l lVar4 = (cw6.l) this.f21619w;
                this.v = 1;
                Object objJ9 = lVar4.f109551p.j(lVar4.o.f73766a, (FreelancerInvoiceNumberData) obj3, this);
                return objJ9 == aVar41 ? aVar41 : objJ9;
            case 24:
                com.revolut.retail.feature.impl.userauth.flow.f fVar5 = (com.revolut.retail.feature.impl.userauth.flow.f) obj3;
                fim.a aVar42 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    e0.C((CoroutineScope) this.f21619w, null, null, new cwj.j(fVar5, z31 ? 1 : 0, i6), 3);
                    this.v = 1;
                    if (fVar5.N2(this) == aVar42) {
                        return aVar42;
                    }
                } else {
                    if (i117 != 1) {
                        if (i117 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                if (com.revolut.retail.feature.impl.userauth.flow.f.J2(fVar5, this) == aVar42) {
                    return aVar42;
                }
                return Unit.f186387a;
            case 25:
                com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c cVar12 = (com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c) obj3;
                fim.a aVar43 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    cxe.h hVar3 = (cxe.h) this.f21619w;
                    if (hVar3 instanceof cxe.g) {
                        rwe.a aVar44 = cVar12.f90746r;
                        dj0.d dVar7 = ((cxe.g) hVar3).f109943a;
                        this.v = 1;
                        aVar44.f257893a.setValue(dVar7);
                        if (Unit.f186387a == aVar43) {
                            return aVar43;
                        }
                    } else {
                        if (!(hVar3 instanceof cxe.f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cxe.b bVar9 = (cxe.b) ((cxe.e) ((j2) cVar12.f90751y.f22677a).getValue()).f109940a.getContent();
                        dj0.d dVarA = (bVar9 == null || (lVar = bVar9.i) == null) ? null : lVar.a();
                        dj0.d dVarA2 = (bVar9 == null || (cVar = bVar9.f109924h) == null) ? null : cVar.a();
                        if (dVarA == null || dVarA2 == null) {
                            IllegalStateException illegalStateException = new IllegalStateException("Custom amount is null!");
                            h0 h0Var2 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                        } else {
                            cVar12.C2(new cxe.k(dVarA2, pyd.c.H(dVarA, dVarA2)));
                        }
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar45 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    n0 n0Var2 = (n0) obj3;
                    z5j.d dVar8 = n0Var2.O;
                    xi0.b bVar10 = n0Var2.o.f99788a;
                    this.f21619w = n0Var2;
                    this.v = 1;
                    objB4 = dVar8.b(bVar10, this);
                    if (objB4 == aVar45) {
                        return aVar45;
                    }
                    n0Var = n0Var2;
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n0Var = (n0) this.f21619w;
                    yhm.o.b(obj2);
                    objB4 = obj2;
                }
                return n0Var.C1((aii.u) objB4);
            case 27:
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar3 = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g) obj3;
                fim.a aVar46 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objI2 = com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g.I2(gVar3, this);
                    if (objI2 != aVar46) {
                    }
                    return aVar46;
                }
                if (i120 != 1) {
                    if (i120 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    exchangeOrderDraft = (ExchangeOrderDraft) this.f21619w;
                    yhm.o.b(obj2);
                    objN = obj2;
                    return new f0(exchangeOrderDraft, (String) objN);
                }
                yhm.o.b(obj2);
                objI2 = obj2;
                aii.u uVar = (aii.u) objI2;
                if (uVar != null) {
                    gVar3.C1(uVar);
                    return null;
                }
                ExchangeOrderDraft exchangeOrderDraftA = ((d7j.w) ((j2) gVar3.T.f22677a).getValue()).f112070g.a();
                if (exchangeOrderDraftA == null || !exchangeOrderDraftA.c()) {
                    hx7.e.n(new IllegalStateException("Order can not be submitted. Is null=" + (exchangeOrderDraftA == null) + " or order can not be submitted"));
                    return null;
                }
                fmc.z zVar2 = gVar3.M;
                this.f21619w = exchangeOrderDraftA;
                this.v = 2;
                objN = zVar2.n(exchangeOrderDraftA, this);
                if (objN != aVar46) {
                    exchangeOrderDraft = exchangeOrderDraftA;
                    return new f0(exchangeOrderDraft, (String) objN);
                }
                return aVar46;
            case 28:
                dba.i iVar6 = (dba.i) this.f21619w;
                fim.a aVar47 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.v;
                if (i121 == 0) {
                    yhm.o.b(obj2);
                    s8a.n nVar4 = iVar6.o;
                    String str6 = ((f5j.a) obj3).f132329a;
                    this.v = 1;
                    n8a.f0 f0Var = nVar4.f260965a;
                    f0Var.getClass();
                    n3j.w wVar = new n3j.w((Object) f0Var, (Object) str6, (Continuation) (z41 ? 1 : 0), i5);
                    p0 p0Var9 = p0.f264001a;
                    Object objJ10 = e0.J(elm.f.f127540b, wVar, this);
                    Object obj5 = objJ10;
                    if (objJ10 != aVar47) {
                        obj5 = Unit.f186387a;
                    }
                    if (obj5 != aVar47) {
                        obj5 = Unit.f186387a;
                    }
                    if (obj5 == aVar47) {
                        return aVar47;
                    }
                } else {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                j60.a.v(iVar6.f112701q, false, null, 3);
                return Unit.f186387a;
            default:
                fim.a aVar48 = fim.a.COROUTINE_SUSPENDED;
                int i122 = this.v;
                if (i122 != 0) {
                    if (i122 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                k4 k4Var = (k4) this.f21619w;
                String str7 = ((t1) ((Ref$ObjectRef) obj3).f186409a).e.f100440a;
                this.v = 1;
                Object objZ = vkm.q.z(mo3.a.g(new j0(k4Var.f114024c.e(str7, w4l.i.f294643c), 23), null, new dee.a0(i6), 1), this);
                return objZ == aVar48 ? aVar48 : objZ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(oki.h hVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f21620x = hVar;
    }
}
