package wb;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f295984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f295985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f295986c;

    public a(Object obj2, e eVar, b bVar) {
        if (obj2 == null) {
            throw new NullPointerException("Null payload");
        }
        this.f295984a = obj2;
        if (eVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f295985b = eVar;
        this.f295986c = bVar;
    }

    public final boolean equals(Object obj2) {
        f fVar;
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof d) {
            a aVar = (a) ((d) obj2);
            f fVar2 = aVar.f295986c;
            if (this.f295984a.equals(aVar.f295984a) && this.f295985b.equals(aVar.f295985b) && ((fVar = this.f295986c) != null ? fVar.equals(fVar2) : fVar2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.f295984a.hashCode()) * 1000003) ^ this.f295985b.hashCode()) * 1000003;
        f fVar = this.f295986c;
        return (iHashCode ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f295984a + ", priority=" + this.f295985b + ", productData=" + this.f295986c + ", eventContext=null}";
    }
}
