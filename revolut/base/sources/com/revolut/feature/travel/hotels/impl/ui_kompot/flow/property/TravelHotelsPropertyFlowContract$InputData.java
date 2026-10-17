package com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyInputData;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/flow/property/TravelHotelsPropertyFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsPropertyFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsPropertyFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsPropertyInputData f93741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f93742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f93743c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelHotelsPropertyFlowContract$InputData((HotelsPropertyInputData) parcel.readParcelable(TravelHotelsPropertyFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsPropertyFlowContract$InputData[i];
        }
    }

    public TravelHotelsPropertyFlowContract$InputData(HotelsPropertyInputData propertyInputData, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(propertyInputData, "propertyInputData");
        this.f93741a = propertyInputData;
        this.f93742b = z;
        this.f93743c = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsPropertyFlowContract$InputData)) {
            return false;
        }
        TravelHotelsPropertyFlowContract$InputData travelHotelsPropertyFlowContract$InputData = (TravelHotelsPropertyFlowContract$InputData) obj2;
        return Intrinsics.f(this.f93741a, travelHotelsPropertyFlowContract$InputData.f93741a) && this.f93742b == travelHotelsPropertyFlowContract$InputData.f93742b && this.f93743c == travelHotelsPropertyFlowContract$InputData.f93743c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f93743c) + j6.a.c(this.f93741a.hashCode() * 31, 31, this.f93742b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f93741a, i);
        dest.writeInt(this.f93742b ? 1 : 0);
        dest.writeInt(this.f93743c ? 1 : 0);
    }
}
