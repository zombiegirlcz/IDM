package bs9;

import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.payments.groups.impl.ui_chat.chat.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f0 f0Var = new f0(this.v, continuation);
        f0Var.u = obj2;
        return f0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f0) create((ChatItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ChatItem chatItem = (ChatItem) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        fu9.c cVar = fu9.c.f138150a;
        com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar2 = this.v;
        ViewController viewControllerE1 = aVar2.e1(cVar);
        bnj.n block = new bnj.n(aVar2, chatItem, 17);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerE1.H = block;
        yji.l.j2(aVar2, viewControllerE1, ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        return Unit.f186387a;
    }
}
