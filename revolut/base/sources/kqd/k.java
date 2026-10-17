package kqd;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f188386c;
    public final Set d;

    public k(String pocketId, xi0.b targetCurrency, Set pendingSelectedDestinationIds) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(pendingSelectedDestinationIds, "pendingSelectedDestinationIds");
        this.f188385b = pocketId;
        this.f188386c = targetCurrency;
        this.d = pendingSelectedDestinationIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f188385b, kVar.f188385b) && Intrinsics.f(this.f188386c, kVar.f188386c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h30.l.j(this.f188386c, this.f188385b.hashCode() * 31, 31);
    }
}
