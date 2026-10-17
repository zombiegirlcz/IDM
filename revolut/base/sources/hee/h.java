package hee;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.support.impl.transfer_tracker.ui.input_form.TransferTrackerInputFormScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ TransferTrackerInputFormScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TransferTrackerInputFormScreen transferTrackerInputFormScreen, Continuation continuation) {
        super(2, continuation);
        this.u = transferTrackerInputFormScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j60.a.v(((com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b) this.u.R2()).f89421s, false, null, 3);
        return Unit.f186387a;
    }
}
