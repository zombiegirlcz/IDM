package fcm;

import android.net.ConnectivityManager;
import android.net.Network;
import gcm.x0;
import y8.l;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f133838b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f133837a = i;
        this.f133838b = obj2;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        switch (this.f133837a) {
            case 0:
                ((c) this.f133838b).f133841a.g();
                break;
            default:
                l.f().post(new x0(this, true, 1));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z) {
        switch (this.f133837a) {
            case 0:
                if (!z) {
                    ((c) this.f133838b).f133841a.g();
                }
                break;
            default:
                super.onBlockedStatusChanged(network, z);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        switch (this.f133837a) {
            case 1:
                l.f().post(new x0(this, false, 1));
                break;
            default:
                super.onLost(network);
                break;
        }
    }
}
