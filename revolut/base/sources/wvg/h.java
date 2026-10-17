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

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComplexWealthAnalyticsService f300381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f300382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nvg.a f300383c;
    public final w4l.f d;

    public h(b80.c networkStateRepository, ComplexWealthAnalyticsService complexWealthAnalyticsService, ne0.j memoryCache, nvg.a complexAnalyticsAllocationsDao) {
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(complexWealthAnalyticsService, "complexWealthAnalyticsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(complexAnalyticsAllocationsDao, "complexAnalyticsAllocationsDao");
        this.f300381a = complexWealthAnalyticsService;
        this.f300382b = memoryCache;
        this.f300383c = complexAnalyticsAllocationsDao;
        final int i = 0;
        uj0.b bVarK0 = te0.w.k0(networkStateRepository, new Function1(this) { // from class: wvg.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f300366b;

            {
                this.f300366b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                mwg.c cVar;
                switch (i) {
                    case 0:
                        a params = (a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<uvg.b> allocations = this.f300366b.f300381a.getAllocations(params.f300320a, kotlin.jvm.internal.s.Q(params.f300321b), params.f300322c, params.d.f306286a, params.e);
                        wsg.k kVar = new wsg.k(new wpj.b(params, 22), 13);
                        allocations.getClass();
                        ufm.i iVar = new ufm.i(allocations, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        a params2 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (mwg.a) this.f300366b.f300382b.get(ta6.a.c(params2));
                    default:
                        a params3 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        nvg.a aVar = this.f300366b.f300383c;
                        iwg.a aVar2 = params3.f300321b;
                        boolean z = params3.f300322c;
                        String str = params3.d.f306286a;
                        String str2 = params3.e;
                        if (str2 == null) {
                            str2 = "LOCAL_PORTFOLIO_ID";
                        }
                        List listE = aVar.e(aVar2, z, str, str2);
                        Intrinsics.checkNotNullParameter(listE, "<this>");
                        pvg.c cVar2 = (pvg.c) zhm.d0.d0(listE);
                        if (cVar2 == null) {
                            return null;
                        }
                        iwg.a aVar3 = cVar2.f240088a;
                        boolean z3 = cVar2.f240089b;
                        dj0.d dVarV = hx7.a.v(((pvg.c) zhm.d0.b0(listE)).f240090c);
                        List<pvg.c> list = listE;
                        ArrayList arrayList = new ArrayList();
                        for (pvg.c cVar3 : list) {
                            String str3 = cVar3.d;
                            jo3.b bVar = cVar3.e;
                            Float f = cVar3.f;
                            mwg.d dVar = (str3 == null || bVar == null || f == null) ? null : new mwg.d(str3, hx7.a.v(bVar), f.floatValue());
                            if (dVar != null) {
                                arrayList.add(dVar);
                            }
                        }
                        List listU = zhm.d0.U(arrayList);
                        ArrayList arrayList2 = new ArrayList();
                        for (pvg.c cVar4 : list) {
                            String str4 = cVar4.f240091g;
                            String str5 = cVar4.f240092h;
                            jo3.b bVar2 = cVar4.i;
                            Float f4 = cVar4.f240093j;
                            if (str4 == null || str5 == null || bVar2 == null || f4 == null) {
                                cVar = null;
                            } else {
                                float fFloatValue = f4.floatValue();
                                BigDecimal bigDecimal = new BigDecimal(str5);
                                dj0.d dVarV2 = hx7.a.v(bVar2);
                                String str6 = cVar4.k;
                                ko3.b bVar3 = cVar4.f240094l;
                                ej0.b bVarI = bVar3 != null ? cp5.c.I(bVar3) : null;
                                ko3.b bVar4 = cVar4.f240095m;
                                ej0.b bVarI2 = bVar4 != null ? cp5.c.I(bVar4) : null;
                                String str7 = cVar4.f240096n;
                                String str8 = cVar4.o;
                                cVar = new mwg.c(str4, bigDecimal, dVarV2, fFloatValue, str6, bVarI, bVarI2, str7, str8 != null ? new BigDecimal(str8) : null);
                            }
                            if (cVar != null) {
                                arrayList2.add(cVar);
                            }
                        }
                        return new mwg.a(aVar3, z3, dVarV, listU, zhm.d0.U(arrayList2));
                }
            }
        });
        final int i2 = 1;
        Function1 function1 = new Function1(this) { // from class: wvg.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f300366b;

            {
                this.f300366b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                mwg.c cVar;
                switch (i2) {
                    case 0:
                        a params = (a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<uvg.b> allocations = this.f300366b.f300381a.getAllocations(params.f300320a, kotlin.jvm.internal.s.Q(params.f300321b), params.f300322c, params.d.f306286a, params.e);
                        wsg.k kVar = new wsg.k(new wpj.b(params, 22), 13);
                        allocations.getClass();
                        ufm.i iVar = new ufm.i(allocations, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        a params2 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (mwg.a) this.f300366b.f300382b.get(ta6.a.c(params2));
                    default:
                        a params3 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        nvg.a aVar = this.f300366b.f300383c;
                        iwg.a aVar2 = params3.f300321b;
                        boolean z = params3.f300322c;
                        String str = params3.d.f306286a;
                        String str2 = params3.e;
                        if (str2 == null) {
                            str2 = "LOCAL_PORTFOLIO_ID";
                        }
                        List listE = aVar.e(aVar2, z, str, str2);
                        Intrinsics.checkNotNullParameter(listE, "<this>");
                        pvg.c cVar2 = (pvg.c) zhm.d0.d0(listE);
                        if (cVar2 == null) {
                            return null;
                        }
                        iwg.a aVar3 = cVar2.f240088a;
                        boolean z3 = cVar2.f240089b;
                        dj0.d dVarV = hx7.a.v(((pvg.c) zhm.d0.b0(listE)).f240090c);
                        List<pvg.c> list = listE;
                        ArrayList arrayList = new ArrayList();
                        for (pvg.c cVar3 : list) {
                            String str3 = cVar3.d;
                            jo3.b bVar = cVar3.e;
                            Float f = cVar3.f;
                            mwg.d dVar = (str3 == null || bVar == null || f == null) ? null : new mwg.d(str3, hx7.a.v(bVar), f.floatValue());
                            if (dVar != null) {
                                arrayList.add(dVar);
                            }
                        }
                        List listU = zhm.d0.U(arrayList);
                        ArrayList arrayList2 = new ArrayList();
                        for (pvg.c cVar4 : list) {
                            String str4 = cVar4.f240091g;
                            String str5 = cVar4.f240092h;
                            jo3.b bVar2 = cVar4.i;
                            Float f4 = cVar4.f240093j;
                            if (str4 == null || str5 == null || bVar2 == null || f4 == null) {
                                cVar = null;
                            } else {
                                float fFloatValue = f4.floatValue();
                                BigDecimal bigDecimal = new BigDecimal(str5);
                                dj0.d dVarV2 = hx7.a.v(bVar2);
                                String str6 = cVar4.k;
                                ko3.b bVar3 = cVar4.f240094l;
                                ej0.b bVarI = bVar3 != null ? cp5.c.I(bVar3) : null;
                                ko3.b bVar4 = cVar4.f240095m;
                                ej0.b bVarI2 = bVar4 != null ? cp5.c.I(bVar4) : null;
                                String str7 = cVar4.f240096n;
                                String str8 = cVar4.o;
                                cVar = new mwg.c(str4, bigDecimal, dVarV2, fFloatValue, str6, bVarI, bVarI2, str7, str8 != null ? new BigDecimal(str8) : null);
                            }
                            if (cVar != null) {
                                arrayList2.add(cVar);
                            }
                        }
                        return new mwg.a(aVar3, z3, dVarV, listU, zhm.d0.U(arrayList2));
                }
            }
        };
        final int i3 = 0;
        Function2 function2 = new Function2(this) { // from class: wvg.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f300374b;

            {
                this.f300374b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        a params = (a) obj2;
                        mwg.a domain = (mwg.a) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f300374b.f300382b.f(ta6.a.c(params), domain);
                        break;
                    default:
                        a params2 = (a) obj2;
                        mwg.a domain2 = (mwg.a) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        xi0.b currency = params2.d;
                        String str = params2.e;
                        if (str == null) {
                            str = "LOCAL_PORTFOLIO_ID";
                        }
                        String portfolioId = str;
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        pvg.d dVar = new pvg.d(domain2.f209434a, domain2.f209435b, currency.f306286a, portfolioId, hx7.a.A(domain2.f209436c));
                        List<mwg.d> list = domain2.d;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (mwg.d dVar2 : list) {
                            arrayList.add(new pvg.b(dVar2.f209449c, domain2.f209434a, currency.f306286a, portfolioId, dVar2.f209447a, hx7.a.A(dVar2.f209448b), domain2.f209435b));
                        }
                        List<mwg.c> list2 = domain2.e;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (mwg.c cVar : list2) {
                            iwg.a aVar = domain2.f209434a;
                            boolean z = domain2.f209435b;
                            String str2 = currency.f306286a;
                            String str3 = cVar.f209442a;
                            String plainString = cVar.f209443b.toPlainString();
                            Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
                            jo3.b bVarA = hx7.a.A(cVar.f209444c);
                            ArrayList arrayList3 = arrayList2;
                            float f = cVar.d;
                            String str4 = cVar.e;
                            pvg.d dVar3 = dVar;
                            ej0.b bVar = cVar.f;
                            String plainString2 = null;
                            ko3.b bVarM = bVar != null ? cp5.c.M(bVar) : null;
                            ej0.b bVar2 = cVar.f209445g;
                            ko3.b bVarM2 = bVar2 != null ? cp5.c.M(bVar2) : null;
                            ArrayList arrayList4 = arrayList;
                            String str5 = cVar.f209446h;
                            BigDecimal bigDecimal = cVar.i;
                            if (bigDecimal != null) {
                                plainString2 = bigDecimal.toPlainString();
                            }
                            arrayList3.add(new pvg.a(f, aVar, str2, portfolioId, str3, plainString, str4, str5, plainString2, bVarA, bVarM, bVarM2, z));
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            dVar = dVar3;
                            domain2 = domain2;
                        }
                        this.f300374b.f300383c.d(zhm.u.c(dVar), arrayList, arrayList2);
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i5 = 2;
        Function1 function12 = new Function1(this) { // from class: wvg.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f300366b;

            {
                this.f300366b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                mwg.c cVar;
                switch (i5) {
                    case 0:
                        a params = (a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<uvg.b> allocations = this.f300366b.f300381a.getAllocations(params.f300320a, kotlin.jvm.internal.s.Q(params.f300321b), params.f300322c, params.d.f306286a, params.e);
                        wsg.k kVar = new wsg.k(new wpj.b(params, 22), 13);
                        allocations.getClass();
                        ufm.i iVar = new ufm.i(allocations, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        a params2 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (mwg.a) this.f300366b.f300382b.get(ta6.a.c(params2));
                    default:
                        a params3 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        nvg.a aVar = this.f300366b.f300383c;
                        iwg.a aVar2 = params3.f300321b;
                        boolean z = params3.f300322c;
                        String str = params3.d.f306286a;
                        String str2 = params3.e;
                        if (str2 == null) {
                            str2 = "LOCAL_PORTFOLIO_ID";
                        }
                        List listE = aVar.e(aVar2, z, str, str2);
                        Intrinsics.checkNotNullParameter(listE, "<this>");
                        pvg.c cVar2 = (pvg.c) zhm.d0.d0(listE);
                        if (cVar2 == null) {
                            return null;
                        }
                        iwg.a aVar3 = cVar2.f240088a;
                        boolean z3 = cVar2.f240089b;
                        dj0.d dVarV = hx7.a.v(((pvg.c) zhm.d0.b0(listE)).f240090c);
                        List<pvg.c> list = listE;
                        ArrayList arrayList = new ArrayList();
                        for (pvg.c cVar3 : list) {
                            String str3 = cVar3.d;
                            jo3.b bVar = cVar3.e;
                            Float f = cVar3.f;
                            mwg.d dVar = (str3 == null || bVar == null || f == null) ? null : new mwg.d(str3, hx7.a.v(bVar), f.floatValue());
                            if (dVar != null) {
                                arrayList.add(dVar);
                            }
                        }
                        List listU = zhm.d0.U(arrayList);
                        ArrayList arrayList2 = new ArrayList();
                        for (pvg.c cVar4 : list) {
                            String str4 = cVar4.f240091g;
                            String str5 = cVar4.f240092h;
                            jo3.b bVar2 = cVar4.i;
                            Float f4 = cVar4.f240093j;
                            if (str4 == null || str5 == null || bVar2 == null || f4 == null) {
                                cVar = null;
                            } else {
                                float fFloatValue = f4.floatValue();
                                BigDecimal bigDecimal = new BigDecimal(str5);
                                dj0.d dVarV2 = hx7.a.v(bVar2);
                                String str6 = cVar4.k;
                                ko3.b bVar3 = cVar4.f240094l;
                                ej0.b bVarI = bVar3 != null ? cp5.c.I(bVar3) : null;
                                ko3.b bVar4 = cVar4.f240095m;
                                ej0.b bVarI2 = bVar4 != null ? cp5.c.I(bVar4) : null;
                                String str7 = cVar4.f240096n;
                                String str8 = cVar4.o;
                                cVar = new mwg.c(str4, bigDecimal, dVarV2, fFloatValue, str6, bVarI, bVarI2, str7, str8 != null ? new BigDecimal(str8) : null);
                            }
                            if (cVar != null) {
                                arrayList2.add(cVar);
                            }
                        }
                        return new mwg.a(aVar3, z3, dVarV, listU, zhm.d0.U(arrayList2));
                }
            }
        };
        final int i6 = 1;
        this.d = new w4l.f(bVarK0, function1, function2, function12, new Function2(this) { // from class: wvg.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f300374b;

            {
                this.f300374b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        a params = (a) obj2;
                        mwg.a domain = (mwg.a) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f300374b.f300382b.f(ta6.a.c(params), domain);
                        break;
                    default:
                        a params2 = (a) obj2;
                        mwg.a domain2 = (mwg.a) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        xi0.b currency = params2.d;
                        String str = params2.e;
                        if (str == null) {
                            str = "LOCAL_PORTFOLIO_ID";
                        }
                        String portfolioId = str;
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        pvg.d dVar = new pvg.d(domain2.f209434a, domain2.f209435b, currency.f306286a, portfolioId, hx7.a.A(domain2.f209436c));
                        List<mwg.d> list = domain2.d;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (mwg.d dVar2 : list) {
                            arrayList.add(new pvg.b(dVar2.f209449c, domain2.f209434a, currency.f306286a, portfolioId, dVar2.f209447a, hx7.a.A(dVar2.f209448b), domain2.f209435b));
                        }
                        List<mwg.c> list2 = domain2.e;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (mwg.c cVar : list2) {
                            iwg.a aVar = domain2.f209434a;
                            boolean z = domain2.f209435b;
                            String str2 = currency.f306286a;
                            String str3 = cVar.f209442a;
                            String plainString = cVar.f209443b.toPlainString();
                            Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
                            jo3.b bVarA = hx7.a.A(cVar.f209444c);
                            ArrayList arrayList3 = arrayList2;
                            float f = cVar.d;
                            String str4 = cVar.e;
                            pvg.d dVar3 = dVar;
                            ej0.b bVar = cVar.f;
                            String plainString2 = null;
                            ko3.b bVarM = bVar != null ? cp5.c.M(bVar) : null;
                            ej0.b bVar2 = cVar.f209445g;
                            ko3.b bVarM2 = bVar2 != null ? cp5.c.M(bVar2) : null;
                            ArrayList arrayList4 = arrayList;
                            String str5 = cVar.f209446h;
                            BigDecimal bigDecimal = cVar.i;
                            if (bigDecimal != null) {
                                plainString2 = bigDecimal.toPlainString();
                            }
                            arrayList3.add(new pvg.a(f, aVar, str2, portfolioId, str3, plainString, str4, str5, plainString2, bVarA, bVarM, bVarM2, z));
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            dVar = dVar3;
                            domain2 = domain2;
                        }
                        this.f300374b.f300383c.d(zhm.u.c(dVar), arrayList, arrayList2);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
