package com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home;

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
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/flow/home/TravelHotelsHomeFlowContract$PagerItem", "Lcom/revolut/kompot/navigable/vc/pager/FixedIdPagerItem;", "Landroid/os/Parcelable;", "", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/home/TravelHotelsHomeFlowContract$PagerItem;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "DISCOVER", "FAVORITES", "BOOKINGS", "TRANSFERS", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsHomeFlowContract$PagerItem implements FixedIdPagerItem, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TravelHotelsHomeFlowContract$PagerItem[] $VALUES;
    public static final TravelHotelsHomeFlowContract$PagerItem BOOKINGS;

    @NotNull
    public static final Parcelable.Creator<TravelHotelsHomeFlowContract$PagerItem> CREATOR;
    public static final TravelHotelsHomeFlowContract$PagerItem DISCOVER;
    public static final TravelHotelsHomeFlowContract$PagerItem FAVORITES;
    public static final TravelHotelsHomeFlowContract$PagerItem TRANSFERS;

    @NotNull
    private final String id;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return TravelHotelsHomeFlowContract$PagerItem.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsHomeFlowContract$PagerItem[i];
        }
    }

    static {
        TravelHotelsHomeFlowContract$PagerItem travelHotelsHomeFlowContract$PagerItem = new TravelHotelsHomeFlowContract$PagerItem("DISCOVER", 0, "DISCOVER");
        DISCOVER = travelHotelsHomeFlowContract$PagerItem;
        TravelHotelsHomeFlowContract$PagerItem travelHotelsHomeFlowContract$PagerItem2 = new TravelHotelsHomeFlowContract$PagerItem("FAVORITES", 1, "FAVORITES");
        FAVORITES = travelHotelsHomeFlowContract$PagerItem2;
        TravelHotelsHomeFlowContract$PagerItem travelHotelsHomeFlowContract$PagerItem3 = new TravelHotelsHomeFlowContract$PagerItem("BOOKINGS", 2, "BOOKINGS");
        BOOKINGS = travelHotelsHomeFlowContract$PagerItem3;
        TravelHotelsHomeFlowContract$PagerItem travelHotelsHomeFlowContract$PagerItem4 = new TravelHotelsHomeFlowContract$PagerItem("TRANSFERS", 3, "TRANSFERS");
        TRANSFERS = travelHotelsHomeFlowContract$PagerItem4;
        TravelHotelsHomeFlowContract$PagerItem[] travelHotelsHomeFlowContract$PagerItemArr = {travelHotelsHomeFlowContract$PagerItem, travelHotelsHomeFlowContract$PagerItem2, travelHotelsHomeFlowContract$PagerItem3, travelHotelsHomeFlowContract$PagerItem4};
        $VALUES = travelHotelsHomeFlowContract$PagerItemArr;
        $ENTRIES = s.n(travelHotelsHomeFlowContract$PagerItemArr);
        CREATOR = new a();
    }

    public TravelHotelsHomeFlowContract$PagerItem(String str, int i, String str2) {
        this.id = str2;
    }

    public static TravelHotelsHomeFlowContract$PagerItem valueOf(String str) {
        return (TravelHotelsHomeFlowContract$PagerItem) Enum.valueOf(TravelHotelsHomeFlowContract$PagerItem.class, str);
    }

    public static TravelHotelsHomeFlowContract$PagerItem[] values() {
        return (TravelHotelsHomeFlowContract$PagerItem[]) $VALUES.clone();
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
