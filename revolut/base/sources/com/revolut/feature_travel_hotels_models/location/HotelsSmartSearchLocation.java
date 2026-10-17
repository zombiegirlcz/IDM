package com.revolut.feature_travel_hotels_models.location;

import android.os.Parcel;
import android.os.Parcelable;
import ffi.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/location/HotelsSmartSearchLocation;", "Landroid/os/Parcelable;", "Lffi/e;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsSmartSearchLocation implements Parcelable, e {

    @NotNull
    public static final Parcelable.Creator<HotelsSmartSearchLocation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97959b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HotelsSmartSearchLocation(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsSmartSearchLocation[i];
        }
    }

    public HotelsSmartSearchLocation(String id10, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f97958a = id10;
        this.f97959b = name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsSmartSearchLocation)) {
            return false;
        }
        HotelsSmartSearchLocation hotelsSmartSearchLocation = (HotelsSmartSearchLocation) obj2;
        return Intrinsics.f(this.f97958a, hotelsSmartSearchLocation.f97958a) && Intrinsics.f(this.f97959b, hotelsSmartSearchLocation.f97959b);
    }

    public final int hashCode() {
        return this.f97959b.hashCode() + (this.f97958a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97958a);
        dest.writeString(this.f97959b);
    }
}
