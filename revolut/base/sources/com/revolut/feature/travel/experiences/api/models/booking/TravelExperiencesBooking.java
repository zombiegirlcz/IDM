package com.revolut.feature.travel.experiences.api.models.booking;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.cancellation.TravelExperienceCancellationRefund;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingTicket;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBrief;
import com.revolut.feature.travel.experiences.api.models.pricing_breakdown.TravelExperiencesPricingBreakdown;
import com.revolut.feature.travel.experiences.api.models.visitors.TravelExperiencesVisitorsCount;
import com.revolut.feature.travel.experiences.models.TravelExperienceCancellationPolicy;
import com.revolut.feature.travel.experiences.models.TravelExperiencesCashback;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPointsOption;
import iyf.b;
import iyf.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/booking/TravelExperiencesBooking;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "iyf/a", "iyf/b", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencesBooking implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperiencesBooking> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f92747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f92748c;
    public final DateTime d;
    public final String e;
    public final TravelExperienceBrief f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f92749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final iyf.a f92750h;
    public final TravelExperienceBookingTicket i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TravelExperiencesCashback f92751j;
    public final TravelExperiencesPricingBreakdown k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f92752l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f92753m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TravelExperienceCancellationPolicy.Booking f92754n;
    public final TravelExperienceCancellationRefund o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f92755p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Double f92756q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TravelExperiencesPointsOption f92757r;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            iyf.a aVar;
            String str;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            c cVarValueOf = c.valueOf(parcel.readString());
            DateTime dateTime = (DateTime) parcel.readSerializable();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            String string2 = parcel.readString();
            TravelExperienceBrief travelExperienceBriefCreateFromParcel = TravelExperienceBrief.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(TravelExperiencesVisitorsCount.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            iyf.a aVarValueOf = parcel.readInt() == 0 ? null : iyf.a.valueOf(parcel.readString());
            TravelExperienceBookingTicket travelExperienceBookingTicketCreateFromParcel = parcel.readInt() == 0 ? null : TravelExperienceBookingTicket.CREATOR.createFromParcel(parcel);
            TravelExperiencesCashback travelExperiencesCashback = (TravelExperiencesCashback) parcel.readParcelable(TravelExperiencesBooking.class.getClassLoader());
            TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdownCreateFromParcel = TravelExperiencesPricingBreakdown.CREATOR.createFromParcel(parcel);
            b bVarValueOf = parcel.readInt() == 0 ? null : b.valueOf(parcel.readString());
            String string3 = parcel.readString();
            TravelExperienceCancellationPolicy.Booking booking = (TravelExperienceCancellationPolicy.Booking) parcel.readParcelable(TravelExperiencesBooking.class.getClassLoader());
            TravelExperienceCancellationRefund travelExperienceCancellationRefundCreateFromParcel = parcel.readInt() == 0 ? null : TravelExperienceCancellationRefund.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                aVar = aVarValueOf;
                str = string;
                arrayList2 = null;
            } else {
                int i2 = parcel.readInt();
                aVar = aVarValueOf;
                ArrayList arrayList3 = new ArrayList(i2);
                str = string;
                int iA2 = 0;
                while (iA2 != i2) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(TravelExperiencesBookingTransaction.CREATOR, parcel, arrayList3, iA2, 1);
                    i2 = i2;
                    cVarValueOf = cVarValueOf;
                }
                arrayList2 = arrayList3;
            }
            return new TravelExperiencesBooking(str, cVarValueOf, dateTime, dateTime2, string2, travelExperienceBriefCreateFromParcel, arrayList, aVar, travelExperienceBookingTicketCreateFromParcel, travelExperiencesCashback, travelExperiencesPricingBreakdownCreateFromParcel, bVarValueOf, string3, booking, travelExperienceCancellationRefundCreateFromParcel, arrayList2, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), (TravelExperiencesPointsOption) parcel.readParcelable(TravelExperiencesBooking.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencesBooking[i];
        }
    }

    public TravelExperiencesBooking(String id10, c status, DateTime createdDate, DateTime date, String str, TravelExperienceBrief experience, ArrayList arrayList, iyf.a aVar, TravelExperienceBookingTicket travelExperienceBookingTicket, TravelExperiencesCashback cashback, TravelExperiencesPricingBreakdown pricing, b bVar, String str2, TravelExperienceCancellationPolicy.Booking booking, TravelExperienceCancellationRefund travelExperienceCancellationRefund, ArrayList arrayList2, Double d, TravelExperiencesPointsOption travelExperiencesPointsOption) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(cashback, "cashback");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        this.f92746a = id10;
        this.f92747b = status;
        this.f92748c = createdDate;
        this.d = date;
        this.e = str;
        this.f = experience;
        this.f92749g = arrayList;
        this.f92750h = aVar;
        this.i = travelExperienceBookingTicket;
        this.f92751j = cashback;
        this.k = pricing;
        this.f92752l = bVar;
        this.f92753m = str2;
        this.f92754n = booking;
        this.o = travelExperienceCancellationRefund;
        this.f92755p = arrayList2;
        this.f92756q = d;
        this.f92757r = travelExperiencesPointsOption;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencesBooking)) {
            return false;
        }
        TravelExperiencesBooking travelExperiencesBooking = (TravelExperiencesBooking) obj2;
        return Intrinsics.f(this.f92746a, travelExperiencesBooking.f92746a) && this.f92747b == travelExperiencesBooking.f92747b && Intrinsics.f(this.f92748c, travelExperiencesBooking.f92748c) && Intrinsics.f(this.d, travelExperiencesBooking.d) && Intrinsics.f(this.e, travelExperiencesBooking.e) && Intrinsics.f(this.f, travelExperiencesBooking.f) && Intrinsics.f(this.f92749g, travelExperiencesBooking.f92749g) && this.f92750h == travelExperiencesBooking.f92750h && Intrinsics.f(this.i, travelExperiencesBooking.i) && Intrinsics.f(this.f92751j, travelExperiencesBooking.f92751j) && Intrinsics.f(this.k, travelExperiencesBooking.k) && this.f92752l == travelExperiencesBooking.f92752l && Intrinsics.f(this.f92753m, travelExperiencesBooking.f92753m) && Intrinsics.f(this.f92754n, travelExperiencesBooking.f92754n) && Intrinsics.f(this.o, travelExperiencesBooking.o) && Intrinsics.f(this.f92755p, travelExperiencesBooking.f92755p) && Intrinsics.f(this.f92756q, travelExperiencesBooking.f92756q) && Intrinsics.f(this.f92757r, travelExperiencesBooking.f92757r);
    }

    public final int hashCode() {
        int iF = m72.b.f(this.d, m72.b.f(this.f92748c, (this.f92747b.hashCode() + (this.f92746a.hashCode() * 31)) * 31, 31), 31);
        String str = this.e;
        int iHashCode = (this.f.hashCode() + ((iF + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        List list = this.f92749g;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        iyf.a aVar = this.f92750h;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        TravelExperienceBookingTicket travelExperienceBookingTicket = this.i;
        int iHashCode4 = (this.k.hashCode() + ((this.f92751j.hashCode() + ((iHashCode3 + (travelExperienceBookingTicket == null ? 0 : travelExperienceBookingTicket.hashCode())) * 31)) * 31)) * 31;
        b bVar = this.f92752l;
        int iHashCode5 = (iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str2 = this.f92753m;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TravelExperienceCancellationPolicy.Booking booking = this.f92754n;
        int iHashCode7 = (iHashCode6 + (booking == null ? 0 : booking.hashCode())) * 31;
        TravelExperienceCancellationRefund travelExperienceCancellationRefund = this.o;
        int iHashCode8 = (iHashCode7 + (travelExperienceCancellationRefund == null ? 0 : travelExperienceCancellationRefund.hashCode())) * 31;
        List list2 = this.f92755p;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Double d = this.f92756q;
        int iHashCode10 = (iHashCode9 + (d == null ? 0 : d.hashCode())) * 31;
        TravelExperiencesPointsOption travelExperiencesPointsOption = this.f92757r;
        return iHashCode10 + (travelExperiencesPointsOption != null ? travelExperiencesPointsOption.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92746a);
        dest.writeString(this.f92747b.name());
        dest.writeSerializable(this.f92748c);
        dest.writeSerializable(this.d);
        dest.writeString(this.e);
        this.f.writeToParcel(dest, i);
        List list = this.f92749g;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((TravelExperiencesVisitorsCount) itQ.next()).writeToParcel(dest, i);
            }
        }
        iyf.a aVar = this.f92750h;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        TravelExperienceBookingTicket travelExperienceBookingTicket = this.i;
        if (travelExperienceBookingTicket == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            travelExperienceBookingTicket.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f92751j, i);
        this.k.writeToParcel(dest, i);
        b bVar = this.f92752l;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        dest.writeString(this.f92753m);
        dest.writeParcelable(this.f92754n, i);
        TravelExperienceCancellationRefund travelExperienceCancellationRefund = this.o;
        if (travelExperienceCancellationRefund == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            travelExperienceCancellationRefund.writeToParcel(dest, i);
        }
        List list2 = this.f92755p;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = v0.a.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                ((TravelExperiencesBookingTransaction) itQ2.next()).writeToParcel(dest, i);
            }
        }
        Double d = this.f92756q;
        if (d == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
        }
        dest.writeParcelable(this.f92757r, i);
    }
}
