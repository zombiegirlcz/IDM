package com.revolut.feature.crypto.withdraw.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoAddBeneficiaryBridgeFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoAddBeneficiaryBridgeFeatureConfig extends KompotBridgeFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<CryptoAddBeneficiaryBridgeFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CryptoAddBeneficiaryInput f71118g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoAddBeneficiaryBridgeFeatureConfig((CryptoAddBeneficiaryInput) parcel.readParcelable(CryptoAddBeneficiaryBridgeFeatureConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoAddBeneficiaryBridgeFeatureConfig[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoAddBeneficiaryBridgeFeatureConfig(CryptoAddBeneficiaryInput input) {
        super((ActivityAnimation) null, (ParcelableDestination) new CryptoAddBeneficiaryDestination(input), false, input.getF71130c(), 0, 53);
        Intrinsics.checkNotNullParameter(input, "input");
        this.f71118g = input;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CryptoAddBeneficiaryBridgeFeatureConfig) && Intrinsics.f(this.f71118g, ((CryptoAddBeneficiaryBridgeFeatureConfig) obj2).f71118g);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        return this.f71118g.hashCode();
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f71118g, i);
    }
}
