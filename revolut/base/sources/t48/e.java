package t48;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.joint.impl.ui.consent.ConsentScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ ConsentScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ConsentScreen consentScreen, Continuation continuation) {
        super(2, continuation);
        this.u = consentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        y yVar = (y) this.u.T2();
        yVar.v2(new m(((i) yVar.t2()).f267919b));
        return Unit.f186387a;
    }
}
