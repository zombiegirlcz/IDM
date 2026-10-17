package e6d;

import com.revolut.feature.shared.autoinvest.impl.network.PortfolioAutoInvestService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zjh.f f122989w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f122990x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f122991y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(zjh.f fVar, String str, int i, Continuation continuation, int i2) {
        super(2, continuation);
        this.u = i2;
        this.f122989w = fVar;
        this.f122990x = str;
        this.f122991y = i;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.f122989w, this.f122990x, this.f122991y, continuation, 0);
            default:
                return new s(this.f122989w, this.f122990x, this.f122991y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    PortfolioAutoInvestService portfolioAutoInvestService = (PortfolioAutoInvestService) this.f122989w.f322835b;
                    d6d.i iVar = new d6d.i(null, new Integer(this.f122991y));
                    this.v = 1;
                    if (portfolioAutoInvestService.createSpareChange(this.f122990x, iVar, this) == aVar) {
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
                    PortfolioAutoInvestService portfolioAutoInvestService2 = (PortfolioAutoInvestService) this.f122989w.f322835b;
                    d6d.i iVar2 = new d6d.i(Boolean.TRUE, new Integer(this.f122991y));
                    this.v = 1;
                    if (portfolioAutoInvestService2.updateSpareChange(this.f122990x, iVar2, this) == aVar2) {
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
