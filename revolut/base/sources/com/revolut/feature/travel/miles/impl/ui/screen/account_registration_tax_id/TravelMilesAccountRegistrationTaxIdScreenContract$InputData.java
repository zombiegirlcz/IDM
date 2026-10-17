package com.revolut.feature.travel.miles.impl.ui.screen.account_registration_tax_id;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.miles.api.model.TravelMilesProvider;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/miles/impl/ui/screen/account_registration_tax_id/TravelMilesAccountRegistrationTaxIdScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelMilesAccountRegistrationTaxIdScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelMilesAccountRegistrationTaxIdScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelMilesProvider f94263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94264c;
    public final String d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelMilesAccountRegistrationTaxIdScreenContract$InputData(parcel.readString(), (TravelMilesProvider) parcel.readParcelable(TravelMilesAccountRegistrationTaxIdScreenContract$InputData.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelMilesAccountRegistrationTaxIdScreenContract$InputData[i];
        }
    }

    public TravelMilesAccountRegistrationTaxIdScreenContract$InputData(String taxId, TravelMilesProvider provider, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(taxId, "taxId");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f94262a = taxId;
        this.f94263b = provider;
        this.f94264c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelMilesAccountRegistrationTaxIdScreenContract$InputData)) {
            return false;
        }
        TravelMilesAccountRegistrationTaxIdScreenContract$InputData travelMilesAccountRegistrationTaxIdScreenContract$InputData = (TravelMilesAccountRegistrationTaxIdScreenContract$InputData) obj2;
        return Intrinsics.f(this.f94262a, travelMilesAccountRegistrationTaxIdScreenContract$InputData.f94262a) && Intrinsics.f(this.f94263b, travelMilesAccountRegistrationTaxIdScreenContract$InputData.f94263b) && Intrinsics.f(this.f94264c, travelMilesAccountRegistrationTaxIdScreenContract$InputData.f94264c) && Intrinsics.f(this.d, travelMilesAccountRegistrationTaxIdScreenContract$InputData.d) && Intrinsics.f(this.e, travelMilesAccountRegistrationTaxIdScreenContract$InputData.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f94263b.hashCode() + (this.f94262a.hashCode() * 31)) * 31;
        String str = this.f94264c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94262a);
        dest.writeParcelable(this.f94263b, i);
        dest.writeString(this.f94264c);
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
