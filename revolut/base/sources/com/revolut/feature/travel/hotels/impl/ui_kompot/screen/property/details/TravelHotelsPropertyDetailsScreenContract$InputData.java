package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyInputData;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/screen/property/details/TravelHotelsPropertyDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsPropertyDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsPropertyDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsPropertyInputData f93981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f93982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f93983c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelHotelsPropertyDetailsScreenContract$InputData((HotelsPropertyInputData) parcel.readParcelable(TravelHotelsPropertyDetailsScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsPropertyDetailsScreenContract$InputData[i];
        }
    }

    public TravelHotelsPropertyDetailsScreenContract$InputData(HotelsPropertyInputData propertyInputData, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(propertyInputData, "propertyInputData");
        this.f93981a = propertyInputData;
        this.f93982b = z;
        this.f93983c = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsPropertyDetailsScreenContract$InputData)) {
            return false;
        }
        TravelHotelsPropertyDetailsScreenContract$InputData travelHotelsPropertyDetailsScreenContract$InputData = (TravelHotelsPropertyDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f93981a, travelHotelsPropertyDetailsScreenContract$InputData.f93981a) && this.f93982b == travelHotelsPropertyDetailsScreenContract$InputData.f93982b && this.f93983c == travelHotelsPropertyDetailsScreenContract$InputData.f93983c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f93983c) + j6.a.c(this.f93981a.hashCode() * 31, 31, this.f93982b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f93981a, i);
        dest.writeInt(this.f93982b ? 1 : 0);
        dest.writeInt(this.f93983c ? 1 : 0);
    }
}
