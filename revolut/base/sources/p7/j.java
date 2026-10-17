package p7;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cpi.g f233484a = cpi.g.G("ch", "size", "w", "style", "fFamily", "data");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cpi.g f233485b = cpi.g.G("shapes");

    public static k7.e a(q7.e eVar, d7.j jVar) {
        ArrayList arrayList = new ArrayList();
        eVar.f();
        String strM = null;
        String strM2 = null;
        double dK = 0.0d;
        char cCharAt = 0;
        while (eVar.i()) {
            int iP = eVar.p(f233484a);
            if (iP == 0) {
                cCharAt = eVar.m().charAt(0);
            } else if (iP == 1) {
                eVar.k();
            } else if (iP == 2) {
                dK = eVar.k();
            } else if (iP == 3) {
                strM = eVar.m();
            } else if (iP == 4) {
                strM2 = eVar.m();
            } else if (iP != 5) {
                eVar.q();
                eVar.r();
            } else {
                eVar.f();
                while (eVar.i()) {
                    if (eVar.p(f233485b) != 0) {
                        eVar.q();
                        eVar.r();
                    } else {
                        eVar.d();
                        while (eVar.i()) {
                            arrayList.add((m7.s) g.a(eVar, jVar));
                        }
                        eVar.g();
                    }
                }
                eVar.h();
            }
        }
        eVar.h();
        return new k7.e(arrayList, cCharAt, dK, strM, strM2);
    }
}
