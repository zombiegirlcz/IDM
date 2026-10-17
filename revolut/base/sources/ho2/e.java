package ho2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f154204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154206c;

    public e(String prefix, String number, wi0.b country) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(number, "number");
        this.f154204a = country;
        this.f154205b = prefix;
        this.f154206c = number;
    }

    public static e a(e eVar, wi0.b country, String prefix, String number, int i) {
        if ((i & 1) != 0) {
            country = eVar.f154204a;
        }
        if ((i & 2) != 0) {
            prefix = eVar.f154205b;
        }
        if ((i & 4) != 0) {
            number = eVar.f154206c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(number, "number");
        return new e(prefix, number, country);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f154204a, eVar.f154204a) && Intrinsics.f(this.f154205b, eVar.f154205b) && Intrinsics.f(this.f154206c, eVar.f154206c);
    }

    public final int hashCode() {
        return this.f154206c.hashCode() + p.a.c(this.f154204a.f297794a.hashCode() * 31, 31, this.f154205b);
    }
}
