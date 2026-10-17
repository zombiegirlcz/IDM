package ioe;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\b\u0010\u000f¨\u0006\u0011"}, d2 = {"Lioe/w;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "countryCode", "b", "c", "documentNumber", "d", "documentType", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "deletable", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("countryCode")
    @NotNull
    private final String countryCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("documentNumber")
    private final String documentNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("documentType")
    private final String documentType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("deletable")
    private final Boolean deletable;

    public w(String countryCode, String str, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.countryCode = countryCode;
        this.documentNumber = str;
        this.documentType = str2;
        this.deletable = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getDeletable() {
        return this.deletable;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.countryCode, wVar.countryCode) && Intrinsics.f(this.documentNumber, wVar.documentNumber) && Intrinsics.f(this.documentType, wVar.documentType) && Intrinsics.f(this.deletable, wVar.deletable);
    }

    public final int hashCode() {
        int iHashCode = this.countryCode.hashCode() * 31;
        String str = this.documentNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.documentType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.deletable;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }
}
