package com.revolut.feature.retail.savings.impl.ui.add_money;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.vaults.api.navigation.VaultsKompotFeatureConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/retail/savings/impl/ui/add_money/SavingsAddMoneyFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "MoveMoney", "VaultAddMoney", "RetailTopUp", "Lcom/revolut/feature/retail/savings/impl/ui/add_money/SavingsAddMoneyFlowContract$Step$MoveMoney;", "Lcom/revolut/feature/retail/savings/impl/ui/add_money/SavingsAddMoneyFlowContract$Step$RetailTopUp;", "Lcom/revolut/feature/retail/savings/impl/ui/add_money/SavingsAddMoneyFlowContract$Step$VaultAddMoney;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SavingsAddMoneyFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/ui/add_money/SavingsAddMoneyFlowContract$Step$MoveMoney;", "Lcom/revolut/feature/retail/savings/impl/ui/add_money/SavingsAddMoneyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoveMoney extends SavingsAddMoneyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MoveMoney> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoveMoneyInputData f83347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f83348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f83349c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MoveMoney((MoveMoneyInputData) parcel.readParcelable(MoveMoney.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoney[i];
            }
        }

        public MoveMoney(MoveMoneyInputData inputData, boolean z, String savingsAccountId) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            Intrinsics.checkNotNullParameter(savingsAccountId, "savingsAccountId");
            this.f83347a = inputData;
            this.f83348b = z;
            this.f83349c = savingsAccountId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MoveMoney)) {
                return false;
            }
            MoveMoney moveMoney = (MoveMoney) obj2;
            return Intrinsics.f(this.f83347a, moveMoney.f83347a) && this.f83348b == moveMoney.f83348b && Intrinsics.f(this.f83349c, moveMoney.f83349c);
        }

        public final int hashCode() {
            return this.f83349c.hashCode() + j6.a.c(this.f83347a.hashCode() * 31, 31, this.f83348b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83347a, i);
            dest.writeInt(this.f83348b ? 1 : 0);
            dest.writeString(this.f83349c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/ui/add_money/SavingsAddMoneyFlowContract$Step$RetailTopUp;", "Lcom/revolut/feature/retail/savings/impl/ui/add_money/SavingsAddMoneyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RetailTopUp extends SavingsAddMoneyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RetailTopUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopUpConfig f83350a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RetailTopUp((TopUpConfig) parcel.readParcelable(RetailTopUp.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RetailTopUp[i];
            }
        }

        public RetailTopUp(TopUpConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f83350a = config;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RetailTopUp) && Intrinsics.f(this.f83350a, ((RetailTopUp) obj2).f83350a);
        }

        public final int hashCode() {
            return this.f83350a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83350a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/ui/add_money/SavingsAddMoneyFlowContract$Step$VaultAddMoney;", "Lcom/revolut/feature/retail/savings/impl/ui/add_money/SavingsAddMoneyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VaultAddMoney extends SavingsAddMoneyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<VaultAddMoney> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VaultsKompotFeatureConfig.AddMoney.Destination f83351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f83352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f83353c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VaultAddMoney((VaultsKompotFeatureConfig.AddMoney.Destination) parcel.readParcelable(VaultAddMoney.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VaultAddMoney[i];
            }
        }

        public VaultAddMoney(VaultsKompotFeatureConfig.AddMoney.Destination destination, boolean z, String savingsAccountId) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intrinsics.checkNotNullParameter(savingsAccountId, "savingsAccountId");
            this.f83351a = destination;
            this.f83352b = z;
            this.f83353c = savingsAccountId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof VaultAddMoney)) {
                return false;
            }
            VaultAddMoney vaultAddMoney = (VaultAddMoney) obj2;
            return Intrinsics.f(this.f83351a, vaultAddMoney.f83351a) && this.f83352b == vaultAddMoney.f83352b && Intrinsics.f(this.f83353c, vaultAddMoney.f83353c);
        }

        public final int hashCode() {
            return this.f83353c.hashCode() + j6.a.c(this.f83351a.f94716a.hashCode() * 31, 31, this.f83352b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83351a, i);
            dest.writeInt(this.f83352b ? 1 : 0);
            dest.writeString(this.f83353c);
        }
    }

    private SavingsAddMoneyFlowContract$Step() {
    }
}
