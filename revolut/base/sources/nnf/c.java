package nnf;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.transactions.impl.ui.pending.screen.PendingTransactionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n8a.r;
import tof.a3;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PendingTransactionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PendingTransactionScreen pendingTransactionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pendingTransactionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.Y.getValue();
        Intrinsics.h(model);
        l lVar = (l) fVar;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52613a, "ID_REVERT_BUTTON")) {
            a3 a3Var = (a3) ((d) lVar.t2()).f217615a.getContent();
            if (a3Var == null) {
                throw new IllegalStateException("When clicking on button with id ID_REVERT_BUTTON state should already contain Transaction");
            }
            lVar.n2(new r(lVar, a3Var.k, a3Var.f272581b, (Continuation) null), new whi.b(6));
        } else {
            j60.a.v(lVar.f217626s, false, null, 3);
        }
        return Unit.f186387a;
    }
}
