package wue;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yte.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0015"}, d2 = {"Lwue/a;", "", "", "toString", "()Ljava/lang/String;", "Lyte/m;", "a", "Lyte/m;", "getType", "()Lyte/m;", "type", "b", "Ljava/lang/String;", "getAccountNumber", "accountNumber", "c", "getAccountBranchId", "accountBranchId", "d", "getAccountAlias", "accountAlias", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final m type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountNumber")
    private final String accountNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountBranchId")
    private final String accountBranchId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("accountAlias")
    private final String accountAlias;

    public a(m type, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.accountNumber = str;
        this.accountBranchId = str2;
        this.accountAlias = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.type == aVar.type && Intrinsics.f(this.accountNumber, aVar.accountNumber) && Intrinsics.f(this.accountBranchId, aVar.accountBranchId) && Intrinsics.f(this.accountAlias, aVar.accountAlias);
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.accountNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.accountBranchId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accountAlias;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
