package hbf;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.trading.transfer.investments.impl.navigation.internal_destinations.TransferInUpdatePurchasePriceDestination;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.TransferProgressScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransferProgressScreen f150662w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TransferProgressScreen transferProgressScreen, Continuation continuation) {
        super(2, continuation);
        this.f150662w = transferProgressScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.f150662w, continuation);
        dVar.v = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            n nVarE3 = this.f150662w.R2();
            Intrinsics.h(item);
            this.v = null;
            this.u = 1;
            com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.a aVar2 = (com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.a) nVarE3;
            aVar2.getClass();
            Object obj3 = item.f58324n;
            if (obj3 instanceof m) {
                aVar2.C1(new TransferInUpdatePurchasePriceDestination(((m) obj3).f150670a));
            }
            if (Unit.f186387a == aVar) {
                return aVar;
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
