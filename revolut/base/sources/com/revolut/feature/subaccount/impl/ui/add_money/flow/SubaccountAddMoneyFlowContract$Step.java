package com.revolut.feature.subaccount.impl.ui.add_money.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.vaults.api.navigation.VaultsKompotFeatureConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/subaccount/impl/ui/add_money/flow/SubaccountAddMoneyFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "MoveMoney", "VaultAddMoney", "Lcom/revolut/feature/subaccount/impl/ui/add_money/flow/SubaccountAddMoneyFlowContract$Step$MoveMoney;", "Lcom/revolut/feature/subaccount/impl/ui/add_money/flow/SubaccountAddMoneyFlowContract$Step$VaultAddMoney;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SubaccountAddMoneyFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/add_money/flow/SubaccountAddMoneyFlowContract$Step$MoveMoney;", "Lcom/revolut/feature/subaccount/impl/ui/add_money/flow/SubaccountAddMoneyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoveMoney extends SubaccountAddMoneyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MoveMoney> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoveMoneyInputData f88987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Subaccount f88988b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MoveMoney((MoveMoneyInputData) parcel.readParcelable(MoveMoney.class.getClassLoader()), (Subaccount) parcel.readParcelable(MoveMoney.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoney[i];
            }
        }

        public MoveMoney(MoveMoneyInputData inputData, Subaccount subaccount) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            Intrinsics.checkNotNullParameter(subaccount, "subaccount");
            this.f88987a = inputData;
            this.f88988b = subaccount;
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
            return Intrinsics.f(this.f88987a, moveMoney.f88987a) && Intrinsics.f(this.f88988b, moveMoney.f88988b);
        }

        public final int hashCode() {
            return this.f88988b.hashCode() + (this.f88987a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f88987a, i);
            dest.writeParcelable(this.f88988b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/add_money/flow/SubaccountAddMoneyFlowContract$Step$VaultAddMoney;", "Lcom/revolut/feature/subaccount/impl/ui/add_money/flow/SubaccountAddMoneyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VaultAddMoney extends SubaccountAddMoneyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<VaultAddMoney> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VaultsKompotFeatureConfig.AddMoney.Destination f88989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Subaccount f88990b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VaultAddMoney((VaultsKompotFeatureConfig.AddMoney.Destination) parcel.readParcelable(VaultAddMoney.class.getClassLoader()), (Subaccount) parcel.readParcelable(VaultAddMoney.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VaultAddMoney[i];
            }
        }

        public VaultAddMoney(VaultsKompotFeatureConfig.AddMoney.Destination destination, Subaccount subaccount) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intrinsics.checkNotNullParameter(subaccount, "subaccount");
            this.f88989a = destination;
            this.f88990b = subaccount;
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
            return Intrinsics.f(this.f88989a, vaultAddMoney.f88989a) && Intrinsics.f(this.f88990b, vaultAddMoney.f88990b);
        }

        public final int hashCode() {
            return this.f88990b.hashCode() + (this.f88989a.f94716a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f88989a, i);
            dest.writeParcelable(this.f88990b, i);
        }
    }

    private SubaccountAddMoneyFlowContract$Step() {
    }
}
