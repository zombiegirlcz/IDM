package k2e;

import ael.d0;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.GroupTransactionsScreenContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection.PaymentsGroupsBillsSelectionFlowContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.GroupDetailsFlowContract$InputData;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.fee.FeeBreakdownScreenContract$InputData;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction_price_description.TransactionPriceDescriptionScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f180506b;

    public /* synthetic */ g(Object obj2, int i) {
        this.f180505a = i;
        this.f180506b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f180505a) {
            case 0:
                w2e.j jVar = new w2e.j();
                j jVar2 = (j) this.f180506b;
                return new w2e.i(jVar, jVar2.e(), (g2e.b) jVar2.z.get());
            case 1:
                k36.a aVar = (k36.a) this.f180506b;
                return new emi.g(aVar.f180619a, aVar.f180620b, aVar.f180621c, aVar.d, aVar.e, 7);
            case 2:
                ImmutableSet immutableSetA = ((a2d.j) ((k3d.c) this.f180506b).f180701a).a();
                vc.s.j(immutableSetA);
                return new m3d.i(immutableSetA);
            case 3:
                k4i.d dVar = (k4i.d) this.f180506b;
                FeeBreakdownScreenContract$InputData feeBreakdownScreenContract$InputData = dVar.f180917a;
                k4i.c cVar = dVar.f180918b;
                u4i.c cVar2 = new u4i.c(feeBreakdownScreenContract$InputData, cVar.d.a(), cVar.f180916j.e(), cVar.f180914g.d());
                l4i.a amountConverter = new l4i.a();
                Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
                return new u4i.t(feeBreakdownScreenContract$InputData, cVar2, new u4i.v(feeBreakdownScreenContract$InputData, new u4i.e()));
            case 4:
                k4i.f fVar = (k4i.f) this.f180506b;
                TransactionPriceDescriptionScreenContract$InputData transactionPriceDescriptionScreenContract$InputData = fVar.f180923a;
                d0 d0VarK = fVar.f180924b.e.k();
                vc.s.j(d0VarK);
                return new a5i.p(transactionPriceDescriptionScreenContract$InputData, new a5i.c(transactionPriceDescriptionScreenContract$InputData, d0VarK), new a5i.r(transactionPriceDescriptionScreenContract$InputData, new a5i.b()));
            case 5:
                k51.c cVar3 = (k51.c) this.f180506b;
                return new k51.e(cVar3.f181343a, cVar3.f181344b, cVar3.f181345c, cVar3.d, cVar3.e, cVar3.f, cVar3.f181346g, cVar3.f181347h, cVar3.i, cVar3.f181348j, cVar3.k, cVar3.f181349l, cVar3.f181350m, cVar3.o, cVar3.f181352p, cVar3.f181353q, cVar3.f181354r, cVar3.f181355s, cVar3.f181356t, cVar3.u, cVar3.v, cVar3.f181357w, cVar3.f181358x, cVar3.f181359y, cVar3.z, cVar3.A, cVar3.B, cVar3.f181351n);
            case 6:
                k5h.a aVar2 = (k5h.a) this.f180506b;
                return new ajf.d(aVar2.f181505a, aVar2.f181506b, aVar2.f181507c, aVar2.d, aVar2.e, 14);
            case 7:
                mwa.b bVar = (mwa.b) ((k5j.b) this.f180506b).f181514a.f292676n.get();
                vc.s.j(bVar);
                return new n5j.i(bVar);
            case 8:
                return new z78.g(new z78.h(((k78.a) this.f180506b).f181849a));
            case 9:
                kb2.a aVar3 = (kb2.a) this.f180506b;
                return new fdk.j(aVar3.f182501a, aVar3.f182502b, aVar3.f182503c, aVar3.d, aVar3.e, aVar3.f, aVar3.f182504g, aVar3.f182505h, aVar3.i, aVar3.f182506j, aVar3.k, aVar3.f182507l, aVar3.f182508m);
            case 10:
                return new a7d.a(((kdb.a) this.f180506b).f182864a, 27);
            case 11:
                kf0.d dVar2 = (kf0.d) this.f180506b;
                return new uie.c(dVar2.f183265a, dVar2.f183266b, 2);
            case 12:
                kgi.a aVar4 = (kgi.a) this.f180506b;
                wsg.n nVarB = aVar4.f184003a.b();
                go3.b bVarA = aVar4.f184004b.a();
                vc.s.j(bVarA);
                x71.e eVar = (x71.e) ((bjf.a) aVar4.f184005c).f15626n0.get();
                vc.s.j(eVar);
                gq.f fVar2 = (gq.f) aVar4.d.o.get();
                vc.s.j(fVar2);
                CoroutineScope coroutineScopeA = aVar4.e.a();
                vc.s.j(coroutineScopeA);
                return new jgi.d(nVarB, bVarA, eVar, fVar2, coroutineScopeA);
            case 13:
                kgi.b bVar2 = (kgi.b) this.f180506b;
                return new bo9.d(bVar2.f184006a, bVar2.f184007b, bVar2.f184008c, bVar2.d, bVar2.e, bVar2.f, 9);
            case 14:
                kh1.a aVar5 = (kh1.a) this.f180506b;
                return new ee6.f(aVar5.f184030a, aVar5.f184031b, aVar5.f184032c, aVar5.d, aVar5.e, aVar5.f, aVar5.f184033g, aVar5.f184034h, aVar5.i, 6);
            case 15:
                kjf.b bVar3 = (kjf.b) this.f180506b;
                return new ajf.d(bVar3.f184404a, bVar3.f184405b, bVar3.f184406c, bVar3.d, bVar3.e, 13);
            case 16:
                return new com.revolut.feature.payinstore.impl.ui.flow.a(((kn9.b) this.f180506b).f186041a);
            case 17:
                kr9.g gVar = (kr9.g) this.f180506b;
                GroupDetailsFlowContract$InputData groupDetailsFlowContract$InputData = gVar.f188741a;
                zr9.d dVar3 = new zr9.d();
                kr9.l lVar = gVar.f188742b;
                mq9.f fVarC = lVar.f188757b.c();
                vc.s.j(fVarC);
                com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.f fVar3 = new com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.f(fVarC);
                v60.e eVarA = lVar.E.a();
                vc.s.j(eVarA);
                sf0.h hVarB = lVar.f188769t.b();
                vc.s.j(hVarB);
                return new com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.e(groupDetailsFlowContract$InputData, dVar3, fVar3, new mt9.e(hVarB, eVarA));
            case 18:
                kr9.h hVar = (kr9.h) this.f180506b;
                kr9.l lVar2 = hVar.f188745b;
                mq9.f fVarC2 = lVar2.f188757b.c();
                vc.s.j(fVarC2);
                sr9.c moneySplitMapper = new sr9.c();
                sr9.b lineItemMapper = new sr9.b();
                Intrinsics.checkNotNullParameter(moneySplitMapper, "moneySplitMapper");
                Intrinsics.checkNotNullParameter(lineItemMapper, "lineItemMapper");
                r10.t tVar = new r10.t(fVarC2, new sr9.d());
                kp9.a aVar6 = new kp9.a();
                gte.a aVarB = lVar2.f188768s.b();
                vc.s.j(aVarB);
                return new com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.b(tVar, aVar6, new ys9.a(aVarB), hVar.f188744a);
            case 19:
                kr9.i iVar = (kr9.i) this.f180506b;
                PaymentsGroupsBillsSelectionFlowContract$InputData paymentsGroupsBillsSelectionFlowContract$InputData = iVar.f188747a;
                kr9.l lVar3 = iVar.f188748b;
                mq9.f fVarC3 = lVar3.f188757b.c();
                vc.s.j(fVarC3);
                return new com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection.b(paymentsGroupsBillsSelectionFlowContract$InputData, new ryc.a(fVarC3, lVar3.f188763m.e(), new sr9.a(new sr9.c(), new sr9.b())), new kp9.a());
            case 20:
                kr9.j jVar3 = (kr9.j) this.f180506b;
                kr9.l lVar4 = jVar3.f188751b;
                mq9.f fVarC4 = lVar4.f188757b.c();
                vc.s.j(fVarC4);
                return new com.revolut.feature.payments.groups.impl.ui_new.flow.bills_split.a(new ryc.a(fVarC4, lVar4.f188763m.e(), new sr9.a(new sr9.c(), new sr9.b())), new kp9.a(), jVar3.f188750a);
            case 21:
                return new lt9.d(((kr9.k) this.f180506b).f188753a, new ln3.b());
            case 22:
                kr9.t tVar2 = (kr9.t) this.f180506b;
                GroupTransactionsScreenContract$InputData groupTransactionsScreenContract$InputData = tVar2.f188797a;
                kr9.l lVar5 = tVar2.f188798b;
                jr9.b bVar4 = lVar5.f188757b;
                mq9.f fVarC5 = bVar4.c();
                vc.s.j(fVarC5);
                mq9.f fVarC6 = bVar4.c();
                vc.s.j(fVarC6);
                mr9.d dVarD = bVar4.d();
                vc.s.j(dVarD);
                xmg.a aVar7 = lVar5.f188763m;
                ps9.c cVar4 = new ps9.c(fVarC5, new jt0.b(fVarC6, dVarD, aVar7.e()), aVar7.e());
                jr9.a aVar8 = lVar5.f188765p;
                nq9.a aVarA = aVar8.a();
                vc.s.j(aVarA);
                nq9.d dVar4 = (nq9.d) aVar8.f177951g.get();
                vc.s.j(dVar4);
                return new com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.a(groupTransactionsScreenContract$InputData, cVar4, new kxk.o(groupTransactionsScreenContract$InputData, new com.revolut.feature.payments.groups.impl.mappers.transactions.a(aVarA, dVar4)));
            case 23:
                krb.a aVar9 = (krb.a) this.f180506b;
                return new eya.r(aVar9.f188833a, aVar9.f188834b, aVar9.f188835c, aVar9.d, aVar9.e, aVar9.f, aVar9.f188836g, aVar9.f188837h, aVar9.i, aVar9.f188838j, aVar9.k, aVar9.f188839l, aVar9.f188840m, 2);
            case 24:
                krb.b bVar5 = (krb.b) this.f180506b;
                return new c3d.d(bVar5.f188842a, bVar5.f188843b, 18);
            case 25:
                return new com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.a(((ku5.l) this.f180506b).f189718a);
            case 26:
                return new nua.h(((kua.a) this.f180506b).f189761a, new nua.g());
            case 27:
                return new com.revolut.feature.recurring_buys.schedule.impl.ui.a(((kua.c) this.f180506b).f189764a, new lua.h());
            case 28:
                eub.a aVarA2 = ((kvb.g) this.f180506b).f190092a.a();
                vc.s.j(aVarA2);
                return new ldi.g(aVarA2, 1);
            default:
                return new a7d.a(((kw5.c) this.f180506b).f190260a, 2);
        }
    }

    public /* synthetic */ g(kr9.l lVar, qji.a aVar, int i) {
        this.f180505a = i;
        this.f180506b = aVar;
    }
}
