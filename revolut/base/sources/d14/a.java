package d14;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\"\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0004R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ld14/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Boolean;", "getExternalAccountsLinked", "()Ljava/lang/Boolean;", "externalAccountsLinked", "b", "getRevolutAccountSelected", "revolutAccountSelected", "c", "Ljava/lang/String;", "getEvidenceHolderType", "evidenceHolderType", "", "d", "Ljava/util/Set;", "getTransactionIds", "()Ljava/util/Set;", "transactionIds", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("externalAccountsLinked")
    private final Boolean externalAccountsLinked;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("revolutAccountSelected")
    private final Boolean revolutAccountSelected;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("evidenceHolder")
    private final String evidenceHolderType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("transactionIds")
    private final Set<String> transactionIds;

    public a() {
        this(15);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.externalAccountsLinked, aVar.externalAccountsLinked) && Intrinsics.f(this.revolutAccountSelected, aVar.revolutAccountSelected) && Intrinsics.f(this.evidenceHolderType, aVar.evidenceHolderType) && Intrinsics.f(this.transactionIds, aVar.transactionIds);
    }

    public final int hashCode() {
        Boolean bool = this.externalAccountsLinked;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.revolutAccountSelected;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.evidenceHolderType;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Set<String> set = this.transactionIds;
        return iHashCode3 + (set != null ? set.hashCode() : 0);
    }

    public /* synthetic */ a(int i) {
        this(null, null, (i & 4) != 0 ? null : "CO_APPLICANT", null);
    }

    public a(Boolean bool, Boolean bool2, String str, Set set) {
        this.externalAccountsLinked = bool;
        this.revolutAccountSelected = bool2;
        this.evidenceHolderType = str;
        this.transactionIds = set;
    }
}
