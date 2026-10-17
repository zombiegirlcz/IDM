package f78;

import com.revolut.data.model.Data;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import do3.n;
import io3.d;
import ip0.v7;
import java.util.List;
import kii.e;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import sf8.h;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f132571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f132572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JuniorBankingProfile f132573c;
    public final h d;
    public final d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final psg.a f132574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f132575h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f132576j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f132577l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final eb8.n f132578m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Data f132579n;
    public final List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f132580p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Data f132581q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Data f132582r;

    public b(String juniorId, String walletId, JuniorBankingProfile juniorProfile, h accountUiState, d dVar, dj0.d balance, psg.a walletProfile, n parentProfile, Data transactions, Data cards, Data cardRequestAvailable, Data onHoldAccounts, eb8.n pendingGraduation, Data partnershipsEnabled, List pocketsWithTransactions, i currentPocketsBalance, Data multicurrencyDiscoverAvailable, Data juniorKyc) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(accountUiState, "accountUiState");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(walletProfile, "walletProfile");
        Intrinsics.checkNotNullParameter(parentProfile, "parentProfile");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(cardRequestAvailable, "cardRequestAvailable");
        Intrinsics.checkNotNullParameter(onHoldAccounts, "onHoldAccounts");
        Intrinsics.checkNotNullParameter(pendingGraduation, "pendingGraduation");
        Intrinsics.checkNotNullParameter(partnershipsEnabled, "partnershipsEnabled");
        Intrinsics.checkNotNullParameter(pocketsWithTransactions, "pocketsWithTransactions");
        Intrinsics.checkNotNullParameter(currentPocketsBalance, "currentPocketsBalance");
        Intrinsics.checkNotNullParameter(multicurrencyDiscoverAvailable, "multicurrencyDiscoverAvailable");
        Intrinsics.checkNotNullParameter(juniorKyc, "juniorKyc");
        this.f132571a = juniorId;
        this.f132572b = walletId;
        this.f132573c = juniorProfile;
        this.d = accountUiState;
        this.e = dVar;
        this.f = balance;
        this.f132574g = walletProfile;
        this.f132575h = parentProfile;
        this.i = transactions;
        this.f132576j = cards;
        this.k = cardRequestAvailable;
        this.f132577l = onHoldAccounts;
        this.f132578m = pendingGraduation;
        this.f132579n = partnershipsEnabled;
        this.o = pocketsWithTransactions;
        this.f132580p = currentPocketsBalance;
        this.f132581q = multicurrencyDiscoverAvailable;
        this.f132582r = juniorKyc;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f132571a, bVar.f132571a) && Intrinsics.f(this.f132572b, bVar.f132572b) && Intrinsics.f(this.f132573c, bVar.f132573c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f132574g, bVar.f132574g) && Intrinsics.f(this.f132575h, bVar.f132575h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f132576j, bVar.f132576j) && Intrinsics.f(this.k, bVar.k) && Intrinsics.f(this.f132577l, bVar.f132577l) && Intrinsics.f(this.f132578m, bVar.f132578m) && Intrinsics.f(this.f132579n, bVar.f132579n) && Intrinsics.f(this.o, bVar.o) && Intrinsics.f(this.f132580p, bVar.f132580p) && Intrinsics.f(this.f132581q, bVar.f132581q) && Intrinsics.f(this.f132582r, bVar.f132582r);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f132573c.hashCode() + p.a.c(this.f132571a.hashCode() * 31, 31, this.f132572b)) * 31)) * 31;
        d dVar = this.e;
        return this.f132582r.hashCode() + e.c(this.f132581q, r6.b.f(this.f132580p, p.a.d(e.c(this.f132579n, (this.f132578m.hashCode() + e.c(this.f132577l, e.c(this.k, e.c(this.f132576j, e.c(this.i, (this.f132575h.hashCode() + ((this.f132574g.hashCode() + v7.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f)) * 31)) * 31, 31), 31), 31), 31)) * 31, 31), 31, this.o), 31), 31);
    }
}
