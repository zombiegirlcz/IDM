package q7c;

import k7c.i0;
import k7c.j0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f242824a;

    public m(j0 quoteRepository) {
        Intrinsics.checkNotNullParameter(quoteRepository, "quoteRepository");
        this.f242824a = quoteRepository;
    }

    public final vkm.d a(long j2, xi0.b billCurrency, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(billCurrency, "billCurrency");
        if (bVar != null) {
            return b(billCurrency, j2, new k6c.e(bVar));
        }
        throw new IllegalArgumentException("Order token cannot be null when polling quote");
    }

    public final vkm.d b(xi0.b billCurrency, long j2, k6c.f quoteBy) {
        xi0.b bVar;
        Intrinsics.checkNotNullParameter(billCurrency, "billCurrency");
        Intrinsics.checkNotNullParameter(quoteBy, "quoteBy");
        j0 j0Var = this.f242824a;
        j0Var.getClass();
        Intrinsics.checkNotNullParameter(billCurrency, "billCurrency");
        Intrinsics.checkNotNullParameter(quoteBy, "quoteBy");
        qe0.o oVar = j0Var.f181971c;
        String str = billCurrency.f306286a;
        k6c.e eVar = quoteBy instanceof k6c.e ? (k6c.e) quoteBy : null;
        String str2 = (eVar == null || (bVar = eVar.f181681a) == null) ? null : bVar.f306286a;
        k6c.d dVar = quoteBy instanceof k6c.d ? (k6c.d) quoteBy : null;
        return qe0.o.a(oVar, new i0(str, j2, str2, dVar != null ? dVar.f181680a : null), 3L, null, false, null, 28);
    }
}
