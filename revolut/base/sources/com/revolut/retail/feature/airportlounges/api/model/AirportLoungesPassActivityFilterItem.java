package com.revolut.retail.feature.airportlounges.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/api/model/AirportLoungesPassActivityFilterItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AirportLoungesPassActivityFilterItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AirportLoungesPassActivityFilterItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98925b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AirportLoungesPassActivityFilterItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AirportLoungesPassActivityFilterItem[i];
        }
    }

    public AirportLoungesPassActivityFilterItem(String code, String label) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f98924a = code;
        this.f98925b = label;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AirportLoungesPassActivityFilterItem)) {
            return false;
        }
        AirportLoungesPassActivityFilterItem airportLoungesPassActivityFilterItem = (AirportLoungesPassActivityFilterItem) obj2;
        return Intrinsics.f(this.f98924a, airportLoungesPassActivityFilterItem.f98924a) && Intrinsics.f(this.f98925b, airportLoungesPassActivityFilterItem.f98925b);
    }

    public final int hashCode() {
        return this.f98925b.hashCode() + (this.f98924a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98924a);
        dest.writeString(this.f98925b);
    }
}
