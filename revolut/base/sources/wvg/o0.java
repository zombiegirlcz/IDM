package wvg;

import com.revolut.feature.wealth.analytics.data.network.ComplexWealthAnalyticsService;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jel.a3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: loaded from: classes9.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComplexWealthAnalyticsService f300433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f300434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nvg.n0 f300435c;
    public final w4l.f d;

    public o0(b80.c networkStateRepository, ComplexWealthAnalyticsService complexWealthAnalyticsService, ne0.j memoryCache, nvg.n0 complexAnalyticsSectorAllocationsDao) {
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(complexWealthAnalyticsService, "complexWealthAnalyticsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(complexAnalyticsSectorAllocationsDao, "complexAnalyticsSectorAllocationsDao");
        this.f300433a = complexWealthAnalyticsService;
        this.f300434b = memoryCache;
        this.f300435c = complexAnalyticsSectorAllocationsDao;
        final int i = 0;
        uj0.b bVarK0 = te0.w.k0(networkStateRepository, new Function1(this) { // from class: wvg.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f300418b;

            {
                this.f300418b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        y1 params = (y1) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        ComplexWealthAnalyticsService complexWealthAnalyticsService2 = this.f300418b.f300433a;
                        String str = params.f300504a;
                        String strQ = kotlin.jvm.internal.s.Q(params.f300505b);
                        String id10 = params.f300506c.getId();
                        String str2 = params.d;
                        xi0.b.Companion.getClass();
                        efm.d0<uvg.a0> sectorAllocations = complexWealthAnalyticsService2.getSectorAllocations(str, strQ, id10, str2, xi0.b.i.f306286a);
                        wsg.k kVar = new wsg.k(new d0(params, 3), 17);
                        sectorAllocations.getClass();
                        ufm.i iVar = new ufm.i(sectorAllocations, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        y1 params2 = (y1) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (mwg.l) this.f300418b.f300434b.get(tz4.d.d(params2));
                    default:
                        y1 params3 = (y1) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        List<pvg.d0> listD = this.f300418b.f300435c.d(params3.f300505b, params3.f300506c, params3.e.f306286a);
                        Intrinsics.checkNotNullParameter(listD, "<this>");
                        pvg.d0 d0Var = (pvg.d0) zhm.d0.d0(listD);
                        if (d0Var == null) {
                            return null;
                        }
                        iwg.a aVar = d0Var.f240105a;
                        a3 a3Var = d0Var.f240106b;
                        dj0.d dVarV = hx7.a.v(d0Var.d);
                        ArrayList arrayList = new ArrayList();
                        for (pvg.d0 d0Var2 : listD) {
                            String str3 = d0Var2.e;
                            String str4 = d0Var2.f;
                            jo3.b bVar = d0Var2.f240108g;
                            Float f = d0Var2.f240109h;
                            mwg.c cVar = (str3 == null || str4 == null || bVar == null || f == null) ? null : new mwg.c(str3, new BigDecimal(str4), hx7.a.v(bVar), f.floatValue(), d0Var2.i, null, null, null, null);
                            if (cVar != null) {
                                arrayList.add(cVar);
                            }
                        }
                        return new mwg.l(aVar, a3Var, dVarV, zhm.d0.U(arrayList));
                }
            }
        });
        final int i2 = 1;
        Function1 function1 = new Function1(this) { // from class: wvg.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f300418b;

            {
                this.f300418b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        y1 params = (y1) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        ComplexWealthAnalyticsService complexWealthAnalyticsService2 = this.f300418b.f300433a;
                        String str = params.f300504a;
                        String strQ = kotlin.jvm.internal.s.Q(params.f300505b);
                        String id10 = params.f300506c.getId();
                        String str2 = params.d;
                        xi0.b.Companion.getClass();
                        efm.d0<uvg.a0> sectorAllocations = complexWealthAnalyticsService2.getSectorAllocations(str, strQ, id10, str2, xi0.b.i.f306286a);
                        wsg.k kVar = new wsg.k(new d0(params, 3), 17);
                        sectorAllocations.getClass();
                        ufm.i iVar = new ufm.i(sectorAllocations, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        y1 params2 = (y1) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (mwg.l) this.f300418b.f300434b.get(tz4.d.d(params2));
                    default:
                        y1 params3 = (y1) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        List<pvg.d0> listD = this.f300418b.f300435c.d(params3.f300505b, params3.f300506c, params3.e.f306286a);
                        Intrinsics.checkNotNullParameter(listD, "<this>");
                        pvg.d0 d0Var = (pvg.d0) zhm.d0.d0(listD);
                        if (d0Var == null) {
                            return null;
                        }
                        iwg.a aVar = d0Var.f240105a;
                        a3 a3Var = d0Var.f240106b;
                        dj0.d dVarV = hx7.a.v(d0Var.d);
                        ArrayList arrayList = new ArrayList();
                        for (pvg.d0 d0Var2 : listD) {
                            String str3 = d0Var2.e;
                            String str4 = d0Var2.f;
                            jo3.b bVar = d0Var2.f240108g;
                            Float f = d0Var2.f240109h;
                            mwg.c cVar = (str3 == null || str4 == null || bVar == null || f == null) ? null : new mwg.c(str3, new BigDecimal(str4), hx7.a.v(bVar), f.floatValue(), d0Var2.i, null, null, null, null);
                            if (cVar != null) {
                                arrayList.add(cVar);
                            }
                        }
                        return new mwg.l(aVar, a3Var, dVarV, zhm.d0.U(arrayList));
                }
            }
        };
        final int i3 = 0;
        Function2 function2 = new Function2(this) { // from class: wvg.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f300424b;

            {
                this.f300424b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                y1 params = (y1) obj2;
                mwg.l domain = (mwg.l) obj3;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f300424b.f300434b.f(tz4.d.d(params), domain);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        xi0.b currency = params.e;
                        Intrinsics.checkNotNullParameter(domain, "<this>");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        pvg.e0 e0Var = new pvg.e0(domain.f209474a, domain.f209475b, currency.f306286a, hx7.a.A(domain.f209476c));
                        List<mwg.c> list = domain.d;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (mwg.c cVar : list) {
                            iwg.a aVar = domain.f209474a;
                            a3 a3Var = domain.f209475b;
                            String str = currency.f306286a;
                            String str2 = cVar.f209442a;
                            String plainString = cVar.f209443b.toPlainString();
                            Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
                            arrayList.add(new pvg.c0(aVar, a3Var, str, str2, plainString, hx7.a.A(cVar.f209444c), cVar.d, cVar.e));
                        }
                        this.f300424b.f300435c.c(zhm.u.c(e0Var), arrayList);
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i5 = 2;
        Function1 function12 = new Function1(this) { // from class: wvg.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f300418b;

            {
                this.f300418b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        y1 params = (y1) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        ComplexWealthAnalyticsService complexWealthAnalyticsService2 = this.f300418b.f300433a;
                        String str = params.f300504a;
                        String strQ = kotlin.jvm.internal.s.Q(params.f300505b);
                        String id10 = params.f300506c.getId();
                        String str2 = params.d;
                        xi0.b.Companion.getClass();
                        efm.d0<uvg.a0> sectorAllocations = complexWealthAnalyticsService2.getSectorAllocations(str, strQ, id10, str2, xi0.b.i.f306286a);
                        wsg.k kVar = new wsg.k(new d0(params, 3), 17);
                        sectorAllocations.getClass();
                        ufm.i iVar = new ufm.i(sectorAllocations, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        y1 params2 = (y1) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (mwg.l) this.f300418b.f300434b.get(tz4.d.d(params2));
                    default:
                        y1 params3 = (y1) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        List<pvg.d0> listD = this.f300418b.f300435c.d(params3.f300505b, params3.f300506c, params3.e.f306286a);
                        Intrinsics.checkNotNullParameter(listD, "<this>");
                        pvg.d0 d0Var = (pvg.d0) zhm.d0.d0(listD);
                        if (d0Var == null) {
                            return null;
                        }
                        iwg.a aVar = d0Var.f240105a;
                        a3 a3Var = d0Var.f240106b;
                        dj0.d dVarV = hx7.a.v(d0Var.d);
                        ArrayList arrayList = new ArrayList();
                        for (pvg.d0 d0Var2 : listD) {
                            String str3 = d0Var2.e;
                            String str4 = d0Var2.f;
                            jo3.b bVar = d0Var2.f240108g;
                            Float f = d0Var2.f240109h;
                            mwg.c cVar = (str3 == null || str4 == null || bVar == null || f == null) ? null : new mwg.c(str3, new BigDecimal(str4), hx7.a.v(bVar), f.floatValue(), d0Var2.i, null, null, null, null);
                            if (cVar != null) {
                                arrayList.add(cVar);
                            }
                        }
                        return new mwg.l(aVar, a3Var, dVarV, zhm.d0.U(arrayList));
                }
            }
        };
        final int i6 = 1;
        this.d = new w4l.f(bVarK0, function1, function2, function12, new Function2(this) { // from class: wvg.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f300424b;

            {
                this.f300424b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                y1 params = (y1) obj2;
                mwg.l domain = (mwg.l) obj3;
                switch (i6) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f300424b.f300434b.f(tz4.d.d(params), domain);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        xi0.b currency = params.e;
                        Intrinsics.checkNotNullParameter(domain, "<this>");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        pvg.e0 e0Var = new pvg.e0(domain.f209474a, domain.f209475b, currency.f306286a, hx7.a.A(domain.f209476c));
                        List<mwg.c> list = domain.d;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (mwg.c cVar : list) {
                            iwg.a aVar = domain.f209474a;
                            a3 a3Var = domain.f209475b;
                            String str = currency.f306286a;
                            String str2 = cVar.f209442a;
                            String plainString = cVar.f209443b.toPlainString();
                            Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
                            arrayList.add(new pvg.c0(aVar, a3Var, str, str2, plainString, hx7.a.A(cVar.f209444c), cVar.d, cVar.e));
                        }
                        this.f300424b.f300435c.c(zhm.u.c(e0Var), arrayList);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
