package j2l;

import com.revolut.retail.feature.travel_status.impl.ui.screens.partner.TravelStatusPartnerActionBottomSheetData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelStatusPartnerActionBottomSheetData f170911a;

    public f(TravelStatusPartnerActionBottomSheetData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f170911a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f170911a, ((f) obj2).f170911a);
    }

    public final int hashCode() {
        return this.f170911a.hashCode();
    }
}
