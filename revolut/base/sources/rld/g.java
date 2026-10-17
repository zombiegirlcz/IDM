package rld;

import aii.q;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.slot_manager.impl.ui.screen.prompt.SlotManagerPromptController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ SlotManagerPromptController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SlotManagerPromptController slotManagerPromptController, Continuation continuation) {
        super(2, continuation);
        this.u = slotManagerPromptController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarD3 = this.u.R2();
        mVarD3.getClass();
        mVarD3.l2(new l(mVarD3, akd.a.DISCARD, null, 1), new yi5.b(26));
        mVarD3.C2(q.f5292a);
        return Unit.f186387a;
    }
}
