package com.revolut.feature.payments.money_request.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bv\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/money_request/api/navigation/MoneyRequestFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "RejectWithReason", "feature_payments_money_request_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MoneyRequestFeatureConfig extends FeatureConfig {

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/payments/money_request/api/navigation/MoneyRequestFeatureConfig$RejectWithReason;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "BridgeDestination", "feature_payments_money_request_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RejectWithReason extends KompotBridgeFeatureConfig implements FeatureConfig {

        @NotNull
        public static final Parcelable.Creator<RejectWithReason> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final MoneyRequest f79615g;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/money_request/api/navigation/MoneyRequestFeatureConfig$RejectWithReason$BridgeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_payments_money_request_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class BridgeDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<BridgeDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MoneyRequest f79616a;

            /* JADX INFO: loaded from: classes5.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new BridgeDestination((MoneyRequest) parcel.readParcelable(BridgeDestination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new BridgeDestination[i];
                }
            }

            public BridgeDestination(MoneyRequest moneyRequest) {
                Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
                this.f79616a = moneyRequest;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof BridgeDestination) && Intrinsics.f(this.f79616a, ((BridgeDestination) obj2).f79616a);
            }

            public final int hashCode() {
                return this.f79616a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f79616a, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RejectWithReason((MoneyRequest) parcel.readParcelable(RejectWithReason.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RejectWithReason[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RejectWithReason(MoneyRequest moneyRequest) {
            super((ActivityAnimation) null, (ParcelableDestination) new BridgeDestination(moneyRequest), false, (Integer) null, 0, 61);
            Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
            this.f79615g = moneyRequest;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RejectWithReason) && Intrinsics.f(this.f79615g, ((RejectWithReason) obj2).f79615g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f79615g.hashCode();
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79615g, i);
        }
    }
}
