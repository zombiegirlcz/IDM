package km;

import kotlin.NoWhenBranchMatchedException;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes17.dex */
public final class n extends cam.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gc0.c f185665b;

    public n(gc0.c cVar) {
        super(null, false);
        this.f185665b = new k(cVar);
    }

    @Override // cam.f
    public final jji.e b(char c2) {
        boolean zK;
        gc0.c cVar = this.f185665b;
        if (cVar instanceof m) {
            zK = Character.isDigit(c2);
        } else if (cVar instanceof l) {
            zK = Character.isLetter(c2);
        } else if (cVar instanceof i) {
            zK = Character.isLetterOrDigit(c2);
        } else if (cVar instanceof k) {
            gc0.c cVar2 = ((k) cVar).f185664a;
            zK = cVar2 instanceof m ? Character.isDigit(c2) : cVar2 instanceof l ? Character.isLetter(c2) : cVar2 instanceof i ? Character.isLetterOrDigit(c2) : false;
        } else {
            if (!(cVar instanceof j)) {
                throw new NoWhenBranchMatchedException();
            }
            zK = d0.K(((j) cVar).f185663b, c2);
        }
        if (zK) {
            return new jji.e(u(), Character.valueOf(c2), true, Character.valueOf(c2));
        }
        return null;
    }

    public final String toString() {
        cam.f fVar = (cam.f) this.f22677a;
        gc0.c cVar = this.f185665b;
        if (cVar instanceof l) {
            StringBuilder sb6 = new StringBuilder("[A] -> ");
            sb6.append(fVar != null ? fVar.toString() : "null");
            return sb6.toString();
        }
        if (cVar instanceof m) {
            StringBuilder sb9 = new StringBuilder("[0] -> ");
            sb9.append(fVar != null ? fVar.toString() : "null");
            return sb9.toString();
        }
        if (cVar instanceof i) {
            StringBuilder sb10 = new StringBuilder("[_] -> ");
            sb10.append(fVar != null ? fVar.toString() : "null");
            return sb10.toString();
        }
        if (cVar instanceof k) {
            StringBuilder sb11 = new StringBuilder("[…] -> ");
            sb11.append(fVar != null ? fVar.toString() : "null");
            return sb11.toString();
        }
        if (!(cVar instanceof j)) {
            throw new NoWhenBranchMatchedException();
        }
        StringBuilder sb12 = new StringBuilder("[");
        sb12.append(((j) cVar).f185662a);
        sb12.append("] -> ");
        sb12.append(fVar != null ? fVar.toString() : "null");
        return sb12.toString();
    }

    @Override // cam.f
    public final cam.f u() {
        return this.f185665b instanceof k ? this : super.u();
    }

    public n(cam.f fVar, gc0.c cVar) {
        super(fVar, false);
        this.f185665b = cVar;
    }
}
