package r8;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f252278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.m f252279b;

    public c(Context context, com.bumptech.glide.m mVar) {
        this.f252278a = context.getApplicationContext();
        this.f252279b = mVar;
    }

    @Override // r8.j
    public final void onDestroy() {
    }

    @Override // r8.j
    public final void onStart() {
        q qVarD = q.d(this.f252278a);
        com.bumptech.glide.m mVar = this.f252279b;
        synchronized (qVarD) {
            ((HashSet) qVarD.d).add(mVar);
            qVarD.e();
        }
    }

    @Override // r8.j
    public final void onStop() {
        q qVarD = q.d(this.f252278a);
        com.bumptech.glide.m mVar = this.f252279b;
        synchronized (qVarD) {
            ((HashSet) qVarD.d).remove(mVar);
            if (qVarD.f252297b && ((HashSet) qVarD.d).isEmpty()) {
                ch.m mVar2 = (ch.m) qVarD.f252298c;
                ((ConnectivityManager) ((e8.r) mVar2.f24043c).get()).unregisterNetworkCallback((fcm.a) mVar2.d);
                qVarD.f252297b = false;
            }
        }
    }
}
