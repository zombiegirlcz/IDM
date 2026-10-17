package hg9;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.error.FormErrorsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ FormErrorsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(FormErrorsScreen formErrorsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = formErrorsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((m) this.u.Q.getValue()).C2(j.f152123a);
        return Unit.f186387a;
    }
}
