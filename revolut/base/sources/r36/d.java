package r36;

import com.revolut.feature.defi.exchange.impl.data.network.CeFiToDeFiAssetsService;
import com.revolut.feature.defi.exchange.impl.data.network.DeFiExchangeService;
import com.revolut.feature.defi.exchange.impl.data.network.DeFiSwapSubmitService;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ne0.j;
import retrofit2.converter.gson.GsonConverterFactory;
import vc.s;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f251163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f251164b;

    public d(e eVar, int i) {
        this.f251163a = eVar;
        this.f251164b = i;
    }

    @Override // phm.a
    public final Object get() {
        e eVar = this.f251163a;
        ee0.a aVar = eVar.f251165a;
        nj0.a aVar2 = eVar.d;
        int i = this.f251164b;
        switch (i) {
            case 0:
                return new q36.b();
            case 1:
                return new ne0.d();
            case 2:
                je0.d mapper = aVar.d();
                s.j(mapper);
                yk0.a databaseSessionProvider = eVar.f251166b.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar.f();
                s.j(storageFactory);
                i.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "defi_exchange", mapper, 1, f0.f322471a, 32);
            case 3:
                DeFiExchangeService deFiExchangeService = (DeFiExchangeService) eVar.f251180x.get();
                DeFiSwapSubmitService deFiSwapSubmitService = (DeFiSwapSubmitService) eVar.f251181y.get();
                x26.a aVar3 = (x26.a) eVar.e.f318973a.get();
                s.j(aVar3);
                CoroutineScope coroutineScopeA = eVar.f.a();
                s.j(coroutineScopeA);
                return new o36.g(deFiExchangeService, deFiSwapSubmitService, aVar3, coroutineScopeA);
            case 4:
                ek.a converterFactory = ((nj0.d) aVar2).d();
                ik0.b factory = ((nj0.d) aVar2).m();
                s.j(factory);
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Intrinsics.checkNotNullParameter(factory, "factory");
                Object objCreate = ik0.b.a(factory, null, null, converterFactory, null, 27).create(DeFiExchangeService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                DeFiExchangeService deFiExchangeService2 = (DeFiExchangeService) objCreate;
                s.k(deFiExchangeService2);
                return deFiExchangeService2;
            case 5:
                o gson = fe0.c.a();
                Intrinsics.checkNotNullParameter(gson, "gson");
                GsonConverterFactory converterFactory2 = GsonConverterFactory.create(gson);
                Intrinsics.checkNotNullExpressionValue(converterFactory2, "create(...)");
                s.k(converterFactory2);
                ik0.b factory2 = ((nj0.d) aVar2).m();
                s.j(factory2);
                Intrinsics.checkNotNullParameter(converterFactory2, "converterFactory");
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Object objCreate2 = ik0.b.a(factory2, null, null, converterFactory2, null, 27).create(DeFiSwapSubmitService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                DeFiSwapSubmitService deFiSwapSubmitService2 = (DeFiSwapSubmitService) objCreate2;
                s.k(deFiSwapSubmitService2);
                return deFiSwapSubmitService2;
            case 6:
                return new o36.b((CeFiToDeFiAssetsService) eVar.A.get(), (j) eVar.v.get(), (ue0.c) eVar.f251179w.get());
            case 7:
                ek.a converterFactory3 = ((nj0.d) aVar2).d();
                ik0.b factory3 = ((nj0.d) aVar2).m();
                s.j(factory3);
                Intrinsics.checkNotNullParameter(converterFactory3, "converterFactory");
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Object objCreate3 = ik0.b.a(factory3, null, null, converterFactory3, null, 27).create(CeFiToDeFiAssetsService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate3, "create(...)");
                CeFiToDeFiAssetsService ceFiToDeFiAssetsService = (CeFiToDeFiAssetsService) objCreate3;
                s.k(ceFiToDeFiAssetsService);
                return ceFiToDeFiAssetsService;
            default:
                throw new AssertionError(i);
        }
    }
}
