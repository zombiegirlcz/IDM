package r9;

import com.fasterxml.jackson.core.h;
import com.fasterxml.jackson.core.n;
import d9.r0;
import j9.l;
import k9.d;

/* JADX INFO: loaded from: classes16.dex */
public abstract class c {
    public abstract c a(d dVar);

    public abstract String b();

    public abstract r0 c();

    public final f9.d d(Object obj2, n nVar) {
        f9.d dVar = new f9.d(obj2, nVar);
        int i = b.f252473a[c().ordinal()];
        if (i == 1) {
            dVar.f = i9.a.PAYLOAD_PROPERTY;
            dVar.e = b();
            return dVar;
        }
        if (i == 2) {
            dVar.f = i9.a.PARENT_PROPERTY;
            dVar.e = b();
            return dVar;
        }
        if (i == 3) {
            dVar.f = i9.a.METADATA_PROPERTY;
            dVar.e = b();
            return dVar;
        }
        if (i == 4) {
            dVar.f = i9.a.WRAPPER_ARRAY;
            return dVar;
        }
        if (i == 5) {
            dVar.f = i9.a.WRAPPER_OBJECT;
            return dVar;
        }
        l.a();
        throw null;
    }

    public abstract f9.d e(h hVar, f9.d dVar);

    public abstract f9.d f(h hVar, f9.d dVar);
}
