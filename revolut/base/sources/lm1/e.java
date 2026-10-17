package lm1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lk0.g f196853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f196854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xo1.g f196855c;
    public final xo1.b d;

    public e(lk0.g billers, String searchQuery, xo1.g paymentMethod, xo1.b bVar) {
        Intrinsics.checkNotNullParameter(billers, "billers");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.f196853a = billers;
        this.f196854b = searchQuery;
        this.f196855c = paymentMethod;
        this.d = bVar;
    }

    public static e a(e eVar, lk0.g billers, String searchQuery, int i) {
        if ((i & 1) != 0) {
            billers = eVar.f196853a;
        }
        if ((i & 2) != 0) {
            searchQuery = eVar.f196854b;
        }
        xo1.g paymentMethod = eVar.f196855c;
        xo1.b bVar = eVar.d;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(billers, "billers");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        return new e(billers, searchQuery, paymentMethod, bVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f196853a, eVar.f196853a) && Intrinsics.f(this.f196854b, eVar.f196854b) && this.f196855c == eVar.f196855c && this.d == eVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f196855c.hashCode() + p.a.c(this.f196853a.f196174a.hashCode() * 31, 31, this.f196854b)) * 31;
        xo1.b bVar = this.d;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
