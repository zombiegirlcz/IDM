package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInInstrument;
import com.revolut.kompot.navigable.flow.FlowState;
import ej0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_asset_selection/TransferInAssetSelectionFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferInAssetSelectionFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<TransferInAssetSelectionFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferInInstrument f91559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f91561c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferInAssetSelectionFlowContract$State((TransferInInstrument) parcel.readParcelable(TransferInAssetSelectionFlowContract$State.class.getClassLoader()), parcel.readInt(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferInAssetSelectionFlowContract$State[i];
        }
    }

    public TransferInAssetSelectionFlowContract$State(TransferInInstrument transferInInstrument, int i, b bVar) {
        this.f91559a = transferInInstrument;
        this.f91560b = i;
        this.f91561c = bVar;
    }

    public static TransferInAssetSelectionFlowContract$State a(TransferInAssetSelectionFlowContract$State transferInAssetSelectionFlowContract$State, TransferInInstrument transferInInstrument, int i, b bVar, int i2) {
        if ((i2 & 1) != 0) {
            transferInInstrument = transferInAssetSelectionFlowContract$State.f91559a;
        }
        if ((i2 & 2) != 0) {
            i = transferInAssetSelectionFlowContract$State.f91560b;
        }
        if ((i2 & 4) != 0) {
            bVar = transferInAssetSelectionFlowContract$State.f91561c;
        }
        transferInAssetSelectionFlowContract$State.getClass();
        return new TransferInAssetSelectionFlowContract$State(transferInInstrument, i, bVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferInAssetSelectionFlowContract$State)) {
            return false;
        }
        TransferInAssetSelectionFlowContract$State transferInAssetSelectionFlowContract$State = (TransferInAssetSelectionFlowContract$State) obj2;
        return Intrinsics.f(this.f91559a, transferInAssetSelectionFlowContract$State.f91559a) && this.f91560b == transferInAssetSelectionFlowContract$State.f91560b && Intrinsics.f(this.f91561c, transferInAssetSelectionFlowContract$State.f91561c);
    }

    public final int hashCode() {
        TransferInInstrument transferInInstrument = this.f91559a;
        int iB = j6.a.b(this.f91560b, (transferInInstrument == null ? 0 : transferInInstrument.hashCode()) * 31, 31);
        b bVar = this.f91561c;
        return iB + (bVar != null ? bVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91559a, i);
        dest.writeInt(this.f91560b);
        dest.writeSerializable(this.f91561c);
    }
}
