package fpk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f137123c;
    public final String d;
    public final String e;
    public final String f;

    public d(String from, String to6, String askRate, String bidRate, String midRate, String str) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(askRate, "askRate");
        Intrinsics.checkNotNullParameter(bidRate, "bidRate");
        Intrinsics.checkNotNullParameter(midRate, "midRate");
        this.f137121a = from;
        this.f137122b = to6;
        this.f137123c = askRate;
        this.d = bidRate;
        this.e = midRate;
        this.f = str;
    }

    public final String a() {
        return this.f137123c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.f137121a;
    }

    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f137121a, dVar.f137121a) && Intrinsics.f(this.f137122b, dVar.f137122b) && Intrinsics.f(this.f137123c, dVar.f137123c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final String f() {
        return this.f137122b;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(this.f137121a.hashCode() * 31, 31, this.f137122b), 31, this.f137123c), 31, this.d), 31, this.e);
        String str = this.f;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
