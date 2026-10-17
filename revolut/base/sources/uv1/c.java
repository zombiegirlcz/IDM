package uv1;

import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.breb.impl.ui.area.BrebAreaScreen;
import com.revolut.feature.card_add_to_googlepay.impl.R$string;
import com.revolut.feature.freelancer.common.models.FreelancerCashbackRates;
import com.revolut.feature.referrals.common.data.api.domain.model.BenefitItem;
import com.revolut.feature.trading_orders.api.ui.widgets.free_trades_incentive.FreeTradesIncentiveContract$FreeTradesLimit;
import com.revolut.feature.transport.impl.ui.transit_checkout.passenger_details.PassengerDetailsScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details.a;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.add_key_stats_view_groups.AddKeyStatsViewGroupsScreen;
import ip0.gu;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import le.u1;
import m1c.z;
import org.joda.time.DateTime;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f283262a;

    public /* synthetic */ c(int i) {
        this.f283262a = i;
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3 = null;
        switch (this.f283262a) {
            case 0:
                ip0.y it8 = (ip0.y) obj2;
                KProperty[] kPropertyArr = BrebAreaScreen.X;
                Intrinsics.checkNotNullParameter(it8, "it");
                Object obj4 = it8.f167226b.f58324n;
                if (obj4 instanceof a) {
                    return (a) obj4;
                }
                return null;
            case 1:
                RowDelegate.Model it9 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = BrebAreaScreen.X;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj5 = it9.u;
                if (obj5 instanceof a) {
                    return (a) obj5;
                }
                return null;
            case 2:
                l lVar = (l) obj2;
                return l.a(lVar, null, k.a(lVar.f283280b, false, null, 2), null, null, null, 29);
            case 3:
                whf.p it10 = (whf.p) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new a12.m(f0.f322471a, it10);
            case 4:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                FreelancerCashbackRates freelancerCashbackRates = (FreelancerCashbackRates) pair.f186386b;
                List<hha.d> list2 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                for (hha.d dVar : list2) {
                    BigDecimal bigDecimal = (BigDecimal) freelancerCashbackRates.f73279a.get(dVar.f152289c);
                    if (bigDecimal == null) {
                        bigDecimal = BigDecimal.ZERO;
                    }
                    Intrinsics.h(bigDecimal);
                    arrayList.add(new ht6.a(bigDecimal, dVar));
                }
                return arrayList;
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 6:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 7:
                RowDelegate.Model it11 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = AddKeyStatsViewGroupsScreen.R;
                Intrinsics.checkNotNullParameter(it11, "it");
                Object obj6 = it11.u;
                if (obj6 instanceof uvk.i) {
                    return (uvk.i) obj6;
                }
                return null;
            case 8:
                Boolean it12 = (Boolean) obj2;
                KProperty[] kPropertyArr4 = AddKeyStatsViewGroupsScreen.R;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(!it12.booleanValue());
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 10:
                List planLimits = (List) obj2;
                Intrinsics.checkNotNullParameter(planLimits, "planLimits");
                Iterator it13 = planLimits.iterator();
                while (true) {
                    if (it13.hasNext()) {
                        Object next = it13.next();
                        mha.m mVar = ((mha.s) next).f205465c;
                        mha.m.Companion.getClass();
                        if (Intrinsics.f(mVar, mha.m.f)) {
                            obj3 = next;
                        }
                    }
                }
                return (mha.s) obj3;
            case 11:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                hha.d dVar2 = (hha.d) pair2.f186385a;
                mha.s sVar = (mha.s) pair2.f186386b;
                mha.p pVar = sVar.f205468j;
                mha.o oVar = pVar instanceof mha.o ? (mha.o) pVar : null;
                mha.p pVar2 = sVar.f205467h;
                mha.o oVar2 = pVar2 instanceof mha.o ? (mha.o) pVar2 : null;
                DateTime dateTime = sVar.f;
                if (oVar == null || oVar2 == null || dateTime == null) {
                    return null;
                }
                long j2 = oVar2.f205462a;
                long j3 = j2 - oVar.f205462a;
                if (j3 < 0) {
                    j3 = 0;
                }
                return new FreeTradesIncentiveContract$FreeTradesLimit(dVar2, (int) j2, (int) j3, jli.b.g(dateTime));
            case 12:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new TextLocalisedClause(R$string.x_pay_otp_verification_title, null, null, 14);
            case 14:
                zwa.r dto = (zwa.r) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                return axa.b.b(dto);
            case 15:
                swa.b it14 = (swa.b) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return hx7.i.I(it14);
            case 16:
                zwa.d it15 = (zwa.d) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                Intrinsics.checkNotNullParameter(it15, "<this>");
                List<zwa.c> benefits = it15.getBenefits();
                ArrayList arrayList2 = new ArrayList(zhm.w.t(benefits, 10));
                for (zwa.c cVar : benefits) {
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    arrayList2.add(new BenefitItem((owa.a) u1.u(cVar.getCode(), uwa.a.f283564b), cVar.getTitle(), cVar.getDescription()));
                }
                return new owa.b(arrayList2);
            case 17:
                swa.b it16 = (swa.b) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return hx7.i.I(it16);
            case 18:
                swa.a it17 = (swa.a) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return hx7.i.H(it17);
            case 19:
                yt8.c it18 = (yt8.c) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.f316662a;
            case 20:
                yte.k it19 = (yte.k) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return u1.a(it19);
            case 21:
                m1c.z zVar = (m1c.z) obj2;
                if (zVar instanceof m1c.y) {
                    return Optional.ofNullable(((m1c.y) zVar).f201475a);
                }
                if (zVar instanceof z.a) {
                    return Optional.empty();
                }
                throw new NoWhenBranchMatchedException();
            case 22:
                Data it20 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                uwe.a aVar = (uwe.a) it20.getContent();
                if (aVar != null) {
                    return Long.valueOf(uwe.h.a(aVar));
                }
                return null;
            case 23:
                CellDetailsNoteDelegate.Model it21 = (CellDetailsNoteDelegate.Model) obj2;
                KProperty[] kPropertyArr5 = PassengerDetailsScreen.U;
                Intrinsics.checkNotNullParameter(it21, "it");
                return new ruf.e(it21.f51871a, it21.f51877l);
            case 24:
                ty0.a it22 = (ty0.a) obj2;
                KProperty[] kPropertyArr6 = PassengerDetailsScreen.U;
                Intrinsics.checkNotNullParameter(it22, "it");
                return Boolean.valueOf(Intrinsics.f(it22.f275445a, "https://www.revolut.com/legal/privacy"));
            case 25:
                InputTextDelegate.Model it23 = (InputTextDelegate.Model) obj2;
                KProperty[] kPropertyArr7 = PassengerDetailsScreen.U;
                Intrinsics.checkNotNullParameter(it23, "it");
                return new ruf.e(it23.f52580a, it23.P);
            case 26:
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                return Boolean.FALSE;
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return a.c.f99034a;
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return i2b.a.q(new gu("ID_SUBHEADER_0", 0, 0, 30), hxi.f.a());
        }
    }

    public /* synthetic */ c(com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details.b bVar) {
        this.f283262a = 29;
    }
}
