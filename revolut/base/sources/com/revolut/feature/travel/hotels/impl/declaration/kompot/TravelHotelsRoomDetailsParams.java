package com.revolut.feature.travel.hotels.impl.declaration.kompot;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_travel_hotels_models.property.room.Area;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/declaration/kompot/TravelHotelsRoomDetailsParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsRoomDetailsParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsRoomDetailsParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Area f93657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f93658c;
    public final List d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f93659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDate f93660h;
    public final LocalDate i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f93661j;
    public final List k;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Area area = (Area) parcel.readParcelable(TravelHotelsRoomDetailsParams.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(TravelHotelsRoomDetailsParams.class, parcel, arrayList2, iE, 1);
            }
            int i2 = parcel.readInt();
            int iE2 = 0;
            ArrayList arrayList3 = new ArrayList(i2);
            int iE3 = 0;
            while (iE3 != i2) {
                iE3 = j6.a.e(TravelHotelsRoomDetailsParams.class, parcel, arrayList3, iE3, 1);
            }
            String string2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string3 = parcel.readString();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            LocalDate localDate2 = (LocalDate) parcel.readSerializable();
            ArrayList arrayList4 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                while (iE2 != i3) {
                    iE2 = j6.a.e(TravelHotelsRoomDetailsParams.class, parcel, arrayList, iE2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i5 = parcel.readInt();
                arrayList4 = new ArrayList(i5);
                int iE4 = 0;
                while (iE4 != i5) {
                    iE4 = j6.a.e(TravelHotelsRoomDetailsParams.class, parcel, arrayList4, iE4, 1);
                }
            }
            return new TravelHotelsRoomDetailsParams(string, area, arrayList2, arrayList3, string2, z, string3, localDate, localDate2, arrayList, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsRoomDetailsParams[i];
        }
    }

    public TravelHotelsRoomDetailsParams(String roomName, Area area, ArrayList roomImages, List amenitiesList, String str, boolean z, String propertyId, LocalDate localDate, LocalDate localDate2, List list, List list2) {
        Intrinsics.checkNotNullParameter(roomName, "roomName");
        Intrinsics.checkNotNullParameter(roomImages, "roomImages");
        Intrinsics.checkNotNullParameter(amenitiesList, "amenitiesList");
        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
        this.f93656a = roomName;
        this.f93657b = area;
        this.f93658c = roomImages;
        this.d = amenitiesList;
        this.e = str;
        this.f = z;
        this.f93659g = propertyId;
        this.f93660h = localDate;
        this.i = localDate2;
        this.f93661j = list;
        this.k = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsRoomDetailsParams)) {
            return false;
        }
        TravelHotelsRoomDetailsParams travelHotelsRoomDetailsParams = (TravelHotelsRoomDetailsParams) obj2;
        return Intrinsics.f(this.f93656a, travelHotelsRoomDetailsParams.f93656a) && Intrinsics.f(this.f93657b, travelHotelsRoomDetailsParams.f93657b) && Intrinsics.f(this.f93658c, travelHotelsRoomDetailsParams.f93658c) && Intrinsics.f(this.d, travelHotelsRoomDetailsParams.d) && Intrinsics.f(this.e, travelHotelsRoomDetailsParams.e) && this.f == travelHotelsRoomDetailsParams.f && Intrinsics.f(this.f93659g, travelHotelsRoomDetailsParams.f93659g) && Intrinsics.f(this.f93660h, travelHotelsRoomDetailsParams.f93660h) && Intrinsics.f(this.i, travelHotelsRoomDetailsParams.i) && Intrinsics.f(this.f93661j, travelHotelsRoomDetailsParams.f93661j) && Intrinsics.f(this.k, travelHotelsRoomDetailsParams.k);
    }

    public final int hashCode() {
        int iHashCode = this.f93656a.hashCode() * 31;
        Area area = this.f93657b;
        int iD = p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f93658c, (iHashCode + (area == null ? 0 : area.hashCode())) * 31, 31), 31, this.d);
        String str = this.e;
        int iC = p.a.c(j6.a.c((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.f93659g);
        LocalDate localDate = this.f93660h;
        int iHashCode2 = (iC + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.i;
        int iHashCode3 = (iHashCode2 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        List list = this.f93661j;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.k;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93656a);
        dest.writeParcelable(this.f93657b, i);
        Iterator itY = j6.a.y(this.f93658c, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeString(this.e);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeString(this.f93659g);
        dest.writeSerializable(this.f93660h);
        dest.writeSerializable(this.i);
        List list = this.f93661j;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), i);
            }
        }
        List list2 = this.k;
        if (list2 == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ2 = v0.a.q(dest, 1, list2);
        while (itQ2.hasNext()) {
            dest.writeParcelable((Parcelable) itQ2.next(), i);
        }
    }

    public /* synthetic */ TravelHotelsRoomDetailsParams(String str, Area area, ArrayList arrayList, List list, String str2, String str3) {
        this(str, area, arrayList, list, str2, false, str3, null, null, null, null);
    }
}
