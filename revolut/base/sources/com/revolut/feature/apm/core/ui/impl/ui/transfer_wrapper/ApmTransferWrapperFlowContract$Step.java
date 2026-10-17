package com.revolut.feature.apm.core.ui.impl.ui.transfer_wrapper;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/core/ui/impl/ui/transfer_wrapper/ApmTransferWrapperFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmTransferWrapperFlowContract$Step implements FlowStep {

    @NotNull
    public static final Parcelable.Creator<ApmTransferWrapperFlowContract$Step> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmTransferContract$InputData f62479a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApmTransferWrapperFlowContract$Step((ApmTransferContract$InputData) parcel.readParcelable(ApmTransferWrapperFlowContract$Step.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmTransferWrapperFlowContract$Step[i];
        }
    }

    public ApmTransferWrapperFlowContract$Step(ApmTransferContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f62479a = inputData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ApmTransferWrapperFlowContract$Step) && Intrinsics.f(this.f62479a, ((ApmTransferWrapperFlowContract$Step) obj2).f62479a);
    }

    public final int hashCode() {
        return this.f62479a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62479a, i);
    }
}
