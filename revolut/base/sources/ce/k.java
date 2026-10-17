package ce;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import le.u1;

/* JADX INFO: loaded from: classes.dex */
public final class k implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f23298h = new h(0);
    public final o e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f23302g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f23299a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f23300b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f23301c = new HashMap();
    public final HashSet d = new HashSet();
    public final AtomicReference f = new AtomicReference();

    public k(Executor executor, ArrayList arrayList, ArrayList arrayList2, g gVar) {
        o oVar = new o(executor);
        this.e = oVar;
        this.f23302g = gVar;
        ArrayList<b> arrayList3 = new ArrayList();
        arrayList3.add(b.c(oVar, o.class, ze.c.class, ze.b.class));
        arrayList3.add(b.c(this, k.class, new Class[0]));
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            b bVar = (b) it8.next();
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            arrayList4.add(it9.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it10 = arrayList4.iterator();
            while (it10.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((cf.b) it10.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f23302g.e(componentRegistrar));
                        it10.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it10.remove();
                }
            }
            Iterator it11 = arrayList3.iterator();
            while (it11.hasNext()) {
                Object[] array = ((b) it11.next()).f23284b.toArray();
                int length = array.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Object obj2 = array[i];
                        if (obj2.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.d.contains(obj2.toString())) {
                                it11.remove();
                                break;
                            }
                            this.d.add(obj2.toString());
                        }
                        i++;
                    }
                }
            }
            if (this.f23299a.isEmpty()) {
                u1.f(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f23299a.keySet());
                arrayList6.addAll(arrayList3);
                u1.f(arrayList6);
            }
            for (b bVar2 : arrayList3) {
                this.f23299a.put(bVar2, new p(new i(this, bVar2, 0)));
            }
            arrayList5.addAll(k(arrayList3));
            arrayList5.addAll(l());
            j();
        }
        Iterator it12 = arrayList5.iterator();
        while (it12.hasNext()) {
            ((Runnable) it12.next()).run();
        }
        Boolean bool = (Boolean) this.f.get();
        if (bool != null) {
            h(this.f23299a, bool.booleanValue());
        }
    }

    @Override // ce.c
    public final r b(t tVar) {
        cf.b bVarE = e(tVar);
        return bVarE == null ? new r(r.f23319c, r.d) : bVarE instanceof r ? (r) bVarE : new r(null, bVarE);
    }

    @Override // ce.c
    public final synchronized cf.b e(t tVar) {
        m70.a.b(tVar, "Null interface requested.");
        return (cf.b) this.f23300b.get(tVar);
    }

    @Override // ce.c
    public final synchronized cf.b f(t tVar) {
        q qVar = (q) this.f23301c.get(tVar);
        if (qVar != null) {
            return qVar;
        }
        return f23298h;
    }

    public final void h(HashMap map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            b bVar = (b) entry.getKey();
            cf.b bVar2 = (cf.b) entry.getValue();
            int i = bVar.d;
            if (i == 1 || (i == 2 && z)) {
                bVar2.get();
            }
        }
        o oVar = this.e;
        synchronized (oVar) {
            try {
                arrayDeque = oVar.f23312b;
                if (arrayDeque != null) {
                    oVar.f23312b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (arrayDeque != null) {
            Iterator it8 = arrayDeque.iterator();
            if (it8.hasNext()) {
                throw v0.a.e(it8);
            }
        }
    }

    public final void i(boolean z) {
        HashMap map;
        AtomicReference atomicReference = this.f;
        Boolean boolValueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet(null, boolValueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            map = new HashMap(this.f23299a);
        }
        h(map, z);
    }

    public final void j() {
        HashMap map = this.f23300b;
        HashMap map2 = this.f23301c;
        for (b bVar : this.f23299a.keySet()) {
            for (n nVar : bVar.f23285c) {
                boolean z = nVar.f23309b == 2;
                t tVar = nVar.f23308a;
                if (z && !map2.containsKey(tVar)) {
                    Set set = Collections.EMPTY_SET;
                    q qVar = new q();
                    qVar.f23318b = null;
                    qVar.f23317a = Collections.newSetFromMap(new ConcurrentHashMap());
                    qVar.f23317a.addAll(set);
                    map2.put(tVar, qVar);
                } else if (map.containsKey(tVar)) {
                    continue;
                } else {
                    int i = nVar.f23309b;
                    if (i == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + bVar + ": " + tVar);
                    }
                    if (i != 2) {
                        map.put(tVar, new r(r.f23319c, r.d));
                    }
                }
            }
        }
    }

    public final ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            b bVar = (b) it8.next();
            if (bVar.e == 0) {
                cf.b bVar2 = (cf.b) this.f23299a.get(bVar);
                for (t tVar : bVar.f23284b) {
                    HashMap map = this.f23300b;
                    if (map.containsKey(tVar)) {
                        arrayList2.add(new j((r) ((cf.b) map.get(tVar)), bVar2, 0));
                    } else {
                        map.put(tVar, bVar2);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList l() {
        HashMap map = this.f23301c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.f23299a.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.e != 0) {
                cf.b bVar2 = (cf.b) entry.getValue();
                for (t tVar : bVar.f23284b) {
                    if (!map2.containsKey(tVar)) {
                        map2.put(tVar, new HashSet());
                    }
                    ((Set) map2.get(tVar)).add(bVar2);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                q qVar = (q) map.get(entry2.getKey());
                Iterator it8 = ((Set) entry2.getValue()).iterator();
                while (it8.hasNext()) {
                    arrayList.add(new j(qVar, (cf.b) it8.next(), 1));
                }
            } else {
                t tVar2 = (t) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                q qVar2 = new q();
                qVar2.f23318b = null;
                qVar2.f23317a = Collections.newSetFromMap(new ConcurrentHashMap());
                qVar2.f23317a.addAll(set);
                map.put(tVar2, qVar2);
            }
        }
        return arrayList;
    }
}
