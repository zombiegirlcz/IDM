package com.revolut.feature.freelancer.impl.network.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\r\u0010\bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/models/j0;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "()Z", "accountEligibility", "b", "e", "withdrawing", "c", "processing", "d", "Ljava/lang/String;", "processingReason", "kym", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountEligibility")
    private final boolean accountEligibility;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("withdrawing")
    private final boolean withdrawing;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("processing")
    private final boolean processing;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("processingReason")
    private final String processingReason;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("kym")
    private final boolean kym;

    public j0(String str, boolean z, boolean z3, boolean z4, boolean z6) {
        this.accountEligibility = z;
        this.withdrawing = z3;
        this.processing = z4;
        this.processingReason = str;
        this.kym = z6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAccountEligibility() {
        return this.accountEligibility;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getKym() {
        return this.kym;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getProcessing() {
        return this.processing;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getProcessingReason() {
        return this.processingReason;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getWithdrawing() {
        return this.withdrawing;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return this.accountEligibility == j0Var.accountEligibility && this.withdrawing == j0Var.withdrawing && this.processing == j0Var.processing && Intrinsics.f(this.processingReason, j0Var.processingReason) && this.kym == j0Var.kym;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(Boolean.hashCode(this.accountEligibility) * 31, 31, this.withdrawing), 31, this.processing);
        String str = this.processingReason;
        return Boolean.hashCode(this.kym) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
