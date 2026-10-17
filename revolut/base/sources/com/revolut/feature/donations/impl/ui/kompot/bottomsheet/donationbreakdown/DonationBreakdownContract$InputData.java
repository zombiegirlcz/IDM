package com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donationbreakdown;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.donations.api.model.quote.DonationQuoteRequest;
import com.revolut.feature.donations.api.model.quote.DonationQuoteResponse;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/donations/impl/ui/kompot/bottomsheet/donationbreakdown/DonationBreakdownContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DonationBreakdownContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DonationBreakdownContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DonationQuoteRequest f72004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DonationQuoteResponse f72005b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DonationBreakdownContract$InputData((DonationQuoteRequest) parcel.readParcelable(DonationBreakdownContract$InputData.class.getClassLoader()), (DonationQuoteResponse) parcel.readParcelable(DonationBreakdownContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DonationBreakdownContract$InputData[i];
        }
    }

    public DonationBreakdownContract$InputData(DonationQuoteRequest quoteRequest, DonationQuoteResponse quoteResponse) {
        Intrinsics.checkNotNullParameter(quoteRequest, "quoteRequest");
        Intrinsics.checkNotNullParameter(quoteResponse, "quoteResponse");
        this.f72004a = quoteRequest;
        this.f72005b = quoteResponse;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DonationBreakdownContract$InputData)) {
            return false;
        }
        DonationBreakdownContract$InputData donationBreakdownContract$InputData = (DonationBreakdownContract$InputData) obj2;
        return Intrinsics.f(this.f72004a, donationBreakdownContract$InputData.f72004a) && Intrinsics.f(this.f72005b, donationBreakdownContract$InputData.f72005b);
    }

    public final int hashCode() {
        return this.f72005b.hashCode() + (this.f72004a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f72004a, i);
        dest.writeParcelable(this.f72005b, i);
    }
}
