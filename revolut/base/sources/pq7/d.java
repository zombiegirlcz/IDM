package pq7;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.smart_driving.SmartDrivingScreen;
import java.util.NoSuchElementException;
import kl7.j0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SmartDrivingScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SmartDrivingScreen smartDrivingScreen, Continuation continuation) {
        super(2, continuation);
        this.v = smartDrivingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        g6 g6Var = (g6) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarH3 = this.v.T2();
        String listId = g6Var.f54200b.f52342a;
        String tabId = g6Var.f54199a;
        p pVar = (p) jVarH3;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        if (Intrinsics.f(listId, "DRIVING_SCORE_HISTORY_TAB")) {
            for (j0 j0Var : j0.values()) {
                if (Intrinsics.f(j0Var.getCode(), tabId)) {
                    j2 j2Var = pVar.f238703t;
                    j2Var.getClass();
                    j2Var.g(null, j0Var);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        return Unit.f186387a;
    }
}
