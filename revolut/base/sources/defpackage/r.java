package defpackage;

import com.youTransactor.uCube.Tools;
import com.youTransactor.uCube.connexion.ResponseListener;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.command.GetStatusCommand;
import d8l.d;
import j6.a;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes15.dex */
public final class r extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f250664b;

    public /* synthetic */ r(Object obj2, int i) {
        this.f250663a = i;
        this.f250664b = obj2;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f250663a) {
            case 0:
                RPCCommand rPCCommand = (RPCCommand) this.f250664b;
                if (!rPCCommand.k.f301443b) {
                    e.b(a.n(rPCCommand.e, new StringBuilder("Run recovery mechanism command ID: 0x")), new Exception[0]);
                    rPCCommand.k.run();
                    break;
                }
                break;
            case 1:
                e0 e0Var = (e0) this.f250664b;
                if (!e0Var.f301443b) {
                    e.a("Get terminal status");
                    new GetStatusCommand().execute(new a0(e0Var, 0));
                    break;
                }
                break;
            default:
                v0 v0Var = (v0) this.f250664b;
                byte[] bArrE = d.e(v0Var.f284704x);
                v0Var.f284704x = new byte[0];
                t1.b("\nACTION_GATT_RX_RECEIVED event timeout,\ncurrent rx buffer contains: " + Tools.bytesToHex(bArrE), new Exception[0]);
                ResponseListener responseListener = v0Var.f;
                if (responseListener != null) {
                    responseListener.onError(bArrE);
                }
                break;
        }
    }
}
