package com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/trading/managed_portfolios/impl/ui/select_template/flow/ManagedPortfolioSelectTemplateFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SelectTemplate", "ExploreInsights", "StrategyReport", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/flow/ManagedPortfolioSelectTemplateFlowContract$Step$ExploreInsights;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/flow/ManagedPortfolioSelectTemplateFlowContract$Step$SelectTemplate;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/flow/ManagedPortfolioSelectTemplateFlowContract$Step$StrategyReport;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ManagedPortfolioSelectTemplateFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/flow/ManagedPortfolioSelectTemplateFlowContract$Step$ExploreInsights;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/flow/ManagedPortfolioSelectTemplateFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExploreInsights extends ManagedPortfolioSelectTemplateFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ExploreInsights> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91461a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExploreInsights(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExploreInsights[i];
            }
        }

        public ExploreInsights(String templateId) {
            Intrinsics.checkNotNullParameter(templateId, "templateId");
            this.f91461a = templateId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExploreInsights) && Intrinsics.f(this.f91461a, ((ExploreInsights) obj2).f91461a);
        }

        public final int hashCode() {
            return this.f91461a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91461a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/flow/ManagedPortfolioSelectTemplateFlowContract$Step$SelectTemplate;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/flow/ManagedPortfolioSelectTemplateFlowContract$Step;", "<init>", "()V", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectTemplate extends ManagedPortfolioSelectTemplateFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectTemplate f91462a = new SelectTemplate();

        @NotNull
        public static final Parcelable.Creator<SelectTemplate> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectTemplate.f91462a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectTemplate[i];
            }
        }

        private SelectTemplate() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/flow/ManagedPortfolioSelectTemplateFlowContract$Step$StrategyReport;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/flow/ManagedPortfolioSelectTemplateFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StrategyReport extends ManagedPortfolioSelectTemplateFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<StrategyReport> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91463a;

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
            this.f91463a = investorUpdateId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StrategyReport) && Intrinsics.f(this.f91463a, ((StrategyReport) obj2).f91463a);
        }

        public final int hashCode() {
            return this.f91463a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91463a);
        }
    }

    private ManagedPortfolioSelectTemplateFlowContract$Step() {
    }
}
