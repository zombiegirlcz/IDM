package com.revolut.feature.freelancer.impl.network.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0015"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/models/s0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getFromPocketId", "fromPocketId", "b", "getToPocketId", "toPocketId", "", "c", "J", "getAmount", "()J", "amount", "d", "getCurrency", "currency", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("from")
    @NotNull
    private final String fromPocketId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("to")
    @NotNull
    private final String toPocketId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    public s0(long j2, String fromPocketId, String toPocketId, String currency) {
        Intrinsics.checkNotNullParameter(fromPocketId, "fromPocketId");
        Intrinsics.checkNotNullParameter(toPocketId, "toPocketId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.fromPocketId = fromPocketId;
        this.toPocketId = toPocketId;
        this.amount = j2;
        this.currency = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.fromPocketId, s0Var.fromPocketId) && Intrinsics.f(this.toPocketId, s0Var.toPocketId) && this.amount == s0Var.amount && Intrinsics.f(this.currency, s0Var.currency);
    }

    public final int hashCode() {
        return this.currency.hashCode() + a0.d.c(p.a.c(this.fromPocketId.hashCode() * 31, 31, this.toPocketId), 31, this.amount);
    }
}
