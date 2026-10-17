package x6f;

import com.revolut.feature.robo.api.model.Benchmark;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.managed_portfolio_benchmark.ManagedPortfolioBenchmarkScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.managed_portfolio_benchmark.ManagedPortfolioBenchmarkScreenContract$BenchmarkDetailsInputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.managed_portfolio_benchmark.ManagedPortfolioBenchmarkScreenContract$ModalStep;
import com.revolut.feature.wealth.models.robo.BenchmarkInfo;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ManagedPortfolioBenchmarkScreen f303088w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(ManagedPortfolioBenchmarkScreen managedPortfolioBenchmarkScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f303088w = managedPortfolioBenchmarkScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f303088w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f303088w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((Benchmark) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ManagedPortfolioBenchmarkScreen managedPortfolioBenchmarkScreen = this.f303088w;
        switch (i) {
            case 0:
                Benchmark benchmark = (Benchmark) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                managedPortfolioBenchmarkScreen.c3(new h(benchmark != null ? new BenchmarkInfo(benchmark.e, benchmark.d) : null));
                break;
            default:
                ty0.a aVar2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Object obj3 = aVar2.d;
                ManagedPortfolioBenchmarkScreenContract$BenchmarkDetailsInputData parcel = obj3 instanceof ManagedPortfolioBenchmarkScreenContract$BenchmarkDetailsInputData ? (ManagedPortfolioBenchmarkScreenContract$BenchmarkDetailsInputData) obj3 : null;
                if (parcel != null) {
                    com.revolut.feature.trading.managed_portfolios.impl.ui.details.managed_portfolio_benchmark.a aVar4 = (com.revolut.feature.trading.managed_portfolios.impl.ui.details.managed_portfolio_benchmark.a) ((i) managedPortfolioBenchmarkScreen.R.getValue());
                    aVar4.getClass();
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    oki.h.v2(aVar4.f91332r, new ManagedPortfolioBenchmarkScreenContract$ModalStep.BenchmarkDescription(parcel), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
