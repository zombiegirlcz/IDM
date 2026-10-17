package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.youTransactor.uCube.connexion.BleService;
import pc.n;
import pc.o;
import pc.p;
import rc.l;
import wc.a;
import wc.b;
import wc.c;

/* JADX INFO: loaded from: classes17.dex */
public final class i0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f157269b;

    public /* synthetic */ i0(Object obj2, int i) {
        this.f157268a = i;
        this.f157269b = obj2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        v0 v0Var;
        switch (this.f157268a) {
            case 0:
                t1.a("BLE service connected");
                v0 v0Var2 = (v0) this.f157269b;
                BleService bleService = ((j1) iBinder).f170062a;
                v0Var2.A = bleService;
                if (!bleService.b()) {
                    t1.b("Unable to initialize Bluetooth", new Exception[0]);
                    ((v0) this.f157269b).e(false);
                    return;
                }
                synchronized (((v0) this.f157269b).f284697n) {
                    v0Var = (v0) this.f157269b;
                    v0Var.f284696m = true;
                    break;
                }
                v0Var.e(true);
                return;
            case 1:
                p pVar = (p) this.f157269b;
                pVar.f234772b.e("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                pVar.a().post(new o(this, iBinder));
                return;
            case 2:
                c cVar = (c) this.f157269b;
                cVar.f296280b.e("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                cVar.a().post(new a(this, iBinder));
                return;
            default:
                zc.c cVar2 = (zc.c) this.f157269b;
                cVar2.f320971b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                cVar2.a().post(new l(this, iBinder));
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        v0 v0Var;
        switch (this.f157268a) {
            case 0:
                t1.a("BLE service disconnected");
                synchronized (((v0) this.f157269b).f284697n) {
                    v0Var = (v0) this.f157269b;
                    v0Var.f284696m = false;
                    break;
                }
                v0Var.A = null;
                v0Var.j();
                v0.d((v0) this.f157269b);
                return;
            case 1:
                p pVar = (p) this.f157269b;
                pVar.f234772b.e("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                pVar.a().post(new n(this, 1));
                return;
            case 2:
                c cVar = (c) this.f157269b;
                cVar.f296280b.e("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                cVar.a().post(new b(this, 0));
                return;
            default:
                zc.c cVar2 = (zc.c) this.f157269b;
                cVar2.f320971b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                cVar2.a().post(new zc.b(this, 0));
                return;
        }
    }
}
