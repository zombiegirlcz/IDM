package com.revolut.feature_travel_hotels_models.property.room;

import android.os.Parcel;
import android.os.Parcelable;
import cgi.q;
import com.revolut.feature_travel_hotels_models.property.Pricing;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/room/OccupancyRates;", "Lcgi/q;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OccupancyRates implements q, Parcelable {

    @NotNull
    public static final Parcelable.Creator<OccupancyRates> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomOccupancy f98112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f98113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Pricing f98114c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            RoomOccupancy roomOccupancyCreateFromParcel = RoomOccupancy.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(BedOption.CREATOR, parcel, arrayList, iA, 1);
            }
            return new OccupancyRates(roomOccupancyCreateFromParcel, arrayList, Pricing.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OccupancyRates[i];
        }
    }

    public OccupancyRates(RoomOccupancy occupancy, ArrayList bedOptions, Pricing pricing) {
        Intrinsics.checkNotNullParameter(occupancy, "occupancy");
        Intrinsics.checkNotNullParameter(bedOptions, "bedOptions");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        this.f98112a = occupancy;
        this.f98113b = bedOptions;
        this.f98114c = pricing;
    }

    @Override // cgi.q
    /* JADX INFO: renamed from: a, reason: from getter */
    public final RoomOccupancy getF98112a() {
        return this.f98112a;
    }

    @Override // cgi.q
    public final List b() {
        return this.f98113b;
    }

    @Override // cgi.q
    public final TravelHotelsRatePricing c() {
        return this.f98114c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OccupancyRates)) {
            return false;
        }
        OccupancyRates occupancyRates = (OccupancyRates) obj2;
        return Intrinsics.f(this.f98112a, occupancyRates.f98112a) && this.f98113b.equals(occupancyRates.f98113b) && Intrinsics.f(this.f98114c, occupancyRates.f98114c);
    }

    public final int hashCode() {
        return this.f98114c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f98113b, this.f98112a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f98112a.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.f98113b, dest);
        while (itY.hasNext()) {
            ((BedOption) itY.next()).writeToParcel(dest, i);
        }
        this.f98114c.writeToParcel(dest, i);
    }
}
