package com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_passengers;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/airportlounges/impl/ui/screens/pass_passengers/AirportLoungePassPassengersContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AirportLoungePassPassengersContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AirportLoungePassPassengersContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f99135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f99136c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AirportLoungePassPassengersContract$InputData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AirportLoungePassPassengersContract$InputData[i];
        }
    }

    public AirportLoungePassPassengersContract$InputData(String passId, String str, String str2) {
        Intrinsics.checkNotNullParameter(passId, "passId");
        this.f99134a = passId;
        this.f99135b = str;
        this.f99136c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AirportLoungePassPassengersContract$InputData)) {
            return false;
        }
        AirportLoungePassPassengersContract$InputData airportLoungePassPassengersContract$InputData = (AirportLoungePassPassengersContract$InputData) obj2;
        return Intrinsics.f(this.f99134a, airportLoungePassPassengersContract$InputData.f99134a) && Intrinsics.f(this.f99135b, airportLoungePassPassengersContract$InputData.f99135b) && Intrinsics.f(this.f99136c, airportLoungePassPassengersContract$InputData.f99136c);
    }

    public final int hashCode() {
        int iHashCode = this.f99134a.hashCode() * 31;
        String str = this.f99135b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f99136c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99134a);
        dest.writeString(this.f99135b);
        dest.writeString(this.f99136c);
    }
}
