package dqd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncomeSorterHomeContract$DestinationValue f116942a;

    public e(IncomeSorterHomeContract$DestinationValue destinationValue) {
        Intrinsics.checkNotNullParameter(destinationValue, "destinationValue");
        this.f116942a = destinationValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f116942a, ((e) obj2).f116942a);
    }

    public final int hashCode() {
        return this.f116942a.hashCode();
    }
}
