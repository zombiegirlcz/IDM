package com.revolut.retail.feature.trading_onboarding.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingResultFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "TradingOnboardingResultDestination", "TradingOnboardingResultFailed", "Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingResultFeatureConfig$TradingOnboardingResultFailed;", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TradingOnboardingResultFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingResultFeatureConfig$TradingOnboardingResultDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "Failed", "Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingResultFeatureConfig$TradingOnboardingResultDestination$Failed;", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class TradingOnboardingResultDestination implements KompotDestination {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingResultFeatureConfig$TradingOnboardingResultDestination$Failed;", "Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingResultFeatureConfig$TradingOnboardingResultDestination;", "<init>", "()V", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Failed extends TradingOnboardingResultDestination {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Failed f104122a = new Failed();

            @NotNull
            public static final Parcelable.Creator<Failed> CREATOR = new a();

            /* JADX INFO: loaded from: classes12.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Failed.f104122a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Failed[i];
                }
            }

            private Failed() {
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

        private TradingOnboardingResultDestination() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingResultFeatureConfig$TradingOnboardingResultFailed;", "Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingResultFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TradingOnboardingResultFailed extends TradingOnboardingResultFeatureConfig {
        public TradingOnboardingResultFailed() {
            this(0);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF78199g() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof TradingOnboardingResultFailed);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return 0;
        }

        public TradingOnboardingResultFailed(int i) {
            super(null, TradingOnboardingResultDestination.Failed.f104122a, false, null, 0, 60);
        }
    }
}
