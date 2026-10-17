package wc;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.splitinstall.internal.zzag;
import defpackage.i0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f296278n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f296279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.c f296280b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f296282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f296283h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i0 f296285l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i f296286m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f296284j = new t(this, 0);
    public final AtomicInteger k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f296281c = "SplitInstallService";
    public final WeakReference i = new WeakReference(null);

    public c(Context context, ecm.c cVar, Intent intent) {
        this.f296279a = context;
        this.f296280b = cVar;
        this.f296283h = intent;
    }

    public static /* bridge */ /* synthetic */ void b(c cVar, s sVar) {
        i iVar = cVar.f296286m;
        ecm.c cVar2 = cVar.f296280b;
        ArrayList arrayList = cVar.d;
        if (iVar != null || cVar.f296282g) {
            if (!cVar.f296282g) {
                sVar.run();
                return;
            } else {
                cVar2.e("Waiting to bind to the service.", new Object[0]);
                arrayList.add(sVar);
                return;
            }
        }
        cVar2.e("Initiate binding to the service.", new Object[0]);
        arrayList.add(sVar);
        i0 i0Var = new i0(cVar, 2);
        cVar.f296285l = i0Var;
        cVar.f296282g = true;
        if (cVar.f296279a.bindService(cVar.f296283h, i0Var, 1)) {
            return;
        }
        cVar2.e("Failed to bind to the service.", new Object[0]);
        cVar.f296282g = false;
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            ((s) it8.next()).b(new zzag());
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f296278n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f296281c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f296281c, 10);
                    handlerThread.start();
                    map.put(this.f296281c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f296281c);
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
        a().post(new b(this, 1));
    }

    public final void d() {
        HashSet hashSet = this.e;
        Iterator it8 = hashSet.iterator();
        while (it8.hasNext()) {
            ((TaskCompletionSource) it8.next()).trySetException(new RemoteException(String.valueOf(this.f296281c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
