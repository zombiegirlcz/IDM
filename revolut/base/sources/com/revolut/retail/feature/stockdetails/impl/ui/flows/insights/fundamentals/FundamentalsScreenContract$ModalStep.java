package com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import fuk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/flows/insights/fundamentals/FundamentalsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ExpectedAnnualReturnInfo", "ExpectedAnnualReturnChartInfo", "SharpeRatioInfo", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/fundamentals/FundamentalsScreenContract$ModalStep$ExpectedAnnualReturnChartInfo;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/fundamentals/FundamentalsScreenContract$ModalStep$ExpectedAnnualReturnInfo;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/fundamentals/FundamentalsScreenContract$ModalStep$SharpeRatioInfo;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FundamentalsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/fundamentals/FundamentalsScreenContract$ModalStep$ExpectedAnnualReturnChartInfo;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/fundamentals/FundamentalsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExpectedAnnualReturnChartInfo implements FundamentalsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ExpectedAnnualReturnChartInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f103858a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExpectedAnnualReturnChartInfo(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExpectedAnnualReturnChartInfo[i];
            }
        }

        public ExpectedAnnualReturnChartInfo(b chart) {
            Intrinsics.checkNotNullParameter(chart, "chart");
            this.f103858a = chart;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExpectedAnnualReturnChartInfo) && this.f103858a == ((ExpectedAnnualReturnChartInfo) obj2).f103858a;
        }

        public final int hashCode() {
            return this.f103858a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103858a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/fundamentals/FundamentalsScreenContract$ModalStep$ExpectedAnnualReturnInfo;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/fundamentals/FundamentalsScreenContract$ModalStep;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ExpectedAnnualReturnInfo implements FundamentalsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExpectedAnnualReturnInfo f103859a = new ExpectedAnnualReturnInfo();

        @NotNull
        public static final Parcelable.Creator<ExpectedAnnualReturnInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ExpectedAnnualReturnInfo.f103859a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExpectedAnnualReturnInfo[i];
            }
        }

        private ExpectedAnnualReturnInfo() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/fundamentals/FundamentalsScreenContract$ModalStep$SharpeRatioInfo;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/fundamentals/FundamentalsScreenContract$ModalStep;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SharpeRatioInfo implements FundamentalsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SharpeRatioInfo f103860a = new SharpeRatioInfo();

        @NotNull
        public static final Parcelable.Creator<SharpeRatioInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SharpeRatioInfo.f103860a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SharpeRatioInfo[i];
            }
        }

        private SharpeRatioInfo() {
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
