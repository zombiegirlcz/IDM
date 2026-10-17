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
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComplexWealthAnalyticsService f300507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f300508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nvg.x f300509c;
    public final w4l.f d;

    public z(b80.c networkStateRepository, ComplexWealthAnalyticsService complexWealthAnalyticsService, ne0.j memoryCache, nvg.x complexAnalyticsContributorsDao) {
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(complexWealthAnalyticsService, "complexWealthAnalyticsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(complexAnalyticsContributorsDao, "complexAnalyticsContributorsDao");
        this.f300507a = complexWealthAnalyticsService;
        this.f300508b = memoryCache;
        this.f300509c = complexAnalyticsContributorsDao;
        final int i = 0;
        uj0.b bVarK0 = te0.w.k0(networkStateRepository, new Function1(this) { // from class: wvg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f300493b;

            {
                this.f300493b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        v0 params = (v0) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        ComplexWealthAnalyticsService complexWealthAnalyticsService2 = this.f300493b.f300507a;
                        String str = params.f300482a;
                        String strQ = kotlin.jvm.internal.s.Q(params.f300483b);
                        String strT = nz8.d.t(params.f300484c, null);
                        String strPrint = a0.f300323a.print(params.d);
                        Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
                        efm.d0<uvg.i> contributors = complexWealthAnalyticsService2.getContributors(str, strQ, strT, kotlin.jvm.internal.s.R(params.e), strPrint, params.f300486h.f306286a, params.f, params.f300485g);
                        wsg.k kVar = new wsg.k(new wpj.b(params, 29), 14);
                        contributors.getClass();
                        ufm.i iVar = new ufm.i(contributors, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        v0 params2 = (v0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (List) this.f300493b.f300508b.get(a0.a(params2));
                    default:
                        v0 params3 = (v0) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        nvg.x xVar = this.f300493b.f300509c;
                        iwg.a aVar = params3.f300483b;
                        eel.c cVar = params3.f300484c;
                        iwg.c cVar2 = params3.e;
                        boolean z = params3.f;
                        String str2 = params3.f300485g;
                        if (str2 == null) {
                            str2 = "LOCAL_PORTFOLIO_ID";
                        }
                        List listD = xVar.d(aVar, cVar, cVar2, z, str2, params3.f300486h.f306286a);
                        Intrinsics.checkNotNullParameter(listD, "<this>");
                        if (listD.isEmpty()) {
                            return null;
                        }
                        List<pvg.s> list = listD;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (pvg.s sVar : list) {
                            iwg.a aVar2 = sVar.f240214a;
                            boolean z3 = sVar.d;
                            String str3 = sVar.f240217g;
                            dj0.d dVarV = hx7.a.v(sVar.f240218h);
                            float f = sVar.i;
                            Float f4 = sVar.f240219j;
                            LocalDate localDate = sVar.k;
                            String str4 = sVar.f240220l;
                            ko3.b bVar = sVar.f240221m;
                            ej0.b bVarI = bVar != null ? cp5.c.I(bVar) : null;
                            String str5 = sVar.f240222n;
                            String str6 = sVar.o;
                            arrayList.add(new mwg.f(aVar2, z3, str3, dVarV, f, f4, localDate, str4, bVarI, str5, str6 != null ? new BigDecimal(str6) : null));
                        }
                        return arrayList;
                }
            }
        });
        final int i2 = 1;
        Function1 function1 = new Function1(this) { // from class: wvg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f300493b;

            {
                this.f300493b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        v0 params = (v0) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        ComplexWealthAnalyticsService complexWealthAnalyticsService2 = this.f300493b.f300507a;
                        String str = params.f300482a;
                        String strQ = kotlin.jvm.internal.s.Q(params.f300483b);
                        String strT = nz8.d.t(params.f300484c, null);
                        String strPrint = a0.f300323a.print(params.d);
                        Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
                        efm.d0<uvg.i> contributors = complexWealthAnalyticsService2.getContributors(str, strQ, strT, kotlin.jvm.internal.s.R(params.e), strPrint, params.f300486h.f306286a, params.f, params.f300485g);
                        wsg.k kVar = new wsg.k(new wpj.b(params, 29), 14);
                        contributors.getClass();
                        ufm.i iVar = new ufm.i(contributors, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        v0 params2 = (v0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (List) this.f300493b.f300508b.get(a0.a(params2));
                    default:
                        v0 params3 = (v0) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        nvg.x xVar = this.f300493b.f300509c;
                        iwg.a aVar = params3.f300483b;
                        eel.c cVar = params3.f300484c;
                        iwg.c cVar2 = params3.e;
                        boolean z = params3.f;
                        String str2 = params3.f300485g;
                        if (str2 == null) {
                            str2 = "LOCAL_PORTFOLIO_ID";
                        }
                        List listD = xVar.d(aVar, cVar, cVar2, z, str2, params3.f300486h.f306286a);
                        Intrinsics.checkNotNullParameter(listD, "<this>");
                        if (listD.isEmpty()) {
                            return null;
                        }
                        List<pvg.s> list = listD;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (pvg.s sVar : list) {
                            iwg.a aVar2 = sVar.f240214a;
                            boolean z3 = sVar.d;
                            String str3 = sVar.f240217g;
                            dj0.d dVarV = hx7.a.v(sVar.f240218h);
                            float f = sVar.i;
                            Float f4 = sVar.f240219j;
                            LocalDate localDate = sVar.k;
                            String str4 = sVar.f240220l;
                            ko3.b bVar = sVar.f240221m;
                            ej0.b bVarI = bVar != null ? cp5.c.I(bVar) : null;
                            String str5 = sVar.f240222n;
                            String str6 = sVar.o;
                            arrayList.add(new mwg.f(aVar2, z3, str3, dVarV, f, f4, localDate, str4, bVarI, str5, str6 != null ? new BigDecimal(str6) : null));
                        }
                        return arrayList;
                }
            }
        };
        final int i3 = 0;
        Function2 function2 = new Function2(this) { // from class: wvg.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f300500b;

            {
                this.f300500b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        v0 params = (v0) obj2;
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f300500b.f300508b.f(a0.a(params), domain);
                        break;
                    default:
                        v0 params2 = (v0) obj2;
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        nvg.x xVar = this.f300500b.f300509c;
                        List<mwg.f> list = domain2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (mwg.f fVar : list) {
                            eel.c timeSpan = params2.f300484c;
                            iwg.c method = params2.e;
                            String str = params2.f300485g;
                            if (str == null) {
                                str = "LOCAL_PORTFOLIO_ID";
                            }
                            String portfolioId = str;
                            xi0.b currency = params2.f300486h;
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
                            Intrinsics.checkNotNullParameter(method, "method");
                            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                            Intrinsics.checkNotNullParameter(currency, "currency");
                            iwg.a aVar = fVar.f209453a;
                            String str2 = fVar.f209455c;
                            jo3.b bVarA = hx7.a.A(fVar.d);
                            float f = fVar.e;
                            Float f4 = fVar.f;
                            LocalDate localDate = fVar.f209456g;
                            boolean z = fVar.f209454b;
                            String str3 = currency.f306286a;
                            v0 v0Var = params2;
                            String str4 = fVar.f209457h;
                            ej0.b bVar = fVar.i;
                            String plainString = null;
                            ko3.b bVarM = bVar != null ? cp5.c.M(bVar) : null;
                            String str5 = fVar.f209458j;
                            BigDecimal bigDecimal = fVar.k;
                            if (bigDecimal != null) {
                                plainString = bigDecimal.toPlainString();
                            }
                            arrayList.add(new pvg.s(aVar, timeSpan, method, z, portfolioId, str3, str2, bVarA, f, f4, localDate, str4, bVarM, str5, plainString));
                            params2 = v0Var;
                        }
                        xVar.c(arrayList);
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i5 = 2;
        Function1 function12 = new Function1(this) { // from class: wvg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f300493b;

            {
                this.f300493b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        v0 params = (v0) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        ComplexWealthAnalyticsService complexWealthAnalyticsService2 = this.f300493b.f300507a;
                        String str = params.f300482a;
                        String strQ = kotlin.jvm.internal.s.Q(params.f300483b);
                        String strT = nz8.d.t(params.f300484c, null);
                        String strPrint = a0.f300323a.print(params.d);
                        Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
                        efm.d0<uvg.i> contributors = complexWealthAnalyticsService2.getContributors(str, strQ, strT, kotlin.jvm.internal.s.R(params.e), strPrint, params.f300486h.f306286a, params.f, params.f300485g);
                        wsg.k kVar = new wsg.k(new wpj.b(params, 29), 14);
                        contributors.getClass();
                        ufm.i iVar = new ufm.i(contributors, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        v0 params2 = (v0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (List) this.f300493b.f300508b.get(a0.a(params2));
                    default:
                        v0 params3 = (v0) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        nvg.x xVar = this.f300493b.f300509c;
                        iwg.a aVar = params3.f300483b;
                        eel.c cVar = params3.f300484c;
                        iwg.c cVar2 = params3.e;
                        boolean z = params3.f;
                        String str2 = params3.f300485g;
                        if (str2 == null) {
                            str2 = "LOCAL_PORTFOLIO_ID";
                        }
                        List listD = xVar.d(aVar, cVar, cVar2, z, str2, params3.f300486h.f306286a);
                        Intrinsics.checkNotNullParameter(listD, "<this>");
                        if (listD.isEmpty()) {
                            return null;
                        }
                        List<pvg.s> list = listD;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (pvg.s sVar : list) {
                            iwg.a aVar2 = sVar.f240214a;
                            boolean z3 = sVar.d;
                            String str3 = sVar.f240217g;
                            dj0.d dVarV = hx7.a.v(sVar.f240218h);
                            float f = sVar.i;
                            Float f4 = sVar.f240219j;
                            LocalDate localDate = sVar.k;
                            String str4 = sVar.f240220l;
                            ko3.b bVar = sVar.f240221m;
                            ej0.b bVarI = bVar != null ? cp5.c.I(bVar) : null;
                            String str5 = sVar.f240222n;
                            String str6 = sVar.o;
                            arrayList.add(new mwg.f(aVar2, z3, str3, dVarV, f, f4, localDate, str4, bVarI, str5, str6 != null ? new BigDecimal(str6) : null));
                        }
                        return arrayList;
                }
            }
        };
        final int i6 = 1;
        this.d = new w4l.f(bVarK0, function1, function2, function12, new Function2(this) { // from class: wvg.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f300500b;

            {
                this.f300500b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        v0 params = (v0) obj2;
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f300500b.f300508b.f(a0.a(params), domain);
                        break;
                    default:
                        v0 params2 = (v0) obj2;
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        nvg.x xVar = this.f300500b.f300509c;
                        List<mwg.f> list = domain2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (mwg.f fVar : list) {
                            eel.c timeSpan = params2.f300484c;
                            iwg.c method = params2.e;
                            String str = params2.f300485g;
                            if (str == null) {
                                str = "LOCAL_PORTFOLIO_ID";
                            }
                            String portfolioId = str;
                            xi0.b currency = params2.f300486h;
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
                            Intrinsics.checkNotNullParameter(method, "method");
                            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                            Intrinsics.checkNotNullParameter(currency, "currency");
                            iwg.a aVar = fVar.f209453a;
                            String str2 = fVar.f209455c;
                            jo3.b bVarA = hx7.a.A(fVar.d);
                            float f = fVar.e;
                            Float f4 = fVar.f;
                            LocalDate localDate = fVar.f209456g;
                            boolean z = fVar.f209454b;
                            String str3 = currency.f306286a;
                            v0 v0Var = params2;
                            String str4 = fVar.f209457h;
                            ej0.b bVar = fVar.i;
                            String plainString = null;
                            ko3.b bVarM = bVar != null ? cp5.c.M(bVar) : null;
                            String str5 = fVar.f209458j;
                            BigDecimal bigDecimal = fVar.k;
                            if (bigDecimal != null) {
                                plainString = bigDecimal.toPlainString();
                            }
                            arrayList.add(new pvg.s(aVar, timeSpan, method, z, portfolioId, str3, str2, bVarA, f, f4, localDate, str4, bVarM, str5, plainString));
                            params2 = v0Var;
                        }
                        xVar.c(arrayList);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
