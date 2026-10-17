package k26;

import com.revolut.feature.defi.asset_details.impl.data.api.DeFiAssetDetailsApiService;
import i26.k;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ne0.j;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f180364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f180365b;

    public a(b bVar, int i) {
        this.f180364a = bVar;
        this.f180365b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f180364a;
        nj0.a aVar = bVar.f180366a;
        ee0.a aVar2 = bVar.f180367b;
        rg0.e eVar = bVar.f180368c;
        l70.e eVar2 = bVar.e;
        int i = this.f180365b;
        switch (i) {
            case 0:
                k kVar = (k) bVar.i.get();
                xv5.c cVarA = bVar.d.a();
                s.j(cVarA);
                return new g26.b(kVar, cVarA);
            case 1:
                DeFiAssetDetailsApiService deFiAssetDetailsApiService = (DeFiAssetDetailsApiService) bVar.f.get();
                j jVar = (j) bVar.f180369g.get();
                ue0.c cVar = (ue0.c) bVar.f180370h.get();
                CoroutineScope coroutineScopeA = eVar.a();
                s.j(coroutineScopeA);
                return new k(deFiAssetDetailsApiService, jVar, cVar, coroutineScopeA);
            case 2:
                ek.a converterFactory = ((nj0.d) aVar).d();
                ik0.b factory = ((nj0.d) aVar).m();
                s.j(factory);
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Intrinsics.checkNotNullParameter(factory, "factory");
                Object objCreate = ik0.b.a(factory, null, null, converterFactory, null, 27).create(DeFiAssetDetailsApiService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                DeFiAssetDetailsApiService deFiAssetDetailsApiService2 = (DeFiAssetDetailsApiService) objCreate;
                s.k(deFiAssetDetailsApiService2);
                return deFiAssetDetailsApiService2;
            case 3:
                return new ne0.d();
            case 4:
                je0.d mapper = aVar2.d();
                s.j(mapper);
                xe0.f storageFactory = aVar2.f();
                s.j(storageFactory);
                g.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.e(storageFactory, "defi_asset_details_storage", mapper, 8);
            case 5:
                DeFiAssetDetailsApiService deFiAssetDetailsApiService3 = (DeFiAssetDetailsApiService) bVar.f.get();
                j jVar2 = (j) bVar.f180369g.get();
                ue0.c cVar2 = (ue0.c) bVar.f180370h.get();
                b80.c cVarP = eVar2.p();
                s.j(cVarP);
                CoroutineScope coroutineScopeA2 = eVar.a();
                s.j(coroutineScopeA2);
                l80.e eVarH = eVar2.h();
                s.j(eVarH);
                return new i26.c(deFiAssetDetailsApiService3, jVar2, cVar2, cVarP, coroutineScopeA2, eVarH);
            case 6:
                return new j26.b();
            default:
                throw new AssertionError(i);
        }
    }
}
