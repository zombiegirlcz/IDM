package p7;

import le.u1;

/* JADX INFO: loaded from: classes16.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cpi.g f233467a = cpi.g.G("ef");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cpi.g f233468b = cpi.g.G("ty", "v");

    public static yf.c a(q7.e eVar, d7.j jVar) {
        yf.c cVar = null;
        while (eVar.i()) {
            if (eVar.p(f233467a) != 0) {
                eVar.q();
                eVar.r();
            } else {
                eVar.d();
                while (eVar.i()) {
                    eVar.f();
                    yf.c cVar2 = null;
                    while (true) {
                        boolean z = false;
                        while (eVar.i()) {
                            int iP = eVar.p(f233468b);
                            if (iP != 0) {
                                if (iP != 1) {
                                    eVar.q();
                                    eVar.r();
                                } else if (z) {
                                    cVar2 = new yf.c(u1.n(eVar, jVar, true), 16);
                                } else {
                                    eVar.r();
                                }
                            } else if (eVar.l() == 0) {
                                z = true;
                            }
                        }
                    }
                    eVar.h();
                    if (cVar2 != null) {
                        cVar = cVar2;
                    }
                }
                eVar.g();
            }
        }
        return cVar;
    }
}
