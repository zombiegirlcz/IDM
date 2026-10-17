package sxd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.standingordertopup.impl.ui.screen.edit_order.EditTopUpOrderScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import sxd.h;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ EditTopUpOrderScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EditTopUpOrderScreen editTopUpOrderScreen, Continuation continuation) {
        super(2, continuation);
        this.u = editTopUpOrderScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((z) this.u.R2()).C2(h.a.f266429a);
        return Unit.f186387a;
    }
}
