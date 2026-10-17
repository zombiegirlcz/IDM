package ar9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8574c;
    public final String d;
    public final e e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f8575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f8576h;
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f8577j;

    public r(String id10, String name, String str, String str2, e eVar, boolean z, long j2, Long l2, d settings, a aVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f8572a = id10;
        this.f8573b = name;
        this.f8574c = str;
        this.d = str2;
        this.e = eVar;
        this.f = z;
        this.f8575g = j2;
        this.f8576h = l2;
        this.i = settings;
        this.f8577j = aVar;
    }

    public final a a() {
        return this.f8577j;
    }

    public final e b() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f8572a;
    }

    public final String e() {
        return this.f8574c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f8572a, rVar.f8572a) && Intrinsics.f(this.f8573b, rVar.f8573b) && Intrinsics.f(this.f8574c, rVar.f8574c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e) && this.f == rVar.f && this.f8575g == rVar.f8575g && Intrinsics.f(this.f8576h, rVar.f8576h) && Intrinsics.f(this.i, rVar.i) && Intrinsics.f(this.f8577j, rVar.f8577j);
    }

    public final Long f() {
        return this.f8576h;
    }

    public final String g() {
        return this.f8573b;
    }

    public final d h() {
        return this.i;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f8572a.hashCode() * 31, 31, this.f8573b);
        String str = this.f8574c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        e eVar = this.e;
        int iC2 = a0.d.c(j6.a.c((iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31, 31, this.f), 31, this.f8575g);
        Long l2 = this.f8576h;
        int iHashCode3 = (this.i.hashCode() + ((iC2 + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31;
        a aVar = this.f8577j;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final long i() {
        return this.f8575g;
    }

    public final boolean j() {
        return this.f;
    }
}
