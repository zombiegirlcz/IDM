package com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/revolut/retail/feature/trading_onboarding/impl/ui/kyc_details_nationality/KycDetailsNationalityContract$KycDetailsNationalityDestination", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/retail/feature/trading_onboarding/impl/ui/kyc_details_nationality/KycDetailsNationalityContract$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class KycDetailsNationalityContract$KycDetailsNationalityDestination extends InternalDestination<KycDetailsNationalityContract$InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<KycDetailsNationalityContract$KycDetailsNationalityDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingOnboardingFeatureConfig f104189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f104190c;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new KycDetailsNationalityContract$KycDetailsNationalityDestination((TradingOnboardingFeatureConfig) parcel.readParcelable(KycDetailsNationalityContract$KycDetailsNationalityDestination.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new KycDetailsNationalityContract$KycDetailsNationalityDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycDetailsNationalityContract$KycDetailsNationalityDestination(TradingOnboardingFeatureConfig onboardingLaunchingConfig, boolean z) {
        super(new KycDetailsNationalityContract$InputData(onboardingLaunchingConfig, z));
        Intrinsics.checkNotNullParameter(onboardingLaunchingConfig, "onboardingLaunchingConfig");
        this.f104189b = onboardingLaunchingConfig;
        this.f104190c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof KycDetailsNationalityContract$KycDetailsNationalityDestination)) {
            return false;
        }
        KycDetailsNationalityContract$KycDetailsNationalityDestination kycDetailsNationalityContract$KycDetailsNationalityDestination = (KycDetailsNationalityContract$KycDetailsNationalityDestination) obj2;
        return Intrinsics.f(this.f104189b, kycDetailsNationalityContract$KycDetailsNationalityDestination.f104189b) && this.f104190c == kycDetailsNationalityContract$KycDetailsNationalityDestination.f104190c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104190c) + (this.f104189b.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f104189b, i);
        dest.writeInt(this.f104190c ? 1 : 0);
    }
}
