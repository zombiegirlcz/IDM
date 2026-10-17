package com.revolut.feature.tax_residency.api;

import aii.q;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/tax_residency/api/TaxResidencyFlowControllerDescriptor;", "Lcom/revolut/kompot/common/ParcelableControllerDescriptor;", "Laii/q;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxResidencyFlowControllerDescriptor implements ParcelableControllerDescriptor<q> {

    @NotNull
    public static final Parcelable.Creator<TaxResidencyFlowControllerDescriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f89964c;
    public final WorkflowStepConfiguration.Screen.TaxResidenciesCollection.ProductConfigurationKey d;
    public final BackNavigationType e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TaxResidencyFlowControllerDescriptor(parcel.readString(), parcel.readString(), parcel.readString(), (WorkflowStepConfiguration.Screen.TaxResidenciesCollection.ProductConfigurationKey) parcel.readParcelable(TaxResidencyFlowControllerDescriptor.class.getClassLoader()), BackNavigationType.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxResidencyFlowControllerDescriptor[i];
        }
    }

    public TaxResidencyFlowControllerDescriptor(String stepId, String str, String flowType, WorkflowStepConfiguration.Screen.TaxResidenciesCollection.ProductConfigurationKey productConfigurationKey, BackNavigationType backNavigationType) {
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(productConfigurationKey, "productConfigurationKey");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        this.f89962a = stepId;
        this.f89963b = str;
        this.f89964c = flowType;
        this.d = productConfigurationKey;
        this.e = backNavigationType;
    }

    /* JADX INFO: renamed from: H1, reason: from getter */
    public final String getF89962a() {
        return this.f89962a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BackNavigationType getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF89964c() {
        return this.f89964c;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getF89963b() {
        return this.f89963b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final WorkflowStepConfiguration.Screen.TaxResidenciesCollection.ProductConfigurationKey getD() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxResidencyFlowControllerDescriptor)) {
            return false;
        }
        TaxResidencyFlowControllerDescriptor taxResidencyFlowControllerDescriptor = (TaxResidencyFlowControllerDescriptor) obj2;
        return Intrinsics.f(this.f89962a, taxResidencyFlowControllerDescriptor.f89962a) && Intrinsics.f(this.f89963b, taxResidencyFlowControllerDescriptor.f89963b) && Intrinsics.f(this.f89964c, taxResidencyFlowControllerDescriptor.f89964c) && Intrinsics.f(this.d, taxResidencyFlowControllerDescriptor.d) && this.e == taxResidencyFlowControllerDescriptor.e;
    }

    public final int hashCode() {
        int iHashCode = this.f89962a.hashCode() * 31;
        String str = this.f89963b;
        return this.e.hashCode() + ((this.d.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f89964c)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f89962a);
        dest.writeString(this.f89963b);
        dest.writeString(this.f89964c);
        dest.writeParcelable(this.d, i);
        this.e.writeToParcel(dest, i);
    }
}
