package pr4;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f238929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f238930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f238931c;

    public c(int i, int i2, int i3) {
        this.f238929a = i;
        this.f238930b = i2;
        this.f238931c = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f238929a == cVar.f238929a && this.f238930b == cVar.f238930b && this.f238931c == cVar.f238931c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f238931c) + j6.a.b(this.f238930b, Integer.hashCode(this.f238929a) * 31, 31);
    }
}
