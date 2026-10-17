package com.revolut.feature.insurance_embedded.impl.ui.flow.coverage_activation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_embedded.impl.data.model.SchemeInsurancePortal;
import com.revolut.kompot.common.IOData$Input;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_embedded/impl/ui/flow/coverage_activation/InsuranceCoverageActivationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InsuranceCoverageActivationFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InsuranceCoverageActivationFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f76054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SchemeInsurancePortal f76055c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InsuranceCoverageActivationFlowContract$InputData(parcel.readString(), parcel.createStringArrayList(), SchemeInsurancePortal.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InsuranceCoverageActivationFlowContract$InputData[i];
        }
    }

    public InsuranceCoverageActivationFlowContract$InputData(String cardSelectionStepText, List eligibleCardsIds, SchemeInsurancePortal website) {
        Intrinsics.checkNotNullParameter(cardSelectionStepText, "cardSelectionStepText");
        Intrinsics.checkNotNullParameter(eligibleCardsIds, "eligibleCardsIds");
        Intrinsics.checkNotNullParameter(website, "website");
        this.f76053a = cardSelectionStepText;
        this.f76054b = eligibleCardsIds;
        this.f76055c = website;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InsuranceCoverageActivationFlowContract$InputData)) {
            return false;
        }
        InsuranceCoverageActivationFlowContract$InputData insuranceCoverageActivationFlowContract$InputData = (InsuranceCoverageActivationFlowContract$InputData) obj2;
        return Intrinsics.f(this.f76053a, insuranceCoverageActivationFlowContract$InputData.f76053a) && Intrinsics.f(this.f76054b, insuranceCoverageActivationFlowContract$InputData.f76054b) && Intrinsics.f(this.f76055c, insuranceCoverageActivationFlowContract$InputData.f76055c);
    }

    public final int hashCode() {
        return this.f76055c.hashCode() + p.a.d(this.f76053a.hashCode() * 31, 31, this.f76054b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76053a);
        dest.writeStringList(this.f76054b);
        this.f76055c.writeToParcel(dest, i);
    }
}
