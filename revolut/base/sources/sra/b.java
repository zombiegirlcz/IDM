package sra;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f265153c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f265154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f265155h;

    public b(String id10, String firstName, String lastName, String str, String str2, String type, a card, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(card, "card");
        this.f265151a = id10;
        this.f265152b = firstName;
        this.f265153c = lastName;
        this.d = str;
        this.e = str2;
        this.f = type;
        this.f265154g = card;
        this.f265155h = z;
    }

    public final a a() {
        return this.f265154g;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.f265152b;
    }

    public final String d() {
        return this.f265151a;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f265151a, bVar.f265151a) && Intrinsics.f(this.f265152b, bVar.f265152b) && Intrinsics.f(this.f265153c, bVar.f265153c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f265154g, bVar.f265154g) && this.f265155h == bVar.f265155h;
    }

    public final String f() {
        return this.f265153c;
    }

    public final boolean g() {
        return this.f265155h;
    }

    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f265151a.hashCode() * 31, 31, this.f265152b), 31, this.f265153c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return Boolean.hashCode(this.f265155h) + ((this.f265154g.hashCode() + p.a.c((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f)) * 31);
    }
}
