package com.revolut.retail.feature.crypto.asset_details.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.exchange.models.BuyFundingCurrencyPrefill;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/api/navigation/CryptoAssetDetailsFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "AssetDetails", "AssetDetailsDestination", "EarnDetails", "EarnDetailsDestination", "Lcom/revolut/retail/feature/crypto/asset_details/api/navigation/CryptoAssetDetailsFeatureConfig$AssetDetails;", "Lcom/revolut/retail/feature/crypto/asset_details/api/navigation/CryptoAssetDetailsFeatureConfig$EarnDetails;", "feature_crypto_asset_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CryptoAssetDetailsFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/api/navigation/CryptoAssetDetailsFeatureConfig$AssetDetails;", "Lcom/revolut/retail/feature/crypto/asset_details/api/navigation/CryptoAssetDetailsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_crypto_asset_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AssetDetails extends CryptoAssetDetailsFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<AssetDetails> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b f99933g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f99934h;
        public final BuyFundingCurrencyPrefill i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AssetDetails((b) parcel.readSerializable(), (ActivityAnimation) parcel.readParcelable(AssetDetails.class.getClassLoader()), (BuyFundingCurrencyPrefill) parcel.readParcelable(AssetDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AssetDetails[i];
            }
        }

        public /* synthetic */ AssetDetails(b bVar, BuyFundingCurrencyPrefill buyFundingCurrencyPrefill, int i) {
            this(bVar, (ActivityAnimation) null, (i & 4) != 0 ? null : buyFundingCurrencyPrefill);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF71979h() {
            return this.f99934h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AssetDetails)) {
                return false;
            }
            AssetDetails assetDetails = (AssetDetails) obj2;
            return Intrinsics.f(this.f99933g, assetDetails.f99933g) && Intrinsics.f(this.f99934h, assetDetails.f99934h) && Intrinsics.f(this.i, assetDetails.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f99933g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f99934h;
            int iHashCode2 = (iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode())) * 31;
            BuyFundingCurrencyPrefill buyFundingCurrencyPrefill = this.i;
            return iHashCode2 + (buyFundingCurrencyPrefill != null ? buyFundingCurrencyPrefill.hashCode() : 0);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99933g);
            dest.writeParcelable(this.f99934h, i);
            dest.writeParcelable(this.i, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AssetDetails(b currency, ActivityAnimation activityAnimation, BuyFundingCurrencyPrefill buyFundingCurrencyPrefill) {
            super(new AssetDetailsDestination(currency, buyFundingCurrencyPrefill, 2));
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f99933g = currency;
            this.f99934h = activityAnimation;
            this.i = buyFundingCurrencyPrefill;
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/api/navigation/CryptoAssetDetailsFeatureConfig$AssetDetailsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/retail/feature/crypto/asset_details/api/navigation/CryptoAssetDetailsFeatureConfig$AssetDetailsDestination$InputData;", "", "toString", "()Ljava/lang/String;", "InputData", "feature_crypto_asset_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AssetDetailsDestination extends InternalDestination<InputData> implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<AssetDetailsDestination> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f99935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f99936c;
        public final BuyFundingCurrencyPrefill d;

        /* JADX INFO: loaded from: classes11.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/api/navigation/CryptoAssetDetailsFeatureConfig$AssetDetailsDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_crypto_asset_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InputData implements IOData$Input {

            @NotNull
            public static final Parcelable.Creator<InputData> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f99937a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BuyFundingCurrencyPrefill f99938b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new InputData((b) parcel.readSerializable(), (BuyFundingCurrencyPrefill) parcel.readParcelable(InputData.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InputData[i];
                }
            }

            public InputData(b currency, BuyFundingCurrencyPrefill buyFundingCurrencyPrefill) {
                Intrinsics.checkNotNullParameter(currency, "currency");
                this.f99937a = currency;
                this.f99938b = buyFundingCurrencyPrefill;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof InputData)) {
                    return false;
                }
                InputData inputData = (InputData) obj2;
                return Intrinsics.f(this.f99937a, inputData.f99937a) && Intrinsics.f(this.f99938b, inputData.f99938b);
            }

            public final int hashCode() {
                int iHashCode = this.f99937a.hashCode() * 31;
                BuyFundingCurrencyPrefill buyFundingCurrencyPrefill = this.f99938b;
                return iHashCode + (buyFundingCurrencyPrefill == null ? 0 : buyFundingCurrencyPrefill.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f99937a);
                dest.writeParcelable(this.f99938b, i);
            }
        }

        /* JADX INFO: loaded from: classes11.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AssetDetailsDestination((b) parcel.readSerializable(), parcel.readInt() != 0, (BuyFundingCurrencyPrefill) parcel.readParcelable(AssetDetailsDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AssetDetailsDestination[i];
            }
        }

        public /* synthetic */ AssetDetailsDestination(b bVar, BuyFundingCurrencyPrefill buyFundingCurrencyPrefill, int i) {
            this(bVar, (i & 2) != 0, (i & 4) != 0 ? null : buyFundingCurrencyPrefill);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AssetDetailsDestination)) {
                return false;
            }
            AssetDetailsDestination assetDetailsDestination = (AssetDetailsDestination) obj2;
            return Intrinsics.f(this.f99935b, assetDetailsDestination.f99935b) && this.f99936c == assetDetailsDestination.f99936c && Intrinsics.f(this.d, assetDetailsDestination.d);
        }

        public final int hashCode() {
            int iC = j6.a.c(this.f99935b.hashCode() * 31, 31, this.f99936c);
            BuyFundingCurrencyPrefill buyFundingCurrencyPrefill = this.d;
            return iC + (buyFundingCurrencyPrefill == null ? 0 : buyFundingCurrencyPrefill.hashCode());
        }

        @Override // aii.d0
        /* JADX INFO: renamed from: n1, reason: from getter */
        public final boolean getF60859b() {
            return this.f99936c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99935b);
            dest.writeInt(this.f99936c ? 1 : 0);
            dest.writeParcelable(this.d, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AssetDetailsDestination(b currency, boolean z, BuyFundingCurrencyPrefill buyFundingCurrencyPrefill) {
            super(new InputData(currency, buyFundingCurrencyPrefill));
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f99935b = currency;
            this.f99936c = z;
            this.d = buyFundingCurrencyPrefill;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/api/navigation/CryptoAssetDetailsFeatureConfig$EarnDetails;", "Lcom/revolut/retail/feature/crypto/asset_details/api/navigation/CryptoAssetDetailsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_crypto_asset_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EarnDetails extends CryptoAssetDetailsFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<EarnDetails> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final StakingPocket f99939g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EarnDetails((StakingPocket) parcel.readParcelable(EarnDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EarnDetails[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EarnDetails(StakingPocket stakingPocket) {
            super(new EarnDetailsDestination(stakingPocket));
            Intrinsics.checkNotNullParameter(stakingPocket, "stakingPocket");
            this.f99939g = stakingPocket;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EarnDetails) && Intrinsics.f(this.f99939g, ((EarnDetails) obj2).f99939g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f99939g.hashCode();
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f99939g, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/api/navigation/CryptoAssetDetailsFeatureConfig$EarnDetailsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/retail/feature/crypto/asset_details/api/navigation/CryptoAssetDetailsFeatureConfig$EarnDetailsDestination$InputData;", "", "toString", "()Ljava/lang/String;", "InputData", "feature_crypto_asset_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EarnDetailsDestination extends InternalDestination<InputData> implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<EarnDetailsDestination> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final StakingPocket f99940b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/api/navigation/CryptoAssetDetailsFeatureConfig$EarnDetailsDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_crypto_asset_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InputData implements IOData$Input {

            @NotNull
            public static final Parcelable.Creator<InputData> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final StakingPocket f99941a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new InputData((StakingPocket) parcel.readParcelable(InputData.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InputData[i];
                }
            }

            public InputData(StakingPocket stakingPocket) {
                Intrinsics.checkNotNullParameter(stakingPocket, "stakingPocket");
                this.f99941a = stakingPocket;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof InputData) && Intrinsics.f(this.f99941a, ((InputData) obj2).f99941a);
            }

            public final int hashCode() {
                return this.f99941a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f99941a, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EarnDetailsDestination((StakingPocket) parcel.readParcelable(EarnDetailsDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EarnDetailsDestination[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EarnDetailsDestination(StakingPocket stakingPocket) {
            super(new InputData(stakingPocket));
            Intrinsics.checkNotNullParameter(stakingPocket, "stakingPocket");
            this.f99940b = stakingPocket;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final StakingPocket getF99940b() {
            return this.f99940b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EarnDetailsDestination) && Intrinsics.f(this.f99940b, ((EarnDetailsDestination) obj2).f99940b);
        }

        public final int hashCode() {
            return this.f99940b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f99940b, i);
        }
    }

    public CryptoAssetDetailsFeatureConfig(KompotDestination kompotDestination) {
        super((ActivityAnimation) null, (ParcelableDestination) kompotDestination, false, (Integer) null, 0, 60);
    }
}
