package com.revolut.feature.payments.money_request.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"com/revolut/feature/payments/money_request/api/navigation/MoneyRequestFeatureConfig$BridgeDetails$ByMoneyRequest", "", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "BridgeDestination", "feature_payments_money_request_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoneyRequestFeatureConfig$BridgeDetails$ByMoneyRequest extends KompotBridgeFeatureConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<MoneyRequestFeatureConfig$BridgeDetails$ByMoneyRequest> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MoneyRequest f79606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FlowExtras f79607h;

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/money_request/api/navigation/MoneyRequestFeatureConfig$BridgeDetails$ByMoneyRequest$BridgeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_payments_money_request_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BridgeDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<BridgeDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoneyRequest f79608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FlowExtras f79609b;

        /* JADX INFO: loaded from: classes5.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BridgeDestination((MoneyRequest) parcel.readParcelable(BridgeDestination.class.getClassLoader()), (FlowExtras) parcel.readParcelable(BridgeDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BridgeDestination[i];
            }
        }

        public BridgeDestination(MoneyRequest moneyRequest, FlowExtras flowExtras) {
            Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
            this.f79608a = moneyRequest;
            this.f79609b = flowExtras;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BridgeDestination)) {
                return false;
            }
            BridgeDestination bridgeDestination = (BridgeDestination) obj2;
            return Intrinsics.f(this.f79608a, bridgeDestination.f79608a) && Intrinsics.f(this.f79609b, bridgeDestination.f79609b);
        }

        public final int hashCode() {
            int iHashCode = this.f79608a.hashCode() * 31;
            FlowExtras flowExtras = this.f79609b;
            return iHashCode + (flowExtras == null ? 0 : flowExtras.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79608a, i);
            dest.writeParcelable(this.f79609b, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MoneyRequestFeatureConfig$BridgeDetails$ByMoneyRequest((MoneyRequest) parcel.readParcelable(MoneyRequestFeatureConfig$BridgeDetails$ByMoneyRequest.class.getClassLoader()), (FlowExtras) parcel.readParcelable(MoneyRequestFeatureConfig$BridgeDetails$ByMoneyRequest.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoneyRequestFeatureConfig$BridgeDetails$ByMoneyRequest[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneyRequestFeatureConfig$BridgeDetails$ByMoneyRequest(MoneyRequest moneyRequest, FlowExtras flowExtras) {
        super((ActivityAnimation) null, (ParcelableDestination) new BridgeDestination(moneyRequest, flowExtras), false, (Integer) null, 0, 61);
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        this.f79606g = moneyRequest;
        this.f79607h = flowExtras;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoneyRequestFeatureConfig$BridgeDetails$ByMoneyRequest)) {
            return false;
        }
        MoneyRequestFeatureConfig$BridgeDetails$ByMoneyRequest moneyRequestFeatureConfig$BridgeDetails$ByMoneyRequest = (MoneyRequestFeatureConfig$BridgeDetails$ByMoneyRequest) obj2;
        return Intrinsics.f(this.f79606g, moneyRequestFeatureConfig$BridgeDetails$ByMoneyRequest.f79606g) && Intrinsics.f(this.f79607h, moneyRequestFeatureConfig$BridgeDetails$ByMoneyRequest.f79607h);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        int iHashCode = this.f79606g.hashCode() * 31;
        FlowExtras flowExtras = this.f79607h;
        return iHashCode + (flowExtras == null ? 0 : flowExtras.hashCode());
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f79606g, i);
        dest.writeParcelable(this.f79607h, i);
    }
}
