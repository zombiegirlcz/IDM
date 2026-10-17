package taf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.screens.new_transfer_type.NewTransferInvestmentsTypeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ NewTransferInvestmentsTypeScreen f269310w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(NewTransferInvestmentsTypeScreen newTransferInvestmentsTypeScreen, Continuation continuation) {
        super(2, continuation);
        this.f269310w = newTransferInvestmentsTypeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.f269310w, continuation);
        cVar.v = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            i iVar = (i) this.f269310w.P.getValue();
            Intrinsics.h(model);
            this.v = null;
            this.u = 1;
            l lVar = (l) iVar;
            lVar.getClass();
            if (pu7.a.B(lVar.k, "NewTransferInvestmentsTypeScreenModel_ActionClick", new k(model, lVar, null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
