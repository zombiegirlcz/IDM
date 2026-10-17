package wfb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.salary_account.api.SalaryAccountApi$Toggles$SalaryAccountAvailability;
import com.revolut.feature.retail.salary_account.impl.salary_hub.data.service.SalaryHubService;
import com.revolut.feature.retail.salary_account.impl.salary_promotion.data.SalaryPromotionService;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.data.SalarySwitchAssistantService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import retrofit2.Converter;
import ulm.b1;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f297037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f297038b;

    public h(i iVar, int i) {
        this.f297037a = iVar;
        this.f297038b = i;
    }

    @Override // phm.a
    public final Object get() {
        i iVar = this.f297037a;
        int i = this.f297038b;
        switch (i) {
            case 0:
                return new ne0.d();
            case 1:
                je0.d mapper = iVar.f297039a.d();
                vc.s.j(mapper);
                yk0.a databaseSessionProvider = iVar.f297040b.b();
                vc.s.j(databaseSessionProvider);
                xe0.f storageFactory = iVar.f297039a.f();
                vc.s.j(storageFactory);
                lgb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "salary_hub", mapper, 0, null, 56);
            case 2:
                je0.d mapper2 = (je0.d) iVar.f297054x.get();
                yk0.a databaseSessionProvider2 = iVar.f297040b.b();
                vc.s.j(databaseSessionProvider2);
                xe0.f storageFactory2 = iVar.f297039a.f();
                vc.s.j(storageFactory2);
                ygb.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper2, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                return xe0.f.f(storageFactory2, databaseSessionProvider2, "salary_promotion", mapper2, 0, null, 56);
            case 3:
                Json json = (Json) iVar.f297053w.get();
                me0.a factory = iVar.f297039a.e();
                vc.s.j(factory);
                ygb.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a(json);
            case 4:
                ee0.a aVar = iVar.f297039a;
                Json baseJson = fe0.d.a();
                ygb.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(baseJson, "baseJson");
                return ue0.e.b(baseJson, new ye1.m(23));
            case 5:
                ygb.d.Companion.getClass();
                return new ne0.d();
            case 6:
                iVar.getClass();
                return new vfb.b(ImmutableSet.of((jib.b) new fgb.c(), (jib.b) new fgb.d(), (jib.b) new fgb.e(), new jib.b((kib.a) iVar.A.get())));
            case 7:
                return new kib.a();
            case 8:
                return new fgb.a((sri.m) iVar.C.get());
            case 9:
                z70.a contextProvider = iVar.f297041c.f();
                vc.s.j(contextProvider);
                y.Companion.getClass();
                Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
                return sri.o.c(contextProvider.getContext(), null, null, 14);
            case 10:
                return new fgb.b((sri.m) iVar.C.get());
            case 11:
                ite.a aVar2 = iVar.d;
                ite.a aVar3 = iVar.d;
                ila.b bVar = iVar.e;
                gte.a aVarB = aVar2.b();
                vc.s.j(aVarB);
                xfb.f legacyChecker = new xfb.f(aVarB, bVar.a(), iVar.f.e());
                gte.a aVarB2 = aVar3.b();
                vc.s.j(aVarB2);
                xfb.m v2Checker = new xfb.m(aVarB2, bVar.a(), (xfb.s) iVar.G.get());
                gte.a featureToggleInteractor = aVar3.b();
                vc.s.j(featureToggleInteractor);
                w.Companion.getClass();
                Intrinsics.checkNotNullParameter(legacyChecker, "legacyChecker");
                Intrinsics.checkNotNullParameter(v2Checker, "v2Checker");
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                return ((jte.d) featureToggleInteractor).c(SalaryAccountApi$Toggles$SalaryAccountAvailability.f82945c) ? v2Checker : legacyChecker;
            case 12:
                return new xfb.s((kgb.g) iVar.F.get(), iVar.f.e());
            case 13:
                nj0.d dVar = (nj0.d) iVar.f297042g;
                ik0.b retrofitFactory = dVar.m();
                vc.s.j(retrofitFactory);
                ek.a converterFactory = dVar.d();
                lgb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(SalaryHubService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                SalaryHubService salaryHubService = (SalaryHubService) objCreate;
                vc.s.k(salaryHubService);
                return new kgb.g(salaryHubService, (ne0.j) iVar.u.get(), (ue0.c) iVar.v.get());
            case 14:
                xfb.s sVar = (xfb.s) iVar.G.get();
                gte.a aVarB3 = iVar.d.b();
                vc.s.j(aVarB3);
                return new tfb.g(sVar, aVarB3, iVar.f.e());
            case 15:
                ang.f fVarE = iVar.f.e();
                l61.a aVarB4 = iVar.f.b();
                vc.s.j(aVarB4);
                return new zfb.c(fVarE, aVarB4);
            case 16:
                ik0.b retrofitFactory2 = ((nj0.d) iVar.f297042g).m();
                vc.s.j(retrofitFactory2);
                ek.a converterFactory2 = ((nj0.d) iVar.f297042g).d();
                dhb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory2, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory2, "converterFactory");
                Object objCreate2 = ik0.b.a(retrofitFactory2, null, null, converterFactory2, null, 27).create(SalarySwitchAssistantService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                SalarySwitchAssistantService salarySwitchAssistantService = (SalarySwitchAssistantService) objCreate2;
                vc.s.k(salarySwitchAssistantService);
                return salarySwitchAssistantService;
            case 17:
                return new zgb.a((xgb.a) iVar.N.get());
            case 18:
                return new xgb.a((SalaryPromotionService) iVar.M.get(), (ne0.j) iVar.z.get(), (ue0.c) iVar.f297055y.get());
            case 19:
                ik0.b retrofitFactory3 = ((nj0.d) iVar.f297042g).m();
                vc.s.j(retrofitFactory3);
                Converter.Factory converterFactory3 = (Converter.Factory) iVar.L.get();
                ygb.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory3, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory3, "converterFactory");
                Object objCreate3 = ik0.b.a(retrofitFactory3, null, null, converterFactory3, null, 27).create(SalaryPromotionService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate3, "create(...)");
                SalaryPromotionService salaryPromotionService = (SalaryPromotionService) objCreate3;
                vc.s.k(salaryPromotionService);
                return salaryPromotionService;
            case 20:
                Json json2 = (Json) iVar.f297053w.get();
                ygb.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(json2, "json");
                return p.a.g(b1.Companion, "application/json", json2);
            default:
                throw new AssertionError(i);
        }
    }
}
