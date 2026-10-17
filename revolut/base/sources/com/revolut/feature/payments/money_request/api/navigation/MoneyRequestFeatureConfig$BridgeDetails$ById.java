package com.revolut.feature.payments.money_request.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.money_request.api.model.MoneyRequestAction;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"com/revolut/feature/payments/money_request/api/navigation/MoneyRequestFeatureConfig$BridgeDetails$ById", "", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "BridgeDestination", "feature_payments_money_request_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoneyRequestFeatureConfig$BridgeDetails$ById extends KompotBridgeFeatureConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<MoneyRequestFeatureConfig$BridgeDetails$ById> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f79601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MoneyRequestAction f79602h;
    public final FlowExtras i;

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/money_request/api/navigation/MoneyRequestFeatureConfig$BridgeDetails$ById$BridgeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_payments_money_request_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BridgeDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<BridgeDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MoneyRequestAction f79604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final FlowExtras f79605c;

        /* JADX INFO: loaded from: classes5.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BridgeDestination(parcel.readString(), (MoneyRequestAction) parcel.readParcelable(BridgeDestination.class.getClassLoader()), (FlowExtras) parcel.readParcelable(BridgeDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BridgeDestination[i];
            }
        }

        public BridgeDestination(String moneyRequestId, MoneyRequestAction moneyRequestAction, FlowExtras flowExtras) {
            Intrinsics.checkNotNullParameter(moneyRequestId, "moneyRequestId");
            this.f79603a = moneyRequestId;
            this.f79604b = moneyRequestAction;
            this.f79605c = flowExtras;
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
            return Intrinsics.f(this.f79603a, bridgeDestination.f79603a) && Intrinsics.f(this.f79604b, bridgeDestination.f79604b) && Intrinsics.f(this.f79605c, bridgeDestination.f79605c);
        }

        public final int hashCode() {
            int iHashCode = this.f79603a.hashCode() * 31;
            MoneyRequestAction moneyRequestAction = this.f79604b;
            int iHashCode2 = (iHashCode + (moneyRequestAction == null ? 0 : moneyRequestAction.hashCode())) * 31;
            FlowExtras flowExtras = this.f79605c;
            return iHashCode2 + (flowExtras != null ? flowExtras.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79603a);
            dest.writeParcelable(this.f79604b, i);
            dest.writeParcelable(this.f79605c, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MoneyRequestFeatureConfig$BridgeDetails$ById(parcel.readString(), (MoneyRequestAction) parcel.readParcelable(MoneyRequestFeatureConfig$BridgeDetails$ById.class.getClassLoader()), (FlowExtras) parcel.readParcelable(MoneyRequestFeatureConfig$BridgeDetails$ById.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoneyRequestFeatureConfig$BridgeDetails$ById[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneyRequestFeatureConfig$BridgeDetails$ById(String moneyRequestId, MoneyRequestAction moneyRequestAction, FlowExtras flowExtras) {
        super((ActivityAnimation) null, (ParcelableDestination) new BridgeDestination(moneyRequestId, moneyRequestAction, flowExtras), false, (Integer) null, 0, 61);
        Intrinsics.checkNotNullParameter(moneyRequestId, "moneyRequestId");
        this.f79601g = moneyRequestId;
        this.f79602h = moneyRequestAction;
        this.i = flowExtras;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoneyRequestFeatureConfig$BridgeDetails$ById)) {
            return false;
        }
        MoneyRequestFeatureConfig$BridgeDetails$ById moneyRequestFeatureConfig$BridgeDetails$ById = (MoneyRequestFeatureConfig$BridgeDetails$ById) obj2;
        return Intrinsics.f(this.f79601g, moneyRequestFeatureConfig$BridgeDetails$ById.f79601g) && Intrinsics.f(this.f79602h, moneyRequestFeatureConfig$BridgeDetails$ById.f79602h) && Intrinsics.f(this.i, moneyRequestFeatureConfig$BridgeDetails$ById.i);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        int iHashCode = this.f79601g.hashCode() * 31;
        MoneyRequestAction moneyRequestAction = this.f79602h;
        int iHashCode2 = (iHashCode + (moneyRequestAction == null ? 0 : moneyRequestAction.hashCode())) * 31;
        FlowExtras flowExtras = this.i;
        return iHashCode2 + (flowExtras != null ? flowExtras.hashCode() : 0);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79601g);
        dest.writeParcelable(this.f79602h, i);
        dest.writeParcelable(this.i, i);
    }
}
