package com.revolut.feature.payments.air.widget.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/payments/air/widget/impl/ui/flow/AirPaymentTransferFlowContract$TransferInput", "Landroid/os/Parcelable;", "PeerToPeer", "BankTransfer", "CardTransfer", "Lcom/revolut/feature/payments/air/widget/impl/ui/flow/AirPaymentTransferFlowContract$TransferInput$BankTransfer;", "Lcom/revolut/feature/payments/air/widget/impl/ui/flow/AirPaymentTransferFlowContract$TransferInput$CardTransfer;", "Lcom/revolut/feature/payments/air/widget/impl/ui/flow/AirPaymentTransferFlowContract$TransferInput$PeerToPeer;", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AirPaymentTransferFlowContract$TransferInput extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/ui/flow/AirPaymentTransferFlowContract$TransferInput$BankTransfer;", "Lcom/revolut/feature/payments/air/widget/impl/ui/flow/AirPaymentTransferFlowContract$TransferInput;", "", "toString", "()Ljava/lang/String;", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BankTransfer implements AirPaymentTransferFlowContract$TransferInput {

        @NotNull
        public static final Parcelable.Creator<BankTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BankTransferFlowInputData f79129a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BankTransfer((BankTransferFlowInputData) parcel.readParcelable(BankTransfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BankTransfer[i];
            }
        }

        public BankTransfer(BankTransferFlowInputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f79129a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BankTransfer) && Intrinsics.f(this.f79129a, ((BankTransfer) obj2).f79129a);
        }

        public final int hashCode() {
            return this.f79129a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79129a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/ui/flow/AirPaymentTransferFlowContract$TransferInput$CardTransfer;", "Lcom/revolut/feature/payments/air/widget/impl/ui/flow/AirPaymentTransferFlowContract$TransferInput;", "", "toString", "()Ljava/lang/String;", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardTransfer implements AirPaymentTransferFlowContract$TransferInput {

        @NotNull
        public static final Parcelable.Creator<CardTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PushToCardTransferInputData f79130a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardTransfer((PushToCardTransferInputData) parcel.readParcelable(CardTransfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardTransfer[i];
            }
        }

        public CardTransfer(PushToCardTransferInputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f79130a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CardTransfer) && Intrinsics.f(this.f79130a, ((CardTransfer) obj2).f79130a);
        }

        public final int hashCode() {
            return this.f79130a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79130a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/ui/flow/AirPaymentTransferFlowContract$TransferInput$PeerToPeer;", "Lcom/revolut/feature/payments/air/widget/impl/ui/flow/AirPaymentTransferFlowContract$TransferInput;", "", "toString", "()Ljava/lang/String;", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PeerToPeer implements AirPaymentTransferFlowContract$TransferInput {

        @NotNull
        public static final Parcelable.Creator<PeerToPeer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PeerToPeerTransferInputData f79131a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PeerToPeer((PeerToPeerTransferInputData) parcel.readParcelable(PeerToPeer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PeerToPeer[i];
            }
        }

        public PeerToPeer(PeerToPeerTransferInputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f79131a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PeerToPeer) && Intrinsics.f(this.f79131a, ((PeerToPeer) obj2).f79131a);
        }

        public final int hashCode() {
            return this.f79131a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79131a, i);
        }
    }
}
