package com.revolut.feature.apm.core.ui.impl.ui.transfer_wrapper;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod;
import com.revolut.feature.apm.core.models.transfers.ApmTransferDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/core/ui/impl/ui/transfer_wrapper/ApmTransferWrapperFlowModel$ApmTransferDestinationAcceptMoneyRequest", "Lcom/revolut/feature/apm/core/models/transfers/ApmTransferDestination;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmTransferWrapperFlowModel$ApmTransferDestinationAcceptMoneyRequest implements ApmTransferDestination {

    @NotNull
    public static final Parcelable.Creator<ApmTransferWrapperFlowModel$ApmTransferDestinationAcceptMoneyRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmPaymentMethod f62480a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApmTransferWrapperFlowModel$ApmTransferDestinationAcceptMoneyRequest((ApmPaymentMethod) parcel.readParcelable(ApmTransferWrapperFlowModel$ApmTransferDestinationAcceptMoneyRequest.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmTransferWrapperFlowModel$ApmTransferDestinationAcceptMoneyRequest[i];
        }
    }

    public ApmTransferWrapperFlowModel$ApmTransferDestinationAcceptMoneyRequest(ApmPaymentMethod apmPaymentMethod) {
        Intrinsics.checkNotNullParameter(apmPaymentMethod, "apmPaymentMethod");
        this.f62480a = apmPaymentMethod;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ApmTransferWrapperFlowModel$ApmTransferDestinationAcceptMoneyRequest) && Intrinsics.f(this.f62480a, ((ApmTransferWrapperFlowModel$ApmTransferDestinationAcceptMoneyRequest) obj2).f62480a);
    }

    @Override // com.revolut.feature.apm.core.models.transfers.ApmTransferDestination
    public final String getMethod() {
        return this.f62480a.getValue();
    }

    public final int hashCode() {
        return this.f62480a.hashCode();
    }

    @Override // com.revolut.feature.apm.core.models.transfers.ApmTransferDestination
    /* JADX INFO: renamed from: s2, reason: from getter */
    public final ApmPaymentMethod getF62480a() {
        return this.f62480a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62480a, i);
    }
}
