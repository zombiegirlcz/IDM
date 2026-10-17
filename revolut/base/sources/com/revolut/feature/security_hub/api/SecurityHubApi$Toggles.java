package com.revolut.feature.security_hub.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.abexperiments.models.ReleaseFlagExperiment;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class SecurityHubApi$Toggles {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubApi$Toggles$CardPaymentsWealthProtection;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CardPaymentsWealthProtection extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CardPaymentsWealthProtection f85366c = new CardPaymentsWealthProtection();

        @NotNull
        public static final Parcelable.Creator<CardPaymentsWealthProtection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CardPaymentsWealthProtection.f85366c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardPaymentsWealthProtection[i];
            }
        }

        private CardPaymentsWealthProtection() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("cardPaymentsWealthProtection");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubApi$Toggles$HiddenTransactionsNewScreen;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HiddenTransactionsNewScreen extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final HiddenTransactionsNewScreen f85367c = new HiddenTransactionsNewScreen();

        @NotNull
        public static final Parcelable.Creator<HiddenTransactionsNewScreen> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HiddenTransactionsNewScreen.f85367c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HiddenTransactionsNewScreen[i];
            }
        }

        private HiddenTransactionsNewScreen() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("hiddenTransactionsNewScreen");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubApi$Toggles$JointAccountLimitsHungary;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class JointAccountLimitsHungary extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final JointAccountLimitsHungary f85368c = new JointAccountLimitsHungary();
        public static final ReleaseFlagExperiment d = new ReleaseFlagExperiment("jointAccountLimitsHungary");

        @NotNull
        public static final Parcelable.Creator<JointAccountLimitsHungary> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return JointAccountLimitsHungary.f85368c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JointAccountLimitsHungary[i];
            }
        }

        private JointAccountLimitsHungary() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubApi$Toggles$SecurityLargeTransfers;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SecurityLargeTransfers extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final SecurityLargeTransfers f85369c = new SecurityLargeTransfers();
        public static final ReleaseFlagExperiment d = new ReleaseFlagExperiment("securityLargeTransfers");

        @NotNull
        public static final Parcelable.Creator<SecurityLargeTransfers> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SecurityLargeTransfers.f85369c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SecurityLargeTransfers[i];
            }
        }

        private SecurityLargeTransfers() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubApi$Toggles$StreetModeLocationLoader;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StreetModeLocationLoader extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final StreetModeLocationLoader f85370c = new StreetModeLocationLoader();
        public static final ReleaseFlagExperiment d = new ReleaseFlagExperiment("streetModeLocationLoader");

        @NotNull
        public static final Parcelable.Creator<StreetModeLocationLoader> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StreetModeLocationLoader.f85370c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StreetModeLocationLoader[i];
            }
        }

        private StreetModeLocationLoader() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubApi$Toggles$StreetModeWifi;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StreetModeWifi extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final StreetModeWifi f85371c = new StreetModeWifi();
        public static final ReleaseFlagExperiment d = new ReleaseFlagExperiment("streetModeWifi");

        @NotNull
        public static final Parcelable.Creator<StreetModeWifi> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StreetModeWifi.f85371c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StreetModeWifi[i];
            }
        }

        private StreetModeWifi() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubApi$Toggles$WealthProtectionSsoReauthAnimation;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WealthProtectionSsoReauthAnimation extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final WealthProtectionSsoReauthAnimation f85372c = new WealthProtectionSsoReauthAnimation();

        @NotNull
        public static final Parcelable.Creator<WealthProtectionSsoReauthAnimation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WealthProtectionSsoReauthAnimation.f85372c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WealthProtectionSsoReauthAnimation[i];
            }
        }

        private WealthProtectionSsoReauthAnimation() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("wealthProtectionSsoReauthAnimation");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private SecurityHubApi$Toggles() {
    }

    public static List a() {
        return v.k(StreetModeLocationLoader.f85370c, StreetModeWifi.f85371c, SecurityLargeTransfers.f85369c, WealthProtectionSsoReauthAnimation.f85372c, HiddenTransactionsNewScreen.f85367c, CardPaymentsWealthProtection.f85366c, JointAccountLimitsHungary.f85368c);
    }
}
