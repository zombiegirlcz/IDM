package sh1;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f263342a;

    public d(int i) {
        this.f263342a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f263342a == ((d) obj2).f263342a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f263342a);
    }
}
