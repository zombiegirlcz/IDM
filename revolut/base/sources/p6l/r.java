package p6l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\n\u0010\u000fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0013"}, d2 = {"Lp6l/r;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "cardId", "b", "id", "c", "d", "otp", "Lp6l/k;", "Lp6l/k;", "()Lp6l/k;", "locationMismatch", "e", "tokenRequestorName", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("revolutCardId")
    @NotNull
    private final String cardId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("otp")
    @NotNull
    private final String otp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("locationMismatch")
    private final k locationMismatch;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("tokenRequestorReadableName")
    private final String tokenRequestorName;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final k getLocationMismatch() {
        return this.locationMismatch;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getOtp() {
        return this.otp;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTokenRequestorName() {
        return this.tokenRequestorName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.cardId, rVar.cardId) && Intrinsics.f(this.id, rVar.id) && Intrinsics.f(this.otp, rVar.otp) && Intrinsics.f(this.locationMismatch, rVar.locationMismatch) && Intrinsics.f(this.tokenRequestorName, rVar.tokenRequestorName);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.cardId.hashCode() * 31, 31, this.id), 31, this.otp);
        k kVar = this.locationMismatch;
        int iHashCode = (iC + (kVar == null ? 0 : kVar.hashCode())) * 31;
        String str = this.tokenRequestorName;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
