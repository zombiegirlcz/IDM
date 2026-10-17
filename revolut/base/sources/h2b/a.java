package h2b;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f148764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f148765b;

    public a(boolean z, boolean z3) {
        this.f148764a = z;
        this.f148765b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f148764a == aVar.f148764a && this.f148765b == aVar.f148765b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f148765b) + (Boolean.hashCode(this.f148764a) * 31);
    }
}
