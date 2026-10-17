package r8;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import efm.f0;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q implements f0 {
    public static volatile q e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f252296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f252297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f252298c;
    public final Object d;

    public q() {
        this.f252296a = 2;
        this.f252298c = Collections.newSetFromMap(new WeakHashMap());
        this.d = new HashSet();
    }

    public static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + com.google.gson.internal.j.f("r8-abstract-class");
    }

    public static q d(Context context) {
        if (e == null) {
            synchronized (q.class) {
                try {
                    if (e == null) {
                        e = new q(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public boolean b(u8.c cVar) {
        boolean z = true;
        if (cVar == null) {
            return true;
        }
        boolean zRemove = ((Set) this.f252298c).remove(cVar);
        if (!((HashSet) this.d).remove(cVar) && !zRemove) {
            z = false;
        }
        if (z) {
            cVar.clear();
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.gson.internal.r c(com.google.gson.reflect.TypeToken r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r8.q.c(com.google.gson.reflect.TypeToken, boolean):com.google.gson.internal.r");
    }

    public void e() {
        if (this.f252297b || ((HashSet) this.d).isEmpty()) {
            return;
        }
        ch.m mVar = (ch.m) this.f252298c;
        e8.r rVar = (e8.r) mVar.f24043c;
        boolean z = false;
        mVar.f24041a = ((ConnectivityManager) rVar.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) rVar.get()).registerDefaultNetworkCallback((fcm.a) mVar.d);
            z = true;
        } catch (RuntimeException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
            }
        }
        this.f252297b = z;
    }

    @Override // efm.f0
    public void onError(Throwable th10) {
        if (this.f252297b) {
            mo3.a.m(th10);
        } else {
            ((f0) this.f252298c).onError(th10);
        }
    }

    @Override // efm.f0
    public void onSubscribe(ifm.c cVar) {
        f0 f0Var = (f0) this.f252298c;
        try {
            ((kfm.g) this.d).accept(cVar);
            f0Var.onSubscribe(cVar);
        } catch (Throwable th10) {
            m70.a.u(th10);
            this.f252297b = true;
            cVar.dispose();
            lfm.e.e(th10, f0Var);
        }
    }

    @Override // efm.f0
    public void onSuccess(Object obj2) {
        if (this.f252297b) {
            return;
        }
        ((f0) this.f252298c).onSuccess(obj2);
    }

    public String toString() {
        switch (this.f252296a) {
            case 1:
                return ((Map) this.f252298c).toString();
            case 2:
                StringBuilder sb6 = new StringBuilder();
                sb6.append(super.toString());
                sb6.append("{numRequests=");
                sb6.append(((Set) this.f252298c).size());
                sb6.append(", isPaused=");
                return com.google.android.gms.internal.mlkit_vision_face.a.t(sb6, this.f252297b, "}");
            default:
                return super.toString();
        }
    }

    public q(f0 f0Var, kfm.g gVar) {
        this.f252296a = 3;
        this.f252298c = f0Var;
        this.d = gVar;
    }

    public q(Map map, List list, boolean z) {
        this.f252296a = 1;
        this.f252298c = map;
        this.f252297b = z;
        this.d = list;
    }

    public q(Context context) {
        this.f252296a = 0;
        this.d = new HashSet();
        this.f252298c = new ch.m(new e8.r(new o(context)), new p(this));
    }
}
