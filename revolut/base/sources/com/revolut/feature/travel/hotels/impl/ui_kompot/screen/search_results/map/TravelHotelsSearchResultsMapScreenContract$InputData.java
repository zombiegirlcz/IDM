package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/screen/search_results/map/TravelHotelsSearchResultsMapScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsSearchResultsMapScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsSearchResultsMapScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f94053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f94054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94055c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelHotelsSearchResultsMapScreenContract$InputData(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsSearchResultsMapScreenContract$InputData[i];
        }
    }

    public TravelHotelsSearchResultsMapScreenContract$InputData() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsSearchResultsMapScreenContract$InputData)) {
            return false;
        }
        TravelHotelsSearchResultsMapScreenContract$InputData travelHotelsSearchResultsMapScreenContract$InputData = (TravelHotelsSearchResultsMapScreenContract$InputData) obj2;
        return this.f94053a == travelHotelsSearchResultsMapScreenContract$InputData.f94053a && this.f94054b == travelHotelsSearchResultsMapScreenContract$InputData.f94054b && Intrinsics.f(this.f94055c, travelHotelsSearchResultsMapScreenContract$InputData.f94055c);
    }

    public final int hashCode() {
        int iC = j6.a.c(Boolean.hashCode(this.f94053a) * 31, 31, this.f94054b);
        String str = this.f94055c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f94053a ? 1 : 0);
        dest.writeInt(this.f94054b ? 1 : 0);
        dest.writeString(this.f94055c);
    }

    public TravelHotelsSearchResultsMapScreenContract$InputData(String str, boolean z, boolean z3) {
        this.f94053a = z;
        this.f94054b = z3;
        this.f94055c = str;
    }

    public /* synthetic */ TravelHotelsSearchResultsMapScreenContract$InputData(int i) {
        this(null, false, false);
    }
}
