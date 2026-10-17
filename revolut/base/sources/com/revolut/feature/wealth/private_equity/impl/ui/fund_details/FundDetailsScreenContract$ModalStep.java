package com.revolut.feature.wealth.private_equity.impl.ui.fund_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.math.BigDecimal;
import jel.w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"com/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ShowHighRiskWarningInfo", "ShowFundClassInfo", "ShowHoldingInfo", "ShowInvestmentDetails", "ShowBuyFrequencyInfo", "ShowSellFrequencyInfo", "ShowSellTimelineInfo", "ShowAllocationInfo", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ModalStep$ShowAllocationInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ModalStep$ShowBuyFrequencyInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ModalStep$ShowFundClassInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ModalStep$ShowHighRiskWarningInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ModalStep$ShowHoldingInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ModalStep$ShowInvestmentDetails;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ModalStep$ShowSellFrequencyInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ModalStep$ShowSellTimelineInfo;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FundDetailsScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ModalStep$ShowAllocationInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowAllocationInfo extends FundDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowAllocationInfo f95762a = new ShowAllocationInfo();

        @NotNull
        public static final Parcelable.Creator<ShowAllocationInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowAllocationInfo.f95762a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowAllocationInfo[i];
            }
        }

        private ShowAllocationInfo() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ModalStep$ShowBuyFrequencyInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowBuyFrequencyInfo extends FundDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowBuyFrequencyInfo f95763a = new ShowBuyFrequencyInfo();

        @NotNull
        public static final Parcelable.Creator<ShowBuyFrequencyInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowBuyFrequencyInfo.f95763a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowBuyFrequencyInfo[i];
            }
        }

        private ShowBuyFrequencyInfo() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ModalStep$ShowFundClassInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowFundClassInfo extends FundDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ShowFundClassInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w f95764a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowFundClassInfo(w.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowFundClassInfo[i];
            }
        }

        public ShowFundClassInfo(w fundClass) {
            Intrinsics.checkNotNullParameter(fundClass, "fundClass");
            this.f95764a = fundClass;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowFundClassInfo) && this.f95764a == ((ShowFundClassInfo) obj2).f95764a;
        }

        public final int hashCode() {
            return this.f95764a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95764a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ModalStep$ShowHighRiskWarningInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowHighRiskWarningInfo extends FundDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ShowHighRiskWarningInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f95765a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowHighRiskWarningInfo(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowHighRiskWarningInfo[i];
            }
        }

        public ShowHighRiskWarningInfo(boolean z) {
            this.f95765a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowHighRiskWarningInfo) && this.f95765a == ((ShowHighRiskWarningInfo) obj2).f95765a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f95765a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f95765a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ModalStep$ShowHoldingInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowHoldingInfo extends FundDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ShowHoldingInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f95767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f95768c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowHoldingInfo(parcel.readString(), (BigDecimal) parcel.readSerializable(), (Image) parcel.readParcelable(ShowHoldingInfo.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowHoldingInfo[i];
            }
        }

        public ShowHoldingInfo(String name, BigDecimal allocation, Image logo, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(allocation, "allocation");
            Intrinsics.checkNotNullParameter(logo, "logo");
            this.f95766a = name;
            this.f95767b = allocation;
            this.f95768c = logo;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ShowHoldingInfo)) {
                return false;
            }
            ShowHoldingInfo showHoldingInfo = (ShowHoldingInfo) obj2;
            return Intrinsics.f(this.f95766a, showHoldingInfo.f95766a) && Intrinsics.f(this.f95767b, showHoldingInfo.f95767b) && Intrinsics.f(this.f95768c, showHoldingInfo.f95768c) && Intrinsics.f(this.d, showHoldingInfo.d);
        }

        public final int hashCode() {
            int iC = a10.b.c(this.f95768c, t61.a.d(this.f95767b, this.f95766a.hashCode() * 31, 31), 31);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95766a);
            dest.writeSerializable(this.f95767b);
            dest.writeParcelable(this.f95768c, i);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ModalStep$ShowInvestmentDetails;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowInvestmentDetails extends FundDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ShowInvestmentDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95769a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowInvestmentDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowInvestmentDetails[i];
            }
        }

        public ShowInvestmentDetails(String ref2) {
            Intrinsics.checkNotNullParameter(ref2, "ref");
            this.f95769a = ref2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowInvestmentDetails) && Intrinsics.f(this.f95769a, ((ShowInvestmentDetails) obj2).f95769a);
        }

        public final int hashCode() {
            return this.f95769a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95769a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ModalStep$ShowSellFrequencyInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowSellFrequencyInfo extends FundDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowSellFrequencyInfo f95770a = new ShowSellFrequencyInfo();

        @NotNull
        public static final Parcelable.Creator<ShowSellFrequencyInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowSellFrequencyInfo.f95770a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowSellFrequencyInfo[i];
            }
        }

        private ShowSellFrequencyInfo() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ModalStep$ShowSellTimelineInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowSellTimelineInfo extends FundDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ShowSellTimelineInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f95771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f95772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f95773c;
        public final BigDecimal d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowSellTimelineInfo((BigDecimal) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowSellTimelineInfo[i];
            }
        }

        public ShowSellTimelineInfo(BigDecimal bigDecimal, boolean z, boolean z3, boolean z4) {
            this.f95771a = z;
            this.f95772b = z3;
            this.f95773c = z4;
            this.d = bigDecimal;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ShowSellTimelineInfo)) {
                return false;
            }
            ShowSellTimelineInfo showSellTimelineInfo = (ShowSellTimelineInfo) obj2;
            return this.f95771a == showSellTimelineInfo.f95771a && this.f95772b == showSellTimelineInfo.f95772b && this.f95773c == showSellTimelineInfo.f95773c && Intrinsics.f(this.d, showSellTimelineInfo.d);
        }

        public final int hashCode() {
            int iC = j6.a.c(j6.a.c(Boolean.hashCode(this.f95771a) * 31, 31, this.f95772b), 31, this.f95773c);
            BigDecimal bigDecimal = this.d;
            return iC + (bigDecimal == null ? 0 : bigDecimal.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f95771a ? 1 : 0);
            dest.writeInt(this.f95772b ? 1 : 0);
            dest.writeInt(this.f95773c ? 1 : 0);
            dest.writeSerializable(this.d);
        }
    }

    private FundDetailsScreenContract$ModalStep() {
    }
}
