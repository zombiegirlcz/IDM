package com.revolut.feature.transport.models.transit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transport.models.TransportTicketProvider;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/models/transit/TransitTicket;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransitTicket implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransitTicket> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransitTicketType f92708c;
    public final TransitTicketDescription d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f92709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f92710h;
    public final wi0.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TransportTicketProvider f92711j;
    public final dj0.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f92712l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f92713m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f92714n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f92715p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TransitTicketEligibility f92716q;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            String str;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            TransitTicketType transitTicketTypeCreateFromParcel = TransitTicketType.CREATOR.createFromParcel(parcel);
            TransitTicketDescription transitTicketDescriptionCreateFromParcel = TransitTicketDescription.CREATOR.createFromParcel(parcel);
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            boolean z = parcel.readInt() != 0;
            String string3 = parcel.readString();
            wi0.b bVar = (wi0.b) parcel.readSerializable();
            TransportTicketProvider transportTicketProviderCreateFromParcel = TransportTicketProvider.CREATOR.createFromParcel(parcel);
            dj0.d dVar = (dj0.d) parcel.readSerializable();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            boolean z3 = z;
            int iE = 0;
            while (true) {
                str = string;
                if (iE == i2) {
                    break;
                }
                iE = j6.a.e(TransitTicket.class, parcel, arrayList, iE, 1);
                string = str;
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            int iE2 = 0;
            while (iE2 != i3) {
                iE2 = j6.a.e(TransitTicket.class, parcel, arrayList2, iE2, 1);
            }
            return new TransitTicket(str, string2, transitTicketTypeCreateFromParcel, transitTicketDescriptionCreateFromParcel, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, z3, string3, bVar, transportTicketProviderCreateFromParcel, dVar, i, arrayList, arrayList2, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : TransitTicketEligibility.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransitTicket[i];
        }
    }

    public TransitTicket(String id10, String title, TransitTicketType ticketType, TransitTicketDescription descriptions, List zones, List tags, boolean z, String locationName, wi0.b countryCode, TransportTicketProvider provider, dj0.d price, int i, ArrayList passengerInputs, ArrayList generalInputs, boolean z3, boolean z4, TransitTicketEligibility transitTicketEligibility) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(ticketType, "ticketType");
        Intrinsics.checkNotNullParameter(descriptions, "descriptions");
        Intrinsics.checkNotNullParameter(zones, "zones");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(locationName, "locationName");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(passengerInputs, "passengerInputs");
        Intrinsics.checkNotNullParameter(generalInputs, "generalInputs");
        this.f92706a = id10;
        this.f92707b = title;
        this.f92708c = ticketType;
        this.d = descriptions;
        this.e = zones;
        this.f = tags;
        this.f92709g = z;
        this.f92710h = locationName;
        this.i = countryCode;
        this.f92711j = provider;
        this.k = price;
        this.f92712l = i;
        this.f92713m = passengerInputs;
        this.f92714n = generalInputs;
        this.o = z3;
        this.f92715p = z4;
        this.f92716q = transitTicketEligibility;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransitTicket)) {
            return false;
        }
        TransitTicket transitTicket = (TransitTicket) obj2;
        return Intrinsics.f(this.f92706a, transitTicket.f92706a) && Intrinsics.f(this.f92707b, transitTicket.f92707b) && Intrinsics.f(this.f92708c, transitTicket.f92708c) && Intrinsics.f(this.d, transitTicket.d) && Intrinsics.f(this.e, transitTicket.e) && Intrinsics.f(this.f, transitTicket.f) && this.f92709g == transitTicket.f92709g && Intrinsics.f(this.f92710h, transitTicket.f92710h) && Intrinsics.f(this.i, transitTicket.i) && Intrinsics.f(this.f92711j, transitTicket.f92711j) && Intrinsics.f(this.k, transitTicket.k) && this.f92712l == transitTicket.f92712l && this.f92713m.equals(transitTicket.f92713m) && this.f92714n.equals(transitTicket.f92714n) && this.o == transitTicket.o && this.f92715p == transitTicket.f92715p && Intrinsics.f(this.f92716q, transitTicket.f92716q);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f92714n, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f92713m, j6.a.b(this.f92712l, v7.c((this.f92711j.hashCode() + p.a.c(p.a.c(j6.a.c(p.a.d(p.a.d((this.d.hashCode() + ((this.f92708c.hashCode() + p.a.c(this.f92706a.hashCode() * 31, 31, this.f92707b)) * 31)) * 31, 31, this.e), 31, this.f), 31, this.f92709g), 31, this.f92710h), 31, this.i.f297794a)) * 31, 31, this.k), 31), 31), 31), 31, this.o), 31, this.f92715p);
        TransitTicketEligibility transitTicketEligibility = this.f92716q;
        return iC + (transitTicketEligibility == null ? 0 : transitTicketEligibility.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92706a);
        dest.writeString(this.f92707b);
        this.f92708c.writeToParcel(dest, i);
        this.d.writeToParcel(dest, i);
        dest.writeStringList(this.e);
        dest.writeStringList(this.f);
        dest.writeInt(this.f92709g ? 1 : 0);
        dest.writeString(this.f92710h);
        dest.writeSerializable(this.i);
        this.f92711j.writeToParcel(dest, i);
        dest.writeSerializable(this.k);
        dest.writeInt(this.f92712l);
        Iterator itY = j6.a.y(this.f92713m, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        Iterator itY2 = j6.a.y(this.f92714n, dest);
        while (itY2.hasNext()) {
            dest.writeParcelable((Parcelable) itY2.next(), i);
        }
        dest.writeInt(this.o ? 1 : 0);
        dest.writeInt(this.f92715p ? 1 : 0);
        TransitTicketEligibility transitTicketEligibility = this.f92716q;
        if (transitTicketEligibility == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            transitTicketEligibility.writeToParcel(dest, i);
        }
    }
}
