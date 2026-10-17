package lqa;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u001a\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\tR \u0010\u001a\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001f\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010)\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001c\u0010-\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010+\u001a\u0004\b\u000b\u0010,R\u001c\u00103\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u00107\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00105\u001a\u0004\b\u000e\u00106R\u001c\u00109\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010=\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010;\u001a\u0004\b\u0006\u0010<R\u001c\u0010A\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010?\u001a\u0004\b/\u0010@¨\u0006B"}, d2 = {"Llqa/x;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "f", "()Ljo3/a;", "from", "b", "l", "to", "c", "g", "fxFee", "d", "e", "fee", "", "D", "i", "()D", "getRate$annotations", "()V", "rate", "", "J", "k", "()J", "timestamp", "Llqa/g0;", "Llqa/g0;", "m", "()Llqa/g0;", "transferLimits", "Llqa/a0;", "h", "Llqa/a0;", "()Llqa/a0;", "fxRate", "Llqa/i;", "Llqa/i;", "()Llqa/i;", "charges", "Llqa/h0;", "j", "Llqa/h0;", "n", "()Llqa/h0;", "transferSplit", "Lorf/a;", "Lorf/a;", "()Lorf/a;", "creditCardInterest", "Ljava/lang/String;", "disclaimer", "Lorf/c;", "Lorf/c;", "()Lorf/c;", "availability", "Lrrf/a;", "Lrrf/a;", "()Lrrf/a;", "taxTreatment", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("from")
    @NotNull
    private final jo3.a from;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("to")
    @NotNull
    private final jo3.a to;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("fxFee")
    @NotNull
    private final jo3.a fxFee;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("fee")
    @NotNull
    private final jo3.a fee;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("rate")
    private final double rate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("timestamp")
    private final long timestamp;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("transferLimits")
    @NotNull
    private final g0 transferLimits;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("fxRate")
    private final a0 fxRate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("charges")
    private final i charges;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("transferSplit")
    private final h0 transferSplit;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("creditCardInterest")
    private final orf.a creditCardInterest;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("disclaimer")
    private final String disclaimer;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("availability")
    private final orf.c availability;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("taxTreatment")
    private final rrf.a taxTreatment;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final orf.c getAvailability() {
        return this.availability;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final i getCharges() {
        return this.charges;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final orf.a getCreditCardInterest() {
        return this.creditCardInterest;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getFee() {
        return this.fee;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.from, xVar.from) && Intrinsics.f(this.to, xVar.to) && Intrinsics.f(this.fxFee, xVar.fxFee) && Intrinsics.f(this.fee, xVar.fee) && Double.compare(this.rate, xVar.rate) == 0 && this.timestamp == xVar.timestamp && Intrinsics.f(this.transferLimits, xVar.transferLimits) && Intrinsics.f(this.fxRate, xVar.fxRate) && Intrinsics.f(this.charges, xVar.charges) && Intrinsics.f(this.transferSplit, xVar.transferSplit) && Intrinsics.f(this.creditCardInterest, xVar.creditCardInterest) && Intrinsics.f(this.disclaimer, xVar.disclaimer) && Intrinsics.f(this.availability, xVar.availability) && Intrinsics.f(this.taxTreatment, xVar.taxTreatment);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.a getFrom() {
        return this.from;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final jo3.a getFxFee() {
        return this.fxFee;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final a0 getFxRate() {
        return this.fxRate;
    }

    public final int hashCode() {
        int iHashCode = (this.transferLimits.hashCode() + a0.d.c(m72.b.c(v7.j(this.fee, v7.j(this.fxFee, v7.j(this.to, this.from.hashCode() * 31, 31), 31), 31), this.rate, 31), 31, this.timestamp)) * 31;
        a0 a0Var = this.fxRate;
        int iHashCode2 = (iHashCode + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        i iVar = this.charges;
        int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        h0 h0Var = this.transferSplit;
        int iHashCode4 = (iHashCode3 + (h0Var == null ? 0 : h0Var.hashCode())) * 31;
        orf.a aVar = this.creditCardInterest;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.disclaimer;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        orf.c cVar = this.availability;
        int iHashCode7 = (iHashCode6 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        rrf.a aVar2 = this.taxTreatment;
        return iHashCode7 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final double getRate() {
        return this.rate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final rrf.a getTaxTreatment() {
        return this.taxTreatment;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final jo3.a getTo() {
        return this.to;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final g0 getTransferLimits() {
        return this.transferLimits;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final h0 getTransferSplit() {
        return this.transferSplit;
    }
}
