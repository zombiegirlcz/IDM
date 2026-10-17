package gh1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.add_card_to_google_pay_shared.impl.R$string;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.single.GooglePayOtpVerificationController;
import gh1.l;
import ha3.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ GooglePayOtpVerificationController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(GooglePayOtpVerificationController googlePayOtpVerificationController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = googlePayOtpVerificationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        GooglePayOtpVerificationController googlePayOtpVerificationController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                googlePayOtpVerificationController.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVar = (i) ((j) googlePayOtpVerificationController.P.getValue());
                iVar.f143821q.a(null, ((k) ((j2) iVar.f143823s.f22677a).getValue()).f143825b.f65546c, false);
                if (!c70.a.g()) {
                    r70.c.b(iVar.f143822r, 3);
                    iVar.X1(new mii.k("TOAST_DIALOG_ID", new TextLocalisedClause(R$string.google_pay_verification_toast_title, null, null, 14), null, null, null, 28));
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVar2 = (i) ((j) googlePayOtpVerificationController.P.getValue());
                ((x) ((l93.f) iVar2.o.f182069b)).f.e();
                iVar2.C2(l.a.f143827a);
                break;
        }
        return Unit.f186387a;
    }
}
