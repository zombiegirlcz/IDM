package wr1;

import com.revolut.feature.apm.bills.core.api.model.search.tapi.BillSearchTapiResult;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f299486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f299487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f299488c;
    public final dj0.d d;
    public final BillSearchTapiResult e;
    public final ur1.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ApmQuote f299489g;

    public g(dj0.d amount, dj0.d minAmount, dj0.d maxAmount, dj0.d dVar, BillSearchTapiResult tapiBill, ur1.a tapiPocket, ApmQuote apmQuote) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(minAmount, "minAmount");
        Intrinsics.checkNotNullParameter(maxAmount, "maxAmount");
        Intrinsics.checkNotNullParameter(tapiBill, "tapiBill");
        Intrinsics.checkNotNullParameter(tapiPocket, "tapiPocket");
        this.f299486a = amount;
        this.f299487b = minAmount;
        this.f299488c = maxAmount;
        this.d = dVar;
        this.e = tapiBill;
        this.f = tapiPocket;
        this.f299489g = apmQuote;
    }

    public static g a(g gVar, dj0.d dVar, dj0.d dVar2, ur1.a aVar, ApmQuote apmQuote, int i) {
        if ((i & 1) != 0) {
            dVar = gVar.f299486a;
        }
        dj0.d amount = dVar;
        dj0.d minAmount = gVar.f299487b;
        dj0.d maxAmount = gVar.f299488c;
        if ((i & 8) != 0) {
            dVar2 = gVar.d;
        }
        dj0.d dVar3 = dVar2;
        BillSearchTapiResult tapiBill = gVar.e;
        if ((i & 32) != 0) {
            aVar = gVar.f;
        }
        ur1.a tapiPocket = aVar;
        if ((i & 64) != 0) {
            apmQuote = gVar.f299489g;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(minAmount, "minAmount");
        Intrinsics.checkNotNullParameter(maxAmount, "maxAmount");
        Intrinsics.checkNotNullParameter(tapiBill, "tapiBill");
        Intrinsics.checkNotNullParameter(tapiPocket, "tapiPocket");
        return new g(amount, minAmount, maxAmount, dVar3, tapiBill, tapiPocket, apmQuote);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f299486a, gVar.f299486a) && Intrinsics.f(this.f299487b, gVar.f299487b) && Intrinsics.f(this.f299488c, gVar.f299488c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f299489g, gVar.f299489g);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(this.f299486a.hashCode() * 31, 31, this.f299487b), 31, this.f299488c);
        dj0.d dVar = this.d;
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ((iC + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31)) * 31;
        ApmQuote apmQuote = this.f299489g;
        return iHashCode + (apmQuote != null ? apmQuote.hashCode() : 0);
    }
}
