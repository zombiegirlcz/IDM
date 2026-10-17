package ioe;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\t\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004¨\u0006\u001b"}, d2 = {"Lioe/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "country", "", "b", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", "isResident", "c", "exemption", "d", "e", "status", "f", "statusTitle", "Z", "()Z", "modifiable", "g", "deletable", "tinValue", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("country")
    @NotNull
    private final String country;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("isResident")
    private final Boolean isResident;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("exemption")
    private final String exemption;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("status")
    private final String status;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("statusTitle")
    private final String statusTitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("modifiable")
    private final boolean modifiable;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("deletable")
    private final boolean deletable;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("tinValue")
    private final String tinValue;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDeletable() {
        return this.deletable;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getExemption() {
        return this.exemption;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getModifiable() {
        return this.modifiable;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.country, dVar.country) && Intrinsics.f(this.isResident, dVar.isResident) && Intrinsics.f(this.exemption, dVar.exemption) && Intrinsics.f(this.status, dVar.status) && Intrinsics.f(this.statusTitle, dVar.statusTitle) && this.modifiable == dVar.modifiable && this.deletable == dVar.deletable && Intrinsics.f(this.tinValue, dVar.tinValue);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStatusTitle() {
        return this.statusTitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTinValue() {
        return this.tinValue;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getIsResident() {
        return this.isResident;
    }

    public final int hashCode() {
        int iHashCode = this.country.hashCode() * 31;
        Boolean bool = this.isResident;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.exemption;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.status;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.statusTitle;
        int iC = j6.a.c(j6.a.c((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.modifiable), 31, this.deletable);
        String str4 = this.tinValue;
        return iC + (str4 != null ? str4.hashCode() : 0);
    }
}
