package v9f;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.instruments_list.InstrumentsListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InstrumentsListScreen f287030w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InstrumentsListScreen instrumentsListScreen, Continuation continuation) {
        super(2, continuation);
        this.f287030w = instrumentsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.f287030w, continuation);
        dVar.v = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            j jVarE3 = this.f287030w.d();
            Intrinsics.h(model);
            this.v = null;
            this.u = 1;
            p pVar = (p) jVarE3;
            pVar.getClass();
            if (pu7.a.B(pVar.k, "BrokerSelectionScreenModel_ActionClick", new o(model, pVar, null), this) == aVar) {
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
