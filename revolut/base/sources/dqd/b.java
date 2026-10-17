package dqd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.models.RemainingBalanceDestination;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f116937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f116938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RemainingBalanceDestination f116939c;
    public final List d;

    public b(ArrayList originalDestinations, List currentDestinations, RemainingBalanceDestination remainingBalanceDestination, List rates) {
        Intrinsics.checkNotNullParameter(originalDestinations, "originalDestinations");
        Intrinsics.checkNotNullParameter(currentDestinations, "currentDestinations");
        Intrinsics.checkNotNullParameter(remainingBalanceDestination, "remainingBalanceDestination");
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.f116937a = originalDestinations;
        this.f116938b = currentDestinations;
        this.f116939c = remainingBalanceDestination;
        this.d = rates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f116937a.equals(bVar.f116937a) && Intrinsics.f(this.f116938b, bVar.f116938b) && this.f116939c.equals(bVar.f116939c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f116939c.hashCode() + p.a.d(this.f116937a.hashCode() * 31, 31, this.f116938b)) * 31);
    }
}
