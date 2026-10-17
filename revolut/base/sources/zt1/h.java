package zt1;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\f\u0010\u0012¨\u0006\u0014"}, d2 = {"Lzt1/h;", "", "", "toString", "()Ljava/lang/String;", "Lzt1/j;", "a", "Lzt1/j;", "c", "()Lzt1/j;", "rate", "Ljo3/a;", "b", "Ljo3/a;", "()Ljo3/a;", "billAmount", "Lzt1/g;", "Lzt1/g;", "()Lzt1/g;", "charges", "feature_apm_blik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("rate")
    @NotNull
    private final j rate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("billAmount")
    @NotNull
    private final jo3.a billAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("charges")
    @NotNull
    private final g charges;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getBillAmount() {
        return this.billAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g getCharges() {
        return this.charges;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final j getRate() {
        return this.rate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.rate, hVar.rate) && Intrinsics.f(this.billAmount, hVar.billAmount) && Intrinsics.f(this.charges, hVar.charges);
    }

    public final int hashCode() {
        return this.charges.hashCode() + v7.j(this.billAmount, this.rate.hashCode() * 31, 31);
    }
}
