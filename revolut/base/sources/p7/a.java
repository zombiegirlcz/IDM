package p7;

import java.io.EOFException;
import java.util.ArrayList;
import le.u1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cpi.g f233457a = cpi.g.G("k", "x", "y");

    public static l7.d a(q7.e eVar, d7.j jVar) throws EOFException, q7.b {
        ArrayList arrayList = new ArrayList();
        if (eVar.n() == q7.c.BEGIN_ARRAY) {
            eVar.d();
            while (eVar.i()) {
                q7.e eVar2 = eVar;
                d7.j jVar2 = jVar;
                arrayList.add(new g7.l(jVar2, p.b(eVar2, jVar2, r7.l.c(), f.e, eVar.n() == q7.c.BEGIN_OBJECT, false)));
                eVar = eVar2;
                jVar = jVar2;
            }
            eVar.g();
            q.b(arrayList);
        } else {
            arrayList.add(new s7.a(o.b(eVar, r7.l.c())));
        }
        return new l7.d(arrayList);
    }

    public static l7.g b(q7.e eVar, d7.j jVar) throws EOFException, q7.b {
        eVar.f();
        l7.d dVarA = null;
        l7.b bVarN = null;
        boolean z = false;
        l7.b bVarN2 = null;
        while (eVar.n() != q7.c.END_OBJECT) {
            int iP = eVar.p(f233457a);
            if (iP == 0) {
                dVarA = a(eVar, jVar);
            } else if (iP != 1) {
                if (iP != 2) {
                    eVar.q();
                    eVar.r();
                } else if (eVar.n() == q7.c.STRING) {
                    eVar.r();
                    z = true;
                } else {
                    bVarN = u1.n(eVar, jVar, true);
                }
            } else if (eVar.n() == q7.c.STRING) {
                eVar.r();
                z = true;
            } else {
                bVarN2 = u1.n(eVar, jVar, true);
            }
        }
        eVar.h();
        if (z) {
            jVar.a("Lottie doesn't support expressions.");
        }
        return dVarA != null ? dVarA : new l7.e(bVarN2, bVarN);
    }
}
