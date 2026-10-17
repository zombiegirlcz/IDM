package l8a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\t\u0010\fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0011\u0010\fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0013\u0010\fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u0017"}, d2 = {"Ll8a/j0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "currency", "", "b", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "original", "c", "g", "rebate", "d", "discount", "e", "fines", "interest", "final", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    private final String currency;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("original")
    private final Long original;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("rebate")
    private final Long rebate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("discount")
    private final Long discount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("fines")
    private final Long fines;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("interest")
    private final Long interest;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("final")
    private final Long final;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getDiscount() {
        return this.discount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getFinal() {
        return this.final;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getFines() {
        return this.fines;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getInterest() {
        return this.interest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.currency, j0Var.currency) && Intrinsics.f(this.original, j0Var.original) && Intrinsics.f(this.rebate, j0Var.rebate) && Intrinsics.f(this.discount, j0Var.discount) && Intrinsics.f(this.fines, j0Var.fines) && Intrinsics.f(this.interest, j0Var.interest) && Intrinsics.f(this.final, j0Var.final);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getOriginal() {
        return this.original;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getRebate() {
        return this.rebate;
    }

    public final int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l2 = this.original;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.rebate;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.discount;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.fines;
        int iHashCode5 = (iHashCode4 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l22 = this.interest;
        int iHashCode6 = (iHashCode5 + (l22 == null ? 0 : l22.hashCode())) * 31;
        Long l31 = this.final;
        return iHashCode6 + (l31 != null ? l31.hashCode() : 0);
    }
}
