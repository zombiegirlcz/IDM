package com.revolut.retail.feature.trading_onboarding.impl.ui.cfd_onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/cfd_onboarding/CfdOnboardingDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CfdOnboardingDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CfdOnboardingDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsProduct f104143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NaviCommand f104144b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CfdOnboardingDestination((AnalyticsProduct) parcel.readParcelable(CfdOnboardingDestination.class.getClassLoader()), (NaviCommand) parcel.readParcelable(CfdOnboardingDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CfdOnboardingDestination[i];
        }
    }

    public CfdOnboardingDestination(AnalyticsProduct analyticsProduct, NaviCommand naviCommand) {
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f104143a = analyticsProduct;
        this.f104144b = naviCommand;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CfdOnboardingDestination)) {
            return false;
        }
        CfdOnboardingDestination cfdOnboardingDestination = (CfdOnboardingDestination) obj2;
        return Intrinsics.f(this.f104143a, cfdOnboardingDestination.f104143a) && Intrinsics.f(this.f104144b, cfdOnboardingDestination.f104144b);
    }

    public final int hashCode() {
        int iHashCode = this.f104143a.hashCode() * 31;
        NaviCommand naviCommand = this.f104144b;
        return iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f104143a, i);
        dest.writeParcelable(this.f104144b, i);
    }
}
