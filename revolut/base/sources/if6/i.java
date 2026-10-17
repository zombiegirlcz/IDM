package if6;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004¨\u0006\u001e"}, d2 = {"Lif6/i;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getRedirectUri", "redirectUri", "b", "getClientId", "clientId", "c", "getNonce", "nonce", "d", "getState", "state", "", "e", "Ljava/util/List;", "getConsentedPockets", "()Ljava/util/List;", "consentedPockets", "f", "getRequest", "request", "g", "getResponseMode", "responseMode", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("redirectUri")
    @NotNull
    private final String redirectUri;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("clientId")
    @NotNull
    private final String clientId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("nonce")
    private final String nonce;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("state")
    private final String state;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("consentedPockets")
    @NotNull
    private final List<String> consentedPockets;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("request")
    @NotNull
    private final String request;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("responseMode")
    private final String responseMode;

    public i(String redirectUri, String clientId, String str, String str2, String request, List consentedPockets, String str3) {
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(consentedPockets, "consentedPockets");
        Intrinsics.checkNotNullParameter(request, "request");
        this.redirectUri = redirectUri;
        this.clientId = clientId;
        this.nonce = str;
        this.state = str2;
        this.consentedPockets = consentedPockets;
        this.request = request;
        this.responseMode = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.redirectUri, iVar.redirectUri) && Intrinsics.f(this.clientId, iVar.clientId) && Intrinsics.f(this.nonce, iVar.nonce) && Intrinsics.f(this.state, iVar.state) && Intrinsics.f(this.consentedPockets, iVar.consentedPockets) && Intrinsics.f(this.request, iVar.request) && Intrinsics.f(this.responseMode, iVar.responseMode);
    }

    public final int hashCode() {
        int iC = p.a.c(this.redirectUri.hashCode() * 31, 31, this.clientId);
        String str = this.nonce;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.state;
        int iC2 = p.a.c(p.a.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.consentedPockets), 31, this.request);
        String str3 = this.responseMode;
        return iC2 + (str3 != null ? str3.hashCode() : 0);
    }
}
