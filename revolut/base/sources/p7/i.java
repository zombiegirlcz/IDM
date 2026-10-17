package p7;

import le.u1;

/* JADX INFO: loaded from: classes16.dex */
public final class i {
    public static final cpi.g f = cpi.g.G("ef");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final cpi.g f233480g = cpi.g.G("nm", "v");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l7.a f233481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l7.b f233482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l7.b f233483c;
    public l7.b d;
    public l7.b e;

    public final com.google.firebase.messaging.u a(q7.e eVar, d7.j jVar) {
        l7.b bVar;
        l7.b bVar2;
        l7.b bVar3;
        l7.b bVar4;
        while (eVar.i()) {
            if (eVar.p(f) != 0) {
                eVar.q();
                eVar.r();
            } else {
                eVar.d();
                while (eVar.i()) {
                    eVar.f();
                    String strM = "";
                    while (eVar.i()) {
                        int iP = eVar.p(f233480g);
                        if (iP == 0) {
                            strM = eVar.m();
                        } else if (iP == 1) {
                            strM.getClass();
                            switch (strM) {
                                case "Distance":
                                    this.d = u1.n(eVar, jVar, true);
                                    break;
                                case "Opacity":
                                    this.f233482b = u1.n(eVar, jVar, false);
                                    break;
                                case "Direction":
                                    this.f233483c = u1.n(eVar, jVar, false);
                                    break;
                                case "Shadow Color":
                                    this.f233481a = u1.m(eVar, jVar);
                                    break;
                                case "Softness":
                                    this.e = u1.n(eVar, jVar, true);
                                    break;
                                default:
                                    eVar.r();
                                    break;
                            }
                        } else {
                            eVar.q();
                            eVar.r();
                        }
                    }
                    eVar.h();
                }
                eVar.g();
            }
        }
        l7.a aVar = this.f233481a;
        if (aVar == null || (bVar = this.f233482b) == null || (bVar2 = this.f233483c) == null || (bVar3 = this.d) == null || (bVar4 = this.e) == null) {
            return null;
        }
        return new com.google.firebase.messaging.u(aVar, bVar, bVar2, bVar3, bVar4);
    }
}
