package defpackage;

import com.youTransactor.uCube.connexion.ConnectionListener;
import com.youTransactor.uCube.connexion.ConnectionStatus;
import com.youTransactor.uCube.connexion.DisconnectListener;
import com.youTransactor.uCube.connexion.UCubeDevice;
import java.util.HashSet;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class p0 implements DisconnectListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f231391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f231392c;

    public /* synthetic */ p0(v0 v0Var, Object obj2, int i) {
        this.f231390a = i;
        this.f231391b = v0Var;
        this.f231392c = obj2;
    }

    @Override // com.youTransactor.uCube.connexion.DisconnectListener
    public final void onDisconnect(boolean z) {
        switch (this.f231390a) {
            case 0:
                ConnectionStatus connectionStatus = (ConnectionStatus) this.f231392c;
                v0 v0Var = this.f231391b;
                v0Var.getClass();
                t1.a("disconnection done, call connection listener(s) with status : " + connectionStatus);
                HashSet hashSet = v0Var.f284691c;
                HashSet<ConnectionListener> hashSet2 = new HashSet(hashSet);
                hashSet.clear();
                if (connectionStatus == ConnectionStatus.CANCELLED) {
                    for (ConnectionListener connectionListener : hashSet2) {
                        if (connectionListener != null) {
                            connectionListener.onConnectionCancelled();
                        }
                    }
                } else {
                    for (ConnectionListener connectionListener2 : hashSet2) {
                        if (connectionListener2 != null) {
                            connectionListener2.onConnectionFailed(connectionStatus, -1);
                        }
                    }
                }
                hashSet2.clear();
                break;
            default:
                this.f231391b.f284690b = (UCubeDevice) this.f231392c;
                break;
        }
    }
}
