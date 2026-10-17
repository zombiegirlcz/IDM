package defpackage;

import com.youTransactor.uCube.Tools;
import com.youTransactor.uCube.connexion.ConnectionListener;
import com.youTransactor.uCube.connexion.ConnectionService;
import com.youTransactor.uCube.connexion.ConnectionStatus;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.RPCCommandStatus;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class h implements ConnectionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f148166b;

    public /* synthetic */ h(Object obj2, int i) {
        this.f148165a = i;
        this.f148166b = obj2;
    }

    @Override // com.youTransactor.uCube.connexion.ConnectionListener
    public final void onConnectionCancelled() {
        int i = this.f148165a;
        Object obj2 = this.f148166b;
        switch (i) {
            case 0:
                ConnectionService connectionService = (ConnectionService) obj2;
                ConnectionService connectionService2 = ConnectionService.f107574h;
                t1.b("connection cancelled", new Exception[0]);
                if (!connectionService.f107575a) {
                    connectionService.f.removeCallbacksAndMessages(null);
                    connectionService.f107576b = 1;
                    connectionService.e.onConnectionCancelled();
                } else {
                    t1.a("connection stopped by timeout timer");
                    connectionService.f107575a = false;
                    connectionService.a(ConnectionStatus.ERROR_TIMEOUT, -1);
                }
                break;
            case 1:
                k0 k0Var = (k0) obj2;
                if (k0Var.f179877c.contains(k0Var.d)) {
                    k0.d(k0Var);
                }
                break;
            default:
                v1.b("Connection was cancelled", new Exception[0]);
                ((l0) obj2).f191133b.M = false;
                v1.b("error to connect ucube", new Exception[0]);
                break;
        }
    }

    @Override // com.youTransactor.uCube.connexion.ConnectionListener
    public final void onConnectionFailed(ConnectionStatus connectionStatus, int i) {
        int i2 = this.f148165a;
        Object obj2 = this.f148166b;
        switch (i2) {
            case 0:
                ConnectionService connectionService = ConnectionService.f107574h;
                ((ConnectionService) obj2).a(connectionStatus, i);
                break;
            case 1:
                k0 k0Var = (k0) obj2;
                if (connectionStatus != ConnectionStatus.ERROR_DISCONNECTION_RUNNING && k0Var.f179877c.contains(k0Var.d)) {
                    k0.d(k0Var);
                    break;
                }
                break;
            default:
                ((l0) obj2).f191133b.M = false;
                v1.b("error to connect ucube", new Exception[0]);
                break;
        }
    }

    @Override // com.youTransactor.uCube.connexion.ConnectionListener
    public final void onConnectionSuccess() {
        int i = this.f148165a;
        Object obj2 = this.f148166b;
        switch (i) {
            case 0:
                ConnectionService connectionService = (ConnectionService) obj2;
                ConnectionService connectionService2 = ConnectionService.f107574h;
                t1.a("connection success");
                connectionService.f.removeCallbacksAndMessages(null);
                connectionService.f107576b = 1;
                connectionService.e.onConnectionSuccess();
                break;
            case 1:
                k0 k0Var = (k0) obj2;
                n0 n0Var = k0Var.f;
                if (k0Var.f179877c.contains(k0Var.d)) {
                    n0.b(n0Var);
                    k0Var.d.setState(RPCCommandStatus.CONNECT);
                    RPCCommand rPCCommand = k0Var.d;
                    if (rPCCommand.getCommandId() == 20737) {
                        n0Var.d = (byte) 0;
                    }
                    try {
                        byte[] bArrF = k0Var.f(rPCCommand);
                        n0Var.d = (byte) (n0Var.d + 1);
                        e.a("command ID: 0x" + Integer.toHexString(rPCCommand.getCommandId()));
                        e.a("command sequence num: " + ((int) rPCCommand.getSequenceNumber()));
                        e.a("command payload: 0x" + Tools.bytesToHex(rPCCommand.getPayload()));
                        e.a("sent message: " + Tools.bytesToHex(bArrF));
                        ConnectionService.getInstance().send(bArrF, k0Var.e);
                        k0Var.d.setState(RPCCommandStatus.SENDING);
                    } catch (IOException e) {
                        e.printStackTrace();
                        e.b("Error! exception at creating payload of command : " + Integer.toHexString(rPCCommand.getCommandId()), new Exception[0]);
                        k0.d(k0Var);
                        return;
                    }
                    break;
                }
                break;
            default:
                v1.a("connect to ucube");
                u0 u0Var = ((l0) obj2).f191133b;
                u0Var.M = false;
                u0Var.L.cancel();
                u0Var.d();
                break;
        }
    }
}
