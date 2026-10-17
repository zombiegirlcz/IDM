package com.revolut.feature_travel_hotels_models.dropoff;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_travel_hotels_models.property.search.HotelsPropertyRoomOccupancy;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/dropoff/NavigableTravelHotelsDropoff;", "Landroid/os/Parcelable;", "PropertyDetails", "Rooms", "Checkout", "Lcom/revolut/feature_travel_hotels_models/dropoff/NavigableTravelHotelsDropoff$Checkout;", "Lcom/revolut/feature_travel_hotels_models/dropoff/NavigableTravelHotelsDropoff$PropertyDetails;", "Lcom/revolut/feature_travel_hotels_models/dropoff/NavigableTravelHotelsDropoff$Rooms;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface NavigableTravelHotelsDropoff extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/dropoff/NavigableTravelHotelsDropoff$Checkout;", "Lcom/revolut/feature_travel_hotels_models/dropoff/NavigableTravelHotelsDropoff;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Checkout implements NavigableTravelHotelsDropoff {

        @NotNull
        public static final Parcelable.Creator<Checkout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f97898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final bfi.a f97899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f97900c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final LocalDate f97901g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final LocalDate f97902h;
        public final List i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final List f97903j;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                bfi.a aVarValueOf = bfi.a.valueOf(parcel.readString());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                LocalDate localDate = (LocalDate) parcel.readSerializable();
                LocalDate localDate2 = (LocalDate) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                int iA2 = 0;
                while (iA2 != i) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(HotelsPropertyRoomOccupancy.CREATOR, parcel, arrayList, iA2, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(TravelHotelsRoomsInformation.CREATOR, parcel, arrayList2, iA, 1);
                }
                return new Checkout(string, aVarValueOf, string2, string3, string4, string5, localDate, localDate2, arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checkout[i];
            }
        }

        public Checkout(String id10, bfi.a state, String sessionId, String name, String imageUrl, String propertyId, LocalDate checkIn, LocalDate checkOut, List roomsOccupancy, List selectedBeds) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(propertyId, "propertyId");
            Intrinsics.checkNotNullParameter(checkIn, "checkIn");
            Intrinsics.checkNotNullParameter(checkOut, "checkOut");
            Intrinsics.checkNotNullParameter(roomsOccupancy, "roomsOccupancy");
            Intrinsics.checkNotNullParameter(selectedBeds, "selectedBeds");
            this.f97898a = id10;
            this.f97899b = state;
            this.f97900c = sessionId;
            this.d = name;
            this.e = imageUrl;
            this.f = propertyId;
            this.f97901g = checkIn;
            this.f97902h = checkOut;
            this.i = roomsOccupancy;
            this.f97903j = selectedBeds;
        }

        @Override // com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff
        /* JADX INFO: renamed from: E6, reason: from getter */
        public final String getE() {
            return this.e;
        }

        @Override // com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff
        /* JADX INFO: renamed from: R3, reason: from getter */
        public final List getI() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Checkout)) {
                return false;
            }
            Checkout checkout = (Checkout) obj2;
            return Intrinsics.f(this.f97898a, checkout.f97898a) && this.f97899b == checkout.f97899b && Intrinsics.f(this.f97900c, checkout.f97900c) && Intrinsics.f(this.d, checkout.d) && Intrinsics.f(this.e, checkout.e) && Intrinsics.f(this.f, checkout.f) && Intrinsics.f(this.f97901g, checkout.f97901g) && Intrinsics.f(this.f97902h, checkout.f97902h) && Intrinsics.f(this.i, checkout.i) && Intrinsics.f(this.f97903j, checkout.f97903j);
        }

        @Override // com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF97909a() {
            return this.f97898a;
        }

        @Override // com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff
        /* JADX INFO: renamed from: getName, reason: from getter */
        public final String getD() {
            return this.d;
        }

        public final int hashCode() {
            return this.f97903j.hashCode() + p.a.d(y.a(y.a(p.a.c(p.a.c(p.a.c(p.a.c((this.f97899b.hashCode() + (this.f97898a.hashCode() * 31)) * 31, 31, this.f97900c), 31, this.d), 31, this.e), 31, this.f), 31, this.f97901g), 31, this.f97902h), 31, this.i);
        }

        @Override // com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff
        /* JADX INFO: renamed from: k1, reason: from getter */
        public final String getF() {
            return this.f;
        }

        @Override // com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff
        /* JADX INFO: renamed from: n3, reason: from getter */
        public final LocalDate getF97913h() {
            return this.f97902h;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97898a);
            dest.writeString(this.f97899b.name());
            dest.writeString(this.f97900c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
            dest.writeSerializable(this.f97901g);
            dest.writeSerializable(this.f97902h);
            Iterator itV = p.a.v(this.i, dest);
            while (itV.hasNext()) {
                ((HotelsPropertyRoomOccupancy) itV.next()).writeToParcel(dest, i);
            }
            Iterator itV2 = p.a.v(this.f97903j, dest);
            while (itV2.hasNext()) {
                ((TravelHotelsRoomsInformation) itV2.next()).writeToParcel(dest, i);
            }
        }

        @Override // com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff
        /* JADX INFO: renamed from: z8, reason: from getter */
        public final LocalDate getF97912g() {
            return this.f97901g;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/dropoff/NavigableTravelHotelsDropoff$PropertyDetails;", "Lcom/revolut/feature_travel_hotels_models/dropoff/NavigableTravelHotelsDropoff;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PropertyDetails implements NavigableTravelHotelsDropoff {

        @NotNull
        public static final Parcelable.Creator<PropertyDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f97904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final bfi.a f97905b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f97906c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final LocalDate f97907g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final LocalDate f97908h;
        public final List i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                bfi.a aVarValueOf = bfi.a.valueOf(parcel.readString());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                LocalDate localDate = (LocalDate) parcel.readSerializable();
                LocalDate localDate2 = (LocalDate) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(HotelsPropertyRoomOccupancy.CREATOR, parcel, arrayList, iA, 1);
                }
                return new PropertyDetails(string, aVarValueOf, string2, string3, string4, string5, localDate, localDate2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PropertyDetails[i];
            }
        }

        public PropertyDetails(String id10, bfi.a state, String sessionId, String name, String imageUrl, String propertyId, LocalDate checkIn, LocalDate checkOut, List roomsOccupancy) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(propertyId, "propertyId");
            Intrinsics.checkNotNullParameter(checkIn, "checkIn");
            Intrinsics.checkNotNullParameter(checkOut, "checkOut");
            Intrinsics.checkNotNullParameter(roomsOccupancy, "roomsOccupancy");
            this.f97904a = id10;
            this.f97905b = state;
            this.f97906c = sessionId;
            this.d = name;
            this.e = imageUrl;
            this.f = propertyId;
            this.f97907g = checkIn;
            this.f97908h = checkOut;
            this.i = roomsOccupancy;
        }

        @Override // com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff
        /* JADX INFO: renamed from: E6, reason: from getter */
        public final String getE() {
            return this.e;
        }

        @Override // com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff
        /* JADX INFO: renamed from: R3, reason: from getter */
        public final List getI() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PropertyDetails)) {
                return false;
            }
            PropertyDetails propertyDetails = (PropertyDetails) obj2;
            return Intrinsics.f(this.f97904a, propertyDetails.f97904a) && this.f97905b == propertyDetails.f97905b && Intrinsics.f(this.f97906c, propertyDetails.f97906c) && Intrinsics.f(this.d, propertyDetails.d) && Intrinsics.f(this.e, propertyDetails.e) && Intrinsics.f(this.f, propertyDetails.f) && Intrinsics.f(this.f97907g, propertyDetails.f97907g) && Intrinsics.f(this.f97908h, propertyDetails.f97908h) && Intrinsics.f(this.i, propertyDetails.i);
        }

        @Override // com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF97909a() {
            return this.f97904a;
        }

        @Override // com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff
        /* JADX INFO: renamed from: getName, reason: from getter */
        public final String getD() {
            return this.d;
        }

        public final int hashCode() {
            return this.i.hashCode() + y.a(y.a(p.a.c(p.a.c(p.a.c(p.a.c((this.f97905b.hashCode() + (this.f97904a.hashCode() * 31)) * 31, 31, this.f97906c), 31, this.d), 31, this.e), 31, this.f), 31, this.f97907g), 31, this.f97908h);
        }

        @Override // com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff
        /* JADX INFO: renamed from: k1, reason: from getter */
        public final String getF() {
            return this.f;
        }

        @Override // com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff
        /* JADX INFO: renamed from: n3, reason: from getter */
        public final LocalDate getF97913h() {
            return this.f97908h;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97904a);
            dest.writeString(this.f97905b.name());
            dest.writeString(this.f97906c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
            dest.writeSerializable(this.f97907g);
            dest.writeSerializable(this.f97908h);
            Iterator itV = p.a.v(this.i, dest);
            while (itV.hasNext()) {
                ((HotelsPropertyRoomOccupancy) itV.next()).writeToParcel(dest, i);
            }
        }

        @Override // com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff
        /* JADX INFO: renamed from: z8, reason: from getter */
        public final LocalDate getF97912g() {
            return this.f97907g;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/dropoff/NavigableTravelHotelsDropoff$Rooms;", "Lcom/revolut/feature_travel_hotels_models/dropoff/NavigableTravelHotelsDropoff;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Rooms implements NavigableTravelHotelsDropoff {

        @NotNull
        public static final Parcelable.Creator<Rooms> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f97909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final bfi.a f97910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f97911c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final LocalDate f97912g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final LocalDate f97913h;
        public final List i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                bfi.a aVarValueOf = bfi.a.valueOf(parcel.readString());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                LocalDate localDate = (LocalDate) parcel.readSerializable();
                LocalDate localDate2 = (LocalDate) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(HotelsPropertyRoomOccupancy.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Rooms(string, aVarValueOf, string2, string3, string4, string5, localDate, localDate2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Rooms[i];
            }
        }

        public Rooms(String id10, bfi.a state, String sessionId, String name, String imageUrl, String propertyId, LocalDate checkIn, LocalDate checkOut, List roomsOccupancy) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(propertyId, "propertyId");
            Intrinsics.checkNotNullParameter(checkIn, "checkIn");
            Intrinsics.checkNotNullParameter(checkOut, "checkOut");
            Intrinsics.checkNotNullParameter(roomsOccupancy, "roomsOccupancy");
            this.f97909a = id10;
            this.f97910b = state;
            this.f97911c = sessionId;
            this.d = name;
            this.e = imageUrl;
            this.f = propertyId;
            this.f97912g = checkIn;
            this.f97913h = checkOut;
            this.i = roomsOccupancy;
        }

        @Override // com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff
        /* JADX INFO: renamed from: E6, reason: from getter */
        public final String getE() {
            return this.e;
        }

        @Override // com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff
        /* JADX INFO: renamed from: R3, reason: from getter */
        public final List getI() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Rooms)) {
                return false;
            }
            Rooms rooms = (Rooms) obj2;
            return Intrinsics.f(this.f97909a, rooms.f97909a) && this.f97910b == rooms.f97910b && Intrinsics.f(this.f97911c, rooms.f97911c) && Intrinsics.f(this.d, rooms.d) && Intrinsics.f(this.e, rooms.e) && Intrinsics.f(this.f, rooms.f) && Intrinsics.f(this.f97912g, rooms.f97912g) && Intrinsics.f(this.f97913h, rooms.f97913h) && Intrinsics.f(this.i, rooms.i);
        }

        @Override // com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF97909a() {
            return this.f97909a;
        }

        @Override // com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff
        /* JADX INFO: renamed from: getName, reason: from getter */
        public final String getD() {
            return this.d;
        }

        public final int hashCode() {
            return this.i.hashCode() + y.a(y.a(p.a.c(p.a.c(p.a.c(p.a.c((this.f97910b.hashCode() + (this.f97909a.hashCode() * 31)) * 31, 31, this.f97911c), 31, this.d), 31, this.e), 31, this.f), 31, this.f97912g), 31, this.f97913h);
        }

        @Override // com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff
        /* JADX INFO: renamed from: k1, reason: from getter */
        public final String getF() {
            return this.f;
        }

        @Override // com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff
        /* JADX INFO: renamed from: n3, reason: from getter */
        public final LocalDate getF97913h() {
            return this.f97913h;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97909a);
            dest.writeString(this.f97910b.name());
            dest.writeString(this.f97911c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
            dest.writeSerializable(this.f97912g);
            dest.writeSerializable(this.f97913h);
            Iterator itV = p.a.v(this.i, dest);
            while (itV.hasNext()) {
                ((HotelsPropertyRoomOccupancy) itV.next()).writeToParcel(dest, i);
            }
        }

        @Override // com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff
        /* JADX INFO: renamed from: z8, reason: from getter */
        public final LocalDate getF97912g() {
            return this.f97912g;
        }
    }

    /* JADX INFO: renamed from: E6 */
    String getE();

    /* JADX INFO: renamed from: R3 */
    List getI();

    /* JADX INFO: renamed from: getId */
    String getF97909a();

    /* JADX INFO: renamed from: getName */
    String getD();

    /* JADX INFO: renamed from: k1 */
    String getF();

    /* JADX INFO: renamed from: n3 */
    LocalDate getF97913h();

    /* JADX INFO: renamed from: z8 */
    LocalDate getF97912g();
}
