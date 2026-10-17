package p76;

import com.revolut.feature.derivatives.data.impl.network.service.DerivativesBalanceService;
import com.revolut.feature.derivatives.data.impl.network.service.DerivativesTransferService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ne0.j;
import retrofit2.Retrofit;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f233559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f233560b;

    public a(b bVar, int i) {
        this.f233559a = bVar;
        this.f233560b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f233559a;
        nj0.a aVar = bVar.f233561a;
        ee0.a aVar2 = bVar.f233562b;
        int i = this.f233560b;
        if (i == 0) {
            DerivativesBalanceService derivativesBalanceService = (DerivativesBalanceService) bVar.i.get();
            j jVar = (j) bVar.f233566j.get();
            ue0.c cVar = (ue0.c) bVar.k.get();
            CoroutineScope coroutineScopeA = bVar.d.a();
            s.j(coroutineScopeA);
            return new s76.b(derivativesBalanceService, jVar, cVar, coroutineScopeA);
        }
        if (i == 1) {
            Retrofit retrofit = (Retrofit) bVar.f233565h.get();
            d.Companion.getClass();
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Object objCreate = retrofit.create(DerivativesBalanceService.class);
            Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
            DerivativesBalanceService derivativesBalanceService2 = (DerivativesBalanceService) objCreate;
            s.k(derivativesBalanceService2);
            return derivativesBalanceService2;
        }
        if (i == 2) {
            ik0.b retrofitFactory = ((nj0.d) aVar).m();
            s.j(retrofitFactory);
            ek.a converterFactory = ((nj0.d) aVar).d();
            d.Companion.getClass();
            Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
            Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
            Retrofit retrofitA = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27);
            s.k(retrofitA);
            return retrofitA;
        }
        if (i == 3) {
            return new ne0.d();
        }
        if (i != 4) {
            if (i != 5) {
                throw new AssertionError(i);
            }
            Retrofit retrofit3 = (Retrofit) bVar.f233565h.get();
            d.Companion.getClass();
            Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
            Object objCreate2 = retrofit3.create(DerivativesTransferService.class);
            Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
            DerivativesTransferService derivativesTransferService = (DerivativesTransferService) objCreate2;
            s.k(derivativesTransferService);
            return derivativesTransferService;
        }
        je0.d mapper = aVar2.d();
        s.j(mapper);
        yk0.a databaseSessionProvider = bVar.f233563c.b();
        s.j(databaseSessionProvider);
        xe0.f fVarF = aVar2.f();
        s.j(fVarF);
        f.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        return xe0.f.f(fVarF, databaseSessionProvider, "derivatives_balance_storage", mapper, 3, v.k(v0.a.c(fVarF, "storageFactory", 1, 2), new exa.a(2, 3, 5)), 32);
    }
}
