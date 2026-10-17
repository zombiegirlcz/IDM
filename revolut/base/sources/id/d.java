package id;

import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public final class d extends bd.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f160355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f160356c;
    public final c d;

    public d(int i, int i2, c cVar) {
        this.f160355b = i;
        this.f160356c = i2;
        this.d = cVar;
    }

    public final int b() {
        c cVar = c.f;
        int i = this.f160356c;
        c cVar2 = this.d;
        if (cVar2 == cVar) {
            return i;
        }
        if (cVar2 != c.f160346c && cVar2 != c.d && cVar2 != c.e) {
            throw new IllegalStateException("Unknown variant");
        }
        return i + 5;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return dVar.f160355b == this.f160355b && dVar.b() == b() && dVar.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f160355b), Integer.valueOf(this.f160356c), this.d);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb6.append(this.d);
        sb6.append(", ");
        sb6.append(this.f160356c);
        sb6.append("-byte tags, and ");
        return j6.a.v(sb6, "-byte key)", this.f160355b);
    }
}
