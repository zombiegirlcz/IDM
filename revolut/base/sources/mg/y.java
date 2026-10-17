package mg;

import com.google.gson.internal.LinkedTreeMap;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y extends kg.l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f205131c = new u(kg.j0.DOUBLE, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kg.o f205132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kg.j0 f205133b;

    public y(kg.o oVar, kg.j0 j0Var) {
        this.f205132a = oVar;
        this.f205133b = j0Var;
    }

    public static Serializable f(qg.a aVar, qg.b bVar) throws IOException {
        int i = x.f205130a[bVar.ordinal()];
        if (i == 1) {
            aVar.d();
            return new ArrayList();
        }
        if (i != 2) {
            return null;
        }
        aVar.f();
        return new LinkedTreeMap();
    }

    @Override // kg.l0
    public final Object c(qg.a aVar) throws IOException {
        qg.b bVarA = aVar.A();
        Object objF = f(aVar, bVarA);
        if (objF == null) {
            return e(aVar, bVarA);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.n()) {
                String strU = objF instanceof Map ? aVar.u() : null;
                qg.b bVarA2 = aVar.A();
                Serializable serializableF = f(aVar, bVarA2);
                boolean z = serializableF != null;
                if (serializableF == null) {
                    serializableF = e(aVar, bVarA2);
                }
                if (objF instanceof List) {
                    ((List) objF).add(serializableF);
                } else {
                    ((Map) objF).put(strU, serializableF);
                }
                if (z) {
                    arrayDeque.addLast(objF);
                    objF = serializableF;
                }
            } else {
                if (objF instanceof List) {
                    aVar.i();
                } else {
                    aVar.j();
                }
                if (arrayDeque.isEmpty()) {
                    return objF;
                }
                objF = arrayDeque.removeLast();
            }
        }
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        if (obj2 == null) {
            cVar.m();
            return;
        }
        kg.l0 l0VarH = this.f205132a.h(obj2.getClass());
        if (!(l0VarH instanceof y)) {
            l0VarH.d(cVar, obj2);
        } else {
            cVar.g();
            cVar.j();
        }
    }

    public final Serializable e(qg.a aVar, qg.b bVar) {
        int i = x.f205130a[bVar.ordinal()];
        if (i == 3) {
            return aVar.y();
        }
        if (i == 4) {
            return this.f205133b.a(aVar);
        }
        if (i == 5) {
            return Boolean.valueOf(aVar.q());
        }
        if (i == 6) {
            aVar.w();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }
}
