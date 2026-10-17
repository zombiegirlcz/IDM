package com.revolut.feature.wealth.private_equity.impl.ui.fund_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.math.BigDecimal;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000f\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"com/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action", "Landroid/os/Parcelable;", "<init>", "()V", "ShowHighRiskWarningInfo", "NavigateToInvestmentDetails", "NavigateToHoldingDetails", "NavigateToFundHighlights", "NavigateToFundPerformance", "NavigateToPortfolioUpdates", "ShowHoldingInfo", "ShowBuyFrequencyInfo", "ShowSellFrequencyInfo", "ShowSellTimelineInfo", "NavigateToFaq", "ShowAllocationInfo", "ExpandAllocation", "CollapseAllocation", "ToggleAllHoldings", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$CollapseAllocation;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$ExpandAllocation;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$NavigateToFaq;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$NavigateToFundHighlights;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$NavigateToFundPerformance;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$NavigateToHoldingDetails;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$NavigateToInvestmentDetails;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$NavigateToPortfolioUpdates;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$ShowAllocationInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$ShowBuyFrequencyInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$ShowHighRiskWarningInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$ShowHoldingInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$ShowSellFrequencyInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$ShowSellTimelineInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$ToggleAllHoldings;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FundDetailsScreenContract$Action implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$CollapseAllocation;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action;", "", "toString", "()Ljava/lang/String;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CollapseAllocation extends FundDetailsScreenContract$Action {

        @NotNull
        public static final Parcelable.Creator<CollapseAllocation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FundDetailsScreenContract$ExpandableAllocationItemIdentifier f95739a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CollapseAllocation((FundDetailsScreenContract$ExpandableAllocationItemIdentifier) parcel.readParcelable(CollapseAllocation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CollapseAllocation[i];
            }
        }

        public CollapseAllocation(FundDetailsScreenContract$ExpandableAllocationItemIdentifier identifier) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.f95739a = identifier;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CollapseAllocation) && Intrinsics.f(this.f95739a, ((CollapseAllocation) obj2).f95739a);
        }

        public final int hashCode() {
            return this.f95739a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95739a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$ExpandAllocation;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action;", "", "toString", "()Ljava/lang/String;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExpandAllocation extends FundDetailsScreenContract$Action {

        @NotNull
        public static final Parcelable.Creator<ExpandAllocation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FundDetailsScreenContract$ExpandableAllocationItemIdentifier f95740a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExpandAllocation((FundDetailsScreenContract$ExpandableAllocationItemIdentifier) parcel.readParcelable(ExpandAllocation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExpandAllocation[i];
            }
        }

        public ExpandAllocation(FundDetailsScreenContract$ExpandableAllocationItemIdentifier identifier) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.f95740a = identifier;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExpandAllocation) && Intrinsics.f(this.f95740a, ((ExpandAllocation) obj2).f95740a);
        }

        public final int hashCode() {
            return this.f95740a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95740a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$NavigateToFaq;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action;", "<init>", "()V", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NavigateToFaq extends FundDetailsScreenContract$Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NavigateToFaq f95741a = new NavigateToFaq();

        @NotNull
        public static final Parcelable.Creator<NavigateToFaq> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NavigateToFaq.f95741a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NavigateToFaq[i];
            }
        }

        private NavigateToFaq() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$NavigateToFundHighlights;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action;", "", "toString", "()Ljava/lang/String;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NavigateToFundHighlights extends FundDetailsScreenContract$Action {

        @NotNull
        public static final Parcelable.Creator<NavigateToFundHighlights> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95742a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NavigateToFundHighlights(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NavigateToFundHighlights[i];
            }
        }

        public NavigateToFundHighlights(String ref2) {
            Intrinsics.checkNotNullParameter(ref2, "ref");
            this.f95742a = ref2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NavigateToFundHighlights) && Intrinsics.f(this.f95742a, ((NavigateToFundHighlights) obj2).f95742a);
        }

        public final int hashCode() {
            return this.f95742a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95742a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$NavigateToFundPerformance;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action;", "", "toString", "()Ljava/lang/String;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NavigateToFundPerformance extends FundDetailsScreenContract$Action {

        @NotNull
        public static final Parcelable.Creator<NavigateToFundPerformance> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f95744b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NavigateToFundPerformance(parcel.readString(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NavigateToFundPerformance[i];
            }
        }

        public NavigateToFundPerformance(String ref2, LocalDate localDate) {
            Intrinsics.checkNotNullParameter(ref2, "ref");
            this.f95743a = ref2;
            this.f95744b = localDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NavigateToFundPerformance)) {
                return false;
            }
            NavigateToFundPerformance navigateToFundPerformance = (NavigateToFundPerformance) obj2;
            return Intrinsics.f(this.f95743a, navigateToFundPerformance.f95743a) && Intrinsics.f(this.f95744b, navigateToFundPerformance.f95744b);
        }

        public final int hashCode() {
            int iHashCode = this.f95743a.hashCode() * 31;
            LocalDate localDate = this.f95744b;
            return iHashCode + (localDate == null ? 0 : localDate.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95743a);
            dest.writeSerializable(this.f95744b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$NavigateToHoldingDetails;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action;", "", "toString", "()Ljava/lang/String;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NavigateToHoldingDetails extends FundDetailsScreenContract$Action {

        @NotNull
        public static final Parcelable.Creator<NavigateToHoldingDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95745a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NavigateToHoldingDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NavigateToHoldingDetails[i];
            }
        }

        public NavigateToHoldingDetails(String ref2) {
            Intrinsics.checkNotNullParameter(ref2, "ref");
            this.f95745a = ref2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NavigateToHoldingDetails) && Intrinsics.f(this.f95745a, ((NavigateToHoldingDetails) obj2).f95745a);
        }

        public final int hashCode() {
            return this.f95745a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95745a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$NavigateToInvestmentDetails;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action;", "", "toString", "()Ljava/lang/String;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NavigateToInvestmentDetails extends FundDetailsScreenContract$Action {

        @NotNull
        public static final Parcelable.Creator<NavigateToInvestmentDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95746a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NavigateToInvestmentDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NavigateToInvestmentDetails[i];
            }
        }

        public NavigateToInvestmentDetails(String ref2) {
            Intrinsics.checkNotNullParameter(ref2, "ref");
            this.f95746a = ref2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NavigateToInvestmentDetails) && Intrinsics.f(this.f95746a, ((NavigateToInvestmentDetails) obj2).f95746a);
        }

        public final int hashCode() {
            return this.f95746a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95746a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$NavigateToPortfolioUpdates;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action;", "", "toString", "()Ljava/lang/String;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NavigateToPortfolioUpdates extends FundDetailsScreenContract$Action {

        @NotNull
        public static final Parcelable.Creator<NavigateToPortfolioUpdates> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95747a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NavigateToPortfolioUpdates(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NavigateToPortfolioUpdates[i];
            }
        }

        public NavigateToPortfolioUpdates(String ref2) {
            Intrinsics.checkNotNullParameter(ref2, "ref");
            this.f95747a = ref2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NavigateToPortfolioUpdates) && Intrinsics.f(this.f95747a, ((NavigateToPortfolioUpdates) obj2).f95747a);
        }

        public final int hashCode() {
            return this.f95747a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95747a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$ShowAllocationInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action;", "<init>", "()V", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowAllocationInfo extends FundDetailsScreenContract$Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowAllocationInfo f95748a = new ShowAllocationInfo();

        @NotNull
        public static final Parcelable.Creator<ShowAllocationInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowAllocationInfo.f95748a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$ShowBuyFrequencyInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action;", "<init>", "()V", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowBuyFrequencyInfo extends FundDetailsScreenContract$Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowBuyFrequencyInfo f95749a = new ShowBuyFrequencyInfo();

        @NotNull
        public static final Parcelable.Creator<ShowBuyFrequencyInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowBuyFrequencyInfo.f95749a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$ShowHighRiskWarningInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action;", "", "toString", "()Ljava/lang/String;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowHighRiskWarningInfo extends FundDetailsScreenContract$Action {

        @NotNull
        public static final Parcelable.Creator<ShowHighRiskWarningInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f95750a;

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
            this.f95750a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowHighRiskWarningInfo) && this.f95750a == ((ShowHighRiskWarningInfo) obj2).f95750a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f95750a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f95750a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$ShowHoldingInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action;", "", "toString", "()Ljava/lang/String;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowHoldingInfo extends FundDetailsScreenContract$Action {

        @NotNull
        public static final Parcelable.Creator<ShowHoldingInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f95752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f95753c;
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
            this.f95751a = name;
            this.f95752b = allocation;
            this.f95753c = logo;
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
            return Intrinsics.f(this.f95751a, showHoldingInfo.f95751a) && Intrinsics.f(this.f95752b, showHoldingInfo.f95752b) && Intrinsics.f(this.f95753c, showHoldingInfo.f95753c) && Intrinsics.f(this.d, showHoldingInfo.d);
        }

        public final int hashCode() {
            int iC = a10.b.c(this.f95753c, t61.a.d(this.f95752b, this.f95751a.hashCode() * 31, 31), 31);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95751a);
            dest.writeSerializable(this.f95752b);
            dest.writeParcelable(this.f95753c, i);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$ShowSellFrequencyInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action;", "<init>", "()V", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowSellFrequencyInfo extends FundDetailsScreenContract$Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowSellFrequencyInfo f95754a = new ShowSellFrequencyInfo();

        @NotNull
        public static final Parcelable.Creator<ShowSellFrequencyInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowSellFrequencyInfo.f95754a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$ShowSellTimelineInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action;", "", "toString", "()Ljava/lang/String;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowSellTimelineInfo extends FundDetailsScreenContract$Action {

        @NotNull
        public static final Parcelable.Creator<ShowSellTimelineInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f95755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f95756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f95757c;
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
            this.f95755a = z;
            this.f95756b = z3;
            this.f95757c = z4;
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
            return this.f95755a == showSellTimelineInfo.f95755a && this.f95756b == showSellTimelineInfo.f95756b && this.f95757c == showSellTimelineInfo.f95757c && Intrinsics.f(this.d, showSellTimelineInfo.d);
        }

        public final int hashCode() {
            int iC = j6.a.c(j6.a.c(Boolean.hashCode(this.f95755a) * 31, 31, this.f95756b), 31, this.f95757c);
            BigDecimal bigDecimal = this.d;
            return iC + (bigDecimal == null ? 0 : bigDecimal.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f95755a ? 1 : 0);
            dest.writeInt(this.f95756b ? 1 : 0);
            dest.writeInt(this.f95757c ? 1 : 0);
            dest.writeSerializable(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action$ToggleAllHoldings;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$Action;", "<init>", "()V", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ToggleAllHoldings extends FundDetailsScreenContract$Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ToggleAllHoldings f95758a = new ToggleAllHoldings();

        @NotNull
        public static final Parcelable.Creator<ToggleAllHoldings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ToggleAllHoldings.f95758a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ToggleAllHoldings[i];
            }
        }

        private ToggleAllHoldings() {
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

    private FundDetailsScreenContract$Action() {
    }
}
