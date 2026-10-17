package com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.asset.details.api.dialog.StakingRewardsDialogDescriptor$Type;
import com.revolut.feature.staking.api.model.StakingModes;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.tierrate.v2.TiersRateItemMapper$Parcel;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/crypto/asset_details/impl/ui/screens/earning/v2/CryptoEarningScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "StakeRisksDisclaimerDialog", "TiersRateDialog", "StakingRewardsDialog", "StakingLockedBalancesDialog", "UnstakingPeriodDisclaimerDialog", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/earning/v2/CryptoEarningScreenContract$ModalStep$StakeRisksDisclaimerDialog;", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/earning/v2/CryptoEarningScreenContract$ModalStep$StakingLockedBalancesDialog;", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/earning/v2/CryptoEarningScreenContract$ModalStep$StakingRewardsDialog;", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/earning/v2/CryptoEarningScreenContract$ModalStep$TiersRateDialog;", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/earning/v2/CryptoEarningScreenContract$ModalStep$UnstakingPeriodDisclaimerDialog;", "feature_crypto_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoEarningScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/earning/v2/CryptoEarningScreenContract$ModalStep$StakeRisksDisclaimerDialog;", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/earning/v2/CryptoEarningScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StakeRisksDisclaimerDialog implements CryptoEarningScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<StakeRisksDisclaimerDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StakingModes.StakingMode f99984a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StakeRisksDisclaimerDialog((StakingModes.StakingMode) parcel.readParcelable(StakeRisksDisclaimerDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StakeRisksDisclaimerDialog[i];
            }
        }

        public StakeRisksDisclaimerDialog(StakingModes.StakingMode stakingMode) {
            Intrinsics.checkNotNullParameter(stakingMode, "stakingMode");
            this.f99984a = stakingMode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StakeRisksDisclaimerDialog) && Intrinsics.f(this.f99984a, ((StakeRisksDisclaimerDialog) obj2).f99984a);
        }

        public final int hashCode() {
            return this.f99984a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f99984a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/earning/v2/CryptoEarningScreenContract$ModalStep$StakingLockedBalancesDialog;", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/earning/v2/CryptoEarningScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StakingLockedBalancesDialog implements CryptoEarningScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<StakingLockedBalancesDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StakingPocket f99985a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StakingLockedBalancesDialog((StakingPocket) parcel.readParcelable(StakingLockedBalancesDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StakingLockedBalancesDialog[i];
            }
        }

        public StakingLockedBalancesDialog(StakingPocket stakingPocket) {
            Intrinsics.checkNotNullParameter(stakingPocket, "stakingPocket");
            this.f99985a = stakingPocket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StakingLockedBalancesDialog) && Intrinsics.f(this.f99985a, ((StakingLockedBalancesDialog) obj2).f99985a);
        }

        public final int hashCode() {
            return this.f99985a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f99985a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/earning/v2/CryptoEarningScreenContract$ModalStep$StakingRewardsDialog;", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/earning/v2/CryptoEarningScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StakingRewardsDialog implements CryptoEarningScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<StakingRewardsDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StakingRewardsDialogDescriptor$Type f99986a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StakingRewardsDialog((StakingRewardsDialogDescriptor$Type) parcel.readParcelable(StakingRewardsDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StakingRewardsDialog[i];
            }
        }

        public StakingRewardsDialog(StakingRewardsDialogDescriptor$Type type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f99986a = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StakingRewardsDialog) && Intrinsics.f(this.f99986a, ((StakingRewardsDialog) obj2).f99986a);
        }

        public final int hashCode() {
            return this.f99986a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f99986a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/earning/v2/CryptoEarningScreenContract$ModalStep$TiersRateDialog;", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/earning/v2/CryptoEarningScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TiersRateDialog implements CryptoEarningScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TiersRateDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TiersRateItemMapper$Parcel f99987a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TiersRateDialog((TiersRateItemMapper$Parcel) parcel.readParcelable(TiersRateDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TiersRateDialog[i];
            }
        }

        public TiersRateDialog(TiersRateItemMapper$Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            this.f99987a = parcel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TiersRateDialog) && Intrinsics.f(this.f99987a, ((TiersRateDialog) obj2).f99987a);
        }

        public final int hashCode() {
            return this.f99987a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f99987a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/earning/v2/CryptoEarningScreenContract$ModalStep$UnstakingPeriodDisclaimerDialog;", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/earning/v2/CryptoEarningScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnstakingPeriodDisclaimerDialog implements CryptoEarningScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<UnstakingPeriodDisclaimerDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StakingPocket f99988a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnstakingPeriodDisclaimerDialog((StakingPocket) parcel.readParcelable(UnstakingPeriodDisclaimerDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnstakingPeriodDisclaimerDialog[i];
            }
        }

        public UnstakingPeriodDisclaimerDialog(StakingPocket stakingPocket) {
            Intrinsics.checkNotNullParameter(stakingPocket, "stakingPocket");
            this.f99988a = stakingPocket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UnstakingPeriodDisclaimerDialog) && Intrinsics.f(this.f99988a, ((UnstakingPeriodDisclaimerDialog) obj2).f99988a);
        }

        public final int hashCode() {
            return this.f99988a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f99988a, i);
        }
    }
}
