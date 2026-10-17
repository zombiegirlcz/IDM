package ku0;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Number f189578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Number f189579b;

    public b(Number number, Number number2) {
        this.f189578a = number;
        this.f189579b = number2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f189578a.equals(bVar.f189578a) && this.f189579b.equals(bVar.f189579b);
    }

    public final int hashCode() {
        return this.f189579b.hashCode() + (this.f189578a.hashCode() * 31);
    }
}
