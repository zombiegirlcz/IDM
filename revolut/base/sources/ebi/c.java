package ebi;

import com.revolut.feature_retail_user_declarations.email_verification.otp_bottomsheet.EmailVerificationOtpBottomSheet;
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
    public final /* synthetic */ EmailVerificationOtpBottomSheet f124365w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(EmailVerificationOtpBottomSheet emailVerificationOtpBottomSheet, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f124365w = emailVerificationOtpBottomSheet;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f124365w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f124365w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((qx0.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EmailVerificationOtpBottomSheet emailVerificationOtpBottomSheet = this.f124365w;
        switch (i) {
            case 0:
                qx0.c cVar = (qx0.c) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                String code = cVar.f249975a;
                j jVar = (j) emailVerificationOtpBottomSheet.m3();
                jVar.getClass();
                Intrinsics.checkNotNullParameter(code, "code");
                jVar.J2(code, true);
                break;
            default:
                ty0.a aVar2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((j) emailVerificationOtpBottomSheet.m3()).I2(aVar2.f275445a);
                break;
        }
        return Unit.f186387a;
    }
}
