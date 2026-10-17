package mcm;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import ecm.a1;
import ecm.g2;
import ecm.t0;
import ecm.u0;
import ecm.v0;
import ecm.w0;
import ecm.y0;
import gcm.p4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes22.dex */
public final class c0 extends a1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Logger f204373m = Logger.getLogger(c0.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u0 f204374g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f204375h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ecm.r f204376j;
    public final AtomicInteger k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public y0 f204377l;
    public final LinkedHashMap f = new LinkedHashMap();
    public final p4 i = new p4();

    public c0(u0 u0Var) {
        this.f204374g = (u0) Preconditions.checkNotNull(u0Var, "helper");
        f204373m.log(Level.FINE, "Created");
        this.k = new AtomicInteger(new Random().nextInt());
        this.f204377l = new a0();
    }

    @Override // ecm.a1
    public final g2 a(w0 w0Var) {
        try {
            this.f204375h = true;
            kge.d dVarG = g(w0Var);
            g2 g2Var = (g2) dVarG.f183974b;
            if (!g2Var.e()) {
                return g2Var;
            }
            j();
            for (l lVar : (List) dVarG.f183975c) {
                lVar.f204395b.f();
                lVar.f204396c = ecm.r.SHUTDOWN;
                f204373m.log(Level.FINE, "Child balancer {0} deleted", lVar.f204394a);
            }
            return g2Var;
        } finally {
            this.f204375h = false;
        }
    }

    @Override // ecm.a1
    public final void c(g2 g2Var) {
        if (this.f204376j != ecm.r.READY) {
            this.f204374g.f(ecm.r.TRANSIENT_FAILURE, new t0(v0.a(g2Var)));
        }
    }

    @Override // ecm.a1
    public final void f() {
        Level level = Level.FINE;
        Logger logger = f204373m;
        logger.log(level, "Shutdown");
        LinkedHashMap linkedHashMap = this.f;
        for (l lVar : linkedHashMap.values()) {
            lVar.f204395b.f();
            lVar.f204396c = ecm.r.SHUTDOWN;
            logger.log(Level.FINE, "Child balancer {0} deleted", lVar.f204394a);
        }
        linkedHashMap.clear();
    }

    public final kge.d g(w0 w0Var) {
        LinkedHashMap linkedHashMap;
        m mVar;
        ecm.z zVar;
        f204373m.log(Level.FINE, "Received resolution result: {0}", w0Var);
        HashMap map = new HashMap();
        List list = w0Var.f124889a;
        Iterator it8 = list.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            linkedHashMap = this.f;
            if (!zHasNext) {
                break;
            }
            m mVar2 = new m((ecm.z) it8.next());
            l lVar = (l) linkedHashMap.get(mVar2);
            if (lVar != null) {
                map.put(mVar2, lVar);
            } else {
                map.put(mVar2, new l(this, mVar2, this.i, new t0(v0.e)));
            }
        }
        Object obj2 = null;
        if (map.isEmpty()) {
            g2 g2VarG = g2.f124807m.g("NameResolver returned no usable address. " + w0Var);
            c(g2VarG);
            return new kge.d(g2VarG, obj2, 8);
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (!linkedHashMap.containsKey(key)) {
                linkedHashMap.put(key, (l) entry.getValue());
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            ((l) entry2.getValue()).getClass();
            l lVar2 = (l) linkedHashMap.get(entry2.getKey());
            Object key2 = entry2.getKey();
            if (key2 instanceof ecm.z) {
                mVar = new m((ecm.z) key2);
            } else {
                Preconditions.checkArgument(key2 instanceof m, "key is wrong type");
                mVar = (m) key2;
            }
            Iterator it9 = list.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    zVar = null;
                    break;
                }
                zVar = (ecm.z) it9.next();
                if (mVar.equals(new m(zVar))) {
                    break;
                }
            }
            Preconditions.checkNotNull(zVar, key2 + " no longer present in load balancer children");
            jpf.a aVarA = w0Var.a();
            aVarA.f177267a = Collections.singletonList(zVar);
            ecm.b bVar = ecm.b.f124779b;
            Boolean bool = Boolean.TRUE;
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            identityHashMap.put(a1.e, bool);
            for (Map.Entry entry3 : bVar.f124780a.entrySet()) {
                if (!identityHashMap.containsKey(entry3.getKey())) {
                    identityHashMap.put((ecm.a) entry3.getKey(), entry3.getValue());
                }
            }
            aVarA.f177268b = new ecm.b(identityHashMap);
            aVarA.f177269c = null;
            w0 w0VarB = aVarA.b();
            lVar2.getClass();
            Preconditions.checkNotNull(w0VarB, "Missing address list for child");
            lVar2.f204395b.d(w0VarB);
        }
        g2 g2Var = g2.e;
        Set setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList();
        UnmodifiableIterator it10 = ImmutableList.copyOf((Collection) linkedHashMap.keySet()).iterator();
        while (it10.hasNext()) {
            Object next = it10.next();
            if (!setKeySet.contains(next)) {
                arrayList.add((l) linkedHashMap.remove(next));
            }
        }
        return new kge.d(g2Var, arrayList, 8);
    }

    public final b0 h(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it8 = collection.iterator();
        while (it8.hasNext()) {
            arrayList.add(((l) it8.next()).d);
        }
        return new b0(arrayList, this.k);
    }

    public final void i(ecm.r rVar, y0 y0Var) {
        if (rVar == this.f204376j && y0Var.equals(this.f204377l)) {
            return;
        }
        this.f204374g.f(rVar, y0Var);
        this.f204376j = rVar;
        this.f204377l = y0Var;
    }

    public final void j() {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = this.f;
        for (l lVar : linkedHashMap.values()) {
            if (lVar.f204396c == ecm.r.READY) {
                arrayList.add(lVar);
            }
        }
        if (!arrayList.isEmpty()) {
            i(ecm.r.READY, h(arrayList));
            return;
        }
        Iterator it8 = linkedHashMap.values().iterator();
        while (it8.hasNext()) {
            ecm.r rVar = ((l) it8.next()).f204396c;
            ecm.r rVar2 = ecm.r.CONNECTING;
            if (rVar == rVar2 || rVar == ecm.r.IDLE) {
                i(rVar2, new a0());
                return;
            }
        }
        i(ecm.r.TRANSIENT_FAILURE, h(linkedHashMap.values()));
    }
}
