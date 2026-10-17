package gcm;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class q5 extends ecm.t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ecm.t1 f142842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r5 f142843b;

    public q5(r5 r5Var, ecm.t1 t1Var) {
        this.f142843b = r5Var;
        this.f142842a = t1Var;
    }

    @Override // ecm.t1
    public final void a(ecm.g2 g2Var) {
        this.f142842a.a(g2Var);
        this.f142843b.f142856c.execute(new fp0.l(this, 3));
    }

    @Override // ecm.t1
    public final void b(ecm.u1 u1Var) {
        ecm.b bVar = u1Var.f124878b;
        IdentityHashMap identityHashMap = bVar.f124780a;
        ecm.a aVar = r5.d;
        if (identityHashMap.get(aVar) != null) {
            throw new IllegalStateException("RetryingNameResolver can only be used once to wrap a NameResolver");
        }
        List list = Collections.EMPTY_LIST;
        ecm.b bVar2 = ecm.b.f124779b;
        List list2 = u1Var.f124877a;
        ecm.s1 s1Var = u1Var.f124879c;
        bVar.getClass();
        p5 p5Var = new p5(this.f142843b);
        IdentityHashMap identityHashMap2 = new IdentityHashMap(1);
        identityHashMap2.put(aVar, p5Var);
        for (Map.Entry entry : bVar.f124780a.entrySet()) {
            if (!identityHashMap2.containsKey(entry.getKey())) {
                identityHashMap2.put((ecm.a) entry.getKey(), entry.getValue());
            }
        }
        this.f142842a.b(new ecm.u1(list2, new ecm.b(identityHashMap2), s1Var));
    }
}
