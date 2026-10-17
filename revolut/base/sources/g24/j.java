package g24;

import kotlin.NoWhenBranchMatchedException;
import ou3.o;

/* JADX INFO: loaded from: classes22.dex */
public abstract class j {
    public static final ou3.f a(h hVar) {
        if (hVar instanceof c) {
            return ou3.a.f229784a;
        }
        if (hVar instanceof d) {
            return new ou3.b(((d) hVar).getDeeplink());
        }
        if (hVar instanceof e) {
            return ou3.c.f229786a;
        }
        if (hVar instanceof f) {
            f fVar = (f) hVar;
            return new ou3.d(new ou3.n(fVar.getTitle(), fVar.getDescription(), fVar.getButtonTitle()));
        }
        if (!(hVar instanceof g)) {
            throw new NoWhenBranchMatchedException();
        }
        g gVar = (g) hVar;
        return new ou3.e(new o(gVar.getTitle(), gVar.getDescription(), gVar.getImage(), gVar.getButtonTitle()));
    }

    public static final h b(ou3.f fVar) {
        if (fVar instanceof ou3.a) {
            return c.f139853a;
        }
        if (fVar instanceof ou3.b) {
            return new d(((ou3.b) fVar).f229785a);
        }
        if (fVar instanceof ou3.c) {
            return e.f139855a;
        }
        if (fVar instanceof ou3.d) {
            ou3.n nVar = ((ou3.d) fVar).f229787a;
            return new f(nVar.f229804a, nVar.f229805b, nVar.f229806c);
        }
        if (!(fVar instanceof ou3.e)) {
            throw new NoWhenBranchMatchedException();
        }
        o oVar = ((ou3.e) fVar).f229788a;
        return new g(oVar.f229807a, oVar.f229808b, oVar.f229809c, oVar.d);
    }
}
