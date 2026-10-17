package jkl;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u0014"}, d2 = {"Ljkl/r2;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "sessionToken", "b", "code", "", "Ljkl/b0;", "c", "Ljava/util/List;", "()Ljava/util/List;", "enrollableClaims", "e", "state", "region", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("sessionToken")
    @NotNull
    private final String sessionToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("enrolableClaims")
    @NotNull
    private final List<b0> enrollableClaims;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("state")
    private final String state;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("region")
    private final String region;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getEnrollableClaims() {
        return this.enrollableClaims;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj2;
        return Intrinsics.f(this.sessionToken, r2Var.sessionToken) && Intrinsics.f(this.code, r2Var.code) && Intrinsics.f(this.enrollableClaims, r2Var.enrollableClaims) && Intrinsics.f(this.state, r2Var.state) && Intrinsics.f(this.region, r2Var.region);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.sessionToken.hashCode() * 31, 31, this.code), 31, this.enrollableClaims);
        String str = this.state;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.region;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
