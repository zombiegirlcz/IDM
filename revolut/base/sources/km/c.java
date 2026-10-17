package km;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class c extends cam.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f185658b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(cam.f child, char c2) {
        super(child, false);
        Intrinsics.j(child, "child");
        this.f185658b = c2;
    }

    @Override // cam.f
    public final jji.e b(char c2) {
        char c3 = this.f185658b;
        return c3 == c2 ? new jji.e(u(), Character.valueOf(c2), true, null) : new jji.e(u(), Character.valueOf(c3), false, null);
    }

    @Override // cam.f
    public final jji.e c() {
        return new jji.e(u(), Character.valueOf(this.f185658b), false, null);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("");
        sb6.append(this.f185658b);
        sb6.append(" -> ");
        cam.f fVar = (cam.f) this.f22677a;
        sb6.append(fVar == null ? "null" : fVar.toString());
        return sb6.toString();
    }
}
