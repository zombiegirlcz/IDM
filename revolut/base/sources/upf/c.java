package upf;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\f\u0010\u000fR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0011\u0010\u001cR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010&\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b\u0014\u0010%R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010-\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010+\u001a\u0004\b\u0006\u0010,R\u001c\u00101\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010/\u001a\u0004\b'\u00100¨\u00062"}, d2 = {"Lupf/c;", "", "", "toString", "()Ljava/lang/String;", "Lupf/e;", "a", "Lupf/e;", "f", "()Lupf/e;", "rate", "Ljo3/a;", "b", "Ljo3/a;", "g", "()Ljo3/a;", "recipientAmount", "c", "billAmount", "Lupf/o;", "d", "Lupf/o;", "i", "()Lupf/o;", "transferLimits", "Lupf/b;", "e", "Lupf/b;", "()Lupf/b;", "charges", "Lupf/l;", "Lupf/l;", "j", "()Lupf/l;", "transferSplit", "Lorf/a;", "Lorf/a;", "()Lorf/a;", "creditCardInterest", "h", "Ljava/lang/String;", "disclaimer", "Lorf/c;", "Lorf/c;", "()Lorf/c;", "availability", "Lrrf/a;", "Lrrf/a;", "()Lrrf/a;", "taxTreatment", "feature_transfer_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("rate")
    @NotNull
    private final e rate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("recipientAmount")
    @NotNull
    private final jo3.a recipientAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("billAmount")
    @NotNull
    private final jo3.a billAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("transferLimits")
    private final o transferLimits;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("charges")
    @NotNull
    private final b charges;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("transferSplit")
    private final l transferSplit;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("creditCardInterest")
    private final orf.a creditCardInterest;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("disclaimer")
    private final String disclaimer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("availability")
    private final orf.c availability;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("taxTreatment")
    private final rrf.a taxTreatment;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final orf.c getAvailability() {
        return this.availability;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getBillAmount() {
        return this.billAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getCharges() {
        return this.charges;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final orf.a getCreditCardInterest() {
        return this.creditCardInterest;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.rate, cVar.rate) && Intrinsics.f(this.recipientAmount, cVar.recipientAmount) && Intrinsics.f(this.billAmount, cVar.billAmount) && Intrinsics.f(this.transferLimits, cVar.transferLimits) && Intrinsics.f(this.charges, cVar.charges) && Intrinsics.f(this.transferSplit, cVar.transferSplit) && Intrinsics.f(this.creditCardInterest, cVar.creditCardInterest) && Intrinsics.f(this.disclaimer, cVar.disclaimer) && Intrinsics.f(this.availability, cVar.availability) && Intrinsics.f(this.taxTreatment, cVar.taxTreatment);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final e getRate() {
        return this.rate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final jo3.a getRecipientAmount() {
        return this.recipientAmount;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final rrf.a getTaxTreatment() {
        return this.taxTreatment;
    }

    public final int hashCode() {
        int iJ = v7.j(this.billAmount, v7.j(this.recipientAmount, this.rate.hashCode() * 31, 31), 31);
        o oVar = this.transferLimits;
        int iHashCode = (this.charges.hashCode() + ((iJ + (oVar == null ? 0 : oVar.hashCode())) * 31)) * 31;
        l lVar = this.transferSplit;
        int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        orf.a aVar = this.creditCardInterest;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.disclaimer;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        orf.c cVar = this.availability;
        int iHashCode5 = (iHashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        rrf.a aVar2 = this.taxTreatment;
        return iHashCode5 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final o getTransferLimits() {
        return this.transferLimits;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final l getTransferSplit() {
        return this.transferSplit;
    }
}
