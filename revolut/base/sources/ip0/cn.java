package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class cn implements dn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f163763a;

    public cn(int i) {
        this.f163763a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof cn) && this.f163763a == ((cn) obj2).f163763a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f163763a);
    }
}
