package j11;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0006\u0010\u0013¨\u0006\u0015"}, d2 = {"Lj11/f;", "", "", "toString", "()Ljava/lang/String;", "Lj11/g;", "a", "Lj11/g;", "c", "()Lj11/g;", "tier", "b", "Ljava/lang/String;", "getStartDate", "startDate", "endDate", "Lj11/a;", "d", "Lj11/a;", "()Lj11/a;", "challenge", "feature_crypto_challenge_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("tier")
    @NotNull
    private final g tier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("startDate")
    @NotNull
    private final String startDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("endDate")
    @NotNull
    private final String endDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("challenge")
    private final a challenge;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getChallenge() {
        return this.challenge;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g getTier() {
        return this.tier;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.tier == fVar.tier && Intrinsics.f(this.startDate, fVar.startDate) && Intrinsics.f(this.endDate, fVar.endDate) && Intrinsics.f(this.challenge, fVar.challenge);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.tier.hashCode() * 31, 31, this.startDate), 31, this.endDate);
        a aVar = this.challenge;
        return iC + (aVar == null ? 0 : aVar.hashCode());
    }
}
