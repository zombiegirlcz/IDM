package mg;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class n extends kg.l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f205094a = new n();

    private n() {
    }

    public static kg.u e(qg.a aVar, qg.b bVar) {
        int i = m.f205093a[bVar.ordinal()];
        if (i == 3) {
            return new kg.x(aVar.y());
        }
        if (i == 4) {
            return new kg.x(new com.google.gson.internal.l(aVar.y()));
        }
        if (i == 5) {
            return new kg.x(Boolean.valueOf(aVar.q()));
        }
        if (i == 6) {
            aVar.w();
            return kg.v.f183890a;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }

    public static kg.u f(qg.a aVar, qg.b bVar) throws IOException {
        int i = m.f205093a[bVar.ordinal()];
        if (i == 1) {
            aVar.d();
            return new kg.r();
        }
        if (i != 2) {
            return null;
        }
        aVar.f();
        return new kg.w();
    }

    public static void g(kg.u uVar, qg.c cVar) throws IOException {
        if (uVar == null || (uVar instanceof kg.v)) {
            cVar.m();
            return;
        }
        if (uVar instanceof kg.x) {
            kg.x xVarD = uVar.d();
            Serializable serializable = xVarD.f183892a;
            if (serializable instanceof Number) {
                cVar.r(xVarD.j());
                return;
            } else if (serializable instanceof Boolean) {
                cVar.w(xVarD.h());
                return;
            } else {
                cVar.s(xVarD.f());
                return;
            }
        }
        if (uVar instanceof kg.r) {
            cVar.f();
            Iterator it8 = uVar.b().f183889a.iterator();
            while (it8.hasNext()) {
                g((kg.u) it8.next(), cVar);
            }
            cVar.i();
            return;
        }
        if (!(uVar instanceof kg.w)) {
            throw new IllegalArgumentException("Couldn't write " + uVar.getClass());
        }
        cVar.g();
        for (Map.Entry entry : uVar.c().f183891a.entrySet()) {
            cVar.k((String) entry.getKey());
            g((kg.u) entry.getValue(), cVar);
        }
        cVar.j();
    }

    @Override // kg.l0
    public final Object c(qg.a aVar) throws IOException {
        if (aVar instanceof q) {
            q qVar = (q) aVar;
            qg.b bVarA = qVar.A();
            if (bVarA != qg.b.NAME && bVarA != qg.b.END_ARRAY && bVarA != qg.b.END_OBJECT && bVarA != qg.b.END_DOCUMENT) {
                kg.u uVar = (kg.u) qVar.P();
                qVar.H();
                return uVar;
            }
            throw new IllegalStateException("Unexpected " + bVarA + " when reading a JsonElement.");
        }
        qg.b bVarA2 = aVar.A();
        kg.u uVarF = f(aVar, bVarA2);
        if (uVarF == null) {
            return e(aVar, bVarA2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.n()) {
                String strU = uVarF instanceof kg.w ? aVar.u() : null;
                qg.b bVarA3 = aVar.A();
                kg.u uVarF2 = f(aVar, bVarA3);
                boolean z = uVarF2 != null;
                if (uVarF2 == null) {
                    uVarF2 = e(aVar, bVarA3);
                }
                if (uVarF instanceof kg.r) {
                    ((kg.r) uVarF).g(uVarF2);
                } else {
                    ((kg.w) uVarF).g(strU, uVarF2);
                }
                if (z) {
                    arrayDeque.addLast(uVarF);
                    uVarF = uVarF2;
                }
            } else {
                if (uVarF instanceof kg.r) {
                    aVar.i();
                } else {
                    aVar.j();
                }
                if (arrayDeque.isEmpty()) {
                    return uVarF;
                }
                uVarF = (kg.u) arrayDeque.removeLast();
            }
        }
    }

    @Override // kg.l0
    public final /* bridge */ /* synthetic */ void d(qg.c cVar, Object obj2) {
        g((kg.u) obj2, cVar);
    }
}
