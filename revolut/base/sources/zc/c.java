package zc;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.af;
import defpackage.i0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final HashMap o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f320970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f320971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f320972c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f320973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f320974h;
    public final b0 i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i0 f320977m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IInterface f320978n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final wc.t k = new wc.t(this, 1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f320976l = new AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final WeakReference f320975j = new WeakReference(null);

    public c(Context context, y yVar, String str, Intent intent, b0 b0Var) {
        this.f320970a = context;
        this.f320971b = yVar;
        this.f320972c = str;
        this.f320974h = intent;
        this.i = b0Var;
    }

    public static /* bridge */ /* synthetic */ void b(c cVar, z zVar) {
        IInterface iInterface = cVar.f320978n;
        y yVar = cVar.f320971b;
        ArrayList arrayList = cVar.d;
        if (iInterface != null || cVar.f320973g) {
            if (!cVar.f320973g) {
                zVar.run();
                return;
            } else {
                yVar.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(zVar);
                return;
            }
        }
        yVar.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(zVar);
        i0 i0Var = new i0(cVar, 3);
        cVar.f320977m = i0Var;
        cVar.f320973g = true;
        if (cVar.f320970a.bindService(cVar.f320974h, i0Var, 1)) {
            return;
        }
        yVar.b("Failed to bind to the service.", new Object[0]);
        cVar.f320973g = false;
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            ((z) it8.next()).a(new af());
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f320972c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f320972c, 10);
                    handlerThread.start();
                    map.put(this.f320972c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f320972c);
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
            ((TaskCompletionSource) it8.next()).trySetException(new RemoteException(String.valueOf(this.f320972c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
