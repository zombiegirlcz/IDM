package km;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes17.dex */
public final class h extends cam.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g4i.a f185661b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(cam.f child, g4i.a aVar) {
        super(child, false);
        Intrinsics.j(child, "child");
        this.f185661b = aVar;
    }

    @Override // cam.f
    public final jji.e b(char c2) {
        boolean zK;
        g4i.a aVar = this.f185661b;
        if (aVar instanceof g) {
            zK = Character.isDigit(c2);
        } else if (aVar instanceof f) {
            zK = Character.isLetter(c2);
        } else if (aVar instanceof d) {
            zK = Character.isLetterOrDigit(c2);
        } else {
            if (!(aVar instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            zK = d0.K(((e) aVar).f185660b, c2);
        }
        return zK ? new jji.e(u(), Character.valueOf(c2), true, Character.valueOf(c2)) : new jji.e(u(), null, false, null);
    }

    public final String toString() {
        cam.f fVar = (cam.f) this.f22677a;
        g4i.a aVar = this.f185661b;
        if (aVar instanceof f) {
            StringBuilder sb6 = new StringBuilder("[a] -> ");
            sb6.append(fVar != null ? fVar.toString() : "null");
            return sb6.toString();
        }
        if (aVar instanceof g) {
            StringBuilder sb9 = new StringBuilder("[9] -> ");
            sb9.append(fVar != null ? fVar.toString() : "null");
            return sb9.toString();
        }
        if (aVar instanceof d) {
            StringBuilder sb10 = new StringBuilder("[-] -> ");
            sb10.append(fVar != null ? fVar.toString() : "null");
            return sb10.toString();
        }
        if (!(aVar instanceof e)) {
            throw new NoWhenBranchMatchedException();
        }
        StringBuilder sb11 = new StringBuilder("[");
        sb11.append(((e) aVar).f185659a);
        sb11.append("] -> ");
        sb11.append(fVar != null ? fVar.toString() : "null");
        return sb11.toString();
    }
}
