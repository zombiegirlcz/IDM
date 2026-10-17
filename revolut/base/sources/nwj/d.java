package nwj;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lnwj/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getAlias", "alias", "b", "getOccupation", "occupation", "c", "getAccountPurpose", "accountPurpose", "", "Lnwj/c;", "d", "Ljava/util/List;", "getIdentificationNumbers", "()Ljava/util/List;", "identificationNumbers", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("alias")
    private final String alias;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("occupation")
    private final String occupation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountPurpose")
    private final String accountPurpose;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("identificationNumbers")
    private final List<c> identificationNumbers;

    public d() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.alias, dVar.alias) && Intrinsics.f(this.occupation, dVar.occupation) && Intrinsics.f(this.accountPurpose, dVar.accountPurpose) && Intrinsics.f(this.identificationNumbers, dVar.identificationNumbers);
    }

    public final int hashCode() {
        String str = this.alias;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.occupation;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accountPurpose;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<c> list = this.identificationNumbers;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public d(String str, String str2, String str3, List list) {
        this.alias = str;
        this.occupation = str2;
        this.accountPurpose = str3;
        this.identificationNumbers = list;
    }
}
