package nz8;

import android.content.Context;
import aw0.o9;
import bjk.d2;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.domain.interactors.transactions.TransactionsPerformanceTracker$Scenario;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.insurance_pet.impl.ui.pet.amount.AmountData;
import com.revolut.feature.learn.shared.models.domain.LearnReward;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.shared_separate_favourites.domain.AssetIdWithSymbol;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.wealth.models.margin.WealthMarginBorrowingStatus;
import com.revolut.feature.wealth.models.margin.WealthMarginStatus;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanPageLayoutAsset;
import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import ggk.e0;
import gkl.j0;
import j1f.c1;
import j1f.p0;
import j1f.t0;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import jz8.z0;
import k4l.d0;
import kkf.r6;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.y;
import kotlinx.coroutines.flow.Flow;
import qz8.q;
import skm.g1;
import u09.l;
import u09.o;
import u09.v;
import u2f.r;
import u2f.s;
import u2f.t;
import u2f.u;
import uz8.n;
import y6h.p;
import yhm.m;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {
    public static final u09.f A(qz8.i iVar) {
        o oVar;
        o oVar2;
        String str;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        String str2 = iVar.d;
        String str3 = iVar.f250393n;
        LearnReward learnRewardB = j.b(iVar.f250390j);
        String str4 = iVar.f250392m;
        l lVarD = D(iVar.k);
        u09.k kVarC = C(iVar.f250389h);
        v vVarW = cp5.d.W(iVar.i);
        String str5 = iVar.f250387c;
        int i = iVar.f;
        f0 f0Var = f0.f322471a;
        List<n> list = iVar.f250388g;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (n nVar : list) {
            Map map = f.f220998a;
            Intrinsics.checkNotNullParameter(nVar, "<this>");
            arrayList.add(f.c(nVar.f284642c));
        }
        boolean z = iVar.e;
        List list2 = iVar.f250391l;
        if (list2 == null) {
            list2 = f0.f322471a;
        }
        String str6 = iVar.f250386b;
        q qVar = iVar.o;
        ArrayList arrayList2 = null;
        if (qVar != null) {
            Intrinsics.checkNotNullParameter(qVar, "<this>");
            oVar = new o(j.b(qVar.f250400a));
        } else {
            oVar = null;
        }
        List list3 = iVar.f250385a;
        if (list3 != null) {
            List list4 = list3;
            oVar2 = oVar;
            str = str2;
            ArrayList arrayList3 = new ArrayList(w.t(list4, 10));
            Iterator it8 = list4.iterator();
            while (it8.hasNext()) {
                arrayList3.add(B((qz8.e) it8.next()));
            }
            arrayList2 = arrayList3;
        } else {
            oVar2 = oVar;
            str = str2;
        }
        return new u09.f(str, str3, learnRewardB, str4, lVarD, kVarC, vVarW, str5, i, f0Var, arrayList, z, list2, str6, oVar2, arrayList2, pd.b.j(iVar.f250394p));
    }

    public static final u09.h B(qz8.e eVar) {
        u09.g gVar;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        int i = c.f220993b[eVar.f250381a.ordinal()];
        if (i == 1) {
            gVar = u09.g.NEW;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = u09.g.TRENDING;
        }
        return new u09.h(gVar);
    }

    public static final u09.k C(pz8.b bVar) {
        int i = bVar == null ? -1 : c.e[bVar.ordinal()];
        if (i == -1 || i == 1) {
            return u09.k.DEFAULT;
        }
        if (i == 2) {
            return u09.k.DISCOVER;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final l D(qz8.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        int i = c.f220992a[nVar.ordinal()];
        if (i == 1) {
            return l.AVAILABLE;
        }
        if (i == 2) {
            return l.PROGRESS;
        }
        if (i == 3) {
            return l.LOCKED;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final u2f.n E(t0 t0Var) {
        u2f.j jVar;
        u2f.j jVar2;
        u2f.q qVar;
        Object objA;
        Object objA2;
        u2f.j jVar3;
        u uVar;
        t tVar;
        s sVar;
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        String str = t0Var.f170430a;
        String str2 = t0Var.f170431b;
        u2f.j[] jVarArrValues = u2f.j.values();
        int length = jVarArrValues.length;
        int i = 0;
        while (true) {
            jVar = null;
            if (i >= length) {
                jVar2 = null;
                break;
            }
            jVar2 = jVarArrValues[i];
            if (a0.z(jVar2.name(), str2, true)) {
                break;
            }
            i++;
        }
        if (jVar2 == null) {
            jVar2 = u2f.j.UNKNOWN;
        }
        u2f.j jVar4 = jVar2;
        String str3 = t0Var.f170432c;
        u2f.q[] qVarArrValues = u2f.q.values();
        int length2 = qVarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                qVar = null;
                break;
            }
            qVar = qVarArrValues[i2];
            if (a0.z(qVar.name(), str3, true)) {
                break;
            }
            i2++;
        }
        if (qVar == null) {
            qVar = u2f.q.UNKNOWN;
        }
        u2f.q qVar2 = qVar;
        try {
            m.Companion companion = m.INSTANCE;
            objA = Instant.parse(t0Var.d);
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
            objA = Instant.EPOCH;
        }
        Intrinsics.checkNotNullExpressionValue(objA, "getOrElse(...)");
        Instant instant = (Instant) objA;
        try {
            objA2 = Instant.parse(t0Var.e);
        } catch (Throwable th11) {
            m.Companion companion3 = m.INSTANCE;
            objA2 = yhm.o.a(th11);
        }
        Throwable thA2 = m.a(objA2);
        if (thA2 != null) {
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, thA2, h0Var2);
            objA2 = Instant.EPOCH;
        }
        Intrinsics.checkNotNullExpressionValue(objA2, "getOrElse(...)");
        Instant instant2 = (Instant) objA2;
        List<c1> list = t0Var.f;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (c1 c1Var : list) {
            String str4 = c1Var.f170370a;
            u2f.j[] jVarArrValues2 = u2f.j.values();
            int length3 = jVarArrValues2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length3) {
                    jVar3 = jVar;
                    break;
                }
                jVar3 = jVarArrValues2[i3];
                if (a0.z(jVar3.name(), str4, true)) {
                    break;
                }
                i3++;
            }
            if (jVar3 == null) {
                jVar3 = u2f.j.UNKNOWN;
            }
            u2f.j jVar5 = jVar3;
            String str5 = c1Var.f170371b;
            u[] uVarArrValues = u.values();
            int length4 = uVarArrValues.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length4) {
                    uVar = null;
                    break;
                }
                uVar = uVarArrValues[i5];
                if (a0.z(uVar.name(), str5, true)) {
                    break;
                }
                i5++;
            }
            if (uVar == null) {
                uVar = u.UNKNOWN;
            }
            u uVar2 = uVar;
            String str6 = c1Var.f170372c;
            t[] tVarArrValues = t.values();
            int length5 = tVarArrValues.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length5) {
                    tVar = null;
                    break;
                }
                tVar = tVarArrValues[i6];
                if (a0.z(tVar.name(), str6, true)) {
                    break;
                }
                i6++;
            }
            if (tVar == null) {
                tVar = t.UNKNOWN;
            }
            t tVar2 = tVar;
            String str7 = c1Var.d;
            String str8 = c1Var.e;
            s[] sVarArrValues = s.values();
            int length6 = sVarArrValues.length;
            int i21 = 0;
            while (true) {
                if (i21 >= length6) {
                    sVar = null;
                    break;
                }
                sVar = sVarArrValues[i21];
                if (a0.z(sVar.name(), str8, true)) {
                    break;
                }
                i21++;
            }
            if (sVar == null) {
                sVar = s.UNKNOWN;
            }
            arrayList.add(new r(jVar5, uVar2, tVar2, str7, sVar));
            jVar = null;
        }
        p0 p0Var = t0Var.f170433g;
        String str9 = p0Var != null ? p0Var.f170423b : null;
        String str10 = t0Var.f170434h;
        String str11 = t0Var.i;
        BigDecimal bigDecimalI = str11 != null ? y.i(str11) : null;
        return new u2f.n(str, jVar4, qVar2, instant, instant2, arrayList, (str9 == null || str10 == null || bigDecimalI == null) ? null : new u2f.m(str9, str10, bigDecimalI));
    }

    public static final yc8.b F(cd8.f fVar) {
        yc8.a aVar;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String str = fVar.f23210a;
        v6d.a aVar2 = v6d.a.FIRST_PARTY_MARKETING;
        cd8.c cVar = fVar.f23211b;
        yc8.a aVar3 = null;
        if (cVar != null) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            aVar = new yc8.a(wc8.a.valueOf(cVar.f23208a));
        } else {
            aVar = null;
        }
        Pair pair = new Pair(aVar2, aVar);
        v6d.a aVar4 = v6d.a.THIRD_PARTY_MARKETING;
        cd8.c cVar2 = fVar.f23212c;
        if (cVar2 != null) {
            Intrinsics.checkNotNullParameter(cVar2, "<this>");
            aVar3 = new yc8.a(wc8.a.valueOf(cVar2.f23208a));
        }
        return new yc8.b(str, foh.i.q(pair, new Pair(aVar4, aVar3)));
    }

    public static final z2f.a G(y6h.o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        y6h.q layout = oVar.getLayout();
        Intrinsics.checkNotNullParameter(layout, "<this>");
        List mainPage = layout.getMainPage();
        if (mainPage == null) {
            mainPage = f0.f322471a;
        }
        List searchPage = layout.getSearchPage();
        if (searchPage == null) {
            searchPage = f0.f322471a;
        }
        return new z2f.a(new z2f.b(mainPage, searchPage));
    }

    public static final jz8.e H(u09.h hVar) {
        jz8.d dVar;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        int i = c.d[hVar.f276125a.ordinal()];
        if (i == 1) {
            dVar = jz8.d.NEW;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = jz8.d.TRENDING;
        }
        return new jz8.e(dVar);
    }

    public static final jz8.m I(u09.f fVar) {
        jz8.l lVar;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String str3 = fVar.f276109a;
        String str4 = fVar.f276110b;
        z0 z0VarC = j.c(fVar.f276111c);
        String str5 = fVar.d;
        l lVar2 = fVar.e;
        u09.k kVar = fVar.f;
        v vVar = fVar.f276112g;
        String str6 = fVar.f276113h;
        int i = fVar.i;
        List list = fVar.k;
        boolean z = fVar.f276115l;
        List list2 = fVar.f276116m;
        String str7 = fVar.f276117n;
        o oVar = fVar.o;
        ArrayList arrayList = null;
        if (oVar != null) {
            Intrinsics.checkNotNullParameter(oVar, "<this>");
            lVar = new jz8.l(j.c(oVar.f276138a));
        } else {
            lVar = null;
        }
        List list3 = fVar.f276118p;
        jz8.l lVar3 = lVar;
        if (list3 != null) {
            List list4 = list3;
            str = str3;
            str2 = str4;
            ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
            Iterator it8 = list4.iterator();
            while (it8.hasNext()) {
                arrayList2.add(H((u09.h) it8.next()));
            }
            arrayList = arrayList2;
        } else {
            str = str3;
            str2 = str4;
        }
        jz8.i iVar = new jz8.i(str, str2, z0VarC, str5, lVar2, kVar, vVar, str6, i, list, z, list2, str7, lVar3, arrayList, Boolean.valueOf(fVar.f276119q));
        List list5 = fVar.f276114j;
        ArrayList arrayList3 = new ArrayList(w.t(list5, 10));
        Iterator it9 = list5.iterator();
        while (it9.hasNext()) {
            arrayList3.add(f.d((u09.q) it9.next()));
        }
        return new jz8.m(iVar, arrayList3);
    }

    public static final Pair J(ogd.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        FavouritesAssetDetails favouritesAssetDetails = eVar.f225109a;
        AssetIdWithSymbol assetIdWithSymbol = new AssetIdWithSymbol(favouritesAssetDetails.f86863a, favouritesAssetDetails.f86864b);
        String str = eVar.f225110b;
        return new Pair(assetIdWithSymbol, str != null ? new AssetIdWithSymbol(str, str) : null);
    }

    public static final dj0.d K(AmountData amountData) {
        Intrinsics.checkNotNullParameter(amountData, "<this>");
        return new dj0.d(amountData.f76345a, amountData.f76347c);
    }

    public static final yy0.l L(Image image) {
        Intrinsics.checkNotNullParameter(image, "<this>");
        yy0.l.Companion.getClass();
        return yy0.i.a(image);
    }

    public static final cd8.c M(Map map, v6d.a name) {
        wc8.a aVar;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        yc8.a aVar2 = (yc8.a) map.get(name);
        if (aVar2 == null || (aVar = aVar2.f312564a) == null) {
            return null;
        }
        return new cd8.c(aVar.name());
    }

    public static final TimeZone N(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (a0.H(str, "UTC", false)) {
            str = a0.D(str, "UTC", "GMT", false);
        }
        TimeZone timeZone = TimeZone.getTimeZone(ZoneId.of(str));
        Intrinsics.checkNotNullExpressionValue(timeZone, "getTimeZone(...)");
        return timeZone;
    }

    public static final String a(Context context) {
        float f = context.getResources().getDisplayMetrics().density;
        return f < 2.0f ? "" : (2.0f > f || f > 3.0f) ? "@3x" : "@2x";
    }

    public static final String b(l2k.a aVar) {
        return aVar.f191807a + aVar.f191808b + aVar.d + aVar.f191809c;
    }

    public static final boolean c(ServerError serverError) {
        return 9003 == serverError.f51362a;
    }

    public static final boolean d(ServerError serverError) {
        return 9004 == serverError.f51362a;
    }

    public static final boolean e(ServerError serverError) {
        return 9014 == serverError.f51362a;
    }

    public static final boolean f(ServerError serverError) {
        int i = serverError.f51362a;
        return 9014 == i || 9003 == i || 9004 == i;
    }

    public static final wi0.b g(Address address) {
        Intrinsics.checkNotNullParameter(address, "<this>");
        wi0.a aVar = wi0.b.Companion;
        String country = address.getCountry();
        aVar.getClass();
        return wi0.a.a(country);
    }

    public static final Flow h(Flow flow, Function2 nullContentHandler, Function2 consumeErrors) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(nullContentHandler, "nullContentHandler");
        Intrinsics.checkNotNullParameter(consumeErrors, "consumeErrors");
        return i(flow, nullContentHandler, new jhi.c(), consumeErrors);
    }

    public static final Flow i(Flow flow, Function2 nullContentHandler, Function3 contentMapper, Function2 consumeErrors) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(contentMapper, "contentMapper");
        Intrinsics.checkNotNullParameter(nullContentHandler, "nullContentHandler");
        Intrinsics.checkNotNullParameter(consumeErrors, "consumeErrors");
        return vkm.q.q(new r6(new r6(new jhi.b(flow, nullContentHandler, contentMapper, consumeErrors), 28), 29));
    }

    public static /* synthetic */ Flow j(Flow flow, Function2 function2, int i) {
        if ((i & 2) != 0) {
            function2 = new nij.d(17);
        }
        return h(flow, nji.g.f216532a, function2);
    }

    public static final boolean k(PortfolioRecurringOrder portfolioRecurringOrder) {
        Intrinsics.checkNotNullParameter(portfolioRecurringOrder, "<this>");
        return portfolioRecurringOrder.d == d0.ACTIVE;
    }

    public static final boolean l(zz1.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return eVar == zz1.e.COMPLETED;
    }

    public static final boolean m(yy0.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if ((lVar instanceof yy0.j) || (lVar instanceof yy0.g) || (lVar instanceof yy0.h)) {
            return false;
        }
        if (lVar instanceof yy0.k) {
            return ((yy0.k) lVar).f317757b == null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean n(do3.n user, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(user, "user");
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            if (oi0.d.G(((oq9.j) it8.next()).d, user)) {
                return true;
            }
        }
        return false;
    }

    public static final efm.r o(efm.r rVar, TransactionsPerformanceTracker$Scenario scenario, sjf.e tracker) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(scenario, "scenario");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        efm.r rVarDoOnSubscribe = rVar.doOnSubscribe(new j4e.c(10, new j61.d(tracker, scenario, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnSubscribe, "doOnSubscribe(...)");
        return te0.w.z(rVarDoOnSubscribe, new j61.d(tracker, scenario, 1));
    }

    public static final wi0.b p(Address address) {
        Intrinsics.checkNotNullParameter(address, "<this>");
        return g(address);
    }

    public static final dj0.d q(dj0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (!dVar.k()) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(cp5.d.k(dVar.f115083b));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            BigDecimal scale = bigDecimalValueOf.setScale(2);
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(dVar.f115082a);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
            BigDecimal scale2 = bigDecimalValueOf2.setScale(2);
            Intrinsics.checkNotNullExpressionValue(scale2, "setScale(...)");
            Intrinsics.h(scale);
            BigDecimal bigDecimalDivide = scale2.divide(scale, RoundingMode.HALF_EVEN);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
            if (bigDecimalDivide.abs().compareTo(BigDecimal.TEN) > 0) {
                BigDecimal scale3 = bigDecimalDivide.setScale(0, 4);
                Intrinsics.h(scale3);
                BigDecimal bigDecimalMultiply = scale3.multiply(scale);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                return dj0.d.c(dVar, bigDecimalMultiply.longValue(), null, 2);
            }
        }
        return dVar;
    }

    public static final efm.r r(CoroutineContext coroutineContext, Function2 function2) {
        if (coroutineContext.get(g1.f263979a) == null) {
            return efm.r.create(new clm.m(coroutineContext, function2, 1));
        }
        throw new IllegalArgumentException(("Observable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
    }

    public static final TextLocalisedClause s(uib.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int i = vib.a.f289558a[bVar.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.savings_common_statement, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.savings_common_savings_summary, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String t(eel.c cVar, l80.e eVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        switch (rvg.b.f257780a[cVar.ordinal()]) {
            case 1:
                return "1d";
            case 2:
                return "1w";
            case 3:
                return "1m";
            case 4:
                return "6m";
            case 5:
                return "1y";
            case 6:
                return "5y";
            case 7:
                return "max";
            case 8:
                return eVar != null ? a0.d.h(((l80.f) eVar).f().getDayOfYear(), "d") : "ytd";
            default:
                throw new IllegalStateException("Can't convert " + cVar + " to ChartType");
        }
    }

    public static final Clause u(j0 j0Var, Style style) {
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        switch (wpl.a.f299355a[j0Var.ordinal()]) {
            case 1:
                return new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_document_passport, null, style, 10);
            case 2:
                return new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_document_identity_card, null, style, 10);
            case 3:
                return new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_document_driving_licence, null, style, 10);
            case 4:
                return new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_document_residence_permit, null, style, 10);
            case 5:
                return new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_document_tax_id, null, style, 10);
            case 6:
                return new TextClause("", style, (Integer) null, false, (o9) null, (List) null, 124);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String v(xzg.o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        int i = p.f311309a[oVar.ordinal()];
        if (i == 1) {
            return "COLLECTIONS_CONFIG_STOCKS";
        }
        if (i == 2) {
            return "COLLECTIONS_CONFIG_CRYPTO";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final WealthMarginStatus w(t7h.r rVar) {
        WealthMarginBorrowingStatus wealthMarginBorrowingStatus;
        udh.c cVar;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        dj0.d dVarO = mo3.a.o(rVar.f268711a);
        dj0.d dVarO2 = mo3.a.o(rVar.f268712b);
        dj0.d dVarO3 = mo3.a.o(rVar.f268713c);
        t7h.i iVar = rVar.d;
        if (iVar != null) {
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            t7h.k kVar = iVar.f268701a;
            Intrinsics.checkNotNullParameter(kVar, "<this>");
            int i = u7h.b.f277757a[kVar.ordinal()];
            if (i == 1) {
                cVar = udh.c.GOOD;
            } else if (i == 2) {
                cVar = udh.c.MARGIN_CALL;
            } else if (i == 3) {
                cVar = udh.c.FINAL_CALL;
            } else if (i == 4) {
                cVar = udh.c.LIQUIDATION;
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                r6.b.D("MarginBorrowingStatusTypeDto is UNKNOWN");
                cVar = udh.c.UNKNOWN;
            }
            udh.c cVar2 = cVar;
            dj0.d dVarO4 = mo3.a.o(iVar.f268702b);
            dj0.d dVarO5 = mo3.a.o(iVar.f268703c);
            jo3.a aVar = iVar.d;
            dj0.d dVarO6 = aVar != null ? mo3.a.o(aVar) : null;
            jo3.a aVar2 = iVar.e;
            wealthMarginBorrowingStatus = new WealthMarginBorrowingStatus(cVar2, dVarO4, dVarO5, dVarO6, aVar2 != null ? mo3.a.o(aVar2) : null);
        } else {
            wealthMarginBorrowingStatus = null;
        }
        t7h.f fVar = rVar.e;
        return new WealthMarginStatus(dVarO, dVarO2, dVarO3, fVar != null ? ofm.q.Y(fVar) : null, wealthMarginBorrowingStatus);
    }

    public static final PlanPageLayoutAsset x(d2 d2Var) {
        ggk.f0 f0Var;
        Intrinsics.checkNotNullParameter(d2Var, "<this>");
        String url2 = d2Var.getUrl();
        e0 e0Var = ggk.f0.Companion;
        String type = d2Var.getType();
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        ggk.f0[] f0VarArrValues = ggk.f0.values();
        int length = f0VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                f0Var = null;
                break;
            }
            f0Var = f0VarArrValues[i];
            if (Intrinsics.f(f0Var.a(), type)) {
                break;
            }
            i++;
        }
        if (f0Var != null) {
            return new PlanPageLayoutAsset(url2, f0Var);
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "PlansDashboardLayoutMapping", "Unsupported plan layout asset type", null, h0Var);
        return null;
    }

    public static final ej0.b y(hed.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        BigDecimal bigDecimal = new BigDecimal(aVar.getAmount(), MathContext.DECIMAL128);
        xi0.a aVar2 = xi0.b.Companion;
        String strB = aVar.getCurrency();
        aVar2.getClass();
        return new ej0.b(bigDecimal, xi0.a.a(strB));
    }

    public static final u09.f z(jz8.i iVar, List lessons) {
        boolean z;
        o oVar;
        String str;
        u09.g gVar;
        String str2 = "<this>";
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(lessons, "lessons");
        String str3 = iVar.f179623a;
        String str4 = iVar.f179624b;
        LearnReward learnRewardA = j.a(iVar.f179625c);
        String str5 = iVar.d;
        l lVar = iVar.e;
        u09.k kVar = iVar.f;
        if (kVar == null) {
            kVar = u09.k.DEFAULT;
        }
        u09.k kVar2 = kVar;
        v vVar = iVar.f179626g;
        String str6 = iVar.f179627h;
        int i = iVar.i;
        List list = lessons;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(f.a((jz8.t0) it8.next()));
        }
        List list2 = iVar.f179628j;
        boolean z3 = iVar.k;
        List list3 = iVar.f179629l;
        if (list3 == null) {
            list3 = f0.f322471a;
        }
        List list4 = list3;
        String str7 = iVar.f179630m;
        jz8.l lVar2 = iVar.f179631n;
        ArrayList arrayList2 = null;
        if (lVar2 != null) {
            Intrinsics.checkNotNullParameter(lVar2, "<this>");
            z = z3;
            oVar = new o(j.a(lVar2.f179637a));
        } else {
            z = z3;
            oVar = null;
        }
        List list5 = iVar.o;
        if (list5 != null) {
            List list6 = list5;
            str = str7;
            ArrayList arrayList3 = new ArrayList(w.t(list6, 10));
            Iterator it9 = list6.iterator();
            while (it9.hasNext()) {
                jz8.e eVar = (jz8.e) it9.next();
                Intrinsics.checkNotNullParameter(eVar, str2);
                Iterator it10 = it9;
                int i2 = c.f220994c[eVar.f179610a.ordinal()];
                String str8 = str2;
                if (i2 == 1) {
                    gVar = u09.g.NEW;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar = u09.g.TRENDING;
                }
                arrayList3.add(new u09.h(gVar));
                it9 = it10;
                str2 = str8;
            }
            arrayList2 = arrayList3;
        } else {
            str = str7;
        }
        return new u09.f(str3, str4, learnRewardA, str5, lVar, kVar2, vVar, str6, i, arrayList, list2, z, list4, str, oVar, arrayList2, pd.b.j(iVar.f179632p));
    }
}
