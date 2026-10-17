package com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ShowRiskInfo", "ShowPerformanceScenariosInfo", "ShowFeesInfo", "ShowOpenEndedFundInfo", "ShowPriceInfo", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ModalStep$ShowFeesInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ModalStep$ShowOpenEndedFundInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ModalStep$ShowPerformanceScenariosInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ModalStep$ShowPriceInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ModalStep$ShowRiskInfo;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FundPerformanceScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ModalStep$ShowFeesInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ModalStep;", "<init>", "()V", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowFeesInfo extends FundPerformanceScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowFeesInfo f95834a = new ShowFeesInfo();

        @NotNull
        public static final Parcelable.Creator<ShowFeesInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowFeesInfo.f95834a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowFeesInfo[i];
            }
        }

        private ShowFeesInfo() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ModalStep$ShowOpenEndedFundInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ModalStep;", "<init>", "()V", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowOpenEndedFundInfo extends FundPerformanceScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowOpenEndedFundInfo f95835a = new ShowOpenEndedFundInfo();

        @NotNull
        public static final Parcelable.Creator<ShowOpenEndedFundInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowOpenEndedFundInfo.f95835a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowOpenEndedFundInfo[i];
            }
        }

        private ShowOpenEndedFundInfo() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ModalStep$ShowPerformanceScenariosInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ModalStep;", "<init>", "()V", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowPerformanceScenariosInfo extends FundPerformanceScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowPerformanceScenariosInfo f95836a = new ShowPerformanceScenariosInfo();

        @NotNull
        public static final Parcelable.Creator<ShowPerformanceScenariosInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowPerformanceScenariosInfo.f95836a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowPerformanceScenariosInfo[i];
            }
        }

        private ShowPerformanceScenariosInfo() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ModalStep$ShowPriceInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ModalStep;", "<init>", "()V", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowPriceInfo extends FundPerformanceScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowPriceInfo f95837a = new ShowPriceInfo();

        @NotNull
        public static final Parcelable.Creator<ShowPriceInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowPriceInfo.f95837a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowPriceInfo[i];
            }
        }

        private ShowPriceInfo() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ModalStep$ShowRiskInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ModalStep;", "<init>", "()V", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowRiskInfo extends FundPerformanceScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowRiskInfo f95838a = new ShowRiskInfo();

        @NotNull
        public static final Parcelable.Creator<ShowRiskInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowRiskInfo.f95838a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowRiskInfo[i];
            }
        }

        private ShowRiskInfo() {
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

    private FundPerformanceScreenContract$ModalStep() {
    }
}
