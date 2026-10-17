package com.revolut.feature_travel_hotels_models.property.room;

import android.os.Parcel;
import android.os.Parcelable;
import cgi.o;
import cgi.p;
import cgi.q;
import cgi.r;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/room/HotelsPropertyRoomOccupancyRatesSelection;", "Landroid/os/Parcelable;", "Lcgi/o;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsPropertyRoomOccupancyRatesSelection implements Parcelable, o {

    @NotNull
    public static final Parcelable.Creator<HotelsPropertyRoomOccupancyRatesSelection> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsPropertyRoom f98104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rates f98105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OccupancyRates f98106c;
    public final Lazy d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HotelsPropertyRoomOccupancyRatesSelection(HotelsPropertyRoom.CREATOR.createFromParcel(parcel), Rates.CREATOR.createFromParcel(parcel), OccupancyRates.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsPropertyRoomOccupancyRatesSelection[i];
        }
    }

    public HotelsPropertyRoomOccupancyRatesSelection(HotelsPropertyRoom room, Rates rates, OccupancyRates occupancyRates) {
        Intrinsics.checkNotNullParameter(room, "room");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(occupancyRates, "occupancyRates");
        this.f98104a = room;
        this.f98105b = rates;
        this.f98106c = occupancyRates;
        this.d = j.b(new bvb.a(this, 16));
    }

    @Override // cgi.o
    public final r a() {
        return this.f98105b;
    }

    @Override // cgi.o
    public final List b() {
        return (List) this.d.getValue();
    }

    @Override // cgi.o
    public final q c() {
        return this.f98106c;
    }

    @Override // cgi.o
    public final p d() {
        return this.f98104a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsPropertyRoomOccupancyRatesSelection)) {
            return false;
        }
        HotelsPropertyRoomOccupancyRatesSelection hotelsPropertyRoomOccupancyRatesSelection = (HotelsPropertyRoomOccupancyRatesSelection) obj2;
        return Intrinsics.f(this.f98104a, hotelsPropertyRoomOccupancyRatesSelection.f98104a) && Intrinsics.f(this.f98105b, hotelsPropertyRoomOccupancyRatesSelection.f98105b) && Intrinsics.f(this.f98106c, hotelsPropertyRoomOccupancyRatesSelection.f98106c);
    }

    public final int hashCode() {
        return this.f98106c.hashCode() + ((this.f98105b.hashCode() + (this.f98104a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f98104a.writeToParcel(dest, i);
        this.f98105b.writeToParcel(dest, i);
        this.f98106c.writeToParcel(dest, i);
    }
}
