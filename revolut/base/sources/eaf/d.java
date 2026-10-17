package eaf;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.broker_selection.BrokerSelectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BrokerSelectionScreen f124228w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BrokerSelectionScreen brokerSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.f124228w = brokerSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.f124228w, continuation);
        dVar.v = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.v;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            k kVar = (k) this.f124228w.Q.getValue();
            Intrinsics.h(model);
            this.v = null;
            this.u = 1;
            q qVar = (q) kVar;
            qVar.getClass();
            Object objB = pu7.a.B(qVar.k, "BrokerSelectionScreenModel_onFullScreenActionClicked", new o(model, qVar, null), this);
            if (objB != obj3) {
                objB = Unit.f186387a;
            }
            if (objB == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
