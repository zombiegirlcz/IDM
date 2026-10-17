package com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.backend_flow.ui.BackendFlowContract$Configuration;
import com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart;
import com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPartType;
import com.revolut.retail.feature.trading_onboarding.api.navigation.RemediationType;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/trading_onboarding/impl/ui/onboarding_backend_flow/TradingOnboardingBackendFlowContract$Configuration", "Landroid/os/Parcelable;", "Regular", "W8BEN", "Lcom/revolut/retail/feature/trading_onboarding/impl/ui/onboarding_backend_flow/TradingOnboardingBackendFlowContract$Configuration$Regular;", "Lcom/revolut/retail/feature/trading_onboarding/impl/ui/onboarding_backend_flow/TradingOnboardingBackendFlowContract$Configuration$W8BEN;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TradingOnboardingBackendFlowContract$Configuration extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/onboarding_backend_flow/TradingOnboardingBackendFlowContract$Configuration$Regular;", "Lcom/revolut/retail/feature/trading_onboarding/impl/ui/onboarding_backend_flow/TradingOnboardingBackendFlowContract$Configuration;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Regular implements TradingOnboardingBackendFlowContract$Configuration {

        @NotNull
        public static final Parcelable.Creator<Regular> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TradingOnboardingFeatureConfig f104224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OnboardingPart f104225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BackendFlowContract$Configuration f104226c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Regular((TradingOnboardingFeatureConfig) parcel.readParcelable(Regular.class.getClassLoader()), (OnboardingPart) parcel.readParcelable(Regular.class.getClassLoader()), (BackendFlowContract$Configuration) parcel.readParcelable(Regular.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Regular[i];
            }
        }

        public Regular(TradingOnboardingFeatureConfig onboardingLaunchingConfig, OnboardingPart currentOnboardingPart, BackendFlowContract$Configuration baseConfiguration, boolean z) {
            Intrinsics.checkNotNullParameter(onboardingLaunchingConfig, "onboardingLaunchingConfig");
            Intrinsics.checkNotNullParameter(currentOnboardingPart, "currentOnboardingPart");
            Intrinsics.checkNotNullParameter(baseConfiguration, "baseConfiguration");
            this.f104224a = onboardingLaunchingConfig;
            this.f104225b = currentOnboardingPart;
            this.f104226c = baseConfiguration;
            this.d = z;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Configuration
        public final RemediationType H0() {
            return this.f104224a.getD();
        }

        @Override // com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Configuration
        /* JADX INFO: renamed from: S */
        public final String getF104227a() {
            return this.f104224a.getF104120b();
        }

        @Override // com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Configuration
        public final boolean V9() {
            OnboardingPartType onboardingPartTypeN4 = this.f104225b.n4();
            OnboardingPartType.BackendDriven backendDriven = onboardingPartTypeN4 instanceof OnboardingPartType.BackendDriven ? (OnboardingPartType.BackendDriven) onboardingPartTypeN4 : null;
            if (backendDriven != null) {
                return backendDriven.f104093a;
            }
            return false;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Configuration
        /* JADX INFO: renamed from: Y4, reason: from getter */
        public final OnboardingPart getF104225b() {
            return this.f104225b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Regular)) {
                return false;
            }
            Regular regular = (Regular) obj2;
            return Intrinsics.f(this.f104224a, regular.f104224a) && Intrinsics.f(this.f104225b, regular.f104225b) && Intrinsics.f(this.f104226c, regular.f104226c) && this.d == regular.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.f104226c.hashCode() + ((this.f104225b.hashCode() + (this.f104224a.hashCode() * 31)) * 31)) * 31);
        }

        @Override // com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Configuration
        /* JADX INFO: renamed from: t8, reason: from getter */
        public final BackendFlowContract$Configuration getF104226c() {
            return this.f104226c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f104224a, i);
            dest.writeParcelable(this.f104225b, i);
            dest.writeParcelable(this.f104226c, i);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/onboarding_backend_flow/TradingOnboardingBackendFlowContract$Configuration$W8BEN;", "Lcom/revolut/retail/feature/trading_onboarding/impl/ui/onboarding_backend_flow/TradingOnboardingBackendFlowContract$Configuration;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class W8BEN implements TradingOnboardingBackendFlowContract$Configuration {

        @NotNull
        public static final Parcelable.Creator<W8BEN> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f104228b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new W8BEN(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new W8BEN[i];
            }
        }

        public W8BEN(String accountIdentifier, boolean z) {
            Intrinsics.checkNotNullParameter(accountIdentifier, "accountIdentifier");
            this.f104227a = accountIdentifier;
            this.f104228b = z;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Configuration
        public final RemediationType H0() {
            return null;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Configuration
        /* JADX INFO: renamed from: S, reason: from getter */
        public final String getF104227a() {
            return this.f104227a;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Configuration
        public final boolean V9() {
            return ((OnboardingPartType.BackendDriven) OnboardingPart.W8BEN.f104091a.n4()).f104093a;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Configuration
        /* JADX INFO: renamed from: Y4 */
        public final OnboardingPart getF104225b() {
            return OnboardingPart.W8BEN.f104091a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof W8BEN)) {
                return false;
            }
            W8BEN w8ben = (W8BEN) obj2;
            return Intrinsics.f(this.f104227a, w8ben.f104227a) && this.f104228b == w8ben.f104228b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f104228b) + (this.f104227a.hashCode() * 31);
        }

        @Override // com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Configuration
        /* JADX INFO: renamed from: t8 */
        public final BackendFlowContract$Configuration getF104226c() {
            return new BackendFlowContract$Configuration(30, null, "TRADING_ONBOARDING_W8BEN_FLOW");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104227a);
            dest.writeInt(this.f104228b ? 1 : 0);
        }
    }

    RemediationType H0();

    /* JADX INFO: renamed from: S */
    String getF104227a();

    boolean V9();

    /* JADX INFO: renamed from: Y4 */
    OnboardingPart getF104225b();

    /* JADX INFO: renamed from: t8 */
    BackendFlowContract$Configuration getF104226c();
}
