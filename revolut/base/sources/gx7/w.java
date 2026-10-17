package gx7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\t\u0010\u0011R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0018"}, d2 = {"Lgx7/w;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "e", "monthlyPayment", "c", "excess", "coPayment", "Lgx7/g;", "Lgx7/g;", "()Lgx7/g;", "discount", "Ljo3/b;", "f", "Ljo3/b;", "()Ljo3/b;", "paymentDelta", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("monthlyPayment")
    @NotNull
    private final String monthlyPayment;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("excess")
    @NotNull
    private final String excess;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("coPayment")
    @NotNull
    private final String coPayment;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("discount")
    private final g discount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("paymentDelta")
    private final jo3.b paymentDelta;

    public w(String id10, String monthlyPayment, String excess, String coPayment, g gVar, jo3.b bVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(monthlyPayment, "monthlyPayment");
        Intrinsics.checkNotNullParameter(excess, "excess");
        Intrinsics.checkNotNullParameter(coPayment, "coPayment");
        this.id = id10;
        this.monthlyPayment = monthlyPayment;
        this.excess = excess;
        this.coPayment = coPayment;
        this.discount = gVar;
        this.paymentDelta = bVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCoPayment() {
        return this.coPayment;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g getDiscount() {
        return this.discount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getExcess() {
        return this.excess;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMonthlyPayment() {
        return this.monthlyPayment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.id, wVar.id) && Intrinsics.f(this.monthlyPayment, wVar.monthlyPayment) && Intrinsics.f(this.excess, wVar.excess) && Intrinsics.f(this.coPayment, wVar.coPayment) && Intrinsics.f(this.discount, wVar.discount) && Intrinsics.f(this.paymentDelta, wVar.paymentDelta);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.b getPaymentDelta() {
        return this.paymentDelta;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.monthlyPayment), 31, this.excess), 31, this.coPayment);
        g gVar = this.discount;
        int iHashCode = (iC + (gVar == null ? 0 : gVar.hashCode())) * 31;
        jo3.b bVar = this.paymentDelta;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}
