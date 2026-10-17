package ncj;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f214230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f214231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f214232c;
    public final List d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xi0.b f214233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f214234h;

    public g(Data detailedPriceTargetsInfo, d chartType, List list, List list2, List list3, List list4, xi0.b bVar, e eVar) {
        b bVar2;
        List list5;
        Intrinsics.checkNotNullParameter(detailedPriceTargetsInfo, "detailedPriceTargetsInfo");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        this.f214230a = detailedPriceTargetsInfo;
        this.f214231b = chartType;
        this.f214232c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.f214233g = bVar;
        this.f214234h = eVar;
        c cVar = (c) detailedPriceTargetsInfo.getContent();
        if ((cVar == null || (bVar2 = cVar.f214224a) == null || (list5 = bVar2.f214223c) == null) ? false : !list5.isEmpty()) {
            if (list2 != null && list3 != null && bVar != null && list != null && list4 != null) {
                return;
            }
        } else if (list2 == null && list3 == null && bVar == null && list == null && list4 == null) {
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f214230a, gVar.f214230a) && this.f214231b == gVar.f214231b && Intrinsics.f(this.f214232c, gVar.f214232c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f214233g, gVar.f214233g) && Intrinsics.f(this.f214234h, gVar.f214234h);
    }

    public final int hashCode() {
        int iHashCode = (this.f214231b.hashCode() + (this.f214230a.hashCode() * 31)) * 31;
        List list = this.f214232c;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.e;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.f;
        int iHashCode5 = (iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        xi0.b bVar = this.f214233g;
        int iHashCode6 = (iHashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        e eVar = this.f214234h;
        return iHashCode6 + (eVar != null ? eVar.hashCode() : 0);
    }
}
