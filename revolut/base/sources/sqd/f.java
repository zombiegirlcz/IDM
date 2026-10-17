package sqd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue;
import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f265056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncomeSorterHomeContract$DestinationValue f265057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f265058c;
    public final List d;

    public f(ArrayList destinations, IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue, dj0.d transactionAmount, List rates) {
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        Intrinsics.checkNotNullParameter(transactionAmount, "transactionAmount");
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.f265056a = destinations;
        this.f265057b = incomeSorterHomeContract$DestinationValue;
        this.f265058c = transactionAmount;
        this.d = rates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f265056a.equals(fVar.f265056a) && Intrinsics.f(this.f265057b, fVar.f265057b) && Intrinsics.f(this.f265058c, fVar.f265058c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f265056a.hashCode() * 31;
        IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue = this.f265057b;
        return this.d.hashCode() + v7.c((iHashCode + (incomeSorterHomeContract$DestinationValue == null ? 0 : incomeSorterHomeContract$DestinationValue.hashCode())) * 31, 31, this.f265058c);
    }
}
