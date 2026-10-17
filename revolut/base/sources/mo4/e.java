package mo4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\f\u0010\u0004¨\u0006\u0012"}, d2 = {"Lmo4/e;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "c", "()J", "points", "Lmo4/a;", "b", "Lmo4/a;", "()Lmo4/a;", "dialog", "Ljava/lang/String;", "loyaltyQuoteToken", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("points")
    private final long points;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("dialog")
    private final a dialog;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("loyaltyQuoteToken")
    private final String loyaltyQuoteToken;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getDialog() {
        return this.dialog;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLoyaltyQuoteToken() {
        return this.loyaltyQuoteToken;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getPoints() {
        return this.points;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.points == eVar.points && Intrinsics.f(this.dialog, eVar.dialog) && Intrinsics.f(this.loyaltyQuoteToken, eVar.loyaltyQuoteToken);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.points) * 31;
        a aVar = this.dialog;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.loyaltyQuoteToken;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
