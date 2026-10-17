package jm4;

import android.content.Context;
import com.revolut.feature.credit.card.impl.ui.cancellation.skip.SkipRepaymentConfirmationDialogScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.fee_waiver.FeeWaiverBottomDialogScreenContract$InputData;
import com.revolut.feature.wealth_discovery.impl.screener.screens.sorting_picker.ScreenerSortingPickerScreenContract$Input;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f176214b;

    public /* synthetic */ n1(Object obj2, int i) {
        this.f176213a = i;
        this.f176214b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f176213a) {
            case 0:
                return new com.revolut.feature.credit.card.impl.ui.limit_hub.flow.a(((o1) this.f176214b).f176226a);
            case 1:
                r rVar = ((a3) this.f176214b).f175965b;
                al4.q qVarA = rVar.a();
                al4.n nVarS = rVar.s();
                vc.s.j(nVarS);
                return new wt4.n(qVarA, nVarS, new wt4.o());
            case 2:
                return new com.revolut.feature.credit.card.impl.ui.repay.pse.flow.a(((v1) this.f176214b).f176395a);
            case 3:
                return new com.revolut.feature.credit.card.impl.ui.repay.boleto.flow.a(((x1) this.f176214b).f176432a);
            case 4:
                return new com.revolut.feature.credit.card.impl.ui.instalment.repay.custom_amount.a(((y1) this.f176214b).f176445a);
            case 5:
                return new com.revolut.feature.credit.card.impl.ui.instalment.repay.future_instalments.a(((a2) this.f176214b).f175960a);
            case 6:
                return new com.revolut.feature.credit.card.impl.ui.repay_with_review.flow.a(((e2) this.f176214b).f176054a);
            case 7:
                return new com.revolut.feature.credit.card.impl.ui.settings.flow.a(((j2) this.f176214b).f176152a);
            case 8:
                return new com.revolut.feature.credit.card.impl.ui.statement_details.flow.a(((n2) this.f176214b).f176215a);
            case 9:
                return new com.revolut.feature.credit.card.impl.ui.statement_financing.flow.a(((r2) this.f176214b).f176312a);
            case 10:
                return new com.revolut.feature.credit.card.impl.ui.statement.flow.a(((t2) this.f176214b).f176365a);
            case 11:
                return new com.revolut.feature.credit.card.impl.ui.statement.transactions.flow.a(((z2) this.f176214b).f176468a);
            case 12:
                h3 h3Var = (h3) this.f176214b;
                FeeWaiverBottomDialogScreenContract$InputData feeWaiverBottomDialogScreenContract$InputData = h3Var.f176107a;
                egk.e eVarE = h3Var.f176108b.K.e();
                vc.s.j(eVarE);
                return new qr4.e(feeWaiverBottomDialogScreenContract$InputData, new qr4.f(eVarE));
            case 13:
                SkipRepaymentConfirmationDialogScreenContract$InputData skipRepaymentConfirmationDialogScreenContract$InputData = ((p3) this.f176214b).f176252a;
                iq4.h localizationProvider = new iq4.h();
                Intrinsics.checkNotNullParameter(localizationProvider, "localizationProvider");
                return new iq4.f(skipRepaymentConfirmationDialogScreenContract$InputData, new iq4.g());
            case 14:
                return new iqh.o(((joh.o) this.f176214b).f177035a, new i3g.k(new zph.p(new zph.j(new zph.a(), new zph.h(), new zph.e(), new zph.g()), new zph.t())));
            case 15:
                return new com.revolut.feature.wealth_discovery.impl.screener.flows.filters.a(((joh.p) this.f176214b).f177037a);
            case 16:
                return new com.revolut.feature.wealth_discovery.impl.screener.flows.new_collection.a(((joh.r) this.f176214b).f177052a);
            case 17:
                return new com.revolut.feature.wealth_discovery.impl.screener.flows.screener.a(((joh.t) this.f176214b).f177058a);
            case 18:
                joh.u uVar = (joh.u) this.f176214b;
                ScreenerSortingPickerScreenContract$Input screenerSortingPickerScreenContract$Input = uVar.f177061a;
                return new pqh.n(screenerSortingPickerScreenContract$Input, new pqh.k(screenerSortingPickerScreenContract$Input, uVar.f177062b.h()));
            case 19:
                return new com.revolut.feature.wealth_discovery.impl.screener.flows.view_collection.a(((joh.x) this.f176214b).f177074a);
            case 20:
                jok.a aVar = (jok.a) this.f176214b;
                Context context = aVar.f177147b.f177157b.f;
                qok.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return new rok.h(new com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.benefits.a(new f01.c(context)), aVar.f177146a);
            case 21:
                return new uok.f(new uok.h(), ((jok.b) this.f176214b).f177149a);
            case 22:
                jp.b bVar = (jp.b) this.f176214b;
                return new c3d.d(bVar.f177174a, bVar.f177175b, 12);
            case 23:
                jpj.c cVar = (jpj.c) this.f176214b;
                return new com.revolut.retail.feature.freelancer.revolut_shop.impl.ui.flow.a(cVar.f177297a, cVar.f177298b);
            case 24:
                return new u5k.d(((jqa.e) this.f176214b).f177556y.a());
            case 25:
                jr9.d dVar = (jr9.d) this.f176214b;
                return new a2d.m(dVar.f177978a, dVar.f177979b, dVar.f177980c, 14);
            case 26:
                return new a7d.a(((js8.b) this.f176214b).f178159a, 20);
            case 27:
                ju5.b bVar2 = (ju5.b) this.f176214b;
                return new ku5.a(bVar2.f178599a, bVar2.f178600b, bVar2.f178601c, bVar2.d, bVar2.e, bVar2.f, bVar2.f178602g, bVar2.f178603h, bVar2.i, bVar2.f178604j, bVar2.k, bVar2.f178605l, bVar2.f178606m, bVar2.f178607n, bVar2.o, bVar2.f178608p, bVar2.f178609q, bVar2.f178610r, 0);
            case 28:
                jxd.c cVar2 = (jxd.c) this.f176214b;
                je6.h hVarC = ((xf6.t) cVar2.f179143b.f179155h).c();
                vc.s.j(hVarC);
                return new uxd.h(new uxd.g(hVarC, cVar2.f179142a));
            default:
                return new c1g.v(((k2e.a) this.f176214b).b());
        }
    }
}
