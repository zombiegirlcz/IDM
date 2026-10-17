package hbf;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.TransferProgressScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransferProgressScreen f150663w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TransferProgressScreen transferProgressScreen, Continuation continuation) {
        super(2, continuation);
        this.f150663w = transferProgressScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.f150663w, continuation);
        eVar.v = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.v;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            n nVarE3 = this.f150663w.R2();
            Intrinsics.h(model);
            this.v = null;
            this.u = 1;
            com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.a aVar = (com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.a) nVarE3;
            aVar.getClass();
            Object objB = pu7.a.B(aVar.k, "TransferProgressScreenModel_onFullScreenActionClicked", new x(model, aVar, null), this);
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
