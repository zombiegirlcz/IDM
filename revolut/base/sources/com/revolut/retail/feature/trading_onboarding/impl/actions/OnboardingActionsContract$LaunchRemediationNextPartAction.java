package com.revolut.retail.feature.trading_onboarding.impl.actions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/retail/feature/trading_onboarding/impl/actions/OnboardingActionsContract$LaunchRemediationNextPartAction", "Lmm/a;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OnboardingActionsContract$LaunchRemediationNextPartAction implements mm.a, Parcelable {

    @NotNull
    public static final Parcelable.Creator<OnboardingActionsContract$LaunchRemediationNextPartAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnboardingPart f104123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingOnboardingFeatureConfig.TradingRemediationFeatureConfig f104124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f104125c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OnboardingActionsContract$LaunchRemediationNextPartAction((OnboardingPart) parcel.readParcelable(OnboardingActionsContract$LaunchRemediationNextPartAction.class.getClassLoader()), (TradingOnboardingFeatureConfig.TradingRemediationFeatureConfig) parcel.readParcelable(OnboardingActionsContract$LaunchRemediationNextPartAction.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OnboardingActionsContract$LaunchRemediationNextPartAction[i];
        }
    }

    public OnboardingActionsContract$LaunchRemediationNextPartAction(OnboardingPart onboardingPart, TradingOnboardingFeatureConfig.TradingRemediationFeatureConfig onboardingLaunchingConfig, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(onboardingLaunchingConfig, "onboardingLaunchingConfig");
        this.f104123a = onboardingPart;
        this.f104124b = onboardingLaunchingConfig;
        this.f104125c = z;
        this.d = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OnboardingActionsContract$LaunchRemediationNextPartAction)) {
            return false;
        }
        OnboardingActionsContract$LaunchRemediationNextPartAction onboardingActionsContract$LaunchRemediationNextPartAction = (OnboardingActionsContract$LaunchRemediationNextPartAction) obj2;
        return Intrinsics.f(this.f104123a, onboardingActionsContract$LaunchRemediationNextPartAction.f104123a) && Intrinsics.f(this.f104124b, onboardingActionsContract$LaunchRemediationNextPartAction.f104124b) && this.f104125c == onboardingActionsContract$LaunchRemediationNextPartAction.f104125c && this.d == onboardingActionsContract$LaunchRemediationNextPartAction.d;
    }

    public final int hashCode() {
        OnboardingPart onboardingPart = this.f104123a;
        return Boolean.hashCode(this.d) + j6.a.c((this.f104124b.hashCode() + ((onboardingPart == null ? 0 : onboardingPart.hashCode()) * 31)) * 31, 31, this.f104125c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f104123a, i);
        dest.writeParcelable(this.f104124b, i);
        dest.writeInt(this.f104125c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
    }
}
