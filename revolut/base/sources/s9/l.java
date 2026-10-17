package s9;

import com.fasterxml.jackson.core.n;

/* JADX INFO: loaded from: classes16.dex */
public abstract class l extends r9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f261084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k9.d f261085b;

    public l(j jVar, k9.d dVar) {
        this.f261084a = jVar;
        this.f261085b = dVar;
    }

    @Override // r9.c
    public String b() {
        return null;
    }

    @Override // r9.c
    public final f9.d e(com.fasterxml.jackson.core.h hVar, f9.d dVar) {
        if (dVar.d == null) {
            Object obj2 = dVar.f132795a;
            Class cls = (Class) dVar.f132797c;
            j jVar = this.f261084a;
            dVar.d = cls == null ? jVar.a(obj2) : jVar.b(obj2, cls);
        }
        hVar.getClass();
        Object obj3 = dVar.d;
        n nVar = (n) dVar.f132798g;
        String strValueOf = obj3 instanceof String ? (String) obj3 : String.valueOf(obj3);
        dVar.f132796b = true;
        i9.a aVar = (i9.a) dVar.f;
        n nVar2 = n.START_OBJECT;
        if (nVar != nVar2) {
            aVar.getClass();
            if (aVar == i9.a.METADATA_PROPERTY || aVar == i9.a.PAYLOAD_PROPERTY) {
                aVar = i9.a.WRAPPER_ARRAY;
                dVar.f = aVar;
            }
        }
        int i = com.fasterxml.jackson.core.f.f26173a[aVar.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                hVar.A(dVar.f132795a);
                hVar.o((String) dVar.e);
                hVar.B(strValueOf);
                return dVar;
            }
            if (i != 4) {
                hVar.w();
                hVar.B(strValueOf);
            } else {
                hVar.z();
                hVar.o(strValueOf);
            }
        }
        if (nVar == nVar2) {
            hVar.A(dVar.f132795a);
            return dVar;
        }
        if (nVar == n.START_ARRAY) {
            hVar.w();
        }
        return dVar;
    }

    @Override // r9.c
    public final f9.d f(com.fasterxml.jackson.core.h hVar, f9.d dVar) {
        hVar.getClass();
        n nVar = (n) dVar.f132798g;
        if (nVar == n.START_OBJECT) {
            hVar.m();
        } else if (nVar == n.START_ARRAY) {
            hVar.l();
        }
        if (dVar.f132796b) {
            int i = com.fasterxml.jackson.core.f.f26173a[((i9.a) dVar.f).ordinal()];
            if (i == 1) {
                Object obj2 = dVar.d;
                String strValueOf = obj2 instanceof String ? (String) obj2 : String.valueOf(obj2);
                hVar.o((String) dVar.e);
                hVar.B(strValueOf);
            } else if (i != 2 && i != 3) {
                if (i != 5) {
                    hVar.m();
                    return dVar;
                }
                hVar.l();
                return dVar;
            }
        }
        return dVar;
    }
}
