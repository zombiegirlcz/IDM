package com.revolut.feature.robo.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import dfl.i0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "RoboDestination", "Onboarding", "EditPortfolio", "PortfolioStrategyInformation", "OnboardingDestination", "OnboardingFailedPromptDestination", "PreonboardingTopupCancelledPromptDestination", "EditPortfolioDestination", "TransactionDetailsDestination", "PortfolioStrategyInformationDestination", "Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig$EditPortfolio;", "Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig$Onboarding;", "Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig$PortfolioStrategyInformation;", "feature_robo_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RoboFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig$EditPortfolio;", "Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_robo_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditPortfolio extends RoboFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f85051g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EditPortfolio(String portfolioId) {
            super(new EditPortfolioDestination(portfolioId));
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f85051g = portfolioId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF98953g() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EditPortfolio) && Intrinsics.f(this.f85051g, ((EditPortfolio) obj2).f85051g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f85051g.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig$EditPortfolioDestination;", "Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig$RoboDestination;", "", "toString", "()Ljava/lang/String;", "feature_robo_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditPortfolioDestination implements RoboDestination {

        @NotNull
        public static final Parcelable.Creator<EditPortfolioDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85052a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditPortfolioDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditPortfolioDestination[i];
            }
        }

        public EditPortfolioDestination(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f85052a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EditPortfolioDestination) && Intrinsics.f(this.f85052a, ((EditPortfolioDestination) obj2).f85052a);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF85052a() {
            return this.f85052a;
        }

        public final int hashCode() {
            return this.f85052a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85052a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig$Onboarding;", "Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_robo_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Onboarding extends RoboFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f85053g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f85054h;
        public final FeatureCommand i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Onboarding(String accountId, String portfolioId, FeatureCommand featureCommand) {
            super(new OnboardingDestination(accountId, portfolioId, featureCommand));
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f85053g = accountId;
            this.f85054h = portfolioId;
            this.i = featureCommand;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF98953g() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Onboarding)) {
                return false;
            }
            Onboarding onboarding = (Onboarding) obj2;
            return Intrinsics.f(this.f85053g, onboarding.f85053g) && Intrinsics.f(this.f85054h, onboarding.f85054h) && Intrinsics.f(this.i, onboarding.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = a.c(this.f85053g.hashCode() * 31, 31, this.f85054h);
            FeatureCommand featureCommand = this.i;
            return iC + (featureCommand == null ? 0 : featureCommand.f98638a.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig$OnboardingDestination;", "Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig$RoboDestination;", "", "toString", "()Ljava/lang/String;", "feature_robo_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OnboardingDestination implements RoboDestination {

        @NotNull
        public static final Parcelable.Creator<OnboardingDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f85056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NaviCommand f85057c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OnboardingDestination(parcel.readString(), parcel.readString(), (NaviCommand) parcel.readParcelable(OnboardingDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OnboardingDestination[i];
            }
        }

        public OnboardingDestination(String accountId, String portfolioId, NaviCommand naviCommand) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f85055a = accountId;
            this.f85056b = portfolioId;
            this.f85057c = naviCommand;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF85055a() {
            return this.f85055a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final NaviCommand getF85057c() {
            return this.f85057c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OnboardingDestination)) {
                return false;
            }
            OnboardingDestination onboardingDestination = (OnboardingDestination) obj2;
            return Intrinsics.f(this.f85055a, onboardingDestination.f85055a) && Intrinsics.f(this.f85056b, onboardingDestination.f85056b) && Intrinsics.f(this.f85057c, onboardingDestination.f85057c);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF85056b() {
            return this.f85056b;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f85055a.hashCode() * 31, 31, this.f85056b);
            NaviCommand naviCommand = this.f85057c;
            return iC + (naviCommand == null ? 0 : naviCommand.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85055a);
            dest.writeString(this.f85056b);
            dest.writeParcelable(this.f85057c, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig$OnboardingFailedPromptDestination;", "Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig$RoboDestination;", "<init>", "()V", "feature_robo_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OnboardingFailedPromptDestination implements RoboDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnboardingFailedPromptDestination f85058a = new OnboardingFailedPromptDestination();

        @NotNull
        public static final Parcelable.Creator<OnboardingFailedPromptDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OnboardingFailedPromptDestination.f85058a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OnboardingFailedPromptDestination[i];
            }
        }

        private OnboardingFailedPromptDestination() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig$PortfolioStrategyInformation;", "Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_robo_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PortfolioStrategyInformation extends RoboFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f85059g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PortfolioStrategyInformation(String portfolioId) {
            super(new PortfolioStrategyInformationDestination(portfolioId));
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f85059g = portfolioId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF98953g() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PortfolioStrategyInformation) && Intrinsics.f(this.f85059g, ((PortfolioStrategyInformation) obj2).f85059g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f85059g.hashCode() * 31;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig$PortfolioStrategyInformationDestination;", "Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig$RoboDestination;", "", "toString", "()Ljava/lang/String;", "feature_robo_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PortfolioStrategyInformationDestination implements RoboDestination {

        @NotNull
        public static final Parcelable.Creator<PortfolioStrategyInformationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85060a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PortfolioStrategyInformationDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PortfolioStrategyInformationDestination[i];
            }
        }

        public PortfolioStrategyInformationDestination(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f85060a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PortfolioStrategyInformationDestination) && Intrinsics.f(this.f85060a, ((PortfolioStrategyInformationDestination) obj2).f85060a);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF85060a() {
            return this.f85060a;
        }

        public final int hashCode() {
            return this.f85060a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85060a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig$PreonboardingTopupCancelledPromptDestination;", "Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig$RoboDestination;", "<init>", "()V", "feature_robo_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PreonboardingTopupCancelledPromptDestination implements RoboDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PreonboardingTopupCancelledPromptDestination f85061a = new PreonboardingTopupCancelledPromptDestination();

        @NotNull
        public static final Parcelable.Creator<PreonboardingTopupCancelledPromptDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PreonboardingTopupCancelledPromptDestination.f85061a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PreonboardingTopupCancelledPromptDestination[i];
            }
        }

        private PreonboardingTopupCancelledPromptDestination() {
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

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig$RoboDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig$EditPortfolioDestination;", "Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig$OnboardingDestination;", "Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig$OnboardingFailedPromptDestination;", "Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig$PortfolioStrategyInformationDestination;", "Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig$PreonboardingTopupCancelledPromptDestination;", "Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig$TransactionDetailsDestination;", "feature_robo_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface RoboDestination extends KompotDestination {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig$TransactionDetailsDestination;", "Lcom/revolut/feature/robo/api/navigation/RoboFeatureConfig$RoboDestination;", "", "toString", "()Ljava/lang/String;", "feature_robo_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionDetailsDestination implements RoboDestination {

        @NotNull
        public static final Parcelable.Creator<TransactionDetailsDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i0 f85062a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionDetailsDestination((i0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionDetailsDestination[i];
            }
        }

        public TransactionDetailsDestination(i0 trade) {
            Intrinsics.checkNotNullParameter(trade, "trade");
            this.f85062a = trade;
        }

        /* JADX INFO: renamed from: V1, reason: from getter */
        public final i0 getF85062a() {
            return this.f85062a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TransactionDetailsDestination) && Intrinsics.f(this.f85062a, ((TransactionDetailsDestination) obj2).f85062a);
        }

        public final int hashCode() {
            return this.f85062a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f85062a);
        }
    }

    public RoboFeatureConfig(RoboDestination roboDestination) {
        super((ActivityAnimation) null, (ParcelableDestination) roboDestination, false, (Integer) null, 0, 60);
    }
}
