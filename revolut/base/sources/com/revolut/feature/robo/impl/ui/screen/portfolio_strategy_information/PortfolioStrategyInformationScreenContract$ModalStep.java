package com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/robo/impl/ui/screen/portfolio_strategy_information/PortfolioStrategyInformationScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "RiskMetricsStep", "Lcom/revolut/feature/robo/impl/ui/screen/portfolio_strategy_information/PortfolioStrategyInformationScreenContract$ModalStep$RiskMetricsStep;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PortfolioStrategyInformationScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/impl/ui/screen/portfolio_strategy_information/PortfolioStrategyInformationScreenContract$ModalStep$RiskMetricsStep;", "Lcom/revolut/feature/robo/impl/ui/screen/portfolio_strategy_information/PortfolioStrategyInformationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RiskMetricsStep implements PortfolioStrategyInformationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RiskMetricsStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Template f85172a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RiskMetricsStep((Template) parcel.readParcelable(RiskMetricsStep.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RiskMetricsStep[i];
            }
        }

        public RiskMetricsStep(Template template) {
            Intrinsics.checkNotNullParameter(template, "template");
            this.f85172a = template;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RiskMetricsStep) && Intrinsics.f(this.f85172a, ((RiskMetricsStep) obj2).f85172a);
        }

        public final int hashCode() {
            return this.f85172a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f85172a, i);
        }
    }
}
