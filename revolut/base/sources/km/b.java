package km;

/* JADX INFO: loaded from: classes17.dex */
public final class b extends cam.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f185657b;

    public b(cam.f fVar, char c2) {
        super(fVar, false);
        this.f185657b = c2;
    }

    @Override // cam.f
    public final jji.e b(char c2) {
        char c3 = this.f185657b;
        return c3 == c2 ? new jji.e(u(), Character.valueOf(c2), true, Character.valueOf(c2)) : new jji.e(u(), Character.valueOf(c3), false, Character.valueOf(c3));
    }

    @Override // cam.f
    public final jji.e c() {
        cam.f fVarU = u();
        char c2 = this.f185657b;
        return new jji.e(fVarU, Character.valueOf(c2), false, Character.valueOf(c2));
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("{");
        sb6.append(this.f185657b);
        sb6.append("} -> ");
        cam.f fVar = (cam.f) this.f22677a;
        sb6.append(fVar == null ? "null" : fVar.toString());
        return sb6.toString();
    }
}
