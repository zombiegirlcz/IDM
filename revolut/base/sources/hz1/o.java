package hz1;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0006\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\f\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006 "}, d2 = {"Lhz1/o;", "", "", "toString", "()Ljava/lang/String;", "Lhz1/n;", "a", "Lhz1/n;", "d", "()Lhz1/n;", "rate", "Ljo3/a;", "b", "Ljo3/a;", "e", "()Ljo3/a;", "recipientAmount", "c", "billAmount", "Lhz1/l;", "Lhz1/l;", "()Lhz1/l;", "charges", "Lhz1/m;", "Lhz1/m;", "()Lhz1/m;", "limits", "", "f", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isDecimalsAllowed", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("rate")
    private final n rate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("recipientAmount")
    @NotNull
    private final jo3.a recipientAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("billAmount")
    @NotNull
    private final jo3.a billAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("charges")
    private final l charges;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("limits")
    private final m limits;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("isDecimalsAllowed")
    private final Boolean isDecimalsAllowed;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getBillAmount() {
        return this.billAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final l getCharges() {
        return this.charges;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final m getLimits() {
        return this.limits;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final n getRate() {
        return this.rate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getRecipientAmount() {
        return this.recipientAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.rate, oVar.rate) && Intrinsics.f(this.recipientAmount, oVar.recipientAmount) && Intrinsics.f(this.billAmount, oVar.billAmount) && Intrinsics.f(this.charges, oVar.charges) && Intrinsics.f(this.limits, oVar.limits) && Intrinsics.f(this.isDecimalsAllowed, oVar.isDecimalsAllowed);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getIsDecimalsAllowed() {
        return this.isDecimalsAllowed;
    }

    public final int hashCode() {
        n nVar = this.rate;
        int iJ = v7.j(this.billAmount, v7.j(this.recipientAmount, (nVar == null ? 0 : nVar.hashCode()) * 31, 31), 31);
        l lVar = this.charges;
        int iHashCode = (iJ + (lVar == null ? 0 : lVar.hashCode())) * 31;
        m mVar = this.limits;
        int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        Boolean bool = this.isDecimalsAllowed;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }
}
