package aqd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.models.RemainingBalanceDestination;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f8319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f8320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f8321c;
    public final ArrayList d;
    public final RemainingBalanceDestination e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final io3.d f8322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f8323h;
    public final do3.n i;

    public a(dj0.d transactionTotal, s state, List currentDestinations, ArrayList originalDestinations, RemainingBalanceDestination remainingBalanceDestination, List crossSellTypes, io3.d pocket, List rates, do3.n user) {
        Intrinsics.checkNotNullParameter(transactionTotal, "transactionTotal");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(currentDestinations, "currentDestinations");
        Intrinsics.checkNotNullParameter(originalDestinations, "originalDestinations");
        Intrinsics.checkNotNullParameter(remainingBalanceDestination, "remainingBalanceDestination");
        Intrinsics.checkNotNullParameter(crossSellTypes, "crossSellTypes");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f8319a = transactionTotal;
        this.f8320b = state;
        this.f8321c = currentDestinations;
        this.d = originalDestinations;
        this.e = remainingBalanceDestination;
        this.f = crossSellTypes;
        this.f8322g = pocket;
        this.f8323h = rates;
        this.i = user;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f8319a, aVar.f8319a) && this.f8320b.equals(aVar.f8320b) && Intrinsics.f(this.f8321c, aVar.f8321c) && this.d.equals(aVar.d) && this.e.equals(aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f8322g, aVar.f8322g) && Intrinsics.f(this.f8323h, aVar.f8323h) && Intrinsics.f(this.i, aVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + p.a.d(h30.l.g(this.f8322g, p.a.d((this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, p.a.d((this.f8320b.hashCode() + (this.f8319a.hashCode() * 31)) * 31, 31, this.f8321c), 31)) * 31, 31, this.f), 31), 31, this.f8323h);
    }
}
