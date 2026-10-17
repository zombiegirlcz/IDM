package mha;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f205462a;

    public o(long j2) {
        this.f205462a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f205462a == ((o) obj2).f205462a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f205462a);
    }
}
