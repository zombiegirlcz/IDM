package q2j;

import com.revolut.feature.credit.card.models.CreditCard;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends d {
    public final CreditCard d;
    public final String e;
    public final dj0.d f;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(CreditCard creditCard, dj0.d dVar, String name) {
        Intrinsics.checkNotNullParameter(creditCard, "creditCard");
        Intrinsics.checkNotNullParameter(name, "name");
        String str = creditCard.f69793b;
        super(str, str, creditCard.f69798l);
        this.d = creditCard;
        this.e = name;
        this.f = dVar;
    }

    @Override // q2j.d
    public final d a(dj0.d balanceInBaseCurrency) {
        Intrinsics.checkNotNullParameter(balanceInBaseCurrency, "balanceInBaseCurrency");
        CreditCard creditCard = this.d;
        Intrinsics.checkNotNullParameter(creditCard, "creditCard");
        String name = this.e;
        Intrinsics.checkNotNullParameter(name, "name");
        return new b(creditCard, balanceInBaseCurrency, name);
    }

    @Override // q2j.d
    public final boolean b(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(query, "query");
        return (!d0.W(query) && kotlin.text.a0.H(cp5.d.K(e()), query, true)) || jli.g.a(this.e, query);
    }

    @Override // q2j.d
    public final dj0.d c() {
        return this.f;
    }

    @Override // q2j.d
    public final dj0.d d() {
        return this.d.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.d.hashCode() * 31, 31, this.e);
        dj0.d dVar = this.f;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }
}
