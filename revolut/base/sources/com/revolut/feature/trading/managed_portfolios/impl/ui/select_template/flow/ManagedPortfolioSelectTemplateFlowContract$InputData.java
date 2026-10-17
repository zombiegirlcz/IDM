package com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/trading/managed_portfolios/impl/ui/select_template/flow/ManagedPortfolioSelectTemplateFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "SelectInitialTemplate", "ChangeCurrentTemplate", "ChangeInitialTemplate", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/flow/ManagedPortfolioSelectTemplateFlowContract$InputData$ChangeCurrentTemplate;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/flow/ManagedPortfolioSelectTemplateFlowContract$InputData$ChangeInitialTemplate;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/flow/ManagedPortfolioSelectTemplateFlowContract$InputData$SelectInitialTemplate;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ManagedPortfolioSelectTemplateFlowContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/flow/ManagedPortfolioSelectTemplateFlowContract$InputData$ChangeCurrentTemplate;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/flow/ManagedPortfolioSelectTemplateFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChangeCurrentTemplate implements ManagedPortfolioSelectTemplateFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ChangeCurrentTemplate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91456a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangeCurrentTemplate(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangeCurrentTemplate[i];
            }
        }

        public ChangeCurrentTemplate(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f91456a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChangeCurrentTemplate) && Intrinsics.f(this.f91456a, ((ChangeCurrentTemplate) obj2).f91456a);
        }

        public final int hashCode() {
            return this.f91456a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91456a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/flow/ManagedPortfolioSelectTemplateFlowContract$InputData$ChangeInitialTemplate;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/flow/ManagedPortfolioSelectTemplateFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChangeInitialTemplate implements ManagedPortfolioSelectTemplateFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ChangeInitialTemplate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Template f91458b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangeInitialTemplate(parcel.readString(), (Template) parcel.readParcelable(ChangeInitialTemplate.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangeInitialTemplate[i];
            }
        }

        public ChangeInitialTemplate(String portfolioId, Template selectedTemplate) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(selectedTemplate, "selectedTemplate");
            this.f91457a = portfolioId;
            this.f91458b = selectedTemplate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ChangeInitialTemplate)) {
                return false;
            }
            ChangeInitialTemplate changeInitialTemplate = (ChangeInitialTemplate) obj2;
            return Intrinsics.f(this.f91457a, changeInitialTemplate.f91457a) && Intrinsics.f(this.f91458b, changeInitialTemplate.f91458b);
        }

        public final int hashCode() {
            return this.f91458b.hashCode() + (this.f91457a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91457a);
            dest.writeParcelable(this.f91458b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/flow/ManagedPortfolioSelectTemplateFlowContract$InputData$SelectInitialTemplate;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/flow/ManagedPortfolioSelectTemplateFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectInitialTemplate implements ManagedPortfolioSelectTemplateFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<SelectInitialTemplate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91459a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectInitialTemplate(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectInitialTemplate[i];
            }
        }

        public SelectInitialTemplate(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f91459a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectInitialTemplate) && Intrinsics.f(this.f91459a, ((SelectInitialTemplate) obj2).f91459a);
        }

        public final int hashCode() {
            return this.f91459a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91459a);
        }
    }
}
