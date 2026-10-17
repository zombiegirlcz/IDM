package b9;

/* JADX INFO: loaded from: classes16.dex */
public final class z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f13515c = new z(x.none, null);
    public static final z d = new z(x.xMidYMid, y.meet);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f13516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f13517b;

    public z(x xVar, y yVar) {
        this.f13516a = xVar;
        this.f13517b = yVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || z.class != obj2.getClass()) {
            return false;
        }
        z zVar = (z) obj2;
        return this.f13516a == zVar.f13516a && this.f13517b == zVar.f13517b;
    }

    public final String toString() {
        return this.f13516a + " " + this.f13517b;
    }
}
