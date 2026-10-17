package fif;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.domain.interactors.transactions.TransactionsSort;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7 f135388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransactionsSort f135389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f135390c;
    public final TransactionContext d;
    public final BreadcrumbException e;

    public a(i7 i7Var, TransactionsSort sort, int i, TransactionContext context, BreadcrumbException breadcrumbException) {
        Intrinsics.checkNotNullParameter(sort, "sort");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f135388a = i7Var;
        this.f135389b = sort;
        this.f135390c = i;
        this.d = context;
        this.e = breadcrumbException;
    }

    public final int a() {
        return this.f135390c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f135388a, aVar.f135388a) && this.f135389b == aVar.f135389b && this.f135390c == aVar.f135390c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        i7 i7Var = this.f135388a;
        int iHashCode = (this.d.hashCode() + j6.a.b(this.f135390c, (this.f135389b.hashCode() + ((i7Var == null ? 0 : i7Var.hashCode()) * 31)) * 31, 31)) * 31;
        BreadcrumbException breadcrumbException = this.e;
        return iHashCode + (breadcrumbException != null ? breadcrumbException.hashCode() : 0);
    }
}
