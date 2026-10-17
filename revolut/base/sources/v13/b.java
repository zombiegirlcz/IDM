package v13;

import h93.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\f\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\u0005\u0010!R\u001c\u0010&\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b\u001c\u0010%¨\u0006'"}, d2 = {"Lv13/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "name", "b", "edt", "Lh93/s;", "c", "Lh93/s;", "i", "()Lh93/s;", "trackingChannel", "Lv93/d;", "Lv93/d;", "f", "()Lv93/d;", "pricing", "Ljo3/a;", "e", "Ljo3/a;", "()Ljo3/a;", "fee", "originalFee", "g", "h", "topupNeeded", "Lv13/a;", "Lv13/a;", "()Lv13/a;", "deliveryDateRange", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "remainingTimeToOrderInMillis", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("edt")
    @NotNull
    private final String edt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("trackingChannel")
    @NotNull
    private final s trackingChannel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("price")
    private final v93.d pricing;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("fee")
    private final jo3.a fee;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("originalFee")
    private final jo3.a originalFee;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("topupNeeded")
    private final jo3.a topupNeeded;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimatedDeliveryDateRange")
    private final a deliveryDateRange;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("remainingTimeToOrderInMillis")
    private final Long remainingTimeToOrderInMillis;

    public b(String name, String edt, s trackingChannel, v93.d dVar, jo3.a aVar, a aVar2, Long l2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(edt, "edt");
        Intrinsics.checkNotNullParameter(trackingChannel, "trackingChannel");
        this.name = name;
        this.edt = edt;
        this.trackingChannel = trackingChannel;
        this.pricing = dVar;
        this.fee = null;
        this.originalFee = null;
        this.topupNeeded = aVar;
        this.deliveryDateRange = aVar2;
        this.remainingTimeToOrderInMillis = l2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getDeliveryDateRange() {
        return this.deliveryDateRange;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEdt() {
        return this.edt;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getOriginalFee() {
        return this.originalFee;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.name, bVar.name) && Intrinsics.f(this.edt, bVar.edt) && this.trackingChannel == bVar.trackingChannel && Intrinsics.f(this.pricing, bVar.pricing) && Intrinsics.f(this.fee, bVar.fee) && Intrinsics.f(this.originalFee, bVar.originalFee) && Intrinsics.f(this.topupNeeded, bVar.topupNeeded) && Intrinsics.f(this.deliveryDateRange, bVar.deliveryDateRange) && Intrinsics.f(this.remainingTimeToOrderInMillis, bVar.remainingTimeToOrderInMillis);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final v93.d getPricing() {
        return this.pricing;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getRemainingTimeToOrderInMillis() {
        return this.remainingTimeToOrderInMillis;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final jo3.a getTopupNeeded() {
        return this.topupNeeded;
    }

    public final int hashCode() {
        int iHashCode = (this.trackingChannel.hashCode() + p.a.c(this.name.hashCode() * 31, 31, this.edt)) * 31;
        v93.d dVar = this.pricing;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        jo3.a aVar = this.fee;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.originalFee;
        int iHashCode4 = (iHashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        jo3.a aVar3 = this.topupNeeded;
        int iHashCode5 = (iHashCode4 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        a aVar4 = this.deliveryDateRange;
        int iHashCode6 = (iHashCode5 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        Long l2 = this.remainingTimeToOrderInMillis;
        return iHashCode6 + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final s getTrackingChannel() {
        return this.trackingChannel;
    }
}
