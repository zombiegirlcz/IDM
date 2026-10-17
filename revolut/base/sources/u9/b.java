package u9;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Set;
import v9.o0;

/* JADX INFO: loaded from: classes16.dex */
public final class b extends v9.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v9.d f278260l;

    public b(b bVar, Set set, Set set2) {
        super(bVar, set, set2);
        this.f278260l = bVar;
    }

    @Override // v9.d
    public final v9.d A(av0.b bVar) {
        return this.f278260l.A(bVar);
    }

    @Override // v9.d
    public final v9.d B(t9.c[] cVarArr, t9.c[] cVarArr2) {
        return this;
    }

    public final void C(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) throws IOException {
        if (this.e != null) {
            vVar.getClass();
        }
        t9.c[] cVarArr = this.d;
        int i = 0;
        try {
            int length = cVarArr.length;
            while (i < length) {
                t9.c cVar = cVarArr[i];
                if (cVar == null) {
                    hVar.p();
                } else {
                    cVar.k(obj2, hVar, vVar);
                }
                i++;
            }
        } catch (Exception e) {
            o0.p(vVar, e, obj2, cVarArr[i].f268913b.f132807a);
            throw null;
        } catch (StackOverflowError e2) {
            JsonMappingException jsonMappingException = new JsonMappingException(hVar, "Infinite recursion (StackOverflowError)", e2);
            k9.g gVar = new k9.g(obj2, cVarArr[i].f268913b.f132807a);
            if (jsonMappingException.f26185b == null) {
                jsonMappingException.f26185b = new LinkedList();
            }
            if (jsonMappingException.f26185b.size() >= 1000) {
                throw jsonMappingException;
            }
            jsonMappingException.f26185b.addFirst(gVar);
            throw jsonMappingException;
        }
    }

    @Override // k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) throws IOException {
        if (vVar.f182201a.n(k9.u.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && this.d.length == 1) {
            C(obj2, hVar, vVar);
            return;
        }
        hVar.x(obj2);
        C(obj2, hVar, vVar);
        hVar.l();
    }

    @Override // v9.d, k9.k
    public final void h(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar, r9.c cVar) throws IOException {
        if (this.i != null) {
            q(obj2, hVar, vVar, cVar);
            return;
        }
        f9.d dVarS = s(cVar, obj2, com.fasterxml.jackson.core.n.START_ARRAY);
        cVar.e(hVar, dVarS);
        hVar.i(obj2);
        C(obj2, hVar, vVar);
        cVar.f(hVar, dVarS);
    }

    @Override // k9.k
    public final k9.k i(x9.n nVar) {
        return this.f278260l.i(nVar);
    }

    @Override // v9.d
    public final v9.d t() {
        return this;
    }

    public final String toString() {
        return "BeanAsArraySerializer for ".concat(this.f286928a.getName());
    }

    @Override // v9.d
    public final v9.d x(Set set, Set set2) {
        return new b(this, set, set2);
    }

    @Override // v9.d
    public final v9.d y(Object obj2) {
        return new b(this, this.i, obj2);
    }

    public b(b bVar, av0.b bVar2, Object obj2) {
        super(bVar, bVar2, obj2);
        this.f278260l = bVar;
    }

    public b(t9.d dVar) {
        super(dVar, (av0.b) null, dVar.f286912g);
        this.f278260l = dVar;
    }
}
