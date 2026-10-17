package tt6;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001b"}, d2 = {"Ltt6/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getClientId", "clientId", "b", "getPkceCodeChallenge", "pkceCodeChallenge", "c", "getPkceCodeChallengeMethod", "pkceCodeChallengeMethod", "d", "getRedirectUri", "redirectUri", "", "e", "Ljava/util/List;", "getScopes", "()Ljava/util/List;", "scopes", "f", "getStateToken", "stateToken", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("clientId")
    @NotNull
    private final String clientId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("pkceCodeChallenge")
    @NotNull
    private final String pkceCodeChallenge;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("pkceCodeChallengeMethod")
    @NotNull
    private final String pkceCodeChallengeMethod;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("redirectUri")
    @NotNull
    private final String redirectUri;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("scopes")
    @NotNull
    private final List<String> scopes;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("stateToken")
    @NotNull
    private final String stateToken;

    public a(String clientId, String pkceCodeChallenge, String pkceCodeChallengeMethod, List scopes, String redirectUri, String stateToken) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(pkceCodeChallenge, "pkceCodeChallenge");
        Intrinsics.checkNotNullParameter(pkceCodeChallengeMethod, "pkceCodeChallengeMethod");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(stateToken, "stateToken");
        this.clientId = clientId;
        this.pkceCodeChallenge = pkceCodeChallenge;
        this.pkceCodeChallengeMethod = pkceCodeChallengeMethod;
        this.redirectUri = redirectUri;
        this.scopes = scopes;
        this.stateToken = stateToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.clientId, aVar.clientId) && Intrinsics.f(this.pkceCodeChallenge, aVar.pkceCodeChallenge) && Intrinsics.f(this.pkceCodeChallengeMethod, aVar.pkceCodeChallengeMethod) && Intrinsics.f(this.redirectUri, aVar.redirectUri) && Intrinsics.f(this.scopes, aVar.scopes) && Intrinsics.f(this.stateToken, aVar.stateToken);
    }

    public final int hashCode() {
        return this.stateToken.hashCode() + p.a.d(p.a.c(p.a.c(p.a.c(this.clientId.hashCode() * 31, 31, this.pkceCodeChallenge), 31, this.pkceCodeChallengeMethod), 31, this.redirectUri), 31, this.scopes);
    }
}
