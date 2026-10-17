package st6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u000f"}, d2 = {"Lst6/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getBusinessCategoryId", "businessCategoryId", "b", "getBusinessModelDescription", "businessModelDescription", "c", "getBusinessUrl", "businessUrl", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("businessCategoryId")
    private final String businessCategoryId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("businessModelDescription")
    private final String businessModelDescription;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("url")
    private final String businessUrl;

    public b(String str, String str2, String str3) {
        this.businessCategoryId = str;
        this.businessModelDescription = str2;
        this.businessUrl = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.businessCategoryId, bVar.businessCategoryId) && Intrinsics.f(this.businessModelDescription, bVar.businessModelDescription) && Intrinsics.f(this.businessUrl, bVar.businessUrl);
    }

    public final int hashCode() {
        String str = this.businessCategoryId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.businessModelDescription;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.businessUrl;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
