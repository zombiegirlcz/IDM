package yg1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0015"}, d2 = {"Lyg1/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getTokenUniqueReference", "tokenUniqueReference", "b", "getLastFour", "lastFour", "c", "getExpiry", "expiry", "d", "getCardId", "cardId", "e", "getActivationReason", "activationReason", "feature_add_card_to_google_pay_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("tokenUniqueReference")
    @NotNull
    private final String tokenUniqueReference;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastFour")
    @NotNull
    private final String lastFour;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("expiry")
    private final String expiry;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("cardId")
    private final String cardId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("activationReason")
    private final String activationReason;

    public a(String tokenUniqueReference, String lastFour, String str, String str2) {
        Intrinsics.checkNotNullParameter(tokenUniqueReference, "tokenUniqueReference");
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        this.tokenUniqueReference = tokenUniqueReference;
        this.lastFour = lastFour;
        this.expiry = str;
        this.cardId = null;
        this.activationReason = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.tokenUniqueReference, aVar.tokenUniqueReference) && Intrinsics.f(this.lastFour, aVar.lastFour) && Intrinsics.f(this.expiry, aVar.expiry) && Intrinsics.f(this.cardId, aVar.cardId) && Intrinsics.f(this.activationReason, aVar.activationReason);
    }

    public final int hashCode() {
        int iC = p.a.c(this.tokenUniqueReference.hashCode() * 31, 31, this.lastFour);
        String str = this.expiry;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cardId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.activationReason;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
