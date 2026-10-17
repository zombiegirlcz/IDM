package rk3;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.confirmation_code.ui.otp.ESignOtpScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ ESignOtpScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ESignOtpScreen eSignOtpScreen, Continuation continuation) {
        super(2, continuation);
        this.u = eSignOtpScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((TextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.confirmation_code.ui.otp.a aVar2 = (com.revolut.feature.confirmation_code.ui.otp.a) this.u.R2();
        aVar2.getClass();
        aVar2.l2(new mt8.b(aVar2, true, null, 8), new yi5.b(26));
        return Unit.f186387a;
    }
}
