package r74;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.MediaHeaderCreditPromptScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class d0 extends gim.i implements Function2 {
    public final /* synthetic */ MediaHeaderCreditPromptScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(MediaHeaderCreditPromptScreen mediaHeaderCreditPromptScreen, Continuation continuation) {
        super(2, continuation);
        this.u = mediaHeaderCreditPromptScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d0(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d0) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b) this.u.d()).I2();
        return Unit.f186387a;
    }
}
