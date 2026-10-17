package mj4;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting.WaitingPopupScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.IntentCommand;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ WaitingPopupScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(WaitingPopupScreen waitingPopupScreen, Continuation continuation) {
        super(2, continuation);
        this.u = waitingPopupScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) ((b) this.u.P.getValue());
        if (dVar.f205921r.f299516a.areNotificationsEnabled()) {
            j60.a.v(dVar.f205920q, false, null, 3);
        } else {
            dVar.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new IntentCommand(((s70.b) dVar.f205922s.f299515a).b(), null))));
        }
        return Unit.f186387a;
    }
}
