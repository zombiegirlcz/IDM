package com.revolut.feature.insurance.impl.ui.cfac.claim.coverage_info;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance.api.models.details.CFACCancellationReason;
import com.revolut.feature.insurance.api.models.details.CFACInsuranceDetails;
import com.revolut.feature.insurance.api.models.details.CFACProductDetails;
import com.revolut.feature.insurance.api.models.details.CFACReimbursementType;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance/impl/ui/cfac/claim/coverage_info/CFACInsuranceCoverageInfoScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACInsuranceCoverageInfoScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CFACInsuranceCoverageInfoScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CFACReimbursementType f75067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CFACInsuranceDetails f75068c;
    public final CFACProductDetails d;
    public final CFACCancellationReason e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CFACInsuranceCoverageInfoScreenContract$InputData(parcel.readString(), (CFACReimbursementType) parcel.readParcelable(CFACInsuranceCoverageInfoScreenContract$InputData.class.getClassLoader()), (CFACInsuranceDetails) parcel.readParcelable(CFACInsuranceCoverageInfoScreenContract$InputData.class.getClassLoader()), (CFACProductDetails) parcel.readParcelable(CFACInsuranceCoverageInfoScreenContract$InputData.class.getClassLoader()), (CFACCancellationReason) parcel.readParcelable(CFACInsuranceCoverageInfoScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACInsuranceCoverageInfoScreenContract$InputData[i];
        }
    }

    public CFACInsuranceCoverageInfoScreenContract$InputData(String str, CFACReimbursementType reimbursementType, CFACInsuranceDetails insuranceDetails, CFACProductDetails productDetails, CFACCancellationReason cancellationReason) {
        Intrinsics.checkNotNullParameter(reimbursementType, "reimbursementType");
        Intrinsics.checkNotNullParameter(insuranceDetails, "insuranceDetails");
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        Intrinsics.checkNotNullParameter(cancellationReason, "cancellationReason");
        this.f75066a = str;
        this.f75067b = reimbursementType;
        this.f75068c = insuranceDetails;
        this.d = productDetails;
        this.e = cancellationReason;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACInsuranceCoverageInfoScreenContract$InputData)) {
            return false;
        }
        CFACInsuranceCoverageInfoScreenContract$InputData cFACInsuranceCoverageInfoScreenContract$InputData = (CFACInsuranceCoverageInfoScreenContract$InputData) obj2;
        return Intrinsics.f(this.f75066a, cFACInsuranceCoverageInfoScreenContract$InputData.f75066a) && this.f75067b == cFACInsuranceCoverageInfoScreenContract$InputData.f75067b && Intrinsics.f(this.f75068c, cFACInsuranceCoverageInfoScreenContract$InputData.f75068c) && Intrinsics.f(this.d, cFACInsuranceCoverageInfoScreenContract$InputData.d) && Intrinsics.f(this.e, cFACInsuranceCoverageInfoScreenContract$InputData.e);
    }

    public final int hashCode() {
        String str = this.f75066a;
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f75068c.hashCode() + ((this.f75067b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75066a);
        dest.writeParcelable(this.f75067b, i);
        dest.writeParcelable(this.f75068c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
    }
}
