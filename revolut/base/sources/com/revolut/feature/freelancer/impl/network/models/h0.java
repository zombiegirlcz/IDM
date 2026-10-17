package com.revolut.feature.freelancer.impl.network.models;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\t\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\f\u0010\u001d¨\u0006 "}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/models/h0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "g", "state", "c", "j", "type", "d", "h", "subtype", "f", "paymentMethod", "description", "acquiringState", "Lcom/revolut/feature/freelancer/impl/network/models/r0;", "Lcom/revolut/feature/freelancer/impl/network/models/r0;", "i", "()Lcom/revolut/feature/freelancer/impl/network/models/r0;", "taxAllocation", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "billedAmount", "creditedAmount", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("subtype")
    private final String subtype;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("paymentMethod")
    @NotNull
    private final String paymentMethod;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("acquiringState")
    private final String acquiringState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("taxAllocation")
    private final r0 taxAllocation;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("billed")
    @NotNull
    private final jo3.a billedAmount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("credited")
    @NotNull
    private final jo3.a creditedAmount;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAcquiringState() {
        return this.acquiringState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getBilledAmount() {
        return this.billedAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getCreditedAmount() {
        return this.creditedAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.id, h0Var.id) && Intrinsics.f(this.state, h0Var.state) && Intrinsics.f(this.type, h0Var.type) && Intrinsics.f(this.subtype, h0Var.subtype) && Intrinsics.f(this.paymentMethod, h0Var.paymentMethod) && Intrinsics.f(this.description, h0Var.description) && Intrinsics.f(this.acquiringState, h0Var.acquiringState) && Intrinsics.f(this.taxAllocation, h0Var.taxAllocation) && Intrinsics.f(this.billedAmount, h0Var.billedAmount) && Intrinsics.f(this.creditedAmount, h0Var.creditedAmount);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSubtype() {
        return this.subtype;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.state), 31, this.type);
        String str = this.subtype;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.paymentMethod);
        String str2 = this.description;
        int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.acquiringState;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        r0 r0Var = this.taxAllocation;
        return this.creditedAmount.hashCode() + v7.j(this.billedAmount, (iHashCode2 + (r0Var != null ? r0Var.hashCode() : 0)) * 31, 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final r0 getTaxAllocation() {
        return this.taxAllocation;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
