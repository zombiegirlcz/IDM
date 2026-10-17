package com.revolut.trading.orders.ui.invest.placement.wrapper_flow;

import android.os.Parcel;
import android.os.Parcelable;
import bla.c;
import com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/trading/orders/ui/invest/placement/wrapper_flow/InvestOrderWrapperFlowContract$WrapperFlowStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Order", "TargetPrice", "McyActivation", "Lcom/revolut/trading/orders/ui/invest/placement/wrapper_flow/InvestOrderWrapperFlowContract$WrapperFlowStep$McyActivation;", "Lcom/revolut/trading/orders/ui/invest/placement/wrapper_flow/InvestOrderWrapperFlowContract$WrapperFlowStep$Order;", "Lcom/revolut/trading/orders/ui/invest/placement/wrapper_flow/InvestOrderWrapperFlowContract$WrapperFlowStep$TargetPrice;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvestOrderWrapperFlowContract$WrapperFlowStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/wrapper_flow/InvestOrderWrapperFlowContract$WrapperFlowStep$McyActivation;", "Lcom/revolut/trading/orders/ui/invest/placement/wrapper_flow/InvestOrderWrapperFlowContract$WrapperFlowStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class McyActivation implements InvestOrderWrapperFlowContract$WrapperFlowStep {

        @NotNull
        public static final Parcelable.Creator<McyActivation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InvestOrderContract$InputData f107017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f107018b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new McyActivation((InvestOrderContract$InputData) parcel.readParcelable(McyActivation.class.getClassLoader()), c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new McyActivation[i];
            }
        }

        public McyActivation(InvestOrderContract$InputData inputData, c predefinedFeatureState) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            Intrinsics.checkNotNullParameter(predefinedFeatureState, "predefinedFeatureState");
            this.f107017a = inputData;
            this.f107018b = predefinedFeatureState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof McyActivation)) {
                return false;
            }
            McyActivation mcyActivation = (McyActivation) obj2;
            return Intrinsics.f(this.f107017a, mcyActivation.f107017a) && this.f107018b == mcyActivation.f107018b;
        }

        public final int hashCode() {
            return this.f107018b.hashCode() + (this.f107017a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f107017a, i);
            dest.writeString(this.f107018b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/wrapper_flow/InvestOrderWrapperFlowContract$WrapperFlowStep$Order;", "Lcom/revolut/trading/orders/ui/invest/placement/wrapper_flow/InvestOrderWrapperFlowContract$WrapperFlowStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Order implements InvestOrderWrapperFlowContract$WrapperFlowStep {

        @NotNull
        public static final Parcelable.Creator<Order> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InvestOrderContract$InputData f107019a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Order((InvestOrderContract$InputData) parcel.readParcelable(Order.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Order[i];
            }
        }

        public Order(InvestOrderContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f107019a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Order) && Intrinsics.f(this.f107019a, ((Order) obj2).f107019a);
        }

        public final int hashCode() {
            return this.f107019a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f107019a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/wrapper_flow/InvestOrderWrapperFlowContract$WrapperFlowStep$TargetPrice;", "Lcom/revolut/trading/orders/ui/invest/placement/wrapper_flow/InvestOrderWrapperFlowContract$WrapperFlowStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TargetPrice implements InvestOrderWrapperFlowContract$WrapperFlowStep {

        @NotNull
        public static final Parcelable.Creator<TargetPrice> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InvestOrderContract$InputData f107020a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TargetPrice((InvestOrderContract$InputData) parcel.readParcelable(TargetPrice.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TargetPrice[i];
            }
        }

        public TargetPrice(InvestOrderContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f107020a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TargetPrice) && Intrinsics.f(this.f107020a, ((TargetPrice) obj2).f107020a);
        }

        public final int hashCode() {
            return this.f107020a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f107020a, i);
        }
    }
}
