package com.revolut.feature.wealth.impl.ui.flows.dual_add_money;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/wealth/impl/ui/flows/dual_add_money/DualAddMoneyFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CreateOneOffDeposit", "OfferSetupRecurringDepositDialog", "CreateOrUpdateRecurringDeposit", "Lcom/revolut/feature/wealth/impl/ui/flows/dual_add_money/DualAddMoneyFlowContract$Step$CreateOneOffDeposit;", "Lcom/revolut/feature/wealth/impl/ui/flows/dual_add_money/DualAddMoneyFlowContract$Step$CreateOrUpdateRecurringDeposit;", "Lcom/revolut/feature/wealth/impl/ui/flows/dual_add_money/DualAddMoneyFlowContract$Step$OfferSetupRecurringDepositDialog;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DualAddMoneyFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/flows/dual_add_money/DualAddMoneyFlowContract$Step$CreateOneOffDeposit;", "Lcom/revolut/feature/wealth/impl/ui/flows/dual_add_money/DualAddMoneyFlowContract$Step;", "<init>", "()V", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreateOneOffDeposit extends DualAddMoneyFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreateOneOffDeposit f95555a = new CreateOneOffDeposit();

        @NotNull
        public static final Parcelable.Creator<CreateOneOffDeposit> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreateOneOffDeposit.f95555a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateOneOffDeposit[i];
            }
        }

        private CreateOneOffDeposit() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/flows/dual_add_money/DualAddMoneyFlowContract$Step$CreateOrUpdateRecurringDeposit;", "Lcom/revolut/feature/wealth/impl/ui/flows/dual_add_money/DualAddMoneyFlowContract$Step;", "<init>", "()V", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreateOrUpdateRecurringDeposit extends DualAddMoneyFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreateOrUpdateRecurringDeposit f95556a = new CreateOrUpdateRecurringDeposit();

        @NotNull
        public static final Parcelable.Creator<CreateOrUpdateRecurringDeposit> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreateOrUpdateRecurringDeposit.f95556a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateOrUpdateRecurringDeposit[i];
            }
        }

        private CreateOrUpdateRecurringDeposit() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/flows/dual_add_money/DualAddMoneyFlowContract$Step$OfferSetupRecurringDepositDialog;", "Lcom/revolut/feature/wealth/impl/ui/flows/dual_add_money/DualAddMoneyFlowContract$Step;", "<init>", "()V", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OfferSetupRecurringDepositDialog extends DualAddMoneyFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OfferSetupRecurringDepositDialog f95557a = new OfferSetupRecurringDepositDialog();

        @NotNull
        public static final Parcelable.Creator<OfferSetupRecurringDepositDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OfferSetupRecurringDepositDialog.f95557a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OfferSetupRecurringDepositDialog[i];
            }
        }

        private OfferSetupRecurringDepositDialog() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private DualAddMoneyFlowContract$Step() {
    }
}
