package com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.robo.api.model.RiskMetrics;
import com.revolut.feature.trading.managed_portfolios.impl.domain.template.model.TemplateIntro;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.intro.PortfolioRevealIntroScreenContract$TemplateIntroPage;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_reveal/PortfolioRevealFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Loading", "Content", "PortfolioRevealIntro", "StrategyOverview", "ExploreInsights", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_reveal/PortfolioRevealFlowContract$Step$Content;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_reveal/PortfolioRevealFlowContract$Step$ExploreInsights;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_reveal/PortfolioRevealFlowContract$Step$Loading;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_reveal/PortfolioRevealFlowContract$Step$PortfolioRevealIntro;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_reveal/PortfolioRevealFlowContract$Step$StrategyOverview;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PortfolioRevealFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_reveal/PortfolioRevealFlowContract$Step$Content;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_reveal/PortfolioRevealFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Content implements PortfolioRevealFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Content> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TemplateIntro f91419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RiskMetrics f91420b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Content(TemplateIntro.CREATOR.createFromParcel(parcel), (RiskMetrics) parcel.readParcelable(Content.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Content[i];
            }
        }

        public Content(TemplateIntro templateIntro, RiskMetrics riskMetrics) {
            Intrinsics.checkNotNullParameter(templateIntro, "templateIntro");
            Intrinsics.checkNotNullParameter(riskMetrics, "riskMetrics");
            this.f91419a = templateIntro;
            this.f91420b = riskMetrics;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Content)) {
                return false;
            }
            Content content = (Content) obj2;
            return Intrinsics.f(this.f91419a, content.f91419a) && Intrinsics.f(this.f91420b, content.f91420b);
        }

        public final int hashCode() {
            return this.f91420b.hashCode() + (this.f91419a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f91419a.writeToParcel(dest, i);
            dest.writeParcelable(this.f91420b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_reveal/PortfolioRevealFlowContract$Step$ExploreInsights;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_reveal/PortfolioRevealFlowContract$Step;", "<init>", "()V", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ExploreInsights implements PortfolioRevealFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExploreInsights f91421a = new ExploreInsights();

        @NotNull
        public static final Parcelable.Creator<ExploreInsights> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ExploreInsights.f91421a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_reveal/PortfolioRevealFlowContract$Step$Loading;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_reveal/PortfolioRevealFlowContract$Step;", "<init>", "()V", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Loading implements PortfolioRevealFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Loading f91422a = new Loading();

        @NotNull
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Loading.f91422a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Loading[i];
            }
        }

        private Loading() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_reveal/PortfolioRevealFlowContract$Step$PortfolioRevealIntro;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_reveal/PortfolioRevealFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PortfolioRevealIntro implements PortfolioRevealFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PortfolioRevealIntro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f91423a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(PortfolioRevealIntroScreenContract$TemplateIntroPage.CREATOR, parcel, arrayList, iA, 1);
                }
                return new PortfolioRevealIntro(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PortfolioRevealIntro[i];
            }
        }

        public PortfolioRevealIntro(ArrayList pages) {
            Intrinsics.checkNotNullParameter(pages, "pages");
            this.f91423a = pages;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PortfolioRevealIntro) && this.f91423a.equals(((PortfolioRevealIntro) obj2).f91423a);
        }

        public final int hashCode() {
            return this.f91423a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f91423a, dest);
            while (itY.hasNext()) {
                ((PortfolioRevealIntroScreenContract$TemplateIntroPage) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_reveal/PortfolioRevealFlowContract$Step$StrategyOverview;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_reveal/PortfolioRevealFlowContract$Step;", "<init>", "()V", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StrategyOverview implements PortfolioRevealFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StrategyOverview f91424a = new StrategyOverview();

        @NotNull
        public static final Parcelable.Creator<StrategyOverview> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StrategyOverview.f91424a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StrategyOverview[i];
            }
        }

        private StrategyOverview() {
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
