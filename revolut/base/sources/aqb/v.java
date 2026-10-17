package aqb;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FinishFragmentNavigateCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f8303w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.a aVar, p pVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = aVar;
        this.f8303w = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v(this.v, this.f8303w, continuation, 0);
            default:
                return new v(this.v, this.f8303w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((v) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        p pVar = this.f8303w;
        com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.a aVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pcd.s sVarY2 = com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.a.y2(aVar, ((m) pVar).f8292a);
                j60.a.v(aVar.f83395q, false, null, 3);
                NaviCommand naviCommandF = ((hob.d) aVar.f83396r).f(sVarY2, null);
                if (naviCommandF != null) {
                    return aVar.C1(new BridgeDestination(new CompositeCommand(new FinishFragmentNavigateCommand(0), naviCommandF)));
                }
                return null;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pcd.s sVarY22 = com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.a.y2(aVar, ((l) pVar).f8291a);
                j60.a.v(aVar.f83395q, false, null, 3);
                NaviCommand naviCommandD = ((hob.d) aVar.f83396r).d(sVarY22, null);
                if (naviCommandD != null) {
                    return aVar.C1(new BridgeDestination(new CompositeCommand(new FinishFragmentNavigateCommand(0), naviCommandD)));
                }
                return null;
        }
    }
}
