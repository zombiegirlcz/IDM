package vd0;

import com.revolut.core.currency.impl.services.CurrenciesConfigService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj0.a f287767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l70.e f287768b;

    public g(nj0.a aVar, l70.e eVar, sd0.e eVar2) {
        this.f287767a = aVar;
        this.f287768b = eVar;
    }

    public final zq.a a() {
        Retrofit retrofit = ((nj0.d) this.f287767a).f();
        k.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(CurrenciesConfigService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        CurrenciesConfigService currenciesConfigService = (CurrenciesConfigService) objCreate;
        s.k(currenciesConfigService);
        b9b.a aVar = new b9b.a();
        l70.e eVar = this.f287768b;
        z70.a contextProvider = eVar.f();
        s.j(contextProvider);
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        c90.c cVar = new c90.c(contextProvider.getContext());
        qd0.b bVarN = eVar.n();
        s.j(bVarN);
        return new zq.a(currenciesConfigService, aVar, new ae0.b(cVar, new ae0.d(bVarN)));
    }
}
