package b6b;

import afj.y3;
import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.checkout.impl.resume.flow.ResumeCheckoutFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.TaxHubTransactionExportFlowContract$InputData;
import com.revolut.feature.insurance_credit.impl.ui.screen.cancellation_confirmation.CancellationConfirmationScreenContract$InputData;
import com.revolut.feature.insurance_credit.impl.ui.screen.contact.ContactScreenContract$InputData;
import com.revolut.feature.payment.counterparty.impl.screen.profile.CounterPartyDetailsScreenContract$InputData;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.plan_hub.CobrandedCardsPlanHubFlowContract$InputData;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.post_activation.CobrandedCardsPostActivationFlowContract$InputData;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_type.CobrandedCardsTypeSelectionScreenContract$InputData;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.CobrandedCardsPlanHubRewardsScreenContract$InputData;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_info.CobrandedCardsPlanHubRewardInfoSubtitleClauseMapper;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_selection.CobrandedCardsPlanHubRewardSelectionScreenContract$InputData;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.details.CobrandedCardsPlanHubTransactionDetailsScreenContract$InputData;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.CobrandedCardsValueReminderScreenContract$InputData;
import com.revolut.feature.retail.goals.impl.ui.GoalsControllerContract$InputData;
import com.revolut.feature.revolutpay.shipping.api.navigation.ShippingContactsScreenDescriptor$InputData;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import et6.s3;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;
import qgk.g3;
import rp0.g1;
import rp0.x0;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12641c;
    public final Object d;

    public /* synthetic */ m(Object obj2, Object obj3, int i, int i2) {
        this.f12639a = i2;
        this.f12640b = obj2;
        this.d = obj3;
        this.f12641c = i;
    }

    private final Object a() {
        bo9.b bVar = (bo9.b) this.d;
        bo9.c cVar = (bo9.c) this.f12640b;
        bo9.a aVar = cVar.d;
        int i = this.f12641c;
        if (i == 0) {
            d2a.a model = (d2a.a) bVar.f17344c.get();
            go9.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(model, "model");
            vc.s.k(model);
            return model;
        }
        if (i == 1) {
            p2a.a factory = cVar.f17345a.a();
            vc.s.j(factory);
            go9.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(factory, "factory");
            return factory.a();
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        CounterPartyDetailsScreenContract$InputData counterPartyDetailsScreenContract$InputData = bVar.f17342a;
        whf.b bVarA = cVar.f17346b.a();
        vc.s.j(bVarA);
        zof.f fVarD = cVar.f17347c.d();
        vc.s.j(fVarD);
        co9.b bVarB = aVar.b();
        vc.s.j(bVarB);
        r10.a aVar2 = new r10.a(new b6k.f(cVar.e.b(), cVar.f.a(), new j9l.a()), new b6k.d());
        un9.a aVarD = aVar.d();
        vc.s.j(aVarD);
        d2a.a aVar3 = (d2a.a) bVar.f17344c.get();
        b6k.c cVar2 = new b6k.c();
        bo9.c cVar3 = bVar.f17343b;
        r2a.b bVar2 = new r2a.b();
        whf.n nVarB = cVar3.f17346b.b();
        vc.s.j(nVarB);
        return new com.revolut.feature.payment.counterparty.impl.screen.profile.a(counterPartyDetailsScreenContract$InputData, bVarA, fVarD, bVarB, aVar2, aVarD, aVar3, new fo9.t(cVar2, bVar2, nVarB));
    }

    private final Object b() {
        bt6.y yVar = (bt6.y) this.d;
        bt6.b bVar = (bt6.b) this.f12640b;
        int i = this.f12641c;
        if (i == 0) {
            TaxHubTransactionExportFlowContract$InputData taxHubTransactionExportFlowContract$InputData = yVar.f18396a;
            zxd.c cVarA = ((eyd.b) bVar.f18303p).a();
            vc.s.j(cVarA);
            return new com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.c(taxHubTransactionExportFlowContract$InputData, cVarA, new m47.a(), bVar.f18301m.e());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        Context context = bVar.f18298h;
        bt6.b bVar2 = yVar.f18397b;
        gr6.m mVarB = bVar2.f18302n.b();
        vc.s.j(mVarB);
        ppk.f fVarA = bVar2.f18304q.a();
        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) bVar2.f18305r).c();
        vc.s.j(aVarC);
        wsg.n nVarB = bVar2.f18306s.b();
        qy5.a factory = new qy5.a(mVarB, fVarA, aVarC, nVarB);
        l47.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(factory, "factory");
        phm.a aVar = (phm.a) j6.a.i(context, djf.c.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(a0.d.q("Api ", djf.c.class, " is not found"));
        }
        whf.b transactionContentProvider = ((djf.c) aVar2.b()).a();
        Intrinsics.checkNotNullParameter(transactionContentProvider, "transactionContentProvider");
        return new s3(mVarB, fVarA, aVarC, transactionContentProvider, nVarB);
    }

    private final Object c() {
        int i = this.f12641c;
        if (i == 0) {
            return new t27.r(((bt6.b) this.f12640b).e(), (cli.n) ((bt6.c0) this.d).f18317b.get());
        }
        if (i == 1) {
            return new t27.u(new fw6.a());
        }
        throw new AssertionError(i);
    }

    private final Object d() {
        bt7.b bVar = (bt7.b) this.d;
        CancellationConfirmationScreenContract$InputData cancellationConfirmationScreenContract$InputData = bVar.f18404a;
        int i = this.f12641c;
        if (i == 0) {
            return new jt7.h(cancellationConfirmationScreenContract$InputData, (cli.n) bVar.f18405b.get());
        }
        if (i == 1) {
            return new jt7.k(cancellationConfirmationScreenContract$InputData, ((bt7.i) this.f12640b).f18428h.g());
        }
        throw new AssertionError(i);
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f12639a) {
            case 0:
                o oVar = (o) this.f12640b;
                n nVar = (n) this.d;
                int i = this.f12641c;
                if (i != 0) {
                    if (i == 1) {
                        return new kxk.o(new z6b.a(new c7b.a(nVar.f12644a.d.g(), 0)), new r6b.a(new nd7.d(new nd7.c())));
                    }
                    throw new AssertionError(i);
                }
                cli.n nVar2 = (cli.n) nVar.f12645b.get();
                c6b.b bVar = (c6b.b) oVar.f12651b.P.get();
                vc.s.j(bVar);
                return new y6b.k(nVar2, bVar, ((s41.a) oVar.f12653g).d());
            case 1:
                o oVar2 = (o) this.f12640b;
                g3 g3Var = oVar2.f12650a;
                p pVar = (p) this.d;
                agk.a aVar = pVar.f12656a;
                int i2 = this.f12641c;
                switch (i2) {
                    case 0:
                        return agk.b.B(aVar, (zfk.c) pVar.f12660h.get(), (xfk.b) pVar.e.get(), (bgk.a) pVar.f.get(), (wfk.a) pVar.f12659g.get(), (bgk.a) pVar.i.get());
                    case 1:
                        mhk.a aVarC = g3Var.c();
                        vc.s.j(aVarC);
                        return y3.C(aVar, aVarC, (xfk.b) pVar.e.get(), (bgk.a) pVar.f.get(), (wfk.a) pVar.f12659g.get());
                    case 2:
                        fhk.a aVarB = g3Var.b();
                        vc.s.j(aVarB);
                        return y3.b(aVar, aVarB);
                    case 3:
                        ohk.a aVarD = g3Var.d();
                        vc.s.j(aVarD);
                        return y3.D(aVar, aVarD);
                    case 4:
                        dhk.a aVarA = g3Var.a();
                        vc.s.j(aVarA);
                        return y3.z(aVar, aVarA);
                    case 5:
                        ohk.a aVarD2 = g3Var.d();
                        vc.s.j(aVarD2);
                        return agk.b.y(aVar, aVarD2);
                    case 6:
                        return new com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.order_card.a(pVar.f12657b, new e6b.b(), (qh3.c) pVar.k.get());
                    case 7:
                        wh3.a provider = oVar2.f12652c.a();
                        vc.s.j(provider);
                        zfk.c planSubscriberControllerModelExtension = (zfk.c) pVar.f12660h.get();
                        i6b.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider, "provider");
                        Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension, "planSubscriberControllerModelExtension");
                        return provider.a(planSubscriberControllerModelExtension);
                    case 8:
                        qh3.c extension = (qh3.c) pVar.k.get();
                        i6b.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        vc.s.k(extension);
                        return extension;
                    default:
                        throw new AssertionError(i2);
                }
            case 2:
                q qVar = (q) this.d;
                int i3 = this.f12641c;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new AssertionError(i3);
                    }
                    k6b.a headerStateMapper = new k6b.a();
                    Intrinsics.checkNotNullParameter(headerStateMapper, "headerStateMapper");
                    return new j6b.l();
                }
                cli.n nVar3 = (cli.n) qVar.d.get();
                CobrandedCardsPlanHubFlowContract$InputData cobrandedCardsPlanHubFlowContract$InputData = qVar.f12664a;
                q5b.b bVarB = ((o) this.f12640b).f12651b.b();
                vc.s.j(bVarB);
                return new j6b.j(nVar3, cobrandedCardsPlanHubFlowContract$InputData, bVarB);
            case 3:
                r rVar = (r) this.d;
                int i5 = this.f12641c;
                if (i5 == 0) {
                    return new com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_info.c((cli.n) rVar.f12669c.get(), ((s41.a) ((o) this.f12640b).f12653g).d());
                }
                if (i5 == 1) {
                    return new m7b.g(rVar.f12667a, new CobrandedCardsPlanHubRewardInfoSubtitleClauseMapper(), new c7b.a(rVar.f12668b.d.g(), 0));
                }
                throw new AssertionError(i5);
            case 4:
                s sVar = (s) this.d;
                int i6 = this.f12641c;
                if (i6 != 0) {
                    if (i6 == 1) {
                        return new o7b.i();
                    }
                    throw new AssertionError(i6);
                }
                cli.n nVar4 = (cli.n) sVar.f12671b.get();
                CobrandedCardsPlanHubRewardSelectionScreenContract$InputData cobrandedCardsPlanHubRewardSelectionScreenContract$InputData = sVar.f12670a;
                q5b.b bVarB2 = ((o) this.f12640b).f12651b.b();
                vc.s.j(bVarB2);
                return new o7b.h(nVar4, cobrandedCardsPlanHubRewardSelectionScreenContract$InputData, bVarB2);
            case 5:
                t tVar = (t) this.d;
                int i21 = this.f12641c;
                if (i21 != 0) {
                    if (i21 == 1) {
                        return new i3g.k(new l7b.b(new i7b.g(new c7b.a(tVar.f12674b.d.g(), 0))));
                    }
                    throw new AssertionError(i21);
                }
                cli.n nVar5 = (cli.n) tVar.f12675c.get();
                CobrandedCardsPlanHubRewardsScreenContract$InputData cobrandedCardsPlanHubRewardsScreenContract$InputData = tVar.f12673a;
                q5b.b bVarB3 = ((o) this.f12640b).f12651b.b();
                vc.s.j(bVarB3);
                return new com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.a(nVar5, cobrandedCardsPlanHubRewardsScreenContract$InputData, bVarB3);
            case 6:
                o oVar3 = (o) this.f12640b;
                u uVar = (u) this.d;
                CobrandedCardsPlanHubTransactionDetailsScreenContract$InputData cobrandedCardsPlanHubTransactionDetailsScreenContract$InputData = uVar.f12676a;
                o oVar4 = uVar.f12677b;
                int i22 = this.f12641c;
                if (i22 == 0) {
                    cli.n nVar6 = (cli.n) uVar.f12678c.get();
                    wli.x xVarD = ((s41.a) oVar3.f12653g).d();
                    sfk.a aVarE = oVar3.i.e();
                    vc.s.j(aVarE);
                    whf.b bVarA = oVar3.f12654h.a();
                    vc.s.j(bVarA);
                    return new r7b.l(nVar6, cobrandedCardsPlanHubTransactionDetailsScreenContract$InputData, xVarD, aVarE, bVarA);
                }
                if (i22 != 1) {
                    throw new AssertionError(i22);
                }
                thf.c cVarC = oVar4.f12654h.c();
                vc.s.j(cVarC);
                v7b.b bVar2 = new v7b.b(cVarC);
                whf.n nVarB = oVar4.f12654h.b();
                vc.s.j(nVarB);
                return new r7b.m(cobrandedCardsPlanHubTransactionDetailsScreenContract$InputData, bVar2, new t7b.a(nVarB), new i7b.m(new c7b.a(oVar4.d.g(), 0)));
            case 7:
                o oVar5 = (o) this.f12640b;
                v vVar = (v) this.d;
                o oVar6 = vVar.f12679a;
                int i32 = this.f12641c;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new AssertionError(i32);
                    }
                    v7b.f fVar = new v7b.f();
                    thf.c cVarC2 = oVar6.f12654h.c();
                    vc.s.j(cVarC2);
                    return new i3g.k(fVar, new v7b.e(new v7b.b(cVarC2), new v7b.a(oVar6.d.g(), new v7b.h())));
                }
                cli.n nVar7 = (cli.n) vVar.f12680b.get();
                q5b.b bVarB4 = oVar5.f12651b.b();
                vc.s.j(bVarB4);
                c6b.k kVar = (c6b.k) oVar6.f12651b.M.get();
                vc.s.j(kVar);
                bbd.c cVar = new bbd.c(kVar);
                sfk.a aVarE2 = oVar5.i.e();
                vc.s.j(aVarE2);
                return new com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.a(nVar7, bVarB4, cVar, aVarE2);
            case 8:
                o oVar7 = (o) this.f12640b;
                w wVar = (w) this.d;
                int i33 = this.f12641c;
                switch (i33) {
                    case 0:
                        return agk.b.B(wVar.f12682a, (zfk.c) wVar.f12685g.get(), (xfk.b) wVar.d.get(), (bgk.a) wVar.e.get(), (wfk.a) wVar.f.get(), (bgk.a) wVar.f12686h.get());
                    case 1:
                        agk.a aVar2 = wVar.f12682a;
                        mhk.a aVarC2 = oVar7.f12650a.c();
                        vc.s.j(aVarC2);
                        return y3.C(aVar2, aVarC2, (xfk.b) wVar.d.get(), (bgk.a) wVar.e.get(), (wfk.a) wVar.f.get());
                    case 2:
                        agk.a aVar3 = wVar.f12682a;
                        fhk.a aVarB2 = oVar7.f12650a.b();
                        vc.s.j(aVarB2);
                        return y3.b(aVar3, aVarB2);
                    case 3:
                        agk.a aVar4 = wVar.f12682a;
                        ohk.a aVarD3 = oVar7.f12650a.d();
                        vc.s.j(aVarD3);
                        return y3.D(aVar4, aVarD3);
                    case 4:
                        agk.a aVar5 = wVar.f12682a;
                        dhk.a aVarA2 = oVar7.f12650a.a();
                        vc.s.j(aVarA2);
                        return y3.z(aVar5, aVarA2);
                    case 5:
                        agk.a aVar6 = wVar.f12682a;
                        ohk.a aVarD4 = oVar7.f12650a.d();
                        vc.s.j(aVarD4);
                        return agk.b.y(aVar6, aVarD4);
                    case 6:
                        return new com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.plan_switch.a((qh3.c) wVar.f12687j.get(), new e6b.b());
                    case 7:
                        wh3.a provider2 = oVar7.f12652c.a();
                        vc.s.j(provider2);
                        zfk.c planSubscriberControllerModelExtension2 = (zfk.c) wVar.f12685g.get();
                        m6b.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider2, "provider");
                        Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension2, "planSubscriberControllerModelExtension");
                        return provider2.a(planSubscriberControllerModelExtension2);
                    case 8:
                        qh3.c extension2 = (qh3.c) wVar.f12687j.get();
                        m6b.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        vc.s.k(extension2);
                        return extension2;
                    case 9:
                        q5b.b bVarB5 = oVar7.f12651b.b();
                        vc.s.j(bVarB5);
                        return new l6b.i(bVarB5, 0);
                    case 10:
                        return new l6b.h(wVar.s());
                    default:
                        throw new AssertionError(i33);
                }
            case 9:
                o oVar8 = (o) this.f12640b;
                x xVar = (x) this.d;
                int i43 = this.f12641c;
                switch (i43) {
                    case 0:
                        return agk.b.B(xVar.f12691a, (zfk.c) xVar.f12695h.get(), (xfk.b) xVar.e.get(), (bgk.a) xVar.f.get(), (wfk.a) xVar.f12694g.get(), (bgk.a) xVar.i.get());
                    case 1:
                        agk.a aVar7 = xVar.f12691a;
                        mhk.a aVarC3 = oVar8.f12650a.c();
                        vc.s.j(aVarC3);
                        return y3.C(aVar7, aVarC3, (xfk.b) xVar.e.get(), (bgk.a) xVar.f.get(), (wfk.a) xVar.f12694g.get());
                    case 2:
                        agk.a aVar8 = xVar.f12691a;
                        fhk.a aVarB3 = oVar8.f12650a.b();
                        vc.s.j(aVarB3);
                        return y3.b(aVar8, aVarB3);
                    case 3:
                        agk.a aVar9 = xVar.f12691a;
                        ohk.a aVarD5 = oVar8.f12650a.d();
                        vc.s.j(aVarD5);
                        return y3.D(aVar9, aVarD5);
                    case 4:
                        agk.a aVar10 = xVar.f12691a;
                        dhk.a aVarA3 = oVar8.f12650a.a();
                        vc.s.j(aVarA3);
                        return y3.z(aVar10, aVarA3);
                    case 5:
                        agk.a aVar11 = xVar.f12691a;
                        ohk.a aVarD6 = oVar8.f12650a.d();
                        vc.s.j(aVarD6);
                        return agk.b.y(aVar11, aVarD6);
                    case 6:
                        CobrandedCardsPostActivationFlowContract$InputData cobrandedCardsPostActivationFlowContract$InputData = xVar.f12692b;
                        q5b.b bVarB6 = oVar8.f12651b.b();
                        vc.s.j(bVarB6);
                        return new com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.post_activation.b(cobrandedCardsPostActivationFlowContract$InputData, bVarB6, (qh3.c) xVar.k.get(), new e6b.b());
                    case 7:
                        wh3.a provider3 = oVar8.f12652c.a();
                        vc.s.j(provider3);
                        zfk.c planSubscriberControllerModelExtension3 = (zfk.c) xVar.f12695h.get();
                        o6b.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider3, "provider");
                        Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension3, "planSubscriberControllerModelExtension");
                        return provider3.a(planSubscriberControllerModelExtension3);
                    case 8:
                        qh3.c extension3 = (qh3.c) xVar.k.get();
                        o6b.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        vc.s.k(extension3);
                        return extension3;
                    case 9:
                        q5b.b bVarB7 = oVar8.f12651b.b();
                        vc.s.j(bVarB7);
                        return new l6b.i(bVarB7, 1);
                    case 10:
                        o oVar9 = xVar.f12693c;
                        q5b.b bVarB8 = oVar9.f12651b.b();
                        vc.s.j(bVarB8);
                        return new n6b.h(new r10.f(bVarB8, oVar9.e.a()));
                    default:
                        throw new AssertionError(i43);
                }
            case 10:
                w wVar2 = (w) this.f12640b;
                a0 a0Var = (a0) this.d;
                int i59 = this.f12641c;
                if (i59 == 0) {
                    return new c7b.t((cli.n) a0Var.f.get(), a0Var.f12561b, (l6b.i) wVar2.f12689m.get(), (c7b.o) wVar2.f12690n.get());
                }
                if (i59 == 1) {
                    return new a3e.u(new c7b.r(new c7b.a(a0Var.f12562c.d.g(), 0), (c90.c) a0Var.e.get()));
                }
                if (i59 != 2) {
                    throw new AssertionError(i59);
                }
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) a0Var.d.get();
                d7b.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new c90.c(controller.m2());
            case 11:
                c0 c0Var = (c0) this.d;
                int i66 = this.f12641c;
                if (i66 == 0) {
                    return new e7b.h((cli.n) c0Var.f12573c.get(), c0Var.f12572b, ((w) this.f12640b).s());
                }
                if (i66 == 1) {
                    return new e7b.i();
                }
                throw new AssertionError(i66);
            case 12:
                x xVar2 = (x) this.f12640b;
                a0 a0Var2 = (a0) this.d;
                int i74 = this.f12641c;
                if (i74 == 0) {
                    return new c7b.t((cli.n) a0Var2.f.get(), a0Var2.f12561b, (l6b.i) xVar2.f12699n.get(), (c7b.o) xVar2.o.get());
                }
                if (i74 == 1) {
                    return new a3e.u(new c7b.r(new c7b.a(a0Var2.f12562c.d.g(), 0), (c90.c) a0Var2.e.get()));
                }
                if (i74 != 2) {
                    throw new AssertionError(i74);
                }
                com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) a0Var2.d.get();
                d7b.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller2, "controller");
                return new c90.c(controller2.m2());
            case 13:
                c0 c0Var2 = (c0) this.d;
                int i92 = this.f12641c;
                if (i92 != 0) {
                    if (i92 == 1) {
                        return new e7b.i();
                    }
                    throw new AssertionError(i92);
                }
                cli.n nVar8 = (cli.n) c0Var2.f12573c.get();
                CobrandedCardsTypeSelectionScreenContract$InputData cobrandedCardsTypeSelectionScreenContract$InputData = c0Var2.f12572b;
                o oVar10 = ((x) this.f12640b).f12693c;
                q5b.b bVarB9 = oVar10.f12651b.b();
                vc.s.j(bVarB9);
                return new e7b.h(nVar8, cobrandedCardsTypeSelectionScreenContract$InputData, new r10.f(bVarB9, oVar10.e.a()));
            case 14:
                o oVar11 = (o) this.f12640b;
                r7d.l lVar = oVar11.f;
                h hVar = oVar11.f12651b;
                f0 f0Var = (f0) this.d;
                int i96 = this.f12641c;
                if (i96 == 0) {
                    return h7d.d.a(f0Var.f12589b, (i7d.o) f0Var.d.get(), lVar.d());
                }
                if (i96 == 1) {
                    return h7d.f.a(lVar.d(), Optional.empty());
                }
                if (i96 != 2) {
                    if (i96 == 3) {
                        return new g7b.x(new i7b.a(f0Var.b()), new i7b.i(new i7b.g(f0Var.b())), new i7b.e(f0Var.b(), new i7b.c(f0Var.b())), new i7b.b(f0Var.b(), new i7b.c(f0Var.b())), new i7b.h(), new i7b.m(f0Var.b()));
                    }
                    throw new AssertionError(i96);
                }
                cli.n nVar9 = (cli.n) f0Var.f.get();
                q5b.b bVarB10 = hVar.b();
                vc.s.j(bVarB10);
                c6b.b bVar3 = (c6b.b) hVar.P.get();
                vc.s.j(bVar3);
                wli.x xVarD2 = ((s41.a) oVar11.f12653g).d();
                g7b.a aVar12 = new g7b.a(f0Var.b());
                i7d.o oVar12 = (i7d.o) f0Var.d.get();
                o oVar13 = f0Var.f12590c;
                q5b.b bVarB11 = oVar13.f12651b.b();
                vc.s.j(bVarB11);
                r10.f fVar2 = new r10.f(bVarB11, oVar13.e.a());
                c6b.c cVar2 = (c6b.c) hVar.T.get();
                vc.s.j(cVar2);
                return new com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e(nVar9, bVarB10, bVar3, xVarD2, aVar12, oVar12, fVar2, cVar2);
            case 15:
                o oVar14 = (o) this.f12640b;
                r7d.l lVar2 = oVar14.f;
                h hVar2 = oVar14.f12651b;
                f0 f0Var2 = (f0) this.d;
                int i99 = this.f12641c;
                if (i99 == 0) {
                    return h7d.d.a(f0Var2.f12589b, (i7d.o) f0Var2.d.get(), lVar2.d());
                }
                if (i99 == 1) {
                    return h7d.f.a(lVar2.d(), Optional.empty());
                }
                if (i99 != 2) {
                    if (i99 == 3) {
                        return new g7b.x(new i7b.a(f0Var2.b()), new i7b.i(new i7b.g(f0Var2.b())), new i7b.e(f0Var2.b(), new i7b.c(f0Var2.b())), new i7b.b(f0Var2.b(), new i7b.c(f0Var2.b())), new i7b.h(), new i7b.m(f0Var2.b()));
                    }
                    throw new AssertionError(i99);
                }
                cli.n nVar10 = (cli.n) f0Var2.f.get();
                q5b.b bVarB12 = hVar2.b();
                vc.s.j(bVarB12);
                c6b.b bVar4 = (c6b.b) hVar2.P.get();
                vc.s.j(bVar4);
                wli.x xVarD3 = ((s41.a) oVar14.f12653g).d();
                g7b.a aVar13 = new g7b.a(f0Var2.b());
                i7d.o oVar15 = (i7d.o) f0Var2.d.get();
                o oVar16 = f0Var2.f12590c;
                q5b.b bVarB13 = oVar16.f12651b.b();
                vc.s.j(bVarB13);
                r10.f fVar3 = new r10.f(bVarB13, oVar16.e.a());
                c6b.c cVar3 = (c6b.c) hVar2.T.get();
                vc.s.j(cVar3);
                return new com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e(nVar10, bVarB12, bVar4, xVarD3, aVar13, oVar15, fVar3, cVar3);
            case 16:
                h0 h0Var = (h0) this.d;
                o oVar17 = h0Var.f12615b;
                int i100 = this.f12641c;
                if (i100 != 0) {
                    if (i100 == 1) {
                        return new kxk.o(new y7b.a(new c7b.a(oVar17.d.g(), 0), new i7b.g(new c7b.a(oVar17.d.g(), 0))), h0Var.f12614a);
                    }
                    throw new AssertionError(i100);
                }
                CobrandedCardsValueReminderScreenContract$InputData cobrandedCardsValueReminderScreenContract$InputData = h0Var.f12614a;
                cli.n nVar11 = (cli.n) h0Var.f12616c.get();
                c6b.b bVar5 = (c6b.b) ((o) this.f12640b).f12651b.P.get();
                vc.s.j(bVar5);
                q5b.b bVarB14 = oVar17.f12651b.b();
                vc.s.j(bVarB14);
                return new com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c(cobrandedCardsValueReminderScreenContract$InputData, nVar11, bVar5, new r10.f(bVarB14, oVar17.e.a()), new w7b.a());
            case 17:
                bab.a aVar14 = (bab.a) this.f12640b;
                bab.b bVar6 = (bab.b) this.d;
                int i101 = this.f12641c;
                if (i101 == 0) {
                    n60.a aVar15 = (n60.a) bVar6.d.get();
                    o5k.i.l(aVar15);
                    return aVar15;
                }
                if (i101 == 1) {
                    return o5k.i.q((com.revolut.kompot.navigable.a) bVar6.f14010c.get());
                }
                if (i101 != 2) {
                    if (i101 == 3) {
                        return new cab.n(new u80.o(), bVar6.b());
                    }
                    if (i101 != 4) {
                        throw new AssertionError(i101);
                    }
                    dab.b.Companion.getClass();
                    return new cab.o();
                }
                cli.n nVar12 = (cli.n) bVar6.f.get();
                GoalsControllerContract$InputData goalsControllerContract$InputData = bVar6.f14008a;
                ppg.b bVarB15 = ((wpg.l) aVar14.f14006b).b();
                vc.s.j(bVarB15);
                rnb.w wVarB = aVar14.f14007c.b();
                vc.s.j(wVarB);
                return new com.revolut.feature.retail.goals.impl.ui.a(nVar12, goalsControllerContract$InputData, bVarB15, wVarB, bVar6.b(), (cab.o) bVar6.f14011g.get(), (n60.a) bVar6.d.get());
            case 18:
                p7c.r rVar2 = ((bac.b) this.f12640b).f14019h;
                bac.g gVar = (bac.g) this.d;
                int i102 = this.f12641c;
                if (i102 == 0) {
                    s8c.e extension4 = (s8c.e) gVar.f14034c.get();
                    yec.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension4, "extension");
                    vc.s.k(extension4);
                    return extension4;
                }
                if (i102 == 1) {
                    return xhi.f.a(new qr0.i((q7c.s) rVar2.V.get()));
                }
                if (i102 != 2) {
                    throw new AssertionError(i102);
                }
                ShippingContactsScreenDescriptor$InputData shippingContactsScreenDescriptor$InputData = gVar.f14033b;
                q7c.s sVar2 = (q7c.s) rVar2.V.get();
                vc.s.j(sVar2);
                return new com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b(shippingContactsScreenDescriptor$InputData, sVar2, new rec.a(), (s8c.e) gVar.f14034c.get(), new xec.w(new xec.b()));
            case 19:
                bac.i iVar = (bac.i) this.d;
                bac.b bVar7 = (bac.b) this.f12640b;
                p7c.r rVar3 = bVar7.f14019h;
                zxb.k0 k0Var = bVar7.e;
                jcc.e eVar = bVar7.f;
                int i103 = this.f12641c;
                if (i103 != 0) {
                    if (i103 != 1) {
                        throw new AssertionError(i103);
                    }
                    gac.i iVar2 = new gac.i(new gac.d(new dec.g(), new dec.r()), new gac.a(), new cm9.a());
                    gac.j jVar = new gac.j();
                    gte.a aVarB4 = iVar.f14039b.f14015a.b();
                    vc.s.j(aVarB4);
                    return new eac.z(iVar2, jVar, new gac.g(aVarB4), new cm9.a());
                }
                bcc.a aVar16 = (bcc.a) eVar.f172777p.get();
                vc.s.j(aVar16);
                gcc.g gVar2 = (gcc.g) eVar.o.get();
                vc.s.j(gVar2);
                h4g.g gVarB = bVar7.f14018g.b();
                eub.a aVarA4 = k0Var.a();
                vc.s.j(aVarA4);
                eub.i iVarE = k0Var.e();
                vc.s.j(iVarE);
                x9c.d dVarD = bVar7.d();
                q7c.g gVarE = rVar3.e();
                q7c.s sVar3 = (q7c.s) rVar3.V.get();
                vc.s.j(sVar3);
                r10.q qVarE = bVar7.e();
                gte.a aVarB5 = bVar7.f14015a.b();
                vc.s.j(aVarB5);
                return new com.revolut.feature.revolutpay.management.impl.ui.management.home.a(aVar16, gVar2, gVarB, aVarA4, iVarE, dVarD, gVarE, sVar3, qVarE, aVarB5, ((tl9.c) bVar7.i).a(), (cli.n) iVar.f14040c.get());
            case 20:
                bac.i iVar3 = (bac.i) this.d;
                bac.b bVar8 = iVar3.f14039b;
                bac.b bVar9 = (bac.b) this.f12640b;
                int i104 = this.f12641c;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new AssertionError(i104);
                    }
                    gac.d dVar = new gac.d(new dec.g(), new dec.r());
                    gac.a aVar17 = new gac.a();
                    tl9.g gVar3 = bVar8.i;
                    gac.i iVar4 = new gac.i(dVar, aVar17, new cm9.a());
                    gac.j jVar2 = new gac.j();
                    gte.a aVarB6 = bVar8.f14015a.b();
                    vc.s.j(aVarB6);
                    gac.g gVar4 = new gac.g(aVarB6);
                    tl9.g gVar5 = bVar9.i;
                    return new eac.z(iVar4, jVar2, gVar4, new cm9.a());
                }
                jcc.e eVar2 = bVar9.f;
                p7c.r rVar4 = bVar9.f14019h;
                zxb.k0 k0Var2 = bVar9.e;
                bcc.a aVar18 = (bcc.a) eVar2.f172777p.get();
                vc.s.j(aVar18);
                gcc.g gVar6 = (gcc.g) bVar9.f.o.get();
                vc.s.j(gVar6);
                h4g.g gVarB2 = bVar9.f14018g.b();
                eub.a aVarA5 = k0Var2.a();
                vc.s.j(aVarA5);
                eub.i iVarE2 = k0Var2.e();
                vc.s.j(iVarE2);
                x9c.d dVarD2 = bVar9.d();
                q7c.g gVarE2 = rVar4.e();
                q7c.s sVar4 = (q7c.s) rVar4.V.get();
                vc.s.j(sVar4);
                r10.q qVarE2 = bVar9.e();
                gte.a aVarB7 = bVar9.f14015a.b();
                vc.s.j(aVarB7);
                return new com.revolut.feature.revolutpay.management.impl.ui.management.home.a(aVar18, gVar6, gVarB2, aVarA5, iVarE2, dVarD2, gVarE2, sVar4, qVarE2, aVarB7, ((tl9.c) bVar9.i).a(), (cli.n) iVar3.f14040c.get());
            case 21:
                bi3.e eVar3 = (bi3.e) this.f12640b;
                bi3.f fVar4 = (bi3.f) this.d;
                int i105 = this.f12641c;
                if (i105 == 0) {
                    ResumeCheckoutFlowContract$InputData resumeCheckoutFlowContract$InputData = fVar4.f15419a;
                    sh3.a aVarA6 = eVar3.f15414a.a();
                    vc.s.j(aVarA6);
                    mt8.d dVarB = eVar3.f15415b.b();
                    vc.s.j(dVarB);
                    return new com.revolut.feature.checkout.impl.resume.flow.a(resumeCheckoutFlowContract$InputData, aVarA6, dVarB, new ki3.a(), (ki3.g) fVar4.f15421c.get());
                }
                if (i105 != 1) {
                    throw new AssertionError(i105);
                }
                ResumeCheckoutFlowContract$InputData inputData = fVar4.f15419a;
                q89.e onboardingInteractor = eVar3.f15416c.a();
                vc.s.j(onboardingInteractor);
                bi3.e eVar4 = fVar4.f15420b;
                onh.b bVarB16 = eVar4.d.b();
                li0.b bVarC = t2d.c.c(eVar4.e.f271230a);
                f73.c cVar4 = new f73.c();
                mt8.a aVarA7 = eVar4.f15415b.a();
                vc.s.j(aVarA7);
                up3.a aVar19 = (up3.a) eVar4.f.N.get();
                vc.s.j(aVar19);
                vh3.c checkoutNavigationFactory = new vh3.c(bVarB16, bVarC, cVar4, aVarA7, aVar19);
                li3.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
                Intrinsics.checkNotNullParameter(checkoutNavigationFactory, "checkoutNavigationFactory");
                return new ki3.g(inputData.d, inputData.f65836c, onboardingInteractor, checkoutNavigationFactory);
            case 22:
                bj4.b bVar10 = (bj4.b) this.f12640b;
                bj4.a aVar20 = (bj4.a) this.d;
                int i106 = this.f12641c;
                switch (i106) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI = bq.i.i(aVar20.f15548a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar20.f15548a);
                        t70.g gVarO = bVar10.f15557a.o();
                        vc.s.j(gVarO);
                        return new npi.c(contextI, baseDelegatesActivityF, gVarO);
                    case 2:
                        return new tpi.i((rpi.c) aVar20.f.get(), gsi.c.a(aVar20.f15548a));
                    case 3:
                        return new rpi.b(bq.i.b(aVar20.f15548a));
                    case 4:
                        return new rpi.h(bq.i.b(aVar20.f15548a));
                    case 5:
                        return new iri.g((iri.j) bVar10.d.get(), new iri.b(), bq.i.f(aVar20.f15548a), bq.i.l(aVar20.f15548a));
                    case 6:
                        return new iri.l(new iri.b(), bq.i.f(aVar20.f15548a), (iri.d) aVar20.f15553j.get());
                    case 7:
                        return new iri.d(bq.i.f(aVar20.f15548a));
                    case 8:
                        return new opi.b(bq.i.f(aVar20.f15548a));
                    case 9:
                        return new en.c(ImmutableSet.of((ln.d) aVar20.f15550c.e.get()), bq.i.l(aVar20.f15548a));
                    case 10:
                        aj4.d dVar2 = new aj4.d(aVar20.f15549b, (ln.a) bVar10.e.get());
                        kli.a.p(dVar2, bq.i.d(aVar20.f15548a));
                        return dVar2;
                    default:
                        throw new AssertionError(i106);
                }
            case 23:
                return a();
            case 24:
                bt6.b bVar11 = (bt6.b) this.f12640b;
                bt6.j jVar3 = (bt6.j) this.d;
                int i107 = this.f12641c;
                if (i107 == 0) {
                    Object extension5 = (ex6.b) jVar3.d.get();
                    d37.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension5, "extension");
                    yji.n nVar13 = (yji.n) extension5;
                    vc.s.k(nVar13);
                    return nVar13;
                }
                if (i107 != 1) {
                    if (i107 == 2) {
                        return new com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow.b((ex6.b) jVar3.d.get(), bVar11.c(), bVar11.f18301m.e(), jVar3.f18353a);
                    }
                    throw new AssertionError(i107);
                }
                ex6.d extension6 = jVar3.b();
                d37.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension6, "extension");
                return extension6;
            case 25:
                return b();
            case 26:
                int i108 = this.f12641c;
                if (i108 == 0) {
                    return new t27.r(((bt6.b) this.f12640b).e(), (cli.n) ((bt6.c0) this.d).f18317b.get());
                }
                if (i108 == 1) {
                    return new t27.u(new fw6.a());
                }
                throw new AssertionError(i108);
            case 27:
                return c();
            case 28:
                return d();
            default:
                bt7.c cVar5 = (bt7.c) this.d;
                bt7.i iVar5 = cVar5.f18408b;
                int i109 = this.f12641c;
                if (i109 == 0) {
                    cli.n nVar14 = (cli.n) cVar5.f18409c.get();
                    ContactScreenContract$InputData contactScreenContract$InputData = cVar5.f18407a;
                    ys7.h hVar3 = (ys7.h) ((bt7.i) this.f12640b).f18439x.get();
                    c70.a aVarZ = iVar5.i.z();
                    vc.s.j(aVarZ);
                    return new lt7.m(nVar14, contactScreenContract$InputData, hVar3, new tr7.a(aVarZ, (g1) cVar5.e.get()));
                }
                if (i109 == 1) {
                    return new lt7.o(new nt7.b(iVar5.f18428h.g()));
                }
                if (i109 != 2) {
                    throw new AssertionError(i109);
                }
                com.revolut.kompot.navigable.a controller3 = (com.revolut.kompot.navigable.a) cVar5.d.get();
                mt7.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller3, "controller");
                return x0.a(g1.Companion, controller3.D2());
        }
    }
}
