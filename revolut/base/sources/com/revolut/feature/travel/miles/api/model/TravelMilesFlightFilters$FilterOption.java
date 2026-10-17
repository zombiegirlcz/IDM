package com.revolut.feature.travel.miles.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/miles/api/model/TravelMilesFlightFilters$FilterOption", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelMilesFlightFilters$FilterOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelMilesFlightFilters$FilterOption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94098c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelMilesFlightFilters$FilterOption(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelMilesFlightFilters$FilterOption[i];
        }
    }

    public TravelMilesFlightFilters$FilterOption(String code, String label, String str, String str2) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f94096a = code;
        this.f94097b = label;
        this.f94098c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelMilesFlightFilters$FilterOption)) {
            return false;
        }
        TravelMilesFlightFilters$FilterOption travelMilesFlightFilters$FilterOption = (TravelMilesFlightFilters$FilterOption) obj2;
        return Intrinsics.f(this.f94096a, travelMilesFlightFilters$FilterOption.f94096a) && Intrinsics.f(this.f94097b, travelMilesFlightFilters$FilterOption.f94097b) && Intrinsics.f(this.f94098c, travelMilesFlightFilters$FilterOption.f94098c) && Intrinsics.f(this.d, travelMilesFlightFilters$FilterOption.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f94096a.hashCode() * 31, 31, this.f94097b);
        String str = this.f94098c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94096a);
        dest.writeString(this.f94097b);
        dest.writeString(this.f94098c);
        dest.writeString(this.d);
    }
}
