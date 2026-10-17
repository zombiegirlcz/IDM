package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u001d"}, d2 = {"Lkfj/e3;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "c", "()Z", "enabled", "b", "allowed", "Lkfj/a;", "Lkfj/a;", "f", "()Lkfj/a;", "terms", "", "d", "Ljava/lang/Long;", "e", "()Ljava/lang/Long;", "renewedOnDate", "J", "()J", "expirationDate", "Ljava/lang/String;", "activeSubscriptionId", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("enabled")
    private final boolean enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("allowed")
    private final boolean allowed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("terms")
    private final a terms;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("renewedOnDate")
    private final Long renewedOnDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("expirationDate")
    private final long expirationDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("activeSubscriptionId")
    private final String activeSubscriptionId;

    public e3(boolean z, boolean z3, a aVar, Long l2, long j2, String str) {
        this.enabled = z;
        this.allowed = z3;
        this.terms = aVar;
        this.renewedOnDate = l2;
        this.expirationDate = j2;
        this.activeSubscriptionId = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActiveSubscriptionId() {
        return this.activeSubscriptionId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAllowed() {
        return this.allowed;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getRenewedOnDate() {
        return this.renewedOnDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj2;
        return this.enabled == e3Var.enabled && this.allowed == e3Var.allowed && Intrinsics.f(this.terms, e3Var.terms) && Intrinsics.f(this.renewedOnDate, e3Var.renewedOnDate) && this.expirationDate == e3Var.expirationDate && Intrinsics.f(this.activeSubscriptionId, e3Var.activeSubscriptionId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final a getTerms() {
        return this.terms;
    }

    public final int hashCode() {
        int iC = j6.a.c(Boolean.hashCode(this.enabled) * 31, 31, this.allowed);
        a aVar = this.terms;
        int iHashCode = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Long l2 = this.renewedOnDate;
        int iC2 = a0.d.c((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.expirationDate);
        String str = this.activeSubscriptionId;
        return iC2 + (str != null ? str.hashCode() : 0);
    }
}
