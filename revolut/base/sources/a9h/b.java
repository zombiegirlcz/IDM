package a9h;

import aa7.m;
import aah.e;
import ab4.o;
import ab4.u;
import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.CreditLinkedAccountsV2FlowContract$State;
import com.revolut.feature.onboarding.api.user_migration.PlannedUserMigrationResult;
import com.revolut.feature.onboarding.api.user_migration.model.UserMigration;
import com.revolut.feature.onboarding.api.user_migration.model.UserMigrationRequirement;
import com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuote;
import com.revolut.feature.wealth.models.margin.WealthMarginStatus;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.Charges;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import d9.e1;
import ip0.pb0;
import ip0.s7;
import ip0.zf0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.t0;
import l71.d;
import nel.a0;
import od0.h;
import od0.i;
import ofm.q;
import qta.f;
import sdl.d1;
import sdl.r;
import yhm.r;
import z0h.t1;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2654a;

    public /* synthetic */ b(int i) {
        this.f2654a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        z0h.b bVar;
        Object next;
        acb.a aVar = null;
        switch (this.f2654a) {
            case 0:
                i.Companion.getClass();
                return h.a((WealthMarginStatus) obj2);
            case 1:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return q.f0((qta.c) d0.b0(it8));
            case 2:
                d it9 = (d) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.a();
            case 3:
                qta.d midRatesPlot = (qta.d) obj2;
                Intrinsics.checkNotNullParameter(midRatesPlot, "midRatesPlot");
                List<Pair> list = midRatesPlot.e;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (Pair pair : list) {
                    arrayList.add(new Pair(Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(((Number) pair.f186385a).longValue())), Double.valueOf(((Number) pair.f186386b).doubleValue())));
                }
                return qta.d.a(midRatesPlot, arrayList);
            case 4:
                i it10 = (i) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (f) it10.f224257a;
            case 5:
                p9j.a it11 = (p9j.a) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return zi0.c.P(it11, false, null, 3);
            case 6:
                i it12 = (i) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return (f) it12.f224257a;
            case 7:
                i it13 = (i) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return (f) it13.f224257a;
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return m.a();
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zf0.f167457a;
            case 10:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return (a0) d0.b0(it14);
            case 11:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                e7l.f fVar = (e7l.f) rVar.f314201a;
                d dVar = (d) rVar.f314202b;
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) rVar.f314203c;
                gel.a aVar2 = fVar.v;
                switch (aVar2 != null ? e.f2823a[aVar2.ordinal()] : -1) {
                    case -1:
                        bVar = z0h.b.COMMON;
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        aah.f.Companion.getClass();
                        bVar = ((Set) aah.f.d.getValue()).contains(dVar.b()) ? z0h.b.RL_UK : z0h.b.RL_EEA;
                        break;
                    case 2:
                        bVar = z0h.b.RPAPL;
                        break;
                    case 3:
                        bVar = z0h.b.RTSPL;
                        break;
                    case 4:
                        bVar = z0h.b.RPNZPL;
                        break;
                    case 5:
                        bVar = z0h.b.RTJI;
                        break;
                    case 6:
                        bVar = z0h.b.RBSA;
                        break;
                    case 7:
                        bVar = z0h.b.COMMON;
                        break;
                }
                return new z0h.c(bVar, tradingLegalEntityInformation.f105106a);
            case 12:
                hel.a stocksConfig = (hel.a) obj2;
                Intrinsics.checkNotNullParameter(stocksConfig, "stocksConfig");
                return new t1(stocksConfig.e, stocksConfig.d);
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 14:
                Intrinsics.checkNotNullParameter((ab4.h) obj2, "$this$update");
                return new ab4.h(new Data(null, null, true, 3, null));
            case 15:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                List list2 = (List) getDefaultLoadingItems.invoke();
                m70.a.c(t0.f186434a);
                return new o(list2, u.a(""), null, null);
            case 16:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 3);
                for (int i = 0; i < 3; i++) {
                    arrayListP.add(new pb0(a0.d.n("TRANSFER_OUT_ASSET_SELECTION_LOADING_", i)));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
            case 17:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                return Boolean.FALSE;
            case 18:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 19:
                OrderQuote quote = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(quote, "quote");
                Charges charges = quote.f104755g;
                f8l.b bVar2 = quote.f104752a;
                int size = charges.f104731a.f104723b.size();
                Charges charges2 = quote.f104755g;
                ChargeBreakdown chargeBreakdown = charges2.f104732b;
                ChargeBreakdown chargeBreakdown2 = charges2.f104731a;
                List list3 = chargeBreakdown.f104723b;
                List list4 = chargeBreakdown.f104723b;
                boolean z = list3.size() + size > 1;
                dj0.d dVarB = l4i.a.b(e1.i(quote, e1.J(bVar2)));
                Amount amountJ = e1.j(quote, e1.J(bVar2));
                dj0.d dVarB2 = amountJ != null ? l4i.a.b(amountJ) : null;
                Amount amount = chargeBreakdown2.f104722a;
                List list5 = chargeBreakdown2.f104723b;
                if (!e1.D(amount.f104717a) && !e1.D(chargeBreakdown.f104722a.f104717a)) {
                    dVarB2 = null;
                }
                List list6 = list5;
                if (!list6.isEmpty() && !list4.isEmpty()) {
                    aVar = acb.a.CHARGE;
                } else if (!list6.isEmpty()) {
                    aVar = acb.a.FEE;
                } else if (!list4.isEmpty()) {
                    aVar = acb.a.TAX;
                }
                return new acb.b(dVarB, dVarB2, aVar, z);
            case 20:
                return r.h.INSTANCE.serializer();
            case 21:
                return d1.a.INSTANCE.serializer();
            case 22:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.e = true;
                Json.f255101c = true;
                tlm.e eVar = Json.f255103h;
                tlm.f fVar2 = new tlm.f();
                p0 p0Var = o0.f186429a;
                fVar2.b(p0Var.b(sdl.r.class), new b(20));
                fVar2.b(p0Var.b(d1.class), new b(21));
                Unit unit = Unit.f186387a;
                tlm.d dVarA = tlm.h.a(eVar, fVar2.a());
                Intrinsics.checkNotNullParameter(dVarA, "<set-?>");
                Json.f255103h = dVarA;
                return Unit.f186387a;
            case 23:
                Intrinsics.checkNotNullParameter((Action.Submit) obj2, "<unused var>");
                return Boolean.FALSE;
            case 24:
                CreditLinkedAccountsV2FlowContract$State update = (CreditLinkedAccountsV2FlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                av3.f fVar3 = update.f67827a;
                update.getClass();
                return new CreditLinkedAccountsV2FlowContract$State(fVar3, true);
            case 25:
                ((ad9.e) obj2).getClass();
                return new ad9.e(true);
            case 26:
                i userMigrationOptional = (i) obj2;
                Intrinsics.checkNotNullParameter(userMigrationOptional, "userMigrationOptional");
                UserMigration userMigration = (UserMigration) userMigrationOptional.f224257a;
                if (userMigration == null) {
                    ufm.b bVarM = efm.d0.m(PlannedUserMigrationResult.NoPlannedMigrations.f78217a);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                if (userMigration.f78225a == b99.a.UNSATISFIABLE) {
                    ufm.b bVarM2 = efm.d0.m(PlannedUserMigrationResult.UnsatisfiableMigration.f78222a);
                    Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                    return bVarM2;
                }
                Intrinsics.checkNotNullParameter(userMigration, "<this>");
                Iterator it15 = userMigration.f78226b.iterator();
                while (true) {
                    if (it15.hasNext()) {
                        next = it15.next();
                        UserMigrationRequirement userMigrationRequirement = (UserMigrationRequirement) next;
                        if (userMigrationRequirement.f78227a != b99.c.UNSATISFIED || userMigrationRequirement.f78229c != b99.d.MANUAL) {
                        }
                    } else {
                        next = null;
                    }
                }
                UserMigrationRequirement userMigrationRequirement2 = (UserMigrationRequirement) next;
                b99.b bVar3 = userMigrationRequirement2 != null ? userMigrationRequirement2.f78228b : null;
                int i2 = bVar3 == null ? -1 : ad9.r.f3307a[bVar3.ordinal()];
                if (i2 == -1) {
                    ufm.b bVarM3 = efm.d0.m(PlannedUserMigrationResult.AllRequirementsSatisfied.f78214a);
                    Intrinsics.checkNotNullExpressionValue(bVarM3, "just(...)");
                    return bVarM3;
                }
                if (i2 == 1) {
                    ufm.b bVarM4 = efm.d0.m(PlannedUserMigrationResult.OccupationRequired.f78218a);
                    Intrinsics.checkNotNullExpressionValue(bVarM4, "just(...)");
                    return bVarM4;
                }
                if (i2 == 2) {
                    ufm.b bVarM5 = efm.d0.m(PlannedUserMigrationResult.PlaceOfBirthRequired.f78219a);
                    Intrinsics.checkNotNullExpressionValue(bVarM5, "just(...)");
                    return bVarM5;
                }
                if (i2 == 3) {
                    ufm.b bVarM6 = efm.d0.m(PlannedUserMigrationResult.QesRequired.f78220a);
                    Intrinsics.checkNotNullExpressionValue(bVarM6, "just(...)");
                    return bVarM6;
                }
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                ufm.b bVarM7 = efm.d0.m(PlannedUserMigrationResult.TermsRequired.f78221a);
                Intrinsics.checkNotNullExpressionValue(bVarM7, "just(...)");
                return bVarM7;
            case 27:
                FiatExchangeOrderQuote it16 = (FiatExchangeOrderQuote) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                Intrinsics.checkNotNullParameter(it16, "<this>");
                if (it16.f91686a.isEmpty() && it16.f91688c.isEmpty()) {
                    throw new IllegalStateException("Quotes list is empty.");
                }
                ArrayList<OrderQuote> arrayListC = qcf.a.c(it16);
                ArrayList arrayList2 = new ArrayList(w.t(arrayListC, 10));
                for (OrderQuote orderQuote : arrayListC) {
                    arrayList2.add(new adf.d(orderQuote, d9.t0.o(orderQuote)));
                }
                List list7 = (List) ue0.e.M(arrayList2);
                if (list7 == null) {
                    throw new IllegalStateException("Quotes list for exchange is empty.");
                }
                List list8 = list7;
                ArrayList arrayList3 = new ArrayList(w.t(list8, 10));
                Iterator it17 = list8.iterator();
                while (it17.hasNext()) {
                    arrayList3.add(((adf.d) it17.next()).f3333b);
                }
                Iterator it18 = arrayList3.iterator();
                if (!it18.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object next2 = it18.next();
                while (it18.hasNext()) {
                    next2 = a.a.x((Amount) next2, (Amount) it18.next());
                }
                return new adf.c((Amount) next2, list7);
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new cii.b(null, v.k(new s7("CellDetailsLoadingDelegate1", 0, 0, 0, 0, false, null, 126), new s7("CellDetailsLoadingDelegate2", 0, 0, 0, 0, false, null, 126)), new lw0.h(lw0.i.TITLE_SUBTITLE));
            default:
                List it19 = (List) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return (File) d0.b0(it19);
        }
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f2654a = i;
    }
}
