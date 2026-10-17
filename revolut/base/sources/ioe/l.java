package ioe;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0014"}, d2 = {"Lioe/l;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getCountry", "country", "", "b", "Ljava/lang/Boolean;", "isResident", "()Ljava/lang/Boolean;", "c", "getTinValue", "tinValue", "d", "getExemption", "exemption", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("country")
    @NotNull
    private final String country;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("isResident")
    private final Boolean isResident;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("tinValue")
    private final String tinValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("exemption")
    private final String exemption;

    public l(String country, Boolean bool, String str, String str2) {
        Intrinsics.checkNotNullParameter(country, "country");
        this.country = country;
        this.isResident = bool;
        this.tinValue = str;
        this.exemption = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.country, lVar.country) && Intrinsics.f(this.isResident, lVar.isResident) && Intrinsics.f(this.tinValue, lVar.tinValue) && Intrinsics.f(this.exemption, lVar.exemption);
    }

    public final int hashCode() {
        int iHashCode = this.country.hashCode() * 31;
        Boolean bool = this.isResident;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.tinValue;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.exemption;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
