package q50;

import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import vkm.j2;
import vkm.z1;

/* JADX INFO: loaded from: classes19.dex */
public final class s extends o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b9k.f f242273l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z1 f242274m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f242275n;
    public final AtomicInteger o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f242276p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public koi.c f242277q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f242278r;

    public s(b9k.f registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.f242273l = registry;
        this.f242274m = vkm.q.a(0, 1, ukm.f.DROP_OLDEST);
        this.f242275n = new ConcurrentHashMap();
        this.o = new AtomicInteger(0);
        this.f242276p = new AtomicBoolean(false);
    }

    @Override // yji.n
    public final void F2() {
        this.f242278r = false;
    }

    @Override // yji.n
    public final void H2() {
        this.f242278r = true;
        Set<Map.Entry> setEntrySet = this.f242275n.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        for (Map.Entry entry : setEntrySet) {
            Intrinsics.h(entry);
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "component2(...)");
            ((q) value).c();
        }
    }

    @Override // q50.o
    public final void Z2() {
        this.o.incrementAndGet();
    }

    @Override // q50.o
    public final oq0.b b3(UUID msgId) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        q qVar = (q) this.f242275n.get(msgId);
        if (qVar != null) {
            return qVar.f;
        }
        return null;
    }

    @Override // q50.o
    public final v20.j0 c3(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        for (Map.Entry entry : this.f242275n.entrySet()) {
            if (((q) entry.getValue()).f242261b.equals(listId)) {
                return ((q) entry.getValue()).f242262c;
            }
        }
        return null;
    }

    @Override // q50.o
    public final gw0.q d3(UUID msgId, boolean z, Clause primaryText, Clause clause) {
        y50.d dVar;
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        q qVar = (q) this.f242275n.get(msgId);
        if (qVar == null || (dVar = qVar.f242260a) == null) {
            return null;
        }
        return dVar.b3(primaryText, clause, z);
    }

    @Override // q50.o
    public final z1 e3() {
        return this.f242274m;
    }

    @Override // q50.o
    public final void f3(koi.c manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.f242277q = manager;
    }

    @Override // q50.o
    public final void g3(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ConcurrentHashMap concurrentHashMap = this.f242275n;
        if (concurrentHashMap.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it8 = items.iterator();
        while (it8.hasNext()) {
            hashSet.add(((koi.j) it8.next()).getF57791a());
        }
        Collection<q> collectionValues = concurrentHashMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        for (q qVar : collectionValues) {
            boolean zContains = hashSet.contains(qVar.f242261b);
            qVar.f242263g = zContains;
            if (!qVar.f242264h) {
                boolean z = !zContains;
                y50.d dVar = qVar.f242260a;
                if (dVar != null && !qVar.i) {
                    if (dVar.f314526g != z) {
                        dVar.f314526g = z;
                        if (dVar.d != null) {
                            dVar.y2();
                        }
                    }
                    qVar.c();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // q50.o
    public final void h3(List messages) {
        q qVar;
        Intrinsics.checkNotNullParameter(messages, "messages");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = messages.size();
        for (int i = 0; i < size; i++) {
            v20.n nVar = (v20.n) messages.get(i);
            if (nVar instanceof v20.j0) {
                linkedHashMap.put(((v20.j0) nVar).getId(), nVar);
            }
        }
        ?? r112 = this.f242275n;
        for (Map.Entry entry : r112.entrySet()) {
            UUID uuid = (UUID) entry.getKey();
            q qVar2 = (q) entry.getValue();
            if (linkedHashMap.remove(uuid) == null && r112.remove(uuid, qVar2)) {
                qVar2.a();
            }
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it8 = linkedHashMap.entrySet().iterator();
        while (true) {
            ?? r4 = 0;
            r4 = 0;
            if (!it8.hasNext()) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it8.next();
            UUID uuid2 = (UUID) entry2.getKey();
            v20.j0 j0Var = (v20.j0) entry2.getValue();
            if (!r112.containsKey(uuid2)) {
                y50.d dVarL = this.f242273l.l(j0Var.getWidget().f285419a);
                if (dVarL == null) {
                    dVarL = null;
                }
                Object obj2 = j0Var.getWidget().f285421c;
                if (dVarL == null || obj2 == null) {
                    qVar = new q(this, null, "", j0Var);
                } else {
                    String string = uuid2.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    y50.b bVar = new y50.b(string, obj2);
                    Intrinsics.checkNotNullParameter(bVar, "<set-?>");
                    dVarL.f310977l = bVar;
                    qVar = new q(this, dVarL, string, j0Var);
                }
                if (r112.putIfAbsent(uuid2, qVar) == null) {
                    y50.d dVar = qVar.f242260a;
                    if (dVar != null) {
                        cli.g gVarD3 = dVar.d3();
                        qVar.b(((y50.c) gVarD3.f25025b.c((cli.j) ((j2) gVarD3.f22677a).getValue())).f310976a);
                        a2 a2VarT2 = qVar.f242265j.T2(new p(qVar, r4, 1), new yi5.b(27));
                        while (true) {
                            AtomicReference atomicReference = qVar.d;
                            if (!atomicReference.compareAndSet(null, a2VarT2)) {
                                if (atomicReference.get() != null) {
                                    a2VarT2.f(null);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    r4 = qVar;
                }
            }
            if (r4 != 0) {
                arrayList.add(r4);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        T2(new r(arrayList, this.f242276p.compareAndSet(false, true), null), new yi5.b(27));
    }

    @Override // q50.o
    public final void i3() {
        this.o.decrementAndGet();
    }
}
