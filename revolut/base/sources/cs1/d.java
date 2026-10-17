package cs1;

import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteCharges;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f108431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n9l.a f108432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f108433c;
    public final dj0.d d;
    public final ApmQuoteCharges e;

    public d(dj0.d recipientGets, n9l.a exchangeRate, dj0.d exchangeAmount, dj0.d totalFees, ApmQuoteCharges apmQuoteCharges) {
        Intrinsics.checkNotNullParameter(recipientGets, "recipientGets");
        Intrinsics.checkNotNullParameter(exchangeRate, "exchangeRate");
        Intrinsics.checkNotNullParameter(exchangeAmount, "exchangeAmount");
        Intrinsics.checkNotNullParameter(totalFees, "totalFees");
        this.f108431a = recipientGets;
        this.f108432b = exchangeRate;
        this.f108433c = exchangeAmount;
        this.d = totalFees;
        this.e = apmQuoteCharges;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f108431a, dVar.f108431a) && Intrinsics.f(this.f108432b, dVar.f108432b) && Intrinsics.f(this.f108433c, dVar.f108433c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c((this.f108432b.hashCode() + (this.f108431a.hashCode() * 31)) * 31, 31, this.f108433c), 31, this.d);
        ApmQuoteCharges apmQuoteCharges = this.e;
        return iC + (apmQuoteCharges == null ? 0 : apmQuoteCharges.hashCode());
    }
}
