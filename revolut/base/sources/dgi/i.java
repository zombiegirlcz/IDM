package dgi;

import com.revolut.feature_travel_hotels_models.search.TravelHotelsSortingOption;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ffi.e f114691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f114692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f114693c;
    public final List d;
    public final zfi.a e;
    public final TravelHotelsSortingOption f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f114694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f114695h;

    public i(ffi.e eVar, List list, e eVar2, List list2, zfi.a aVar, TravelHotelsSortingOption travelHotelsSortingOption, boolean z, List suggestions) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.f114691a = eVar;
        this.f114692b = list;
        this.f114693c = eVar2;
        this.d = list2;
        this.e = aVar;
        this.f = travelHotelsSortingOption;
        this.f114694g = z;
        this.f114695h = suggestions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f114691a, iVar.f114691a) && Intrinsics.f(this.f114692b, iVar.f114692b) && Intrinsics.f(this.f114693c, iVar.f114693c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && this.f114694g == iVar.f114694g && Intrinsics.f(this.f114695h, iVar.f114695h);
    }

    public final int hashCode() {
        ffi.e eVar = this.f114691a;
        int iHashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        List list = this.f114692b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        e eVar2 = this.f114693c;
        int iHashCode3 = (iHashCode2 + (eVar2 == null ? 0 : eVar2.hashCode())) * 31;
        List list2 = this.d;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        zfi.a aVar = this.e;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        TravelHotelsSortingOption travelHotelsSortingOption = this.f;
        return this.f114695h.hashCode() + j6.a.c((iHashCode5 + (travelHotelsSortingOption != null ? travelHotelsSortingOption.hashCode() : 0)) * 31, 31, this.f114694g);
    }
}
