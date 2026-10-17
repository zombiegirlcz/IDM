package com.revolut.feature.travel.flights.impl.ui.flow.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/travel/flights/impl/ui/flow/home/TravelFlightsHomeFlowContract$PagerItem", "Lcom/revolut/kompot/navigable/vc/pager/FixedIdPagerItem;", "Landroid/os/Parcelable;", "", "Lcom/revolut/feature/travel/flights/impl/ui/flow/home/TravelFlightsHomeFlowContract$PagerItem;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "DISCOVER", "BOOKINGS", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsHomeFlowContract$PagerItem implements FixedIdPagerItem, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TravelFlightsHomeFlowContract$PagerItem[] $VALUES;
    public static final TravelFlightsHomeFlowContract$PagerItem BOOKINGS;

    @NotNull
    public static final Parcelable.Creator<TravelFlightsHomeFlowContract$PagerItem> CREATOR;
    public static final TravelFlightsHomeFlowContract$PagerItem DISCOVER;

    @NotNull
    private final String id;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return TravelFlightsHomeFlowContract$PagerItem.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsHomeFlowContract$PagerItem[i];
        }
    }

    static {
        TravelFlightsHomeFlowContract$PagerItem travelFlightsHomeFlowContract$PagerItem = new TravelFlightsHomeFlowContract$PagerItem("DISCOVER", 0, "DISCOVER");
        DISCOVER = travelFlightsHomeFlowContract$PagerItem;
        TravelFlightsHomeFlowContract$PagerItem travelFlightsHomeFlowContract$PagerItem2 = new TravelFlightsHomeFlowContract$PagerItem("BOOKINGS", 1, "BOOKINGS");
        BOOKINGS = travelFlightsHomeFlowContract$PagerItem2;
        TravelFlightsHomeFlowContract$PagerItem[] travelFlightsHomeFlowContract$PagerItemArr = {travelFlightsHomeFlowContract$PagerItem, travelFlightsHomeFlowContract$PagerItem2};
        $VALUES = travelFlightsHomeFlowContract$PagerItemArr;
        $ENTRIES = s.n(travelFlightsHomeFlowContract$PagerItemArr);
        CREATOR = new a();
    }

    public TravelFlightsHomeFlowContract$PagerItem(String str, int i, String str2) {
        this.id = str2;
    }

    public static TravelFlightsHomeFlowContract$PagerItem valueOf(String str) {
        return (TravelFlightsHomeFlowContract$PagerItem) Enum.valueOf(TravelFlightsHomeFlowContract$PagerItem.class, str);
    }

    public static TravelFlightsHomeFlowContract$PagerItem[] values() {
        return (TravelFlightsHomeFlowContract$PagerItem[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem, com.revolut.kompot.navigable.vc.pager.PagerItem
    public final String getId() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
