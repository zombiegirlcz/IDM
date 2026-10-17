package grd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.SmartEstimationAccess;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d f146018w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f146018w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                v vVar = new v(this.f146018w, continuation, 0);
                vVar.v = obj2;
                return vVar;
            default:
                v vVar2 = new v(this.f146018w, continuation, 1);
                vVar2.v = obj2;
                return vVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Pair pair = (Pair) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((v) create(pair, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d dVar = this.f146018w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.f87925x, new u((Set) pair.f186385a, (Set) pair.f186386b, 0));
                break;
            default:
                Pair pair2 = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Pair pair3 = (Pair) pair2.f186385a;
                dVar.H2(dVar.f87925x, new w((SmartEstimationAccess) pair2.f186386b, (Set) pair3.f186385a, (Set) pair3.f186386b, 0));
                break;
        }
        return Unit.f186387a;
    }
}
