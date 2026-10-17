package rq0;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f256431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f256432b;

    public a(boolean z, boolean z3) {
        this.f256431a = z;
        this.f256432b = z3;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f256432b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f256431a == aVar.f256431a && this.f256432b == aVar.f256432b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f256432b) + (Boolean.hashCode(this.f256431a) * 31);
    }
}
