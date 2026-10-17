package yem;

import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f313099a;
    public boolean d;
    public boolean f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f313103h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f313100b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f313101c = 0;
    public String e = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f313102g = false;
    public int i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f313104j = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f313105l = "";
    public final n k = n.UNSPECIFIED;

    public final int a() {
        return this.f313100b;
    }

    public final String b() {
        return this.e;
    }

    public final long c() {
        return this.f313101c;
    }

    public final int d() {
        return this.i;
    }

    public final String e() {
        return this.f313104j;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        if (this == oVar) {
            return true;
        }
        return this.f313100b == oVar.f313100b && this.f313101c == oVar.f313101c && this.e.equals(oVar.e) && this.f313102g == oVar.f313102g && this.i == oVar.i && this.f313104j.equals(oVar.f313104j) && this.k == oVar.k && this.f313105l.equals(oVar.f313105l);
    }

    public final boolean f() {
        return this.f313099a;
    }

    public final boolean h() {
        return this.d;
    }

    public final int hashCode() {
        return p.a.c((this.k.hashCode() + p.a.c((((p.a.c((Long.valueOf(this.f313101c).hashCode() + ((2173 + this.f313100b) * 53)) * 53, 53, this.e) + (this.f313102g ? 1231 : 1237)) * 53) + this.i) * 53, 53, this.f313104j)) * 53, 53, this.f313105l) + 1237;
    }

    public final boolean i() {
        return this.f313102g;
    }

    public final void k(int i) {
        this.f313099a = true;
        this.f313100b = i;
    }

    public final void l(String str) {
        this.d = true;
        this.e = str;
    }

    public final void m() {
        this.f = true;
        this.f313102g = true;
    }

    public final void n(long j2) {
        this.f313101c = j2;
    }

    public final void o(int i) {
        this.f313103h = true;
        this.i = i;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Country Code: ");
        sb6.append(this.f313100b);
        sb6.append(" National Number: ");
        sb6.append(this.f313101c);
        if (this.f && this.f313102g) {
            sb6.append(" Leading Zero(s): true");
        }
        if (this.f313103h) {
            sb6.append(" Number of leading zeros: ");
            sb6.append(this.i);
        }
        if (this.d) {
            sb6.append(" Extension: ");
            sb6.append(this.e);
        }
        return sb6.toString();
    }
}
