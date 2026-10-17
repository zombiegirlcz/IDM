package yz1;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001b"}, d2 = {"Lyz1/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "e", "paymentMethod", "Lyz1/d;", "Lyz1/d;", "d", "()Lyz1/d;", "payer", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "amount", "comment", "", "f", "J", "()J", "updateDate", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethod")
    @NotNull
    private final String paymentMethod;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("payer")
    @NotNull
    private final d payer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("comment")
    private final String comment;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("updateDate")
    private final long updateDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getPayer() {
        return this.payer;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.paymentMethod, cVar.paymentMethod) && Intrinsics.f(this.payer, cVar.payer) && Intrinsics.f(this.amount, cVar.amount) && Intrinsics.f(this.comment, cVar.comment) && this.updateDate == cVar.updateDate;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getUpdateDate() {
        return this.updateDate;
    }

    public final int hashCode() {
        int iJ = v7.j(this.amount, (this.payer.hashCode() + p.a.c(this.id.hashCode() * 31, 31, this.paymentMethod)) * 31, 31);
        String str = this.comment;
        return Long.hashCode(this.updateDate) + ((iJ + (str == null ? 0 : str.hashCode())) * 31);
    }
}
