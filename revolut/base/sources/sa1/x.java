package sa1;

import com.youTransactor.uCube.api.UCubeLibPaymentServiceListener;
import com.youTransactor.uCube.payment.PaymentContext;
import com.youTransactor.uCube.payment.PaymentState;
import fa1.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import tfm.z0;

/* JADX INFO: loaded from: classes20.dex */
public final class x implements UCubeLibPaymentServiceListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z0 f261261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f261262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lal.a f261263c;

    public x(z0 z0Var, v vVar, lal.a aVar) {
        this.f261261a = z0Var;
        this.f261262b = vVar;
        this.f261263c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @Override // com.youTransactor.uCube.api.UCubeLibPaymentServiceListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFinish(com.youTransactor.uCube.payment.PaymentContext r24) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sa1.x.onFinish(com.youTransactor.uCube.payment.PaymentContext):void");
    }

    @Override // com.youTransactor.uCube.api.UCubeLibPaymentServiceListener
    public final void onProgress(PaymentState paymentState, PaymentContext paymentContext) {
        fa1.n nVar;
        Intrinsics.checkNotNullParameter(paymentState, "paymentState");
        Intrinsics.checkNotNullParameter(paymentContext, "paymentContext");
        if (paymentState == PaymentState.KSN_AVAILABLE && paymentContext.getSredKsn() != null) {
            byte[] sredKsn = paymentContext.getSredKsn();
            Intrinsics.checkNotNullExpressionValue(sredKsn, "getSredKsn(...)");
            ea1.b.a("Payment KSN: " + jli.g.i(sredKsn), fa1.k.INFO);
        }
        fa1.j jVarF = x5d.b.f(paymentContext);
        Intrinsics.checkNotNullParameter(paymentState, "<this>");
        switch (y.f261264a[paymentState.ordinal()]) {
            case 1:
                nVar = fa1.n.START_CANCEL_ALL;
                break;
            case 2:
                nVar = fa1.n.START_EXIT_SECURE_SESSION;
                break;
            case 3:
                nVar = fa1.n.GET_INFO;
                break;
            case 4:
                nVar = fa1.n.ENTER_SECURE_SESSION;
                break;
            case 5:
                nVar = fa1.n.KSN_AVAILABLE;
                break;
            case 6:
                nVar = fa1.n.START_TRANSACTION;
                break;
            case 7:
                nVar = fa1.n.CARD_READ_END;
                break;
            case 8:
                nVar = fa1.n.AUTHORIZATION;
                break;
            case 9:
                nVar = fa1.n.GET_FINALIZATION_SECURED_TAGS;
                break;
            case 10:
                nVar = fa1.n.GET_FINALIZATION_PLAIN_TAGS;
                break;
            case 11:
                nVar = fa1.n.GET_CC_L2_LOG;
                break;
            case 12:
                nVar = fa1.n.GET_F4_L2_LOG;
                break;
            case 13:
                nVar = fa1.n.GET_F5_L2_LOG;
                break;
            case 14:
                nVar = fa1.n.END_EXIT_SECURE_SESSION;
                break;
            case 15:
                nVar = fa1.n.START_ICC;
                break;
            case 16:
                nVar = fa1.n.SMC_BUILD_CANDIDATE_LIST;
                break;
            case 17:
                nVar = fa1.n.SMC_SELECT_APPLICATION;
                break;
            case 18:
                nVar = fa1.n.SMC_USER_SELECT_APPLICATION;
                break;
            case 19:
                nVar = fa1.n.SMC_INIT_TRANSACTION;
                break;
            case 20:
                nVar = fa1.n.SMC_RISK_MANAGEMENT;
                break;
            case 21:
                nVar = fa1.n.SMC_PROCESS_TRANSACTION;
                break;
            case 22:
                nVar = fa1.n.SMC_GET_AUTHORIZATION_SECURED_TAGS;
                break;
            case 23:
                nVar = fa1.n.SMC_FINALIZE_TRANSACTION;
                break;
            case 24:
                nVar = fa1.n.SMC_REMOVE_CARD;
                break;
            case 25:
                nVar = fa1.n.START_NFC;
                break;
            case 26:
                nVar = fa1.n.NFC_GET_AUTHORIZATION_SECURED_TAGS;
                break;
            case 27:
                nVar = fa1.n.NFC_SIMPLIFIED_ONLINE_PIN;
                break;
            case 28:
                nVar = fa1.n.NFC_SIMPLIFIED_ONLINE_PIN_WITHOUT_AMOUNT_AND_CURRENCY;
                break;
            case 29:
                nVar = fa1.n.NFC_COMPLETE_TRANSACTION;
                break;
            case 30:
                nVar = fa1.n.DISPLAY_START_WAIT_CARD;
                break;
            case 31:
                nVar = fa1.n.WAITING_CARD;
                break;
            case 32:
                nVar = fa1.n.ONLINE_PIN;
                break;
            case 33:
                nVar = fa1.n.OFFLINE_PIN;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.f261261a.c(new fa1.l(o.g.f133202a, jVarF, nVar, 24));
    }
}
