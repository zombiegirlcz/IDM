package com.revolut.retail.feature.api.trips.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/trips/models/Trip;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Trip implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Trip> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZonedDateTime f99264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZonedDateTime f99265c;
    public final b d;
    public final List e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ZonedDateTime f99266g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            ZonedDateTime zonedDateTime = (ZonedDateTime) parcel.readSerializable();
            ZonedDateTime zonedDateTime2 = (ZonedDateTime) parcel.readSerializable();
            b bVar = (b) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(TripTransactionAdjustment.CREATOR, parcel, arrayList, iA, 1);
            }
            return new Trip(string, zonedDateTime, zonedDateTime2, bVar, arrayList, parcel.readInt() != 0, (ZonedDateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Trip[i];
        }
    }

    public Trip(String id10, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, b countryCode, List transactionAdjustments, boolean z, ZonedDateTime createdDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(transactionAdjustments, "transactionAdjustments");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        this.f99263a = id10;
        this.f99264b = zonedDateTime;
        this.f99265c = zonedDateTime2;
        this.d = countryCode;
        this.e = transactionAdjustments;
        this.f = z;
        this.f99266g = createdDate;
    }

    public final boolean a() {
        return this.f99264b != null && this.f99265c == null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Trip)) {
            return false;
        }
        Trip trip = (Trip) obj2;
        return Intrinsics.f(this.f99263a, trip.f99263a) && Intrinsics.f(this.f99264b, trip.f99264b) && Intrinsics.f(this.f99265c, trip.f99265c) && Intrinsics.f(this.d, trip.d) && Intrinsics.f(this.e, trip.e) && this.f == trip.f && Intrinsics.f(this.f99266g, trip.f99266g);
    }

    public final xi0.b getCurrency() {
        b countryCode = this.d;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        xi0.b.Companion.getClass();
        xi0.b bVarB = xi0.a.b(countryCode);
        return bVarB.equals(xi0.b.f306278p) ? xi0.b.f306272g : bVarB;
    }

    public final int hashCode() {
        int iHashCode = this.f99263a.hashCode() * 31;
        ZonedDateTime zonedDateTime = this.f99264b;
        int iHashCode2 = (iHashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        ZonedDateTime zonedDateTime2 = this.f99265c;
        return this.f99266g.hashCode() + j6.a.c(p.a.d(p.a.c((iHashCode2 + (zonedDateTime2 != null ? zonedDateTime2.hashCode() : 0)) * 31, 31, this.d.f297794a), 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99263a);
        dest.writeSerializable(this.f99264b);
        dest.writeSerializable(this.f99265c);
        dest.writeSerializable(this.d);
        Iterator itV = p.a.v(this.e, dest);
        while (itV.hasNext()) {
            ((TripTransactionAdjustment) itV.next()).writeToParcel(dest, i);
        }
        dest.writeInt(this.f ? 1 : 0);
        dest.writeSerializable(this.f99266g);
    }
}
