package qdb;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0080\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0013"}, d2 = {"Lqdb/i;", "", "", "toString", "()Ljava/lang/String;", "Lqdb/a;", "a", "Lqdb/a;", "getCustomer", "()Lqdb/a;", "customer", "b", "Ljava/lang/String;", "getNote", "note", "c", "getAuthorisationToken", "authorisationToken", "Companion", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("customer")
    private final a customer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("note")
    private final String note;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("authorisationToken")
    private final String authorisationToken = null;

    public i(a aVar, String str) {
        this.customer = aVar;
        this.note = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.customer, iVar.customer) && Intrinsics.f(this.note, iVar.note) && Intrinsics.f(this.authorisationToken, iVar.authorisationToken);
    }

    public final int hashCode() {
        a aVar = this.customer;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        String str = this.note;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.authorisationToken;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
