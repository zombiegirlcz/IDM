package ypd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue;
import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f315828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncomeSorterHomeContract$DestinationValue f315829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f315830c;
    public final dj0.d d;
    public final List e;

    public a(List destinations, IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue, dj0.d total, dj0.d transactionAmount, List rates) {
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(transactionAmount, "transactionAmount");
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.f315828a = destinations;
        this.f315829b = incomeSorterHomeContract$DestinationValue;
        this.f315830c = total;
        this.d = transactionAmount;
        this.e = rates;
    }

    public static a a(a aVar, ArrayList arrayList, IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = aVar.f315828a;
        }
        List destinations = list;
        dj0.d total = aVar.f315830c;
        dj0.d transactionAmount = aVar.d;
        List rates = aVar.e;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(transactionAmount, "transactionAmount");
        Intrinsics.checkNotNullParameter(rates, "rates");
        return new a(destinations, incomeSorterHomeContract$DestinationValue, total, transactionAmount, rates);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f315828a, aVar.f315828a) && Intrinsics.f(this.f315829b, aVar.f315829b) && Intrinsics.f(this.f315830c, aVar.f315830c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f315828a.hashCode() * 31;
        IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue = this.f315829b;
        return this.e.hashCode() + v7.c(v7.c((iHashCode + (incomeSorterHomeContract$DestinationValue == null ? 0 : incomeSorterHomeContract$DestinationValue.hashCode())) * 31, 31, this.f315830c), 31, this.d);
    }
}
