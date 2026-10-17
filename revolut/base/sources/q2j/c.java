package q2j;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends d {
    public final xi0.b d;
    public final String e;
    public final io3.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f241664g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xi0.b currency, String name, io3.d dVar, dj0.d dVar2) {
        super(currency.f306286a, dVar != null ? dVar.f163145a : null, currency);
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(name, "name");
        this.d = currency;
        this.e = name;
        this.f = dVar;
        this.f241664g = dVar2;
    }

    @Override // q2j.d
    public final d a(dj0.d balanceInBaseCurrency) {
        Intrinsics.checkNotNullParameter(balanceInBaseCurrency, "balanceInBaseCurrency");
        xi0.b currency = this.d;
        Intrinsics.checkNotNullParameter(currency, "currency");
        String name = this.e;
        Intrinsics.checkNotNullParameter(name, "name");
        return new c(currency, name, this.f, balanceInBaseCurrency);
    }

    @Override // q2j.d
    public final boolean b(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(query, "query");
        return (!d0.W(query) && kotlin.text.a0.H(cp5.d.K(e()), query, true)) || jli.g.a(this.e, query);
    }

    @Override // q2j.d
    public final dj0.d c() {
        return this.f241664g;
    }

    @Override // q2j.d
    public final dj0.d d() {
        io3.d dVar = this.f;
        if (dVar != null) {
            return io3.h.e(dVar);
        }
        return null;
    }

    @Override // q2j.d
    public final xi0.b e() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f241664g, cVar.f241664g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.d.hashCode() * 31, 31, this.e);
        io3.d dVar = this.f;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.f241664g;
        return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
