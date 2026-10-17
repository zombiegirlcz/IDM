package vnc;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f290791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f290792b;

    public a(int i, boolean z) {
        this.f290791a = i;
        this.f290792b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f290791a == aVar.f290791a && this.f290792b == aVar.f290792b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f290792b) + (Integer.hashCode(this.f290791a) * 31);
    }
}
