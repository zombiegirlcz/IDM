package ks6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\t\u0010\u001dR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\f\u0010\u001d¨\u0006 "}, d2 = {"Lks6/l0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "f", "refundComment", "c", "g", "state", "j", "type", "e", "h", "subtype", "paymentMethod", "acquiringState", "Lks6/o0;", "Lks6/o0;", "i", "()Lks6/o0;", "taxAllocation", "Ljo3/b;", "Ljo3/b;", "()Ljo3/b;", "billedAmount", "creditedAmount", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("refundComment")
    private final String refundComment;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("subtype")
    private final String subtype;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("paymentMethod")
    @NotNull
    private final String paymentMethod;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("acquiringState")
    private final String acquiringState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("taxAllocation")
    private final o0 taxAllocation;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("billedAmount")
    private final jo3.b billedAmount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("creditedAmount")
    private final jo3.b creditedAmount;

    public l0(String id10, String str, String state, String type, String str2, String paymentMethod, String str3, o0 o0Var, jo3.b bVar, jo3.b bVar2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.id = id10;
        this.refundComment = str;
        this.state = state;
        this.type = type;
        this.subtype = str2;
        this.paymentMethod = paymentMethod;
        this.acquiringState = str3;
        this.taxAllocation = o0Var;
        this.billedAmount = bVar;
        this.creditedAmount = bVar2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAcquiringState() {
        return this.acquiringState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getBilledAmount() {
        return this.billedAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.b getCreditedAmount() {
        return this.creditedAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.id, l0Var.id) && Intrinsics.f(this.refundComment, l0Var.refundComment) && Intrinsics.f(this.state, l0Var.state) && Intrinsics.f(this.type, l0Var.type) && Intrinsics.f(this.subtype, l0Var.subtype) && Intrinsics.f(this.paymentMethod, l0Var.paymentMethod) && Intrinsics.f(this.acquiringState, l0Var.acquiringState) && Intrinsics.f(this.taxAllocation, l0Var.taxAllocation) && Intrinsics.f(this.billedAmount, l0Var.billedAmount) && Intrinsics.f(this.creditedAmount, l0Var.creditedAmount);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getRefundComment() {
        return this.refundComment;
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
        int iHashCode = this.id.hashCode() * 31;
        String str = this.refundComment;
        int iC = p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.state), 31, this.type);
        String str2 = this.subtype;
        int iC2 = p.a.c((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.paymentMethod);
        String str3 = this.acquiringState;
        int iHashCode2 = (iC2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        o0 o0Var = this.taxAllocation;
        int iHashCode3 = (iHashCode2 + (o0Var == null ? 0 : o0Var.hashCode())) * 31;
        jo3.b bVar = this.billedAmount;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        jo3.b bVar2 = this.creditedAmount;
        return iHashCode4 + (bVar2 != null ? bVar2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final o0 getTaxAllocation() {
        return this.taxAllocation;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
