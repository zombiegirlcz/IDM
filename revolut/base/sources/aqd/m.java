package aqd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.models.RemainingBalanceDestination;
import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f8363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f8364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f8365c;
    public final ArrayList d;
    public final ArrayList e;
    public final RemainingBalanceDestination f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RemainingBalanceDestination f8366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0 f8367h;
    public final i0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f8368j;
    public final io3.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x f8369l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f8370m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final do3.n f8371n;

    public m(dj0.d transactionTotal, dj0.d destinationsTotal, s state, ArrayList currentDestinations, ArrayList originalDestinations, RemainingBalanceDestination originalRemainingBalanceDestination, RemainingBalanceDestination currentRemainingBalanceDestination, i0 currentSortMethod, i0 originalSortMethod, List crossSellTypes, io3.d pocket, x xVar, List rates, do3.n user) {
        Intrinsics.checkNotNullParameter(transactionTotal, "transactionTotal");
        Intrinsics.checkNotNullParameter(destinationsTotal, "destinationsTotal");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(currentDestinations, "currentDestinations");
        Intrinsics.checkNotNullParameter(originalDestinations, "originalDestinations");
        Intrinsics.checkNotNullParameter(originalRemainingBalanceDestination, "originalRemainingBalanceDestination");
        Intrinsics.checkNotNullParameter(currentRemainingBalanceDestination, "currentRemainingBalanceDestination");
        Intrinsics.checkNotNullParameter(currentSortMethod, "currentSortMethod");
        Intrinsics.checkNotNullParameter(originalSortMethod, "originalSortMethod");
        Intrinsics.checkNotNullParameter(crossSellTypes, "crossSellTypes");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f8363a = transactionTotal;
        this.f8364b = destinationsTotal;
        this.f8365c = state;
        this.d = currentDestinations;
        this.e = originalDestinations;
        this.f = originalRemainingBalanceDestination;
        this.f8366g = currentRemainingBalanceDestination;
        this.f8367h = currentSortMethod;
        this.i = originalSortMethod;
        this.f8368j = crossSellTypes;
        this.k = pocket;
        this.f8369l = xVar;
        this.f8370m = rates;
        this.f8371n = user;
    }

    public static m a(m mVar, RemainingBalanceDestination remainingBalanceDestination, i0 i0Var, int i) {
        dj0.d transactionTotal = mVar.f8363a;
        dj0.d destinationsTotal = mVar.f8364b;
        s state = mVar.f8365c;
        ArrayList currentDestinations = mVar.d;
        ArrayList originalDestinations = mVar.e;
        RemainingBalanceDestination originalRemainingBalanceDestination = mVar.f;
        RemainingBalanceDestination currentRemainingBalanceDestination = (i & 64) != 0 ? mVar.f8366g : remainingBalanceDestination;
        i0 currentSortMethod = (i & 128) != 0 ? mVar.f8367h : i0Var;
        i0 originalSortMethod = mVar.i;
        List crossSellTypes = mVar.f8368j;
        io3.d pocket = mVar.k;
        x xVar = mVar.f8369l;
        List rates = mVar.f8370m;
        do3.n user = mVar.f8371n;
        Intrinsics.checkNotNullParameter(transactionTotal, "transactionTotal");
        Intrinsics.checkNotNullParameter(destinationsTotal, "destinationsTotal");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(currentDestinations, "currentDestinations");
        Intrinsics.checkNotNullParameter(originalDestinations, "originalDestinations");
        Intrinsics.checkNotNullParameter(originalRemainingBalanceDestination, "originalRemainingBalanceDestination");
        Intrinsics.checkNotNullParameter(currentRemainingBalanceDestination, "currentRemainingBalanceDestination");
        Intrinsics.checkNotNullParameter(currentSortMethod, "currentSortMethod");
        Intrinsics.checkNotNullParameter(originalSortMethod, "originalSortMethod");
        Intrinsics.checkNotNullParameter(crossSellTypes, "crossSellTypes");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(user, "user");
        return new m(transactionTotal, destinationsTotal, state, currentDestinations, originalDestinations, originalRemainingBalanceDestination, currentRemainingBalanceDestination, currentSortMethod, originalSortMethod, crossSellTypes, pocket, xVar, rates, user);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f8363a, mVar.f8363a) && this.f8364b.equals(mVar.f8364b) && this.f8365c.equals(mVar.f8365c) && this.d.equals(mVar.d) && this.e.equals(mVar.e) && this.f.equals(mVar.f) && Intrinsics.f(this.f8366g, mVar.f8366g) && this.f8367h == mVar.f8367h && this.i == mVar.i && Intrinsics.f(this.f8368j, mVar.f8368j) && Intrinsics.f(this.k, mVar.k) && Intrinsics.f(this.f8369l, mVar.f8369l) && Intrinsics.f(this.f8370m, mVar.f8370m) && Intrinsics.f(this.f8371n, mVar.f8371n);
    }

    public final int hashCode() {
        int iG = h30.l.g(this.k, p.a.d((this.i.hashCode() + ((this.f8367h.hashCode() + ((this.f8366g.hashCode() + ((this.f.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (this.f8365c.hashCode() + v7.c(this.f8363a.hashCode() * 31, 31, this.f8364b)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31, 31, this.f8368j), 31);
        x xVar = this.f8369l;
        return this.f8371n.hashCode() + p.a.d((iG + (xVar == null ? 0 : xVar.hashCode())) * 31, 31, this.f8370m);
    }
}
