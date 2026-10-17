package mf6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Lmf6/j;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getClientId", "clientId", "b", "getRequestUri", "requestUri", "c", "getScope", "scope", "d", "getState", "state", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("clientId")
    @NotNull
    private final String clientId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("requestUri")
    @NotNull
    private final String requestUri;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("scope")
    private final String scope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("state")
    private final String state;

    public j(String clientId, String requestUri, String str, String str2) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(requestUri, "requestUri");
        this.clientId = clientId;
        this.requestUri = requestUri;
        this.scope = str;
        this.state = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.clientId, jVar.clientId) && Intrinsics.f(this.requestUri, jVar.requestUri) && Intrinsics.f(this.scope, jVar.scope) && Intrinsics.f(this.state, jVar.state);
    }

    public final int hashCode() {
        int iC = p.a.c(this.clientId.hashCode() * 31, 31, this.requestUri);
        String str = this.scope;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.state;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
