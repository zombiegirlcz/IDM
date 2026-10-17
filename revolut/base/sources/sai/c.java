package sai;

import com.revolut.feature_retail_user_declarations.email.otp_screen.EmailVerificationOtpScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EmailVerificationOtpScreen f261409w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(EmailVerificationOtpScreen emailVerificationOtpScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f261409w = emailVerificationOtpScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f261409w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f261409w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((qx0.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EmailVerificationOtpScreen emailVerificationOtpScreen = this.f261409w;
        switch (i) {
            case 0:
                String code = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVarE3 = emailVerificationOtpScreen.R2();
                Intrinsics.h(code);
                k kVar = (k) hVarE3;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(code, "code");
                kVar.H2(kVar.u, new rvc.k(code, 19));
                break;
            default:
                qx0.c cVar = (qx0.c) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                String code2 = cVar.f249975a;
                k kVar2 = (k) emailVerificationOtpScreen.R2();
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(code2, "code");
                kVar2.I2(new j(kVar2, code2, null, 1));
                break;
        }
        return Unit.f186387a;
    }
}
