package io1;

import cli.j;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteCharges;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f163136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n9l.a f163137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f163138c;
    public final dj0.d d;
    public final ApmQuoteCharges e;

    public d(dj0.d recipientGets, n9l.a exchangeRate, dj0.d exchangeAmount, dj0.d totalFees, ApmQuoteCharges apmQuoteCharges) {
        Intrinsics.checkNotNullParameter(recipientGets, "recipientGets");
        Intrinsics.checkNotNullParameter(exchangeRate, "exchangeRate");
        Intrinsics.checkNotNullParameter(exchangeAmount, "exchangeAmount");
        Intrinsics.checkNotNullParameter(totalFees, "totalFees");
        this.f163136a = recipientGets;
        this.f163137b = exchangeRate;
        this.f163138c = exchangeAmount;
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
        return Intrinsics.f(this.f163136a, dVar.f163136a) && Intrinsics.f(this.f163137b, dVar.f163137b) && Intrinsics.f(this.f163138c, dVar.f163138c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c((this.f163137b.hashCode() + (this.f163136a.hashCode() * 31)) * 31, 31, this.f163138c), 31, this.d);
        ApmQuoteCharges apmQuoteCharges = this.e;
        return iC + (apmQuoteCharges == null ? 0 : apmQuoteCharges.hashCode());
    }
}
