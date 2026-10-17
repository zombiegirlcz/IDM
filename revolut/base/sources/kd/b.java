package kd;

import ad.g;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f182758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f182759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f182760c;
    public final String d;

    public b(g gVar, int i, String str, String str2) {
        this.f182758a = gVar;
        this.f182759b = i;
        this.f182760c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f182758a == bVar.f182758a && this.f182759b == bVar.f182759b && this.f182760c.equals(bVar.f182760c) && this.d.equals(bVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.f182758a, Integer.valueOf(this.f182759b), this.f182760c, this.d);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("(status=");
        sb6.append(this.f182758a);
        sb6.append(", keyId=");
        sb6.append(this.f182759b);
        sb6.append(", keyType='");
        return j6.a.w(sb6, this.f182760c, "', keyPrefix='", this.d, "')");
    }
}
