package k4a;

import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer.NewTransferScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ NewTransferScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(NewTransferScreen newTransferScreen, Continuation continuation) {
        super(2, continuation);
        this.u = newTransferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((SearchButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVar = (u) this.u.d();
        uVar.getClass();
        uVar.l2(new ji1.m(uVar, null, 26), new yi5.b(26));
        return Unit.f186387a;
    }
}
