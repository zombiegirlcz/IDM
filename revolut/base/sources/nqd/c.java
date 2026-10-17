package nqd;

import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f218408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k71.q f218409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CategorisationFilter f218410c;
    public final List d;
    public final List e;

    public c(List incomeSorters, k71.q transactionExtraData, CategorisationFilter filter, List analyticsAccounts, List rates) {
        Intrinsics.checkNotNullParameter(incomeSorters, "incomeSorters");
        Intrinsics.checkNotNullParameter(transactionExtraData, "transactionExtraData");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(analyticsAccounts, "analyticsAccounts");
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.f218408a = incomeSorters;
        this.f218409b = transactionExtraData;
        this.f218410c = filter;
        this.d = analyticsAccounts;
        this.e = rates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f218408a, cVar.f218408a) && Intrinsics.f(this.f218409b, cVar.f218409b) && Intrinsics.f(this.f218410c, cVar.f218410c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d((this.f218410c.hashCode() + ((this.f218409b.hashCode() + (this.f218408a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }
}
