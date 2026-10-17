package t44;

import cli.y;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.selection.CreditAddressSelectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CreditAddressSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CreditAddressSelectionScreen creditAddressSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = creditAddressSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.R2();
        Intrinsics.h(model);
        p pVar = (p) jVarE3;
        y yVar = pVar.f267891r;
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53304a, "id_my_address_not_here")) {
            pVar.H2(yVar, new t3b.g(9));
        } else {
            Object obj3 = model.k;
            hv3.a aVar2 = obj3 instanceof hv3.a ? (hv3.a) obj3 : null;
            if (aVar2 != null) {
                pVar.H2(yVar, new sx8.a(aVar2, 23));
            }
        }
        return Unit.f186387a;
    }
}
