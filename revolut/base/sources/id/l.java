package id;

import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public final class l extends bd.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f160365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f160366c;
    public final c d;
    public final c e;

    public l(int i, int i2, c cVar, c cVar2) {
        this.f160365b = i;
        this.f160366c = i2;
        this.d = cVar;
        this.e = cVar2;
    }

    public final int b() {
        c cVar = c.o;
        int i = this.f160366c;
        c cVar2 = this.d;
        if (cVar2 == cVar) {
            return i;
        }
        if (cVar2 != c.f160350l && cVar2 != c.f160351m && cVar2 != c.f160352n) {
            throw new IllegalStateException("Unknown variant");
        }
        return i + 5;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return lVar.f160365b == this.f160365b && lVar.b() == b() && lVar.d == this.d && lVar.e == this.e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f160365b), Integer.valueOf(this.f160366c), this.d, this.e);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("HMAC Parameters (variant: ");
        sb6.append(this.d);
        sb6.append(", hashType: ");
        sb6.append(this.e);
        sb6.append(", ");
        sb6.append(this.f160366c);
        sb6.append("-byte tags, and ");
        return j6.a.v(sb6, "-byte key)", this.f160365b);
    }
}
