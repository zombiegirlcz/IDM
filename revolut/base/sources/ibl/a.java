package ibl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Libl/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getPocketId", "pocketId", "b", "getSavingsAccountId", "savingsAccountId", "Libl/b;", "c", "Libl/b;", "getPortfolio", "()Libl/b;", "portfolio", "feature_shared_transfer_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketId")
    private final String pocketId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("savingsAccountId")
    private final String savingsAccountId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("portfolio")
    private final b portfolio;

    public a() {
        this(null, null, null, 7);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.pocketId, aVar.pocketId) && Intrinsics.f(this.savingsAccountId, aVar.savingsAccountId) && Intrinsics.f(this.portfolio, aVar.portfolio);
    }

    public final int hashCode() {
        String str = this.pocketId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.savingsAccountId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        b bVar = this.portfolio;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public a(String str, String str2, b bVar, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        bVar = (i & 4) != 0 ? null : bVar;
        this.pocketId = str;
        this.savingsAccountId = str2;
        this.portfolio = bVar;
    }
}
