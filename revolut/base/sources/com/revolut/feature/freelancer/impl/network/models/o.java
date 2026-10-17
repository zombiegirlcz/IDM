package com.revolut.feature.freelancer.impl.network.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\u000e\u0010\bR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\n\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/models/o;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "()J", "amount", "b", "Ljava/lang/String;", "c", "currency", "d", "dueDate", "Ljo3/a;", "Ljo3/a;", "e", "()Ljo3/a;", "plan", "booster", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("dueDate")
    private final long dueDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("plan")
    private final jo3.a plan;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("booster")
    private final jo3.a booster;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getBooster() {
        return this.booster;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getPlan() {
        return this.plan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.amount == oVar.amount && Intrinsics.f(this.currency, oVar.currency) && this.dueDate == oVar.dueDate && Intrinsics.f(this.plan, oVar.plan) && Intrinsics.f(this.booster, oVar.booster);
    }

    public final int hashCode() {
        int iC = a0.d.c(p.a.c(Long.hashCode(this.amount) * 31, 31, this.currency), 31, this.dueDate);
        jo3.a aVar = this.plan;
        int iHashCode = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.booster;
        return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }
}
