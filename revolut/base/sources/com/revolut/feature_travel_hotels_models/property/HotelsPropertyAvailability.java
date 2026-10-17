package com.revolut.feature_travel_hotels_models.property;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_travel_hotels_models.property.search.HotelsPropertyRoomOccupancy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/HotelsPropertyAvailability;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsPropertyAvailability implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsPropertyAvailability> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f98000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HotelsPropertyAvailabilityDates f98001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f98002c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            HotelsPropertyAvailabilityDates hotelsPropertyAvailabilityDatesCreateFromParcel = parcel.readInt() == 0 ? null : HotelsPropertyAvailabilityDates.CREATOR.createFromParcel(parcel);
            Integer numValueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(HotelsPropertyRoomOccupancy.CREATOR, parcel, arrayList, iA, 1);
            }
            return new HotelsPropertyAvailability(z, hotelsPropertyAvailabilityDatesCreateFromParcel, numValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsPropertyAvailability[i];
        }
    }

    public HotelsPropertyAvailability(boolean z, HotelsPropertyAvailabilityDates hotelsPropertyAvailabilityDates, Integer num, List occupancy) {
        Intrinsics.checkNotNullParameter(occupancy, "occupancy");
        this.f98000a = z;
        this.f98001b = hotelsPropertyAvailabilityDates;
        this.f98002c = num;
        this.d = occupancy;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsPropertyAvailability)) {
            return false;
        }
        HotelsPropertyAvailability hotelsPropertyAvailability = (HotelsPropertyAvailability) obj2;
        return this.f98000a == hotelsPropertyAvailability.f98000a && Intrinsics.f(this.f98001b, hotelsPropertyAvailability.f98001b) && Intrinsics.f(this.f98002c, hotelsPropertyAvailability.f98002c) && Intrinsics.f(this.d, hotelsPropertyAvailability.d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f98000a) * 31;
        HotelsPropertyAvailabilityDates hotelsPropertyAvailabilityDates = this.f98001b;
        int iHashCode2 = (iHashCode + (hotelsPropertyAvailabilityDates == null ? 0 : hotelsPropertyAvailabilityDates.hashCode())) * 31;
        Integer num = this.f98002c;
        return this.d.hashCode() + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f98000a ? 1 : 0);
        HotelsPropertyAvailabilityDates hotelsPropertyAvailabilityDates = this.f98001b;
        if (hotelsPropertyAvailabilityDates == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            hotelsPropertyAvailabilityDates.writeToParcel(dest, i);
        }
        Integer num = this.f98002c;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            ((HotelsPropertyRoomOccupancy) itV.next()).writeToParcel(dest, i);
        }
    }
}
