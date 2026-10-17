package com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.tax_residency.api.BackNavigationType;
import com.revolut.feature.tax_residency.impl.v2.models.TaxResidencyFlowContext;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/impl/v2/ui/tax_residency_flow/TaxResidencyFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxResidencyFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TaxResidencyFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaxResidencyFlowContext f90290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BackNavigationType f90291c;
    public final AnalyticsProduct d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TaxResidencyFlowContract$InputData(parcel.readString(), TaxResidencyFlowContext.CREATOR.createFromParcel(parcel), (BackNavigationType) parcel.readParcelable(TaxResidencyFlowContract$InputData.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(TaxResidencyFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxResidencyFlowContract$InputData[i];
        }
    }

    public TaxResidencyFlowContract$InputData(String stepId, TaxResidencyFlowContext flowContext, BackNavigationType backNavigationType, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        Intrinsics.checkNotNullParameter(flowContext, "flowContext");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f90289a = stepId;
        this.f90290b = flowContext;
        this.f90291c = backNavigationType;
        this.d = analyticsProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxResidencyFlowContract$InputData)) {
            return false;
        }
        TaxResidencyFlowContract$InputData taxResidencyFlowContract$InputData = (TaxResidencyFlowContract$InputData) obj2;
        return Intrinsics.f(this.f90289a, taxResidencyFlowContract$InputData.f90289a) && Intrinsics.f(this.f90290b, taxResidencyFlowContract$InputData.f90290b) && this.f90291c == taxResidencyFlowContract$InputData.f90291c && Intrinsics.f(this.d, taxResidencyFlowContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f90291c.hashCode() + ((this.f90290b.hashCode() + (this.f90289a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f90289a);
        this.f90290b.writeToParcel(dest, i);
        dest.writeParcelable(this.f90291c, i);
        dest.writeParcelable(this.d, i);
    }
}
