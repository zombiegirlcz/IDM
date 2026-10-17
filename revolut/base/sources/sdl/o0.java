package sdl;

import com.revolut.shared.feature.wealth.models.trading_accounts.Beneficiary;
import com.revolut.shared.feature.wealth.models.trading_accounts.Settings;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProduct;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sdl.r;

/* JADX INFO: loaded from: classes12.dex */
public abstract class o0 {
    public static final boolean a(r.g gVar, TradingProductCode tradingProductCode) {
        List list = gVar.f262044g;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (Intrinsics.f(((j0) it8.next()).f261975b, tradingProductCode.getF105337a())) {
                return true;
            }
        }
        return false;
    }

    public static final cfl.b b(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        switch (n0.f261989h[mVar.ordinal()]) {
            case 1:
                return cfl.b.CREATED;
            case 2:
                return cfl.b.ONBOARDING;
            case 3:
                return cfl.b.ACTIVE;
            case 4:
                return cfl.b.SUSPENDED;
            case 5:
                return cfl.b.OFFBOARDING;
            case 6:
                return cfl.b.TERMINATED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final cfl.c c(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        int i = n0.f261986b[oVar.ordinal()];
        if (i == 1) {
            return cfl.c.TOPUP_WITHDRAWAL;
        }
        if (i == 2) {
            return cfl.c.WITHDRAWAL_ONLY;
        }
        if (i == 3) {
            return cfl.c.TOPUP_ONLY;
        }
        if (i == 4) {
            return cfl.c.NONE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final cfl.d d(q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        int i = n0.d[qVar.ordinal()];
        if (i == 1) {
            return cfl.d.BUY_SELL;
        }
        if (i == 2) {
            return cfl.d.SELL_ONLY;
        }
        if (i == 3) {
            return cfl.d.CLOSE_POSITION_ONLY;
        }
        if (i == 4) {
            return cfl.d.NONE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TradingAccount.Portfolio e(x xVar) {
        com.revolut.shared.feature.wealth.models.trading_accounts.a aVar;
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        UUID uuid = xVar.f262067a;
        w wVar = xVar.f262068b;
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        switch (n0.f[wVar.ordinal()]) {
            case 1:
                aVar = com.revolut.shared.feature.wealth.models.trading_accounts.a.CREATED;
                break;
            case 2:
                aVar = com.revolut.shared.feature.wealth.models.trading_accounts.a.ONBOARDING;
                break;
            case 3:
                aVar = com.revolut.shared.feature.wealth.models.trading_accounts.a.ACTIVE;
                break;
            case 4:
                aVar = com.revolut.shared.feature.wealth.models.trading_accounts.a.SUSPENDED;
                break;
            case 5:
                aVar = com.revolut.shared.feature.wealth.models.trading_accounts.a.OFFBOARDING;
                break;
            case 6:
                aVar = com.revolut.shared.feature.wealth.models.trading_accounts.a.TERMINATED;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Instant instantOfEpochMilli = Instant.ofEpochMilli(xVar.f262069c);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        return new TradingAccount.Portfolio(uuid, aVar, instantOfEpochMilli);
    }

    public static final TradingAccount.TaxAdvantage.Limit f(e0 e0Var) {
        TradingAccount.TaxAdvantage.Limit.TopUpLimit topUpLimit;
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        d0 d0Var = e0Var.f261963a;
        if (d0Var != null) {
            Intrinsics.checkNotNullParameter(d0Var, "<this>");
            topUpLimit = new TradingAccount.TaxAdvantage.Limit.TopUpLimit(d0Var.f261944a, d0Var.f261945b, d0Var.f261946c, d0Var.d);
        } else {
            topUpLimit = null;
        }
        return new TradingAccount.TaxAdvantage.Limit(topUpLimit);
    }

    public static final TradingAccount g(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        List f262044g = rVar.getF262044g();
        ArrayList arrayList = new ArrayList(zhm.w.t(f262044g, 10));
        Iterator it8 = f262044g.iterator();
        while (it8.hasNext()) {
            arrayList.add(h((j0) it8.next()));
        }
        if (rVar instanceof r.b) {
            r.b bVar = (r.b) rVar;
            UUID uuid = bVar.f261997b;
            String str = bVar.f261998c;
            String str2 = bVar.d;
            cfl.b bVarB = b(bVar.e);
            cfl.j jVarY = zi0.c.Y(bVar.f);
            List list = bVar.f262000h;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                arrayList2.add(e((x) it9.next()));
            }
            cfl.d dVarD = d(bVar.i);
            cfl.c cVarC = c(bVar.f262001j);
            List list2 = bVar.k;
            xi0.a aVar = xi0.b.Companion;
            ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
            Iterator it10 = list2.iterator();
            while (it10.hasNext()) {
                t61.a.A(aVar, (String) it10.next(), arrayList3);
            }
            i iVar = bVar.f262004n.f261977a;
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            Boolean bool = iVar.f261971a;
            Long l2 = iVar.f261972b;
            Settings settings = new Settings(new Settings.BuyBlockSettings(bool, l2 != null ? Instant.ofEpochMilli(l2.longValue()) : null));
            List list3 = bVar.f262002l;
            ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
            Iterator it11 = list3.iterator();
            while (it11.hasNext()) {
                arrayList4.add(a.a.D((q0) it11.next()));
            }
            return new TradingAccount.GIA(uuid, str, str2, bVarB, jVarY, arrayList, arrayList2, dVarD, cVarC, arrayList3, arrayList4, zh9.u0.N(bVar.f262003m), settings);
        }
        if (rVar instanceof r.f) {
            r.f fVar = (r.f) rVar;
            UUID uuid2 = fVar.f262034b;
            String str3 = fVar.f262035c;
            String str4 = fVar.d;
            cfl.b bVarB2 = b(fVar.e);
            cfl.j jVarY2 = zi0.c.Y(fVar.f);
            List list4 = fVar.f262036g;
            ArrayList arrayList5 = new ArrayList(zhm.w.t(list4, 10));
            Iterator it12 = list4.iterator();
            while (it12.hasNext()) {
                arrayList5.add(h((j0) it12.next()));
            }
            List list5 = fVar.f262037h;
            ArrayList arrayList6 = new ArrayList(zhm.w.t(list5, 10));
            Iterator it13 = list5.iterator();
            while (it13.hasNext()) {
                arrayList6.add(e((x) it13.next()));
            }
            cfl.d dVarD2 = d(fVar.i);
            cfl.c cVarC2 = c(fVar.f262038j);
            List list6 = fVar.k;
            xi0.a aVar2 = xi0.b.Companion;
            ArrayList arrayList7 = new ArrayList(zhm.w.t(list6, 10));
            Iterator it14 = list6.iterator();
            while (it14.hasNext()) {
                t61.a.A(aVar2, (String) it14.next(), arrayList7);
            }
            List list7 = fVar.f262039l;
            ArrayList arrayList8 = new ArrayList(zhm.w.t(list7, 10));
            Iterator it15 = list7.iterator();
            while (it15.hasNext()) {
                arrayList8.add(a.a.D((q0) it15.next()));
            }
            return new TradingAccount.Robo.Regular(uuid2, str3, str4, bVarB2, jVarY2, arrayList5, arrayList6, dVarD2, cVarC2, arrayList7, arrayList8, zh9.u0.N(fVar.f262040m));
        }
        if (rVar instanceof r.c) {
            r.c cVar = (r.c) rVar;
            UUID uuid3 = cVar.f262007b;
            String str5 = cVar.f262008c;
            String str6 = cVar.d;
            cfl.b bVarB3 = b(cVar.e);
            cfl.j jVarY3 = zi0.c.Y(cVar.f);
            List list8 = cVar.f262010h;
            ArrayList arrayList9 = new ArrayList(zhm.w.t(list8, 10));
            Iterator it16 = list8.iterator();
            while (it16.hasNext()) {
                arrayList9.add(e((x) it16.next()));
            }
            cfl.d dVarD3 = d(cVar.i);
            cfl.c cVarC3 = c(cVar.f262011j);
            List list9 = cVar.k;
            xi0.a aVar3 = xi0.b.Companion;
            ArrayList arrayList10 = new ArrayList(zhm.w.t(list9, 10));
            Iterator it17 = list9.iterator();
            while (it17.hasNext()) {
                t61.a.A(aVar3, (String) it17.next(), arrayList10);
            }
            List list10 = cVar.f262012l;
            ArrayList arrayList11 = new ArrayList(zhm.w.t(list10, 10));
            Iterator it18 = list10.iterator();
            while (it18.hasNext()) {
                arrayList11.add(a.a.D((q0) it18.next()));
            }
            return new TradingAccount.Margin(uuid3, str5, str6, bVarB3, jVarY3, arrayList, arrayList9, dVarD3, cVarC3, arrayList10, arrayList11, zh9.u0.N(cVar.f262013m));
        }
        if (!(rVar instanceof r.g)) {
            if (rVar instanceof r.d) {
                r.d dVar = (r.d) rVar;
                UUID uuid4 = dVar.f262016b;
                String str7 = dVar.f262017c;
                String str8 = dVar.d;
                cfl.b bVarB4 = b(dVar.e);
                cfl.j jVarY4 = zi0.c.Y(dVar.f);
                List list11 = dVar.f262019h;
                ArrayList arrayList12 = new ArrayList(zhm.w.t(list11, 10));
                Iterator it19 = list11.iterator();
                while (it19.hasNext()) {
                    arrayList12.add(e((x) it19.next()));
                }
                cfl.d dVarD4 = d(dVar.i);
                cfl.c cVarC4 = c(dVar.f262020j);
                List list12 = dVar.k;
                xi0.a aVar4 = xi0.b.Companion;
                ArrayList arrayList13 = new ArrayList(zhm.w.t(list12, 10));
                Iterator it20 = list12.iterator();
                while (it20.hasNext()) {
                    t61.a.A(aVar4, (String) it20.next(), arrayList13);
                }
                List list13 = dVar.f262021l;
                ArrayList arrayList14 = new ArrayList(zhm.w.t(list13, 10));
                Iterator it21 = list13.iterator();
                while (it21.hasNext()) {
                    arrayList14.add(a.a.D((q0) it21.next()));
                }
                return new TradingAccount.MoneyMarketFunds(uuid4, str7, str8, bVarB4, jVarY4, arrayList, arrayList12, dVarD4, cVarC4, arrayList13, arrayList14, zh9.u0.N(dVar.f262022m));
            }
            if (!(rVar instanceof r.e)) {
                if (!(rVar instanceof r.h)) {
                    throw new NoWhenBranchMatchedException();
                }
                r.h hVar = (r.h) rVar;
                return new TradingAccount.Unknown(hVar.f262052b, hVar.f262053c, hVar.d, b(hVar.e), zi0.c.Y(hVar.f), zh9.u0.N(hVar.f262054g));
            }
            r.e eVar = (r.e) rVar;
            UUID uuid5 = eVar.f262025b;
            String str9 = eVar.f262026c;
            String str10 = eVar.d;
            cfl.b bVarB5 = b(eVar.e);
            cfl.j jVarY5 = zi0.c.Y(eVar.f);
            List list14 = eVar.f262028h;
            ArrayList arrayList15 = new ArrayList(zhm.w.t(list14, 10));
            Iterator it22 = list14.iterator();
            while (it22.hasNext()) {
                arrayList15.add(e((x) it22.next()));
            }
            cfl.d dVarD5 = d(eVar.i);
            cfl.c cVarC5 = c(eVar.f262029j);
            List list15 = eVar.k;
            xi0.a aVar5 = xi0.b.Companion;
            ArrayList arrayList16 = new ArrayList(zhm.w.t(list15, 10));
            Iterator it23 = list15.iterator();
            while (it23.hasNext()) {
                t61.a.A(aVar5, (String) it23.next(), arrayList16);
            }
            List list16 = eVar.f262030l;
            ArrayList arrayList17 = new ArrayList(zhm.w.t(list16, 10));
            Iterator it24 = list16.iterator();
            while (it24.hasNext()) {
                arrayList17.add(a.a.D((q0) it24.next()));
            }
            return new TradingAccount.PaperTrading(uuid5, str9, str10, bVarB5, jVarY5, arrayList, arrayList15, dVarD5, cVarC5, arrayList16, arrayList17, zh9.u0.N(eVar.f262031m));
        }
        r.g gVar = (r.g) rVar;
        boolean zA = a(gVar, TradingProductCode.IsaGB.f105316a);
        c cVar2 = gVar.f262049n;
        List list17 = gVar.f262048m;
        e0 e0Var = gVar.f262047l;
        List list18 = gVar.k;
        o oVar = gVar.f262046j;
        q qVar = gVar.i;
        List list19 = gVar.f262045h;
        List list20 = gVar.f262044g;
        l0 l0Var = gVar.f;
        m mVar = gVar.e;
        if (zA) {
            UUID uuid6 = gVar.f262042b;
            String str11 = gVar.f262043c;
            String str12 = gVar.d;
            cfl.b bVarB6 = b(mVar);
            cfl.j jVarY6 = zi0.c.Y(l0Var);
            List list21 = list20;
            ArrayList arrayList18 = new ArrayList(zhm.w.t(list21, 10));
            Iterator it25 = list21.iterator();
            while (it25.hasNext()) {
                arrayList18.add(h((j0) it25.next()));
            }
            List list22 = list19;
            ArrayList arrayList19 = new ArrayList(zhm.w.t(list22, 10));
            Iterator it26 = list22.iterator();
            while (it26.hasNext()) {
                arrayList19.add(e((x) it26.next()));
            }
            cfl.d dVarD6 = d(qVar);
            cfl.c cVarC6 = c(oVar);
            List list23 = list18;
            xi0.a aVar6 = xi0.b.Companion;
            ArrayList arrayList20 = new ArrayList(zhm.w.t(list23, 10));
            Iterator it27 = list23.iterator();
            while (it27.hasNext()) {
                t61.a.A(aVar6, (String) it27.next(), arrayList20);
            }
            TradingAccount.TaxAdvantage.Limit limitF = e0Var != null ? f(e0Var) : null;
            List list24 = list17;
            ArrayList arrayList21 = new ArrayList(zhm.w.t(list24, 10));
            Iterator it28 = list24.iterator();
            while (it28.hasNext()) {
                arrayList21.add(a.a.D((q0) it28.next()));
            }
            return new TradingAccount.TaxAdvantage.Isa(uuid6, str11, str12, bVarB6, jVarY6, arrayList18, arrayList19, dVarD6, cVarC6, arrayList20, limitF, arrayList21, zh9.u0.N(cVar2));
        }
        if (a(gVar, TradingProductCode.PeaFr.f105321a)) {
            UUID uuid7 = gVar.f262042b;
            String str13 = gVar.f262043c;
            String str14 = gVar.d;
            cfl.b bVarB7 = b(mVar);
            cfl.j jVarY7 = zi0.c.Y(l0Var);
            List list25 = list20;
            ArrayList arrayList22 = new ArrayList(zhm.w.t(list25, 10));
            Iterator it29 = list25.iterator();
            while (it29.hasNext()) {
                arrayList22.add(h((j0) it29.next()));
            }
            List list26 = list19;
            ArrayList arrayList23 = new ArrayList(zhm.w.t(list26, 10));
            Iterator it30 = list26.iterator();
            while (it30.hasNext()) {
                arrayList23.add(e((x) it30.next()));
            }
            cfl.d dVarD7 = d(qVar);
            cfl.c cVarC7 = c(oVar);
            List list27 = list18;
            xi0.a aVar7 = xi0.b.Companion;
            ArrayList arrayList24 = new ArrayList(zhm.w.t(list27, 10));
            Iterator it31 = list27.iterator();
            while (it31.hasNext()) {
                t61.a.A(aVar7, (String) it31.next(), arrayList24);
            }
            TradingAccount.TaxAdvantage.Limit limitF2 = e0Var != null ? f(e0Var) : null;
            List list28 = list17;
            ArrayList arrayList25 = new ArrayList(zhm.w.t(list28, 10));
            Iterator it32 = list28.iterator();
            while (it32.hasNext()) {
                arrayList25.add(a.a.D((q0) it32.next()));
            }
            return new TradingAccount.TaxAdvantage.Pea(uuid7, str13, str14, bVarB7, jVarY7, arrayList22, arrayList23, dVarD7, cVarC7, arrayList24, limitF2, arrayList25, zh9.u0.N(cVar2));
        }
        if (!a(gVar, TradingProductCode.JIsaGB.f105317a)) {
            UUID uuid8 = gVar.f262042b;
            String str15 = gVar.f262043c;
            String str16 = gVar.d;
            cfl.b bVarB8 = b(mVar);
            List list29 = list20;
            ArrayList arrayList26 = new ArrayList(zhm.w.t(list29, 10));
            Iterator it33 = list29.iterator();
            while (it33.hasNext()) {
                arrayList26.add(h((j0) it33.next()));
            }
            return new TradingAccount.TaxAdvantage.Unknown(uuid8, str15, str16, bVarB8, zi0.c.Y(l0Var), arrayList26, zh9.u0.N(cVar2));
        }
        Beneficiary beneficiaryN = zh9.u0.N(cVar2);
        cfl.a aVar8 = beneficiaryN.f105177c;
        int i = aVar8 == null ? -1 : n0.k[aVar8.ordinal()];
        if (i != -1) {
            if (i == 1) {
                UUID uuid9 = gVar.f262042b;
                String str17 = gVar.f262043c;
                String str18 = gVar.d;
                cfl.b bVarB9 = b(mVar);
                cfl.j jVarY8 = zi0.c.Y(l0Var);
                List list30 = list20;
                ArrayList arrayList27 = new ArrayList(zhm.w.t(list30, 10));
                Iterator it34 = list30.iterator();
                while (it34.hasNext()) {
                    arrayList27.add(h((j0) it34.next()));
                }
                List list31 = list19;
                ArrayList arrayList28 = new ArrayList(zhm.w.t(list31, 10));
                Iterator it35 = list31.iterator();
                while (it35.hasNext()) {
                    arrayList28.add(e((x) it35.next()));
                }
                cfl.d dVarD8 = d(qVar);
                cfl.c cVarC8 = c(oVar);
                List list32 = list18;
                xi0.a aVar9 = xi0.b.Companion;
                ArrayList arrayList29 = new ArrayList(zhm.w.t(list32, 10));
                Iterator it36 = list32.iterator();
                while (it36.hasNext()) {
                    t61.a.A(aVar9, (String) it36.next(), arrayList29);
                }
                TradingAccount.TaxAdvantage.Limit limitF3 = e0Var != null ? f(e0Var) : null;
                List list33 = list17;
                ArrayList arrayList30 = new ArrayList(zhm.w.t(list33, 10));
                Iterator it37 = list33.iterator();
                while (it37.hasNext()) {
                    arrayList30.add(a.a.D((q0) it37.next()));
                }
                return new TradingAccount.TaxAdvantage.JIsa.Personal(uuid9, str17, str18, bVarB9, jVarY8, arrayList27, arrayList28, dVarD8, cVarC8, arrayList29, limitF3, arrayList30, beneficiaryN);
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        UUID uuid10 = gVar.f262042b;
        String str19 = gVar.f262043c;
        String str20 = gVar.d;
        cfl.b bVarB10 = b(mVar);
        cfl.j jVarY9 = zi0.c.Y(l0Var);
        List list34 = list20;
        ArrayList arrayList31 = new ArrayList(zhm.w.t(list34, 10));
        Iterator it38 = list34.iterator();
        while (it38.hasNext()) {
            arrayList31.add(h((j0) it38.next()));
        }
        List list35 = list19;
        ArrayList arrayList32 = new ArrayList(zhm.w.t(list35, 10));
        Iterator it39 = list35.iterator();
        while (it39.hasNext()) {
            arrayList32.add(e((x) it39.next()));
        }
        cfl.d dVarD9 = d(qVar);
        cfl.c cVarC9 = c(oVar);
        List list36 = list18;
        xi0.a aVar10 = xi0.b.Companion;
        ArrayList arrayList33 = new ArrayList(zhm.w.t(list36, 10));
        Iterator it40 = list36.iterator();
        while (it40.hasNext()) {
            t61.a.A(aVar10, (String) it40.next(), arrayList33);
        }
        TradingAccount.TaxAdvantage.Limit limitF4 = e0Var != null ? f(e0Var) : null;
        List list37 = list17;
        ArrayList arrayList34 = new ArrayList(zhm.w.t(list37, 10));
        Iterator it41 = list37.iterator();
        while (it41.hasNext()) {
            arrayList34.add(a.a.D((q0) it41.next()));
        }
        return new TradingAccount.TaxAdvantage.JIsa.Custodian(uuid10, str19, str20, bVarB10, jVarY9, arrayList31, arrayList32, dVarD9, cVarC9, arrayList33, limitF4, arrayList34, beneficiaryN);
    }

    public static final TradingProduct h(j0 j0Var) {
        cfl.v vVar;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        UUID uuid = j0Var.f261974a;
        TradingProductCode tradingProductCodeA = c1.a(j0Var.f261975b);
        i0 i0Var = j0Var.f261976c;
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        switch (n0.f261990j[i0Var.ordinal()]) {
            case 1:
                vVar = cfl.v.DISABLED;
                break;
            case 2:
                vVar = cfl.v.AVAILABLE;
                break;
            case 3:
                vVar = cfl.v.ONBOARDING;
                break;
            case 4:
                vVar = cfl.v.ACTIVE;
                break;
            case 5:
                vVar = cfl.v.REMEDIATION_REQUIRED;
                break;
            case 6:
                vVar = cfl.v.OFFBOARDING;
                break;
            case 7:
                vVar = cfl.v.OFFBOARDED;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        cfl.v vVar2 = vVar;
        Long l2 = j0Var.d;
        Instant instantOfEpochMilli = l2 != null ? Instant.ofEpochMilli(l2.longValue()) : null;
        Long l3 = j0Var.e;
        return new TradingProduct(uuid, tradingProductCodeA, vVar2, instantOfEpochMilli, l3 != null ? Instant.ofEpochMilli(l3.longValue()) : null);
    }

    public static final m i(cfl.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        switch (n0.f261988g[bVar.ordinal()]) {
            case 1:
                return m.CREATED;
            case 2:
                return m.ONBOARDING;
            case 3:
                return m.ACTIVE;
            case 4:
                return m.SUSPENDED;
            case 5:
                return m.OFFBOARDING;
            case 6:
                return m.TERMINATED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final o j(cfl.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        int i = n0.f261985a[cVar.ordinal()];
        if (i == 1) {
            return o.TOPUP_WITHDRAWAL;
        }
        if (i == 2) {
            return o.WITHDRAWAL_ONLY;
        }
        if (i == 3) {
            return o.TOPUP_ONLY;
        }
        if (i == 4) {
            return o.NONE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final q k(cfl.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        int i = n0.f261987c[dVar.ordinal()];
        if (i == 1) {
            return q.BUY_SELL;
        }
        if (i == 2) {
            return q.SELL_ONLY;
        }
        if (i == 3) {
            return q.CLOSE_POSITION_ONLY;
        }
        if (i == 4) {
            return q.NONE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final x l(TradingAccount.Portfolio portfolio) {
        w wVar;
        Intrinsics.checkNotNullParameter(portfolio, "<this>");
        UUID uuid = portfolio.f105210a;
        com.revolut.shared.feature.wealth.models.trading_accounts.a aVar = portfolio.f105211b;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        switch (n0.e[aVar.ordinal()]) {
            case 1:
                wVar = w.CREATED;
                break;
            case 2:
                wVar = w.ONBOARDING;
                break;
            case 3:
                wVar = w.ACTIVE;
                break;
            case 4:
                wVar = w.SUSPENDED;
                break;
            case 5:
                wVar = w.OFFBOARDING;
                break;
            case 6:
                wVar = w.TERMINATED;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new x(uuid, wVar, portfolio.f105212c.toEpochMilli());
    }

    public static final j0 m(TradingProduct tradingProduct) {
        i0 i0Var;
        Intrinsics.checkNotNullParameter(tradingProduct, "<this>");
        UUID uuid = tradingProduct.f105280a;
        String f105337a = tradingProduct.f105281b.getF105337a();
        cfl.v vVar = tradingProduct.f105282c;
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        switch (n0.i[vVar.ordinal()]) {
            case 1:
                i0Var = i0.DISABLED;
                break;
            case 2:
                i0Var = i0.AVAILABLE;
                break;
            case 3:
                i0Var = i0.ONBOARDING;
                break;
            case 4:
                i0Var = i0.ACTIVE;
                break;
            case 5:
                i0Var = i0.REMEDIATION_REQUIRED;
                break;
            case 6:
                i0Var = i0.OFFBOARDING;
                break;
            case 7:
                i0Var = i0.OFFBOARDED;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        i0 i0Var2 = i0Var;
        Instant instant = tradingProduct.d;
        Long lValueOf = instant != null ? Long.valueOf(instant.toEpochMilli()) : null;
        Instant instant2 = tradingProduct.e;
        return new j0(uuid, f105337a, i0Var2, lValueOf, instant2 != null ? Long.valueOf(instant2.toEpochMilli()) : null);
    }
}
