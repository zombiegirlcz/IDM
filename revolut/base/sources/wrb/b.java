package wrb;

import aw0.n6;
import com.revolut.feature.retail.trading.advanced.charts.impl.screen.closeinvestments.stock.StockSellAllController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ StockSellAllController f299535w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(StockSellAllController stockSellAllController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f299535w = stockSellAllController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f299535w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            default:
                b bVar2 = new b(this.f299535w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        StockSellAllController stockSellAllController = this.f299535w;
        switch (i) {
            case 0:
                n6 n6Var = (n6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((h) stockSellAllController.R.getValue()).I2(n6Var);
                break;
            default:
                n6 n6Var2 = (n6) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((h) stockSellAllController.R.getValue()).I2(n6Var2);
                break;
        }
        return Unit.f186387a;
    }
}
