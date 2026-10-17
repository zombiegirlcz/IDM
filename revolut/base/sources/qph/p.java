package qph;

import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilter$Options;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilterInfo;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenerFilter$Options f248414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScreenerSelectedFilter.Options f248415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenerFilterInfo f248416c;

    public p(ScreenerFilter$Options filter, ScreenerSelectedFilter.Options options, ScreenerFilterInfo dialog) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f248414a = filter;
        this.f248415b = options;
        this.f248416c = dialog;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f248414a, pVar.f248414a) && Intrinsics.f(this.f248415b, pVar.f248415b) && Intrinsics.f(this.f248416c, pVar.f248416c);
    }

    public final int hashCode() {
        int iHashCode = this.f248414a.hashCode() * 31;
        ScreenerSelectedFilter.Options options = this.f248415b;
        return this.f248416c.hashCode() + ((iHashCode + (options == null ? 0 : options.hashCode())) * 31);
    }
}
