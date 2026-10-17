package jng;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017¨\u0006\u0019"}, d2 = {"Ljng/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "state", "Ljng/h;", "Ljng/h;", "d", "()Ljng/h;", "verification", "c", "e", "verifiedUntil", "Ljng/e;", "Ljng/e;", "()Ljng/e;", "eligibility", "Ljng/g;", "Ljng/g;", "()Ljng/g;", "university", "feature_user_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("verification")
    private final h verification;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("verifiedUntil")
    private final String verifiedUntil;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("eligibility")
    private final e eligibility;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("university")
    private final g university;

    public f(String state, h hVar, String str, e eVar, g gVar) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.verification = hVar;
        this.verifiedUntil = str;
        this.eligibility = eVar;
        this.university = gVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e getEligibility() {
        return this.eligibility;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g getUniversity() {
        return this.university;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h getVerification() {
        return this.verification;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getVerifiedUntil() {
        return this.verifiedUntil;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.state, fVar.state) && Intrinsics.f(this.verification, fVar.verification) && Intrinsics.f(this.verifiedUntil, fVar.verifiedUntil) && Intrinsics.f(this.eligibility, fVar.eligibility) && Intrinsics.f(this.university, fVar.university);
    }

    public final int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        h hVar = this.verification;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        String str = this.verifiedUntil;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        e eVar = this.eligibility;
        int iHashCode4 = (iHashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        g gVar = this.university;
        return iHashCode4 + (gVar != null ? gVar.hashCode() : 0);
    }
}
