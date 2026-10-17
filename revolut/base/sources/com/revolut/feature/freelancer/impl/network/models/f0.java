package com.revolut.feature.freelancer.impl.network.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/models/f0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "g", "status", "d", "numberFormatted", "", "J", "()J", "dueDate", "e", "Ljava/lang/Long;", "()Ljava/lang/Long;", "paidDate", "f", "sentDate", "createdDate", "h", "updatedDate", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("formattedNumber")
    @NotNull
    private final String numberFormatted;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("dueDate")
    private final long dueDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("paidDate")
    private final Long paidDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("sentDate")
    private final Long sentDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("updatedDate")
    private final long updatedDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getNumberFormatted() {
        return this.numberFormatted;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getPaidDate() {
        return this.paidDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.id, f0Var.id) && Intrinsics.f(this.status, f0Var.status) && Intrinsics.f(this.numberFormatted, f0Var.numberFormatted) && this.dueDate == f0Var.dueDate && Intrinsics.f(this.paidDate, f0Var.paidDate) && Intrinsics.f(this.sentDate, f0Var.sentDate) && this.createdDate == f0Var.createdDate && this.updatedDate == f0Var.updatedDate;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getSentDate() {
        return this.sentDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getUpdatedDate() {
        return this.updatedDate;
    }

    public final int hashCode() {
        int iC = a0.d.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.status), 31, this.numberFormatted), 31, this.dueDate);
        Long l2 = this.paidDate;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.sentDate;
        return Long.hashCode(this.updatedDate) + a0.d.c((iHashCode + (l3 != null ? l3.hashCode() : 0)) * 31, 31, this.createdDate);
    }
}
