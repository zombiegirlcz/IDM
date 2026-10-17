package com.revolut.feature.transfer.core.impl.ui.reason.flow_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transfer/core/impl/ui/reason/flow_v2/ReasonForTransferFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReasonForTransferFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<ReasonForTransferFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReasonForTransferFlowContract$ReasonForTransferProcessState f92203a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReasonForTransferFlowContract$State(ReasonForTransferFlowContract$ReasonForTransferProcessState.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReasonForTransferFlowContract$State[i];
        }
    }

    public ReasonForTransferFlowContract$State() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ReasonForTransferFlowContract$State) && Intrinsics.f(this.f92203a, ((ReasonForTransferFlowContract$State) obj2).f92203a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f92203a.f92202a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f92203a.writeToParcel(dest, i);
    }

    public ReasonForTransferFlowContract$State(ReasonForTransferFlowContract$ReasonForTransferProcessState processState) {
        Intrinsics.checkNotNullParameter(processState, "processState");
        this.f92203a = processState;
    }

    public /* synthetic */ ReasonForTransferFlowContract$State(int i) {
        this(new ReasonForTransferFlowContract$ReasonForTransferProcessState(false));
    }
}
