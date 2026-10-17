package com.revolut.retail.feature.trading_onboarding.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingExtendedHoursOnboardingFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TradingExtendedHoursOnboardingFeatureConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<TradingExtendedHoursOnboardingFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NaviCommand f104104b;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TradingExtendedHoursOnboardingFeatureConfig((NaviCommand) parcel.readParcelable(TradingExtendedHoursOnboardingFeatureConfig.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TradingExtendedHoursOnboardingFeatureConfig[i];
        }
    }

    public TradingExtendedHoursOnboardingFeatureConfig(NaviCommand naviCommand, String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f104103a = portfolioId;
        this.f104104b = naviCommand;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TradingExtendedHoursOnboardingFeatureConfig)) {
            return false;
        }
        TradingExtendedHoursOnboardingFeatureConfig tradingExtendedHoursOnboardingFeatureConfig = (TradingExtendedHoursOnboardingFeatureConfig) obj2;
        return Intrinsics.f(this.f104103a, tradingExtendedHoursOnboardingFeatureConfig.f104103a) && Intrinsics.f(this.f104104b, tradingExtendedHoursOnboardingFeatureConfig.f104104b);
    }

    public final int hashCode() {
        int iHashCode = this.f104103a.hashCode() * 31;
        NaviCommand naviCommand = this.f104104b;
        return iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104103a);
        dest.writeParcelable(this.f104104b, i);
    }
}
