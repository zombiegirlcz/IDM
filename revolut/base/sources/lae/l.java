package lae;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ RowDelegate.Model v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f193375w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(RowDelegate.Model model, n nVar, Continuation continuation) {
        super(2, continuation);
        this.v = model;
        this.f193375w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.v, this.f193375w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        n nVar = this.f193375w;
        if (i == 0) {
            yhm.o.b(obj2);
            Object obj3 = this.v.u;
            qua.p pVar = obj3 instanceof qua.p ? (qua.p) obj3 : null;
            if (pVar != null) {
                d0 d0VarC = ((rae.c) nVar.f193379s).c(pVar, false);
                this.u = 1;
                obj2 = nim.a.b(d0VarC, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            }
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yhm.o.b(obj2);
        NaviCommand naviCommand = (NaviCommand) obj2;
        Intrinsics.h(naviCommand);
        nVar.C1(new BridgeDestination(naviCommand));
        return Unit.f186387a;
    }
}
