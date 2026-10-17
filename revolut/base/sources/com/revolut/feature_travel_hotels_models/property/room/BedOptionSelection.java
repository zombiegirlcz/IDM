package com.revolut.feature_travel_hotels_models.property.room;

import android.os.Parcel;
import android.os.Parcelable;
import cgi.k;
import cgi.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/room/BedOptionSelection;", "Landroid/os/Parcelable;", "Lcgi/k;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BedOptionSelection implements Parcelable, k {

    @NotNull
    public static final Parcelable.Creator<BedOptionSelection> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsPropertyRoomOccupancyRatesSelection f98090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BedOption f98091b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BedOptionSelection(HotelsPropertyRoomOccupancyRatesSelection.CREATOR.createFromParcel(parcel), BedOption.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BedOptionSelection[i];
        }
    }

    public BedOptionSelection(HotelsPropertyRoomOccupancyRatesSelection occupancyRatesSelection, BedOption bedOption) {
        Intrinsics.checkNotNullParameter(occupancyRatesSelection, "occupancyRatesSelection");
        Intrinsics.checkNotNullParameter(bedOption, "bedOption");
        this.f98090a = occupancyRatesSelection;
        this.f98091b = bedOption;
    }

    @Override // cgi.k
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BedOption getF98091b() {
        return this.f98091b;
    }

    @Override // cgi.k
    public final o b() {
        return this.f98090a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BedOptionSelection)) {
            return false;
        }
        BedOptionSelection bedOptionSelection = (BedOptionSelection) obj2;
        return Intrinsics.f(this.f98090a, bedOptionSelection.f98090a) && Intrinsics.f(this.f98091b, bedOptionSelection.f98091b);
    }

    public final int hashCode() {
        return this.f98091b.f98087a.hashCode() + (this.f98090a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f98090a.writeToParcel(dest, i);
        this.f98091b.writeToParcel(dest, i);
    }
}
