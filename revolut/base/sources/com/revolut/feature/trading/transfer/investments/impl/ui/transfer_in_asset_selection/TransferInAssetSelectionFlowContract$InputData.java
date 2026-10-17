package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInSelectedAsset;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_asset_selection/TransferInAssetSelectionFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "NewTransferAssetSelection", "EditTransferAssetSelection", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_asset_selection/TransferInAssetSelectionFlowContract$InputData$EditTransferAssetSelection;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_asset_selection/TransferInAssetSelectionFlowContract$InputData$NewTransferAssetSelection;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferInAssetSelectionFlowContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_asset_selection/TransferInAssetSelectionFlowContract$InputData$EditTransferAssetSelection;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_asset_selection/TransferInAssetSelectionFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditTransferAssetSelection implements TransferInAssetSelectionFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<EditTransferAssetSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferBroker f91554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransferInSelectedAsset f91555b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditTransferAssetSelection((TransferBroker) parcel.readParcelable(EditTransferAssetSelection.class.getClassLoader()), (TransferInSelectedAsset) parcel.readParcelable(EditTransferAssetSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditTransferAssetSelection[i];
            }
        }

        public EditTransferAssetSelection(TransferBroker transferBroker, TransferInSelectedAsset selectedAssetToEdit) {
            Intrinsics.checkNotNullParameter(transferBroker, "transferBroker");
            Intrinsics.checkNotNullParameter(selectedAssetToEdit, "selectedAssetToEdit");
            this.f91554a = transferBroker;
            this.f91555b = selectedAssetToEdit;
        }

        @Override // com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.TransferInAssetSelectionFlowContract$InputData
        /* JADX INFO: renamed from: H2, reason: from getter */
        public final TransferBroker getF91556a() {
            return this.f91554a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditTransferAssetSelection)) {
                return false;
            }
            EditTransferAssetSelection editTransferAssetSelection = (EditTransferAssetSelection) obj2;
            return Intrinsics.f(this.f91554a, editTransferAssetSelection.f91554a) && Intrinsics.f(this.f91555b, editTransferAssetSelection.f91555b);
        }

        public final int hashCode() {
            return this.f91555b.hashCode() + (this.f91554a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91554a, i);
            dest.writeParcelable(this.f91555b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_asset_selection/TransferInAssetSelectionFlowContract$InputData$NewTransferAssetSelection;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_asset_selection/TransferInAssetSelectionFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewTransferAssetSelection implements TransferInAssetSelectionFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<NewTransferAssetSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferBroker f91556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f91557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f91558c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                TransferBroker transferBroker = (TransferBroker) j6.a.f(parcel, "parcel", NewTransferAssetSelection.class);
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                while (iE != i) {
                    iE = d.e(NewTransferAssetSelection.class, parcel, linkedHashSet, iE, 1);
                }
                return new NewTransferAssetSelection(transferBroker, string, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewTransferAssetSelection[i];
            }
        }

        public NewTransferAssetSelection(TransferBroker transferBroker, String accountId, Set hiddenInstruments) {
            Intrinsics.checkNotNullParameter(transferBroker, "transferBroker");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(hiddenInstruments, "hiddenInstruments");
            this.f91556a = transferBroker;
            this.f91557b = accountId;
            this.f91558c = hiddenInstruments;
        }

        @Override // com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.TransferInAssetSelectionFlowContract$InputData
        /* JADX INFO: renamed from: H2, reason: from getter */
        public final TransferBroker getF91556a() {
            return this.f91556a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NewTransferAssetSelection)) {
                return false;
            }
            NewTransferAssetSelection newTransferAssetSelection = (NewTransferAssetSelection) obj2;
            return Intrinsics.f(this.f91556a, newTransferAssetSelection.f91556a) && Intrinsics.f(this.f91557b, newTransferAssetSelection.f91557b) && Intrinsics.f(this.f91558c, newTransferAssetSelection.f91558c);
        }

        public final int hashCode() {
            return this.f91558c.hashCode() + p.a.c(this.f91556a.hashCode() * 31, 31, this.f91557b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91556a, i);
            dest.writeString(this.f91557b);
            Iterator itV = n.v(this.f91558c, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    /* JADX INFO: renamed from: H2 */
    TransferBroker getF91556a();
}
