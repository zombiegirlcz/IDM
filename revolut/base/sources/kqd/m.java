package kqd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188389b;

    public m(String incomeSorterId) {
        Intrinsics.checkNotNullParameter(incomeSorterId, "incomeSorterId");
        this.f188389b = incomeSorterId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f188389b, ((m) obj2).f188389b);
    }

    public final int hashCode() {
        return this.f188389b.hashCode();
    }
}
