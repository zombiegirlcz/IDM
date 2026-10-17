package c5a;

import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.Rev10ChatTransferScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class g1 extends gim.i implements Function2 {
    public final /* synthetic */ Rev10ChatTransferScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(Rev10ChatTransferScreen rev10ChatTransferScreen, Continuation continuation) {
        super(2, continuation);
        this.u = rev10ChatTransferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g1(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g1) create((SearchButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar = (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) this.u.d();
        fVar.getClass();
        fVar.l2(new l0(fVar, null, 4), new yi5.b(26));
        return Unit.f186387a;
    }
}
