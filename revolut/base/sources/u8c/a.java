package u8c;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f278157a;

    public a(boolean z) {
        this.f278157a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f278157a == ((a) obj2).f278157a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f278157a);
    }
}
