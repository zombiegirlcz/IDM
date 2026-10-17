package ks6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004¨\u0006\u000f"}, d2 = {"Lks6/m;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "avsLine1", "b", "avsPostal", "c", "cvv", "d", "threeds", "Companion", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("avsLine1")
    private final String avsLine1;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("avsPostal")
    private final String avsPostal;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("cvv")
    private final String cvv;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("threeds")
    private final String threeds;

    public m(String str, String str2, String str3, String str4) {
        this.avsLine1 = str;
        this.avsPostal = str2;
        this.cvv = str3;
        this.threeds = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAvsLine1() {
        return this.avsLine1;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAvsPostal() {
        return this.avsPostal;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCvv() {
        return this.cvv;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getThreeds() {
        return this.threeds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.avsLine1, mVar.avsLine1) && Intrinsics.f(this.avsPostal, mVar.avsPostal) && Intrinsics.f(this.cvv, mVar.cvv) && Intrinsics.f(this.threeds, mVar.threeds);
    }

    public final int hashCode() {
        String str = this.avsLine1;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.avsPostal;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cvv;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.threeds;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
