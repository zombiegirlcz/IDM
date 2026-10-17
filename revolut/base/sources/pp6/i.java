package pp6;

import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.feature.feedback.impl.ui.screen.FeedbackController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ FeedbackController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(FeedbackController feedbackController, Continuation continuation) {
        super(2, continuation);
        this.u = feedbackController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((SmallActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVar = (k) this.u.d();
        kVar.getClass();
        kVar.n2(new j(kVar, null, 1), new whi.b(6));
        return Unit.f186387a;
    }
}
