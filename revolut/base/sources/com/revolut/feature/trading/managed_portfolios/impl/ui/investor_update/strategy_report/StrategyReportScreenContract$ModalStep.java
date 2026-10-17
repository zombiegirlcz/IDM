package com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.InvestorUpdateHistoryFlowContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/strategy_report/StrategyReportScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "InvestorUpdateHistory", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/strategy_report/StrategyReportScreenContract$ModalStep$InvestorUpdateHistory;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StrategyReportScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/strategy_report/StrategyReportScreenContract$ModalStep$InvestorUpdateHistory;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/strategy_report/StrategyReportScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvestorUpdateHistory implements StrategyReportScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<InvestorUpdateHistory> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InvestorUpdateHistoryFlowContract$InputData f91371a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InvestorUpdateHistory(InvestorUpdateHistoryFlowContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvestorUpdateHistory[i];
            }
        }

        public InvestorUpdateHistory(InvestorUpdateHistoryFlowContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f91371a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InvestorUpdateHistory) && Intrinsics.f(this.f91371a, ((InvestorUpdateHistory) obj2).f91371a);
        }

        public final int hashCode() {
            return this.f91371a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f91371a.writeToParcel(dest, i);
        }
    }
}
