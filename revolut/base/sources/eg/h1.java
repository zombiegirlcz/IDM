package eg;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class h1 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1 f125444a;

    public h1(i1 i1Var) {
        this.f125444a = i1Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        StringBuilder sb6 = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
        i1 i1Var = this.f125444a;
        LinkedBlockingDeque linkedBlockingDeque = i1Var.f125455c;
        sb6.append(linkedBlockingDeque.size());
        sb6.toString();
        i1Var.f125454b = new Messenger(iBinder);
        ArrayList arrayList = new ArrayList();
        linkedBlockingDeque.drainTo(arrayList);
        skm.e0.C(skm.e0.c(i1Var.f125453a), null, null, new afe.a(i1Var, arrayList, (Continuation) null, 5), 3);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        i1 i1Var = this.f125444a;
        i1Var.f125454b = null;
        i1Var.getClass();
    }
}
