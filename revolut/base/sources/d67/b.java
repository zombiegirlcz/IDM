package d67;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.full_screen_prompt.c;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ FullScreenPromptScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FullScreenPromptScreen fullScreenPromptScreen, Continuation continuation) {
        super(2, continuation);
        this.u = fullScreenPromptScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((PromptContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.full_screen_prompt.e) this.u.R2()).C2(c.C0497c.f74506a);
        return Unit.f186387a;
    }
}
