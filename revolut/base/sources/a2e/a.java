package a2e;

import com.revolut.feature.store.core.impl.data.network.StoreCoreService;
import e4m.e;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import vc.s;
import xe0.f;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f799b;

    public a(b bVar, int i) {
        this.f798a = bVar;
        this.f799b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f798a;
        nj0.a aVar = bVar.f800a;
        ee0.a aVar2 = bVar.f801b;
        int i = this.f799b;
        if (i == 0) {
            return new y1e.d((StoreCoreService) bVar.d.get(), new ne0.d());
        }
        if (i == 1) {
            Retrofit retrofit = ((nj0.d) aVar).f();
            ek.a converterFactory = ((nj0.d) aVar).d();
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
            Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
            builderNewBuilder.converterFactories().clear();
            Retrofit retrofitBuild = builderNewBuilder.addConverterFactory(converterFactory).build();
            Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
            Object objCreate = retrofitBuild.create(StoreCoreService.class);
            Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
            StoreCoreService storeCoreService = (StoreCoreService) objCreate;
            s.k(storeCoreService);
            return storeCoreService;
        }
        if (i == 2) {
            return new y1e.b((StoreCoreService) bVar.d.get(), new ne0.d(), (ue0.c) bVar.f.get());
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        je0.d mapper = aVar2.d();
        s.j(mapper);
        yk0.a databaseSessionProvider = bVar.f802c.b();
        s.j(databaseSessionProvider);
        f storageFactory = aVar2.f();
        s.j(storageFactory);
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "store_core", mapper, 1, f0.f322471a, 32);
    }
}
