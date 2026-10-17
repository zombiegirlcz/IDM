package com.revolut.retail.feature.trading_onboarding.impl.ui.helper_next;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/trading_onboarding/impl/ui/helper_next/NextContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NextContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NextContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnboardingPart f104174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingOnboardingFeatureConfig f104175b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NextContract$Configuration((OnboardingPart) parcel.readParcelable(NextContract$Configuration.class.getClassLoader()), (TradingOnboardingFeatureConfig) parcel.readParcelable(NextContract$Configuration.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NextContract$Configuration[i];
        }
    }

    public NextContract$Configuration(OnboardingPart currentOnboardingPart, TradingOnboardingFeatureConfig onboardingLaunchingConfig) {
        Intrinsics.checkNotNullParameter(currentOnboardingPart, "currentOnboardingPart");
        Intrinsics.checkNotNullParameter(onboardingLaunchingConfig, "onboardingLaunchingConfig");
        this.f104174a = currentOnboardingPart;
        this.f104175b = onboardingLaunchingConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NextContract$Configuration)) {
            return false;
        }
        NextContract$Configuration nextContract$Configuration = (NextContract$Configuration) obj2;
        return Intrinsics.f(this.f104174a, nextContract$Configuration.f104174a) && Intrinsics.f(this.f104175b, nextContract$Configuration.f104175b);
    }

    public final int hashCode() {
        return this.f104175b.hashCode() + (this.f104174a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f104174a, i);
        dest.writeParcelable(this.f104175b, i);
    }
}
