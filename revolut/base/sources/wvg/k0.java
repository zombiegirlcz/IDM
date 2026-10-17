package wvg;

import com.revolut.feature.wealth.analytics.data.network.ComplexWealthAnalyticsService;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComplexWealthAnalyticsService f300407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f300408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nvg.k0 f300409c;
    public final w4l.f d;

    public k0(b80.c networkStateRepository, ComplexWealthAnalyticsService complexWealthAnalyticsService, ne0.j memoryCache, nvg.k0 complexAnalyticsRealisedPnlDao) {
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(complexWealthAnalyticsService, "complexWealthAnalyticsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(complexAnalyticsRealisedPnlDao, "complexAnalyticsRealisedPnlDao");
        this.f300407a = complexWealthAnalyticsService;
        this.f300408b = memoryCache;
        this.f300409c = complexAnalyticsRealisedPnlDao;
        final int i = 0;
        uj0.b bVarK0 = te0.w.k0(networkStateRepository, new Function1(this) { // from class: wvg.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f300392b;

            {
                this.f300392b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                g1 params = (g1) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ComplexWealthAnalyticsService complexWealthAnalyticsService2 = this.f300392b.f300407a;
                        String str = params.f300378a;
                        String strQ = kotlin.jvm.internal.s.Q(params.f300379b);
                        String strT = nz8.d.t(params.f300380c, null);
                        String strPrint = l0.f300416a.print(params.d);
                        Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
                        efm.d0<uvg.r> realisedPnl = complexWealthAnalyticsService2.getRealisedPnl(str, strQ, strT, strPrint, params.e.f306286a, params.f);
                        wsg.k kVar = new wsg.k(new d0(params, 2), 16);
                        realisedPnl.getClass();
                        ufm.i iVar = new ufm.i(realisedPnl, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f300392b.f300408b.get(l0.a(params));
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        nvg.k0 k0Var = this.f300392b.f300409c;
                        iwg.a aVar = params.f300379b;
                        eel.c cVar = params.f300380c;
                        String str2 = params.e.f306286a;
                        String str3 = params.f;
                        if (str3 == null) {
                            str3 = "LOCAL_PORTFOLIO_ID";
                        }
                        List listD = k0Var.d(aVar, cVar, str2, str3);
                        Intrinsics.checkNotNullParameter(listD, "<this>");
                        if (listD.isEmpty()) {
                            return null;
                        }
                        List<pvg.b0> list = listD;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (pvg.b0 b0Var : list) {
                            iwg.a aVar2 = b0Var.f240081a;
                            String str4 = b0Var.e;
                            LocalDate localDate = b0Var.f;
                            dj0.d dVarV = hx7.a.v(b0Var.f240084g);
                            dj0.d dVarV2 = hx7.a.v(b0Var.f240085h);
                            String str5 = b0Var.i;
                            ko3.b bVar = b0Var.f240086j;
                            ej0.b bVarI = bVar != null ? cp5.c.I(bVar) : null;
                            String str6 = b0Var.k;
                            arrayList.add(new mwg.k(aVar2, str4, localDate, dVarV, dVarV2, str5, bVarI, str6 != null ? new BigDecimal(str6) : null));
                        }
                        return arrayList;
                }
            }
        });
        final int i2 = 1;
        Function1 function1 = new Function1(this) { // from class: wvg.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f300392b;

            {
                this.f300392b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                g1 params = (g1) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ComplexWealthAnalyticsService complexWealthAnalyticsService2 = this.f300392b.f300407a;
                        String str = params.f300378a;
                        String strQ = kotlin.jvm.internal.s.Q(params.f300379b);
                        String strT = nz8.d.t(params.f300380c, null);
                        String strPrint = l0.f300416a.print(params.d);
                        Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
                        efm.d0<uvg.r> realisedPnl = complexWealthAnalyticsService2.getRealisedPnl(str, strQ, strT, strPrint, params.e.f306286a, params.f);
                        wsg.k kVar = new wsg.k(new d0(params, 2), 16);
                        realisedPnl.getClass();
                        ufm.i iVar = new ufm.i(realisedPnl, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f300392b.f300408b.get(l0.a(params));
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        nvg.k0 k0Var = this.f300392b.f300409c;
                        iwg.a aVar = params.f300379b;
                        eel.c cVar = params.f300380c;
                        String str2 = params.e.f306286a;
                        String str3 = params.f;
                        if (str3 == null) {
                            str3 = "LOCAL_PORTFOLIO_ID";
                        }
                        List listD = k0Var.d(aVar, cVar, str2, str3);
                        Intrinsics.checkNotNullParameter(listD, "<this>");
                        if (listD.isEmpty()) {
                            return null;
                        }
                        List<pvg.b0> list = listD;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (pvg.b0 b0Var : list) {
                            iwg.a aVar2 = b0Var.f240081a;
                            String str4 = b0Var.e;
                            LocalDate localDate = b0Var.f;
                            dj0.d dVarV = hx7.a.v(b0Var.f240084g);
                            dj0.d dVarV2 = hx7.a.v(b0Var.f240085h);
                            String str5 = b0Var.i;
                            ko3.b bVar = b0Var.f240086j;
                            ej0.b bVarI = bVar != null ? cp5.c.I(bVar) : null;
                            String str6 = b0Var.k;
                            arrayList.add(new mwg.k(aVar2, str4, localDate, dVarV, dVarV2, str5, bVarI, str6 != null ? new BigDecimal(str6) : null));
                        }
                        return arrayList;
                }
            }
        };
        final int i3 = 0;
        Function2 function2 = new Function2(this) { // from class: wvg.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f300401b;

            {
                this.f300401b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        g1 params = (g1) obj2;
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f300401b.f300408b.f(l0.a(params), domain);
                        break;
                    default:
                        g1 params2 = (g1) obj2;
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        nvg.k0 k0Var = this.f300401b.f300409c;
                        List<mwg.k> list = domain2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (mwg.k kVar : list) {
                            iwg.a analyticsProductType = params2.f300379b;
                            eel.c timeSpan = params2.f300380c;
                            xi0.b currency = params2.e;
                            String str = params2.f;
                            if (str == null) {
                                str = "LOCAL_PORTFOLIO_ID";
                            }
                            String portfolioId = str;
                            Intrinsics.checkNotNullParameter(kVar, "<this>");
                            Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
                            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
                            Intrinsics.checkNotNullParameter(currency, "currency");
                            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                            String str2 = currency.f306286a;
                            String str3 = kVar.f209470b;
                            LocalDate localDate = kVar.f209471c;
                            jo3.b bVarA = hx7.a.A(kVar.d);
                            jo3.b bVarA2 = hx7.a.A(kVar.e);
                            String str4 = kVar.f;
                            ej0.b bVar = kVar.f209472g;
                            String plainString = null;
                            ko3.b bVarM = bVar != null ? cp5.c.M(bVar) : null;
                            BigDecimal bigDecimal = kVar.f209473h;
                            if (bigDecimal != null) {
                                plainString = bigDecimal.toPlainString();
                            }
                            arrayList.add(new pvg.b0(timeSpan, analyticsProductType, str2, portfolioId, str3, str4, plainString, bVarA, bVarA2, bVarM, localDate));
                        }
                        k0Var.c(arrayList);
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i5 = 2;
        Function1 function12 = new Function1(this) { // from class: wvg.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f300392b;

            {
                this.f300392b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                g1 params = (g1) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ComplexWealthAnalyticsService complexWealthAnalyticsService2 = this.f300392b.f300407a;
                        String str = params.f300378a;
                        String strQ = kotlin.jvm.internal.s.Q(params.f300379b);
                        String strT = nz8.d.t(params.f300380c, null);
                        String strPrint = l0.f300416a.print(params.d);
                        Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
                        efm.d0<uvg.r> realisedPnl = complexWealthAnalyticsService2.getRealisedPnl(str, strQ, strT, strPrint, params.e.f306286a, params.f);
                        wsg.k kVar = new wsg.k(new d0(params, 2), 16);
                        realisedPnl.getClass();
                        ufm.i iVar = new ufm.i(realisedPnl, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f300392b.f300408b.get(l0.a(params));
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        nvg.k0 k0Var = this.f300392b.f300409c;
                        iwg.a aVar = params.f300379b;
                        eel.c cVar = params.f300380c;
                        String str2 = params.e.f306286a;
                        String str3 = params.f;
                        if (str3 == null) {
                            str3 = "LOCAL_PORTFOLIO_ID";
                        }
                        List listD = k0Var.d(aVar, cVar, str2, str3);
                        Intrinsics.checkNotNullParameter(listD, "<this>");
                        if (listD.isEmpty()) {
                            return null;
                        }
                        List<pvg.b0> list = listD;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (pvg.b0 b0Var : list) {
                            iwg.a aVar2 = b0Var.f240081a;
                            String str4 = b0Var.e;
                            LocalDate localDate = b0Var.f;
                            dj0.d dVarV = hx7.a.v(b0Var.f240084g);
                            dj0.d dVarV2 = hx7.a.v(b0Var.f240085h);
                            String str5 = b0Var.i;
                            ko3.b bVar = b0Var.f240086j;
                            ej0.b bVarI = bVar != null ? cp5.c.I(bVar) : null;
                            String str6 = b0Var.k;
                            arrayList.add(new mwg.k(aVar2, str4, localDate, dVarV, dVarV2, str5, bVarI, str6 != null ? new BigDecimal(str6) : null));
                        }
                        return arrayList;
                }
            }
        };
        final int i6 = 1;
        this.d = new w4l.f(bVarK0, function1, function2, function12, new Function2(this) { // from class: wvg.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f300401b;

            {
                this.f300401b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        g1 params = (g1) obj2;
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f300401b.f300408b.f(l0.a(params), domain);
                        break;
                    default:
                        g1 params2 = (g1) obj2;
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        nvg.k0 k0Var = this.f300401b.f300409c;
                        List<mwg.k> list = domain2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (mwg.k kVar : list) {
                            iwg.a analyticsProductType = params2.f300379b;
                            eel.c timeSpan = params2.f300380c;
                            xi0.b currency = params2.e;
                            String str = params2.f;
                            if (str == null) {
                                str = "LOCAL_PORTFOLIO_ID";
                            }
                            String portfolioId = str;
                            Intrinsics.checkNotNullParameter(kVar, "<this>");
                            Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
                            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
                            Intrinsics.checkNotNullParameter(currency, "currency");
                            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                            String str2 = currency.f306286a;
                            String str3 = kVar.f209470b;
                            LocalDate localDate = kVar.f209471c;
                            jo3.b bVarA = hx7.a.A(kVar.d);
                            jo3.b bVarA2 = hx7.a.A(kVar.e);
                            String str4 = kVar.f;
                            ej0.b bVar = kVar.f209472g;
                            String plainString = null;
                            ko3.b bVarM = bVar != null ? cp5.c.M(bVar) : null;
                            BigDecimal bigDecimal = kVar.f209473h;
                            if (bigDecimal != null) {
                                plainString = bigDecimal.toPlainString();
                            }
                            arrayList.add(new pvg.b0(timeSpan, analyticsProductType, str2, portfolioId, str3, str4, plainString, bVarA, bVarA2, bVarM, localDate));
                        }
                        k0Var.c(arrayList);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
