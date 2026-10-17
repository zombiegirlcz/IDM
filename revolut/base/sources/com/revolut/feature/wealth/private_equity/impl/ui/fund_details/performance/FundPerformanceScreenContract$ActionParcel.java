package com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"com/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ActionParcel", "Landroid/os/Parcelable;", "<init>", "()V", "ShowRiskInfo", "ShowPerformanceScenariosInfo", "ShowDocument", "ShowFeesInfo", "ShowOpenEndedFundInfo", "ShowPriceInfo", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ActionParcel$ShowDocument;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ActionParcel$ShowFeesInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ActionParcel$ShowOpenEndedFundInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ActionParcel$ShowPerformanceScenariosInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ActionParcel$ShowPriceInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ActionParcel$ShowRiskInfo;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FundPerformanceScreenContract$ActionParcel implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ActionParcel$ShowDocument;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ActionParcel;", "", "toString", "()Ljava/lang/String;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowDocument extends FundPerformanceScreenContract$ActionParcel {

        @NotNull
        public static final Parcelable.Creator<ShowDocument> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95828a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowDocument(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowDocument[i];
            }
        }

        public ShowDocument(String url2) {
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f95828a = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowDocument) && Intrinsics.f(this.f95828a, ((ShowDocument) obj2).f95828a);
        }

        public final int hashCode() {
            return this.f95828a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95828a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ActionParcel$ShowFeesInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ActionParcel;", "<init>", "()V", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowFeesInfo extends FundPerformanceScreenContract$ActionParcel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowFeesInfo f95829a = new ShowFeesInfo();

        @NotNull
        public static final Parcelable.Creator<ShowFeesInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowFeesInfo.f95829a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ActionParcel$ShowOpenEndedFundInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ActionParcel;", "<init>", "()V", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowOpenEndedFundInfo extends FundPerformanceScreenContract$ActionParcel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowOpenEndedFundInfo f95830a = new ShowOpenEndedFundInfo();

        @NotNull
        public static final Parcelable.Creator<ShowOpenEndedFundInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowOpenEndedFundInfo.f95830a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ActionParcel$ShowPerformanceScenariosInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ActionParcel;", "<init>", "()V", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowPerformanceScenariosInfo extends FundPerformanceScreenContract$ActionParcel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowPerformanceScenariosInfo f95831a = new ShowPerformanceScenariosInfo();

        @NotNull
        public static final Parcelable.Creator<ShowPerformanceScenariosInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowPerformanceScenariosInfo.f95831a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ActionParcel$ShowPriceInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ActionParcel;", "<init>", "()V", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowPriceInfo extends FundPerformanceScreenContract$ActionParcel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowPriceInfo f95832a = new ShowPriceInfo();

        @NotNull
        public static final Parcelable.Creator<ShowPriceInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowPriceInfo.f95832a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ActionParcel$ShowRiskInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreenContract$ActionParcel;", "<init>", "()V", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowRiskInfo extends FundPerformanceScreenContract$ActionParcel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowRiskInfo f95833a = new ShowRiskInfo();

        @NotNull
        public static final Parcelable.Creator<ShowRiskInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowRiskInfo.f95833a;
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

    private FundPerformanceScreenContract$ActionParcel() {
    }
}
