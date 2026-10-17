package jkl;

import java.util.List;
import jkl.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0004¨\u0006\u001c"}, d2 = {"Ljkl/f;", "Ljkl/h;", "", "toString", "()Ljava/lang/String;", "Ljkl/b;", "a", "Ljkl/b;", "getCode", "()Ljkl/b;", "code", "Ljkl/j;", "b", "Ljkl/j;", "()Ljkl/j;", "client", "", "Ljkl/p2;", "c", "Ljava/util/List;", "()Ljava/util/List;", "scopes", "Ljkl/u0$b;", "d", "consents", "e", "Ljava/lang/String;", "sessionToken", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    @NotNull
    private final b code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("client")
    @NotNull
    private final j client;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("scopes")
    @NotNull
    private final List<p2> scopes;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("consents")
    @NotNull
    private final List<u0.b> consents;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("sessionToken")
    @NotNull
    private final String sessionToken;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final j getClient() {
        return this.client;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getConsents() {
        return this.consents;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getScopes() {
        return this.scopes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.code == fVar.code && Intrinsics.f(this.client, fVar.client) && Intrinsics.f(this.scopes, fVar.scopes) && Intrinsics.f(this.consents, fVar.consents) && Intrinsics.f(this.sessionToken, fVar.sessionToken);
    }

    public final int hashCode() {
        return this.sessionToken.hashCode() + p.a.d(p.a.d((this.client.hashCode() + (this.code.hashCode() * 31)) * 31, 31, this.scopes), 31, this.consents);
    }
}
