package g56;

import com.revolut.feature.defi.remittances.impl.data.network.DeFiRemittancesService;
import com.revolut.feature.defi.remittances.impl.data.network.DeFiSendSubmitService;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.converter.gson.GsonConverterFactory;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f140632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f140633b;

    public c(d dVar, int i) {
        this.f140632a = dVar;
        this.f140633b = i;
    }

    @Override // phm.a
    public final Object get() {
        d dVar = this.f140632a;
        ee0.a aVar = dVar.f140634a;
        nj0.a aVar2 = dVar.f140637g;
        int i = this.f140633b;
        if (i == 0) {
            return new ne0.d();
        }
        if (i == 1) {
            je0.d mapper = aVar.d();
            s.j(mapper);
            yk0.a databaseSessionProvider = dVar.f140635b.b();
            s.j(databaseSessionProvider);
            xe0.f storageFactory = aVar.f();
            s.j(storageFactory);
            b56.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
            Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
            return xe0.f.c(storageFactory, databaseSessionProvider, "defi_remittances", mapper, 1, 16);
        }
        if (i == 2) {
            DeFiRemittancesService deFiRemittancesService = (DeFiRemittancesService) dVar.f140647t.get();
            DeFiSendSubmitService deFiSendSubmitService = (DeFiSendSubmitService) dVar.u.get();
            x26.a aVar3 = (x26.a) dVar.f140638h.f318973a.get();
            s.j(aVar3);
            CoroutineScope coroutineScopeA = dVar.i.a();
            s.j(coroutineScopeA);
            return new e56.c(deFiRemittancesService, deFiSendSubmitService, aVar3, coroutineScopeA);
        }
        if (i == 3) {
            ek.a converterFactory = ((nj0.d) aVar2).d();
            ik0.b factory = ((nj0.d) aVar2).m();
            s.j(factory);
            Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Object objCreate = ik0.b.a(factory, null, null, converterFactory, null, 27).create(DeFiRemittancesService.class);
            Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
            DeFiRemittancesService deFiRemittancesService2 = (DeFiRemittancesService) objCreate;
            s.k(deFiRemittancesService2);
            return deFiRemittancesService2;
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        o gson = fe0.c.a();
        Intrinsics.checkNotNullParameter(gson, "gson");
        GsonConverterFactory converterFactory2 = GsonConverterFactory.create(gson);
        Intrinsics.checkNotNullExpressionValue(converterFactory2, "create(...)");
        s.k(converterFactory2);
        ik0.b factory2 = ((nj0.d) aVar2).m();
        s.j(factory2);
        Intrinsics.checkNotNullParameter(converterFactory2, "converterFactory");
        Intrinsics.checkNotNullParameter(factory2, "factory");
        Object objCreate2 = ik0.b.a(factory2, null, null, converterFactory2, null, 27).create(DeFiSendSubmitService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
        DeFiSendSubmitService deFiSendSubmitService2 = (DeFiSendSubmitService) objCreate2;
        s.k(deFiSendSubmitService2);
        return deFiSendSubmitService2;
    }
}
