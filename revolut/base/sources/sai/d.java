package sai;

import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.feature_retail_user_declarations.email.otp_screen.EmailVerificationOtpScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EmailVerificationOtpScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EmailVerificationOtpScreen emailVerificationOtpScreen, Continuation continuation) {
        super(2, continuation);
        this.v = emailVerificationOtpScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((LabelButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LabelButtonDelegate.Model model = (LabelButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((k) this.v.R2()).J2(model.f52603a);
        return Unit.f186387a;
    }
}
