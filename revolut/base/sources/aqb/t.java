package aqb;

import com.revolut.feature.retail.savings.api.navigation.providers.SavingsNavigationProvider$TopUpConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FinishFragmentNavigateCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.a f8299w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f8300x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.a aVar, p pVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f8299w = aVar;
        this.f8300x = pVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.f8299w, this.f8300x, continuation, 0);
            default:
                return new t(this.f8299w, this.f8300x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((t) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        Object objB2;
        int i = this.u;
        p pVar = this.f8300x;
        com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.a aVar = this.f8299w;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    n nVar = (n) pVar;
                    pcd.s sVarY2 = com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.a.y2(aVar, nVar.f8293a);
                    j60.a.v(aVar.f83395q, false, null, 3);
                    ufm.b bVarG = ((hob.d) aVar.f83396r).g(new SavingsNavigationProvider$TopUpConfig(sVarY2, sVarY2.e(), nVar.f8294b, false, false, false, 504));
                    this.v = 1;
                    objB = nim.a.b(bVarG, this);
                    if (objB == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                NaviCommand naviCommand = (NaviCommand) objB;
                FinishFragmentNavigateCommand finishFragmentNavigateCommand = new FinishFragmentNavigateCommand(0);
                Intrinsics.h(naviCommand);
                return aVar.C1(new BridgeDestination(new CompositeCommand(finishFragmentNavigateCommand, naviCommand)));
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    pcd.s sVarY22 = com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.a.y2(aVar, ((o) pVar).f8295a);
                    j60.a.v(aVar.f83395q, false, null, 3);
                    ufm.i iVarH = ((hob.d) aVar.f83396r).h(sVarY22);
                    this.v = 1;
                    objB2 = nim.a.b(iVarH, this);
                    if (objB2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB2 = obj2;
                }
                NaviCommand naviCommand2 = (NaviCommand) objB2;
                FinishFragmentNavigateCommand finishFragmentNavigateCommand2 = new FinishFragmentNavigateCommand(0);
                Intrinsics.h(naviCommand2);
                return aVar.C1(new BridgeDestination(new CompositeCommand(finishFragmentNavigateCommand2, naviCommand2)));
        }
    }
}
