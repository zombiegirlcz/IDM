package zk1;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f322883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f322884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f322885c;

    public a(float f, float f4, boolean z) {
        this.f322883a = f;
        this.f322884b = f4;
        this.f322885c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Float.compare(this.f322883a, aVar.f322883a) == 0 && Float.compare(this.f322884b, aVar.f322884b) == 0 && this.f322885c == aVar.f322885c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f322885c) + m72.b.b(this.f322884b, Float.hashCode(this.f322883a) * 31, 31);
    }
}
