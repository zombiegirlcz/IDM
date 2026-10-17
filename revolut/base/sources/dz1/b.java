package dz1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0015"}, d2 = {"Ldz1/b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Boolean;", "getTrustedCounterparty", "()Ljava/lang/Boolean;", "trustedCounterparty", "Lt02/d;", "b", "Lt02/d;", "getSource", "()Lt02/d;", "source", "c", "Ljava/lang/String;", "getAuthToken", "authToken", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("trustedCounterparty")
    private final Boolean trustedCounterparty;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("source")
    private final t02.d source;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("authToken")
    private final String authToken;

    public b() {
        this(null, null, null, 7);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.trustedCounterparty, bVar.trustedCounterparty) && Intrinsics.f(this.source, bVar.source) && Intrinsics.f(this.authToken, bVar.authToken);
    }

    public final int hashCode() {
        Boolean bool = this.trustedCounterparty;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        t02.d dVar = this.source;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.authToken;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public b(Boolean bool, t02.d dVar, String str, int i) {
        bool = (i & 1) != 0 ? null : bool;
        dVar = (i & 2) != 0 ? null : dVar;
        str = (i & 4) != 0 ? null : str;
        this.trustedCounterparty = bool;
        this.source = dVar;
        this.authToken = str;
    }
}
