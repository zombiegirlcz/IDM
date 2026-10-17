package com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.robo.api.model.RiskMetrics;
import com.revolut.feature.trading.managed_portfolios.impl.domain.template.model.TemplateIntro;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading/managed_portfolios/impl/ui/portfolio_reveal/PortfolioRevealScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PortfolioRevealScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PortfolioRevealScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TemplateIntro f91427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RiskMetrics f91428c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PortfolioRevealScreenContract$InputData(parcel.readString(), TemplateIntro.CREATOR.createFromParcel(parcel), (RiskMetrics) parcel.readParcelable(PortfolioRevealScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PortfolioRevealScreenContract$InputData[i];
        }
    }

    public PortfolioRevealScreenContract$InputData(String templateId, TemplateIntro templateIntro, RiskMetrics riskMetrics) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(templateIntro, "templateIntro");
        Intrinsics.checkNotNullParameter(riskMetrics, "riskMetrics");
        this.f91426a = templateId;
        this.f91427b = templateIntro;
        this.f91428c = riskMetrics;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PortfolioRevealScreenContract$InputData)) {
            return false;
        }
        PortfolioRevealScreenContract$InputData portfolioRevealScreenContract$InputData = (PortfolioRevealScreenContract$InputData) obj2;
        return Intrinsics.f(this.f91426a, portfolioRevealScreenContract$InputData.f91426a) && Intrinsics.f(this.f91427b, portfolioRevealScreenContract$InputData.f91427b) && Intrinsics.f(this.f91428c, portfolioRevealScreenContract$InputData.f91428c);
    }

    public final int hashCode() {
        return this.f91428c.hashCode() + ((this.f91427b.hashCode() + (this.f91426a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91426a);
        this.f91427b.writeToParcel(dest, i);
        dest.writeParcelable(this.f91428c, i);
    }
}
