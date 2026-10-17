package p7;

import java.io.EOFException;

/* JADX INFO: loaded from: classes16.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cpi.g f233486a = cpi.g.G("fFamily", "fName", "fStyle", "ascent");

    public static k7.d a(q7.e eVar) throws EOFException, q7.b {
        eVar.f();
        String strM = null;
        String strM2 = null;
        String strM3 = null;
        while (eVar.i()) {
            int iP = eVar.p(f233486a);
            if (iP == 0) {
                strM = eVar.m();
            } else if (iP == 1) {
                strM2 = eVar.m();
            } else if (iP == 2) {
                strM3 = eVar.m();
            } else if (iP != 3) {
                eVar.q();
                eVar.r();
            } else {
                eVar.k();
            }
        }
        eVar.h();
        return new k7.d(strM, strM2, strM3);
    }
}
