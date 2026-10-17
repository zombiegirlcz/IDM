package p7;

import java.util.Collections;
import le.u1;

/* JADX INFO: loaded from: classes16.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cpi.g f233460a = cpi.g.G("s", "a");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cpi.g f233461b = cpi.g.G("s", "e", "o", "r");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final cpi.g f233462c = cpi.g.G("fc", "sc", "sw", "t", "o");

    public static cpi.g a(q7.e eVar, d7.j jVar) {
        eVar.f();
        a5h.g gVar = null;
        h30.q qVar = null;
        while (eVar.i()) {
            int iP = eVar.p(f233460a);
            if (iP == 0) {
                eVar.f();
                l7.a aVar = null;
                l7.a aVarO = null;
                l7.a aVarO2 = null;
                m7.a0 a0Var = null;
                while (eVar.i()) {
                    int iP2 = eVar.p(f233461b);
                    if (iP2 == 0) {
                        aVar = u1.o(eVar, jVar);
                    } else if (iP2 == 1) {
                        aVarO = u1.o(eVar, jVar);
                    } else if (iP2 == 2) {
                        aVarO2 = u1.o(eVar, jVar);
                    } else if (iP2 != 3) {
                        eVar.q();
                        eVar.r();
                    } else {
                        int iL = eVar.l();
                        if (iL == 1 || iL == 2) {
                            a0Var = iL == 1 ? m7.a0.PERCENT : m7.a0.INDEX;
                        } else {
                            jVar.a("Unsupported text range units: " + iL);
                            a0Var = m7.a0.INDEX;
                        }
                    }
                }
                eVar.h();
                if (aVar == null && aVarO != null) {
                    aVar = new l7.a(Collections.singletonList(new s7.a(0)), 1);
                }
                qVar = new h30.q(aVar, aVarO, aVarO2, a0Var, 29);
            } else if (iP != 1) {
                eVar.q();
                eVar.r();
            } else {
                eVar.f();
                l7.a aVarM = null;
                l7.a aVarM2 = null;
                l7.b bVarN = null;
                l7.b bVarN2 = null;
                l7.a aVarO3 = null;
                while (eVar.i()) {
                    int iP3 = eVar.p(f233462c);
                    if (iP3 == 0) {
                        aVarM = u1.m(eVar, jVar);
                    } else if (iP3 == 1) {
                        aVarM2 = u1.m(eVar, jVar);
                    } else if (iP3 == 2) {
                        bVarN = u1.n(eVar, jVar, true);
                    } else if (iP3 == 3) {
                        bVarN2 = u1.n(eVar, jVar, true);
                    } else if (iP3 != 4) {
                        eVar.q();
                        eVar.r();
                    } else {
                        aVarO3 = u1.o(eVar, jVar);
                    }
                }
                eVar.h();
                gVar = new a5h.g(aVarM, aVarM2, bVarN, bVarN2, aVarO3, 22);
            }
        }
        eVar.h();
        return new cpi.g(gVar, qVar, 16);
    }
}
