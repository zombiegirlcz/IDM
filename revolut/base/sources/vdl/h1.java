package vdl;

import com.google.gson.reflect.TypeToken;
import com.revolut.shared.feature.wealth.domain.impl.data.network.config.TradingConfigService;
import com.revolut.shared.feature.wealth.models.config.Links;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes12.dex */
public final class h1 {

    @NotNull
    public static final g1 Companion = new g1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.d f287976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f287977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TradingConfigService f287978c;
    public final b80.c d;
    public final w4l.f e;

    public h1(ne0.d memoryCache, ue0.c storage, TradingConfigService tradingConfigService, b80.c networkStateRepository, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(tradingConfigService, "tradingConfigService");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f287976a = memoryCache;
        this.f287977b = storage;
        this.f287978c = tradingConfigService;
        this.d = networkStateRepository;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: vdl.f1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h1 f287969b;

            {
                this.f287969b = this;
            }

            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                h1 h1Var = this.f287969b;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<List<bdl.c>> tradingConfigs = h1Var.f287978c.getTradingConfigs();
                        s sVar = new s(12, new vch.h0(25));
                        tradingConfigs.getClass();
                        ufm.i iVar = new ufm.i(tradingConfigs, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List config = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        h1Var.f287976a.f("STOCK_CONFIG", config);
                        break;
                    default:
                        List config2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        ue0.c cVar = h1Var.f287977b;
                        Object obj4 = bdl.a.f14620a;
                        Intrinsics.checkNotNullParameter(config2, "<this>");
                        List<hel.a> list = config2;
                        int i3 = 10;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (hel.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            ArrayList arrayList2 = aVar.f151716a;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, i3));
                            Iterator it9 = arrayList2.iterator();
                            while (it9.hasNext()) {
                                arrayList3.add(((wi0.b) it9.next()).f297794a);
                            }
                            long j2 = aVar.f151718c;
                            String str = aVar.f;
                            String strG = le.u1.g(aVar.d, bdl.a.f14620a);
                            Links links = aVar.e;
                            String str2 = links.f105089a;
                            String str3 = links.f105091c;
                            String str4 = links.d;
                            String str5 = links.e;
                            String str6 = links.f105092g;
                            String str7 = links.f105093h;
                            String str8 = links.i;
                            arrayList.add(new wdl.b(arrayList3, aVar.f151717b, j2, strG, new wdl.a(str2, str3, str4, links.f105090b, str5, str6, links.f, str7, str8, links.f105094j, links.k, links.f105095l, links.f105096m, links.f105097n, links.o, links.f105098p, links.f105099q, links.f105100r, links.f105101s, links.f105102t, links.u, links.v, links.f105103w, links.f105104x, links.f105105y, links.z, links.A, links.B, links.C), str, aVar.f151719g));
                            i3 = 10;
                        }
                        cVar.G(arrayList, "STOCK_CONFIG", kii.e.o(wdl.b.class, KTypeProjection.INSTANCE, List.class));
                        com.google.android.gms.internal.mlkit_vision_face.a.B(Long.TYPE, cVar, "STOCK_CONFIG_LAST_UPDATE_TIMESTAMP_KEY", Long.valueOf(System.currentTimeMillis()));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i2 = 1;
        e1 e1Var = new e1(this, 1);
        Function2 function22 = new Function2(this) { // from class: vdl.f1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h1 f287969b;

            {
                this.f287969b = this;
            }

            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i2;
                h1 h1Var = this.f287969b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<List<bdl.c>> tradingConfigs = h1Var.f287978c.getTradingConfigs();
                        s sVar = new s(12, new vch.h0(25));
                        tradingConfigs.getClass();
                        ufm.i iVar = new ufm.i(tradingConfigs, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List config = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        h1Var.f287976a.f("STOCK_CONFIG", config);
                        break;
                    default:
                        List config2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        ue0.c cVar = h1Var.f287977b;
                        Object obj4 = bdl.a.f14620a;
                        Intrinsics.checkNotNullParameter(config2, "<this>");
                        List<hel.a> list = config2;
                        int i3 = 10;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (hel.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            ArrayList arrayList2 = aVar.f151716a;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, i3));
                            Iterator it9 = arrayList2.iterator();
                            while (it9.hasNext()) {
                                arrayList3.add(((wi0.b) it9.next()).f297794a);
                            }
                            long j2 = aVar.f151718c;
                            String str = aVar.f;
                            String strG = le.u1.g(aVar.d, bdl.a.f14620a);
                            Links links = aVar.e;
                            String str2 = links.f105089a;
                            String str3 = links.f105091c;
                            String str4 = links.d;
                            String str5 = links.e;
                            String str6 = links.f105092g;
                            String str7 = links.f105093h;
                            String str8 = links.i;
                            arrayList.add(new wdl.b(arrayList3, aVar.f151717b, j2, strG, new wdl.a(str2, str3, str4, links.f105090b, str5, str6, links.f, str7, str8, links.f105094j, links.k, links.f105095l, links.f105096m, links.f105097n, links.o, links.f105098p, links.f105099q, links.f105100r, links.f105101s, links.f105102t, links.u, links.v, links.f105103w, links.f105104x, links.f105105y, links.z, links.A, links.B, links.C), str, aVar.f151719g));
                            i3 = 10;
                        }
                        cVar.G(arrayList, "STOCK_CONFIG", kii.e.o(wdl.b.class, KTypeProjection.INSTANCE, List.class));
                        com.google.android.gms.internal.mlkit_vision_face.a.B(Long.TYPE, cVar, "STOCK_CONFIG_LAST_UPDATE_TIMESTAMP_KEY", Long.valueOf(System.currentTimeMillis()));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i3 = 2;
        this.e = new w4l.f(function2, e1Var, function22, new e1(this, 2), new Function2(this) { // from class: vdl.f1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h1 f287969b;

            {
                this.f287969b = this;
            }

            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i3;
                h1 h1Var = this.f287969b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<List<bdl.c>> tradingConfigs = h1Var.f287978c.getTradingConfigs();
                        s sVar = new s(12, new vch.h0(25));
                        tradingConfigs.getClass();
                        ufm.i iVar = new ufm.i(tradingConfigs, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List config = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config, "config");
                        h1Var.f287976a.f("STOCK_CONFIG", config);
                        break;
                    default:
                        List config2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        ue0.c cVar = h1Var.f287977b;
                        Object obj4 = bdl.a.f14620a;
                        Intrinsics.checkNotNullParameter(config2, "<this>");
                        List<hel.a> list = config2;
                        int i32 = 10;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (hel.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            ArrayList arrayList2 = aVar.f151716a;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, i32));
                            Iterator it9 = arrayList2.iterator();
                            while (it9.hasNext()) {
                                arrayList3.add(((wi0.b) it9.next()).f297794a);
                            }
                            long j2 = aVar.f151718c;
                            String str = aVar.f;
                            String strG = le.u1.g(aVar.d, bdl.a.f14620a);
                            Links links = aVar.e;
                            String str2 = links.f105089a;
                            String str3 = links.f105091c;
                            String str4 = links.d;
                            String str5 = links.e;
                            String str6 = links.f105092g;
                            String str7 = links.f105093h;
                            String str8 = links.i;
                            arrayList.add(new wdl.b(arrayList3, aVar.f151717b, j2, strG, new wdl.a(str2, str3, str4, links.f105090b, str5, str6, links.f, str7, str8, links.f105094j, links.k, links.f105095l, links.f105096m, links.f105097n, links.o, links.f105098p, links.f105099q, links.f105100r, links.f105101s, links.f105102t, links.u, links.v, links.f105103w, links.f105104x, links.f105105y, links.z, links.A, links.B, links.C), str, aVar.f151719g));
                            i32 = 10;
                        }
                        cVar.G(arrayList, "STOCK_CONFIG", kii.e.o(wdl.b.class, KTypeProjection.INSTANCE, List.class));
                        com.google.android.gms.internal.mlkit_vision_face.a.B(Long.TYPE, cVar, "STOCK_CONFIG_LAST_UPDATE_TIMESTAMP_KEY", Long.valueOf(System.currentTimeMillis()));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
    public final ArrayList a() {
        Type type = new TypeToken<List<? extends wdl.b>>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.repositories.TradingConfigRepositoryImpl$getStockConfigFromStorage$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        List list = (List) this.f287977b.T2("STOCK_CONFIG", type);
        if (list == null) {
            return null;
        }
        List<wdl.b> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (wdl.b bVar : list2) {
            Object obj2 = bdl.a.f14620a;
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            List forbiddenCountries = bVar.getForbiddenCountries();
            ArrayList arrayList2 = new ArrayList(zhm.w.t(forbiddenCountries, 10));
            Iterator it8 = forbiddenCountries.iterator();
            while (it8.hasNext()) {
                kii.e.B(wi0.b.Companion, (String) it8.next(), arrayList2);
            }
            long limitGapPpm = bVar.getLimitGapPpm();
            hel.b bVar2 = (hel.b) le.u1.u(bVar.getContext(), bdl.a.f14620a);
            String onboardingStoryId = bVar.getOnboardingStoryId();
            arrayList.add(new hel.a(arrayList2, bVar.getRegisteredIdentityId(), limitGapPpm, bVar2, new Links(bVar.getLinks().getUsPerson(), bVar.getLinks().getIcons(), bVar.getLinks().getProfessional(), bVar.getLinks().getRiskWarning(), bVar.getLinks().getOnboardingRiskWarning(), bVar.getLinks().getTinDescription(), bVar.getLinks().getTermsOfBusiness(), bVar.getLinks().getOrderHandling(), bVar.getLinks().getAgreementPrefix(), bVar.getLinks().getPrivacyPolicy(), bVar.getLinks().getCustomerAccountAgreement(), bVar.getLinks().getCostsInformation(), bVar.getLinks().getStocksFaqs(), bVar.getLinks().getMifid(), bVar.getLinks().getMorningstarResearchDisclosure(), bVar.getLinks().getAdvisoryAgreement(), bVar.getLinks().getCfdTradingTerms(), bVar.getLinks().getRoboTermsAndConditions(), bVar.getLinks().getExAnteCostsReport(), bVar.getLinks().getIsaTransferInSampleDocument(), bVar.getLinks().getJisaTransferInSampleDocument(), bVar.getLinks().getResearchDisclosureFaq(), bVar.getLinks().getFreeStocksTerms(), bVar.getLinks().getFreeStocksDisclosure(), bVar.getLinks().getTradingFees(), bVar.getLinks().getAssetDetailsTradeLimitsSheet(), bVar.getLinks().getMarginTradingTerms(), bVar.getLinks().getStocksTransferOutDisclaimer(), bVar.getLinks().getTransferDocumentUrlTemplate()), onboardingStoryId, bVar.getInvestmentPocketsEnabled()));
        }
        return arrayList;
    }

    public final boolean b() {
        Long l2 = (Long) this.f287977b.T2("STOCK_CONFIG_LAST_UPDATE_TIMESTAMP_KEY", Long.TYPE);
        return l2 != null && l2.longValue() + ((long) DateTimeConstants.MILLIS_PER_HOUR) > System.currentTimeMillis();
    }
}
