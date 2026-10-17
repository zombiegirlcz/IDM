package jkl;

import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Ljkl/j4;", "", "", "toString", "()Ljava/lang/String;", "Ljkl/b0;", "a", "Ljkl/b0;", "getName", "()Ljkl/b0;", "name", "b", "Ljava/lang/String;", "getValue", "value", "Ljkl/y1;", "c", "Ljkl/y1;", "getEvidence", "()Ljkl/y1;", "evidence", "", "Lcom/revolut/feature/identity/auth/domain/model/RegisteredIdentityId;", "d", "Ljava/util/Set;", "getAccountIds", "()Ljava/util/Set;", "accountIds", "Companion", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final b0 name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    private final String value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("evidence")
    private final y1 evidence;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("accountIds")
    private final Set<RegisteredIdentityId> accountIds;

    public j4(b0 name, String str, y1 y1Var, Set set) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.value = str;
        this.evidence = y1Var;
        this.accountIds = set;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj2;
        return this.name == j4Var.name && Intrinsics.f(this.value, j4Var.value) && Intrinsics.f(this.evidence, j4Var.evidence) && Intrinsics.f(this.accountIds, j4Var.accountIds);
    }

    public final int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.value;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        y1 y1Var = this.evidence;
        int iHashCode3 = (iHashCode2 + (y1Var == null ? 0 : y1Var.hashCode())) * 31;
        Set<RegisteredIdentityId> set = this.accountIds;
        return iHashCode3 + (set != null ? set.hashCode() : 0);
    }
}
