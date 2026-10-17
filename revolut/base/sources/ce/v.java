package ce;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.DependencyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class v implements c, nj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f23324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f23326c;
    public final Object d;
    public final Object e;
    public final Object f;

    public v(ao.h hVar, gpk.c cVar, ecm.q qVar, com.bumptech.glide.g gVar, com.google.firebase.messaging.t tVar, ie.a aVar) {
        Lock lock = ((ReadWriteLock) hVar.f7847b).readLock();
        this.f23324a = lock;
        this.f23325b = cVar;
        this.f23326c = qVar;
        this.d = gVar;
        this.e = tVar;
        this.f = aVar;
        lock.lock();
        try {
            Iterator it8 = tVar.c().iterator();
            while (it8.hasNext()) {
                ((Set) ((ecm.q) this.f23326c).f124861b).add((String) it8.next());
            }
        } finally {
            lock.unlock();
        }
    }

    @Override // ce.c
    public Object a(Class cls) {
        if (!((Set) this.f23324a).contains(t.a(cls))) {
            throw new DependencyException(a0.d.q("Attempting to request an undeclared dependency ", cls, "."));
        }
        Object objA = ((c) this.f).a(cls);
        if (!cls.equals(ze.b.class)) {
            return objA;
        }
        return new u();
    }

    @Override // ce.c
    public r b(t tVar) {
        if (((Set) this.f23326c).contains(tVar)) {
            return ((c) this.f).b(tVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Deferred<" + tVar + ">.");
    }

    @Override // ce.c
    public cf.b c(Class cls) {
        return e(t.a(cls));
    }

    @Override // nj.a
    public boolean contains(String str) {
        Lock lock = (Lock) this.f23324a;
        lock.lock();
        try {
            return Collections.unmodifiableSet((Set) ((ecm.q) this.f23326c).f124861b).contains(str);
        } finally {
            lock.unlock();
        }
    }

    @Override // ce.c
    public Object d(t tVar) {
        if (((Set) this.f23324a).contains(tVar)) {
            return ((c) this.f).d(tVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency " + tVar + ".");
    }

    @Override // ce.c
    public cf.b e(t tVar) {
        if (((Set) this.f23325b).contains(tVar)) {
            return ((c) this.f).e(tVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<" + tVar + ">.");
    }

    @Override // ce.c
    public cf.b f(t tVar) {
        if (((Set) this.e).contains(tVar)) {
            return ((c) this.f).f(tVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<Set<" + tVar + ">>.");
    }

    @Override // ce.c
    public Set g(t tVar) {
        if (((Set) this.d).contains(tVar)) {
            return ((c) this.f).g(tVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Set<" + tVar + ">.");
    }

    @Override // nj.a
    public Map getAll() {
        com.bumptech.glide.g gVar = (com.bumptech.glide.g) this.d;
        Lock lock = (Lock) this.f23324a;
        lock.lock();
        try {
            Set setUnmodifiableSet = Collections.unmodifiableSet((Set) ((ecm.q) this.f23326c).f124861b);
            Set setUnmodifiableSet2 = Collections.unmodifiableSet(gVar.f26094a.keySet());
            Map map = gVar.f26094a;
            if (setUnmodifiableSet2.containsAll(setUnmodifiableSet)) {
                return Collections.unmodifiableMap(map);
            }
            gpk.c cVar = (gpk.c) this.f23325b;
            Map map2 = (Map) ((ck.a) cVar.f145465c).l(((ExecutorService) cVar.f145464b).submit(new nj.b(this, setUnmodifiableSet, setUnmodifiableSet2)), (mj.a) cVar.f145463a).q();
            HashMap map3 = new HashMap(map.size() + map2.size());
            map3.putAll(map2);
            map3.putAll(map);
            return Collections.unmodifiableMap(map3);
        } finally {
            lock.unlock();
        }
    }

    public Task h(Task task) {
        return task.continueWith(new l.a(2), new ag.j(this, 8));
    }

    public r i(Class cls) {
        return b(t.a(cls));
    }

    public void j(String str, String str2, Bundle bundle) {
        int i;
        String str3;
        String strEncodeToString;
        boolean zG;
        af.h hVar;
        PackageInfo packageInfoE;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        pd.g gVar = (pd.g) this.f23324a;
        gVar.a();
        bundle.putString("gmp_app_id", gVar.f235025c.f235031b);
        com.google.firebase.messaging.o oVar = (com.google.firebase.messaging.o) this.f23325b;
        synchronized (oVar) {
            try {
                if (oVar.f49516a == 0 && (packageInfoE = oVar.e("com.google.android.gms")) != null) {
                    oVar.f49516a = packageInfoE.versionCode;
                }
                i = oVar.f49516a;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((com.google.firebase.messaging.o) this.f23325b).c());
        com.google.firebase.messaging.o oVar2 = (com.google.firebase.messaging.o) this.f23325b;
        synchronized (oVar2) {
            try {
                if (((String) oVar2.e) == null) {
                    oVar2.h();
                }
                str3 = (String) oVar2.e;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str3);
        pd.g gVar2 = (pd.g) this.f23324a;
        gVar2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar2.f235024b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str4 = ((df.a) Tasks.await(((df.d) ((df.e) this.f)).d())).f113718a;
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException e) {
        } catch (ExecutionException e2) {
        }
        bundle.putString("appid", (String) Tasks.await(((df.d) ((df.e) this.f)).c()));
        bundle.putString("cliv", "fcm-24.1.1");
        af.i iVar = (af.i) ((cf.b) this.e).get();
        yf.b bVar = (yf.b) ((cf.b) this.d).get();
        if (iVar == null || bVar == null) {
            return;
        }
        af.e eVar = (af.e) iVar;
        synchronized (eVar) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            af.j jVar = (af.j) eVar.f3811a.get();
            synchronized (jVar) {
                zG = jVar.g(jCurrentTimeMillis);
            }
            if (zG) {
                synchronized (jVar) {
                    String strD = jVar.d(System.currentTimeMillis());
                    jVar.f3816a.edit().putString("last-used-date", strD).commit();
                    jVar.f(strD);
                }
                hVar = af.h.GLOBAL;
            } else {
                hVar = af.h.NONE;
            }
        }
        if (hVar != af.h.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(hVar.a()));
            bundle.putString("Firebase-Client", bVar.a());
        }
    }

    @Override // nj.a
    public Object k(Object obj2, String str) {
        Lock lock = (Lock) this.f23324a;
        lock.lock();
        try {
            Object obj3 = ((com.bumptech.glide.g) this.d).f26094a.get(str);
            if (obj3 != null) {
                obj2 = obj3;
            } else if (Collections.unmodifiableSet((Set) ((ecm.q) this.f23326c).f124861b).contains(str)) {
                gpk.c cVar = (gpk.c) this.f23325b;
                obj2 = ((ck.a) cVar.f145465c).l(((ExecutorService) cVar.f145464b).submit(new gqk.d(this, str)), (mj.a) cVar.f145463a).c(obj2);
            }
            ((ie.a) this.f).getClass();
            if (obj2 instanceof Set) {
                obj2 = new HashSet((Set) obj2);
            }
            return obj2;
        } finally {
            lock.unlock();
        }
    }

    public Task l(String str, String str2, Bundle bundle) {
        try {
            j(str, str2, bundle);
            return ((Rpc) this.f23326c).send(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.forException(e);
        }
    }

    public v(b bVar, c cVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<n> set = bVar.f23285c;
        Set set2 = bVar.f23286g;
        for (n nVar : set) {
            int i = nVar.f23310c;
            int i2 = nVar.f23309b;
            boolean z = i == 0;
            t tVar = nVar.f23308a;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(tVar);
                } else {
                    hashSet.add(tVar);
                }
            } else if (i == 2) {
                hashSet3.add(tVar);
            } else if (i2 == 2) {
                hashSet5.add(tVar);
            } else {
                hashSet2.add(tVar);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(t.a(ze.b.class));
        }
        this.f23324a = Collections.unmodifiableSet(hashSet);
        this.f23325b = Collections.unmodifiableSet(hashSet2);
        this.f23326c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = Collections.unmodifiableSet(hashSet5);
        this.f = cVar;
    }

    public v(pd.g gVar, com.google.firebase.messaging.o oVar, cf.b bVar, cf.b bVar2, df.e eVar) {
        gVar.a();
        Rpc rpc2 = new Rpc(gVar.f235023a);
        this.f23324a = gVar;
        this.f23325b = oVar;
        this.f23326c = rpc2;
        this.d = bVar;
        this.e = bVar2;
        this.f = eVar;
    }
}
