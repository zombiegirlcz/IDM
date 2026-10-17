package fpj;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yoj.c f137108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f137109b;

    public /* synthetic */ d(yoj.c cVar) {
        this(cVar, false);
    }

    public final boolean a() {
        return this.f137109b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f137108a == dVar.f137108a && this.f137109b == dVar.f137109b;
    }

    public final int hashCode() {
        yoj.c cVar = this.f137108a;
        return Boolean.hashCode(this.f137109b) + ((cVar == null ? 0 : cVar.hashCode()) * 31);
    }

    public d(yoj.c cVar, boolean z) {
        this.f137108a = cVar;
        this.f137109b = z;
    }
}
