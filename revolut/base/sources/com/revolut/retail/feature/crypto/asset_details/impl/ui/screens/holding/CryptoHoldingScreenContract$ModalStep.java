package com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.asset.details.api.dialog.StakingRewardsDialogDescriptor$Type;
import com.revolut.feature.staking.api.model.StakingModes;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.staking.api.tierrate.v2.TiersRateItemMapper$Parcel;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "StakeRisksDisclaimerDialog", "TiersRateDialog", "StakingRewardsDialog", "AutoStakingDisableConfirmationDialog", "EarningScreen", "BalanceBreakdown", "GiftAssetTransferInfo", "RevXOrdersBreakdown", "AutoEarnInfoDialog", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep$AutoEarnInfoDialog;", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep$AutoStakingDisableConfirmationDialog;", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep$BalanceBreakdown;", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep$EarningScreen;", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep$GiftAssetTransferInfo;", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep$RevXOrdersBreakdown;", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep$StakeRisksDisclaimerDialog;", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep$StakingRewardsDialog;", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep$TiersRateDialog;", "feature_crypto_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoHoldingScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep$AutoEarnInfoDialog;", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep;", "<init>", "()V", "feature_crypto_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AutoEarnInfoDialog implements CryptoHoldingScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AutoEarnInfoDialog f99998a = new AutoEarnInfoDialog();

        @NotNull
        public static final Parcelable.Creator<AutoEarnInfoDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AutoEarnInfoDialog.f99998a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutoEarnInfoDialog[i];
            }
        }

        private AutoEarnInfoDialog() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep$AutoStakingDisableConfirmationDialog;", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AutoStakingDisableConfirmationDialog implements CryptoHoldingScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AutoStakingDisableConfirmationDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StakingProduct f99999a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AutoStakingDisableConfirmationDialog((StakingProduct) parcel.readParcelable(AutoStakingDisableConfirmationDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutoStakingDisableConfirmationDialog[i];
            }
        }

        public AutoStakingDisableConfirmationDialog(StakingProduct stakingProduct) {
            Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
            this.f99999a = stakingProduct;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AutoStakingDisableConfirmationDialog) && Intrinsics.f(this.f99999a, ((AutoStakingDisableConfirmationDialog) obj2).f99999a);
        }

        public final int hashCode() {
            return this.f99999a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f99999a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep$BalanceBreakdown;", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BalanceBreakdown implements CryptoHoldingScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BalanceBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100000a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BalanceBreakdown(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BalanceBreakdown[i];
            }
        }

        public BalanceBreakdown(String currencyCode) {
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            this.f100000a = currencyCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BalanceBreakdown) && Intrinsics.f(this.f100000a, ((BalanceBreakdown) obj2).f100000a);
        }

        public final int hashCode() {
            return this.f100000a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100000a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep$EarningScreen;", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EarningScreen implements CryptoHoldingScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EarningScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StakingPocket f100001a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EarningScreen((StakingPocket) parcel.readParcelable(EarningScreen.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EarningScreen[i];
            }
        }

        public EarningScreen(StakingPocket stakingPocket) {
            Intrinsics.checkNotNullParameter(stakingPocket, "stakingPocket");
            this.f100001a = stakingPocket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EarningScreen) && Intrinsics.f(this.f100001a, ((EarningScreen) obj2).f100001a);
        }

        public final int hashCode() {
            return this.f100001a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100001a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep$GiftAssetTransferInfo;", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GiftAssetTransferInfo implements CryptoHoldingScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<GiftAssetTransferInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f100002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f100003b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GiftAssetTransferInfo((b) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiftAssetTransferInfo[i];
            }
        }

        public GiftAssetTransferInfo(b currency, boolean z) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f100002a = currency;
            this.f100003b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GiftAssetTransferInfo)) {
                return false;
            }
            GiftAssetTransferInfo giftAssetTransferInfo = (GiftAssetTransferInfo) obj2;
            return Intrinsics.f(this.f100002a, giftAssetTransferInfo.f100002a) && this.f100003b == giftAssetTransferInfo.f100003b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f100003b) + (this.f100002a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f100002a);
            dest.writeInt(this.f100003b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep$RevXOrdersBreakdown;", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevXOrdersBreakdown implements CryptoHoldingScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RevXOrdersBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100004a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevXOrdersBreakdown(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevXOrdersBreakdown[i];
            }
        }

        public RevXOrdersBreakdown(String currencyCode) {
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            this.f100004a = currencyCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevXOrdersBreakdown) && Intrinsics.f(this.f100004a, ((RevXOrdersBreakdown) obj2).f100004a);
        }

        public final int hashCode() {
            return this.f100004a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100004a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep$StakeRisksDisclaimerDialog;", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StakeRisksDisclaimerDialog implements CryptoHoldingScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<StakeRisksDisclaimerDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StakingModes.StakingMode f100005a;

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
            this.f100005a = stakingMode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StakeRisksDisclaimerDialog) && Intrinsics.f(this.f100005a, ((StakeRisksDisclaimerDialog) obj2).f100005a);
        }

        public final int hashCode() {
            return this.f100005a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100005a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep$StakingRewardsDialog;", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StakingRewardsDialog implements CryptoHoldingScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<StakingRewardsDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StakingRewardsDialogDescriptor$Type f100006a;

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
            this.f100006a = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StakingRewardsDialog) && Intrinsics.f(this.f100006a, ((StakingRewardsDialog) obj2).f100006a);
        }

        public final int hashCode() {
            return this.f100006a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100006a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep$TiersRateDialog;", "Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TiersRateDialog implements CryptoHoldingScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TiersRateDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TiersRateItemMapper$Parcel f100007a;

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
            this.f100007a = parcel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TiersRateDialog) && Intrinsics.f(this.f100007a, ((TiersRateDialog) obj2).f100007a);
        }

        public final int hashCode() {
            return this.f100007a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100007a, i);
        }
    }
}
