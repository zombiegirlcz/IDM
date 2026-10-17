package e6d;

import com.revolut.feature.shared.autoinvest.impl.network.PortfolioAutoInvestService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zjh.f f122992w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f122993x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i, String str, Continuation continuation, zjh.f fVar) {
        super(2, continuation);
        this.u = i;
        this.f122992w = fVar;
        this.f122993x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(0, this.f122993x, continuation, this.f122992w);
            default:
                return new t(1, this.f122993x, continuation, this.f122992w);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    PortfolioAutoInvestService portfolioAutoInvestService = (PortfolioAutoInvestService) this.f122992w.f322835b;
                    d6d.i iVar = new d6d.i(Boolean.FALSE, null);
                    this.v = 1;
                    if (portfolioAutoInvestService.updateSpareChange(this.f122993x, iVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    PortfolioAutoInvestService portfolioAutoInvestService2 = (PortfolioAutoInvestService) this.f122992w.f322835b;
                    d6d.h hVar = new d6d.h();
                    this.v = 1;
                    if (portfolioAutoInvestService2.migrateSpareChange(this.f122993x, hVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
