package com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/trading/managed_portfolios/impl/ui/details/flow/ManagedPortfoliosDetailsFlowControllerContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "PortfoliosDetails", "TopHoldings", "ExploreInsights", "StrategyReport", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/flow/ManagedPortfoliosDetailsFlowControllerContract$Step$ExploreInsights;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/flow/ManagedPortfoliosDetailsFlowControllerContract$Step$PortfoliosDetails;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/flow/ManagedPortfoliosDetailsFlowControllerContract$Step$StrategyReport;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/flow/ManagedPortfoliosDetailsFlowControllerContract$Step$TopHoldings;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ManagedPortfoliosDetailsFlowControllerContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/flow/ManagedPortfoliosDetailsFlowControllerContract$Step$ExploreInsights;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/flow/ManagedPortfoliosDetailsFlowControllerContract$Step;", "<init>", "()V", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ExploreInsights implements ManagedPortfoliosDetailsFlowControllerContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExploreInsights f91312a = new ExploreInsights();

        @NotNull
        public static final Parcelable.Creator<ExploreInsights> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ExploreInsights.f91312a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExploreInsights[i];
            }
        }

        private ExploreInsights() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/flow/ManagedPortfoliosDetailsFlowControllerContract$Step$PortfoliosDetails;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/flow/ManagedPortfoliosDetailsFlowControllerContract$Step;", "<init>", "()V", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PortfoliosDetails implements ManagedPortfoliosDetailsFlowControllerContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PortfoliosDetails f91313a = new PortfoliosDetails();

        @NotNull
        public static final Parcelable.Creator<PortfoliosDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PortfoliosDetails.f91313a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PortfoliosDetails[i];
            }
        }

        private PortfoliosDetails() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/flow/ManagedPortfoliosDetailsFlowControllerContract$Step$StrategyReport;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/flow/ManagedPortfoliosDetailsFlowControllerContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StrategyReport implements ManagedPortfoliosDetailsFlowControllerContract$Step {

        @NotNull
        public static final Parcelable.Creator<StrategyReport> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91314a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StrategyReport(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StrategyReport[i];
            }
        }

        public StrategyReport(String investorUpdateId) {
            Intrinsics.checkNotNullParameter(investorUpdateId, "investorUpdateId");
            this.f91314a = investorUpdateId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StrategyReport) && Intrinsics.f(this.f91314a, ((StrategyReport) obj2).f91314a);
        }

        public final int hashCode() {
            return this.f91314a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91314a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/flow/ManagedPortfoliosDetailsFlowControllerContract$Step$TopHoldings;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/flow/ManagedPortfoliosDetailsFlowControllerContract$Step;", "<init>", "()V", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TopHoldings implements ManagedPortfoliosDetailsFlowControllerContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TopHoldings f91315a = new TopHoldings();

        @NotNull
        public static final Parcelable.Creator<TopHoldings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TopHoldings.f91315a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TopHoldings[i];
            }
        }

        private TopHoldings() {
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
}
