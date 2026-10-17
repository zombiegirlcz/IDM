package hsg;

import com.revolut.feature.voluntary.offboarding.impl.ui.account_not_closing.AccountNotClosingViewController;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExternalAppDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AccountNotClosingViewController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(AccountNotClosingViewController accountNotClosingViewController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = accountNotClosingViewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            default:
                return new e(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActivityNavigateCommand activityNavigateCommandA;
        int i = this.u;
        AccountNotClosingViewController accountNotClosingViewController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((b) accountNotClosingViewController.M.getValue()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((b) accountNotClosingViewController.M.getValue()).B2();
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                b bVar = (b) accountNotClosingViewController.M.getValue();
                if (bVar.o.a("com.revolut.revolut")) {
                    activityNavigateCommandA = new ActivityNavigateCommand(new ExternalAppDestination("com.revolut.revolut"), null, null, null, 268435456, null, null, null, null, false, 1006);
                } else {
                    rqi.c cVar = bVar.f155042p;
                    cVar.getClass();
                    activityNavigateCommandA = cVar.a("com.revolut.revolut", gh0.d.GOOGLE);
                }
                bVar.C1(new BridgeDestination(activityNavigateCommandA));
                bVar.B2();
                break;
        }
        return Unit.f186387a;
    }
}
