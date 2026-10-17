package zdd;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Lzdd/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getChallengeId", "challengeId", "", "b", "J", "getContribution", "()J", "contribution", "c", "getFromPocket", "fromPocket", "feature_shared_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("challengeId")
    @NotNull
    private final String challengeId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("contribution")
    private final long contribution;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("fromPocket")
    private final String fromPocket;

    public e(String challengeId, long j2, String str) {
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        this.challengeId = challengeId;
        this.contribution = j2;
        this.fromPocket = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.challengeId, eVar.challengeId) && this.contribution == eVar.contribution && Intrinsics.f(this.fromPocket, eVar.fromPocket);
    }

    public final int hashCode() {
        int iC = a0.d.c(this.challengeId.hashCode() * 31, 31, this.contribution);
        String str = this.fromPocket;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
