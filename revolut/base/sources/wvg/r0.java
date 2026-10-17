package wvg;

import com.revolut.feature.wealth.analytics.data.network.ComplexWealthAnalyticsService;
import java.util.ArrayList;
import java.util.List;
import jel.a3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: loaded from: classes9.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComplexWealthAnalyticsService f300463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f300464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nvg.q0 f300465c;
    public final w4l.f d;

    public r0(b80.c networkStateRepository, ComplexWealthAnalyticsService complexWealthAnalyticsService, ne0.j memoryCache, nvg.q0 complexAnalyticsSectorContributorsDao) {
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(complexWealthAnalyticsService, "complexWealthAnalyticsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(complexAnalyticsSectorContributorsDao, "complexAnalyticsSectorContributorsDao");
        this.f300463a = complexWealthAnalyticsService;
        this.f300464b = memoryCache;
        this.f300465c = complexAnalyticsSectorContributorsDao;
        final int i = 0;
        uj0.b bVarK0 = te0.w.k0(networkStateRepository, new Function1(this) { // from class: wvg.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f300445b;

            {
                this.f300445b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                z1 params = (z1) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ComplexWealthAnalyticsService complexWealthAnalyticsService2 = this.f300445b.f300463a;
                        String str = params.f300510a;
                        String strQ = kotlin.jvm.internal.s.Q(params.f300511b);
                        String strT = nz8.d.t(params.f300512c, null);
                        String strPrint = s0.f300470a.print(params.d);
                        Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
                        String strR = kotlin.jvm.internal.s.R(params.e);
                        efm.d0<uvg.i> sectorContributors = complexWealthAnalyticsService2.getSectorContributors(str, strQ, strT, params.f.getId(), params.f300513g, params.f300514h.f306286a, strR, strPrint);
                        wsg.k kVar = new wsg.k(new d0(params, 4), 18);
                        sectorContributors.getClass();
                        ufm.i iVar = new ufm.i(sectorContributors, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f300445b.f300464b.get(s0.a(params));
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        nvg.q0 q0Var = this.f300445b.f300465c;
                        iwg.a aVar = params.f300511b;
                        eel.c cVar = params.f300512c;
                        iwg.c cVar2 = params.e;
                        a3 a3Var = params.f;
                        String str2 = params.f300513g;
                        if (str2 == null) {
                            str2 = "LOCAL_PORTFOLIO_ID";
                        }
                        List listD = q0Var.d(aVar, cVar, cVar2, a3Var, str2, params.f300514h.f306286a);
                        Intrinsics.checkNotNullParameter(listD, "<this>");
                        if (listD.isEmpty()) {
                            return null;
                        }
                        List<pvg.f0> list = listD;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (pvg.f0 f0Var : list) {
                            arrayList.add(new mwg.m(f0Var.f240125a, f0Var.d, f0Var.f240128g, hx7.a.v(f0Var.f240129h), f0Var.i, f0Var.f240130j, f0Var.k));
                        }
                        return arrayList;
                }
            }
        });
        final int i2 = 1;
        Function1 function1 = new Function1(this) { // from class: wvg.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f300445b;

            {
                this.f300445b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                z1 params = (z1) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ComplexWealthAnalyticsService complexWealthAnalyticsService2 = this.f300445b.f300463a;
                        String str = params.f300510a;
                        String strQ = kotlin.jvm.internal.s.Q(params.f300511b);
                        String strT = nz8.d.t(params.f300512c, null);
                        String strPrint = s0.f300470a.print(params.d);
                        Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
                        String strR = kotlin.jvm.internal.s.R(params.e);
                        efm.d0<uvg.i> sectorContributors = complexWealthAnalyticsService2.getSectorContributors(str, strQ, strT, params.f.getId(), params.f300513g, params.f300514h.f306286a, strR, strPrint);
                        wsg.k kVar = new wsg.k(new d0(params, 4), 18);
                        sectorContributors.getClass();
                        ufm.i iVar = new ufm.i(sectorContributors, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f300445b.f300464b.get(s0.a(params));
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        nvg.q0 q0Var = this.f300445b.f300465c;
                        iwg.a aVar = params.f300511b;
                        eel.c cVar = params.f300512c;
                        iwg.c cVar2 = params.e;
                        a3 a3Var = params.f;
                        String str2 = params.f300513g;
                        if (str2 == null) {
                            str2 = "LOCAL_PORTFOLIO_ID";
                        }
                        List listD = q0Var.d(aVar, cVar, cVar2, a3Var, str2, params.f300514h.f306286a);
                        Intrinsics.checkNotNullParameter(listD, "<this>");
                        if (listD.isEmpty()) {
                            return null;
                        }
                        List<pvg.f0> list = listD;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (pvg.f0 f0Var : list) {
                            arrayList.add(new mwg.m(f0Var.f240125a, f0Var.d, f0Var.f240128g, hx7.a.v(f0Var.f240129h), f0Var.i, f0Var.f240130j, f0Var.k));
                        }
                        return arrayList;
                }
            }
        };
        final int i3 = 0;
        Function2 function2 = new Function2(this) { // from class: wvg.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f300455b;

            {
                this.f300455b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        z1 params = (z1) obj2;
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f300455b.f300464b.f(s0.a(params), domain);
                        break;
                    default:
                        z1 params2 = (z1) obj2;
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        nvg.q0 q0Var = this.f300455b.f300465c;
                        List<mwg.m> list = domain2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (mwg.m mVar : list) {
                            eel.c timeSpan = params2.f300512c;
                            iwg.c method = params2.e;
                            String str = params2.f300513g;
                            if (str == null) {
                                str = "LOCAL_PORTFOLIO_ID";
                            }
                            String portfolioId = str;
                            xi0.b currency = params2.f300514h;
                            Intrinsics.checkNotNullParameter(mVar, "<this>");
                            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
                            Intrinsics.checkNotNullParameter(method, "method");
                            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                            Intrinsics.checkNotNullParameter(currency, "currency");
                            arrayList.add(new pvg.f0(mVar.f209477a, timeSpan, method, mVar.f209478b, portfolioId, currency.f306286a, mVar.f209479c, hx7.a.A(mVar.d), mVar.e, mVar.f, mVar.f209480g));
                        }
                        q0Var.a(arrayList);
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i5 = 2;
        Function1 function12 = new Function1(this) { // from class: wvg.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f300445b;

            {
                this.f300445b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                z1 params = (z1) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ComplexWealthAnalyticsService complexWealthAnalyticsService2 = this.f300445b.f300463a;
                        String str = params.f300510a;
                        String strQ = kotlin.jvm.internal.s.Q(params.f300511b);
                        String strT = nz8.d.t(params.f300512c, null);
                        String strPrint = s0.f300470a.print(params.d);
                        Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
                        String strR = kotlin.jvm.internal.s.R(params.e);
                        efm.d0<uvg.i> sectorContributors = complexWealthAnalyticsService2.getSectorContributors(str, strQ, strT, params.f.getId(), params.f300513g, params.f300514h.f306286a, strR, strPrint);
                        wsg.k kVar = new wsg.k(new d0(params, 4), 18);
                        sectorContributors.getClass();
                        ufm.i iVar = new ufm.i(sectorContributors, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f300445b.f300464b.get(s0.a(params));
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        nvg.q0 q0Var = this.f300445b.f300465c;
                        iwg.a aVar = params.f300511b;
                        eel.c cVar = params.f300512c;
                        iwg.c cVar2 = params.e;
                        a3 a3Var = params.f;
                        String str2 = params.f300513g;
                        if (str2 == null) {
                            str2 = "LOCAL_PORTFOLIO_ID";
                        }
                        List listD = q0Var.d(aVar, cVar, cVar2, a3Var, str2, params.f300514h.f306286a);
                        Intrinsics.checkNotNullParameter(listD, "<this>");
                        if (listD.isEmpty()) {
                            return null;
                        }
                        List<pvg.f0> list = listD;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (pvg.f0 f0Var : list) {
                            arrayList.add(new mwg.m(f0Var.f240125a, f0Var.d, f0Var.f240128g, hx7.a.v(f0Var.f240129h), f0Var.i, f0Var.f240130j, f0Var.k));
                        }
                        return arrayList;
                }
            }
        };
        final int i6 = 1;
        this.d = new w4l.f(bVarK0, function1, function2, function12, new Function2(this) { // from class: wvg.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f300455b;

            {
                this.f300455b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        z1 params = (z1) obj2;
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f300455b.f300464b.f(s0.a(params), domain);
                        break;
                    default:
                        z1 params2 = (z1) obj2;
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        nvg.q0 q0Var = this.f300455b.f300465c;
                        List<mwg.m> list = domain2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (mwg.m mVar : list) {
                            eel.c timeSpan = params2.f300512c;
                            iwg.c method = params2.e;
                            String str = params2.f300513g;
                            if (str == null) {
                                str = "LOCAL_PORTFOLIO_ID";
                            }
                            String portfolioId = str;
                            xi0.b currency = params2.f300514h;
                            Intrinsics.checkNotNullParameter(mVar, "<this>");
                            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
                            Intrinsics.checkNotNullParameter(method, "method");
                            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                            Intrinsics.checkNotNullParameter(currency, "currency");
                            arrayList.add(new pvg.f0(mVar.f209477a, timeSpan, method, mVar.f209478b, portfolioId, currency.f306286a, mVar.f209479c, hx7.a.A(mVar.d), mVar.e, mVar.f, mVar.f209480g));
                        }
                        q0Var.a(arrayList);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
