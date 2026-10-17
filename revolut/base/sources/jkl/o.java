package jkl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u0000 \n2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Ljkl/o;", "Ljkl/v;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "authorizationUrl", "b", "callbackUrl", "Companion", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("authorizationUrl")
    @NotNull
    private final String authorizationUrl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("callbackUrl")
    @NotNull
    private final String callbackUrl;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAuthorizationUrl() {
        return this.authorizationUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCallbackUrl() {
        return this.callbackUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.authorizationUrl, oVar.authorizationUrl) && Intrinsics.f(this.callbackUrl, oVar.callbackUrl);
    }

    public final int hashCode() {
        return this.callbackUrl.hashCode() + (this.authorizationUrl.hashCode() * 31);
    }
}
