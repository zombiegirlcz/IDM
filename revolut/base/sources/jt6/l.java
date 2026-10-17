package jt6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\t\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0012"}, d2 = {"Ljt6/l;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "d", "paymentMethod", "Ljt6/a;", "Ljt6/a;", "()Ljt6/a;", "card", "campaignId", "Companion", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethod")
    @NotNull
    private final String paymentMethod;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("card")
    private final a card;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("campaignId")
    private final String campaignId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getCard() {
        return this.card;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.id, lVar.id) && Intrinsics.f(this.paymentMethod, lVar.paymentMethod) && Intrinsics.f(this.card, lVar.card) && Intrinsics.f(this.campaignId, lVar.campaignId);
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.paymentMethod);
        a aVar = this.card;
        int iHashCode = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.campaignId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
