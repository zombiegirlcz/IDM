package defpackage;

import com.youTransactor.uCube.ITaskCancelListener;
import com.youTransactor.uCube.connexion.DisconnectListener;
import com.youTransactor.uCube.payment.PaymentStatus;
import ea1.b;
import fa1.k;
import ufm.a;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class g0 implements DisconnectListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f139245b;

    public /* synthetic */ g0(Object obj2, int i) {
        this.f139244a = i;
        this.f139245b = obj2;
    }

    @Override // com.youTransactor.uCube.connexion.DisconnectListener
    public final void onDisconnect(boolean z) {
        switch (this.f139244a) {
            case 0:
                h0 h0Var = (h0) this.f139245b;
                ITaskCancelListener iTaskCancelListener = h0Var.Q;
                if (iTaskCancelListener != null) {
                    iTaskCancelListener.onCancelFinish(true);
                    h0Var.Q = null;
                    h0Var.f(PaymentStatus.ERROR_DISCONNECT);
                }
                if (h0Var.f107543b) {
                    b.a("device disconnect");
                    h0Var.f(PaymentStatus.ERROR_DISCONNECT);
                    break;
                }
                break;
            default:
                a aVar = (a) this.f139245b;
                b.a("Disconnection result=" + z, k.INFO);
                aVar.b(Boolean.valueOf(z));
                break;
        }
    }
}
