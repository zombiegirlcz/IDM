package com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/wealth/impl/ui/screens/recurring_transfer_details/RecurringDepositDetailsViewControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "DeactivationDialog", "Lcom/revolut/feature/wealth/impl/ui/screens/recurring_transfer_details/RecurringDepositDetailsViewControllerContract$ModalStep$DeactivationDialog;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RecurringDepositDetailsViewControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/screens/recurring_transfer_details/RecurringDepositDetailsViewControllerContract$ModalStep$DeactivationDialog;", "Lcom/revolut/feature/wealth/impl/ui/screens/recurring_transfer_details/RecurringDepositDetailsViewControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeactivationDialog implements RecurringDepositDetailsViewControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DeactivationDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PortfolioRecurringOrder f95638a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeactivationDialog((PortfolioRecurringOrder) parcel.readParcelable(DeactivationDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeactivationDialog[i];
            }
        }

        public DeactivationDialog(PortfolioRecurringOrder recurringOrder) {
            Intrinsics.checkNotNullParameter(recurringOrder, "recurringOrder");
            this.f95638a = recurringOrder;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DeactivationDialog) && Intrinsics.f(this.f95638a, ((DeactivationDialog) obj2).f95638a);
        }

        public final int hashCode() {
            return this.f95638a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95638a, i);
        }
    }
}
