package com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.travel.experiences.api.models.pricing_breakdown.TravelExperiencesPricingBreakdown;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPointsOption;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/experiences/impl/ui/screen/price_breakdown/TravelExperiencesPriceBreakdownScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencesPriceBreakdownScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelExperiencesPriceBreakdownScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesPricingBreakdown f93106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperiencesPointsOption f93107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RevPoints f93108c;
    public final PaymentMethod.Pocket d;
    public final n6c.a e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperiencesPriceBreakdownScreenContract$InputData((TravelExperiencesPricingBreakdown) parcel.readParcelable(TravelExperiencesPriceBreakdownScreenContract$InputData.class.getClassLoader()), (TravelExperiencesPointsOption) parcel.readParcelable(TravelExperiencesPriceBreakdownScreenContract$InputData.class.getClassLoader()), (RevPoints) parcel.readParcelable(TravelExperiencesPriceBreakdownScreenContract$InputData.class.getClassLoader()), (PaymentMethod.Pocket) parcel.readParcelable(TravelExperiencesPriceBreakdownScreenContract$InputData.class.getClassLoader()), parcel.readInt() == 0 ? null : n6c.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencesPriceBreakdownScreenContract$InputData[i];
        }
    }

    public TravelExperiencesPriceBreakdownScreenContract$InputData(TravelExperiencesPricingBreakdown pricingBreakdown, TravelExperiencesPointsOption travelExperiencesPointsOption, RevPoints revPoints, PaymentMethod.Pocket pocket, n6c.a aVar) {
        Intrinsics.checkNotNullParameter(pricingBreakdown, "pricingBreakdown");
        this.f93106a = pricingBreakdown;
        this.f93107b = travelExperiencesPointsOption;
        this.f93108c = revPoints;
        this.d = pocket;
        this.e = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencesPriceBreakdownScreenContract$InputData)) {
            return false;
        }
        TravelExperiencesPriceBreakdownScreenContract$InputData travelExperiencesPriceBreakdownScreenContract$InputData = (TravelExperiencesPriceBreakdownScreenContract$InputData) obj2;
        return Intrinsics.f(this.f93106a, travelExperiencesPriceBreakdownScreenContract$InputData.f93106a) && Intrinsics.f(this.f93107b, travelExperiencesPriceBreakdownScreenContract$InputData.f93107b) && Intrinsics.f(this.f93108c, travelExperiencesPriceBreakdownScreenContract$InputData.f93108c) && Intrinsics.f(this.d, travelExperiencesPriceBreakdownScreenContract$InputData.d) && this.e == travelExperiencesPriceBreakdownScreenContract$InputData.e;
    }

    public final int hashCode() {
        int iHashCode = this.f93106a.hashCode() * 31;
        TravelExperiencesPointsOption travelExperiencesPointsOption = this.f93107b;
        int iHashCode2 = (iHashCode + (travelExperiencesPointsOption == null ? 0 : travelExperiencesPointsOption.hashCode())) * 31;
        RevPoints revPoints = this.f93108c;
        int iHashCode3 = (iHashCode2 + (revPoints == null ? 0 : revPoints.f83960a.hashCode())) * 31;
        PaymentMethod.Pocket pocket = this.d;
        int iHashCode4 = (iHashCode3 + (pocket == null ? 0 : pocket.hashCode())) * 31;
        n6c.a aVar = this.e;
        return iHashCode4 + (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f93106a, i);
        dest.writeParcelable(this.f93107b, i);
        dest.writeParcelable(this.f93108c, i);
        dest.writeParcelable(this.d, i);
        n6c.a aVar = this.e;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
    }
}
