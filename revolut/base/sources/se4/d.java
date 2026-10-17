package se4;

import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.otp.OtpScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ OtpScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(OtpScreen otpScreen, Continuation continuation) {
        super(2, continuation);
        this.u = otpScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CounterTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((o) this.u.O.getValue()).J2(f.f262103a);
        return Unit.f186387a;
    }
}
