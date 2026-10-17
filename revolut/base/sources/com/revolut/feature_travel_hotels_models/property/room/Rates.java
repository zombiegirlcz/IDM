package com.revolut.feature_travel_hotels_models.property.room;

import android.os.Parcel;
import android.os.Parcelable;
import cgi.d;
import cgi.e;
import cgi.r;
import com.revolut.feature_travel_hotels_models.amenity.HotelsCategorisedAmenities;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0006\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/room/Rates;", "Lcgi/r;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "cgi/e", "cgi/d", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Rates implements r, Parcelable {

    @NotNull
    public static final Parcelable.Creator<Rates> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f98116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f98117c;
    public final ArrayList d;
    public final CancellationPolicy e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f98118g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            e eVarValueOf = e.valueOf(parcel.readString());
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iA = 0;
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(HotelsCategorisedAmenities.CREATOR, parcel, arrayList, iA, 1);
            }
            CancellationPolicy cancellationPolicyCreateFromParcel = CancellationPolicy.CREATOR.createFromParcel(parcel);
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            int iA2 = 0;
            while (iA2 != i3) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(OccupancyRates.CREATOR, parcel, arrayList2, iA2, 1);
            }
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList3.add(d.valueOf(parcel.readString()));
            }
            return new Rates(string, eVarValueOf, i, arrayList, cancellationPolicyCreateFromParcel, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Rates[i];
        }
    }

    public Rates(String id10, e type, int i, ArrayList amenities, CancellationPolicy cancellationPolicy, ArrayList occupancyRates, ArrayList paymentModes) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(amenities, "amenities");
        Intrinsics.checkNotNullParameter(cancellationPolicy, "cancellationPolicy");
        Intrinsics.checkNotNullParameter(occupancyRates, "occupancyRates");
        Intrinsics.checkNotNullParameter(paymentModes, "paymentModes");
        this.f98115a = id10;
        this.f98116b = type;
        this.f98117c = i;
        this.d = amenities;
        this.e = cancellationPolicy;
        this.f = occupancyRates;
        this.f98118g = paymentModes;
    }

    @Override // cgi.r
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CancellationPolicy getE() {
        return this.e;
    }

    @Override // cgi.r
    public final List b() {
        return this.d;
    }

    @Override // cgi.r
    public final List c() {
        return this.f98118g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Rates)) {
            return false;
        }
        Rates rates = (Rates) obj2;
        return Intrinsics.f(this.f98115a, rates.f98115a) && this.f98116b == rates.f98116b && this.f98117c == rates.f98117c && this.d.equals(rates.d) && Intrinsics.f(this.e, rates.e) && this.f.equals(rates.f) && this.f98118g.equals(rates.f98118g);
    }

    @Override // cgi.r
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF98115a() {
        return this.f98115a;
    }

    @Override // cgi.r
    /* JADX INFO: renamed from: getType, reason: from getter */
    public final e getF98116b() {
        return this.f98116b;
    }

    public final int hashCode() {
        return this.f98118g.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, (this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, j6.a.b(this.f98117c, (this.f98116b.hashCode() + (this.f98115a.hashCode() * 31)) * 31, 31), 31)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98115a);
        dest.writeString(this.f98116b.name());
        dest.writeInt(this.f98117c);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((HotelsCategorisedAmenities) itY.next()).writeToParcel(dest, i);
        }
        this.e.writeToParcel(dest, i);
        Iterator itY2 = j6.a.y(this.f, dest);
        while (itY2.hasNext()) {
            ((OccupancyRates) itY2.next()).writeToParcel(dest, i);
        }
        Iterator itY3 = j6.a.y(this.f98118g, dest);
        while (itY3.hasNext()) {
            dest.writeString(((d) itY3.next()).name());
        }
    }
}
