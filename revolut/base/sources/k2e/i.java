package k2e;

import com.revolut.feature.store.impl.data.network.StoreService;
import g2e.c0;
import g2e.n0;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f180508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f180509b;

    public i(j jVar, int i) {
        this.f180508a = jVar;
        this.f180509b = i;
    }

    @Override // phm.a
    public final Object get() {
        j jVar = this.f180508a;
        nj0.a aVar = jVar.e;
        ee0.a aVar2 = jVar.f;
        int i = this.f180509b;
        switch (i) {
            case 0:
                StoreService storeService = (StoreService) jVar.f180523t.get();
                ne0.j jVar2 = (ne0.j) jVar.u.get();
                ue0.c cVar = (ue0.c) jVar.v.get();
                w39.b bVarA = jVar.f180514h.a();
                vc.s.j(bVarA);
                return new g2e.r(storeService, jVar2, cVar, new g2e.t(bVarA), jVar.a());
            case 1:
                StoreService storeService2 = (StoreService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) jVar.f180522s.get(), "retrofit", StoreService.class, "create(...)");
                vc.s.k(storeService2);
                return storeService2;
            case 2:
                Retrofit retrofit = ((nj0.d) aVar).f();
                ek.a converterFactory = ((nj0.d) aVar).d();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
                builderNewBuilder.converterFactories().clear();
                Retrofit retrofitBuild = builderNewBuilder.addConverterFactory(converterFactory).build();
                Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                vc.s.k(retrofitBuild);
                return retrofitBuild;
            case 3:
                y.Companion.getClass();
                return new ne0.d();
            case 4:
                je0.d mapper = aVar2.d();
                vc.s.j(mapper);
                yk0.a databaseSessionProvider = jVar.f180513g.b();
                vc.s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar2.f();
                vc.s.j(storageFactory);
                y.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "store", mapper, 1, f0.f322471a, 32);
            case 5:
                return new n0((StoreService) jVar.f180523t.get(), (ne0.j) jVar.u.get(), (ue0.c) jVar.v.get(), jVar.a());
            case 6:
                return new c0((StoreService) jVar.f180523t.get(), (ne0.j) jVar.u.get(), (ue0.c) jVar.v.get(), jVar.a());
            case 7:
                return new g2e.c();
            case 8:
                return new g2e.e();
            default:
                throw new AssertionError(i);
        }
    }
}
