package e50;

import com.revolut.chat.ui.inbox.InboxScreen;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InboxScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InboxScreen inboxScreen, Continuation continuation) {
        super(2, continuation);
        this.v = inboxScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((ProgressStepVerticalV2Delegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProgressStepVerticalV2Delegate.Model model = (ProgressStepVerticalV2Delegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        u uVar = (u) mVarE3;
        uVar.I2(model.f53016n, model.f53008a);
        return Unit.f186387a;
    }
}
