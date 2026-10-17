package n23;

import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab.OrderNewCardTabController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mpd.p;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ OrderNewCardTabController f211432w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(OrderNewCardTabController orderNewCardTabController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f211432w = orderNewCardTabController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f211432w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f211432w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ty0.a aVar = (ty0.a) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(aVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        OrderNewCardTabController orderNewCardTabController = this.f211432w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVarE3 = orderNewCardTabController.e3();
                Intrinsics.h(clickData);
                kVarE3.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                kVarE3.A1(new p(kVarE3, clickData, null, 24), new yi5.b(25));
                break;
            default:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVarE32 = orderNewCardTabController.e3();
                Intrinsics.h(clickData2);
                kVarE32.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                kVarE32.A1(new p(kVarE32, clickData2, null, 24), new yi5.b(25));
                break;
        }
        return Unit.f186387a;
    }
}
