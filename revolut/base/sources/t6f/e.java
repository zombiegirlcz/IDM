package t6f;

import com.revolut.feature.trading.managed_portfolios.impl.ui.details.info.ManagedPortfolioDetailsAboutInfoExtensionContract$Action$ButtonClicked;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mx0.q5;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f268330w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f268330w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f268330w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f268330w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((q5) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((ManagedPortfolioDetailsAboutInfoExtensionContract$Action$ButtonClicked) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        f fVar = this.f268330w;
        switch (i) {
            case 0:
                q5 q5Var = (q5) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object obj3 = q5Var.d;
                String url2 = obj3 instanceof String ? (String) obj3 : null;
                if (url2 != null) {
                    o oVar = (o) fVar.f268331g;
                    oVar.getClass();
                    Intrinsics.checkNotNullParameter(url2, "url");
                    oVar.A2(new ExternalDestination.Browser(url2, null));
                }
                break;
            default:
                ManagedPortfolioDetailsAboutInfoExtensionContract$Action$ButtonClicked managedPortfolioDetailsAboutInfoExtensionContract$Action$ButtonClicked = (ManagedPortfolioDetailsAboutInfoExtensionContract$Action$ButtonClicked) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.f.V1(managedPortfolioDetailsAboutInfoExtensionContract$Action$ButtonClicked.f91318a);
                break;
        }
        return Unit.f186387a;
    }
}
