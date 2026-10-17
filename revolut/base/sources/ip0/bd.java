package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class bd extends cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f163582a;

    public bd(long j2) {
        this.f163582a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof bd) && this.f163582a == ((bd) obj2).f163582a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f163582a);
    }
}
