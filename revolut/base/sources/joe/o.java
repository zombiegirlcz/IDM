package joe;

import com.revolut.feature.tax_residency.impl.services.TaxResidencyService;
import com.revolut.feature.tax_residency.impl.v2.models.TaxResidencyFlowContext;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import ioe.b0;
import ioe.f0;
import ioe.v;
import ioe.y;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements b {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxResidencyService f176939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f176940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f176941c;
    public final w4l.f d;
    public final w4l.f e;
    public final w4l.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f176942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f176943h;
    public final x4l.c i;

    public o(TaxResidencyService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f176939a = service;
        this.f176940b = memoryCache;
        this.f176941c = storage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: joe.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f176932b;

            {
                this.f176932b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                int i3 = 1;
                o oVar = this.f176932b;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<Map<String, b0>> rules = oVar.f176939a.getRules();
                        k kVar = k.f;
                        e eVar = new e(0);
                        rules.getClass();
                        ufm.i iVar = new ufm.i(rules, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        g params = (g) obj2;
                        List taxResidencies = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
                        oVar.f176940b.f("cache_tax_rationales:" + params.f176936a.f297794a + ":true", taxResidencies);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<ioe.i> skippableTinCountries = oVar.f176939a.getSkippableTinCountries();
                        l lVar = l.f;
                        e eVar2 = new e(2);
                        skippableTinCountries.getClass();
                        ufm.i iVar2 = new ufm.i(skippableTinCountries, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        List countries = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(countries, "countries");
                        oVar.f176940b.f("cache_skippable_tin_countries", countries);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<v> taxResidencies2 = oVar.f176939a.getTaxResidencies(Boolean.TRUE);
                        n nVar = n.f;
                        e eVar3 = new e(i3);
                        taxResidencies2.getClass();
                        ufm.i iVar3 = new ufm.i(taxResidencies2, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List taxResidenciesWithSuggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidenciesWithSuggestions, "taxResidenciesWithSuggestions");
                        oVar.f176940b.f("cache_tax_residencies_with_suggestions", taxResidenciesWithSuggestions);
                        return Unit.f186387a;
                    case 6:
                        TaxResidencyFlowContext flowContext = (TaxResidencyFlowContext) obj2;
                        List declaredTaxResidencies = (List) obj3;
                        Intrinsics.checkNotNullParameter(flowContext, "flowContext");
                        Intrinsics.checkNotNullParameter(declaredTaxResidencies, "declaredTaxResidencies");
                        oVar.f176940b.f(o.a(flowContext), declaredTaxResidencies);
                        return Unit.f186387a;
                    case 7:
                        Map rules2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rules2, "rules");
                        oVar.f176940b.f("cache_tax_residency_rules", rules2);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<v> taxResidencies3 = oVar.f176939a.getTaxResidencies(null);
                        m mVar = m.f;
                        h35.c cVar = new h35.c(29);
                        taxResidencies3.getClass();
                        ufm.i iVar4 = new ufm.i(taxResidencies3, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 9:
                        List taxResidencies4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidencies4, "taxResidencies");
                        oVar.f176940b.f("cache_tax_residencies", taxResidencies4);
                        return Unit.f186387a;
                    case 10:
                        List taxResidencies5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidencies5, "taxResidencies");
                        ue0.c cVar2 = oVar.f176941c;
                        List<zme.f> list = taxResidencies5;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (zme.f fVar : list) {
                            Object obj4 = a.f176928a;
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            arrayList.add(new ioe.w(fVar.f323482a.f297794a, fVar.f323483b, fVar.f323484c, Boolean.valueOf(fVar.d)));
                        }
                        cVar2.G(arrayList, "storage_tax_residencies", kii.e.o(ioe.w.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        g params2 = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<List<y>> certificationRationales = oVar.f176939a.getCertificationRationales(params2.f176936a.f297794a, true);
                        jeg.h hVar = new jeg.h(new jn2.a(21), 28);
                        certificationRationales.getClass();
                        ufm.i iVar5 = new ufm.i(certificationRationales, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                }
            }
        };
        final int i2 = 3;
        Function1 function1 = new Function1(this) { // from class: joe.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f176934b;

            {
                this.f176934b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i3 = i2;
                o oVar = this.f176934b;
                switch (i3) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) oVar.f176940b.get("cache_skippable_tin_countries");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) oVar.f176940b.get("cache_tax_residencies_with_suggestions");
                    case 2:
                        TaxResidencyFlowContext flowContext = (TaxResidencyFlowContext) obj2;
                        Intrinsics.checkNotNullParameter(flowContext, "flowContext");
                        return (List) oVar.f176940b.get(o.a(flowContext));
                    case 3:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (Map) oVar.f176940b.get("cache_tax_residency_rules");
                    case 4:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) oVar.f176940b.get("cache_tax_residencies");
                    case 5:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ue0.c cVar = oVar.f176941c;
                        Type type = p.f176944a;
                        Intrinsics.checkNotNullExpressionValue(type, "<get-TAX_RESIDENCIES_TYPE>(...)");
                        List list = (List) cVar.T2("storage_tax_residencies", type);
                        if (list == null) {
                            return null;
                        }
                        List<ioe.w> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (ioe.w wVar : list2) {
                            Object obj3 = a.f176928a;
                            Intrinsics.checkNotNullParameter(wVar, "<this>");
                            wi0.a aVar = wi0.b.Companion;
                            String countryCode = wVar.getCountryCode();
                            aVar.getClass();
                            wi0.b bVarA = wi0.a.a(countryCode);
                            String documentNumber = wVar.getDocumentNumber();
                            String documentType = wVar.getDocumentType();
                            Boolean deletable = wVar.getDeletable();
                            arrayList.add(new zme.f(bVarA, documentNumber, documentType, deletable != null ? deletable.booleanValue() : true, null, null, 48));
                        }
                        return arrayList;
                    default:
                        g params = (g) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) oVar.f176940b.get("cache_tax_rationales:" + params.f176936a.f297794a + ":true");
                }
            }
        };
        final int i3 = 7;
        this.d = new w4l.f(function2, function1, new Function2(this) { // from class: joe.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f176932b;

            {
                this.f176932b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i3;
                int i32 = 1;
                o oVar = this.f176932b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<Map<String, b0>> rules = oVar.f176939a.getRules();
                        k kVar = k.f;
                        e eVar = new e(0);
                        rules.getClass();
                        ufm.i iVar = new ufm.i(rules, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        g params = (g) obj2;
                        List taxResidencies = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
                        oVar.f176940b.f("cache_tax_rationales:" + params.f176936a.f297794a + ":true", taxResidencies);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<ioe.i> skippableTinCountries = oVar.f176939a.getSkippableTinCountries();
                        l lVar = l.f;
                        e eVar2 = new e(2);
                        skippableTinCountries.getClass();
                        ufm.i iVar2 = new ufm.i(skippableTinCountries, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        List countries = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(countries, "countries");
                        oVar.f176940b.f("cache_skippable_tin_countries", countries);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<v> taxResidencies2 = oVar.f176939a.getTaxResidencies(Boolean.TRUE);
                        n nVar = n.f;
                        e eVar3 = new e(i32);
                        taxResidencies2.getClass();
                        ufm.i iVar3 = new ufm.i(taxResidencies2, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List taxResidenciesWithSuggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidenciesWithSuggestions, "taxResidenciesWithSuggestions");
                        oVar.f176940b.f("cache_tax_residencies_with_suggestions", taxResidenciesWithSuggestions);
                        return Unit.f186387a;
                    case 6:
                        TaxResidencyFlowContext flowContext = (TaxResidencyFlowContext) obj2;
                        List declaredTaxResidencies = (List) obj3;
                        Intrinsics.checkNotNullParameter(flowContext, "flowContext");
                        Intrinsics.checkNotNullParameter(declaredTaxResidencies, "declaredTaxResidencies");
                        oVar.f176940b.f(o.a(flowContext), declaredTaxResidencies);
                        return Unit.f186387a;
                    case 7:
                        Map rules2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rules2, "rules");
                        oVar.f176940b.f("cache_tax_residency_rules", rules2);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<v> taxResidencies3 = oVar.f176939a.getTaxResidencies(null);
                        m mVar = m.f;
                        h35.c cVar = new h35.c(29);
                        taxResidencies3.getClass();
                        ufm.i iVar4 = new ufm.i(taxResidencies3, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 9:
                        List taxResidencies4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidencies4, "taxResidencies");
                        oVar.f176940b.f("cache_tax_residencies", taxResidencies4);
                        return Unit.f186387a;
                    case 10:
                        List taxResidencies5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidencies5, "taxResidencies");
                        ue0.c cVar2 = oVar.f176941c;
                        List<zme.f> list = taxResidencies5;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (zme.f fVar : list) {
                            Object obj4 = a.f176928a;
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            arrayList.add(new ioe.w(fVar.f323482a.f297794a, fVar.f323483b, fVar.f323484c, Boolean.valueOf(fVar.d)));
                        }
                        cVar2.G(arrayList, "storage_tax_residencies", kii.e.o(ioe.w.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        g params2 = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<List<y>> certificationRationales = oVar.f176939a.getCertificationRationales(params2.f176936a.f297794a, true);
                        jeg.h hVar = new jeg.h(new jn2.a(21), 28);
                        certificationRationales.getClass();
                        ufm.i iVar5 = new ufm.i(certificationRationales, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i5 = 8;
        Function2 function22 = new Function2(this) { // from class: joe.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f176932b;

            {
                this.f176932b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i5;
                int i32 = 1;
                o oVar = this.f176932b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<Map<String, b0>> rules = oVar.f176939a.getRules();
                        k kVar = k.f;
                        e eVar = new e(0);
                        rules.getClass();
                        ufm.i iVar = new ufm.i(rules, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        g params = (g) obj2;
                        List taxResidencies = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
                        oVar.f176940b.f("cache_tax_rationales:" + params.f176936a.f297794a + ":true", taxResidencies);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<ioe.i> skippableTinCountries = oVar.f176939a.getSkippableTinCountries();
                        l lVar = l.f;
                        e eVar2 = new e(2);
                        skippableTinCountries.getClass();
                        ufm.i iVar2 = new ufm.i(skippableTinCountries, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        List countries = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(countries, "countries");
                        oVar.f176940b.f("cache_skippable_tin_countries", countries);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<v> taxResidencies2 = oVar.f176939a.getTaxResidencies(Boolean.TRUE);
                        n nVar = n.f;
                        e eVar3 = new e(i32);
                        taxResidencies2.getClass();
                        ufm.i iVar3 = new ufm.i(taxResidencies2, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List taxResidenciesWithSuggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidenciesWithSuggestions, "taxResidenciesWithSuggestions");
                        oVar.f176940b.f("cache_tax_residencies_with_suggestions", taxResidenciesWithSuggestions);
                        return Unit.f186387a;
                    case 6:
                        TaxResidencyFlowContext flowContext = (TaxResidencyFlowContext) obj2;
                        List declaredTaxResidencies = (List) obj3;
                        Intrinsics.checkNotNullParameter(flowContext, "flowContext");
                        Intrinsics.checkNotNullParameter(declaredTaxResidencies, "declaredTaxResidencies");
                        oVar.f176940b.f(o.a(flowContext), declaredTaxResidencies);
                        return Unit.f186387a;
                    case 7:
                        Map rules2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rules2, "rules");
                        oVar.f176940b.f("cache_tax_residency_rules", rules2);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<v> taxResidencies3 = oVar.f176939a.getTaxResidencies(null);
                        m mVar = m.f;
                        h35.c cVar = new h35.c(29);
                        taxResidencies3.getClass();
                        ufm.i iVar4 = new ufm.i(taxResidencies3, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 9:
                        List taxResidencies4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidencies4, "taxResidencies");
                        oVar.f176940b.f("cache_tax_residencies", taxResidencies4);
                        return Unit.f186387a;
                    case 10:
                        List taxResidencies5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidencies5, "taxResidencies");
                        ue0.c cVar2 = oVar.f176941c;
                        List<zme.f> list = taxResidencies5;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (zme.f fVar : list) {
                            Object obj4 = a.f176928a;
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            arrayList.add(new ioe.w(fVar.f323482a.f297794a, fVar.f323483b, fVar.f323484c, Boolean.valueOf(fVar.d)));
                        }
                        cVar2.G(arrayList, "storage_tax_residencies", kii.e.o(ioe.w.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        g params2 = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<List<y>> certificationRationales = oVar.f176939a.getCertificationRationales(params2.f176936a.f297794a, true);
                        jeg.h hVar = new jeg.h(new jn2.a(21), 28);
                        certificationRationales.getClass();
                        ufm.i iVar5 = new ufm.i(certificationRationales, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                }
            }
        };
        final int i6 = 4;
        Function1 function12 = new Function1(this) { // from class: joe.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f176934b;

            {
                this.f176934b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i32 = i6;
                o oVar = this.f176934b;
                switch (i32) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) oVar.f176940b.get("cache_skippable_tin_countries");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) oVar.f176940b.get("cache_tax_residencies_with_suggestions");
                    case 2:
                        TaxResidencyFlowContext flowContext = (TaxResidencyFlowContext) obj2;
                        Intrinsics.checkNotNullParameter(flowContext, "flowContext");
                        return (List) oVar.f176940b.get(o.a(flowContext));
                    case 3:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (Map) oVar.f176940b.get("cache_tax_residency_rules");
                    case 4:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) oVar.f176940b.get("cache_tax_residencies");
                    case 5:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ue0.c cVar = oVar.f176941c;
                        Type type = p.f176944a;
                        Intrinsics.checkNotNullExpressionValue(type, "<get-TAX_RESIDENCIES_TYPE>(...)");
                        List list = (List) cVar.T2("storage_tax_residencies", type);
                        if (list == null) {
                            return null;
                        }
                        List<ioe.w> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (ioe.w wVar : list2) {
                            Object obj3 = a.f176928a;
                            Intrinsics.checkNotNullParameter(wVar, "<this>");
                            wi0.a aVar = wi0.b.Companion;
                            String countryCode = wVar.getCountryCode();
                            aVar.getClass();
                            wi0.b bVarA = wi0.a.a(countryCode);
                            String documentNumber = wVar.getDocumentNumber();
                            String documentType = wVar.getDocumentType();
                            Boolean deletable = wVar.getDeletable();
                            arrayList.add(new zme.f(bVarA, documentNumber, documentType, deletable != null ? deletable.booleanValue() : true, null, null, 48));
                        }
                        return arrayList;
                    default:
                        g params = (g) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) oVar.f176940b.get("cache_tax_rationales:" + params.f176936a.f297794a + ":true");
                }
            }
        };
        final int i21 = 9;
        Function2 function23 = new Function2(this) { // from class: joe.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f176932b;

            {
                this.f176932b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i21;
                int i32 = 1;
                o oVar = this.f176932b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<Map<String, b0>> rules = oVar.f176939a.getRules();
                        k kVar = k.f;
                        e eVar = new e(0);
                        rules.getClass();
                        ufm.i iVar = new ufm.i(rules, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        g params = (g) obj2;
                        List taxResidencies = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
                        oVar.f176940b.f("cache_tax_rationales:" + params.f176936a.f297794a + ":true", taxResidencies);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<ioe.i> skippableTinCountries = oVar.f176939a.getSkippableTinCountries();
                        l lVar = l.f;
                        e eVar2 = new e(2);
                        skippableTinCountries.getClass();
                        ufm.i iVar2 = new ufm.i(skippableTinCountries, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        List countries = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(countries, "countries");
                        oVar.f176940b.f("cache_skippable_tin_countries", countries);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<v> taxResidencies2 = oVar.f176939a.getTaxResidencies(Boolean.TRUE);
                        n nVar = n.f;
                        e eVar3 = new e(i32);
                        taxResidencies2.getClass();
                        ufm.i iVar3 = new ufm.i(taxResidencies2, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List taxResidenciesWithSuggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidenciesWithSuggestions, "taxResidenciesWithSuggestions");
                        oVar.f176940b.f("cache_tax_residencies_with_suggestions", taxResidenciesWithSuggestions);
                        return Unit.f186387a;
                    case 6:
                        TaxResidencyFlowContext flowContext = (TaxResidencyFlowContext) obj2;
                        List declaredTaxResidencies = (List) obj3;
                        Intrinsics.checkNotNullParameter(flowContext, "flowContext");
                        Intrinsics.checkNotNullParameter(declaredTaxResidencies, "declaredTaxResidencies");
                        oVar.f176940b.f(o.a(flowContext), declaredTaxResidencies);
                        return Unit.f186387a;
                    case 7:
                        Map rules2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rules2, "rules");
                        oVar.f176940b.f("cache_tax_residency_rules", rules2);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<v> taxResidencies3 = oVar.f176939a.getTaxResidencies(null);
                        m mVar = m.f;
                        h35.c cVar = new h35.c(29);
                        taxResidencies3.getClass();
                        ufm.i iVar4 = new ufm.i(taxResidencies3, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 9:
                        List taxResidencies4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidencies4, "taxResidencies");
                        oVar.f176940b.f("cache_tax_residencies", taxResidencies4);
                        return Unit.f186387a;
                    case 10:
                        List taxResidencies5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidencies5, "taxResidencies");
                        ue0.c cVar2 = oVar.f176941c;
                        List<zme.f> list = taxResidencies5;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (zme.f fVar : list) {
                            Object obj4 = a.f176928a;
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            arrayList.add(new ioe.w(fVar.f323482a.f297794a, fVar.f323483b, fVar.f323484c, Boolean.valueOf(fVar.d)));
                        }
                        cVar2.G(arrayList, "storage_tax_residencies", kii.e.o(ioe.w.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        g params2 = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<List<y>> certificationRationales = oVar.f176939a.getCertificationRationales(params2.f176936a.f297794a, true);
                        jeg.h hVar = new jeg.h(new jn2.a(21), 28);
                        certificationRationales.getClass();
                        ufm.i iVar5 = new ufm.i(certificationRationales, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                }
            }
        };
        final int i22 = 5;
        Function1 function13 = new Function1(this) { // from class: joe.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f176934b;

            {
                this.f176934b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i32 = i22;
                o oVar = this.f176934b;
                switch (i32) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) oVar.f176940b.get("cache_skippable_tin_countries");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) oVar.f176940b.get("cache_tax_residencies_with_suggestions");
                    case 2:
                        TaxResidencyFlowContext flowContext = (TaxResidencyFlowContext) obj2;
                        Intrinsics.checkNotNullParameter(flowContext, "flowContext");
                        return (List) oVar.f176940b.get(o.a(flowContext));
                    case 3:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (Map) oVar.f176940b.get("cache_tax_residency_rules");
                    case 4:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) oVar.f176940b.get("cache_tax_residencies");
                    case 5:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ue0.c cVar = oVar.f176941c;
                        Type type = p.f176944a;
                        Intrinsics.checkNotNullExpressionValue(type, "<get-TAX_RESIDENCIES_TYPE>(...)");
                        List list = (List) cVar.T2("storage_tax_residencies", type);
                        if (list == null) {
                            return null;
                        }
                        List<ioe.w> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (ioe.w wVar : list2) {
                            Object obj3 = a.f176928a;
                            Intrinsics.checkNotNullParameter(wVar, "<this>");
                            wi0.a aVar = wi0.b.Companion;
                            String countryCode = wVar.getCountryCode();
                            aVar.getClass();
                            wi0.b bVarA = wi0.a.a(countryCode);
                            String documentNumber = wVar.getDocumentNumber();
                            String documentType = wVar.getDocumentType();
                            Boolean deletable = wVar.getDeletable();
                            arrayList.add(new zme.f(bVarA, documentNumber, documentType, deletable != null ? deletable.booleanValue() : true, null, null, 48));
                        }
                        return arrayList;
                    default:
                        g params = (g) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) oVar.f176940b.get("cache_tax_rationales:" + params.f176936a.f297794a + ":true");
                }
            }
        };
        final int i32 = 10;
        this.e = new w4l.f(function22, function12, function23, function13, new Function2(this) { // from class: joe.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f176932b;

            {
                this.f176932b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i32;
                int i322 = 1;
                o oVar = this.f176932b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<Map<String, b0>> rules = oVar.f176939a.getRules();
                        k kVar = k.f;
                        e eVar = new e(0);
                        rules.getClass();
                        ufm.i iVar = new ufm.i(rules, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        g params = (g) obj2;
                        List taxResidencies = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
                        oVar.f176940b.f("cache_tax_rationales:" + params.f176936a.f297794a + ":true", taxResidencies);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<ioe.i> skippableTinCountries = oVar.f176939a.getSkippableTinCountries();
                        l lVar = l.f;
                        e eVar2 = new e(2);
                        skippableTinCountries.getClass();
                        ufm.i iVar2 = new ufm.i(skippableTinCountries, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        List countries = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(countries, "countries");
                        oVar.f176940b.f("cache_skippable_tin_countries", countries);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<v> taxResidencies2 = oVar.f176939a.getTaxResidencies(Boolean.TRUE);
                        n nVar = n.f;
                        e eVar3 = new e(i322);
                        taxResidencies2.getClass();
                        ufm.i iVar3 = new ufm.i(taxResidencies2, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List taxResidenciesWithSuggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidenciesWithSuggestions, "taxResidenciesWithSuggestions");
                        oVar.f176940b.f("cache_tax_residencies_with_suggestions", taxResidenciesWithSuggestions);
                        return Unit.f186387a;
                    case 6:
                        TaxResidencyFlowContext flowContext = (TaxResidencyFlowContext) obj2;
                        List declaredTaxResidencies = (List) obj3;
                        Intrinsics.checkNotNullParameter(flowContext, "flowContext");
                        Intrinsics.checkNotNullParameter(declaredTaxResidencies, "declaredTaxResidencies");
                        oVar.f176940b.f(o.a(flowContext), declaredTaxResidencies);
                        return Unit.f186387a;
                    case 7:
                        Map rules2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rules2, "rules");
                        oVar.f176940b.f("cache_tax_residency_rules", rules2);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<v> taxResidencies3 = oVar.f176939a.getTaxResidencies(null);
                        m mVar = m.f;
                        h35.c cVar = new h35.c(29);
                        taxResidencies3.getClass();
                        ufm.i iVar4 = new ufm.i(taxResidencies3, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 9:
                        List taxResidencies4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidencies4, "taxResidencies");
                        oVar.f176940b.f("cache_tax_residencies", taxResidencies4);
                        return Unit.f186387a;
                    case 10:
                        List taxResidencies5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidencies5, "taxResidencies");
                        ue0.c cVar2 = oVar.f176941c;
                        List<zme.f> list = taxResidencies5;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (zme.f fVar : list) {
                            Object obj4 = a.f176928a;
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            arrayList.add(new ioe.w(fVar.f323482a.f297794a, fVar.f323483b, fVar.f323484c, Boolean.valueOf(fVar.d)));
                        }
                        cVar2.G(arrayList, "storage_tax_residencies", kii.e.o(ioe.w.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        g params2 = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<List<y>> certificationRationales = oVar.f176939a.getCertificationRationales(params2.f176936a.f297794a, true);
                        jeg.h hVar = new jeg.h(new jn2.a(21), 28);
                        certificationRationales.getClass();
                        ufm.i iVar5 = new ufm.i(certificationRationales, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i33 = 11;
        Function2 function24 = new Function2(this) { // from class: joe.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f176932b;

            {
                this.f176932b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i33;
                int i322 = 1;
                o oVar = this.f176932b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<Map<String, b0>> rules = oVar.f176939a.getRules();
                        k kVar = k.f;
                        e eVar = new e(0);
                        rules.getClass();
                        ufm.i iVar = new ufm.i(rules, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        g params = (g) obj2;
                        List taxResidencies = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
                        oVar.f176940b.f("cache_tax_rationales:" + params.f176936a.f297794a + ":true", taxResidencies);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<ioe.i> skippableTinCountries = oVar.f176939a.getSkippableTinCountries();
                        l lVar = l.f;
                        e eVar2 = new e(2);
                        skippableTinCountries.getClass();
                        ufm.i iVar2 = new ufm.i(skippableTinCountries, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        List countries = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(countries, "countries");
                        oVar.f176940b.f("cache_skippable_tin_countries", countries);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<v> taxResidencies2 = oVar.f176939a.getTaxResidencies(Boolean.TRUE);
                        n nVar = n.f;
                        e eVar3 = new e(i322);
                        taxResidencies2.getClass();
                        ufm.i iVar3 = new ufm.i(taxResidencies2, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List taxResidenciesWithSuggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidenciesWithSuggestions, "taxResidenciesWithSuggestions");
                        oVar.f176940b.f("cache_tax_residencies_with_suggestions", taxResidenciesWithSuggestions);
                        return Unit.f186387a;
                    case 6:
                        TaxResidencyFlowContext flowContext = (TaxResidencyFlowContext) obj2;
                        List declaredTaxResidencies = (List) obj3;
                        Intrinsics.checkNotNullParameter(flowContext, "flowContext");
                        Intrinsics.checkNotNullParameter(declaredTaxResidencies, "declaredTaxResidencies");
                        oVar.f176940b.f(o.a(flowContext), declaredTaxResidencies);
                        return Unit.f186387a;
                    case 7:
                        Map rules2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rules2, "rules");
                        oVar.f176940b.f("cache_tax_residency_rules", rules2);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<v> taxResidencies3 = oVar.f176939a.getTaxResidencies(null);
                        m mVar = m.f;
                        h35.c cVar = new h35.c(29);
                        taxResidencies3.getClass();
                        ufm.i iVar4 = new ufm.i(taxResidencies3, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 9:
                        List taxResidencies4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidencies4, "taxResidencies");
                        oVar.f176940b.f("cache_tax_residencies", taxResidencies4);
                        return Unit.f186387a;
                    case 10:
                        List taxResidencies5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidencies5, "taxResidencies");
                        ue0.c cVar2 = oVar.f176941c;
                        List<zme.f> list = taxResidencies5;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (zme.f fVar : list) {
                            Object obj4 = a.f176928a;
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            arrayList.add(new ioe.w(fVar.f323482a.f297794a, fVar.f323483b, fVar.f323484c, Boolean.valueOf(fVar.d)));
                        }
                        cVar2.G(arrayList, "storage_tax_residencies", kii.e.o(ioe.w.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        g params2 = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<List<y>> certificationRationales = oVar.f176939a.getCertificationRationales(params2.f176936a.f297794a, true);
                        jeg.h hVar = new jeg.h(new jn2.a(21), 28);
                        certificationRationales.getClass();
                        ufm.i iVar5 = new ufm.i(certificationRationales, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                }
            }
        };
        final int i43 = 6;
        Function1 function14 = new Function1(this) { // from class: joe.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f176934b;

            {
                this.f176934b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i322 = i43;
                o oVar = this.f176934b;
                switch (i322) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) oVar.f176940b.get("cache_skippable_tin_countries");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) oVar.f176940b.get("cache_tax_residencies_with_suggestions");
                    case 2:
                        TaxResidencyFlowContext flowContext = (TaxResidencyFlowContext) obj2;
                        Intrinsics.checkNotNullParameter(flowContext, "flowContext");
                        return (List) oVar.f176940b.get(o.a(flowContext));
                    case 3:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (Map) oVar.f176940b.get("cache_tax_residency_rules");
                    case 4:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) oVar.f176940b.get("cache_tax_residencies");
                    case 5:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ue0.c cVar = oVar.f176941c;
                        Type type = p.f176944a;
                        Intrinsics.checkNotNullExpressionValue(type, "<get-TAX_RESIDENCIES_TYPE>(...)");
                        List list = (List) cVar.T2("storage_tax_residencies", type);
                        if (list == null) {
                            return null;
                        }
                        List<ioe.w> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (ioe.w wVar : list2) {
                            Object obj3 = a.f176928a;
                            Intrinsics.checkNotNullParameter(wVar, "<this>");
                            wi0.a aVar = wi0.b.Companion;
                            String countryCode = wVar.getCountryCode();
                            aVar.getClass();
                            wi0.b bVarA = wi0.a.a(countryCode);
                            String documentNumber = wVar.getDocumentNumber();
                            String documentType = wVar.getDocumentType();
                            Boolean deletable = wVar.getDeletable();
                            arrayList.add(new zme.f(bVarA, documentNumber, documentType, deletable != null ? deletable.booleanValue() : true, null, null, 48));
                        }
                        return arrayList;
                    default:
                        g params = (g) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) oVar.f176940b.get("cache_tax_rationales:" + params.f176936a.f297794a + ":true");
                }
            }
        };
        final int i59 = 1;
        this.f = new w4l.f(function24, function14, new Function2(this) { // from class: joe.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f176932b;

            {
                this.f176932b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i59;
                int i322 = 1;
                o oVar = this.f176932b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<Map<String, b0>> rules = oVar.f176939a.getRules();
                        k kVar = k.f;
                        e eVar = new e(0);
                        rules.getClass();
                        ufm.i iVar = new ufm.i(rules, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        g params = (g) obj2;
                        List taxResidencies = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
                        oVar.f176940b.f("cache_tax_rationales:" + params.f176936a.f297794a + ":true", taxResidencies);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<ioe.i> skippableTinCountries = oVar.f176939a.getSkippableTinCountries();
                        l lVar = l.f;
                        e eVar2 = new e(2);
                        skippableTinCountries.getClass();
                        ufm.i iVar2 = new ufm.i(skippableTinCountries, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        List countries = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(countries, "countries");
                        oVar.f176940b.f("cache_skippable_tin_countries", countries);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<v> taxResidencies2 = oVar.f176939a.getTaxResidencies(Boolean.TRUE);
                        n nVar = n.f;
                        e eVar3 = new e(i322);
                        taxResidencies2.getClass();
                        ufm.i iVar3 = new ufm.i(taxResidencies2, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List taxResidenciesWithSuggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidenciesWithSuggestions, "taxResidenciesWithSuggestions");
                        oVar.f176940b.f("cache_tax_residencies_with_suggestions", taxResidenciesWithSuggestions);
                        return Unit.f186387a;
                    case 6:
                        TaxResidencyFlowContext flowContext = (TaxResidencyFlowContext) obj2;
                        List declaredTaxResidencies = (List) obj3;
                        Intrinsics.checkNotNullParameter(flowContext, "flowContext");
                        Intrinsics.checkNotNullParameter(declaredTaxResidencies, "declaredTaxResidencies");
                        oVar.f176940b.f(o.a(flowContext), declaredTaxResidencies);
                        return Unit.f186387a;
                    case 7:
                        Map rules2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rules2, "rules");
                        oVar.f176940b.f("cache_tax_residency_rules", rules2);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<v> taxResidencies3 = oVar.f176939a.getTaxResidencies(null);
                        m mVar = m.f;
                        h35.c cVar = new h35.c(29);
                        taxResidencies3.getClass();
                        ufm.i iVar4 = new ufm.i(taxResidencies3, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 9:
                        List taxResidencies4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidencies4, "taxResidencies");
                        oVar.f176940b.f("cache_tax_residencies", taxResidencies4);
                        return Unit.f186387a;
                    case 10:
                        List taxResidencies5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidencies5, "taxResidencies");
                        ue0.c cVar2 = oVar.f176941c;
                        List<zme.f> list = taxResidencies5;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (zme.f fVar : list) {
                            Object obj4 = a.f176928a;
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            arrayList.add(new ioe.w(fVar.f323482a.f297794a, fVar.f323483b, fVar.f323484c, Boolean.valueOf(fVar.d)));
                        }
                        cVar2.G(arrayList, "storage_tax_residencies", kii.e.o(ioe.w.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        g params2 = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<List<y>> certificationRationales = oVar.f176939a.getCertificationRationales(params2.f176936a.f297794a, true);
                        jeg.h hVar = new jeg.h(new jn2.a(21), 28);
                        certificationRationales.getClass();
                        ufm.i iVar5 = new ufm.i(certificationRationales, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i66 = 2;
        Function2 function25 = new Function2(this) { // from class: joe.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f176932b;

            {
                this.f176932b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i66;
                int i322 = 1;
                o oVar = this.f176932b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<Map<String, b0>> rules = oVar.f176939a.getRules();
                        k kVar = k.f;
                        e eVar = new e(0);
                        rules.getClass();
                        ufm.i iVar = new ufm.i(rules, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        g params = (g) obj2;
                        List taxResidencies = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
                        oVar.f176940b.f("cache_tax_rationales:" + params.f176936a.f297794a + ":true", taxResidencies);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<ioe.i> skippableTinCountries = oVar.f176939a.getSkippableTinCountries();
                        l lVar = l.f;
                        e eVar2 = new e(2);
                        skippableTinCountries.getClass();
                        ufm.i iVar2 = new ufm.i(skippableTinCountries, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        List countries = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(countries, "countries");
                        oVar.f176940b.f("cache_skippable_tin_countries", countries);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<v> taxResidencies2 = oVar.f176939a.getTaxResidencies(Boolean.TRUE);
                        n nVar = n.f;
                        e eVar3 = new e(i322);
                        taxResidencies2.getClass();
                        ufm.i iVar3 = new ufm.i(taxResidencies2, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List taxResidenciesWithSuggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidenciesWithSuggestions, "taxResidenciesWithSuggestions");
                        oVar.f176940b.f("cache_tax_residencies_with_suggestions", taxResidenciesWithSuggestions);
                        return Unit.f186387a;
                    case 6:
                        TaxResidencyFlowContext flowContext = (TaxResidencyFlowContext) obj2;
                        List declaredTaxResidencies = (List) obj3;
                        Intrinsics.checkNotNullParameter(flowContext, "flowContext");
                        Intrinsics.checkNotNullParameter(declaredTaxResidencies, "declaredTaxResidencies");
                        oVar.f176940b.f(o.a(flowContext), declaredTaxResidencies);
                        return Unit.f186387a;
                    case 7:
                        Map rules2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rules2, "rules");
                        oVar.f176940b.f("cache_tax_residency_rules", rules2);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<v> taxResidencies3 = oVar.f176939a.getTaxResidencies(null);
                        m mVar = m.f;
                        h35.c cVar = new h35.c(29);
                        taxResidencies3.getClass();
                        ufm.i iVar4 = new ufm.i(taxResidencies3, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 9:
                        List taxResidencies4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidencies4, "taxResidencies");
                        oVar.f176940b.f("cache_tax_residencies", taxResidencies4);
                        return Unit.f186387a;
                    case 10:
                        List taxResidencies5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidencies5, "taxResidencies");
                        ue0.c cVar2 = oVar.f176941c;
                        List<zme.f> list = taxResidencies5;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (zme.f fVar : list) {
                            Object obj4 = a.f176928a;
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            arrayList.add(new ioe.w(fVar.f323482a.f297794a, fVar.f323483b, fVar.f323484c, Boolean.valueOf(fVar.d)));
                        }
                        cVar2.G(arrayList, "storage_tax_residencies", kii.e.o(ioe.w.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        g params2 = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<List<y>> certificationRationales = oVar.f176939a.getCertificationRationales(params2.f176936a.f297794a, true);
                        jeg.h hVar = new jeg.h(new jn2.a(21), 28);
                        certificationRationales.getClass();
                        ufm.i iVar5 = new ufm.i(certificationRationales, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                }
            }
        };
        final int i74 = 0;
        Function1 function15 = new Function1(this) { // from class: joe.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f176934b;

            {
                this.f176934b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i322 = i74;
                o oVar = this.f176934b;
                switch (i322) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) oVar.f176940b.get("cache_skippable_tin_countries");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) oVar.f176940b.get("cache_tax_residencies_with_suggestions");
                    case 2:
                        TaxResidencyFlowContext flowContext = (TaxResidencyFlowContext) obj2;
                        Intrinsics.checkNotNullParameter(flowContext, "flowContext");
                        return (List) oVar.f176940b.get(o.a(flowContext));
                    case 3:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (Map) oVar.f176940b.get("cache_tax_residency_rules");
                    case 4:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) oVar.f176940b.get("cache_tax_residencies");
                    case 5:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ue0.c cVar = oVar.f176941c;
                        Type type = p.f176944a;
                        Intrinsics.checkNotNullExpressionValue(type, "<get-TAX_RESIDENCIES_TYPE>(...)");
                        List list = (List) cVar.T2("storage_tax_residencies", type);
                        if (list == null) {
                            return null;
                        }
                        List<ioe.w> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (ioe.w wVar : list2) {
                            Object obj3 = a.f176928a;
                            Intrinsics.checkNotNullParameter(wVar, "<this>");
                            wi0.a aVar = wi0.b.Companion;
                            String countryCode = wVar.getCountryCode();
                            aVar.getClass();
                            wi0.b bVarA = wi0.a.a(countryCode);
                            String documentNumber = wVar.getDocumentNumber();
                            String documentType = wVar.getDocumentType();
                            Boolean deletable = wVar.getDeletable();
                            arrayList.add(new zme.f(bVarA, documentNumber, documentType, deletable != null ? deletable.booleanValue() : true, null, null, 48));
                        }
                        return arrayList;
                    default:
                        g params = (g) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) oVar.f176940b.get("cache_tax_rationales:" + params.f176936a.f297794a + ":true");
                }
            }
        };
        final int i92 = 3;
        this.f176942g = new w4l.f(function25, function15, new Function2(this) { // from class: joe.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f176932b;

            {
                this.f176932b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i92;
                int i322 = 1;
                o oVar = this.f176932b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<Map<String, b0>> rules = oVar.f176939a.getRules();
                        k kVar = k.f;
                        e eVar = new e(0);
                        rules.getClass();
                        ufm.i iVar = new ufm.i(rules, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        g params = (g) obj2;
                        List taxResidencies = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
                        oVar.f176940b.f("cache_tax_rationales:" + params.f176936a.f297794a + ":true", taxResidencies);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<ioe.i> skippableTinCountries = oVar.f176939a.getSkippableTinCountries();
                        l lVar = l.f;
                        e eVar2 = new e(2);
                        skippableTinCountries.getClass();
                        ufm.i iVar2 = new ufm.i(skippableTinCountries, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        List countries = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(countries, "countries");
                        oVar.f176940b.f("cache_skippable_tin_countries", countries);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<v> taxResidencies2 = oVar.f176939a.getTaxResidencies(Boolean.TRUE);
                        n nVar = n.f;
                        e eVar3 = new e(i322);
                        taxResidencies2.getClass();
                        ufm.i iVar3 = new ufm.i(taxResidencies2, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List taxResidenciesWithSuggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidenciesWithSuggestions, "taxResidenciesWithSuggestions");
                        oVar.f176940b.f("cache_tax_residencies_with_suggestions", taxResidenciesWithSuggestions);
                        return Unit.f186387a;
                    case 6:
                        TaxResidencyFlowContext flowContext = (TaxResidencyFlowContext) obj2;
                        List declaredTaxResidencies = (List) obj3;
                        Intrinsics.checkNotNullParameter(flowContext, "flowContext");
                        Intrinsics.checkNotNullParameter(declaredTaxResidencies, "declaredTaxResidencies");
                        oVar.f176940b.f(o.a(flowContext), declaredTaxResidencies);
                        return Unit.f186387a;
                    case 7:
                        Map rules2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rules2, "rules");
                        oVar.f176940b.f("cache_tax_residency_rules", rules2);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<v> taxResidencies3 = oVar.f176939a.getTaxResidencies(null);
                        m mVar = m.f;
                        h35.c cVar = new h35.c(29);
                        taxResidencies3.getClass();
                        ufm.i iVar4 = new ufm.i(taxResidencies3, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 9:
                        List taxResidencies4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidencies4, "taxResidencies");
                        oVar.f176940b.f("cache_tax_residencies", taxResidencies4);
                        return Unit.f186387a;
                    case 10:
                        List taxResidencies5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidencies5, "taxResidencies");
                        ue0.c cVar2 = oVar.f176941c;
                        List<zme.f> list = taxResidencies5;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (zme.f fVar : list) {
                            Object obj4 = a.f176928a;
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            arrayList.add(new ioe.w(fVar.f323482a.f297794a, fVar.f323483b, fVar.f323484c, Boolean.valueOf(fVar.d)));
                        }
                        cVar2.G(arrayList, "storage_tax_residencies", kii.e.o(ioe.w.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        g params2 = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<List<y>> certificationRationales = oVar.f176939a.getCertificationRationales(params2.f176936a.f297794a, true);
                        jeg.h hVar = new jeg.h(new jn2.a(21), 28);
                        certificationRationales.getClass();
                        ufm.i iVar5 = new ufm.i(certificationRationales, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i96 = 4;
        Function2 function26 = new Function2(this) { // from class: joe.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f176932b;

            {
                this.f176932b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i96;
                int i322 = 1;
                o oVar = this.f176932b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<Map<String, b0>> rules = oVar.f176939a.getRules();
                        k kVar = k.f;
                        e eVar = new e(0);
                        rules.getClass();
                        ufm.i iVar = new ufm.i(rules, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        g params = (g) obj2;
                        List taxResidencies = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
                        oVar.f176940b.f("cache_tax_rationales:" + params.f176936a.f297794a + ":true", taxResidencies);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<ioe.i> skippableTinCountries = oVar.f176939a.getSkippableTinCountries();
                        l lVar = l.f;
                        e eVar2 = new e(2);
                        skippableTinCountries.getClass();
                        ufm.i iVar2 = new ufm.i(skippableTinCountries, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        List countries = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(countries, "countries");
                        oVar.f176940b.f("cache_skippable_tin_countries", countries);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<v> taxResidencies2 = oVar.f176939a.getTaxResidencies(Boolean.TRUE);
                        n nVar = n.f;
                        e eVar3 = new e(i322);
                        taxResidencies2.getClass();
                        ufm.i iVar3 = new ufm.i(taxResidencies2, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List taxResidenciesWithSuggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidenciesWithSuggestions, "taxResidenciesWithSuggestions");
                        oVar.f176940b.f("cache_tax_residencies_with_suggestions", taxResidenciesWithSuggestions);
                        return Unit.f186387a;
                    case 6:
                        TaxResidencyFlowContext flowContext = (TaxResidencyFlowContext) obj2;
                        List declaredTaxResidencies = (List) obj3;
                        Intrinsics.checkNotNullParameter(flowContext, "flowContext");
                        Intrinsics.checkNotNullParameter(declaredTaxResidencies, "declaredTaxResidencies");
                        oVar.f176940b.f(o.a(flowContext), declaredTaxResidencies);
                        return Unit.f186387a;
                    case 7:
                        Map rules2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rules2, "rules");
                        oVar.f176940b.f("cache_tax_residency_rules", rules2);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<v> taxResidencies3 = oVar.f176939a.getTaxResidencies(null);
                        m mVar = m.f;
                        h35.c cVar = new h35.c(29);
                        taxResidencies3.getClass();
                        ufm.i iVar4 = new ufm.i(taxResidencies3, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 9:
                        List taxResidencies4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidencies4, "taxResidencies");
                        oVar.f176940b.f("cache_tax_residencies", taxResidencies4);
                        return Unit.f186387a;
                    case 10:
                        List taxResidencies5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidencies5, "taxResidencies");
                        ue0.c cVar2 = oVar.f176941c;
                        List<zme.f> list = taxResidencies5;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (zme.f fVar : list) {
                            Object obj4 = a.f176928a;
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            arrayList.add(new ioe.w(fVar.f323482a.f297794a, fVar.f323483b, fVar.f323484c, Boolean.valueOf(fVar.d)));
                        }
                        cVar2.G(arrayList, "storage_tax_residencies", kii.e.o(ioe.w.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        g params2 = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<List<y>> certificationRationales = oVar.f176939a.getCertificationRationales(params2.f176936a.f297794a, true);
                        jeg.h hVar = new jeg.h(new jn2.a(21), 28);
                        certificationRationales.getClass();
                        ufm.i iVar5 = new ufm.i(certificationRationales, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                }
            }
        };
        final int i99 = 1;
        Function1 function16 = new Function1(this) { // from class: joe.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f176934b;

            {
                this.f176934b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i322 = i99;
                o oVar = this.f176934b;
                switch (i322) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) oVar.f176940b.get("cache_skippable_tin_countries");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) oVar.f176940b.get("cache_tax_residencies_with_suggestions");
                    case 2:
                        TaxResidencyFlowContext flowContext = (TaxResidencyFlowContext) obj2;
                        Intrinsics.checkNotNullParameter(flowContext, "flowContext");
                        return (List) oVar.f176940b.get(o.a(flowContext));
                    case 3:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (Map) oVar.f176940b.get("cache_tax_residency_rules");
                    case 4:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) oVar.f176940b.get("cache_tax_residencies");
                    case 5:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ue0.c cVar = oVar.f176941c;
                        Type type = p.f176944a;
                        Intrinsics.checkNotNullExpressionValue(type, "<get-TAX_RESIDENCIES_TYPE>(...)");
                        List list = (List) cVar.T2("storage_tax_residencies", type);
                        if (list == null) {
                            return null;
                        }
                        List<ioe.w> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (ioe.w wVar : list2) {
                            Object obj3 = a.f176928a;
                            Intrinsics.checkNotNullParameter(wVar, "<this>");
                            wi0.a aVar = wi0.b.Companion;
                            String countryCode = wVar.getCountryCode();
                            aVar.getClass();
                            wi0.b bVarA = wi0.a.a(countryCode);
                            String documentNumber = wVar.getDocumentNumber();
                            String documentType = wVar.getDocumentType();
                            Boolean deletable = wVar.getDeletable();
                            arrayList.add(new zme.f(bVarA, documentNumber, documentType, deletable != null ? deletable.booleanValue() : true, null, null, 48));
                        }
                        return arrayList;
                    default:
                        g params = (g) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) oVar.f176940b.get("cache_tax_rationales:" + params.f176936a.f297794a + ":true");
                }
            }
        };
        final int i100 = 5;
        this.f176943h = new w4l.f(function26, function16, new Function2(this) { // from class: joe.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f176932b;

            {
                this.f176932b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i100;
                int i322 = 1;
                o oVar = this.f176932b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<Map<String, b0>> rules = oVar.f176939a.getRules();
                        k kVar = k.f;
                        e eVar = new e(0);
                        rules.getClass();
                        ufm.i iVar = new ufm.i(rules, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        g params = (g) obj2;
                        List taxResidencies = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
                        oVar.f176940b.f("cache_tax_rationales:" + params.f176936a.f297794a + ":true", taxResidencies);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<ioe.i> skippableTinCountries = oVar.f176939a.getSkippableTinCountries();
                        l lVar = l.f;
                        e eVar2 = new e(2);
                        skippableTinCountries.getClass();
                        ufm.i iVar2 = new ufm.i(skippableTinCountries, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        List countries = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(countries, "countries");
                        oVar.f176940b.f("cache_skippable_tin_countries", countries);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<v> taxResidencies2 = oVar.f176939a.getTaxResidencies(Boolean.TRUE);
                        n nVar = n.f;
                        e eVar3 = new e(i322);
                        taxResidencies2.getClass();
                        ufm.i iVar3 = new ufm.i(taxResidencies2, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List taxResidenciesWithSuggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidenciesWithSuggestions, "taxResidenciesWithSuggestions");
                        oVar.f176940b.f("cache_tax_residencies_with_suggestions", taxResidenciesWithSuggestions);
                        return Unit.f186387a;
                    case 6:
                        TaxResidencyFlowContext flowContext = (TaxResidencyFlowContext) obj2;
                        List declaredTaxResidencies = (List) obj3;
                        Intrinsics.checkNotNullParameter(flowContext, "flowContext");
                        Intrinsics.checkNotNullParameter(declaredTaxResidencies, "declaredTaxResidencies");
                        oVar.f176940b.f(o.a(flowContext), declaredTaxResidencies);
                        return Unit.f186387a;
                    case 7:
                        Map rules2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rules2, "rules");
                        oVar.f176940b.f("cache_tax_residency_rules", rules2);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<v> taxResidencies3 = oVar.f176939a.getTaxResidencies(null);
                        m mVar = m.f;
                        h35.c cVar = new h35.c(29);
                        taxResidencies3.getClass();
                        ufm.i iVar4 = new ufm.i(taxResidencies3, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 9:
                        List taxResidencies4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidencies4, "taxResidencies");
                        oVar.f176940b.f("cache_tax_residencies", taxResidencies4);
                        return Unit.f186387a;
                    case 10:
                        List taxResidencies5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidencies5, "taxResidencies");
                        ue0.c cVar2 = oVar.f176941c;
                        List<zme.f> list = taxResidencies5;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (zme.f fVar : list) {
                            Object obj4 = a.f176928a;
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            arrayList.add(new ioe.w(fVar.f323482a.f297794a, fVar.f323483b, fVar.f323484c, Boolean.valueOf(fVar.d)));
                        }
                        cVar2.G(arrayList, "storage_tax_residencies", kii.e.o(ioe.w.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        g params2 = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<List<y>> certificationRationales = oVar.f176939a.getCertificationRationales(params2.f176936a.f297794a, true);
                        jeg.h hVar = new jeg.h(new jn2.a(21), 28);
                        certificationRationales.getClass();
                        ufm.i iVar5 = new ufm.i(certificationRationales, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        Continuation continuation = null;
        final int i101 = 2;
        final int i102 = 6;
        int i103 = 3;
        this.i = new x4l.c(new h(this, null), new Function1(this) { // from class: joe.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f176934b;

            {
                this.f176934b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i322 = i101;
                o oVar = this.f176934b;
                switch (i322) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) oVar.f176940b.get("cache_skippable_tin_countries");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) oVar.f176940b.get("cache_tax_residencies_with_suggestions");
                    case 2:
                        TaxResidencyFlowContext flowContext = (TaxResidencyFlowContext) obj2;
                        Intrinsics.checkNotNullParameter(flowContext, "flowContext");
                        return (List) oVar.f176940b.get(o.a(flowContext));
                    case 3:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (Map) oVar.f176940b.get("cache_tax_residency_rules");
                    case 4:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) oVar.f176940b.get("cache_tax_residencies");
                    case 5:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        ue0.c cVar = oVar.f176941c;
                        Type type = p.f176944a;
                        Intrinsics.checkNotNullExpressionValue(type, "<get-TAX_RESIDENCIES_TYPE>(...)");
                        List list = (List) cVar.T2("storage_tax_residencies", type);
                        if (list == null) {
                            return null;
                        }
                        List<ioe.w> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (ioe.w wVar : list2) {
                            Object obj3 = a.f176928a;
                            Intrinsics.checkNotNullParameter(wVar, "<this>");
                            wi0.a aVar = wi0.b.Companion;
                            String countryCode = wVar.getCountryCode();
                            aVar.getClass();
                            wi0.b bVarA = wi0.a.a(countryCode);
                            String documentNumber = wVar.getDocumentNumber();
                            String documentType = wVar.getDocumentType();
                            Boolean deletable = wVar.getDeletable();
                            arrayList.add(new zme.f(bVarA, documentNumber, documentType, deletable != null ? deletable.booleanValue() : true, null, null, 48));
                        }
                        return arrayList;
                    default:
                        g params = (g) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) oVar.f176940b.get("cache_tax_rationales:" + params.f176936a.f297794a + ":true");
                }
            }
        }, new Function2(this) { // from class: joe.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f176932b;

            {
                this.f176932b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i102;
                int i322 = 1;
                o oVar = this.f176932b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<Map<String, b0>> rules = oVar.f176939a.getRules();
                        k kVar = k.f;
                        e eVar = new e(0);
                        rules.getClass();
                        ufm.i iVar = new ufm.i(rules, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        g params = (g) obj2;
                        List taxResidencies = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
                        oVar.f176940b.f("cache_tax_rationales:" + params.f176936a.f297794a + ":true", taxResidencies);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<ioe.i> skippableTinCountries = oVar.f176939a.getSkippableTinCountries();
                        l lVar = l.f;
                        e eVar2 = new e(2);
                        skippableTinCountries.getClass();
                        ufm.i iVar2 = new ufm.i(skippableTinCountries, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        List countries = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(countries, "countries");
                        oVar.f176940b.f("cache_skippable_tin_countries", countries);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<v> taxResidencies2 = oVar.f176939a.getTaxResidencies(Boolean.TRUE);
                        n nVar = n.f;
                        e eVar3 = new e(i322);
                        taxResidencies2.getClass();
                        ufm.i iVar3 = new ufm.i(taxResidencies2, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List taxResidenciesWithSuggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidenciesWithSuggestions, "taxResidenciesWithSuggestions");
                        oVar.f176940b.f("cache_tax_residencies_with_suggestions", taxResidenciesWithSuggestions);
                        return Unit.f186387a;
                    case 6:
                        TaxResidencyFlowContext flowContext = (TaxResidencyFlowContext) obj2;
                        List declaredTaxResidencies = (List) obj3;
                        Intrinsics.checkNotNullParameter(flowContext, "flowContext");
                        Intrinsics.checkNotNullParameter(declaredTaxResidencies, "declaredTaxResidencies");
                        oVar.f176940b.f(o.a(flowContext), declaredTaxResidencies);
                        return Unit.f186387a;
                    case 7:
                        Map rules2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rules2, "rules");
                        oVar.f176940b.f("cache_tax_residency_rules", rules2);
                        return Unit.f186387a;
                    case 8:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<v> taxResidencies3 = oVar.f176939a.getTaxResidencies(null);
                        m mVar = m.f;
                        h35.c cVar = new h35.c(29);
                        taxResidencies3.getClass();
                        ufm.i iVar4 = new ufm.i(taxResidencies3, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 9:
                        List taxResidencies4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidencies4, "taxResidencies");
                        oVar.f176940b.f("cache_tax_residencies", taxResidencies4);
                        return Unit.f186387a;
                    case 10:
                        List taxResidencies5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(taxResidencies5, "taxResidencies");
                        ue0.c cVar2 = oVar.f176941c;
                        List<zme.f> list = taxResidencies5;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (zme.f fVar : list) {
                            Object obj4 = a.f176928a;
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            arrayList.add(new ioe.w(fVar.f323482a.f297794a, fVar.f323483b, fVar.f323484c, Boolean.valueOf(fVar.d)));
                        }
                        cVar2.G(arrayList, "storage_tax_residencies", kii.e.o(ioe.w.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        g params2 = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<List<y>> certificationRationales = oVar.f176939a.getCertificationRationales(params2.f176936a.f297794a, true);
                        jeg.h hVar = new jeg.h(new jn2.a(21), 28);
                        certificationRationales.getClass();
                        ufm.i iVar5 = new ufm.i(certificationRationales, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                }
            }
        }, new iz1.g(2, i103, continuation), new eci.a(i103, 24, continuation));
    }

    public static String a(TaxResidencyFlowContext taxResidencyFlowContext) {
        String str = taxResidencyFlowContext.f90179a;
        String str2 = taxResidencyFlowContext.f90181c;
        WorkflowStepConfiguration.Screen.TaxResidenciesCollection.ProductConfigurationKey productConfigurationKey = taxResidencyFlowContext.f90180b;
        String str3 = productConfigurationKey.f105555b;
        String str4 = productConfigurationKey.f105556c;
        String str5 = productConfigurationKey.f105554a.f297794a;
        String str6 = productConfigurationKey.d;
        StringBuilder sbM = v0.a.m("cache_declared_tax_residencies:", str, ":", str2, ":");
        j6.a.D(sbM, str3, ":", str4, ":");
        return a0.d.u(sbM, str5, ":", str6);
    }

    public final d0 b(zme.m taxValidationInput) {
        Intrinsics.checkNotNullParameter(taxValidationInput, "taxValidationInput");
        Object obj2 = a.f176928a;
        Intrinsics.checkNotNullParameter(taxValidationInput, "<this>");
        d0<Response<Unit>> d0VarValidateTaxResidencyNumber = this.f176939a.validateTaxResidencyNumber(new f0(taxValidationInput.f323503a.f297794a, taxValidationInput.f323504b, taxValidationInput.f323505c));
        jeg.h hVar = new jeg.h(new jn2.a(22), 29);
        d0VarValidateTaxResidencyNumber.getClass();
        ufm.i iVar = new ufm.i(d0VarValidateTaxResidencyNumber, hVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return te0.w.i0(iVar);
    }

    @Override // od0.e
    public final void clear() {
        this.f176940b.clear();
        this.f176941c.clear();
    }
}
