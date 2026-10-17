package d88;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import sf8.m;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f112141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f112142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f112143c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f112144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f112145h;
    public final i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f112146j;
    public final Data k;

    public c(m accountInfo, Data transactions, Data cards, Data cardRequestAvailable, Data pendingGraduation, Data parentProfile, Data partnershipsEnabled, i pocketsWithTransactions, i currentPocketsBalance, Data multicurrencyDiscoverAvailable, Data juniorKyc) {
        Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(cardRequestAvailable, "cardRequestAvailable");
        Intrinsics.checkNotNullParameter(pendingGraduation, "pendingGraduation");
        Intrinsics.checkNotNullParameter(parentProfile, "parentProfile");
        Intrinsics.checkNotNullParameter(partnershipsEnabled, "partnershipsEnabled");
        Intrinsics.checkNotNullParameter(pocketsWithTransactions, "pocketsWithTransactions");
        Intrinsics.checkNotNullParameter(currentPocketsBalance, "currentPocketsBalance");
        Intrinsics.checkNotNullParameter(multicurrencyDiscoverAvailable, "multicurrencyDiscoverAvailable");
        Intrinsics.checkNotNullParameter(juniorKyc, "juniorKyc");
        this.f112141a = accountInfo;
        this.f112142b = transactions;
        this.f112143c = cards;
        this.d = cardRequestAvailable;
        this.e = pendingGraduation;
        this.f = parentProfile;
        this.f112144g = partnershipsEnabled;
        this.f112145h = pocketsWithTransactions;
        this.i = currentPocketsBalance;
        this.f112146j = multicurrencyDiscoverAvailable;
        this.k = juniorKyc;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f112141a, cVar.f112141a) && Intrinsics.f(this.f112142b, cVar.f112142b) && Intrinsics.f(this.f112143c, cVar.f112143c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f112144g, cVar.f112144g) && Intrinsics.f(this.f112145h, cVar.f112145h) && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f112146j, cVar.f112146j) && Intrinsics.f(this.k, cVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + kii.e.c(this.f112146j, r6.b.f(this.i, r6.b.f(this.f112145h, kii.e.c(this.f112144g, kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f112143c, kii.e.c(this.f112142b, this.f112141a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
