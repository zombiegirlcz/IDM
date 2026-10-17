package com.revolut.retail.feature.trading_onboarding.impl.ui.riskwarning;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/revolut/retail/feature/trading_onboarding/impl/ui/riskwarning/RiskWarningContract$Destination", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RiskWarningContract$Destination extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<RiskWarningContract$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingOnboardingFeatureConfig f104278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NaviCommand f104279c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RiskWarningContract$Destination((TradingOnboardingFeatureConfig) parcel.readParcelable(RiskWarningContract$Destination.class.getClassLoader()), (NaviCommand) parcel.readParcelable(RiskWarningContract$Destination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RiskWarningContract$Destination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiskWarningContract$Destination(TradingOnboardingFeatureConfig onboardingLaunchingConfig, NaviCommand naviCommand) {
        super(IOData$EmptyInput.f98299a);
        Intrinsics.checkNotNullParameter(onboardingLaunchingConfig, "onboardingLaunchingConfig");
        this.f104278b = onboardingLaunchingConfig;
        this.f104279c = naviCommand;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RiskWarningContract$Destination)) {
            return false;
        }
        RiskWarningContract$Destination riskWarningContract$Destination = (RiskWarningContract$Destination) obj2;
        return Intrinsics.f(this.f104278b, riskWarningContract$Destination.f104278b) && Intrinsics.f(this.f104279c, riskWarningContract$Destination.f104279c);
    }

    public final int hashCode() {
        int iHashCode = this.f104278b.hashCode() * 31;
        NaviCommand naviCommand = this.f104279c;
        return iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f104278b, i);
        dest.writeParcelable(this.f104279c, i);
    }
}
