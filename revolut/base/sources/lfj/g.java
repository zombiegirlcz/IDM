package lfj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Llfj/g;", "", "", "toString", "()Ljava/lang/String;", "Llfj/k;", "a", "Llfj/k;", "getDonorDetails", "()Llfj/k;", "donorDetails", "Llfj/l;", "b", "Llfj/l;", "getPreferredSchedule", "()Llfj/l;", "preferredSchedule", "", "Llfj/f;", "c", "Ljava/util/List;", "getAdditionalRequiredInformation", "()Ljava/util/List;", "additionalRequiredInformation", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("donorDetails")
    private final k donorDetails;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("preferredSchedule")
    private final l preferredSchedule;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("additionalRequiredInformation")
    private final List<f> additionalRequiredInformation;

    public g(k kVar, l lVar, ArrayList arrayList) {
        this.donorDetails = kVar;
        this.preferredSchedule = lVar;
        this.additionalRequiredInformation = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.donorDetails, gVar.donorDetails) && Intrinsics.f(this.preferredSchedule, gVar.preferredSchedule) && Intrinsics.f(this.additionalRequiredInformation, gVar.additionalRequiredInformation);
    }

    public final int hashCode() {
        k kVar = this.donorDetails;
        int iHashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        l lVar = this.preferredSchedule;
        int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        List<f> list = this.additionalRequiredInformation;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
