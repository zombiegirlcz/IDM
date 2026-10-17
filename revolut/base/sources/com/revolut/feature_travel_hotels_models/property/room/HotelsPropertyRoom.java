package com.revolut.feature_travel_hotels_models.property.room;

import android.os.Parcel;
import android.os.Parcelable;
import cgi.p;
import com.revolut.feature_travel_hotels_models.amenity.HotelsCategorisedAmenities;
import com.revolut.feature_travel_hotels_models.property.Description;
import com.revolut.feature_travel_hotels_models.property.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/room/HotelsPropertyRoom;", "Lcgi/p;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsPropertyRoom implements p, Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsPropertyRoom> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Description f98100c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f98101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Area f98102h;
    public final MaxOccupancy i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f98103j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Description descriptionCreateFromParcel = Description.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(Image.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iA3 = 0;
            while (iA3 != i2) {
                iA3 = org.bouncycastle.jcajce.provider.digest.a.a(Rates.CREATOR, parcel, arrayList2, iA3, 1);
            }
            int i3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i3);
            int iA4 = 0;
            while (iA4 != i3) {
                iA4 = org.bouncycastle.jcajce.provider.digest.a.a(HotelsCategorisedAmenities.CREATOR, parcel, arrayList3, iA4, 1);
            }
            int i5 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i5);
            int iA5 = 0;
            while (iA5 != i5) {
                iA5 = org.bouncycastle.jcajce.provider.digest.a.a(RoomView.CREATOR, parcel, arrayList4, iA5, 1);
            }
            ArrayList arrayList5 = null;
            Area areaCreateFromParcel = parcel.readInt() == 0 ? null : Area.CREATOR.createFromParcel(parcel);
            MaxOccupancy maxOccupancyCreateFromParcel = parcel.readInt() == 0 ? null : MaxOccupancy.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i6 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i6);
                while (iA != i6) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(HotelsPropertyRoomUnit.CREATOR, parcel, arrayList6, iA, 1);
                }
                arrayList5 = arrayList6;
            }
            return new HotelsPropertyRoom(string, string2, descriptionCreateFromParcel, arrayList, arrayList2, arrayList3, arrayList4, areaCreateFromParcel, maxOccupancyCreateFromParcel, arrayList5);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsPropertyRoom[i];
        }
    }

    public HotelsPropertyRoom(String id10, String name, Description description, ArrayList images, ArrayList rates, ArrayList amenities, ArrayList views, Area area, MaxOccupancy maxOccupancy, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(amenities, "amenities");
        Intrinsics.checkNotNullParameter(views, "views");
        this.f98098a = id10;
        this.f98099b = name;
        this.f98100c = description;
        this.d = images;
        this.e = rates;
        this.f = amenities;
        this.f98101g = views;
        this.f98102h = area;
        this.i = maxOccupancy;
        this.f98103j = arrayList;
    }

    @Override // cgi.p
    public final List a() {
        return this.e;
    }

    @Override // cgi.p
    public final List b() {
        return this.f;
    }

    @Override // cgi.p
    /* JADX INFO: renamed from: c, reason: from getter */
    public final MaxOccupancy getI() {
        return this.i;
    }

    @Override // cgi.p
    public final List d() {
        return this.f98101g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // cgi.p
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Area getF98102h() {
        return this.f98102h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsPropertyRoom)) {
            return false;
        }
        HotelsPropertyRoom hotelsPropertyRoom = (HotelsPropertyRoom) obj2;
        return Intrinsics.f(this.f98098a, hotelsPropertyRoom.f98098a) && Intrinsics.f(this.f98099b, hotelsPropertyRoom.f98099b) && Intrinsics.f(this.f98100c, hotelsPropertyRoom.f98100c) && this.d.equals(hotelsPropertyRoom.d) && this.e.equals(hotelsPropertyRoom.e) && this.f.equals(hotelsPropertyRoom.f) && this.f98101g.equals(hotelsPropertyRoom.f98101g) && Intrinsics.f(this.f98102h, hotelsPropertyRoom.f98102h) && Intrinsics.f(this.i, hotelsPropertyRoom.i) && Intrinsics.f(this.f98103j, hotelsPropertyRoom.f98103j);
    }

    @Override // cgi.p
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF98098a() {
        return this.f98098a;
    }

    @Override // cgi.p
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF98099b() {
        return this.f98099b;
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f98101g, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (this.f98100c.hashCode() + p.a.c(this.f98098a.hashCode() * 31, 31, this.f98099b)) * 31, 31), 31), 31), 31);
        Area area = this.f98102h;
        int iHashCode = (iB + (area == null ? 0 : area.hashCode())) * 31;
        MaxOccupancy maxOccupancy = this.i;
        int iHashCode2 = (iHashCode + (maxOccupancy == null ? 0 : maxOccupancy.hashCode())) * 31;
        List list = this.f98103j;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // cgi.p
    public final List j() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98098a);
        dest.writeString(this.f98099b);
        this.f98100c.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((Image) itY.next()).writeToParcel(dest, i);
        }
        Iterator itY2 = j6.a.y(this.e, dest);
        while (itY2.hasNext()) {
            ((Rates) itY2.next()).writeToParcel(dest, i);
        }
        Iterator itY3 = j6.a.y(this.f, dest);
        while (itY3.hasNext()) {
            ((HotelsCategorisedAmenities) itY3.next()).writeToParcel(dest, i);
        }
        Iterator itY4 = j6.a.y(this.f98101g, dest);
        while (itY4.hasNext()) {
            ((RoomView) itY4.next()).writeToParcel(dest, i);
        }
        Area area = this.f98102h;
        if (area == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            area.writeToParcel(dest, i);
        }
        MaxOccupancy maxOccupancy = this.i;
        if (maxOccupancy == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            maxOccupancy.writeToParcel(dest, i);
        }
        List list = this.f98103j;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((HotelsPropertyRoomUnit) itQ.next()).writeToParcel(dest, i);
        }
    }
}
