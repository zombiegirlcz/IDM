package ksg;

import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreen$V2;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenAction;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenActionButton;
import com.revolut.feature.voluntary.offboarding.impl.ui.remove_obstacles.RemoveObstaclesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ksg.g;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ RemoveObstaclesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(RemoveObstaclesScreen removeObstaclesScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = removeObstaclesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            default:
                return new d(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        FincrimeHomeScreenActionButton fincrimeHomeScreenActionButton;
        FincrimeHomeScreenActionButton fincrimeHomeScreenActionButton2;
        int i = this.u;
        FincrimeHomeScreenAction fincrimeHomeScreenAction = null;
        RemoveObstaclesScreen removeObstaclesScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((k) removeObstaclesScreen.T2()).v2(g.b.f189458a);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar = (k) removeObstaclesScreen.T2();
                FincrimeHomeScreen$V2 fincrimeHomeScreen$V2 = (FincrimeHomeScreen$V2) ((e) kVar.t2()).f189455a.getContent();
                if (fincrimeHomeScreen$V2 != null && (fincrimeHomeScreenActionButton = fincrimeHomeScreen$V2.f) != null) {
                    fincrimeHomeScreenAction = fincrimeHomeScreenActionButton.f64148b;
                }
                kVar.y2(fincrimeHomeScreenAction);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar2 = (k) removeObstaclesScreen.T2();
                FincrimeHomeScreen$V2 fincrimeHomeScreen$V22 = (FincrimeHomeScreen$V2) ((e) kVar2.t2()).f189455a.getContent();
                if (fincrimeHomeScreen$V22 != null && (fincrimeHomeScreenActionButton2 = fincrimeHomeScreen$V22.f64130g) != null) {
                    fincrimeHomeScreenAction = fincrimeHomeScreenActionButton2.f64148b;
                }
                kVar2.y2(fincrimeHomeScreenAction);
                break;
        }
        return Unit.f186387a;
    }
}
