package jkl;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0006\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\r\u0010\u0017¨\u0006\u0019"}, d2 = {"Ljkl/c;", "Ljkl/h;", "", "toString", "()Ljava/lang/String;", "Ljkl/b;", "a", "Ljkl/b;", "getCode", "()Ljkl/b;", "code", "", "Ljkl/i;", "b", "Ljava/util/List;", "()Ljava/util/List;", "availableMethods", "c", "Ljava/lang/String;", "sessionToken", "Ljkl/w;", "d", "Ljkl/w;", "()Ljkl/w;", "challenge", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    @NotNull
    private final b code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("availableMethods")
    @NotNull
    private final List<i> availableMethods;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("sessionToken")
    private final String sessionToken;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("challenge")
    @NotNull
    private final w challenge;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAvailableMethods() {
        return this.availableMethods;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final w getChallenge() {
        return this.challenge;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.code == cVar.code && Intrinsics.f(this.availableMethods, cVar.availableMethods) && Intrinsics.f(this.sessionToken, cVar.sessionToken) && Intrinsics.f(this.challenge, cVar.challenge);
    }

    public final int hashCode() {
        int iD = p.a.d(this.code.hashCode() * 31, 31, this.availableMethods);
        String str = this.sessionToken;
        return this.challenge.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
