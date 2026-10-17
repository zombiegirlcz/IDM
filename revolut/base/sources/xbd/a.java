package xbd;

import com.revolut.feature.shared.savings.impl.info_sheets.data.network.InfoSheetsService;
import com.revolut.feature.shared.savings.impl.product.data.network.SavingsProductService;
import e4m.e;
import gcd.g;
import je0.d;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import ne0.j;
import retrofit2.Converter;
import rlm.o;
import ulm.b1;
import vc.s;
import xe0.f;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f304046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f304047b;

    public a(b bVar, int i) {
        this.f304046a = bVar;
        this.f304047b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f304046a;
        int i = this.f304047b;
        switch (i) {
            case 0:
                d mapper = (d) bVar.f304051g.get();
                yk0.a databaseSessionProvider = bVar.f304049b.b();
                s.j(databaseSessionProvider);
                f storageFactory = bVar.f304048a.f();
                s.j(storageFactory);
                bcd.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return f.g(storageFactory, databaseSessionProvider, "info_sheets_data_storage", mapper, 1, f0.f322471a, false, 64);
            case 1:
                Json json = (Json) bVar.f.get();
                me0.a factory = bVar.f304048a.e();
                s.j(factory);
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a(json);
            case 2:
                ee0.a aVar = bVar.f304048a;
                bh3.a jsonProvider = new bh3.a(fe0.d.a(), 1);
                Intrinsics.checkNotNullParameter(jsonProvider, "jsonProvider");
                o oVar = jsonProvider.f15224a;
                s.k(oVar);
                return oVar;
            case 3:
                d mapper2 = (d) bVar.f304051g.get();
                yk0.a databaseSessionProvider2 = bVar.f304049b.b();
                s.j(databaseSessionProvider2);
                f storageFactory2 = bVar.f304048a.f();
                s.j(storageFactory2);
                hcd.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper2, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                return f.f(storageFactory2, databaseSessionProvider2, "savings_data_storage", mapper2, jcd.a.f172789b, jcd.a.f172788a, 32);
            case 4:
                acd.a repository = (acd.a) bVar.f304056n.get();
                Intrinsics.checkNotNullParameter(repository, "repository");
                return new ccd.a(repository);
            case 5:
                InfoSheetsService service = (InfoSheetsService) bVar.k.get();
                ue0.c storage = (ue0.c) bVar.f304052h.get();
                j memoryCache = (j) bVar.f304055m.get();
                bcd.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(service, "service");
                Intrinsics.checkNotNullParameter(storage, "storage");
                Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
                return new acd.a(service, memoryCache, storage);
            case 6:
                ik0.b retrofitFactory = ((nj0.d) bVar.f304050c).m();
                s.j(retrofitFactory);
                Converter.Factory converterFactory = (Converter.Factory) bVar.f304053j.get();
                obd.a sharedSavingsNetworkConfiguration = bVar.d;
                bcd.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Intrinsics.checkNotNullParameter(sharedSavingsNetworkConfiguration, "sharedSavingsNetworkConfiguration");
                Object objCreate = ik0.b.a(retrofitFactory, null, sharedSavingsNetworkConfiguration.getHostUrl(), converterFactory, null, 25).create(InfoSheetsService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                InfoSheetsService infoSheetsService = (InfoSheetsService) objCreate;
                s.k(infoSheetsService);
                return infoSheetsService;
            case 7:
                Json json2 = (Json) bVar.f.get();
                Intrinsics.checkNotNullParameter(json2, "json");
                return p.a.g(b1.Companion, "application/json", json2);
            case 8:
                return new ne0.d();
            case 9:
                return new icd.a((g) bVar.f304059r.get());
            case 10:
                SavingsProductService savingsProductService = (SavingsProductService) bVar.f304057p.get();
                j jVar = (j) bVar.f304058q.get();
                ue0.c cVar = (ue0.c) bVar.i.get();
                gte.a aVarB = bVar.e.f6617a.b();
                s.j(aVarB);
                return new g(savingsProductService, jVar, cVar, new lob.a(aVarB));
            case 11:
                ik0.b retrofitFactory2 = ((nj0.d) bVar.f304050c).m();
                s.j(retrofitFactory2);
                Converter.Factory converterFactory2 = (Converter.Factory) bVar.f304053j.get();
                obd.a sharedSavingsNetworkConfiguration2 = bVar.d;
                hcd.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory2, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory2, "converterFactory");
                Intrinsics.checkNotNullParameter(sharedSavingsNetworkConfiguration2, "sharedSavingsNetworkConfiguration");
                Object objCreate2 = ik0.b.a(retrofitFactory2, null, sharedSavingsNetworkConfiguration2.getHostUrl(), converterFactory2, null, 25).create(SavingsProductService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                SavingsProductService savingsProductService2 = (SavingsProductService) objCreate2;
                s.k(savingsProductService2);
                return savingsProductService2;
            default:
                throw new AssertionError(i);
        }
    }
}
