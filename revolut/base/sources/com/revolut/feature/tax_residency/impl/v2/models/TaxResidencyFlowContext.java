package com.revolut.feature.tax_residency.impl.v2.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/models/TaxResidencyFlowContext;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxResidencyFlowContext implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TaxResidencyFlowContext> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WorkflowStepConfiguration.Screen.TaxResidenciesCollection.ProductConfigurationKey f90180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f90181c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TaxResidencyFlowContext((WorkflowStepConfiguration.Screen.TaxResidenciesCollection.ProductConfigurationKey) parcel.readParcelable(TaxResidencyFlowContext.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxResidencyFlowContext[i];
        }
    }

    public TaxResidencyFlowContext(WorkflowStepConfiguration.Screen.TaxResidenciesCollection.ProductConfigurationKey productConfigurationKey, String flowType, String str) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(productConfigurationKey, "productConfigurationKey");
        this.f90179a = flowType;
        this.f90180b = productConfigurationKey;
        this.f90181c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxResidencyFlowContext)) {
            return false;
        }
        TaxResidencyFlowContext taxResidencyFlowContext = (TaxResidencyFlowContext) obj2;
        return Intrinsics.f(this.f90179a, taxResidencyFlowContext.f90179a) && Intrinsics.f(this.f90180b, taxResidencyFlowContext.f90180b) && Intrinsics.f(this.f90181c, taxResidencyFlowContext.f90181c);
    }

    public final int hashCode() {
        int iHashCode = (this.f90180b.hashCode() + (this.f90179a.hashCode() * 31)) * 31;
        String str = this.f90181c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f90179a);
        dest.writeParcelable(this.f90180b, i);
        dest.writeString(this.f90181c);
    }
}
