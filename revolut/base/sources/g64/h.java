package g64;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a aVar2 = this.v;
        j60.a.v(aVar2.f67205r, false, new g53.e(2), 1);
        String str = model.f52613a;
        Continuation continuation = null;
        if (Intrinsics.f(str, "id_cancel_button_confirm")) {
            aVar2.l2(new f(aVar2, continuation, 3), new c(0));
        } else if (!Intrinsics.f(str, "id_cancel_button_dismiss")) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "CardOrderingFlowModel", j6.a.q("Unused listId = ", model.f52613a), null, h0Var);
        }
        return Unit.f186387a;
    }
}
