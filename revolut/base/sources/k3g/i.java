package k3g;

import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f180720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelExperienceDatesSelection f180721c;

    public i(String attractionId, String attractionName, TravelExperienceDatesSelection datesSelection) {
        Intrinsics.checkNotNullParameter(attractionId, "attractionId");
        Intrinsics.checkNotNullParameter(attractionName, "attractionName");
        Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
        this.f180719a = attractionId;
        this.f180720b = attractionName;
        this.f180721c = datesSelection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f180719a, iVar.f180719a) && Intrinsics.f(this.f180720b, iVar.f180720b) && Intrinsics.f(this.f180721c, iVar.f180721c);
    }

    public final int hashCode() {
        return this.f180721c.hashCode() + p.a.c(this.f180719a.hashCode() * 31, 31, this.f180720b);
    }
}
