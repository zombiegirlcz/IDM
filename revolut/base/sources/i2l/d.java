package i2l;

import com.revolut.retail.feature.travel_status.impl.ui.screens.partner.TravelStatusPartnerActionBottomSheetData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelStatusPartnerActionBottomSheetData f158006a;

    public d(TravelStatusPartnerActionBottomSheetData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f158006a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f158006a, ((d) obj2).f158006a);
    }

    public final int hashCode() {
        return this.f158006a.hashCode();
    }
}
