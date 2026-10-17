package msb;

import amd.b0;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import efm.r;
import ip0.gu;
import ip0.s7;
import ip0.xk;
import ipa.k;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import ll4.v;
import ll4.x;
import ll4.y;
import mtc.n;
import mti.m;
import ofm.q;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208645a;

    public /* synthetic */ c(int i) {
        this.f208645a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Boolean bool;
        int i = 12;
        boolean zBooleanValue = false;
        switch (this.f208645a) {
            case 0:
                od0.i it8 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return zi0.c.P(k.d((ipa.j) it8.c()), false, null, 3);
            case 1:
                Data it9 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(it9.getContent() != null);
            case 2:
                Data it10 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                Object content = it10.getContent();
                Intrinsics.h(content);
                return new zm0.d((String) content, zm0.e.EXTERNAL, 12);
            case 3:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List pocketBalances = (List) pair.f186385a;
                dj0.d dVarX = yoj.b.x(pocketBalances, (xi0.b) pair.f186386b);
                Intrinsics.checkNotNullParameter(pocketBalances, "pocketBalances");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : pocketBalances) {
                    if (((io3.g) obj3).f163163a.i >= 0) {
                        arrayList.add(obj3);
                    }
                }
                List listP0 = d0.P0(arrayList, new msd.c());
                ArrayList arrayList2 = new ArrayList(w.t(listP0, 10));
                Iterator it11 = listP0.iterator();
                while (it11.hasNext()) {
                    io3.d dVar = ((io3.g) it11.next()).f163163a;
                    xi0.a aVar = xi0.b.Companion;
                    String str = dVar.f163147c;
                    String str2 = dVar.f163147c;
                    aVar.getClass();
                    arrayList2.add(new amd.f(new CurrencyClause(xi0.a.a(str), null, null, 6), null, new MoneyClause(new dj0.d(dVar.i, xi0.a.a(str2)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, new CurrencyImage(str2, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, new b0(dVar), 160));
                }
                return new amd.d(amd.e.PRO, arrayList2, f0.f322471a, dVarX);
            case 4:
                amd.d group = (amd.d) obj2;
                Intrinsics.checkNotNullParameter(group, "group");
                if (group.d.f115082a < 0 || group.f6313b.isEmpty()) {
                    return null;
                }
                return group;
            case 5:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new mtc.i(n.a(), false);
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 8:
                bti.b airportsList = (bti.b) obj2;
                Intrinsics.checkNotNullParameter(airportsList, "airportsList");
                return airportsList.f18587c;
            case 9:
                List passes = (List) obj2;
                Intrinsics.checkNotNullParameter(passes, "passes");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : passes) {
                    bti.n nVar = ((AsftPass) obj4).f98714b;
                    if (nVar == bti.n.CREATED || nVar == bti.n.ACTIVE || nVar == bti.n.REDEEMED) {
                        arrayList3.add(obj4);
                    }
                }
                return arrayList3;
            case 10:
                bti.a airport = (bti.a) obj2;
                Intrinsics.checkNotNullParameter(airport, "airport");
                return d0.P0(airport.f18584g, new k2j.d(new m(), i));
            case 11:
                List terms = (List) obj2;
                Intrinsics.checkNotNullParameter(terms, "terms");
                Iterator it12 = terms.iterator();
                while (true) {
                    if (it12.hasNext()) {
                        next = it12.next();
                        TermsScope termsScope = ((Terms) next).f;
                        TermsScope.INSTANCE.getClass();
                        if (Intrinsics.f(termsScope, TermsScope.e)) {
                        }
                    } else {
                        next = null;
                    }
                }
                Terms terms2 = (Terms) next;
                String str3 = terms2 != null ? terms2.f90357c : null;
                if (str3 == null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "AsftTermsInteractorImpl", "Failed to fetch Revolut Terms URL", null, h0Var);
                }
                if (str3 == null) {
                    str3 = "";
                }
                return new go.g(new Data(str3, null, false, 6, null), 2);
            case 12:
                mtl.a it13 = (mtl.a) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.e;
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 14:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                y yVar = (y) pair2.f186385a;
                CreditCard creditCard = (CreditCard) pair2.f186386b;
                LocalDate localDate = yVar.f196557b;
                dj0.d dVar2 = new dj0.d(yVar.d, creditCard.f69798l);
                dj0.d dVar3 = new dj0.d(yVar.f196556a, creditCard.f69798l);
                dj0.d dVar4 = creditCard.f69794c;
                dj0.d dVarC = dj0.d.c(dVar4, Math.max(0L, dVar4.f115082a - yVar.f196564n), null, 2);
                v vVar = yVar.o;
                x xVar = vVar != null ? vVar.f196552a : null;
                if (xVar != 0) {
                    return new mu4.d(localDate, dVar2, dVar3, dVarC, xVar);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 15:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new mu4.f((List) getDefaultLoadingItems.invoke());
            case 16:
                do3.n it14 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f116408a;
            case 17:
                List rates = (List) obj2;
                Intrinsics.checkNotNullParameter(rates, "rates");
                List list = rates;
                ArrayList arrayList4 = new ArrayList(w.t(list, 10));
                Iterator it15 = list.iterator();
                while (it15.hasNext()) {
                    arrayList4.add(q.f0((qta.c) it15.next()));
                }
                return arrayList4;
            case 18:
                fo3.c wallet = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(wallet, "wallet");
                xi0.b bVar = wallet.d;
                xi0.b.Companion.getClass();
                xi0.b bVar2 = xi0.b.i;
                if (Intrinsics.f(bVar, bVar2)) {
                    r rVarJust = r.just(u.c(bVar2));
                    Intrinsics.h(rVarJust);
                    return rVarJust;
                }
                r rVarJust2 = r.just(zhm.v.k(bVar, bVar2));
                Intrinsics.h(rVarJust2);
                return rVarJust2;
            case 19:
                do3.n it16 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f116408a;
            case 20:
                List rates2 = (List) obj2;
                Intrinsics.checkNotNullParameter(rates2, "rates");
                List list2 = rates2;
                ArrayList arrayList5 = new ArrayList(w.t(list2, 10));
                Iterator it17 = list2.iterator();
                while (it17.hasNext()) {
                    arrayList5.add(q.f0((qta.c) it17.next()));
                }
                return arrayList5;
            case 21:
                fo3.c wallet2 = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(wallet2, "wallet");
                return wallet2.d;
            case 22:
                hha.d plan = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(plan, "plan");
                return plan.f152287a;
            case 23:
                PricingPlanSubscription it18 = (PricingPlanSubscription) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.f81129a;
            case 24:
                List plans = (List) obj2;
                Intrinsics.checkNotNullParameter(plans, "plans");
                List list3 = plans;
                ArrayList arrayList6 = new ArrayList(w.t(list3, 10));
                Iterator it19 = list3.iterator();
                while (it19.hasNext()) {
                    arrayList6.add(((hha.d) it19.next()).f152287a);
                }
                return arrayList6;
            case 25:
                List plans2 = (List) obj2;
                Intrinsics.checkNotNullParameter(plans2, "plans");
                List list4 = plans2;
                ArrayList arrayList7 = new ArrayList(w.t(list4, 10));
                Iterator it20 = list4.iterator();
                while (it20.hasNext()) {
                    arrayList7.add(((hha.d) it20.next()).f152287a);
                }
                return arrayList7;
            case 26:
                List settings = (List) obj2;
                Intrinsics.checkNotNullParameter(settings, "settings");
                Iterator it21 = settings.iterator();
                while (true) {
                    if (it21.hasNext()) {
                        Object next2 = it21.next();
                        if (((soa.b) next2).f264801a == soa.c.MARKETING) {
                            obj = next2;
                        }
                    }
                }
                soa.b bVar3 = (soa.b) obj;
                if (bVar3 != null && (bool = bVar3.e) != null) {
                    zBooleanValue = bool.booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                s0 s0Var = new s0(2);
                CounterTextDelegate.Model.Companion companion = CounterTextDelegate.Model.INSTANCE;
                String strA = ouk.b.a(mel.q.BEARISH);
                int i2 = R$attr.uikit_dp0;
                CounterTextDelegate.Model modelB = CounterTextDelegate.Model.Companion.b(companion, strA, null, i2, i2, 0, 0, 102);
                String strA2 = ouk.b.a(mel.q.NEUTRAL);
                int i3 = R$attr.uikit_dp0;
                CounterTextDelegate.Model modelB2 = CounterTextDelegate.Model.Companion.b(companion, strA2, null, i3, i3, 0, 0, 102);
                String strA3 = ouk.b.a(mel.q.BULLISH);
                int i5 = R$attr.uikit_dp0;
                List listK = zhm.v.k(modelB, modelB2, CounterTextDelegate.Model.Companion.b(companion, strA3, null, i5, i5, 0, 0, 102));
                yp0.b.q(listK, 0, 0, 0, 0, 15);
                xk xkVar = new xk("TECHNICALS_COUNTER_CONTAINER_ID", listK, 3, null, null, 56);
                yp0.b.l(xkVar, 0, 0, 0, 0, null, false, 63);
                s0Var.a(xkVar);
                s0 s0Var2 = new s0(4);
                s0Var2.a(new gu("TECHNICALS_SUBHEADER_MOVING_AVERAGE_ID", 0, 0, 30));
                s0Var2.b(ouk.e.a("TECHNICALS_ITEM_MOVING_AVERAGE_ID").toArray(new s7[0]));
                s0Var2.a(new gu("TECHNICALS_SUBHEADER_OSCILLATORS_ID", 0, 0, 30));
                s0Var2.b(ouk.e.a("TECHNICALS_ITEM_OSCILLATORS_ID").toArray(new s7[0]));
                ArrayList arrayList8 = s0Var2.f186433a;
                s0Var.b(zhm.v.k(arrayList8.toArray(new koi.j[arrayList8.size()])).toArray(new koi.j[0]));
                ArrayList arrayList9 = s0Var.f186433a;
                return zhm.v.k(arrayList9.toArray(new koi.j[arrayList9.size()]));
            case 28:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                return new mul.f((yzg.d) pair3.f186385a, (kel.n) pair3.f186386b);
            default:
                mul.h update = (mul.h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return mul.h.a(update, null, !update.f209057c, 3);
        }
    }

    public /* synthetic */ c(Object obj2, int i) {
        this.f208645a = i;
    }
}
