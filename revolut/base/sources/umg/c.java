package umg;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f281312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f281313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f281314c;

    public c(int i, int i2, int i3) {
        this.f281312a = i;
        this.f281313b = i2;
        this.f281314c = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f281312a == cVar.f281312a && this.f281313b == cVar.f281313b && this.f281314c == cVar.f281314c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f281314c) + j6.a.b(this.f281313b, Integer.hashCode(this.f281312a) * 31, 31);
    }
}
