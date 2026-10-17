package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown;

import android.os.Parcel;
import android.os.Parcelable;
import cgi.e;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.travel.hotels.impl.model.points.Points;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/screen/price_breakdown/TravelHotelsPriceBreakdownScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsPriceBreakdownScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsPriceBreakdownScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f93967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f93968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f93969c;
    public final Points d;
    public final PaymentMethod.Pocket e;
    public final n6c.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fgi.a f93970g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(TravelHotelsPriceBreakdownScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new TravelHotelsPriceBreakdownScreenContract$InputData(arrayList, e.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt() == 0 ? null : Points.CREATOR.createFromParcel(parcel), (PaymentMethod.Pocket) parcel.readParcelable(TravelHotelsPriceBreakdownScreenContract$InputData.class.getClassLoader()), parcel.readInt() == 0 ? null : n6c.a.valueOf(parcel.readString()), parcel.readInt() != 0 ? fgi.a.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsPriceBreakdownScreenContract$InputData[i];
        }
    }

    public TravelHotelsPriceBreakdownScreenContract$InputData(List pricingList, e ratesType, int i, Points points, PaymentMethod.Pocket pocket, n6c.a aVar, fgi.a aVar2) {
        Intrinsics.checkNotNullParameter(pricingList, "pricingList");
        Intrinsics.checkNotNullParameter(ratesType, "ratesType");
        this.f93967a = pricingList;
        this.f93968b = ratesType;
        this.f93969c = i;
        this.d = points;
        this.e = pocket;
        this.f = aVar;
        this.f93970g = aVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsPriceBreakdownScreenContract$InputData)) {
            return false;
        }
        TravelHotelsPriceBreakdownScreenContract$InputData travelHotelsPriceBreakdownScreenContract$InputData = (TravelHotelsPriceBreakdownScreenContract$InputData) obj2;
        return Intrinsics.f(this.f93967a, travelHotelsPriceBreakdownScreenContract$InputData.f93967a) && this.f93968b == travelHotelsPriceBreakdownScreenContract$InputData.f93968b && this.f93969c == travelHotelsPriceBreakdownScreenContract$InputData.f93969c && Intrinsics.f(this.d, travelHotelsPriceBreakdownScreenContract$InputData.d) && Intrinsics.f(this.e, travelHotelsPriceBreakdownScreenContract$InputData.e) && this.f == travelHotelsPriceBreakdownScreenContract$InputData.f && this.f93970g == travelHotelsPriceBreakdownScreenContract$InputData.f93970g;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f93969c, (this.f93968b.hashCode() + (this.f93967a.hashCode() * 31)) * 31, 31);
        Points points = this.d;
        int iHashCode = (iB + (points == null ? 0 : points.hashCode())) * 31;
        PaymentMethod.Pocket pocket = this.e;
        int iHashCode2 = (iHashCode + (pocket == null ? 0 : pocket.hashCode())) * 31;
        n6c.a aVar = this.f;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        fgi.a aVar2 = this.f93970g;
        return iHashCode3 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f93967a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeString(this.f93968b.name());
        dest.writeInt(this.f93969c);
        Points points = this.d;
        if (points == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            points.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.e, i);
        n6c.a aVar = this.f;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        fgi.a aVar2 = this.f93970g;
        if (aVar2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar2.name());
        }
    }
}
