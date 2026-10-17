package rbf;

import com.revolut.feature.trading_add_ons.impl.data.network.TradingAddOnsService;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import lbf.g;
import lbf.h;
import lbf.i;
import lbf.k;
import lbf.m;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import pbf.e;
import qbf.l;
import qbf.n;
import qbf.o;
import qbf.t;
import te0.w;
import w4l.f;
import wim.z;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAddOnsService f253043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f253044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f253045c;
    public final ue0.c d;
    public final pbf.d e;
    public final pbf.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f253046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f253047h;
    public final f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f253048j;

    public d(b80.c networkStateRepository, TradingAddOnsService tradingAddOnsService, j memoryCache, e tradingAddOnsMapper, ue0.c storage, pbf.d tradingAddOnsEnabledMapper, pbf.c tradingAddOnEligibilityMapper) {
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(tradingAddOnsService, "tradingAddOnsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(tradingAddOnsMapper, "tradingAddOnsMapper");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(tradingAddOnsEnabledMapper, "tradingAddOnsEnabledMapper");
        Intrinsics.checkNotNullParameter(tradingAddOnEligibilityMapper, "tradingAddOnEligibilityMapper");
        this.f253043a = tradingAddOnsService;
        this.f253044b = memoryCache;
        this.f253045c = tradingAddOnsMapper;
        this.d = storage;
        this.e = tradingAddOnsEnabledMapper;
        this.f = tradingAddOnEligibilityMapper;
        final int i = 4;
        final int i2 = 5;
        this.f253046g = new f(w.k0(networkStateRepository, new a(this, 2)), new a(this, 9), new Function2(this) { // from class: rbf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f253040b;

            {
                this.f253040b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                l lVar;
                n nVar;
                qbf.f fVar;
                t tVar;
                String str;
                Iterator it8;
                e eVar;
                qbf.c cVar;
                switch (i) {
                    case 0:
                        qbf.j domain = (qbf.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f253040b.f253044b.f("trading_add_on_downgrade_survey_config", domain);
                        return Unit.f186387a;
                    case 1:
                        qbf.j domain2 = (qbf.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f253040b.d.G(domain2, "trading_add_on_downgrade_survey_config", z.d(o0.b(qbf.j.class)));
                        return Unit.f186387a;
                    case 2:
                        String id10 = (String) obj2;
                        i domain3 = (i) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f253040b.f253044b.f(czi.c.f(id10), domain3);
                        return Unit.f186387a;
                    case 3:
                        String id11 = (String) obj2;
                        i domain4 = (i) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        d dVar = this.f253040b;
                        ue0.c cVar2 = dVar.d;
                        String strF = czi.c.f(id11);
                        dVar.f.getClass();
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        n nVar2 = null;
                        if (Intrinsics.f(domain4, g.f193675a)) {
                            lVar = new l(true, null);
                        } else {
                            if (!(domain4 instanceof h)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            lbf.l lVar2 = ((h) domain4).f193676a;
                            if (lVar2 != null) {
                                int i3 = pbf.b.f234680b[lVar2.ordinal()];
                                if (i3 == 1) {
                                    nVar = n.NOT_ONBOARDED_FOR_TRADING;
                                } else if (i3 == 2) {
                                    nVar = n.BUY_ORDER_BLOCK_ACTIVE;
                                } else if (i3 == 3) {
                                    nVar = n.ACCOUNT_IS_RESTRICTED;
                                } else {
                                    if (i3 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    nVar = n.UNKNOWN;
                                }
                                nVar2 = nVar;
                            }
                            lVar = new l(false, nVar2);
                        }
                        cVar2.G(lVar, strF, z.d(o0.b(l.class)));
                        return Unit.f186387a;
                    case 4:
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        this.f253040b.f253044b.f("trading_add_ons_trading", domain5);
                        return Unit.f186387a;
                    case 5:
                        List domain6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        String str2 = "domain";
                        Intrinsics.checkNotNullParameter(domain6, "domain");
                        d dVar2 = this.f253040b;
                        ue0.c cVar3 = dVar2.d;
                        List list = domain6;
                        e eVar2 = dVar2.f253045c;
                        int i5 = 10;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            m mVar = (m) it9.next();
                            eVar2.getClass();
                            Intrinsics.checkNotNullParameter(mVar, str2);
                            String str3 = mVar.f193680a;
                            int i6 = pbf.f.f234682b[mVar.f193681b.ordinal()];
                            if (i6 == 1) {
                                fVar = qbf.f.TRADING_PRO;
                            } else {
                                if (i6 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fVar = qbf.f.UNKNOWN;
                            }
                            qbf.f fVar2 = fVar;
                            List<lbf.b> list2 = mVar.f193682c;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, i5));
                            for (lbf.b bVar : list2) {
                                qbf.b bVarE = hx7.b.E(bVar.f193666a);
                                Period period = bVar.f193667b;
                                jo3.a aVarP = mo3.a.p(bVar.f193668c);
                                lbf.d dVar3 = bVar.d;
                                if (dVar3 != null) {
                                    str = str2;
                                    it8 = it9;
                                    eVar = eVar2;
                                    cVar = new qbf.c(dVar3.f193669a, dVar3.f193670b, dVar3.f193671c, mo3.a.p(dVar3.d));
                                } else {
                                    str = str2;
                                    it8 = it9;
                                    eVar = eVar2;
                                    cVar = null;
                                }
                                lbf.e eVar3 = bVar.e;
                                arrayList2.add(new qbf.d(bVarE, period, aVarP, cVar, eVar3 != null ? new qbf.e(eVar3.f193672a, eVar3.f193673b, eVar3.f193674c) : null));
                                str2 = str;
                                it9 = it8;
                                eVar2 = eVar;
                            }
                            String str4 = str2;
                            Iterator it10 = it9;
                            e eVar4 = eVar2;
                            List list3 = mVar.d;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                            Iterator it11 = list3.iterator();
                            while (it11.hasNext()) {
                                switch (pbf.f.d[((k) it11.next()).ordinal()]) {
                                    case 1:
                                        tVar = t.UNKNOWN;
                                        break;
                                    case 2:
                                        tVar = t.STOCKS;
                                        break;
                                    case 3:
                                        tVar = t.CRYPTO;
                                        break;
                                    case 4:
                                        tVar = t.ADVANCED_PORTFOLIO_ANALYTICS;
                                        break;
                                    case 5:
                                        tVar = t.ADVANCED_WEB_TRADING_TERMINAL;
                                        break;
                                    case 6:
                                        tVar = t.EXTENDED_SECURITIES;
                                        break;
                                    case 7:
                                        tVar = t.INCREASED_ORDER_LIMITS;
                                        break;
                                    case 8:
                                        tVar = t.DEDICATED_CUSTOMER_SUPPORT;
                                        break;
                                    case 9:
                                        tVar = t.NO_MINIMUM_FEES;
                                        break;
                                    case 10:
                                        tVar = t.ORDER_BOOK;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                                arrayList3.add(tVar);
                            }
                            List list4 = mVar.e;
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it12 = list4.iterator();
                            while (it12.hasNext()) {
                                arrayList4.add(hx7.e.d((lbf.n) it12.next()));
                            }
                            List list5 = mVar.f;
                            ArrayList arrayList5 = new ArrayList(zhm.w.t(list5, 10));
                            Iterator it13 = list5.iterator();
                            while (it13.hasNext()) {
                                arrayList5.add(hx7.e.d((lbf.n) it13.next()));
                            }
                            arrayList.add(new o(str3, fVar2, arrayList2, arrayList3, arrayList4, arrayList5, mVar.f193683g));
                            str2 = str4;
                            i5 = 10;
                            it9 = it10;
                            eVar2 = eVar4;
                        }
                        cVar3.G(arrayList, "trading_add_ons_trading", kii.e.o(o.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 6:
                        List domain7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain7, "domain");
                        this.f253040b.f253044b.f("trading_add_ons_enabled_trading", domain7);
                        return Unit.f186387a;
                    default:
                        List domain8 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain8, "domain");
                        d dVar4 = this.f253040b;
                        ue0.c cVar4 = dVar4.d;
                        List<lbf.j> list6 = domain8;
                        pbf.d dVar5 = dVar4.e;
                        ArrayList arrayList6 = new ArrayList(zhm.w.t(list6, 10));
                        for (lbf.j domain9 : list6) {
                            dVar5.getClass();
                            Intrinsics.checkNotNullParameter(domain9, "domain");
                            String str5 = domain9.f193677a;
                            ZonedDateTime zonedDateTime = domain9.f193678b;
                            lbf.c cVar5 = domain9.f193679c;
                            arrayList6.add(new qbf.m(str5, zonedDateTime, cVar5 != null ? hx7.b.E(cVar5) : null, domain9.d, domain9.e));
                        }
                        cVar4.G(arrayList6, "trading_add_ons_enabled_trading", kii.e.o(qbf.m.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new a(this, 10), new Function2(this) { // from class: rbf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f253040b;

            {
                this.f253040b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                l lVar;
                n nVar;
                qbf.f fVar;
                t tVar;
                String str;
                Iterator it8;
                e eVar;
                qbf.c cVar;
                switch (i2) {
                    case 0:
                        qbf.j domain = (qbf.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f253040b.f253044b.f("trading_add_on_downgrade_survey_config", domain);
                        return Unit.f186387a;
                    case 1:
                        qbf.j domain2 = (qbf.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f253040b.d.G(domain2, "trading_add_on_downgrade_survey_config", z.d(o0.b(qbf.j.class)));
                        return Unit.f186387a;
                    case 2:
                        String id10 = (String) obj2;
                        i domain3 = (i) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f253040b.f253044b.f(czi.c.f(id10), domain3);
                        return Unit.f186387a;
                    case 3:
                        String id11 = (String) obj2;
                        i domain4 = (i) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        d dVar = this.f253040b;
                        ue0.c cVar2 = dVar.d;
                        String strF = czi.c.f(id11);
                        dVar.f.getClass();
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        n nVar2 = null;
                        if (Intrinsics.f(domain4, g.f193675a)) {
                            lVar = new l(true, null);
                        } else {
                            if (!(domain4 instanceof h)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            lbf.l lVar2 = ((h) domain4).f193676a;
                            if (lVar2 != null) {
                                int i3 = pbf.b.f234680b[lVar2.ordinal()];
                                if (i3 == 1) {
                                    nVar = n.NOT_ONBOARDED_FOR_TRADING;
                                } else if (i3 == 2) {
                                    nVar = n.BUY_ORDER_BLOCK_ACTIVE;
                                } else if (i3 == 3) {
                                    nVar = n.ACCOUNT_IS_RESTRICTED;
                                } else {
                                    if (i3 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    nVar = n.UNKNOWN;
                                }
                                nVar2 = nVar;
                            }
                            lVar = new l(false, nVar2);
                        }
                        cVar2.G(lVar, strF, z.d(o0.b(l.class)));
                        return Unit.f186387a;
                    case 4:
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        this.f253040b.f253044b.f("trading_add_ons_trading", domain5);
                        return Unit.f186387a;
                    case 5:
                        List domain6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        String str2 = "domain";
                        Intrinsics.checkNotNullParameter(domain6, "domain");
                        d dVar2 = this.f253040b;
                        ue0.c cVar3 = dVar2.d;
                        List list = domain6;
                        e eVar2 = dVar2.f253045c;
                        int i5 = 10;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            m mVar = (m) it9.next();
                            eVar2.getClass();
                            Intrinsics.checkNotNullParameter(mVar, str2);
                            String str3 = mVar.f193680a;
                            int i6 = pbf.f.f234682b[mVar.f193681b.ordinal()];
                            if (i6 == 1) {
                                fVar = qbf.f.TRADING_PRO;
                            } else {
                                if (i6 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fVar = qbf.f.UNKNOWN;
                            }
                            qbf.f fVar2 = fVar;
                            List<lbf.b> list2 = mVar.f193682c;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, i5));
                            for (lbf.b bVar : list2) {
                                qbf.b bVarE = hx7.b.E(bVar.f193666a);
                                Period period = bVar.f193667b;
                                jo3.a aVarP = mo3.a.p(bVar.f193668c);
                                lbf.d dVar3 = bVar.d;
                                if (dVar3 != null) {
                                    str = str2;
                                    it8 = it9;
                                    eVar = eVar2;
                                    cVar = new qbf.c(dVar3.f193669a, dVar3.f193670b, dVar3.f193671c, mo3.a.p(dVar3.d));
                                } else {
                                    str = str2;
                                    it8 = it9;
                                    eVar = eVar2;
                                    cVar = null;
                                }
                                lbf.e eVar3 = bVar.e;
                                arrayList2.add(new qbf.d(bVarE, period, aVarP, cVar, eVar3 != null ? new qbf.e(eVar3.f193672a, eVar3.f193673b, eVar3.f193674c) : null));
                                str2 = str;
                                it9 = it8;
                                eVar2 = eVar;
                            }
                            String str4 = str2;
                            Iterator it10 = it9;
                            e eVar4 = eVar2;
                            List list3 = mVar.d;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                            Iterator it11 = list3.iterator();
                            while (it11.hasNext()) {
                                switch (pbf.f.d[((k) it11.next()).ordinal()]) {
                                    case 1:
                                        tVar = t.UNKNOWN;
                                        break;
                                    case 2:
                                        tVar = t.STOCKS;
                                        break;
                                    case 3:
                                        tVar = t.CRYPTO;
                                        break;
                                    case 4:
                                        tVar = t.ADVANCED_PORTFOLIO_ANALYTICS;
                                        break;
                                    case 5:
                                        tVar = t.ADVANCED_WEB_TRADING_TERMINAL;
                                        break;
                                    case 6:
                                        tVar = t.EXTENDED_SECURITIES;
                                        break;
                                    case 7:
                                        tVar = t.INCREASED_ORDER_LIMITS;
                                        break;
                                    case 8:
                                        tVar = t.DEDICATED_CUSTOMER_SUPPORT;
                                        break;
                                    case 9:
                                        tVar = t.NO_MINIMUM_FEES;
                                        break;
                                    case 10:
                                        tVar = t.ORDER_BOOK;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                                arrayList3.add(tVar);
                            }
                            List list4 = mVar.e;
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it12 = list4.iterator();
                            while (it12.hasNext()) {
                                arrayList4.add(hx7.e.d((lbf.n) it12.next()));
                            }
                            List list5 = mVar.f;
                            ArrayList arrayList5 = new ArrayList(zhm.w.t(list5, 10));
                            Iterator it13 = list5.iterator();
                            while (it13.hasNext()) {
                                arrayList5.add(hx7.e.d((lbf.n) it13.next()));
                            }
                            arrayList.add(new o(str3, fVar2, arrayList2, arrayList3, arrayList4, arrayList5, mVar.f193683g));
                            str2 = str4;
                            i5 = 10;
                            it9 = it10;
                            eVar2 = eVar4;
                        }
                        cVar3.G(arrayList, "trading_add_ons_trading", kii.e.o(o.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 6:
                        List domain7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain7, "domain");
                        this.f253040b.f253044b.f("trading_add_ons_enabled_trading", domain7);
                        return Unit.f186387a;
                    default:
                        List domain8 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain8, "domain");
                        d dVar4 = this.f253040b;
                        ue0.c cVar4 = dVar4.d;
                        List<lbf.j> list6 = domain8;
                        pbf.d dVar5 = dVar4.e;
                        ArrayList arrayList6 = new ArrayList(zhm.w.t(list6, 10));
                        for (lbf.j domain9 : list6) {
                            dVar5.getClass();
                            Intrinsics.checkNotNullParameter(domain9, "domain");
                            String str5 = domain9.f193677a;
                            ZonedDateTime zonedDateTime = domain9.f193678b;
                            lbf.c cVar5 = domain9.f193679c;
                            arrayList6.add(new qbf.m(str5, zonedDateTime, cVar5 != null ? hx7.b.E(cVar5) : null, domain9.d, domain9.e));
                        }
                        cVar4.G(arrayList6, "trading_add_ons_enabled_trading", kii.e.o(qbf.m.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i3 = 6;
        final int i5 = 7;
        this.f253047h = new f(w.k0(networkStateRepository, new a(this, 12)), new a(this, 13), new Function2(this) { // from class: rbf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f253040b;

            {
                this.f253040b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                l lVar;
                n nVar;
                qbf.f fVar;
                t tVar;
                String str;
                Iterator it8;
                e eVar;
                qbf.c cVar;
                switch (i3) {
                    case 0:
                        qbf.j domain = (qbf.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f253040b.f253044b.f("trading_add_on_downgrade_survey_config", domain);
                        return Unit.f186387a;
                    case 1:
                        qbf.j domain2 = (qbf.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f253040b.d.G(domain2, "trading_add_on_downgrade_survey_config", z.d(o0.b(qbf.j.class)));
                        return Unit.f186387a;
                    case 2:
                        String id10 = (String) obj2;
                        i domain3 = (i) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f253040b.f253044b.f(czi.c.f(id10), domain3);
                        return Unit.f186387a;
                    case 3:
                        String id11 = (String) obj2;
                        i domain4 = (i) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        d dVar = this.f253040b;
                        ue0.c cVar2 = dVar.d;
                        String strF = czi.c.f(id11);
                        dVar.f.getClass();
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        n nVar2 = null;
                        if (Intrinsics.f(domain4, g.f193675a)) {
                            lVar = new l(true, null);
                        } else {
                            if (!(domain4 instanceof h)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            lbf.l lVar2 = ((h) domain4).f193676a;
                            if (lVar2 != null) {
                                int i32 = pbf.b.f234680b[lVar2.ordinal()];
                                if (i32 == 1) {
                                    nVar = n.NOT_ONBOARDED_FOR_TRADING;
                                } else if (i32 == 2) {
                                    nVar = n.BUY_ORDER_BLOCK_ACTIVE;
                                } else if (i32 == 3) {
                                    nVar = n.ACCOUNT_IS_RESTRICTED;
                                } else {
                                    if (i32 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    nVar = n.UNKNOWN;
                                }
                                nVar2 = nVar;
                            }
                            lVar = new l(false, nVar2);
                        }
                        cVar2.G(lVar, strF, z.d(o0.b(l.class)));
                        return Unit.f186387a;
                    case 4:
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        this.f253040b.f253044b.f("trading_add_ons_trading", domain5);
                        return Unit.f186387a;
                    case 5:
                        List domain6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        String str2 = "domain";
                        Intrinsics.checkNotNullParameter(domain6, "domain");
                        d dVar2 = this.f253040b;
                        ue0.c cVar3 = dVar2.d;
                        List list = domain6;
                        e eVar2 = dVar2.f253045c;
                        int i59 = 10;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            m mVar = (m) it9.next();
                            eVar2.getClass();
                            Intrinsics.checkNotNullParameter(mVar, str2);
                            String str3 = mVar.f193680a;
                            int i6 = pbf.f.f234682b[mVar.f193681b.ordinal()];
                            if (i6 == 1) {
                                fVar = qbf.f.TRADING_PRO;
                            } else {
                                if (i6 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fVar = qbf.f.UNKNOWN;
                            }
                            qbf.f fVar2 = fVar;
                            List<lbf.b> list2 = mVar.f193682c;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, i59));
                            for (lbf.b bVar : list2) {
                                qbf.b bVarE = hx7.b.E(bVar.f193666a);
                                Period period = bVar.f193667b;
                                jo3.a aVarP = mo3.a.p(bVar.f193668c);
                                lbf.d dVar3 = bVar.d;
                                if (dVar3 != null) {
                                    str = str2;
                                    it8 = it9;
                                    eVar = eVar2;
                                    cVar = new qbf.c(dVar3.f193669a, dVar3.f193670b, dVar3.f193671c, mo3.a.p(dVar3.d));
                                } else {
                                    str = str2;
                                    it8 = it9;
                                    eVar = eVar2;
                                    cVar = null;
                                }
                                lbf.e eVar3 = bVar.e;
                                arrayList2.add(new qbf.d(bVarE, period, aVarP, cVar, eVar3 != null ? new qbf.e(eVar3.f193672a, eVar3.f193673b, eVar3.f193674c) : null));
                                str2 = str;
                                it9 = it8;
                                eVar2 = eVar;
                            }
                            String str4 = str2;
                            Iterator it10 = it9;
                            e eVar4 = eVar2;
                            List list3 = mVar.d;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                            Iterator it11 = list3.iterator();
                            while (it11.hasNext()) {
                                switch (pbf.f.d[((k) it11.next()).ordinal()]) {
                                    case 1:
                                        tVar = t.UNKNOWN;
                                        break;
                                    case 2:
                                        tVar = t.STOCKS;
                                        break;
                                    case 3:
                                        tVar = t.CRYPTO;
                                        break;
                                    case 4:
                                        tVar = t.ADVANCED_PORTFOLIO_ANALYTICS;
                                        break;
                                    case 5:
                                        tVar = t.ADVANCED_WEB_TRADING_TERMINAL;
                                        break;
                                    case 6:
                                        tVar = t.EXTENDED_SECURITIES;
                                        break;
                                    case 7:
                                        tVar = t.INCREASED_ORDER_LIMITS;
                                        break;
                                    case 8:
                                        tVar = t.DEDICATED_CUSTOMER_SUPPORT;
                                        break;
                                    case 9:
                                        tVar = t.NO_MINIMUM_FEES;
                                        break;
                                    case 10:
                                        tVar = t.ORDER_BOOK;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                                arrayList3.add(tVar);
                            }
                            List list4 = mVar.e;
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it12 = list4.iterator();
                            while (it12.hasNext()) {
                                arrayList4.add(hx7.e.d((lbf.n) it12.next()));
                            }
                            List list5 = mVar.f;
                            ArrayList arrayList5 = new ArrayList(zhm.w.t(list5, 10));
                            Iterator it13 = list5.iterator();
                            while (it13.hasNext()) {
                                arrayList5.add(hx7.e.d((lbf.n) it13.next()));
                            }
                            arrayList.add(new o(str3, fVar2, arrayList2, arrayList3, arrayList4, arrayList5, mVar.f193683g));
                            str2 = str4;
                            i59 = 10;
                            it9 = it10;
                            eVar2 = eVar4;
                        }
                        cVar3.G(arrayList, "trading_add_ons_trading", kii.e.o(o.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 6:
                        List domain7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain7, "domain");
                        this.f253040b.f253044b.f("trading_add_ons_enabled_trading", domain7);
                        return Unit.f186387a;
                    default:
                        List domain8 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain8, "domain");
                        d dVar4 = this.f253040b;
                        ue0.c cVar4 = dVar4.d;
                        List<lbf.j> list6 = domain8;
                        pbf.d dVar5 = dVar4.e;
                        ArrayList arrayList6 = new ArrayList(zhm.w.t(list6, 10));
                        for (lbf.j domain9 : list6) {
                            dVar5.getClass();
                            Intrinsics.checkNotNullParameter(domain9, "domain");
                            String str5 = domain9.f193677a;
                            ZonedDateTime zonedDateTime = domain9.f193678b;
                            lbf.c cVar5 = domain9.f193679c;
                            arrayList6.add(new qbf.m(str5, zonedDateTime, cVar5 != null ? hx7.b.E(cVar5) : null, domain9.d, domain9.e));
                        }
                        cVar4.G(arrayList6, "trading_add_ons_enabled_trading", kii.e.o(qbf.m.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new a(this, 14), new Function2(this) { // from class: rbf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f253040b;

            {
                this.f253040b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                l lVar;
                n nVar;
                qbf.f fVar;
                t tVar;
                String str;
                Iterator it8;
                e eVar;
                qbf.c cVar;
                switch (i5) {
                    case 0:
                        qbf.j domain = (qbf.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f253040b.f253044b.f("trading_add_on_downgrade_survey_config", domain);
                        return Unit.f186387a;
                    case 1:
                        qbf.j domain2 = (qbf.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f253040b.d.G(domain2, "trading_add_on_downgrade_survey_config", z.d(o0.b(qbf.j.class)));
                        return Unit.f186387a;
                    case 2:
                        String id10 = (String) obj2;
                        i domain3 = (i) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f253040b.f253044b.f(czi.c.f(id10), domain3);
                        return Unit.f186387a;
                    case 3:
                        String id11 = (String) obj2;
                        i domain4 = (i) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        d dVar = this.f253040b;
                        ue0.c cVar2 = dVar.d;
                        String strF = czi.c.f(id11);
                        dVar.f.getClass();
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        n nVar2 = null;
                        if (Intrinsics.f(domain4, g.f193675a)) {
                            lVar = new l(true, null);
                        } else {
                            if (!(domain4 instanceof h)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            lbf.l lVar2 = ((h) domain4).f193676a;
                            if (lVar2 != null) {
                                int i32 = pbf.b.f234680b[lVar2.ordinal()];
                                if (i32 == 1) {
                                    nVar = n.NOT_ONBOARDED_FOR_TRADING;
                                } else if (i32 == 2) {
                                    nVar = n.BUY_ORDER_BLOCK_ACTIVE;
                                } else if (i32 == 3) {
                                    nVar = n.ACCOUNT_IS_RESTRICTED;
                                } else {
                                    if (i32 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    nVar = n.UNKNOWN;
                                }
                                nVar2 = nVar;
                            }
                            lVar = new l(false, nVar2);
                        }
                        cVar2.G(lVar, strF, z.d(o0.b(l.class)));
                        return Unit.f186387a;
                    case 4:
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        this.f253040b.f253044b.f("trading_add_ons_trading", domain5);
                        return Unit.f186387a;
                    case 5:
                        List domain6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        String str2 = "domain";
                        Intrinsics.checkNotNullParameter(domain6, "domain");
                        d dVar2 = this.f253040b;
                        ue0.c cVar3 = dVar2.d;
                        List list = domain6;
                        e eVar2 = dVar2.f253045c;
                        int i59 = 10;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            m mVar = (m) it9.next();
                            eVar2.getClass();
                            Intrinsics.checkNotNullParameter(mVar, str2);
                            String str3 = mVar.f193680a;
                            int i6 = pbf.f.f234682b[mVar.f193681b.ordinal()];
                            if (i6 == 1) {
                                fVar = qbf.f.TRADING_PRO;
                            } else {
                                if (i6 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fVar = qbf.f.UNKNOWN;
                            }
                            qbf.f fVar2 = fVar;
                            List<lbf.b> list2 = mVar.f193682c;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, i59));
                            for (lbf.b bVar : list2) {
                                qbf.b bVarE = hx7.b.E(bVar.f193666a);
                                Period period = bVar.f193667b;
                                jo3.a aVarP = mo3.a.p(bVar.f193668c);
                                lbf.d dVar3 = bVar.d;
                                if (dVar3 != null) {
                                    str = str2;
                                    it8 = it9;
                                    eVar = eVar2;
                                    cVar = new qbf.c(dVar3.f193669a, dVar3.f193670b, dVar3.f193671c, mo3.a.p(dVar3.d));
                                } else {
                                    str = str2;
                                    it8 = it9;
                                    eVar = eVar2;
                                    cVar = null;
                                }
                                lbf.e eVar3 = bVar.e;
                                arrayList2.add(new qbf.d(bVarE, period, aVarP, cVar, eVar3 != null ? new qbf.e(eVar3.f193672a, eVar3.f193673b, eVar3.f193674c) : null));
                                str2 = str;
                                it9 = it8;
                                eVar2 = eVar;
                            }
                            String str4 = str2;
                            Iterator it10 = it9;
                            e eVar4 = eVar2;
                            List list3 = mVar.d;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                            Iterator it11 = list3.iterator();
                            while (it11.hasNext()) {
                                switch (pbf.f.d[((k) it11.next()).ordinal()]) {
                                    case 1:
                                        tVar = t.UNKNOWN;
                                        break;
                                    case 2:
                                        tVar = t.STOCKS;
                                        break;
                                    case 3:
                                        tVar = t.CRYPTO;
                                        break;
                                    case 4:
                                        tVar = t.ADVANCED_PORTFOLIO_ANALYTICS;
                                        break;
                                    case 5:
                                        tVar = t.ADVANCED_WEB_TRADING_TERMINAL;
                                        break;
                                    case 6:
                                        tVar = t.EXTENDED_SECURITIES;
                                        break;
                                    case 7:
                                        tVar = t.INCREASED_ORDER_LIMITS;
                                        break;
                                    case 8:
                                        tVar = t.DEDICATED_CUSTOMER_SUPPORT;
                                        break;
                                    case 9:
                                        tVar = t.NO_MINIMUM_FEES;
                                        break;
                                    case 10:
                                        tVar = t.ORDER_BOOK;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                                arrayList3.add(tVar);
                            }
                            List list4 = mVar.e;
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it12 = list4.iterator();
                            while (it12.hasNext()) {
                                arrayList4.add(hx7.e.d((lbf.n) it12.next()));
                            }
                            List list5 = mVar.f;
                            ArrayList arrayList5 = new ArrayList(zhm.w.t(list5, 10));
                            Iterator it13 = list5.iterator();
                            while (it13.hasNext()) {
                                arrayList5.add(hx7.e.d((lbf.n) it13.next()));
                            }
                            arrayList.add(new o(str3, fVar2, arrayList2, arrayList3, arrayList4, arrayList5, mVar.f193683g));
                            str2 = str4;
                            i59 = 10;
                            it9 = it10;
                            eVar2 = eVar4;
                        }
                        cVar3.G(arrayList, "trading_add_ons_trading", kii.e.o(o.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 6:
                        List domain7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain7, "domain");
                        this.f253040b.f253044b.f("trading_add_ons_enabled_trading", domain7);
                        return Unit.f186387a;
                    default:
                        List domain8 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain8, "domain");
                        d dVar4 = this.f253040b;
                        ue0.c cVar4 = dVar4.d;
                        List<lbf.j> list6 = domain8;
                        pbf.d dVar5 = dVar4.e;
                        ArrayList arrayList6 = new ArrayList(zhm.w.t(list6, 10));
                        for (lbf.j domain9 : list6) {
                            dVar5.getClass();
                            Intrinsics.checkNotNullParameter(domain9, "domain");
                            String str5 = domain9.f193677a;
                            ZonedDateTime zonedDateTime = domain9.f193678b;
                            lbf.c cVar5 = domain9.f193679c;
                            arrayList6.add(new qbf.m(str5, zonedDateTime, cVar5 != null ? hx7.b.E(cVar5) : null, domain9.d, domain9.e));
                        }
                        cVar4.G(arrayList6, "trading_add_ons_enabled_trading", kii.e.o(qbf.m.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i6 = 0;
        final int i21 = 1;
        this.i = new f(w.k0(networkStateRepository, new a(this, 3)), new a(this, 4), new Function2(this) { // from class: rbf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f253040b;

            {
                this.f253040b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                l lVar;
                n nVar;
                qbf.f fVar;
                t tVar;
                String str;
                Iterator it8;
                e eVar;
                qbf.c cVar;
                switch (i6) {
                    case 0:
                        qbf.j domain = (qbf.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f253040b.f253044b.f("trading_add_on_downgrade_survey_config", domain);
                        return Unit.f186387a;
                    case 1:
                        qbf.j domain2 = (qbf.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f253040b.d.G(domain2, "trading_add_on_downgrade_survey_config", z.d(o0.b(qbf.j.class)));
                        return Unit.f186387a;
                    case 2:
                        String id10 = (String) obj2;
                        i domain3 = (i) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f253040b.f253044b.f(czi.c.f(id10), domain3);
                        return Unit.f186387a;
                    case 3:
                        String id11 = (String) obj2;
                        i domain4 = (i) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        d dVar = this.f253040b;
                        ue0.c cVar2 = dVar.d;
                        String strF = czi.c.f(id11);
                        dVar.f.getClass();
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        n nVar2 = null;
                        if (Intrinsics.f(domain4, g.f193675a)) {
                            lVar = new l(true, null);
                        } else {
                            if (!(domain4 instanceof h)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            lbf.l lVar2 = ((h) domain4).f193676a;
                            if (lVar2 != null) {
                                int i32 = pbf.b.f234680b[lVar2.ordinal()];
                                if (i32 == 1) {
                                    nVar = n.NOT_ONBOARDED_FOR_TRADING;
                                } else if (i32 == 2) {
                                    nVar = n.BUY_ORDER_BLOCK_ACTIVE;
                                } else if (i32 == 3) {
                                    nVar = n.ACCOUNT_IS_RESTRICTED;
                                } else {
                                    if (i32 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    nVar = n.UNKNOWN;
                                }
                                nVar2 = nVar;
                            }
                            lVar = new l(false, nVar2);
                        }
                        cVar2.G(lVar, strF, z.d(o0.b(l.class)));
                        return Unit.f186387a;
                    case 4:
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        this.f253040b.f253044b.f("trading_add_ons_trading", domain5);
                        return Unit.f186387a;
                    case 5:
                        List domain6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        String str2 = "domain";
                        Intrinsics.checkNotNullParameter(domain6, "domain");
                        d dVar2 = this.f253040b;
                        ue0.c cVar3 = dVar2.d;
                        List list = domain6;
                        e eVar2 = dVar2.f253045c;
                        int i59 = 10;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            m mVar = (m) it9.next();
                            eVar2.getClass();
                            Intrinsics.checkNotNullParameter(mVar, str2);
                            String str3 = mVar.f193680a;
                            int i66 = pbf.f.f234682b[mVar.f193681b.ordinal()];
                            if (i66 == 1) {
                                fVar = qbf.f.TRADING_PRO;
                            } else {
                                if (i66 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fVar = qbf.f.UNKNOWN;
                            }
                            qbf.f fVar2 = fVar;
                            List<lbf.b> list2 = mVar.f193682c;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, i59));
                            for (lbf.b bVar : list2) {
                                qbf.b bVarE = hx7.b.E(bVar.f193666a);
                                Period period = bVar.f193667b;
                                jo3.a aVarP = mo3.a.p(bVar.f193668c);
                                lbf.d dVar3 = bVar.d;
                                if (dVar3 != null) {
                                    str = str2;
                                    it8 = it9;
                                    eVar = eVar2;
                                    cVar = new qbf.c(dVar3.f193669a, dVar3.f193670b, dVar3.f193671c, mo3.a.p(dVar3.d));
                                } else {
                                    str = str2;
                                    it8 = it9;
                                    eVar = eVar2;
                                    cVar = null;
                                }
                                lbf.e eVar3 = bVar.e;
                                arrayList2.add(new qbf.d(bVarE, period, aVarP, cVar, eVar3 != null ? new qbf.e(eVar3.f193672a, eVar3.f193673b, eVar3.f193674c) : null));
                                str2 = str;
                                it9 = it8;
                                eVar2 = eVar;
                            }
                            String str4 = str2;
                            Iterator it10 = it9;
                            e eVar4 = eVar2;
                            List list3 = mVar.d;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                            Iterator it11 = list3.iterator();
                            while (it11.hasNext()) {
                                switch (pbf.f.d[((k) it11.next()).ordinal()]) {
                                    case 1:
                                        tVar = t.UNKNOWN;
                                        break;
                                    case 2:
                                        tVar = t.STOCKS;
                                        break;
                                    case 3:
                                        tVar = t.CRYPTO;
                                        break;
                                    case 4:
                                        tVar = t.ADVANCED_PORTFOLIO_ANALYTICS;
                                        break;
                                    case 5:
                                        tVar = t.ADVANCED_WEB_TRADING_TERMINAL;
                                        break;
                                    case 6:
                                        tVar = t.EXTENDED_SECURITIES;
                                        break;
                                    case 7:
                                        tVar = t.INCREASED_ORDER_LIMITS;
                                        break;
                                    case 8:
                                        tVar = t.DEDICATED_CUSTOMER_SUPPORT;
                                        break;
                                    case 9:
                                        tVar = t.NO_MINIMUM_FEES;
                                        break;
                                    case 10:
                                        tVar = t.ORDER_BOOK;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                                arrayList3.add(tVar);
                            }
                            List list4 = mVar.e;
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it12 = list4.iterator();
                            while (it12.hasNext()) {
                                arrayList4.add(hx7.e.d((lbf.n) it12.next()));
                            }
                            List list5 = mVar.f;
                            ArrayList arrayList5 = new ArrayList(zhm.w.t(list5, 10));
                            Iterator it13 = list5.iterator();
                            while (it13.hasNext()) {
                                arrayList5.add(hx7.e.d((lbf.n) it13.next()));
                            }
                            arrayList.add(new o(str3, fVar2, arrayList2, arrayList3, arrayList4, arrayList5, mVar.f193683g));
                            str2 = str4;
                            i59 = 10;
                            it9 = it10;
                            eVar2 = eVar4;
                        }
                        cVar3.G(arrayList, "trading_add_ons_trading", kii.e.o(o.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 6:
                        List domain7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain7, "domain");
                        this.f253040b.f253044b.f("trading_add_ons_enabled_trading", domain7);
                        return Unit.f186387a;
                    default:
                        List domain8 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain8, "domain");
                        d dVar4 = this.f253040b;
                        ue0.c cVar4 = dVar4.d;
                        List<lbf.j> list6 = domain8;
                        pbf.d dVar5 = dVar4.e;
                        ArrayList arrayList6 = new ArrayList(zhm.w.t(list6, 10));
                        for (lbf.j domain9 : list6) {
                            dVar5.getClass();
                            Intrinsics.checkNotNullParameter(domain9, "domain");
                            String str5 = domain9.f193677a;
                            ZonedDateTime zonedDateTime = domain9.f193678b;
                            lbf.c cVar5 = domain9.f193679c;
                            arrayList6.add(new qbf.m(str5, zonedDateTime, cVar5 != null ? hx7.b.E(cVar5) : null, domain9.d, domain9.e));
                        }
                        cVar4.G(arrayList6, "trading_add_ons_enabled_trading", kii.e.o(qbf.m.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new a(this, 5), new Function2(this) { // from class: rbf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f253040b;

            {
                this.f253040b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                l lVar;
                n nVar;
                qbf.f fVar;
                t tVar;
                String str;
                Iterator it8;
                e eVar;
                qbf.c cVar;
                switch (i21) {
                    case 0:
                        qbf.j domain = (qbf.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f253040b.f253044b.f("trading_add_on_downgrade_survey_config", domain);
                        return Unit.f186387a;
                    case 1:
                        qbf.j domain2 = (qbf.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f253040b.d.G(domain2, "trading_add_on_downgrade_survey_config", z.d(o0.b(qbf.j.class)));
                        return Unit.f186387a;
                    case 2:
                        String id10 = (String) obj2;
                        i domain3 = (i) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f253040b.f253044b.f(czi.c.f(id10), domain3);
                        return Unit.f186387a;
                    case 3:
                        String id11 = (String) obj2;
                        i domain4 = (i) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        d dVar = this.f253040b;
                        ue0.c cVar2 = dVar.d;
                        String strF = czi.c.f(id11);
                        dVar.f.getClass();
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        n nVar2 = null;
                        if (Intrinsics.f(domain4, g.f193675a)) {
                            lVar = new l(true, null);
                        } else {
                            if (!(domain4 instanceof h)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            lbf.l lVar2 = ((h) domain4).f193676a;
                            if (lVar2 != null) {
                                int i32 = pbf.b.f234680b[lVar2.ordinal()];
                                if (i32 == 1) {
                                    nVar = n.NOT_ONBOARDED_FOR_TRADING;
                                } else if (i32 == 2) {
                                    nVar = n.BUY_ORDER_BLOCK_ACTIVE;
                                } else if (i32 == 3) {
                                    nVar = n.ACCOUNT_IS_RESTRICTED;
                                } else {
                                    if (i32 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    nVar = n.UNKNOWN;
                                }
                                nVar2 = nVar;
                            }
                            lVar = new l(false, nVar2);
                        }
                        cVar2.G(lVar, strF, z.d(o0.b(l.class)));
                        return Unit.f186387a;
                    case 4:
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        this.f253040b.f253044b.f("trading_add_ons_trading", domain5);
                        return Unit.f186387a;
                    case 5:
                        List domain6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        String str2 = "domain";
                        Intrinsics.checkNotNullParameter(domain6, "domain");
                        d dVar2 = this.f253040b;
                        ue0.c cVar3 = dVar2.d;
                        List list = domain6;
                        e eVar2 = dVar2.f253045c;
                        int i59 = 10;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            m mVar = (m) it9.next();
                            eVar2.getClass();
                            Intrinsics.checkNotNullParameter(mVar, str2);
                            String str3 = mVar.f193680a;
                            int i66 = pbf.f.f234682b[mVar.f193681b.ordinal()];
                            if (i66 == 1) {
                                fVar = qbf.f.TRADING_PRO;
                            } else {
                                if (i66 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fVar = qbf.f.UNKNOWN;
                            }
                            qbf.f fVar2 = fVar;
                            List<lbf.b> list2 = mVar.f193682c;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, i59));
                            for (lbf.b bVar : list2) {
                                qbf.b bVarE = hx7.b.E(bVar.f193666a);
                                Period period = bVar.f193667b;
                                jo3.a aVarP = mo3.a.p(bVar.f193668c);
                                lbf.d dVar3 = bVar.d;
                                if (dVar3 != null) {
                                    str = str2;
                                    it8 = it9;
                                    eVar = eVar2;
                                    cVar = new qbf.c(dVar3.f193669a, dVar3.f193670b, dVar3.f193671c, mo3.a.p(dVar3.d));
                                } else {
                                    str = str2;
                                    it8 = it9;
                                    eVar = eVar2;
                                    cVar = null;
                                }
                                lbf.e eVar3 = bVar.e;
                                arrayList2.add(new qbf.d(bVarE, period, aVarP, cVar, eVar3 != null ? new qbf.e(eVar3.f193672a, eVar3.f193673b, eVar3.f193674c) : null));
                                str2 = str;
                                it9 = it8;
                                eVar2 = eVar;
                            }
                            String str4 = str2;
                            Iterator it10 = it9;
                            e eVar4 = eVar2;
                            List list3 = mVar.d;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                            Iterator it11 = list3.iterator();
                            while (it11.hasNext()) {
                                switch (pbf.f.d[((k) it11.next()).ordinal()]) {
                                    case 1:
                                        tVar = t.UNKNOWN;
                                        break;
                                    case 2:
                                        tVar = t.STOCKS;
                                        break;
                                    case 3:
                                        tVar = t.CRYPTO;
                                        break;
                                    case 4:
                                        tVar = t.ADVANCED_PORTFOLIO_ANALYTICS;
                                        break;
                                    case 5:
                                        tVar = t.ADVANCED_WEB_TRADING_TERMINAL;
                                        break;
                                    case 6:
                                        tVar = t.EXTENDED_SECURITIES;
                                        break;
                                    case 7:
                                        tVar = t.INCREASED_ORDER_LIMITS;
                                        break;
                                    case 8:
                                        tVar = t.DEDICATED_CUSTOMER_SUPPORT;
                                        break;
                                    case 9:
                                        tVar = t.NO_MINIMUM_FEES;
                                        break;
                                    case 10:
                                        tVar = t.ORDER_BOOK;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                                arrayList3.add(tVar);
                            }
                            List list4 = mVar.e;
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it12 = list4.iterator();
                            while (it12.hasNext()) {
                                arrayList4.add(hx7.e.d((lbf.n) it12.next()));
                            }
                            List list5 = mVar.f;
                            ArrayList arrayList5 = new ArrayList(zhm.w.t(list5, 10));
                            Iterator it13 = list5.iterator();
                            while (it13.hasNext()) {
                                arrayList5.add(hx7.e.d((lbf.n) it13.next()));
                            }
                            arrayList.add(new o(str3, fVar2, arrayList2, arrayList3, arrayList4, arrayList5, mVar.f193683g));
                            str2 = str4;
                            i59 = 10;
                            it9 = it10;
                            eVar2 = eVar4;
                        }
                        cVar3.G(arrayList, "trading_add_ons_trading", kii.e.o(o.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 6:
                        List domain7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain7, "domain");
                        this.f253040b.f253044b.f("trading_add_ons_enabled_trading", domain7);
                        return Unit.f186387a;
                    default:
                        List domain8 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain8, "domain");
                        d dVar4 = this.f253040b;
                        ue0.c cVar4 = dVar4.d;
                        List<lbf.j> list6 = domain8;
                        pbf.d dVar5 = dVar4.e;
                        ArrayList arrayList6 = new ArrayList(zhm.w.t(list6, 10));
                        for (lbf.j domain9 : list6) {
                            dVar5.getClass();
                            Intrinsics.checkNotNullParameter(domain9, "domain");
                            String str5 = domain9.f193677a;
                            ZonedDateTime zonedDateTime = domain9.f193678b;
                            lbf.c cVar5 = domain9.f193679c;
                            arrayList6.add(new qbf.m(str5, zonedDateTime, cVar5 != null ? hx7.b.E(cVar5) : null, domain9.d, domain9.e));
                        }
                        cVar4.G(arrayList6, "trading_add_ons_enabled_trading", kii.e.o(qbf.m.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i22 = 2;
        final int i32 = 3;
        this.f253048j = new f(w.k0(networkStateRepository, new a(this, 6)), new a(this, 7), new Function2(this) { // from class: rbf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f253040b;

            {
                this.f253040b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                l lVar;
                n nVar;
                qbf.f fVar;
                t tVar;
                String str;
                Iterator it8;
                e eVar;
                qbf.c cVar;
                switch (i22) {
                    case 0:
                        qbf.j domain = (qbf.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f253040b.f253044b.f("trading_add_on_downgrade_survey_config", domain);
                        return Unit.f186387a;
                    case 1:
                        qbf.j domain2 = (qbf.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f253040b.d.G(domain2, "trading_add_on_downgrade_survey_config", z.d(o0.b(qbf.j.class)));
                        return Unit.f186387a;
                    case 2:
                        String id10 = (String) obj2;
                        i domain3 = (i) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f253040b.f253044b.f(czi.c.f(id10), domain3);
                        return Unit.f186387a;
                    case 3:
                        String id11 = (String) obj2;
                        i domain4 = (i) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        d dVar = this.f253040b;
                        ue0.c cVar2 = dVar.d;
                        String strF = czi.c.f(id11);
                        dVar.f.getClass();
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        n nVar2 = null;
                        if (Intrinsics.f(domain4, g.f193675a)) {
                            lVar = new l(true, null);
                        } else {
                            if (!(domain4 instanceof h)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            lbf.l lVar2 = ((h) domain4).f193676a;
                            if (lVar2 != null) {
                                int i322 = pbf.b.f234680b[lVar2.ordinal()];
                                if (i322 == 1) {
                                    nVar = n.NOT_ONBOARDED_FOR_TRADING;
                                } else if (i322 == 2) {
                                    nVar = n.BUY_ORDER_BLOCK_ACTIVE;
                                } else if (i322 == 3) {
                                    nVar = n.ACCOUNT_IS_RESTRICTED;
                                } else {
                                    if (i322 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    nVar = n.UNKNOWN;
                                }
                                nVar2 = nVar;
                            }
                            lVar = new l(false, nVar2);
                        }
                        cVar2.G(lVar, strF, z.d(o0.b(l.class)));
                        return Unit.f186387a;
                    case 4:
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        this.f253040b.f253044b.f("trading_add_ons_trading", domain5);
                        return Unit.f186387a;
                    case 5:
                        List domain6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        String str2 = "domain";
                        Intrinsics.checkNotNullParameter(domain6, "domain");
                        d dVar2 = this.f253040b;
                        ue0.c cVar3 = dVar2.d;
                        List list = domain6;
                        e eVar2 = dVar2.f253045c;
                        int i59 = 10;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            m mVar = (m) it9.next();
                            eVar2.getClass();
                            Intrinsics.checkNotNullParameter(mVar, str2);
                            String str3 = mVar.f193680a;
                            int i66 = pbf.f.f234682b[mVar.f193681b.ordinal()];
                            if (i66 == 1) {
                                fVar = qbf.f.TRADING_PRO;
                            } else {
                                if (i66 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fVar = qbf.f.UNKNOWN;
                            }
                            qbf.f fVar2 = fVar;
                            List<lbf.b> list2 = mVar.f193682c;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, i59));
                            for (lbf.b bVar : list2) {
                                qbf.b bVarE = hx7.b.E(bVar.f193666a);
                                Period period = bVar.f193667b;
                                jo3.a aVarP = mo3.a.p(bVar.f193668c);
                                lbf.d dVar3 = bVar.d;
                                if (dVar3 != null) {
                                    str = str2;
                                    it8 = it9;
                                    eVar = eVar2;
                                    cVar = new qbf.c(dVar3.f193669a, dVar3.f193670b, dVar3.f193671c, mo3.a.p(dVar3.d));
                                } else {
                                    str = str2;
                                    it8 = it9;
                                    eVar = eVar2;
                                    cVar = null;
                                }
                                lbf.e eVar3 = bVar.e;
                                arrayList2.add(new qbf.d(bVarE, period, aVarP, cVar, eVar3 != null ? new qbf.e(eVar3.f193672a, eVar3.f193673b, eVar3.f193674c) : null));
                                str2 = str;
                                it9 = it8;
                                eVar2 = eVar;
                            }
                            String str4 = str2;
                            Iterator it10 = it9;
                            e eVar4 = eVar2;
                            List list3 = mVar.d;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                            Iterator it11 = list3.iterator();
                            while (it11.hasNext()) {
                                switch (pbf.f.d[((k) it11.next()).ordinal()]) {
                                    case 1:
                                        tVar = t.UNKNOWN;
                                        break;
                                    case 2:
                                        tVar = t.STOCKS;
                                        break;
                                    case 3:
                                        tVar = t.CRYPTO;
                                        break;
                                    case 4:
                                        tVar = t.ADVANCED_PORTFOLIO_ANALYTICS;
                                        break;
                                    case 5:
                                        tVar = t.ADVANCED_WEB_TRADING_TERMINAL;
                                        break;
                                    case 6:
                                        tVar = t.EXTENDED_SECURITIES;
                                        break;
                                    case 7:
                                        tVar = t.INCREASED_ORDER_LIMITS;
                                        break;
                                    case 8:
                                        tVar = t.DEDICATED_CUSTOMER_SUPPORT;
                                        break;
                                    case 9:
                                        tVar = t.NO_MINIMUM_FEES;
                                        break;
                                    case 10:
                                        tVar = t.ORDER_BOOK;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                                arrayList3.add(tVar);
                            }
                            List list4 = mVar.e;
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it12 = list4.iterator();
                            while (it12.hasNext()) {
                                arrayList4.add(hx7.e.d((lbf.n) it12.next()));
                            }
                            List list5 = mVar.f;
                            ArrayList arrayList5 = new ArrayList(zhm.w.t(list5, 10));
                            Iterator it13 = list5.iterator();
                            while (it13.hasNext()) {
                                arrayList5.add(hx7.e.d((lbf.n) it13.next()));
                            }
                            arrayList.add(new o(str3, fVar2, arrayList2, arrayList3, arrayList4, arrayList5, mVar.f193683g));
                            str2 = str4;
                            i59 = 10;
                            it9 = it10;
                            eVar2 = eVar4;
                        }
                        cVar3.G(arrayList, "trading_add_ons_trading", kii.e.o(o.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 6:
                        List domain7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain7, "domain");
                        this.f253040b.f253044b.f("trading_add_ons_enabled_trading", domain7);
                        return Unit.f186387a;
                    default:
                        List domain8 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain8, "domain");
                        d dVar4 = this.f253040b;
                        ue0.c cVar4 = dVar4.d;
                        List<lbf.j> list6 = domain8;
                        pbf.d dVar5 = dVar4.e;
                        ArrayList arrayList6 = new ArrayList(zhm.w.t(list6, 10));
                        for (lbf.j domain9 : list6) {
                            dVar5.getClass();
                            Intrinsics.checkNotNullParameter(domain9, "domain");
                            String str5 = domain9.f193677a;
                            ZonedDateTime zonedDateTime = domain9.f193678b;
                            lbf.c cVar5 = domain9.f193679c;
                            arrayList6.add(new qbf.m(str5, zonedDateTime, cVar5 != null ? hx7.b.E(cVar5) : null, domain9.d, domain9.e));
                        }
                        cVar4.G(arrayList6, "trading_add_ons_enabled_trading", kii.e.o(qbf.m.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new a(this, 8), new Function2(this) { // from class: rbf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f253040b;

            {
                this.f253040b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                l lVar;
                n nVar;
                qbf.f fVar;
                t tVar;
                String str;
                Iterator it8;
                e eVar;
                qbf.c cVar;
                switch (i32) {
                    case 0:
                        qbf.j domain = (qbf.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f253040b.f253044b.f("trading_add_on_downgrade_survey_config", domain);
                        return Unit.f186387a;
                    case 1:
                        qbf.j domain2 = (qbf.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f253040b.d.G(domain2, "trading_add_on_downgrade_survey_config", z.d(o0.b(qbf.j.class)));
                        return Unit.f186387a;
                    case 2:
                        String id10 = (String) obj2;
                        i domain3 = (i) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f253040b.f253044b.f(czi.c.f(id10), domain3);
                        return Unit.f186387a;
                    case 3:
                        String id11 = (String) obj2;
                        i domain4 = (i) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        d dVar = this.f253040b;
                        ue0.c cVar2 = dVar.d;
                        String strF = czi.c.f(id11);
                        dVar.f.getClass();
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        n nVar2 = null;
                        if (Intrinsics.f(domain4, g.f193675a)) {
                            lVar = new l(true, null);
                        } else {
                            if (!(domain4 instanceof h)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            lbf.l lVar2 = ((h) domain4).f193676a;
                            if (lVar2 != null) {
                                int i322 = pbf.b.f234680b[lVar2.ordinal()];
                                if (i322 == 1) {
                                    nVar = n.NOT_ONBOARDED_FOR_TRADING;
                                } else if (i322 == 2) {
                                    nVar = n.BUY_ORDER_BLOCK_ACTIVE;
                                } else if (i322 == 3) {
                                    nVar = n.ACCOUNT_IS_RESTRICTED;
                                } else {
                                    if (i322 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    nVar = n.UNKNOWN;
                                }
                                nVar2 = nVar;
                            }
                            lVar = new l(false, nVar2);
                        }
                        cVar2.G(lVar, strF, z.d(o0.b(l.class)));
                        return Unit.f186387a;
                    case 4:
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        this.f253040b.f253044b.f("trading_add_ons_trading", domain5);
                        return Unit.f186387a;
                    case 5:
                        List domain6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        String str2 = "domain";
                        Intrinsics.checkNotNullParameter(domain6, "domain");
                        d dVar2 = this.f253040b;
                        ue0.c cVar3 = dVar2.d;
                        List list = domain6;
                        e eVar2 = dVar2.f253045c;
                        int i59 = 10;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            m mVar = (m) it9.next();
                            eVar2.getClass();
                            Intrinsics.checkNotNullParameter(mVar, str2);
                            String str3 = mVar.f193680a;
                            int i66 = pbf.f.f234682b[mVar.f193681b.ordinal()];
                            if (i66 == 1) {
                                fVar = qbf.f.TRADING_PRO;
                            } else {
                                if (i66 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fVar = qbf.f.UNKNOWN;
                            }
                            qbf.f fVar2 = fVar;
                            List<lbf.b> list2 = mVar.f193682c;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, i59));
                            for (lbf.b bVar : list2) {
                                qbf.b bVarE = hx7.b.E(bVar.f193666a);
                                Period period = bVar.f193667b;
                                jo3.a aVarP = mo3.a.p(bVar.f193668c);
                                lbf.d dVar3 = bVar.d;
                                if (dVar3 != null) {
                                    str = str2;
                                    it8 = it9;
                                    eVar = eVar2;
                                    cVar = new qbf.c(dVar3.f193669a, dVar3.f193670b, dVar3.f193671c, mo3.a.p(dVar3.d));
                                } else {
                                    str = str2;
                                    it8 = it9;
                                    eVar = eVar2;
                                    cVar = null;
                                }
                                lbf.e eVar3 = bVar.e;
                                arrayList2.add(new qbf.d(bVarE, period, aVarP, cVar, eVar3 != null ? new qbf.e(eVar3.f193672a, eVar3.f193673b, eVar3.f193674c) : null));
                                str2 = str;
                                it9 = it8;
                                eVar2 = eVar;
                            }
                            String str4 = str2;
                            Iterator it10 = it9;
                            e eVar4 = eVar2;
                            List list3 = mVar.d;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                            Iterator it11 = list3.iterator();
                            while (it11.hasNext()) {
                                switch (pbf.f.d[((k) it11.next()).ordinal()]) {
                                    case 1:
                                        tVar = t.UNKNOWN;
                                        break;
                                    case 2:
                                        tVar = t.STOCKS;
                                        break;
                                    case 3:
                                        tVar = t.CRYPTO;
                                        break;
                                    case 4:
                                        tVar = t.ADVANCED_PORTFOLIO_ANALYTICS;
                                        break;
                                    case 5:
                                        tVar = t.ADVANCED_WEB_TRADING_TERMINAL;
                                        break;
                                    case 6:
                                        tVar = t.EXTENDED_SECURITIES;
                                        break;
                                    case 7:
                                        tVar = t.INCREASED_ORDER_LIMITS;
                                        break;
                                    case 8:
                                        tVar = t.DEDICATED_CUSTOMER_SUPPORT;
                                        break;
                                    case 9:
                                        tVar = t.NO_MINIMUM_FEES;
                                        break;
                                    case 10:
                                        tVar = t.ORDER_BOOK;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                                arrayList3.add(tVar);
                            }
                            List list4 = mVar.e;
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it12 = list4.iterator();
                            while (it12.hasNext()) {
                                arrayList4.add(hx7.e.d((lbf.n) it12.next()));
                            }
                            List list5 = mVar.f;
                            ArrayList arrayList5 = new ArrayList(zhm.w.t(list5, 10));
                            Iterator it13 = list5.iterator();
                            while (it13.hasNext()) {
                                arrayList5.add(hx7.e.d((lbf.n) it13.next()));
                            }
                            arrayList.add(new o(str3, fVar2, arrayList2, arrayList3, arrayList4, arrayList5, mVar.f193683g));
                            str2 = str4;
                            i59 = 10;
                            it9 = it10;
                            eVar2 = eVar4;
                        }
                        cVar3.G(arrayList, "trading_add_ons_trading", kii.e.o(o.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 6:
                        List domain7 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain7, "domain");
                        this.f253040b.f253044b.f("trading_add_ons_enabled_trading", domain7);
                        return Unit.f186387a;
                    default:
                        List domain8 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain8, "domain");
                        d dVar4 = this.f253040b;
                        ue0.c cVar4 = dVar4.d;
                        List<lbf.j> list6 = domain8;
                        pbf.d dVar5 = dVar4.e;
                        ArrayList arrayList6 = new ArrayList(zhm.w.t(list6, 10));
                        for (lbf.j domain9 : list6) {
                            dVar5.getClass();
                            Intrinsics.checkNotNullParameter(domain9, "domain");
                            String str5 = domain9.f193677a;
                            ZonedDateTime zonedDateTime = domain9.f193678b;
                            lbf.c cVar5 = domain9.f193679c;
                            arrayList6.add(new qbf.m(str5, zonedDateTime, cVar5 != null ? hx7.b.E(cVar5) : null, domain9.d, domain9.e));
                        }
                        cVar4.G(arrayList6, "trading_add_ons_enabled_trading", kii.e.o(qbf.m.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
