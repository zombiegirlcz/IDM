package d7j;

import aw0.n6;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreen;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CommodityOrderEditScreen f112037w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(CommodityOrderEditScreen commodityOrderEditScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f112037w = commodityOrderEditScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(this.f112037w, continuation, 0);
                pVar.v = obj2;
                return pVar;
            case 1:
                p pVar2 = new p(this.f112037w, continuation, 1);
                pVar2.v = obj2;
                return pVar2;
            default:
                p pVar3 = new p(this.f112037w, continuation, 2);
                pVar3.v = obj2;
                return pVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((p) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((p) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((p) create((d01.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CommodityOrderEditScreen commodityOrderEditScreen = this.f112037w;
        switch (i) {
            case 0:
                n6 n6Var = (n6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object obj3 = n6Var.k;
                Continuation continuation = null;
                if (Intrinsics.f(obj3, j.f112010a)) {
                    com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g) commodityOrderEditScreen.R2();
                    gVar.getClass();
                    gVar.n2(new j1(4, gVar, continuation), new whi.b(6));
                } else if (Intrinsics.f(obj3, i.f112005a)) {
                    com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar2 = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g) commodityOrderEditScreen.R2();
                    gVar2.getClass();
                    gVar2.n2(new j1(2, gVar2, continuation), new whi.b(6));
                }
                break;
            case 1:
                y yVar = (y) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0 h0VarF3 = commodityOrderEditScreen.R2();
                List reloadCommands = yVar.f112078a;
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar3 = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g) h0VarF3;
                gVar3.getClass();
                Intrinsics.checkNotNullParameter(reloadCommands, "reloadCommands");
                Iterator it8 = reloadCommands.iterator();
                while (it8.hasNext()) {
                    gVar3.Q.b((g0) it8.next());
                }
                break;
            default:
                d01.b bVar = (d01.b) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0 h0VarF32 = commodityOrderEditScreen.R2();
                String suggestionId = bVar.f110277a;
                Object obj4 = bVar.f110279c;
                Continuation continuation2 = null;
                f7j.l lVar = obj4 instanceof f7j.l ? (f7j.l) obj4 : null;
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar4 = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g) h0VarF32;
                gVar4.getClass();
                Intrinsics.checkNotNullParameter(suggestionId, "suggestionId");
                gVar4.n2(new cuc.c(gVar4, lVar, suggestionId, continuation2, 20), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
