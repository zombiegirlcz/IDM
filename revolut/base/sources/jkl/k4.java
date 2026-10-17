package jkl;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\b\u0080\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\t\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u001b"}, d2 = {"Ljkl/k4;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "idToken", "b", "accessToken", "c", "g", "tokenType", "", "J", "()J", "expiresIn", "e", "f", "scope", "", "Ljava/util/List;", "()Ljava/util/List;", "accountIds", "region", "Companion", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id_token")
    @NotNull
    private final String idToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("access_token")
    @NotNull
    private final String accessToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("token_type")
    @NotNull
    private final String tokenType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("expires_in")
    private final long expiresIn;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("scope")
    @NotNull
    private final String scope;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("account_ids")
    private final List<String> accountIds;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("region")
    private final String region;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getAccountIds() {
        return this.accountIds;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getExpiresIn() {
        return this.expiresIn;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getIdToken() {
        return this.idToken;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k4)) {
            return false;
        }
        k4 k4Var = (k4) obj2;
        return Intrinsics.f(this.idToken, k4Var.idToken) && Intrinsics.f(this.accessToken, k4Var.accessToken) && Intrinsics.f(this.tokenType, k4Var.tokenType) && this.expiresIn == k4Var.expiresIn && Intrinsics.f(this.scope, k4Var.scope) && Intrinsics.f(this.accountIds, k4Var.accountIds) && Intrinsics.f(this.region, k4Var.region);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTokenType() {
        return this.tokenType;
    }

    public final int hashCode() {
        int iC = p.a.c(a0.d.c(p.a.c(p.a.c(this.idToken.hashCode() * 31, 31, this.accessToken), 31, this.tokenType), 31, this.expiresIn), 31, this.scope);
        List<String> list = this.accountIds;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.region;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
