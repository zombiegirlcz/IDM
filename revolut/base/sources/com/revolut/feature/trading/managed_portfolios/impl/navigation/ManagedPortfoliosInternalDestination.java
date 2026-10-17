package com.revolut.feature.trading.managed_portfolios.impl.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.flow.PortfolioInsightsFlowContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.tactical_allocations.TacticalAllocationsControllerContract$InputData;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/navigation/ManagedPortfoliosInternalDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "PortfolioInsightsDestination", "TacticalAllocationDestination", "Lcom/revolut/feature/trading/managed_portfolios/impl/navigation/ManagedPortfoliosInternalDestination$PortfolioInsightsDestination;", "Lcom/revolut/feature/trading/managed_portfolios/impl/navigation/ManagedPortfoliosInternalDestination$TacticalAllocationDestination;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ManagedPortfoliosInternalDestination extends KompotDestination {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/navigation/ManagedPortfoliosInternalDestination$PortfolioInsightsDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_insights/flow/PortfolioInsightsFlowContract$InputData;", "Lcom/revolut/feature/trading/managed_portfolios/impl/navigation/ManagedPortfoliosInternalDestination;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PortfolioInsightsDestination extends InternalDestination<PortfolioInsightsFlowContract$InputData> implements ManagedPortfoliosInternalDestination {

        @NotNull
        public static final Parcelable.Creator<PortfolioInsightsDestination> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PortfolioInsightsFlowContract$InputData f91259b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PortfolioInsightsDestination(PortfolioInsightsFlowContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PortfolioInsightsDestination[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PortfolioInsightsDestination(PortfolioInsightsFlowContract$InputData inputData) {
            super(inputData);
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f91259b = inputData;
        }

        @Override // com.revolut.kompot.common.InternalDestination
        /* JADX INFO: renamed from: b */
        public final IOData$Input getF80510b() {
            return this.f91259b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PortfolioInsightsDestination) && Intrinsics.f(this.f91259b, ((PortfolioInsightsDestination) obj2).f91259b);
        }

        public final int hashCode() {
            return this.f91259b.f91377a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f91259b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/navigation/ManagedPortfoliosInternalDestination$TacticalAllocationDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/tactical_allocations/TacticalAllocationsControllerContract$InputData;", "Lcom/revolut/feature/trading/managed_portfolios/impl/navigation/ManagedPortfoliosInternalDestination;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TacticalAllocationDestination extends InternalDestination<TacticalAllocationsControllerContract$InputData> implements ManagedPortfoliosInternalDestination {

        @NotNull
        public static final Parcelable.Creator<TacticalAllocationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TacticalAllocationsControllerContract$InputData f91260b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TacticalAllocationDestination(TacticalAllocationsControllerContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TacticalAllocationDestination[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TacticalAllocationDestination(TacticalAllocationsControllerContract$InputData inputData) {
            super(inputData);
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f91260b = inputData;
        }

        @Override // com.revolut.kompot.common.InternalDestination
        /* JADX INFO: renamed from: b */
        public final IOData$Input getF80510b() {
            return this.f91260b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TacticalAllocationDestination) && Intrinsics.f(this.f91260b, ((TacticalAllocationDestination) obj2).f91260b);
        }

        public final int hashCode() {
            return this.f91260b.f91491a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f91260b.writeToParcel(dest, i);
        }
    }
}
