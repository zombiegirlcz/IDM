package com.revolut.feature.transport.models.transit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transport.models.TransportTicketProvider;
import com.revolut.feature.transport.models.TransportTicketQrCode;
import com.revolut.feature.transport.models.fields.TransportDetailsField;
import ip0.v7;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transport/models/transit/PurchasedTransitTicket;", "Landroid/os/Parcelable;", "Activated", "ToBeActivated", "Expired", "NotPurchased", "Pending", "Lcom/revolut/feature/transport/models/transit/PurchasedTransitTicket$Activated;", "Lcom/revolut/feature/transport/models/transit/PurchasedTransitTicket$Expired;", "Lcom/revolut/feature/transport/models/transit/PurchasedTransitTicket$NotPurchased;", "Lcom/revolut/feature/transport/models/transit/PurchasedTransitTicket$Pending;", "Lcom/revolut/feature/transport/models/transit/PurchasedTransitTicket$ToBeActivated;", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PurchasedTransitTicket extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/models/transit/PurchasedTransitTicket$Activated;", "Lcom/revolut/feature/transport/models/transit/PurchasedTransitTicket;", "", "toString", "()Ljava/lang/String;", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Activated implements PurchasedTransitTicket {

        @NotNull
        public static final Parcelable.Creator<Activated> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f92632c;
        public final String d;
        public final TransitTicketType e;
        public final TransitTicketDescription f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f92633g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f92634h;
        public final LocalDateTime i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f92635j;
        public final wi0.b k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final TransportTicketProvider f92636l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final dj0.d f92637m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f92638n;
        public final ArrayList o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final ArrayList f92639p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final String f92640q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Boolean f92641r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final TransportTicketQrCode f92642s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final PurchasedTransitTicketValidity f92643t;
        public final LocalDateTime u;
        public final String v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final Boolean f92644w;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                TransitTicketType transitTicketTypeCreateFromParcel = TransitTicketType.CREATOR.createFromParcel(parcel);
                TransitTicketDescription transitTicketDescriptionCreateFromParcel = TransitTicketDescription.CREATOR.createFromParcel(parcel);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                LocalDateTime localDateTime = (LocalDateTime) parcel.readSerializable();
                String string5 = parcel.readString();
                wi0.b bVar = (wi0.b) parcel.readSerializable();
                TransportTicketProvider transportTicketProviderCreateFromParcel = TransportTicketProvider.CREATOR.createFromParcel(parcel);
                dj0.d dVar = (dj0.d) parcel.readSerializable();
                String string6 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(TransportDetailsField.CREATOR, parcel, arrayList, iA, 1);
                    i = i;
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iA2 = 0;
                while (iA2 != i2) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(TransportDetailsField.CREATOR, parcel, arrayList2, iA2, 1);
                    i2 = i2;
                    arrayList = arrayList;
                }
                ArrayList arrayList3 = arrayList;
                String string7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                TransportTicketQrCode transportTicketQrCodeCreateFromParcel = TransportTicketQrCode.CREATOR.createFromParcel(parcel);
                PurchasedTransitTicketValidity purchasedTransitTicketValidityCreateFromParcel = PurchasedTransitTicketValidity.CREATOR.createFromParcel(parcel);
                LocalDateTime localDateTime2 = (LocalDateTime) parcel.readSerializable();
                Boolean boolValueOf2 = null;
                Boolean bool = boolValueOf;
                String string8 = parcel.readString();
                if (parcel.readInt() != 0) {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Activated(string, string2, string3, string4, transitTicketTypeCreateFromParcel, transitTicketDescriptionCreateFromParcel, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, localDateTime, string5, bVar, transportTicketProviderCreateFromParcel, dVar, string6, arrayList3, arrayList2, string7, bool, transportTicketQrCodeCreateFromParcel, purchasedTransitTicketValidityCreateFromParcel, localDateTime2, string8, boolValueOf2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Activated[i];
            }
        }

        public Activated(String id10, String ticketOfferId, String ticketNumber, String title, TransitTicketType ticketType, TransitTicketDescription description, List zones, List tags, LocalDateTime createdDate, String locationName, wi0.b countryCode, TransportTicketProvider provider, dj0.d price, String str, ArrayList generalInputs, ArrayList passengerInputs, String str2, Boolean bool, TransportTicketQrCode qrCode, PurchasedTransitTicketValidity validity, LocalDateTime localDateTime, String str3, Boolean bool2) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(ticketOfferId, "ticketOfferId");
            Intrinsics.checkNotNullParameter(ticketNumber, "ticketNumber");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(ticketType, "ticketType");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(zones, "zones");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(createdDate, "createdDate");
            Intrinsics.checkNotNullParameter(locationName, "locationName");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(generalInputs, "generalInputs");
            Intrinsics.checkNotNullParameter(passengerInputs, "passengerInputs");
            Intrinsics.checkNotNullParameter(qrCode, "qrCode");
            Intrinsics.checkNotNullParameter(validity, "validity");
            this.f92630a = id10;
            this.f92631b = ticketOfferId;
            this.f92632c = ticketNumber;
            this.d = title;
            this.e = ticketType;
            this.f = description;
            this.f92633g = zones;
            this.f92634h = tags;
            this.i = createdDate;
            this.f92635j = locationName;
            this.k = countryCode;
            this.f92636l = provider;
            this.f92637m = price;
            this.f92638n = str;
            this.o = generalInputs;
            this.f92639p = passengerInputs;
            this.f92640q = str2;
            this.f92641r = bool;
            this.f92642s = qrCode;
            this.f92643t = validity;
            this.u = localDateTime;
            this.v = str3;
            this.f92644w = bool2;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: C9, reason: from getter */
        public final Boolean getF92693r() {
            return this.f92641r;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: F6, reason: from getter */
        public final TransitTicketType getE() {
            return this.e;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: L0, reason: from getter */
        public final String getF92692q() {
            return this.f92640q;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: N1, reason: from getter */
        public final String getF92683b() {
            return this.f92631b;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: V6, reason: from getter */
        public final String getF92684c() {
            return this.f92632c;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        public final List Y2() {
            return this.f92639p;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Activated)) {
                return false;
            }
            Activated activated = (Activated) obj2;
            return Intrinsics.f(this.f92630a, activated.f92630a) && Intrinsics.f(this.f92631b, activated.f92631b) && Intrinsics.f(this.f92632c, activated.f92632c) && Intrinsics.f(this.d, activated.d) && Intrinsics.f(this.e, activated.e) && Intrinsics.f(this.f, activated.f) && Intrinsics.f(this.f92633g, activated.f92633g) && Intrinsics.f(this.f92634h, activated.f92634h) && Intrinsics.f(this.i, activated.i) && Intrinsics.f(this.f92635j, activated.f92635j) && Intrinsics.f(this.k, activated.k) && Intrinsics.f(this.f92636l, activated.f92636l) && Intrinsics.f(this.f92637m, activated.f92637m) && Intrinsics.f(this.f92638n, activated.f92638n) && this.o.equals(activated.o) && this.f92639p.equals(activated.f92639p) && Intrinsics.f(this.f92640q, activated.f92640q) && Intrinsics.f(this.f92641r, activated.f92641r) && Intrinsics.f(this.f92642s, activated.f92642s) && Intrinsics.f(this.f92643t, activated.f92643t) && Intrinsics.f(this.u, activated.u) && Intrinsics.f(this.v, activated.v) && Intrinsics.f(this.f92644w, activated.f92644w);
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final wi0.b getK() {
            return this.k;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getDescription, reason: from getter */
        public final TransitTicketDescription getF() {
            return this.f;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF92682a() {
            return this.f92630a;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getPocketId, reason: from getter */
        public final String getF92690n() {
            return this.f92638n;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getPrice, reason: from getter */
        public final dj0.d getF92689m() {
            return this.f92637m;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: h3, reason: from getter */
        public final List getF92685g() {
            return this.f92633g;
        }

        public final int hashCode() {
            int iC = v7.c((this.f92636l.hashCode() + p.a.c(p.a.c(v7.i(this.i, p.a.d(p.a.d((this.f.hashCode() + ((this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f92630a.hashCode() * 31, 31, this.f92631b), 31, this.f92632c), 31, this.d)) * 31)) * 31, 31, this.f92633g), 31, this.f92634h), 31), 31, this.f92635j), 31, this.k.f297794a)) * 31, 31, this.f92637m);
            String str = this.f92638n;
            int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f92639p, com.google.android.gms.internal.mlkit_vision_face.a.b(this.o, (iC + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
            String str2 = this.f92640q;
            int iHashCode = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.f92641r;
            int iHashCode2 = (this.f92643t.hashCode() + ((this.f92642s.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31)) * 31;
            LocalDateTime localDateTime = this.u;
            int iHashCode3 = (iHashCode2 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
            String str3 = this.v;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool2 = this.f92644w;
            return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: l0, reason: from getter */
        public final LocalDateTime getI() {
            return this.i;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: n9, reason: from getter */
        public final String getF92687j() {
            return this.f92635j;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: p, reason: from getter */
        public final List getF92686h() {
            return this.f92634h;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: q, reason: from getter */
        public final TransportTicketProvider getF92688l() {
            return this.f92636l;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        public final List t2() {
            return this.o;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92630a);
            dest.writeString(this.f92631b);
            dest.writeString(this.f92632c);
            dest.writeString(this.d);
            this.e.writeToParcel(dest, i);
            this.f.writeToParcel(dest, i);
            dest.writeStringList(this.f92633g);
            dest.writeStringList(this.f92634h);
            dest.writeSerializable(this.i);
            dest.writeString(this.f92635j);
            dest.writeSerializable(this.k);
            this.f92636l.writeToParcel(dest, i);
            dest.writeSerializable(this.f92637m);
            dest.writeString(this.f92638n);
            Iterator itY = j6.a.y(this.o, dest);
            while (itY.hasNext()) {
                ((TransportDetailsField) itY.next()).writeToParcel(dest, i);
            }
            Iterator itY2 = j6.a.y(this.f92639p, dest);
            while (itY2.hasNext()) {
                ((TransportDetailsField) itY2.next()).writeToParcel(dest, i);
            }
            dest.writeString(this.f92640q);
            Boolean bool = this.f92641r;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool);
            }
            this.f92642s.writeToParcel(dest, i);
            this.f92643t.writeToParcel(dest, i);
            dest.writeSerializable(this.u);
            dest.writeString(this.v);
            Boolean bool2 = this.f92644w;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/models/transit/PurchasedTransitTicket$Expired;", "Lcom/revolut/feature/transport/models/transit/PurchasedTransitTicket;", "", "toString", "()Ljava/lang/String;", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Expired implements PurchasedTransitTicket {

        @NotNull
        public static final Parcelable.Creator<Expired> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f92647c;
        public final String d;
        public final TransitTicketType e;
        public final TransitTicketDescription f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f92648g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f92649h;
        public final LocalDateTime i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f92650j;
        public final wi0.b k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final TransportTicketProvider f92651l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final dj0.d f92652m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f92653n;
        public final ArrayList o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final ArrayList f92654p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final String f92655q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Boolean f92656r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final PurchasedTransitTicketValidity f92657s;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                TransitTicketType transitTicketTypeCreateFromParcel = TransitTicketType.CREATOR.createFromParcel(parcel);
                TransitTicketDescription transitTicketDescriptionCreateFromParcel = TransitTicketDescription.CREATOR.createFromParcel(parcel);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                LocalDateTime localDateTime = (LocalDateTime) parcel.readSerializable();
                String string5 = parcel.readString();
                wi0.b bVar = (wi0.b) parcel.readSerializable();
                TransportTicketProvider transportTicketProviderCreateFromParcel = TransportTicketProvider.CREATOR.createFromParcel(parcel);
                dj0.d dVar = (dj0.d) parcel.readSerializable();
                String string6 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(TransportDetailsField.CREATOR, parcel, arrayList, iA, 1);
                    i = i;
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iA2 = 0;
                while (iA2 != i2) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(TransportDetailsField.CREATOR, parcel, arrayList2, iA2, 1);
                    i2 = i2;
                    arrayList = arrayList;
                }
                ArrayList arrayList3 = arrayList;
                String string7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Expired(string, string2, string3, string4, transitTicketTypeCreateFromParcel, transitTicketDescriptionCreateFromParcel, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, localDateTime, string5, bVar, transportTicketProviderCreateFromParcel, dVar, string6, arrayList3, arrayList2, string7, boolValueOf, PurchasedTransitTicketValidity.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Expired[i];
            }
        }

        public Expired(String id10, String ticketOfferId, String ticketNumber, String title, TransitTicketType ticketType, TransitTicketDescription description, List zones, List tags, LocalDateTime createdDate, String locationName, wi0.b countryCode, TransportTicketProvider provider, dj0.d price, String str, ArrayList generalInputs, ArrayList passengerInputs, String str2, Boolean bool, PurchasedTransitTicketValidity validity) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(ticketOfferId, "ticketOfferId");
            Intrinsics.checkNotNullParameter(ticketNumber, "ticketNumber");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(ticketType, "ticketType");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(zones, "zones");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(createdDate, "createdDate");
            Intrinsics.checkNotNullParameter(locationName, "locationName");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(generalInputs, "generalInputs");
            Intrinsics.checkNotNullParameter(passengerInputs, "passengerInputs");
            Intrinsics.checkNotNullParameter(validity, "validity");
            this.f92645a = id10;
            this.f92646b = ticketOfferId;
            this.f92647c = ticketNumber;
            this.d = title;
            this.e = ticketType;
            this.f = description;
            this.f92648g = zones;
            this.f92649h = tags;
            this.i = createdDate;
            this.f92650j = locationName;
            this.k = countryCode;
            this.f92651l = provider;
            this.f92652m = price;
            this.f92653n = str;
            this.o = generalInputs;
            this.f92654p = passengerInputs;
            this.f92655q = str2;
            this.f92656r = bool;
            this.f92657s = validity;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: C9, reason: from getter */
        public final Boolean getF92693r() {
            return this.f92656r;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: F6, reason: from getter */
        public final TransitTicketType getE() {
            return this.e;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: L0, reason: from getter */
        public final String getF92692q() {
            return this.f92655q;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: N1, reason: from getter */
        public final String getF92683b() {
            return this.f92646b;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: V6, reason: from getter */
        public final String getF92684c() {
            return this.f92647c;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        public final List Y2() {
            return this.f92654p;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Expired)) {
                return false;
            }
            Expired expired = (Expired) obj2;
            return Intrinsics.f(this.f92645a, expired.f92645a) && Intrinsics.f(this.f92646b, expired.f92646b) && Intrinsics.f(this.f92647c, expired.f92647c) && Intrinsics.f(this.d, expired.d) && Intrinsics.f(this.e, expired.e) && Intrinsics.f(this.f, expired.f) && Intrinsics.f(this.f92648g, expired.f92648g) && Intrinsics.f(this.f92649h, expired.f92649h) && Intrinsics.f(this.i, expired.i) && Intrinsics.f(this.f92650j, expired.f92650j) && Intrinsics.f(this.k, expired.k) && Intrinsics.f(this.f92651l, expired.f92651l) && Intrinsics.f(this.f92652m, expired.f92652m) && Intrinsics.f(this.f92653n, expired.f92653n) && this.o.equals(expired.o) && this.f92654p.equals(expired.f92654p) && Intrinsics.f(this.f92655q, expired.f92655q) && Intrinsics.f(this.f92656r, expired.f92656r) && Intrinsics.f(this.f92657s, expired.f92657s);
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final wi0.b getK() {
            return this.k;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getDescription, reason: from getter */
        public final TransitTicketDescription getF() {
            return this.f;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF92682a() {
            return this.f92645a;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getPocketId, reason: from getter */
        public final String getF92690n() {
            return this.f92653n;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getPrice, reason: from getter */
        public final dj0.d getF92689m() {
            return this.f92652m;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: h3, reason: from getter */
        public final List getF92685g() {
            return this.f92648g;
        }

        public final int hashCode() {
            int iC = v7.c((this.f92651l.hashCode() + p.a.c(p.a.c(v7.i(this.i, p.a.d(p.a.d((this.f.hashCode() + ((this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f92645a.hashCode() * 31, 31, this.f92646b), 31, this.f92647c), 31, this.d)) * 31)) * 31, 31, this.f92648g), 31, this.f92649h), 31), 31, this.f92650j), 31, this.k.f297794a)) * 31, 31, this.f92652m);
            String str = this.f92653n;
            int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f92654p, com.google.android.gms.internal.mlkit_vision_face.a.b(this.o, (iC + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
            String str2 = this.f92655q;
            int iHashCode = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.f92656r;
            return this.f92657s.hashCode() + ((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31);
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: l0, reason: from getter */
        public final LocalDateTime getI() {
            return this.i;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: n9, reason: from getter */
        public final String getF92687j() {
            return this.f92650j;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: p, reason: from getter */
        public final List getF92686h() {
            return this.f92649h;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: q, reason: from getter */
        public final TransportTicketProvider getF92688l() {
            return this.f92651l;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        public final List t2() {
            return this.o;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92645a);
            dest.writeString(this.f92646b);
            dest.writeString(this.f92647c);
            dest.writeString(this.d);
            this.e.writeToParcel(dest, i);
            this.f.writeToParcel(dest, i);
            dest.writeStringList(this.f92648g);
            dest.writeStringList(this.f92649h);
            dest.writeSerializable(this.i);
            dest.writeString(this.f92650j);
            dest.writeSerializable(this.k);
            this.f92651l.writeToParcel(dest, i);
            dest.writeSerializable(this.f92652m);
            dest.writeString(this.f92653n);
            Iterator itY = j6.a.y(this.o, dest);
            while (itY.hasNext()) {
                ((TransportDetailsField) itY.next()).writeToParcel(dest, i);
            }
            Iterator itY2 = j6.a.y(this.f92654p, dest);
            while (itY2.hasNext()) {
                ((TransportDetailsField) itY2.next()).writeToParcel(dest, i);
            }
            dest.writeString(this.f92655q);
            Boolean bool = this.f92656r;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool);
            }
            this.f92657s.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/models/transit/PurchasedTransitTicket$NotPurchased;", "Lcom/revolut/feature/transport/models/transit/PurchasedTransitTicket;", "", "toString", "()Ljava/lang/String;", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NotPurchased implements PurchasedTransitTicket {

        @NotNull
        public static final Parcelable.Creator<NotPurchased> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f92660c;
        public final String d;
        public final TransitTicketType e;
        public final TransitTicketDescription f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f92661g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f92662h;
        public final LocalDateTime i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f92663j;
        public final wi0.b k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final TransportTicketProvider f92664l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final dj0.d f92665m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f92666n;
        public final ArrayList o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final ArrayList f92667p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final String f92668q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Boolean f92669r;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                TransitTicketType transitTicketTypeCreateFromParcel = TransitTicketType.CREATOR.createFromParcel(parcel);
                TransitTicketDescription transitTicketDescriptionCreateFromParcel = TransitTicketDescription.CREATOR.createFromParcel(parcel);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                LocalDateTime localDateTime = (LocalDateTime) parcel.readSerializable();
                String string5 = parcel.readString();
                wi0.b bVar = (wi0.b) parcel.readSerializable();
                TransportTicketProvider transportTicketProviderCreateFromParcel = TransportTicketProvider.CREATOR.createFromParcel(parcel);
                dj0.d dVar = (dj0.d) parcel.readSerializable();
                String string6 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(TransportDetailsField.CREATOR, parcel, arrayList, iA, 1);
                    i = i;
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iA2 = 0;
                while (iA2 != i2) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(TransportDetailsField.CREATOR, parcel, arrayList2, iA2, 1);
                    i2 = i2;
                    arrayList = arrayList;
                }
                ArrayList arrayList3 = arrayList;
                String string7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NotPurchased(string, string2, string3, string4, transitTicketTypeCreateFromParcel, transitTicketDescriptionCreateFromParcel, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, localDateTime, string5, bVar, transportTicketProviderCreateFromParcel, dVar, string6, arrayList3, arrayList2, string7, boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotPurchased[i];
            }
        }

        public NotPurchased(String id10, String ticketOfferId, String str, String title, TransitTicketType ticketType, TransitTicketDescription description, List zones, List tags, LocalDateTime createdDate, String locationName, wi0.b countryCode, TransportTicketProvider provider, dj0.d dVar, String str2, ArrayList generalInputs, ArrayList passengerInputs, String str3, Boolean bool) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(ticketOfferId, "ticketOfferId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(ticketType, "ticketType");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(zones, "zones");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(createdDate, "createdDate");
            Intrinsics.checkNotNullParameter(locationName, "locationName");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(generalInputs, "generalInputs");
            Intrinsics.checkNotNullParameter(passengerInputs, "passengerInputs");
            this.f92658a = id10;
            this.f92659b = ticketOfferId;
            this.f92660c = str;
            this.d = title;
            this.e = ticketType;
            this.f = description;
            this.f92661g = zones;
            this.f92662h = tags;
            this.i = createdDate;
            this.f92663j = locationName;
            this.k = countryCode;
            this.f92664l = provider;
            this.f92665m = dVar;
            this.f92666n = str2;
            this.o = generalInputs;
            this.f92667p = passengerInputs;
            this.f92668q = str3;
            this.f92669r = bool;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: C9, reason: from getter */
        public final Boolean getF92693r() {
            return this.f92669r;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: F6, reason: from getter */
        public final TransitTicketType getE() {
            return this.e;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: L0, reason: from getter */
        public final String getF92692q() {
            return this.f92668q;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: N1, reason: from getter */
        public final String getF92683b() {
            return this.f92659b;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: V6, reason: from getter */
        public final String getF92684c() {
            return this.f92660c;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        public final List Y2() {
            return this.f92667p;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NotPurchased)) {
                return false;
            }
            NotPurchased notPurchased = (NotPurchased) obj2;
            return Intrinsics.f(this.f92658a, notPurchased.f92658a) && Intrinsics.f(this.f92659b, notPurchased.f92659b) && Intrinsics.f(this.f92660c, notPurchased.f92660c) && Intrinsics.f(this.d, notPurchased.d) && Intrinsics.f(this.e, notPurchased.e) && Intrinsics.f(this.f, notPurchased.f) && Intrinsics.f(this.f92661g, notPurchased.f92661g) && Intrinsics.f(this.f92662h, notPurchased.f92662h) && Intrinsics.f(this.i, notPurchased.i) && Intrinsics.f(this.f92663j, notPurchased.f92663j) && Intrinsics.f(this.k, notPurchased.k) && Intrinsics.f(this.f92664l, notPurchased.f92664l) && Intrinsics.f(this.f92665m, notPurchased.f92665m) && Intrinsics.f(this.f92666n, notPurchased.f92666n) && this.o.equals(notPurchased.o) && this.f92667p.equals(notPurchased.f92667p) && Intrinsics.f(this.f92668q, notPurchased.f92668q) && Intrinsics.f(this.f92669r, notPurchased.f92669r);
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final wi0.b getK() {
            return this.k;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getDescription, reason: from getter */
        public final TransitTicketDescription getF() {
            return this.f;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF92682a() {
            return this.f92658a;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getPocketId, reason: from getter */
        public final String getF92690n() {
            return this.f92666n;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getPrice, reason: from getter */
        public final dj0.d getF92689m() {
            return this.f92665m;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: h3, reason: from getter */
        public final List getF92685g() {
            return this.f92661g;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f92658a.hashCode() * 31, 31, this.f92659b);
            String str = this.f92660c;
            int iHashCode = (this.f92664l.hashCode() + p.a.c(p.a.c(v7.i(this.i, p.a.d(p.a.d((this.f.hashCode() + ((this.e.hashCode() + p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31)) * 31, 31, this.f92661g), 31, this.f92662h), 31), 31, this.f92663j), 31, this.k.f297794a)) * 31;
            dj0.d dVar = this.f92665m;
            int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
            String str2 = this.f92666n;
            int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f92667p, com.google.android.gms.internal.mlkit_vision_face.a.b(this.o, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
            String str3 = this.f92668q;
            int iHashCode3 = (iB + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool = this.f92669r;
            return iHashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: l0, reason: from getter */
        public final LocalDateTime getI() {
            return this.i;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: n9, reason: from getter */
        public final String getF92687j() {
            return this.f92663j;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: p, reason: from getter */
        public final List getF92686h() {
            return this.f92662h;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: q, reason: from getter */
        public final TransportTicketProvider getF92688l() {
            return this.f92664l;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        public final List t2() {
            return this.o;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92658a);
            dest.writeString(this.f92659b);
            dest.writeString(this.f92660c);
            dest.writeString(this.d);
            this.e.writeToParcel(dest, i);
            this.f.writeToParcel(dest, i);
            dest.writeStringList(this.f92661g);
            dest.writeStringList(this.f92662h);
            dest.writeSerializable(this.i);
            dest.writeString(this.f92663j);
            dest.writeSerializable(this.k);
            this.f92664l.writeToParcel(dest, i);
            dest.writeSerializable(this.f92665m);
            dest.writeString(this.f92666n);
            Iterator itY = j6.a.y(this.o, dest);
            while (itY.hasNext()) {
                ((TransportDetailsField) itY.next()).writeToParcel(dest, i);
            }
            Iterator itY2 = j6.a.y(this.f92667p, dest);
            while (itY2.hasNext()) {
                ((TransportDetailsField) itY2.next()).writeToParcel(dest, i);
            }
            dest.writeString(this.f92668q);
            Boolean bool = this.f92669r;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/models/transit/PurchasedTransitTicket$Pending;", "Lcom/revolut/feature/transport/models/transit/PurchasedTransitTicket;", "", "toString", "()Ljava/lang/String;", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pending implements PurchasedTransitTicket {

        @NotNull
        public static final Parcelable.Creator<Pending> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f92672c;
        public final String d;
        public final TransitTicketType e;
        public final TransitTicketDescription f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f92673g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f92674h;
        public final LocalDateTime i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f92675j;
        public final wi0.b k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final TransportTicketProvider f92676l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final dj0.d f92677m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f92678n;
        public final ArrayList o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final ArrayList f92679p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final String f92680q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Boolean f92681r;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                TransitTicketType transitTicketTypeCreateFromParcel = TransitTicketType.CREATOR.createFromParcel(parcel);
                TransitTicketDescription transitTicketDescriptionCreateFromParcel = TransitTicketDescription.CREATOR.createFromParcel(parcel);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                LocalDateTime localDateTime = (LocalDateTime) parcel.readSerializable();
                String string5 = parcel.readString();
                wi0.b bVar = (wi0.b) parcel.readSerializable();
                TransportTicketProvider transportTicketProviderCreateFromParcel = TransportTicketProvider.CREATOR.createFromParcel(parcel);
                dj0.d dVar = (dj0.d) parcel.readSerializable();
                String string6 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(TransportDetailsField.CREATOR, parcel, arrayList, iA, 1);
                    i = i;
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iA2 = 0;
                while (iA2 != i2) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(TransportDetailsField.CREATOR, parcel, arrayList2, iA2, 1);
                    i2 = i2;
                    arrayList = arrayList;
                }
                ArrayList arrayList3 = arrayList;
                String string7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Pending(string, string2, string3, string4, transitTicketTypeCreateFromParcel, transitTicketDescriptionCreateFromParcel, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, localDateTime, string5, bVar, transportTicketProviderCreateFromParcel, dVar, string6, arrayList3, arrayList2, string7, boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pending[i];
            }
        }

        public Pending(String id10, String ticketOfferId, String str, String title, TransitTicketType ticketType, TransitTicketDescription description, List zones, List tags, LocalDateTime createdDate, String locationName, wi0.b countryCode, TransportTicketProvider provider, dj0.d dVar, String str2, ArrayList generalInputs, ArrayList passengerInputs, String str3, Boolean bool) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(ticketOfferId, "ticketOfferId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(ticketType, "ticketType");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(zones, "zones");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(createdDate, "createdDate");
            Intrinsics.checkNotNullParameter(locationName, "locationName");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(generalInputs, "generalInputs");
            Intrinsics.checkNotNullParameter(passengerInputs, "passengerInputs");
            this.f92670a = id10;
            this.f92671b = ticketOfferId;
            this.f92672c = str;
            this.d = title;
            this.e = ticketType;
            this.f = description;
            this.f92673g = zones;
            this.f92674h = tags;
            this.i = createdDate;
            this.f92675j = locationName;
            this.k = countryCode;
            this.f92676l = provider;
            this.f92677m = dVar;
            this.f92678n = str2;
            this.o = generalInputs;
            this.f92679p = passengerInputs;
            this.f92680q = str3;
            this.f92681r = bool;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: C9, reason: from getter */
        public final Boolean getF92693r() {
            return this.f92681r;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: F6, reason: from getter */
        public final TransitTicketType getE() {
            return this.e;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: L0, reason: from getter */
        public final String getF92692q() {
            return this.f92680q;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: N1, reason: from getter */
        public final String getF92683b() {
            return this.f92671b;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: V6, reason: from getter */
        public final String getF92684c() {
            return this.f92672c;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        public final List Y2() {
            return this.f92679p;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Pending)) {
                return false;
            }
            Pending pending = (Pending) obj2;
            return Intrinsics.f(this.f92670a, pending.f92670a) && Intrinsics.f(this.f92671b, pending.f92671b) && Intrinsics.f(this.f92672c, pending.f92672c) && Intrinsics.f(this.d, pending.d) && Intrinsics.f(this.e, pending.e) && Intrinsics.f(this.f, pending.f) && Intrinsics.f(this.f92673g, pending.f92673g) && Intrinsics.f(this.f92674h, pending.f92674h) && Intrinsics.f(this.i, pending.i) && Intrinsics.f(this.f92675j, pending.f92675j) && Intrinsics.f(this.k, pending.k) && Intrinsics.f(this.f92676l, pending.f92676l) && Intrinsics.f(this.f92677m, pending.f92677m) && Intrinsics.f(this.f92678n, pending.f92678n) && this.o.equals(pending.o) && this.f92679p.equals(pending.f92679p) && Intrinsics.f(this.f92680q, pending.f92680q) && Intrinsics.f(this.f92681r, pending.f92681r);
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final wi0.b getK() {
            return this.k;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getDescription, reason: from getter */
        public final TransitTicketDescription getF() {
            return this.f;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF92682a() {
            return this.f92670a;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getPocketId, reason: from getter */
        public final String getF92690n() {
            return this.f92678n;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getPrice, reason: from getter */
        public final dj0.d getF92689m() {
            return this.f92677m;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: h3, reason: from getter */
        public final List getF92685g() {
            return this.f92673g;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f92670a.hashCode() * 31, 31, this.f92671b);
            String str = this.f92672c;
            int iHashCode = (this.f92676l.hashCode() + p.a.c(p.a.c(v7.i(this.i, p.a.d(p.a.d((this.f.hashCode() + ((this.e.hashCode() + p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31)) * 31, 31, this.f92673g), 31, this.f92674h), 31), 31, this.f92675j), 31, this.k.f297794a)) * 31;
            dj0.d dVar = this.f92677m;
            int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
            String str2 = this.f92678n;
            int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f92679p, com.google.android.gms.internal.mlkit_vision_face.a.b(this.o, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
            String str3 = this.f92680q;
            int iHashCode3 = (iB + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool = this.f92681r;
            return iHashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: l0, reason: from getter */
        public final LocalDateTime getI() {
            return this.i;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: n9, reason: from getter */
        public final String getF92687j() {
            return this.f92675j;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: p, reason: from getter */
        public final List getF92686h() {
            return this.f92674h;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: q, reason: from getter */
        public final TransportTicketProvider getF92688l() {
            return this.f92676l;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        public final List t2() {
            return this.o;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92670a);
            dest.writeString(this.f92671b);
            dest.writeString(this.f92672c);
            dest.writeString(this.d);
            this.e.writeToParcel(dest, i);
            this.f.writeToParcel(dest, i);
            dest.writeStringList(this.f92673g);
            dest.writeStringList(this.f92674h);
            dest.writeSerializable(this.i);
            dest.writeString(this.f92675j);
            dest.writeSerializable(this.k);
            this.f92676l.writeToParcel(dest, i);
            dest.writeSerializable(this.f92677m);
            dest.writeString(this.f92678n);
            Iterator itY = j6.a.y(this.o, dest);
            while (itY.hasNext()) {
                ((TransportDetailsField) itY.next()).writeToParcel(dest, i);
            }
            Iterator itY2 = j6.a.y(this.f92679p, dest);
            while (itY2.hasNext()) {
                ((TransportDetailsField) itY2.next()).writeToParcel(dest, i);
            }
            dest.writeString(this.f92680q);
            Boolean bool = this.f92681r;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transport/models/transit/PurchasedTransitTicket$ToBeActivated;", "Lcom/revolut/feature/transport/models/transit/PurchasedTransitTicket;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/transport/models/transit/d", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ToBeActivated implements PurchasedTransitTicket {

        @NotNull
        public static final Parcelable.Creator<ToBeActivated> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f92684c;
        public final String d;
        public final TransitTicketType e;
        public final TransitTicketDescription f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f92685g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f92686h;
        public final LocalDateTime i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f92687j;
        public final wi0.b k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final TransportTicketProvider f92688l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final dj0.d f92689m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f92690n;
        public final ArrayList o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final ArrayList f92691p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final String f92692q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Boolean f92693r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final ArrayList f92694s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final PurchasedTransportTicketActivationProviderParams f92695t;
        public final LocalDateTime u;
        public final LocalDateTime v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final Boolean f92696w;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                ArrayList arrayList;
                Boolean boolValueOf2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                TransitTicketType transitTicketTypeCreateFromParcel = TransitTicketType.CREATOR.createFromParcel(parcel);
                TransitTicketDescription transitTicketDescriptionCreateFromParcel = TransitTicketDescription.CREATOR.createFromParcel(parcel);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                LocalDateTime localDateTime = (LocalDateTime) parcel.readSerializable();
                String string5 = parcel.readString();
                wi0.b bVar = (wi0.b) parcel.readSerializable();
                TransportTicketProvider transportTicketProviderCreateFromParcel = TransportTicketProvider.CREATOR.createFromParcel(parcel);
                dj0.d dVar = (dj0.d) parcel.readSerializable();
                String string6 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(TransportDetailsField.CREATOR, parcel, arrayList2, iA, 1);
                    i = i;
                }
                int i2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i2);
                int iA2 = 0;
                while (iA2 != i2) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(TransportDetailsField.CREATOR, parcel, arrayList3, iA2, 1);
                    i2 = i2;
                    arrayList2 = arrayList2;
                }
                ArrayList arrayList4 = arrayList2;
                String string7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                int i3 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i3);
                Boolean bool = boolValueOf;
                int iA3 = 0;
                while (true) {
                    arrayList = arrayList3;
                    if (iA3 == i3) {
                        break;
                    }
                    iA3 = org.bouncycastle.jcajce.provider.digest.a.a(PurchasedTransitTicketActivationParams.CREATOR, parcel, arrayList5, iA3, 1);
                    arrayList3 = arrayList;
                    i3 = i3;
                }
                PurchasedTransportTicketActivationProviderParams purchasedTransportTicketActivationProviderParamsCreateFromParcel = parcel.readInt() == 0 ? null : PurchasedTransportTicketActivationProviderParams.CREATOR.createFromParcel(parcel);
                LocalDateTime localDateTime2 = (LocalDateTime) parcel.readSerializable();
                LocalDateTime localDateTime3 = (LocalDateTime) parcel.readSerializable();
                if (parcel.readInt() == 0) {
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new ToBeActivated(string, string2, string3, string4, transitTicketTypeCreateFromParcel, transitTicketDescriptionCreateFromParcel, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, localDateTime, string5, bVar, transportTicketProviderCreateFromParcel, dVar, string6, arrayList4, arrayList, string7, bool, arrayList5, purchasedTransportTicketActivationProviderParamsCreateFromParcel, localDateTime2, localDateTime3, boolValueOf2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ToBeActivated[i];
            }
        }

        public ToBeActivated(String id10, String ticketOfferId, String ticketNumber, String title, TransitTicketType ticketType, TransitTicketDescription description, List zones, List tags, LocalDateTime createdDate, String locationName, wi0.b countryCode, TransportTicketProvider provider, dj0.d price, String str, ArrayList generalInputs, ArrayList passengerInputs, String str2, Boolean bool, ArrayList activationParams, PurchasedTransportTicketActivationProviderParams purchasedTransportTicketActivationProviderParams, LocalDateTime localDateTime, LocalDateTime localDateTime2, Boolean bool2) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(ticketOfferId, "ticketOfferId");
            Intrinsics.checkNotNullParameter(ticketNumber, "ticketNumber");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(ticketType, "ticketType");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(zones, "zones");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(createdDate, "createdDate");
            Intrinsics.checkNotNullParameter(locationName, "locationName");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(generalInputs, "generalInputs");
            Intrinsics.checkNotNullParameter(passengerInputs, "passengerInputs");
            Intrinsics.checkNotNullParameter(activationParams, "activationParams");
            this.f92682a = id10;
            this.f92683b = ticketOfferId;
            this.f92684c = ticketNumber;
            this.d = title;
            this.e = ticketType;
            this.f = description;
            this.f92685g = zones;
            this.f92686h = tags;
            this.i = createdDate;
            this.f92687j = locationName;
            this.k = countryCode;
            this.f92688l = provider;
            this.f92689m = price;
            this.f92690n = str;
            this.o = generalInputs;
            this.f92691p = passengerInputs;
            this.f92692q = str2;
            this.f92693r = bool;
            this.f92694s = activationParams;
            this.f92695t = purchasedTransportTicketActivationProviderParams;
            this.u = localDateTime;
            this.v = localDateTime2;
            this.f92696w = bool2;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: C9, reason: from getter */
        public final Boolean getF92693r() {
            return this.f92693r;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: F6, reason: from getter */
        public final TransitTicketType getE() {
            return this.e;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: L0, reason: from getter */
        public final String getF92692q() {
            return this.f92692q;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: N1, reason: from getter */
        public final String getF92683b() {
            return this.f92683b;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: V6, reason: from getter */
        public final String getF92684c() {
            return this.f92684c;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        public final List Y2() {
            return this.f92691p;
        }

        public final d a(LocalDateTime now) {
            Duration durationBetween;
            Duration durationBetween2;
            Intrinsics.checkNotNullParameter(now, "now");
            Duration duration = null;
            LocalDateTime localDateTime = this.v;
            if (localDateTime == null || (durationBetween = Duration.between(now, localDateTime)) == null || durationBetween.isNegative()) {
                durationBetween = null;
            }
            if (durationBetween != null) {
                return new c(durationBetween);
            }
            LocalDateTime localDateTime2 = this.u;
            if (localDateTime2 != null && (durationBetween2 = Duration.between(now, localDateTime2)) != null && !durationBetween2.isNegative()) {
                duration = durationBetween2;
            }
            return duration != null ? new b(duration) : com.revolut.feature.transport.models.transit.a.f92734a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ToBeActivated)) {
                return false;
            }
            ToBeActivated toBeActivated = (ToBeActivated) obj2;
            return Intrinsics.f(this.f92682a, toBeActivated.f92682a) && Intrinsics.f(this.f92683b, toBeActivated.f92683b) && Intrinsics.f(this.f92684c, toBeActivated.f92684c) && Intrinsics.f(this.d, toBeActivated.d) && Intrinsics.f(this.e, toBeActivated.e) && Intrinsics.f(this.f, toBeActivated.f) && Intrinsics.f(this.f92685g, toBeActivated.f92685g) && Intrinsics.f(this.f92686h, toBeActivated.f92686h) && Intrinsics.f(this.i, toBeActivated.i) && Intrinsics.f(this.f92687j, toBeActivated.f92687j) && Intrinsics.f(this.k, toBeActivated.k) && Intrinsics.f(this.f92688l, toBeActivated.f92688l) && Intrinsics.f(this.f92689m, toBeActivated.f92689m) && Intrinsics.f(this.f92690n, toBeActivated.f92690n) && this.o.equals(toBeActivated.o) && this.f92691p.equals(toBeActivated.f92691p) && Intrinsics.f(this.f92692q, toBeActivated.f92692q) && Intrinsics.f(this.f92693r, toBeActivated.f92693r) && this.f92694s.equals(toBeActivated.f92694s) && Intrinsics.f(this.f92695t, toBeActivated.f92695t) && Intrinsics.f(this.u, toBeActivated.u) && Intrinsics.f(this.v, toBeActivated.v) && Intrinsics.f(this.f92696w, toBeActivated.f92696w);
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final wi0.b getK() {
            return this.k;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getDescription, reason: from getter */
        public final TransitTicketDescription getF() {
            return this.f;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF92682a() {
            return this.f92682a;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getPocketId, reason: from getter */
        public final String getF92690n() {
            return this.f92690n;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getPrice, reason: from getter */
        public final dj0.d getF92689m() {
            return this.f92689m;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: h3, reason: from getter */
        public final List getF92685g() {
            return this.f92685g;
        }

        public final int hashCode() {
            int iC = v7.c((this.f92688l.hashCode() + p.a.c(p.a.c(v7.i(this.i, p.a.d(p.a.d((this.f.hashCode() + ((this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f92682a.hashCode() * 31, 31, this.f92683b), 31, this.f92684c), 31, this.d)) * 31)) * 31, 31, this.f92685g), 31, this.f92686h), 31), 31, this.f92687j), 31, this.k.f297794a)) * 31, 31, this.f92689m);
            String str = this.f92690n;
            int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f92691p, com.google.android.gms.internal.mlkit_vision_face.a.b(this.o, (iC + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
            String str2 = this.f92692q;
            int iHashCode = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.f92693r;
            int iB2 = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f92694s, (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31);
            PurchasedTransportTicketActivationProviderParams purchasedTransportTicketActivationProviderParams = this.f92695t;
            int iHashCode2 = (iB2 + (purchasedTransportTicketActivationProviderParams == null ? 0 : purchasedTransportTicketActivationProviderParams.hashCode())) * 31;
            LocalDateTime localDateTime = this.u;
            int iHashCode3 = (iHashCode2 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
            LocalDateTime localDateTime2 = this.v;
            int iHashCode4 = (iHashCode3 + (localDateTime2 == null ? 0 : localDateTime2.hashCode())) * 31;
            Boolean bool2 = this.f92696w;
            return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: l0, reason: from getter */
        public final LocalDateTime getI() {
            return this.i;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: n9, reason: from getter */
        public final String getF92687j() {
            return this.f92687j;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: p, reason: from getter */
        public final List getF92686h() {
            return this.f92686h;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        /* JADX INFO: renamed from: q, reason: from getter */
        public final TransportTicketProvider getF92688l() {
            return this.f92688l;
        }

        @Override // com.revolut.feature.transport.models.transit.PurchasedTransitTicket
        public final List t2() {
            return this.o;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92682a);
            dest.writeString(this.f92683b);
            dest.writeString(this.f92684c);
            dest.writeString(this.d);
            this.e.writeToParcel(dest, i);
            this.f.writeToParcel(dest, i);
            dest.writeStringList(this.f92685g);
            dest.writeStringList(this.f92686h);
            dest.writeSerializable(this.i);
            dest.writeString(this.f92687j);
            dest.writeSerializable(this.k);
            this.f92688l.writeToParcel(dest, i);
            dest.writeSerializable(this.f92689m);
            dest.writeString(this.f92690n);
            Iterator itY = j6.a.y(this.o, dest);
            while (itY.hasNext()) {
                ((TransportDetailsField) itY.next()).writeToParcel(dest, i);
            }
            Iterator itY2 = j6.a.y(this.f92691p, dest);
            while (itY2.hasNext()) {
                ((TransportDetailsField) itY2.next()).writeToParcel(dest, i);
            }
            dest.writeString(this.f92692q);
            Boolean bool = this.f92693r;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool);
            }
            Iterator itY3 = j6.a.y(this.f92694s, dest);
            while (itY3.hasNext()) {
                ((PurchasedTransitTicketActivationParams) itY3.next()).writeToParcel(dest, i);
            }
            PurchasedTransportTicketActivationProviderParams purchasedTransportTicketActivationProviderParams = this.f92695t;
            if (purchasedTransportTicketActivationProviderParams == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                purchasedTransportTicketActivationProviderParams.writeToParcel(dest, i);
            }
            dest.writeSerializable(this.u);
            dest.writeSerializable(this.v);
            Boolean bool2 = this.f92696w;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool2);
            }
        }
    }

    /* JADX INFO: renamed from: C9 */
    Boolean getF92693r();

    /* JADX INFO: renamed from: F6 */
    TransitTicketType getE();

    /* JADX INFO: renamed from: L0 */
    String getF92692q();

    /* JADX INFO: renamed from: N1 */
    String getF92683b();

    /* JADX INFO: renamed from: V6 */
    String getF92684c();

    List Y2();

    /* JADX INFO: renamed from: getCountryCode */
    wi0.b getK();

    /* JADX INFO: renamed from: getDescription */
    TransitTicketDescription getF();

    /* JADX INFO: renamed from: getId */
    String getF92682a();

    /* JADX INFO: renamed from: getPocketId */
    String getF92690n();

    /* JADX INFO: renamed from: getPrice */
    dj0.d getF92689m();

    /* JADX INFO: renamed from: getTitle */
    String getD();

    /* JADX INFO: renamed from: h3 */
    List getF92685g();

    /* JADX INFO: renamed from: l0 */
    LocalDateTime getI();

    /* JADX INFO: renamed from: n9 */
    String getF92687j();

    /* JADX INFO: renamed from: p */
    List getF92686h();

    /* JADX INFO: renamed from: q */
    TransportTicketProvider getF92688l();

    List t2();
}
