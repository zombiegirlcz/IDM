package sa1;

import com.youTransactor.uCube.connexion.ConnectionListener;
import com.youTransactor.uCube.connexion.ConnectionStatus;
import fa1.q;
import kotlin.jvm.internal.Intrinsics;
import tfm.z0;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements ConnectionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z0 f261233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ihm.f f261234b;

    public o(z0 z0Var, ihm.f fVar) {
        this.f261233a = z0Var;
        this.f261234b = fVar;
    }

    @Override // com.youTransactor.uCube.connexion.ConnectionListener
    public final void onConnectionCancelled() {
        q.b bVar = q.b.f133209a;
        z0 z0Var = this.f261233a;
        z0Var.c(bVar);
        z0Var.a();
        this.f261234b.onComplete();
    }

    @Override // com.youTransactor.uCube.connexion.ConnectionListener
    public final void onConnectionFailed(ConnectionStatus status, int i) {
        Intrinsics.checkNotNullParameter(status, "status");
        ea1.b.a("Connection failed with status: " + status + ", GATT status: " + i, fa1.k.ERROR);
        q.c cVar = q.c.f133210a;
        z0 z0Var = this.f261233a;
        z0Var.c(cVar);
        z0Var.a();
        this.f261234b.onComplete();
    }

    @Override // com.youTransactor.uCube.connexion.ConnectionListener
    public final void onConnectionSuccess() {
        q.e eVar = q.e.f133212a;
        z0 z0Var = this.f261233a;
        z0Var.c(eVar);
        z0Var.a();
        this.f261234b.onComplete();
    }
}
