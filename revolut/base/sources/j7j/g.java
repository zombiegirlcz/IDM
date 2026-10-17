package j7j;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.order_type_selection.CommodityOrderTypeSelectionScreen;
import iz1.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CommodityOrderTypeSelectionScreen f171929w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CommodityOrderTypeSelectionScreen commodityOrderTypeSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.f171929w = commodityOrderTypeSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.f171929w, continuation);
        gVar.v = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            Object obj3 = model.u;
            if (obj3 instanceof b) {
                k kVar = (k) this.f171929w.R.getValue();
                this.v = null;
                this.u = 1;
                kVar.getClass();
                kVar.n2(new p(kVar, (b) obj3, null, 18), new whi.b(6));
                if (Unit.f186387a == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
