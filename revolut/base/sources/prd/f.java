package prd;

import aw0.n6;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AdjustAssetValueController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(AdjustAssetValueController adjustAssetValueController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = adjustAssetValueController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            case 1:
                return new f(this.v, continuation, 1);
            default:
                return new f(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AdjustAssetValueController adjustAssetValueController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                adjustAssetValueController.e3().B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVarE3 = adjustAssetValueController.e3();
                iVarE3.getClass();
                iVarE3.l2(new h(iVarE3, null), new yi5.b(26));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVarE32 = adjustAssetValueController.e3();
                iVarE32.getClass();
                iVarE32.l2(new g(iVarE32, null), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
