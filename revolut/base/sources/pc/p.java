package pc;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzy;
import defpackage.i0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes16.dex */
public final class p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f234770n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f234771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f234772b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f234774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f234775h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i0 f234777l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h f234778m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f234776j = new IBinder.DeathRecipient() { // from class: pc.m
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            p pVar = this.f234765a;
            pVar.f234772b.e("reportBinderDeath", new Object[0]);
            if (pVar.i.get() != null) {
                throw new ClassCastException();
            }
            pVar.f234772b.e("%s : Binder has died.", pVar.f234773c);
            for (l lVar : pVar.d) {
                RemoteException remoteException = new RemoteException(String.valueOf(pVar.f234773c).concat(" : Binder has died."));
                TaskCompletionSource taskCompletionSource = lVar.f234764a;
                if (taskCompletionSource != null) {
                    taskCompletionSource.trySetException(remoteException);
                }
            }
            pVar.d.clear();
            synchronized (pVar.f) {
                pVar.d();
            }
        }
    };
    public final AtomicInteger k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f234773c = "AppUpdateService";
    public final WeakReference i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [pc.m] */
    public p(Context context, k kVar, Intent intent) {
        this.f234771a = context;
        this.f234772b = kVar;
        this.f234775h = intent;
    }

    public static void b(p pVar, l lVar) {
        h hVar = pVar.f234778m;
        k kVar = pVar.f234772b;
        ArrayList<l> arrayList = pVar.d;
        if (hVar != null || pVar.f234774g) {
            if (!pVar.f234774g) {
                lVar.run();
                return;
            } else {
                kVar.e("Waiting to bind to the service.", new Object[0]);
                arrayList.add(lVar);
                return;
            }
        }
        kVar.e("Initiate binding to the service.", new Object[0]);
        arrayList.add(lVar);
        i0 i0Var = new i0(pVar, 1);
        pVar.f234777l = i0Var;
        pVar.f234774g = true;
        if (pVar.f234771a.bindService(pVar.f234775h, i0Var, 1)) {
            return;
        }
        kVar.e("Failed to bind to the service.", new Object[0]);
        pVar.f234774g = false;
        for (l lVar2 : arrayList) {
            zzy zzyVar = new zzy();
            TaskCompletionSource taskCompletionSource = lVar2.f234764a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(zzyVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f234770n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f234773c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f234773c, 10);
                    handlerThread.start();
                    map.put(this.f234773c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f234773c);
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return handler;
    }

    public final void c(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f) {
            this.e.remove(taskCompletionSource);
        }
        a().post(new n(this, 0));
    }

    public final void d() {
        HashSet hashSet = this.e;
        Iterator it8 = hashSet.iterator();
        while (it8.hasNext()) {
            ((TaskCompletionSource) it8.next()).trySetException(new RemoteException(String.valueOf(this.f234773c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
