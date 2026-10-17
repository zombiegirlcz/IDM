package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp;

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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/TransferOutFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferOutFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<TransferOutFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferBroker f91625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferUserAccountInformation f91626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f91627c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            TransferBroker transferBroker = (TransferBroker) j6.a.f(parcel, "parcel", TransferOutFlowContract$State.class);
            TransferUserAccountInformation transferUserAccountInformation = (TransferUserAccountInformation) parcel.readParcelable(TransferOutFlowContract$State.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(TransferOutFlowContract$State.class, parcel, arrayList, iE, 1);
            }
            return new TransferOutFlowContract$State(transferBroker, transferUserAccountInformation, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferOutFlowContract$State[i];
        }
    }

    public TransferOutFlowContract$State() {
        this(0);
    }

    public static TransferOutFlowContract$State a(TransferOutFlowContract$State transferOutFlowContract$State, TransferBroker transferBroker, TransferUserAccountInformation transferUserAccountInformation, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            transferBroker = transferOutFlowContract$State.f91625a;
        }
        if ((i & 2) != 0) {
            transferUserAccountInformation = transferOutFlowContract$State.f91626b;
        }
        List selectedAssets = arrayList;
        if ((i & 4) != 0) {
            selectedAssets = transferOutFlowContract$State.f91627c;
        }
        transferOutFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(selectedAssets, "selectedAssets");
        return new TransferOutFlowContract$State(transferBroker, transferUserAccountInformation, selectedAssets);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferOutFlowContract$State)) {
            return false;
        }
        TransferOutFlowContract$State transferOutFlowContract$State = (TransferOutFlowContract$State) obj2;
        return Intrinsics.f(this.f91625a, transferOutFlowContract$State.f91625a) && Intrinsics.f(this.f91626b, transferOutFlowContract$State.f91626b) && Intrinsics.f(this.f91627c, transferOutFlowContract$State.f91627c);
    }

    public final int hashCode() {
        TransferBroker transferBroker = this.f91625a;
        int iHashCode = (transferBroker == null ? 0 : transferBroker.hashCode()) * 31;
        TransferUserAccountInformation transferUserAccountInformation = this.f91626b;
        return this.f91627c.hashCode() + ((iHashCode + (transferUserAccountInformation != null ? transferUserAccountInformation.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91625a, i);
        dest.writeParcelable(this.f91626b, i);
        Iterator itV = p.a.v(this.f91627c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }

    public TransferOutFlowContract$State(TransferBroker transferBroker, TransferUserAccountInformation transferUserAccountInformation, List selectedAssets) {
        Intrinsics.checkNotNullParameter(selectedAssets, "selectedAssets");
        this.f91625a = transferBroker;
        this.f91626b = transferUserAccountInformation;
        this.f91627c = selectedAssets;
    }

    public TransferOutFlowContract$State(int i) {
        this(null, null, f0.f322471a);
    }
}
