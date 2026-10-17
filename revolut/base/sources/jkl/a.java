package jkl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0015"}, d2 = {"Ljkl/a;", "Ljkl/h;", "", "toString", "()Ljava/lang/String;", "Ljkl/b;", "a", "Ljkl/b;", "getCode", "()Ljkl/b;", "code", "Ljkl/b0;", "b", "Ljkl/b0;", "()Ljkl/b0;", "claimRequired", "c", "Ljava/lang/String;", "sessionToken", "d", "updatableClaim", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    @NotNull
    private final b code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("claimRequired")
    @NotNull
    private final b0 claimRequired;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("sessionToken")
    @NotNull
    private final String sessionToken;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("updatableClaim")
    private final String updatableClaim;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getClaimRequired() {
        return this.claimRequired;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUpdatableClaim() {
        return this.updatableClaim;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.code == aVar.code && this.claimRequired == aVar.claimRequired && Intrinsics.f(this.sessionToken, aVar.sessionToken) && Intrinsics.f(this.updatableClaim, aVar.updatableClaim);
    }

    public final int hashCode() {
        int iC = p.a.c((this.claimRequired.hashCode() + (this.code.hashCode() * 31)) * 31, 31, this.sessionToken);
        String str = this.updatableClaim;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
