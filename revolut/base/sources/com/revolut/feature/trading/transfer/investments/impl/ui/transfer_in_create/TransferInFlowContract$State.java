package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferUserAccountInformation;
import com.revolut.kompot.navigable.flow.FlowState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/TransferInFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferInFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<TransferInFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferBroker f91574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferUserAccountInformation f91575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f91576c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            TransferBroker transferBroker = (TransferBroker) j6.a.f(parcel, "parcel", TransferInFlowContract$State.class);
            TransferUserAccountInformation transferUserAccountInformation = (TransferUserAccountInformation) parcel.readParcelable(TransferInFlowContract$State.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(TransferInFlowContract$State.class, parcel, arrayList, iE, 1);
            }
            return new TransferInFlowContract$State(transferBroker, transferUserAccountInformation, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferInFlowContract$State[i];
        }
    }

    public TransferInFlowContract$State() {
        this(0);
    }

    public static TransferInFlowContract$State a(TransferInFlowContract$State transferInFlowContract$State, TransferBroker transferBroker, TransferUserAccountInformation transferUserAccountInformation, List selectedAssets, int i) {
        if ((i & 1) != 0) {
            transferBroker = transferInFlowContract$State.f91574a;
        }
        if ((i & 2) != 0) {
            transferUserAccountInformation = transferInFlowContract$State.f91575b;
        }
        if ((i & 4) != 0) {
            selectedAssets = transferInFlowContract$State.f91576c;
        }
        transferInFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(selectedAssets, "selectedAssets");
        return new TransferInFlowContract$State(transferBroker, transferUserAccountInformation, selectedAssets);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferInFlowContract$State)) {
            return false;
        }
        TransferInFlowContract$State transferInFlowContract$State = (TransferInFlowContract$State) obj2;
        return Intrinsics.f(this.f91574a, transferInFlowContract$State.f91574a) && Intrinsics.f(this.f91575b, transferInFlowContract$State.f91575b) && Intrinsics.f(this.f91576c, transferInFlowContract$State.f91576c);
    }

    public final int hashCode() {
        TransferBroker transferBroker = this.f91574a;
        int iHashCode = (transferBroker == null ? 0 : transferBroker.hashCode()) * 31;
        TransferUserAccountInformation transferUserAccountInformation = this.f91575b;
        return this.f91576c.hashCode() + ((iHashCode + (transferUserAccountInformation != null ? transferUserAccountInformation.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91574a, i);
        dest.writeParcelable(this.f91575b, i);
        Iterator itV = p.a.v(this.f91576c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }

    public TransferInFlowContract$State(TransferBroker transferBroker, TransferUserAccountInformation transferUserAccountInformation, List selectedAssets) {
        Intrinsics.checkNotNullParameter(selectedAssets, "selectedAssets");
        this.f91574a = transferBroker;
        this.f91575b = transferUserAccountInformation;
        this.f91576c = selectedAssets;
    }

    public TransferInFlowContract$State(int i) {
        this(null, null, f0.f322471a);
    }
}
