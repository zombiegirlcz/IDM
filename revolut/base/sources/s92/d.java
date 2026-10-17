package s92;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.register.EnrollmentRegistrationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EnrollmentRegistrationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EnrollmentRegistrationScreen enrollmentRegistrationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = enrollmentRegistrationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVarE3 = this.v.R2();
        String text = textData.f52598b.toString();
        k kVar = (k) jVarE3;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        kVar.H2(kVar.f261098p, new a31.i(text, kVar.f261099q.f(text), 12));
        return Unit.f186387a;
    }
}
