package com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/donations/impl/ui/kompot/bottomsheet/donatewithpoints/DonateWithPointsContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DonateWithPointsContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DonateWithPointsContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f71994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f71995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71996c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DonateWithPointsContract$InputData(parcel.readString(), (b) parcel.readSerializable(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DonateWithPointsContract$InputData[i];
        }
    }

    public DonateWithPointsContract$InputData(String charityId, b donationCurrency, b charityCurrency) {
        Intrinsics.checkNotNullParameter(donationCurrency, "donationCurrency");
        Intrinsics.checkNotNullParameter(charityCurrency, "charityCurrency");
        Intrinsics.checkNotNullParameter(charityId, "charityId");
        this.f71994a = donationCurrency;
        this.f71995b = charityCurrency;
        this.f71996c = charityId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DonateWithPointsContract$InputData)) {
            return false;
        }
        DonateWithPointsContract$InputData donateWithPointsContract$InputData = (DonateWithPointsContract$InputData) obj2;
        return Intrinsics.f(this.f71994a, donateWithPointsContract$InputData.f71994a) && Intrinsics.f(this.f71995b, donateWithPointsContract$InputData.f71995b) && Intrinsics.f(this.f71996c, donateWithPointsContract$InputData.f71996c);
    }

    public final int hashCode() {
        return this.f71996c.hashCode() + l.j(this.f71995b, this.f71994a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f71994a);
        dest.writeSerializable(this.f71995b);
        dest.writeString(this.f71996c);
    }
}
