package wt6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \f2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lwt6/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "accountName", "b", "accountNumber", "c", "sortCode", "Companion", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountName")
    private final String accountName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountNumber")
    private final String accountNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("sortCode")
    private final String sortCode;

    public d(String str, String str2, String str3) {
        this.accountName = str;
        this.accountNumber = str2;
        this.sortCode = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccountName() {
        return this.accountName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSortCode() {
        return this.sortCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.accountName, dVar.accountName) && Intrinsics.f(this.accountNumber, dVar.accountNumber) && Intrinsics.f(this.sortCode, dVar.sortCode);
    }

    public final int hashCode() {
        String str = this.accountName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accountNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sortCode;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
