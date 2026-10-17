package fcm;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import ecm.d1;
import ecm.i;
import ecm.p1;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1 f133841a;

    public c(d1 d1Var, Context context) {
        this.f133841a = d1Var;
        if (context != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            try {
                if (connectivityManager != null) {
                    connectivityManager.registerDefaultNetworkCallback(new a(this, 0));
                } else {
                    context.registerReceiver(new b(this), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            } catch (SecurityException e) {
            }
        }
    }

    @Override // ecm.e
    public final String e() {
        return this.f133841a.e();
    }

    @Override // ecm.e
    public final i f(p1 p1Var, ecm.d dVar) {
        return this.f133841a.f(p1Var, dVar);
    }

    @Override // ecm.d1
    public final void g() {
        this.f133841a.g();
    }
}
