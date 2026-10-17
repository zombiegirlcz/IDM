package t72;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.apm.multibanco.impl.ui.enrollment.card.MultibancoExternalEnrollmentCardScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ MultibancoExternalEnrollmentCardScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(MultibancoExternalEnrollmentCardScreen multibancoExternalEnrollmentCardScreen, Continuation continuation) {
        super(2, continuation);
        this.u = multibancoExternalEnrollmentCardScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((m) this.u.M.getValue()).C2(i.f268416a);
        return Unit.f186387a;
    }
}
