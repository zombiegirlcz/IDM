package com.revolut.trading.orders.ui.flows.investment_plan.projection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.trading.orders.ui.screens.investment_plan.projection.InvestmentProjectionsScreenContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/trading/orders/ui/flows/investment_plan/projection/InvestmentProjectionsFlowContract$FlowStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Projections", "InvestOrderFlow", "Lcom/revolut/trading/orders/ui/flows/investment_plan/projection/InvestmentProjectionsFlowContract$FlowStep$InvestOrderFlow;", "Lcom/revolut/trading/orders/ui/flows/investment_plan/projection/InvestmentProjectionsFlowContract$FlowStep$Projections;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvestmentProjectionsFlowContract$FlowStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/flows/investment_plan/projection/InvestmentProjectionsFlowContract$FlowStep$InvestOrderFlow;", "Lcom/revolut/trading/orders/ui/flows/investment_plan/projection/InvestmentProjectionsFlowContract$FlowStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvestOrderFlow implements InvestmentProjectionsFlowContract$FlowStep {

        @NotNull
        public static final Parcelable.Creator<InvestOrderFlow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InvestOrderContract$InputData f106819a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InvestOrderFlow((InvestOrderContract$InputData) parcel.readParcelable(InvestOrderFlow.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvestOrderFlow[i];
            }
        }

        public InvestOrderFlow(InvestOrderContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f106819a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InvestOrderFlow) && Intrinsics.f(this.f106819a, ((InvestOrderFlow) obj2).f106819a);
        }

        public final int hashCode() {
            return this.f106819a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106819a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/flows/investment_plan/projection/InvestmentProjectionsFlowContract$FlowStep$Projections;", "Lcom/revolut/trading/orders/ui/flows/investment_plan/projection/InvestmentProjectionsFlowContract$FlowStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Projections implements InvestmentProjectionsFlowContract$FlowStep {

        @NotNull
        public static final Parcelable.Creator<Projections> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InvestmentProjectionsScreenContract$InputData f106820a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Projections(InvestmentProjectionsScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Projections[i];
            }
        }

        public Projections(InvestmentProjectionsScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f106820a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Projections) && Intrinsics.f(this.f106820a, ((Projections) obj2).f106820a);
        }

        public final int hashCode() {
            return this.f106820a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f106820a.writeToParcel(dest, i);
        }
    }
}
