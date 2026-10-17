package fnb;

import com.revolut.feature.retail.savings.impl.documents.data.network.SavingsDocumentsService;
import g2e.t;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import retrofit2.Converter;
import ulm.b1;
import vc.s;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f136590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f136591b;

    public a(b bVar, int i) {
        this.f136590a = bVar;
        this.f136591b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f136590a;
        ee0.a aVar = bVar.f136592a;
        nj0.a aVar2 = bVar.f136594c;
        l70.e eVar = bVar.d;
        int i = this.f136591b;
        switch (i) {
            case 0:
                je0.d mapper = (je0.d) bVar.i.get();
                yk0.a databaseSessionProvider = bVar.f136593b.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar.f();
                s.j(storageFactory);
                i.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.g(storageFactory, databaseSessionProvider, "documents_data_storage", mapper, 1, f0.f322471a, false, 64);
            case 1:
                Json json = (Json) bVar.f136596h.get();
                me0.a factory = aVar.e();
                s.j(factory);
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a(json);
            case 2:
                Json baseJson = fe0.d.a();
                Intrinsics.checkNotNullParameter(baseJson, "baseJson");
                return baseJson;
            case 3:
                SavingsDocumentsService service = (SavingsDocumentsService) bVar.f136598l.get();
                ue0.c storage = (ue0.c) bVar.f136597j.get();
                ne0.j memoryCache = (ne0.j) bVar.f136599m.get();
                zk0.b fileSystemRepository = eVar.l();
                s.j(fileSystemRepository);
                t rawUrlRequestRepository = ((nj0.d) aVar2).o();
                l80.e dateTimeProvider = eVar.h();
                s.j(dateTimeProvider);
                f80.a uriHelper = eVar.x();
                s.j(uriHelper);
                i.Companion.getClass();
                Intrinsics.checkNotNullParameter(service, "service");
                Intrinsics.checkNotNullParameter(storage, "storage");
                Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
                Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
                Intrinsics.checkNotNullParameter(rawUrlRequestRepository, "rawUrlRequestRepository");
                Intrinsics.checkNotNullParameter(dateTimeProvider, "dateTimeProvider");
                Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
                return new enb.g(service, memoryCache, storage, fileSystemRepository, rawUrlRequestRepository, dateTimeProvider);
            case 4:
                ik0.b retrofitFactory = ((nj0.d) aVar2).m();
                s.j(retrofitFactory);
                Converter.Factory converterFactory = (Converter.Factory) bVar.k.get();
                i.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(SavingsDocumentsService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                SavingsDocumentsService savingsDocumentsService = (SavingsDocumentsService) objCreate;
                s.k(savingsDocumentsService);
                return savingsDocumentsService;
            case 5:
                Json json2 = (Json) bVar.f136596h.get();
                Intrinsics.checkNotNullParameter(json2, "json");
                return p.a.g(b1.Companion, "application/json", json2);
            case 6:
                return new ne0.d();
            default:
                throw new AssertionError(i);
        }
    }
}
