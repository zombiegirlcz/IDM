package com.revolut.retail.feature.adjust_analytics.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/adjust_analytics/api/AdjustAnalyticsFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "AdjustAnalytics", "Lcom/revolut/retail/feature/adjust_analytics/api/AdjustAnalyticsFeatureConfig$AdjustAnalytics;", "feature_retail_adjust_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AdjustAnalyticsFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/adjust_analytics/api/AdjustAnalyticsFeatureConfig$AdjustAnalytics;", "Lcom/revolut/retail/feature/adjust_analytics/api/AdjustAnalyticsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "feature_retail_adjust_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdjustAnalytics extends AdjustAnalyticsFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final a3 f98699g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f98700h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/adjust_analytics/api/AdjustAnalyticsFeatureConfig$AdjustAnalytics$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_adjust_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a3 f98701a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f98702b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination((a3) parcel.readSerializable(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(a3 transaction, boolean z) {
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                this.f98701a = transaction;
                this.f98702b = z;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getF98702b() {
                return this.f98702b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Destination)) {
                    return false;
                }
                Destination destination = (Destination) obj2;
                return Intrinsics.f(this.f98701a, destination.f98701a) && this.f98702b == destination.f98702b;
            }

            /* JADX INFO: renamed from: getTransaction, reason: from getter */
            public final a3 getF98701a() {
                return this.f98701a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f98702b) + (this.f98701a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f98701a);
                dest.writeInt(this.f98702b ? 1 : 0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdjustAnalytics(a3 transaction) {
            super(null, new Destination(transaction, true), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            this.f98699g = transaction;
            this.f98700h = true;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AdjustAnalytics)) {
                return false;
            }
            AdjustAnalytics adjustAnalytics = (AdjustAnalytics) obj2;
            return Intrinsics.f(this.f98699g, adjustAnalytics.f98699g) && this.f98700h == adjustAnalytics.f98700h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return Boolean.hashCode(this.f98700h) + (this.f98699g.hashCode() * 31);
        }
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    /* JADX INFO: renamed from: a */
    public final ActivityAnimation getF99934h() {
        return null;
    }
}
