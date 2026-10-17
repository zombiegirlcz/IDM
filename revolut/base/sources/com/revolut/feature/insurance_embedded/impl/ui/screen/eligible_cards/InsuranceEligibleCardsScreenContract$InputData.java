package com.revolut.feature.insurance_embedded.impl.ui.screen.eligible_cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_embedded.impl.data.model.SchemeInsurancePortal;
import com.revolut.kompot.common.IOData$Input;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_embedded/impl/ui/screen/eligible_cards/InsuranceEligibleCardsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InsuranceEligibleCardsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InsuranceEligibleCardsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f76100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SchemeInsurancePortal f76101b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InsuranceEligibleCardsScreenContract$InputData(parcel.createStringArrayList(), SchemeInsurancePortal.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InsuranceEligibleCardsScreenContract$InputData[i];
        }
    }

    public InsuranceEligibleCardsScreenContract$InputData(List eligibleCardsIds, SchemeInsurancePortal website) {
        Intrinsics.checkNotNullParameter(eligibleCardsIds, "eligibleCardsIds");
        Intrinsics.checkNotNullParameter(website, "website");
        this.f76100a = eligibleCardsIds;
        this.f76101b = website;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InsuranceEligibleCardsScreenContract$InputData)) {
            return false;
        }
        InsuranceEligibleCardsScreenContract$InputData insuranceEligibleCardsScreenContract$InputData = (InsuranceEligibleCardsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f76100a, insuranceEligibleCardsScreenContract$InputData.f76100a) && Intrinsics.f(this.f76101b, insuranceEligibleCardsScreenContract$InputData.f76101b);
    }

    public final int hashCode() {
        return this.f76101b.hashCode() + (this.f76100a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.f76100a);
        this.f76101b.writeToParcel(dest, i);
    }
}
