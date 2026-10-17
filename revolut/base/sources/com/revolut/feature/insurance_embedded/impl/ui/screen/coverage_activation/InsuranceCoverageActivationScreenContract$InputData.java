package com.revolut.feature.insurance_embedded.impl.ui.screen.coverage_activation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_embedded.impl.data.model.SchemeInsurancePortal;
import com.revolut.kompot.common.IOData$Input;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_embedded/impl/ui/screen/coverage_activation/InsuranceCoverageActivationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InsuranceCoverageActivationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InsuranceCoverageActivationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f76082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SchemeInsurancePortal f76083c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InsuranceCoverageActivationScreenContract$InputData(parcel.readString(), parcel.createStringArrayList(), SchemeInsurancePortal.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InsuranceCoverageActivationScreenContract$InputData[i];
        }
    }

    public InsuranceCoverageActivationScreenContract$InputData(String cardSelectionStepText, List eligibleCardsIds, SchemeInsurancePortal website) {
        Intrinsics.checkNotNullParameter(cardSelectionStepText, "cardSelectionStepText");
        Intrinsics.checkNotNullParameter(eligibleCardsIds, "eligibleCardsIds");
        Intrinsics.checkNotNullParameter(website, "website");
        this.f76081a = cardSelectionStepText;
        this.f76082b = eligibleCardsIds;
        this.f76083c = website;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InsuranceCoverageActivationScreenContract$InputData)) {
            return false;
        }
        InsuranceCoverageActivationScreenContract$InputData insuranceCoverageActivationScreenContract$InputData = (InsuranceCoverageActivationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f76081a, insuranceCoverageActivationScreenContract$InputData.f76081a) && Intrinsics.f(this.f76082b, insuranceCoverageActivationScreenContract$InputData.f76082b) && Intrinsics.f(this.f76083c, insuranceCoverageActivationScreenContract$InputData.f76083c);
    }

    public final int hashCode() {
        return this.f76083c.hashCode() + p.a.d(this.f76081a.hashCode() * 31, 31, this.f76082b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76081a);
        dest.writeStringList(this.f76082b);
        this.f76083c.writeToParcel(dest, i);
    }
}
