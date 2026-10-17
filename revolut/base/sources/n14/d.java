package n14;

import kotlin.NoWhenBranchMatchedException;
import ou3.n;
import ou3.o;

/* JADX INFO: loaded from: classes22.dex */
public abstract class d {
    public static final ou3.f a(q04.h hVar) {
        if (hVar instanceof q04.c) {
            return ou3.a.f229784a;
        }
        if (hVar instanceof q04.d) {
            return new ou3.b(((q04.d) hVar).getDeeplink());
        }
        if (hVar instanceof q04.e) {
            return ou3.c.f229786a;
        }
        if (hVar instanceof q04.f) {
            q04.f fVar = (q04.f) hVar;
            return new ou3.d(new n(fVar.getTitle(), fVar.getDescription(), fVar.getButtonTitle()));
        }
        if (!(hVar instanceof q04.g)) {
            throw new NoWhenBranchMatchedException();
        }
        q04.g gVar = (q04.g) hVar;
        return new ou3.e(new o(gVar.getTitle(), gVar.getDescription(), gVar.getImage(), gVar.getButtonTitle()));
    }
}
