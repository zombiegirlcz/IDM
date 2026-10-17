package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.BrPaymentLimitsUpdateScreenContract$InputData;
import com.revolut.feature.trading_orders.api.invest.placement.locked_period.SecurityAssetBalanceBreakdownScreenDescriptor$InputData;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.date_picker.TravelItineraryDatePickerContract$InputData;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.edit_dates.TravelItineraryEditDatesScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f3 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f304854b;

    public /* synthetic */ f3(Object obj2, int i) {
        this.f304853a = i;
        this.f304854b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f304853a) {
            case 0:
                e3 e3Var = (e3) this.f304854b;
                BrPaymentLimitsUpdateScreenContract$InputData brPaymentLimitsUpdateScreenContract$InputData = e3Var.f304839b;
                u80.o oVar = new u80.o();
                w80.b bVarJ = ((w2) e3Var.f304840c).e.j();
                vc.s.j(bVarJ);
                return new com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.a(brPaymentLimitsUpdateScreenContract$InputData, new wj6.h(oVar, bVarJ, new com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.tracking.a()));
            case 1:
                return new add.b(((xi2.a) this.f304854b).f306297a, 16);
            case 2:
                til.m mVarA = ((xj2.n) this.f304854b).o.a();
                vc.s.j(mVarA);
                return new com.revolut.feature.atm.impl.ui.redesign.limits_exception.a(mVarA);
            case 3:
                xn0.b bVar = (xn0.b) this.f304854b;
                return new vub.j(bVar.f307298a, bVar.f307299b, bVar.f307300c, 5);
            case 4:
                return new n8j.a(((xo5.b) this.f304854b).f307686a, 22);
            case 5:
                gp6.a aVar = (gp6.a) ((usc.a) this.f304854b).f282889b;
                dp6.a repository = aVar.b();
                vc.s.j(repository);
                bp6.b mapper = aVar.c();
                vc.s.j(mapper);
                ep6.b feedbackBottomDialogItemsProvider = (ep6.b) aVar.f145259h.get();
                vc.s.j(feedbackBottomDialogItemsProvider);
                Intrinsics.checkNotNullParameter(repository, "repository");
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(feedbackBottomDialogItemsProvider, "feedbackBottomDialogItemsProvider");
                return new nd.o();
            case 6:
                xsl.m mVar = (xsl.m) this.f304854b;
                mul.m mVar2 = new mul.m(ImmutableSet.of((nul.b) new nul.c(), new nul.b(new ufl.b(new tfl.a()))));
                mul.b bVar2 = new mul.b();
                SecurityAssetBalanceBreakdownScreenDescriptor$InputData securityAssetBalanceBreakdownScreenDescriptor$InputData = mVar.f308675a;
                xsl.p pVar = mVar.f308676b;
                return new mul.j(mVar2, bVar2, securityAssetBalanceBreakdownScreenDescriptor$InputData, new jid.z(new usc.a((e8h.j) pVar.i.f150278s0.get()), (vrl.c) pVar.S.get()));
            case 7:
                return new n8j.a(((xt2.b) this.f304854b).f308747a, 23);
            case 8:
                TravelItineraryDatePickerContract$InputData travelItineraryDatePickerContract$InputData = ((xuj.c) this.f304854b).f309079a;
                return new bvj.f(travelItineraryDatePickerContract$InputData, new bvj.h(travelItineraryDatePickerContract$InputData));
            case 9:
                TravelItineraryEditDatesScreenContract$InputData travelItineraryEditDatesScreenContract$InputData = ((xuj.d) this.f304854b).f309081a;
                return new jvj.f(travelItineraryEditDatesScreenContract$InputData, new jvj.h(travelItineraryEditDatesScreenContract$InputData));
            case 10:
                return new evj.i(((xuj.g) this.f304854b).f309088a, new evj.j());
            case 11:
                xxb.d dVar = (xxb.d) this.f304854b;
                return new ax4.c(dVar.f309500a, dVar.f309501b, dVar.f309502c, dVar.d, 20);
            case 12:
                xzl.b bVar3 = (xzl.b) this.f304854b;
                return new ske.e(bVar3.f310069a, bVar3.f310071b, bVar3.f310072c, bVar3.d, bVar3.e, bVar3.f, bVar3.f310073g, bVar3.f310074h, bVar3.i, bVar3.f310075j, bVar3.k, bVar3.f310076l, bVar3.f310077m, bVar3.f310078n, bVar3.o, bVar3.f310079p, bVar3.f310080q, bVar3.f310081r, bVar3.f310082s, bVar3.f310083t, bVar3.u, bVar3.v, bVar3.f310084w, bVar3.f310085x, bVar3.f310086y, bVar3.z, bVar3.A, bVar3.B, bVar3.C, bVar3.D, bVar3.E, bVar3.F, bVar3.G, bVar3.H, bVar3.I, bVar3.J, bVar3.K, bVar3.L, bVar3.M, bVar3.N, bVar3.O, bVar3.P, bVar3.Q, bVar3.R, bVar3.S, bVar3.T, bVar3.U, bVar3.V, bVar3.W, bVar3.X, bVar3.Y, bVar3.Z);
            case 13:
                return new n8j.a(((y09.a) this.f304854b).f310168a, 26);
            case 14:
                return new com.revolut.retail.feature.travel_status.impl.ui.screens.partner.action_bottomsheet.a(((y1l.f) this.f304854b).f310409a, new j2l.j());
            case 15:
                return new n8j.a(((y26.a) this.f304854b).f310605a, 28);
            case 16:
                y46.a aVar2 = (y46.a) this.f304854b;
                return new emi.g(aVar2.f310816a, aVar2.f310817b, aVar2.f310818c, aVar2.d, aVar2.e, 16);
            case 17:
                return new n8j.a(((y76.a) this.f304854b).f311347a, 29);
            case 18:
                y7l.a aVar3 = (y7l.a) this.f304854b;
                return new emi.g(aVar3.f311587a, aVar3.f311588b, aVar3.f311589c, aVar3.d, aVar3.e, 17);
            case 19:
                y90.f fVar = (y90.f) this.f304854b;
                return new ap3.b(fVar.f311726a, fVar.f311727b, fVar.f311728c, fVar.d, fVar.e, fVar.f, fVar.f311729g, 12);
            case 20:
                y9j.c cVar = (y9j.c) this.f304854b;
                return new ajf.d(cVar.f311865a, cVar.f311866b, cVar.f311867c, cVar.d, cVar.e, 22);
            case 21:
                yc6.a aVar4 = (yc6.a) this.f304854b;
                return new a16.b(aVar4.f312540a, aVar4.f312541b, 27);
            case 22:
                ycf.a aVar5 = (ycf.a) this.f304854b;
                return new bo9.d(aVar5.f312607a, aVar5.f312608b, aVar5.f312609c, aVar5.d, aVar5.e, aVar5.f, 17);
            case 23:
                return new hg3.h(((yf3.g) this.f304854b).f313168a, new cg3.a());
            case 24:
                return new com.revolut.feature.address.common.impl.flow.field_search.flow.a(((yh1.c) this.f304854b).f313699a);
            case 25:
                yh3.c cVar2 = (yh3.c) this.f304854b;
                return new bi3.c(cVar2.f313744a, cVar2.f313745b, cVar2.f313746c, cVar2.d, cVar2.e, cVar2.f, cVar2.f313747g, cVar2.f313748h);
            case 26:
                dk3.b.Companion.getClass();
                ck3.h hVar = new ck3.h(new Data(null, null, false, 7, null));
                ck3.r rVar = new ck3.r(new ck3.o());
                yj3.a aVar6 = (yj3.a) this.f304854b;
                z0h.d dVarC = ((u8h.b) aVar6.i).c();
                vc.s.j(dVarC);
                ore.b bVar4 = aVar6.f314397a;
                mre.c cVarB = bVar4.b();
                vc.s.j(cVarB);
                fk3.a aVarA = aVar6.f314402j.a();
                vc.s.j(aVarA);
                pre.c cVarA = bVar4.a();
                vc.s.j(cVarA);
                return new ck3.n(hVar, rVar, dVarC, cVarB, aVarA, cVarA, new ek3.a());
            case 27:
                return new com.revolut.feature.credit.autopay.ui.screen.account_selection.flow.a(((yj4.a) this.f304854b).f314407a);
            case 28:
                yl2.a aVar7 = (yl2.a) this.f304854b;
                return new vub.j(aVar7.f314650a, aVar7.f314651b, aVar7.f314652c, 7);
            default:
                ymb.a aVar8 = (ymb.a) this.f304854b;
                return new anb.c0(aVar8.f314942a, aVar8.f314943b, aVar8.f314944c, aVar8.d, 0);
        }
    }

    public f3(yj3.a aVar, yj3.b bVar) {
        this.f304853a = 26;
        this.f304854b = aVar;
    }
}
