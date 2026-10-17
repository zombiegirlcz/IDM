package com.revolut.feature.credit.application.plugins.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.api.models.IntendedPricingPlan;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CreditCardPostOnboarding$NavigationDestination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditApplicationKompotFeatureConfig$CreditCardPostOnboarding$NavigationDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CreditApplicationKompotFeatureConfig$CreditCardPostOnboarding$NavigationDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntendedPricingPlan f66609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dt3.a f66610b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditApplicationKompotFeatureConfig$CreditCardPostOnboarding$NavigationDestination((IntendedPricingPlan) parcel.readParcelable(CreditApplicationKompotFeatureConfig$CreditCardPostOnboarding$NavigationDestination.class.getClassLoader()), (dt3.a) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditApplicationKompotFeatureConfig$CreditCardPostOnboarding$NavigationDestination[i];
        }
    }

    public CreditApplicationKompotFeatureConfig$CreditCardPostOnboarding$NavigationDestination(IntendedPricingPlan intendedPricingPlan, dt3.a creditCardPostRetailOnboarding) {
        Intrinsics.checkNotNullParameter(intendedPricingPlan, "intendedPricingPlan");
        Intrinsics.checkNotNullParameter(creditCardPostRetailOnboarding, "creditCardPostRetailOnboarding");
        this.f66609a = intendedPricingPlan;
        this.f66610b = creditCardPostRetailOnboarding;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditApplicationKompotFeatureConfig$CreditCardPostOnboarding$NavigationDestination)) {
            return false;
        }
        CreditApplicationKompotFeatureConfig$CreditCardPostOnboarding$NavigationDestination creditApplicationKompotFeatureConfig$CreditCardPostOnboarding$NavigationDestination = (CreditApplicationKompotFeatureConfig$CreditCardPostOnboarding$NavigationDestination) obj2;
        return Intrinsics.f(this.f66609a, creditApplicationKompotFeatureConfig$CreditCardPostOnboarding$NavigationDestination.f66609a) && Intrinsics.f(this.f66610b, creditApplicationKompotFeatureConfig$CreditCardPostOnboarding$NavigationDestination.f66610b);
    }

    public final int hashCode() {
        return this.f66610b.hashCode() + (this.f66609a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f66609a, i);
        dest.writeSerializable(this.f66610b);
    }
}
