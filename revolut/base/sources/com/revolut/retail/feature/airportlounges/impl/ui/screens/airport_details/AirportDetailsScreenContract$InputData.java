package com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/airportlounges/impl/ui/screens/airport_details/AirportDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AirportDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AirportDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f99031b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AirportDetailsScreenContract$InputData(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AirportDetailsScreenContract$InputData[i];
        }
    }

    public AirportDetailsScreenContract$InputData(String airportId, boolean z) {
        Intrinsics.checkNotNullParameter(airportId, "airportId");
        this.f99030a = airportId;
        this.f99031b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AirportDetailsScreenContract$InputData)) {
            return false;
        }
        AirportDetailsScreenContract$InputData airportDetailsScreenContract$InputData = (AirportDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f99030a, airportDetailsScreenContract$InputData.f99030a) && this.f99031b == airportDetailsScreenContract$InputData.f99031b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f99031b) + (this.f99030a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99030a);
        dest.writeInt(this.f99031b ? 1 : 0);
    }
}
