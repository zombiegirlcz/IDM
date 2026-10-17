package xil;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 \f2\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0007\u001a\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lxil/c;", "Lxil/d;", "", "toString", "()Ljava/lang/String;", "Lcom/revolut/feature/identity/auth/domain/model/RegisteredIdentityId;", "a", "Ljava/lang/String;", "accountIdChangeInitiated", "b", "getType", "type", "Companion", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountIdChangeInitiated")
    @NotNull
    private final String accountIdChangeInitiated;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    public c(String accountIdChangeInitiated) {
        Intrinsics.checkNotNullParameter(accountIdChangeInitiated, "accountIdChangeInitiated");
        Intrinsics.checkNotNullParameter("MULTIPLE", "type");
        this.accountIdChangeInitiated = accountIdChangeInitiated;
        this.type = "MULTIPLE";
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccountIdChangeInitiated() {
        return this.accountIdChangeInitiated;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.accountIdChangeInitiated, cVar.accountIdChangeInitiated) && Intrinsics.f(this.type, cVar.type);
    }

    public final int hashCode() {
        return this.type.hashCode() + (this.accountIdChangeInitiated.hashCode() * 31);
    }
}
