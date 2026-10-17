package com.revolut.feature.travel.hotels.impl.ui.checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.hotels.impl.model.checkout.RevolutCardWithBalanceCheck;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yt8.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui/checkout/TravelHotelsBookingCheckoutContract$CardsContentData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsBookingCheckoutContract$CardsContentData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsBookingCheckoutContract$CardsContentData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutCardWithBalanceCheck f93678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f93679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f93680c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            RevolutCardWithBalanceCheck revolutCardWithBalanceCheckCreateFromParcel = parcel.readInt() == 0 ? null : RevolutCardWithBalanceCheck.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(RevolutCardWithBalanceCheck.CREATOR, parcel, arrayList, iA, 1);
            }
            i iVarValueOf = i.valueOf(parcel.readString());
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iE != i2) {
                iE = j6.a.e(TravelHotelsBookingCheckoutContract$CardsContentData.class, parcel, arrayList2, iE, 1);
            }
            return new TravelHotelsBookingCheckoutContract$CardsContentData(revolutCardWithBalanceCheckCreateFromParcel, arrayList, iVarValueOf, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsBookingCheckoutContract$CardsContentData[i];
        }
    }

    public TravelHotelsBookingCheckoutContract$CardsContentData(RevolutCardWithBalanceCheck revolutCardWithBalanceCheck, List cards, i kyc2, List orders) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(kyc2, "kyc");
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.f93678a = revolutCardWithBalanceCheck;
        this.f93679b = cards;
        this.f93680c = kyc2;
        this.d = orders;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsBookingCheckoutContract$CardsContentData)) {
            return false;
        }
        TravelHotelsBookingCheckoutContract$CardsContentData travelHotelsBookingCheckoutContract$CardsContentData = (TravelHotelsBookingCheckoutContract$CardsContentData) obj2;
        return Intrinsics.f(this.f93678a, travelHotelsBookingCheckoutContract$CardsContentData.f93678a) && Intrinsics.f(this.f93679b, travelHotelsBookingCheckoutContract$CardsContentData.f93679b) && this.f93680c == travelHotelsBookingCheckoutContract$CardsContentData.f93680c && Intrinsics.f(this.d, travelHotelsBookingCheckoutContract$CardsContentData.d);
    }

    public final int hashCode() {
        RevolutCardWithBalanceCheck revolutCardWithBalanceCheck = this.f93678a;
        return this.d.hashCode() + ((this.f93680c.hashCode() + p.a.d((revolutCardWithBalanceCheck == null ? 0 : revolutCardWithBalanceCheck.hashCode()) * 31, 31, this.f93679b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        RevolutCardWithBalanceCheck revolutCardWithBalanceCheck = this.f93678a;
        if (revolutCardWithBalanceCheck == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            revolutCardWithBalanceCheck.writeToParcel(dest, i);
        }
        Iterator itV = p.a.v(this.f93679b, dest);
        while (itV.hasNext()) {
            ((RevolutCardWithBalanceCheck) itV.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.f93680c.name());
        Iterator itV2 = p.a.v(this.d, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
    }
}
