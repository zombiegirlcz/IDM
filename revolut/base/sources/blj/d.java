package blj;

import aw0.n6;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.EsimMobilePlanOtpNumberTransferConfirmationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.a;
import dfj.p1;
import dfj.q1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import vkm.j2;
import vkm.v1;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EsimMobilePlanOtpNumberTransferConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(EsimMobilePlanOtpNumberTransferConfirmationScreen esimMobilePlanOtpNumberTransferConfirmationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = esimMobilePlanOtpNumberTransferConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EsimMobilePlanOtpNumberTransferConfirmationScreen esimMobilePlanOtpNumberTransferConfirmationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.e) esimMobilePlanOtpNumberTransferConfirmationScreen.d()).C2(a.C0619a.f101296a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.e eVar = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.e) esimMobilePlanOtpNumberTransferConfirmationScreen.d();
                y yVar = eVar.f101306t;
                String str = ((h) ((j2) yVar.f22677a).getValue()).f16708a;
                String code = str != null ? d0.F0(str).toString() : null;
                pfj.i iVar = (pfj.i) ((h) ((j2) yVar.f22677a).getValue()).f16709b.getContent();
                pfj.d dVar = iVar != null ? iVar.f235615a : null;
                if (code == null) {
                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.e.J2("OTP user input is null");
                } else if (dVar == null) {
                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.e.J2("OTP porting authorization id is null");
                } else {
                    q1 q1Var = eVar.f101302p;
                    String portingId = eVar.o.e;
                    String authorizationId = dVar.f235604a;
                    int i2 = dVar.e;
                    q1Var.getClass();
                    Intrinsics.checkNotNullParameter(portingId, "portingId");
                    Intrinsics.checkNotNullParameter(authorizationId, "authorizationId");
                    Intrinsics.checkNotNullParameter(code, "code");
                    yji.l.a1(eVar, t1.E(new v1(new p1(q1Var, portingId, code, authorizationId, i2, null))), null, null, new r(eVar, null), 3);
                }
                break;
        }
        return Unit.f186387a;
    }
}
