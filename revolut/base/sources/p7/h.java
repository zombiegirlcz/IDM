package p7;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes16.dex */
public final class h implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f233478a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cpi.g f233479b = cpi.g.G("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // p7.g0
    public final Object a(q7.d dVar, float f) {
        k7.b bVar = k7.b.CENTER;
        dVar.f();
        String strM = null;
        float fK = 0.0f;
        float fK2 = 0.0f;
        float fK3 = 0.0f;
        float fK4 = 0.0f;
        int iL = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zJ = true;
        String strM2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (dVar.i()) {
            switch (dVar.p(f233479b)) {
                case 0:
                    strM = dVar.m();
                    break;
                case 1:
                    strM2 = dVar.m();
                    break;
                case 2:
                    fK = (float) dVar.k();
                    break;
                case 3:
                    int iL2 = dVar.l();
                    k7.b bVar2 = k7.b.CENTER;
                    bVar = (iL2 <= bVar2.ordinal() && iL2 >= 0) ? k7.b.values()[iL2] : bVar2;
                    break;
                case 4:
                    iL = dVar.l();
                    break;
                case 5:
                    fK2 = (float) dVar.k();
                    break;
                case 6:
                    fK3 = (float) dVar.k();
                    break;
                case 7:
                    iA = o.a(dVar);
                    break;
                case 8:
                    iA2 = o.a(dVar);
                    break;
                case 9:
                    fK4 = (float) dVar.k();
                    break;
                case 10:
                    zJ = dVar.j();
                    break;
                case 11:
                    dVar.d();
                    pointF = new PointF(((float) dVar.k()) * f, ((float) dVar.k()) * f);
                    dVar.g();
                    break;
                case 12:
                    dVar.d();
                    pointF2 = new PointF(((float) dVar.k()) * f, ((float) dVar.k()) * f);
                    dVar.g();
                    break;
                default:
                    dVar.q();
                    dVar.r();
                    break;
            }
        }
        dVar.h();
        k7.c cVar = new k7.c();
        cVar.f181752a = strM;
        cVar.f181753b = strM2;
        cVar.f181754c = fK;
        cVar.d = bVar;
        cVar.e = iL;
        cVar.f = fK2;
        cVar.f181755g = fK3;
        cVar.f181756h = iA;
        cVar.i = iA2;
        cVar.f181757j = fK4;
        cVar.k = zJ;
        cVar.f181758l = pointF;
        cVar.f181759m = pointF2;
        return cVar;
    }
}
