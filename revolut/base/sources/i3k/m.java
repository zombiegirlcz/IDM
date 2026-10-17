package i3k;

import com.google.gson.reflect.TypeToken;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance.data.network.RemittanceService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import h3k.q;
import i2i.o;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import z1k.p;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements e {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f158250m = n9l.b.SEC_3.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemittanceService f158251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f158252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f158253c;
    public final ne0.j d;
    public final ne0.j e;
    public final ue0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final rga.c f158254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f158255h;
    public final qe0.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w4l.f f158256j;
    public final w4l.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4l.f f158257l;

    public m(RemittanceService service, ne0.j corridorsMemoryCache, ne0.j routesMemoryCache, ne0.j remittanceCache, ne0.j providersPricingCache, ue0.c remittanceStorage, rga.c priceQuoteTraceIdHolder) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(corridorsMemoryCache, "corridorsMemoryCache");
        Intrinsics.checkNotNullParameter(routesMemoryCache, "routesMemoryCache");
        Intrinsics.checkNotNullParameter(remittanceCache, "remittanceCache");
        Intrinsics.checkNotNullParameter(providersPricingCache, "providersPricingCache");
        Intrinsics.checkNotNullParameter(remittanceStorage, "remittanceStorage");
        Intrinsics.checkNotNullParameter(priceQuoteTraceIdHolder, "priceQuoteTraceIdHolder");
        this.f158251a = service;
        this.f158252b = corridorsMemoryCache;
        this.f158253c = routesMemoryCache;
        this.d = remittanceCache;
        this.e = providersPricingCache;
        this.f = remittanceStorage;
        this.f158254g = priceQuoteTraceIdHolder;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: i3k.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f158235b;

            {
                this.f158235b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                m mVar = this.f158235b;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        l params = (l) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        String strB = mVar.f158254g.b("remittance_price_quote");
                        String str = strB == null ? null : strB;
                        RemittanceService remittanceService = mVar.f158251a;
                        String str2 = params.f158246a;
                        String str3 = params.f158247b;
                        String str4 = params.f158248c;
                        long j2 = params.d;
                        kq2.c cVar = params.e;
                        d0<q> routes = remittanceService.getRoutes(str, str2, str3, str4, params.f158249g, j2, true, cVar != null ? n2k.b.c(cVar) : null, params.f);
                        i31.e eVar = new i31.e(11, new ho6.n(str, 13));
                        routes.getClass();
                        ufm.i iVar = new ufm.i(routes, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<h3k.m>> recipientCountries = mVar.f158251a.getRecipientCountries();
                        i31.e eVar2 = new i31.e(8, new o(27));
                        recipientCountries.getClass();
                        ufm.i iVar2 = new ufm.i(recipientCountries, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        mVar.d.f("COUNTRIES_CACHE_KEY", domain);
                        return Unit.f186387a;
                    case 3:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        List<z1k.m> list = domain2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (z1k.m mVar2 : list) {
                            Map map = d.f158233a;
                            Intrinsics.checkNotNullParameter(mVar2, "<this>");
                            arrayList.add(new h3k.m(mVar2.f318876a.f297794a, mVar2.f318877b, mVar2.f318878c.f306286a, mVar2.d.f306286a));
                        }
                        mVar.f.G(arrayList, "COUNTRIES_CACHE_KEY", kii.e.o(h3k.m.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        k params2 = (k) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<h3k.k> providersPricing = mVar.f158251a.getProvidersPricing(params2.f158243a.f306286a, params2.f158244b, params2.f158245c.f297794a, params2.d.f306286a);
                        i31.e eVar3 = new i31.e(12, new h(2));
                        providersPricing.getClass();
                        ufm.i iVar3 = new ufm.i(providersPricing, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        k params3 = (k) obj2;
                        List domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        mVar.e.f("ProvidersPricingParams" + params3.hashCode(), domain3);
                        return Unit.f186387a;
                    case 6:
                        l params4 = (l) obj2;
                        p domain4 = (p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        ne0.j jVar = mVar.f158253c;
                        jVar.clear();
                        jVar.f("RemittanceRoutesParam" + params4.hashCode(), domain4);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        j params5 = (j) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<List<h3k.d>> corridorProperties = mVar.f158251a.getCorridorProperties(params5.f158239a, params5.f158240b, params5.f158241c, params5.d, params5.e, params5.f, params5.f158242g);
                        i31.e eVar4 = new i31.e(10, new h(1));
                        corridorProperties.getClass();
                        ufm.i iVar4 = new ufm.i(corridorProperties, eVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    default:
                        j params6 = (j) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        mVar.f158252b.f("CorridorPropertiesParams" + params6.hashCode(), domain5);
                        return Unit.f186387a;
                }
            }
        };
        final int i2 = 3;
        Function1 function1 = new Function1(this) { // from class: i3k.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f158237b;

            {
                this.f158237b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f158237b.d.get("COUNTRIES_CACHE_KEY");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Type type = new TypeToken<List<? extends h3k.m>>() { // from class: com.revolut.retail.feature.payments.bank_transfer.impl.remittance.data.repository.RemittanceRepositoryImpl$recipientCountriesObservableDelegate$4$type$1
                        }.getType();
                        ue0.c cVar = this.f158237b.f;
                        Intrinsics.h(type);
                        List list = (List) cVar.T2("COUNTRIES_CACHE_KEY", type);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList.add(d.b((h3k.m) it10.next()));
                        }
                        return arrayList;
                    case 2:
                        k params = (k) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f158237b.e.get("ProvidersPricingParams" + params.hashCode());
                    case 3:
                        l params2 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (p) this.f158237b.f158253c.get("RemittanceRoutesParam" + params2.hashCode());
                    case 4:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        m mVar = this.f158237b;
                        String strB = mVar.f158254g.b("remittance_price_quote");
                        String str = strB == null ? null : strB;
                        RemittanceService remittanceService = mVar.f158251a;
                        String str2 = params3.f158246a;
                        String str3 = params3.f158247b;
                        String str4 = params3.f158248c;
                        long j2 = params3.d;
                        kq2.c cVar2 = params3.e;
                        d0<q> routes = remittanceService.getRoutes(str, str2, str3, str4, params3.f158249g, j2, true, cVar2 != null ? n2k.b.c(cVar2) : null, params3.f);
                        i31.e eVar = new i31.e(9, new ho6.n(str, 12));
                        routes.getClass();
                        ufm.i iVar = new ufm.i(routes, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        j params4 = (j) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        return (List) this.f158237b.f158252b.get("CorridorPropertiesParams" + params4.hashCode());
                }
            }
        };
        final int i3 = 6;
        this.f158255h = new w4l.f(function2, function1, new Function2(this) { // from class: i3k.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f158235b;

            {
                this.f158235b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i3;
                m mVar = this.f158235b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        l params = (l) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        String strB = mVar.f158254g.b("remittance_price_quote");
                        String str = strB == null ? null : strB;
                        RemittanceService remittanceService = mVar.f158251a;
                        String str2 = params.f158246a;
                        String str3 = params.f158247b;
                        String str4 = params.f158248c;
                        long j2 = params.d;
                        kq2.c cVar = params.e;
                        d0<q> routes = remittanceService.getRoutes(str, str2, str3, str4, params.f158249g, j2, true, cVar != null ? n2k.b.c(cVar) : null, params.f);
                        i31.e eVar = new i31.e(11, new ho6.n(str, 13));
                        routes.getClass();
                        ufm.i iVar = new ufm.i(routes, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<h3k.m>> recipientCountries = mVar.f158251a.getRecipientCountries();
                        i31.e eVar2 = new i31.e(8, new o(27));
                        recipientCountries.getClass();
                        ufm.i iVar2 = new ufm.i(recipientCountries, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        mVar.d.f("COUNTRIES_CACHE_KEY", domain);
                        return Unit.f186387a;
                    case 3:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        List<z1k.m> list = domain2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (z1k.m mVar2 : list) {
                            Map map = d.f158233a;
                            Intrinsics.checkNotNullParameter(mVar2, "<this>");
                            arrayList.add(new h3k.m(mVar2.f318876a.f297794a, mVar2.f318877b, mVar2.f318878c.f306286a, mVar2.d.f306286a));
                        }
                        mVar.f.G(arrayList, "COUNTRIES_CACHE_KEY", kii.e.o(h3k.m.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        k params2 = (k) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<h3k.k> providersPricing = mVar.f158251a.getProvidersPricing(params2.f158243a.f306286a, params2.f158244b, params2.f158245c.f297794a, params2.d.f306286a);
                        i31.e eVar3 = new i31.e(12, new h(2));
                        providersPricing.getClass();
                        ufm.i iVar3 = new ufm.i(providersPricing, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        k params3 = (k) obj2;
                        List domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        mVar.e.f("ProvidersPricingParams" + params3.hashCode(), domain3);
                        return Unit.f186387a;
                    case 6:
                        l params4 = (l) obj2;
                        p domain4 = (p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        ne0.j jVar = mVar.f158253c;
                        jVar.clear();
                        jVar.f("RemittanceRoutesParam" + params4.hashCode(), domain4);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        j params5 = (j) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<List<h3k.d>> corridorProperties = mVar.f158251a.getCorridorProperties(params5.f158239a, params5.f158240b, params5.f158241c, params5.d, params5.e, params5.f, params5.f158242g);
                        i31.e eVar4 = new i31.e(10, new h(1));
                        corridorProperties.getClass();
                        ufm.i iVar4 = new ufm.i(corridorProperties, eVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    default:
                        j params6 = (j) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        mVar.f158252b.f("CorridorPropertiesParams" + params6.hashCode(), domain5);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i5 = 4;
        this.i = new qe0.f(new Function1(this) { // from class: i3k.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f158237b;

            {
                this.f158237b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f158237b.d.get("COUNTRIES_CACHE_KEY");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Type type = new TypeToken<List<? extends h3k.m>>() { // from class: com.revolut.retail.feature.payments.bank_transfer.impl.remittance.data.repository.RemittanceRepositoryImpl$recipientCountriesObservableDelegate$4$type$1
                        }.getType();
                        ue0.c cVar = this.f158237b.f;
                        Intrinsics.h(type);
                        List list = (List) cVar.T2("COUNTRIES_CACHE_KEY", type);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList.add(d.b((h3k.m) it10.next()));
                        }
                        return arrayList;
                    case 2:
                        k params = (k) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f158237b.e.get("ProvidersPricingParams" + params.hashCode());
                    case 3:
                        l params2 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (p) this.f158237b.f158253c.get("RemittanceRoutesParam" + params2.hashCode());
                    case 4:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        m mVar = this.f158237b;
                        String strB = mVar.f158254g.b("remittance_price_quote");
                        String str = strB == null ? null : strB;
                        RemittanceService remittanceService = mVar.f158251a;
                        String str2 = params3.f158246a;
                        String str3 = params3.f158247b;
                        String str4 = params3.f158248c;
                        long j2 = params3.d;
                        kq2.c cVar2 = params3.e;
                        d0<q> routes = remittanceService.getRoutes(str, str2, str3, str4, params3.f158249g, j2, true, cVar2 != null ? n2k.b.c(cVar2) : null, params3.f);
                        i31.e eVar = new i31.e(9, new ho6.n(str, 12));
                        routes.getClass();
                        ufm.i iVar = new ufm.i(routes, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        j params4 = (j) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        return (List) this.f158237b.f158252b.get("CorridorPropertiesParams" + params4.hashCode());
                }
            }
        }, new hnc.a(this, 14), new o(29), new h(0));
        final int i6 = 7;
        Function2 function22 = new Function2(this) { // from class: i3k.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f158235b;

            {
                this.f158235b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i6;
                m mVar = this.f158235b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        l params = (l) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        String strB = mVar.f158254g.b("remittance_price_quote");
                        String str = strB == null ? null : strB;
                        RemittanceService remittanceService = mVar.f158251a;
                        String str2 = params.f158246a;
                        String str3 = params.f158247b;
                        String str4 = params.f158248c;
                        long j2 = params.d;
                        kq2.c cVar = params.e;
                        d0<q> routes = remittanceService.getRoutes(str, str2, str3, str4, params.f158249g, j2, true, cVar != null ? n2k.b.c(cVar) : null, params.f);
                        i31.e eVar = new i31.e(11, new ho6.n(str, 13));
                        routes.getClass();
                        ufm.i iVar = new ufm.i(routes, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<h3k.m>> recipientCountries = mVar.f158251a.getRecipientCountries();
                        i31.e eVar2 = new i31.e(8, new o(27));
                        recipientCountries.getClass();
                        ufm.i iVar2 = new ufm.i(recipientCountries, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        mVar.d.f("COUNTRIES_CACHE_KEY", domain);
                        return Unit.f186387a;
                    case 3:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        List<z1k.m> list = domain2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (z1k.m mVar2 : list) {
                            Map map = d.f158233a;
                            Intrinsics.checkNotNullParameter(mVar2, "<this>");
                            arrayList.add(new h3k.m(mVar2.f318876a.f297794a, mVar2.f318877b, mVar2.f318878c.f306286a, mVar2.d.f306286a));
                        }
                        mVar.f.G(arrayList, "COUNTRIES_CACHE_KEY", kii.e.o(h3k.m.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        k params2 = (k) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<h3k.k> providersPricing = mVar.f158251a.getProvidersPricing(params2.f158243a.f306286a, params2.f158244b, params2.f158245c.f297794a, params2.d.f306286a);
                        i31.e eVar3 = new i31.e(12, new h(2));
                        providersPricing.getClass();
                        ufm.i iVar3 = new ufm.i(providersPricing, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        k params3 = (k) obj2;
                        List domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        mVar.e.f("ProvidersPricingParams" + params3.hashCode(), domain3);
                        return Unit.f186387a;
                    case 6:
                        l params4 = (l) obj2;
                        p domain4 = (p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        ne0.j jVar = mVar.f158253c;
                        jVar.clear();
                        jVar.f("RemittanceRoutesParam" + params4.hashCode(), domain4);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        j params5 = (j) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<List<h3k.d>> corridorProperties = mVar.f158251a.getCorridorProperties(params5.f158239a, params5.f158240b, params5.f158241c, params5.d, params5.e, params5.f, params5.f158242g);
                        i31.e eVar4 = new i31.e(10, new h(1));
                        corridorProperties.getClass();
                        ufm.i iVar4 = new ufm.i(corridorProperties, eVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    default:
                        j params6 = (j) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        mVar.f158252b.f("CorridorPropertiesParams" + params6.hashCode(), domain5);
                        return Unit.f186387a;
                }
            }
        };
        final int i21 = 5;
        Function1 function12 = new Function1(this) { // from class: i3k.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f158237b;

            {
                this.f158237b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i21) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f158237b.d.get("COUNTRIES_CACHE_KEY");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Type type = new TypeToken<List<? extends h3k.m>>() { // from class: com.revolut.retail.feature.payments.bank_transfer.impl.remittance.data.repository.RemittanceRepositoryImpl$recipientCountriesObservableDelegate$4$type$1
                        }.getType();
                        ue0.c cVar = this.f158237b.f;
                        Intrinsics.h(type);
                        List list = (List) cVar.T2("COUNTRIES_CACHE_KEY", type);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList.add(d.b((h3k.m) it10.next()));
                        }
                        return arrayList;
                    case 2:
                        k params = (k) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f158237b.e.get("ProvidersPricingParams" + params.hashCode());
                    case 3:
                        l params2 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (p) this.f158237b.f158253c.get("RemittanceRoutesParam" + params2.hashCode());
                    case 4:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        m mVar = this.f158237b;
                        String strB = mVar.f158254g.b("remittance_price_quote");
                        String str = strB == null ? null : strB;
                        RemittanceService remittanceService = mVar.f158251a;
                        String str2 = params3.f158246a;
                        String str3 = params3.f158247b;
                        String str4 = params3.f158248c;
                        long j2 = params3.d;
                        kq2.c cVar2 = params3.e;
                        d0<q> routes = remittanceService.getRoutes(str, str2, str3, str4, params3.f158249g, j2, true, cVar2 != null ? n2k.b.c(cVar2) : null, params3.f);
                        i31.e eVar = new i31.e(9, new ho6.n(str, 12));
                        routes.getClass();
                        ufm.i iVar = new ufm.i(routes, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        j params4 = (j) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        return (List) this.f158237b.f158252b.get("CorridorPropertiesParams" + params4.hashCode());
                }
            }
        };
        final int i22 = 8;
        this.f158256j = new w4l.f(function22, function12, new Function2(this) { // from class: i3k.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f158235b;

            {
                this.f158235b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i22;
                m mVar = this.f158235b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        l params = (l) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        String strB = mVar.f158254g.b("remittance_price_quote");
                        String str = strB == null ? null : strB;
                        RemittanceService remittanceService = mVar.f158251a;
                        String str2 = params.f158246a;
                        String str3 = params.f158247b;
                        String str4 = params.f158248c;
                        long j2 = params.d;
                        kq2.c cVar = params.e;
                        d0<q> routes = remittanceService.getRoutes(str, str2, str3, str4, params.f158249g, j2, true, cVar != null ? n2k.b.c(cVar) : null, params.f);
                        i31.e eVar = new i31.e(11, new ho6.n(str, 13));
                        routes.getClass();
                        ufm.i iVar = new ufm.i(routes, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<h3k.m>> recipientCountries = mVar.f158251a.getRecipientCountries();
                        i31.e eVar2 = new i31.e(8, new o(27));
                        recipientCountries.getClass();
                        ufm.i iVar2 = new ufm.i(recipientCountries, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        mVar.d.f("COUNTRIES_CACHE_KEY", domain);
                        return Unit.f186387a;
                    case 3:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        List<z1k.m> list = domain2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (z1k.m mVar2 : list) {
                            Map map = d.f158233a;
                            Intrinsics.checkNotNullParameter(mVar2, "<this>");
                            arrayList.add(new h3k.m(mVar2.f318876a.f297794a, mVar2.f318877b, mVar2.f318878c.f306286a, mVar2.d.f306286a));
                        }
                        mVar.f.G(arrayList, "COUNTRIES_CACHE_KEY", kii.e.o(h3k.m.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        k params2 = (k) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<h3k.k> providersPricing = mVar.f158251a.getProvidersPricing(params2.f158243a.f306286a, params2.f158244b, params2.f158245c.f297794a, params2.d.f306286a);
                        i31.e eVar3 = new i31.e(12, new h(2));
                        providersPricing.getClass();
                        ufm.i iVar3 = new ufm.i(providersPricing, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        k params3 = (k) obj2;
                        List domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        mVar.e.f("ProvidersPricingParams" + params3.hashCode(), domain3);
                        return Unit.f186387a;
                    case 6:
                        l params4 = (l) obj2;
                        p domain4 = (p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        ne0.j jVar = mVar.f158253c;
                        jVar.clear();
                        jVar.f("RemittanceRoutesParam" + params4.hashCode(), domain4);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        j params5 = (j) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<List<h3k.d>> corridorProperties = mVar.f158251a.getCorridorProperties(params5.f158239a, params5.f158240b, params5.f158241c, params5.d, params5.e, params5.f, params5.f158242g);
                        i31.e eVar4 = new i31.e(10, new h(1));
                        corridorProperties.getClass();
                        ufm.i iVar4 = new ufm.i(corridorProperties, eVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    default:
                        j params6 = (j) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        mVar.f158252b.f("CorridorPropertiesParams" + params6.hashCode(), domain5);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i32 = 1;
        Function2 function23 = new Function2(this) { // from class: i3k.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f158235b;

            {
                this.f158235b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i32;
                m mVar = this.f158235b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        l params = (l) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        String strB = mVar.f158254g.b("remittance_price_quote");
                        String str = strB == null ? null : strB;
                        RemittanceService remittanceService = mVar.f158251a;
                        String str2 = params.f158246a;
                        String str3 = params.f158247b;
                        String str4 = params.f158248c;
                        long j2 = params.d;
                        kq2.c cVar = params.e;
                        d0<q> routes = remittanceService.getRoutes(str, str2, str3, str4, params.f158249g, j2, true, cVar != null ? n2k.b.c(cVar) : null, params.f);
                        i31.e eVar = new i31.e(11, new ho6.n(str, 13));
                        routes.getClass();
                        ufm.i iVar = new ufm.i(routes, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<h3k.m>> recipientCountries = mVar.f158251a.getRecipientCountries();
                        i31.e eVar2 = new i31.e(8, new o(27));
                        recipientCountries.getClass();
                        ufm.i iVar2 = new ufm.i(recipientCountries, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        mVar.d.f("COUNTRIES_CACHE_KEY", domain);
                        return Unit.f186387a;
                    case 3:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        List<z1k.m> list = domain2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (z1k.m mVar2 : list) {
                            Map map = d.f158233a;
                            Intrinsics.checkNotNullParameter(mVar2, "<this>");
                            arrayList.add(new h3k.m(mVar2.f318876a.f297794a, mVar2.f318877b, mVar2.f318878c.f306286a, mVar2.d.f306286a));
                        }
                        mVar.f.G(arrayList, "COUNTRIES_CACHE_KEY", kii.e.o(h3k.m.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        k params2 = (k) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<h3k.k> providersPricing = mVar.f158251a.getProvidersPricing(params2.f158243a.f306286a, params2.f158244b, params2.f158245c.f297794a, params2.d.f306286a);
                        i31.e eVar3 = new i31.e(12, new h(2));
                        providersPricing.getClass();
                        ufm.i iVar3 = new ufm.i(providersPricing, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        k params3 = (k) obj2;
                        List domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        mVar.e.f("ProvidersPricingParams" + params3.hashCode(), domain3);
                        return Unit.f186387a;
                    case 6:
                        l params4 = (l) obj2;
                        p domain4 = (p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        ne0.j jVar = mVar.f158253c;
                        jVar.clear();
                        jVar.f("RemittanceRoutesParam" + params4.hashCode(), domain4);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        j params5 = (j) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<List<h3k.d>> corridorProperties = mVar.f158251a.getCorridorProperties(params5.f158239a, params5.f158240b, params5.f158241c, params5.d, params5.e, params5.f, params5.f158242g);
                        i31.e eVar4 = new i31.e(10, new h(1));
                        corridorProperties.getClass();
                        ufm.i iVar4 = new ufm.i(corridorProperties, eVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    default:
                        j params6 = (j) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        mVar.f158252b.f("CorridorPropertiesParams" + params6.hashCode(), domain5);
                        return Unit.f186387a;
                }
            }
        };
        final int i33 = 0;
        Function1 function13 = new Function1(this) { // from class: i3k.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f158237b;

            {
                this.f158237b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i33) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f158237b.d.get("COUNTRIES_CACHE_KEY");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Type type = new TypeToken<List<? extends h3k.m>>() { // from class: com.revolut.retail.feature.payments.bank_transfer.impl.remittance.data.repository.RemittanceRepositoryImpl$recipientCountriesObservableDelegate$4$type$1
                        }.getType();
                        ue0.c cVar = this.f158237b.f;
                        Intrinsics.h(type);
                        List list = (List) cVar.T2("COUNTRIES_CACHE_KEY", type);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList.add(d.b((h3k.m) it10.next()));
                        }
                        return arrayList;
                    case 2:
                        k params = (k) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f158237b.e.get("ProvidersPricingParams" + params.hashCode());
                    case 3:
                        l params2 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (p) this.f158237b.f158253c.get("RemittanceRoutesParam" + params2.hashCode());
                    case 4:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        m mVar = this.f158237b;
                        String strB = mVar.f158254g.b("remittance_price_quote");
                        String str = strB == null ? null : strB;
                        RemittanceService remittanceService = mVar.f158251a;
                        String str2 = params3.f158246a;
                        String str3 = params3.f158247b;
                        String str4 = params3.f158248c;
                        long j2 = params3.d;
                        kq2.c cVar2 = params3.e;
                        d0<q> routes = remittanceService.getRoutes(str, str2, str3, str4, params3.f158249g, j2, true, cVar2 != null ? n2k.b.c(cVar2) : null, params3.f);
                        i31.e eVar = new i31.e(9, new ho6.n(str, 12));
                        routes.getClass();
                        ufm.i iVar = new ufm.i(routes, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        j params4 = (j) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        return (List) this.f158237b.f158252b.get("CorridorPropertiesParams" + params4.hashCode());
                }
            }
        };
        final int i43 = 2;
        Function2 function24 = new Function2(this) { // from class: i3k.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f158235b;

            {
                this.f158235b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i43;
                m mVar = this.f158235b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        l params = (l) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        String strB = mVar.f158254g.b("remittance_price_quote");
                        String str = strB == null ? null : strB;
                        RemittanceService remittanceService = mVar.f158251a;
                        String str2 = params.f158246a;
                        String str3 = params.f158247b;
                        String str4 = params.f158248c;
                        long j2 = params.d;
                        kq2.c cVar = params.e;
                        d0<q> routes = remittanceService.getRoutes(str, str2, str3, str4, params.f158249g, j2, true, cVar != null ? n2k.b.c(cVar) : null, params.f);
                        i31.e eVar = new i31.e(11, new ho6.n(str, 13));
                        routes.getClass();
                        ufm.i iVar = new ufm.i(routes, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<h3k.m>> recipientCountries = mVar.f158251a.getRecipientCountries();
                        i31.e eVar2 = new i31.e(8, new o(27));
                        recipientCountries.getClass();
                        ufm.i iVar2 = new ufm.i(recipientCountries, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        mVar.d.f("COUNTRIES_CACHE_KEY", domain);
                        return Unit.f186387a;
                    case 3:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        List<z1k.m> list = domain2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (z1k.m mVar2 : list) {
                            Map map = d.f158233a;
                            Intrinsics.checkNotNullParameter(mVar2, "<this>");
                            arrayList.add(new h3k.m(mVar2.f318876a.f297794a, mVar2.f318877b, mVar2.f318878c.f306286a, mVar2.d.f306286a));
                        }
                        mVar.f.G(arrayList, "COUNTRIES_CACHE_KEY", kii.e.o(h3k.m.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        k params2 = (k) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<h3k.k> providersPricing = mVar.f158251a.getProvidersPricing(params2.f158243a.f306286a, params2.f158244b, params2.f158245c.f297794a, params2.d.f306286a);
                        i31.e eVar3 = new i31.e(12, new h(2));
                        providersPricing.getClass();
                        ufm.i iVar3 = new ufm.i(providersPricing, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        k params3 = (k) obj2;
                        List domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        mVar.e.f("ProvidersPricingParams" + params3.hashCode(), domain3);
                        return Unit.f186387a;
                    case 6:
                        l params4 = (l) obj2;
                        p domain4 = (p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        ne0.j jVar = mVar.f158253c;
                        jVar.clear();
                        jVar.f("RemittanceRoutesParam" + params4.hashCode(), domain4);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        j params5 = (j) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<List<h3k.d>> corridorProperties = mVar.f158251a.getCorridorProperties(params5.f158239a, params5.f158240b, params5.f158241c, params5.d, params5.e, params5.f, params5.f158242g);
                        i31.e eVar4 = new i31.e(10, new h(1));
                        corridorProperties.getClass();
                        ufm.i iVar4 = new ufm.i(corridorProperties, eVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    default:
                        j params6 = (j) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        mVar.f158252b.f("CorridorPropertiesParams" + params6.hashCode(), domain5);
                        return Unit.f186387a;
                }
            }
        };
        final int i59 = 1;
        Function1 function14 = new Function1(this) { // from class: i3k.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f158237b;

            {
                this.f158237b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i59) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f158237b.d.get("COUNTRIES_CACHE_KEY");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Type type = new TypeToken<List<? extends h3k.m>>() { // from class: com.revolut.retail.feature.payments.bank_transfer.impl.remittance.data.repository.RemittanceRepositoryImpl$recipientCountriesObservableDelegate$4$type$1
                        }.getType();
                        ue0.c cVar = this.f158237b.f;
                        Intrinsics.h(type);
                        List list = (List) cVar.T2("COUNTRIES_CACHE_KEY", type);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList.add(d.b((h3k.m) it10.next()));
                        }
                        return arrayList;
                    case 2:
                        k params = (k) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f158237b.e.get("ProvidersPricingParams" + params.hashCode());
                    case 3:
                        l params2 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (p) this.f158237b.f158253c.get("RemittanceRoutesParam" + params2.hashCode());
                    case 4:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        m mVar = this.f158237b;
                        String strB = mVar.f158254g.b("remittance_price_quote");
                        String str = strB == null ? null : strB;
                        RemittanceService remittanceService = mVar.f158251a;
                        String str2 = params3.f158246a;
                        String str3 = params3.f158247b;
                        String str4 = params3.f158248c;
                        long j2 = params3.d;
                        kq2.c cVar2 = params3.e;
                        d0<q> routes = remittanceService.getRoutes(str, str2, str3, str4, params3.f158249g, j2, true, cVar2 != null ? n2k.b.c(cVar2) : null, params3.f);
                        i31.e eVar = new i31.e(9, new ho6.n(str, 12));
                        routes.getClass();
                        ufm.i iVar = new ufm.i(routes, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        j params4 = (j) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        return (List) this.f158237b.f158252b.get("CorridorPropertiesParams" + params4.hashCode());
                }
            }
        };
        final int i66 = 3;
        this.k = new w4l.f(function23, function13, function24, function14, new Function2(this) { // from class: i3k.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f158235b;

            {
                this.f158235b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i66;
                m mVar = this.f158235b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        l params = (l) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        String strB = mVar.f158254g.b("remittance_price_quote");
                        String str = strB == null ? null : strB;
                        RemittanceService remittanceService = mVar.f158251a;
                        String str2 = params.f158246a;
                        String str3 = params.f158247b;
                        String str4 = params.f158248c;
                        long j2 = params.d;
                        kq2.c cVar = params.e;
                        d0<q> routes = remittanceService.getRoutes(str, str2, str3, str4, params.f158249g, j2, true, cVar != null ? n2k.b.c(cVar) : null, params.f);
                        i31.e eVar = new i31.e(11, new ho6.n(str, 13));
                        routes.getClass();
                        ufm.i iVar = new ufm.i(routes, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<h3k.m>> recipientCountries = mVar.f158251a.getRecipientCountries();
                        i31.e eVar2 = new i31.e(8, new o(27));
                        recipientCountries.getClass();
                        ufm.i iVar2 = new ufm.i(recipientCountries, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        mVar.d.f("COUNTRIES_CACHE_KEY", domain);
                        return Unit.f186387a;
                    case 3:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        List<z1k.m> list = domain2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (z1k.m mVar2 : list) {
                            Map map = d.f158233a;
                            Intrinsics.checkNotNullParameter(mVar2, "<this>");
                            arrayList.add(new h3k.m(mVar2.f318876a.f297794a, mVar2.f318877b, mVar2.f318878c.f306286a, mVar2.d.f306286a));
                        }
                        mVar.f.G(arrayList, "COUNTRIES_CACHE_KEY", kii.e.o(h3k.m.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        k params2 = (k) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<h3k.k> providersPricing = mVar.f158251a.getProvidersPricing(params2.f158243a.f306286a, params2.f158244b, params2.f158245c.f297794a, params2.d.f306286a);
                        i31.e eVar3 = new i31.e(12, new h(2));
                        providersPricing.getClass();
                        ufm.i iVar3 = new ufm.i(providersPricing, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        k params3 = (k) obj2;
                        List domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        mVar.e.f("ProvidersPricingParams" + params3.hashCode(), domain3);
                        return Unit.f186387a;
                    case 6:
                        l params4 = (l) obj2;
                        p domain4 = (p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        ne0.j jVar = mVar.f158253c;
                        jVar.clear();
                        jVar.f("RemittanceRoutesParam" + params4.hashCode(), domain4);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        j params5 = (j) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<List<h3k.d>> corridorProperties = mVar.f158251a.getCorridorProperties(params5.f158239a, params5.f158240b, params5.f158241c, params5.d, params5.e, params5.f, params5.f158242g);
                        i31.e eVar4 = new i31.e(10, new h(1));
                        corridorProperties.getClass();
                        ufm.i iVar4 = new ufm.i(corridorProperties, eVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    default:
                        j params6 = (j) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        mVar.f158252b.f("CorridorPropertiesParams" + params6.hashCode(), domain5);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i74 = 4;
        Function2 function25 = new Function2(this) { // from class: i3k.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f158235b;

            {
                this.f158235b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i74;
                m mVar = this.f158235b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        l params = (l) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        String strB = mVar.f158254g.b("remittance_price_quote");
                        String str = strB == null ? null : strB;
                        RemittanceService remittanceService = mVar.f158251a;
                        String str2 = params.f158246a;
                        String str3 = params.f158247b;
                        String str4 = params.f158248c;
                        long j2 = params.d;
                        kq2.c cVar = params.e;
                        d0<q> routes = remittanceService.getRoutes(str, str2, str3, str4, params.f158249g, j2, true, cVar != null ? n2k.b.c(cVar) : null, params.f);
                        i31.e eVar = new i31.e(11, new ho6.n(str, 13));
                        routes.getClass();
                        ufm.i iVar = new ufm.i(routes, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<h3k.m>> recipientCountries = mVar.f158251a.getRecipientCountries();
                        i31.e eVar2 = new i31.e(8, new o(27));
                        recipientCountries.getClass();
                        ufm.i iVar2 = new ufm.i(recipientCountries, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        mVar.d.f("COUNTRIES_CACHE_KEY", domain);
                        return Unit.f186387a;
                    case 3:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        List<z1k.m> list = domain2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (z1k.m mVar2 : list) {
                            Map map = d.f158233a;
                            Intrinsics.checkNotNullParameter(mVar2, "<this>");
                            arrayList.add(new h3k.m(mVar2.f318876a.f297794a, mVar2.f318877b, mVar2.f318878c.f306286a, mVar2.d.f306286a));
                        }
                        mVar.f.G(arrayList, "COUNTRIES_CACHE_KEY", kii.e.o(h3k.m.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        k params2 = (k) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<h3k.k> providersPricing = mVar.f158251a.getProvidersPricing(params2.f158243a.f306286a, params2.f158244b, params2.f158245c.f297794a, params2.d.f306286a);
                        i31.e eVar3 = new i31.e(12, new h(2));
                        providersPricing.getClass();
                        ufm.i iVar3 = new ufm.i(providersPricing, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        k params3 = (k) obj2;
                        List domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        mVar.e.f("ProvidersPricingParams" + params3.hashCode(), domain3);
                        return Unit.f186387a;
                    case 6:
                        l params4 = (l) obj2;
                        p domain4 = (p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        ne0.j jVar = mVar.f158253c;
                        jVar.clear();
                        jVar.f("RemittanceRoutesParam" + params4.hashCode(), domain4);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        j params5 = (j) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<List<h3k.d>> corridorProperties = mVar.f158251a.getCorridorProperties(params5.f158239a, params5.f158240b, params5.f158241c, params5.d, params5.e, params5.f, params5.f158242g);
                        i31.e eVar4 = new i31.e(10, new h(1));
                        corridorProperties.getClass();
                        ufm.i iVar4 = new ufm.i(corridorProperties, eVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    default:
                        j params6 = (j) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        mVar.f158252b.f("CorridorPropertiesParams" + params6.hashCode(), domain5);
                        return Unit.f186387a;
                }
            }
        };
        final int i92 = 2;
        Function1 function15 = new Function1(this) { // from class: i3k.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f158237b;

            {
                this.f158237b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i92) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f158237b.d.get("COUNTRIES_CACHE_KEY");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Type type = new TypeToken<List<? extends h3k.m>>() { // from class: com.revolut.retail.feature.payments.bank_transfer.impl.remittance.data.repository.RemittanceRepositoryImpl$recipientCountriesObservableDelegate$4$type$1
                        }.getType();
                        ue0.c cVar = this.f158237b.f;
                        Intrinsics.h(type);
                        List list = (List) cVar.T2("COUNTRIES_CACHE_KEY", type);
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList.add(d.b((h3k.m) it10.next()));
                        }
                        return arrayList;
                    case 2:
                        k params = (k) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f158237b.e.get("ProvidersPricingParams" + params.hashCode());
                    case 3:
                        l params2 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (p) this.f158237b.f158253c.get("RemittanceRoutesParam" + params2.hashCode());
                    case 4:
                        l params3 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        m mVar = this.f158237b;
                        String strB = mVar.f158254g.b("remittance_price_quote");
                        String str = strB == null ? null : strB;
                        RemittanceService remittanceService = mVar.f158251a;
                        String str2 = params3.f158246a;
                        String str3 = params3.f158247b;
                        String str4 = params3.f158248c;
                        long j2 = params3.d;
                        kq2.c cVar2 = params3.e;
                        d0<q> routes = remittanceService.getRoutes(str, str2, str3, str4, params3.f158249g, j2, true, cVar2 != null ? n2k.b.c(cVar2) : null, params3.f);
                        i31.e eVar = new i31.e(9, new ho6.n(str, 12));
                        routes.getClass();
                        ufm.i iVar = new ufm.i(routes, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        j params4 = (j) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        return (List) this.f158237b.f158252b.get("CorridorPropertiesParams" + params4.hashCode());
                }
            }
        };
        final int i96 = 5;
        this.f158257l = new w4l.f(function25, function15, new Function2(this) { // from class: i3k.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f158235b;

            {
                this.f158235b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i96;
                m mVar = this.f158235b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        l params = (l) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        String strB = mVar.f158254g.b("remittance_price_quote");
                        String str = strB == null ? null : strB;
                        RemittanceService remittanceService = mVar.f158251a;
                        String str2 = params.f158246a;
                        String str3 = params.f158247b;
                        String str4 = params.f158248c;
                        long j2 = params.d;
                        kq2.c cVar = params.e;
                        d0<q> routes = remittanceService.getRoutes(str, str2, str3, str4, params.f158249g, j2, true, cVar != null ? n2k.b.c(cVar) : null, params.f);
                        i31.e eVar = new i31.e(11, new ho6.n(str, 13));
                        routes.getClass();
                        ufm.i iVar = new ufm.i(routes, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<h3k.m>> recipientCountries = mVar.f158251a.getRecipientCountries();
                        i31.e eVar2 = new i31.e(8, new o(27));
                        recipientCountries.getClass();
                        ufm.i iVar2 = new ufm.i(recipientCountries, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        mVar.d.f("COUNTRIES_CACHE_KEY", domain);
                        return Unit.f186387a;
                    case 3:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        List<z1k.m> list = domain2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (z1k.m mVar2 : list) {
                            Map map = d.f158233a;
                            Intrinsics.checkNotNullParameter(mVar2, "<this>");
                            arrayList.add(new h3k.m(mVar2.f318876a.f297794a, mVar2.f318877b, mVar2.f318878c.f306286a, mVar2.d.f306286a));
                        }
                        mVar.f.G(arrayList, "COUNTRIES_CACHE_KEY", kii.e.o(h3k.m.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        k params2 = (k) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<h3k.k> providersPricing = mVar.f158251a.getProvidersPricing(params2.f158243a.f306286a, params2.f158244b, params2.f158245c.f297794a, params2.d.f306286a);
                        i31.e eVar3 = new i31.e(12, new h(2));
                        providersPricing.getClass();
                        ufm.i iVar3 = new ufm.i(providersPricing, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        k params3 = (k) obj2;
                        List domain3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        mVar.e.f("ProvidersPricingParams" + params3.hashCode(), domain3);
                        return Unit.f186387a;
                    case 6:
                        l params4 = (l) obj2;
                        p domain4 = (p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        ne0.j jVar = mVar.f158253c;
                        jVar.clear();
                        jVar.f("RemittanceRoutesParam" + params4.hashCode(), domain4);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        j params5 = (j) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        d0<List<h3k.d>> corridorProperties = mVar.f158251a.getCorridorProperties(params5.f158239a, params5.f158240b, params5.f158241c, params5.d, params5.e, params5.f, params5.f158242g);
                        i31.e eVar4 = new i31.e(10, new h(1));
                        corridorProperties.getClass();
                        ufm.i iVar4 = new ufm.i(corridorProperties, eVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    default:
                        j params6 = (j) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        mVar.f158252b.f("CorridorPropertiesParams" + params6.hashCode(), domain5);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
