package com.revolut.feature.wealth.ui.impl.transfer_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/wealth/ui/impl/transfer_picker/WealthTransferPickerControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CashHoldingDeactivatedBorrowedFundsExplanation", "Lcom/revolut/feature/wealth/ui/impl/transfer_picker/WealthTransferPickerControllerContract$ModalStep$CashHoldingDeactivatedBorrowedFundsExplanation;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WealthTransferPickerControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/transfer_picker/WealthTransferPickerControllerContract$ModalStep$CashHoldingDeactivatedBorrowedFundsExplanation;", "Lcom/revolut/feature/wealth/ui/impl/transfer_picker/WealthTransferPickerControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CashHoldingDeactivatedBorrowedFundsExplanation implements WealthTransferPickerControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CashHoldingDeactivatedBorrowedFundsExplanation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f96059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xi0.b f96060b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CashHoldingDeactivatedBorrowedFundsExplanation((xi0.b) parcel.readSerializable(), (xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CashHoldingDeactivatedBorrowedFundsExplanation[i];
            }
        }

        public CashHoldingDeactivatedBorrowedFundsExplanation(xi0.b currentCashHoldingCurrency, xi0.b availableToUseCashHoldingCurrency) {
            Intrinsics.checkNotNullParameter(currentCashHoldingCurrency, "currentCashHoldingCurrency");
            Intrinsics.checkNotNullParameter(availableToUseCashHoldingCurrency, "availableToUseCashHoldingCurrency");
            this.f96059a = currentCashHoldingCurrency;
            this.f96060b = availableToUseCashHoldingCurrency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CashHoldingDeactivatedBorrowedFundsExplanation)) {
                return false;
            }
            CashHoldingDeactivatedBorrowedFundsExplanation cashHoldingDeactivatedBorrowedFundsExplanation = (CashHoldingDeactivatedBorrowedFundsExplanation) obj2;
            return Intrinsics.f(this.f96059a, cashHoldingDeactivatedBorrowedFundsExplanation.f96059a) && Intrinsics.f(this.f96060b, cashHoldingDeactivatedBorrowedFundsExplanation.f96060b);
        }

        public final int hashCode() {
            return this.f96060b.hashCode() + (this.f96059a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f96059a);
            dest.writeSerializable(this.f96060b);
        }
    }
}
