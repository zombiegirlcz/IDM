package tag;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit.TravelHotelsTravellerInformationEditScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsTravellerInformationEditScreenContract$InputData.Draft f269332a;

    public h(TravelHotelsTravellerInformationEditScreenContract$InputData.Draft inputTravellerInfo) {
        Intrinsics.checkNotNullParameter(inputTravellerInfo, "inputTravellerInfo");
        this.f269332a = inputTravellerInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f269332a.equals(((h) obj2).f269332a);
    }

    public final int hashCode() {
        return this.f269332a.f94071a.hashCode();
    }
}
