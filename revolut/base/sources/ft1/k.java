package ft1;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.apm.bizum.impl.ui.registration.terms_old.BizumRegistrationTermsOldScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ BizumRegistrationTermsOldScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(BizumRegistrationTermsOldScreen bizumRegistrationTermsOldScreen, Continuation continuation) {
        super(2, continuation);
        this.u = bizumRegistrationTermsOldScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        m mVar = (m) ((e) this.u.Z.getValue());
        mVar.getClass();
        mVar.x2(new fs2.k(mVar, 3));
        return Unit.f186387a;
    }
}
