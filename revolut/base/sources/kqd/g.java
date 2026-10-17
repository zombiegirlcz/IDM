package kqd;

import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CategorisationFilter f188378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f188379c;

    public g(CategorisationFilter filter, List analyticsAccounts) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(analyticsAccounts, "analyticsAccounts");
        this.f188378b = filter;
        this.f188379c = analyticsAccounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f188378b, gVar.f188378b) && Intrinsics.f(this.f188379c, gVar.f188379c);
    }

    public final int hashCode() {
        return this.f188379c.hashCode() + (this.f188378b.hashCode() * 31);
    }
}
