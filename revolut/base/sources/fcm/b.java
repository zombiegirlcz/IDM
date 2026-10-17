package fcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f133839a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f133840b;

    public b(c cVar) {
        this.f133840b = cVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean z = this.f133839a;
        boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        this.f133839a = z3;
        if (!z3 || z) {
            return;
        }
        this.f133840b.f133841a.g();
    }
}
