package com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.nationalities_screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/trading_onboarding/impl/ui/kyc_details_nationality/nationalities_screen/NationalitiesScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NationalitiesScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<NationalitiesScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingOnboardingFeatureConfig f104203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f104204b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NationalitiesScreenContract$InputData((TradingOnboardingFeatureConfig) parcel.readParcelable(NationalitiesScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NationalitiesScreenContract$InputData[i];
        }
    }

    public NationalitiesScreenContract$InputData(TradingOnboardingFeatureConfig onboardingLaunchingConfig, boolean z) {
        Intrinsics.checkNotNullParameter(onboardingLaunchingConfig, "onboardingLaunchingConfig");
        this.f104203a = onboardingLaunchingConfig;
        this.f104204b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NationalitiesScreenContract$InputData)) {
            return false;
        }
        NationalitiesScreenContract$InputData nationalitiesScreenContract$InputData = (NationalitiesScreenContract$InputData) obj2;
        return Intrinsics.f(this.f104203a, nationalitiesScreenContract$InputData.f104203a) && this.f104204b == nationalitiesScreenContract$InputData.f104204b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104204b) + (this.f104203a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f104203a, i);
        dest.writeInt(this.f104204b ? 1 : 0);
    }
}
