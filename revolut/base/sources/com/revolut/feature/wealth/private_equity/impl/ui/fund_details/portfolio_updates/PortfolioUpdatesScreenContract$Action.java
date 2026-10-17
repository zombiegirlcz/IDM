package com.revolut.feature.wealth.private_equity.impl.ui.fund_details.portfolio_updates;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/wealth/private_equity/impl/ui/fund_details/portfolio_updates/PortfolioUpdatesScreenContract$Action", "Landroid/os/Parcelable;", "<init>", "()V", "ShowUpcomingInvestmentInfo", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/portfolio_updates/PortfolioUpdatesScreenContract$Action$ShowUpcomingInvestmentInfo;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PortfolioUpdatesScreenContract$Action implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/portfolio_updates/PortfolioUpdatesScreenContract$Action$ShowUpcomingInvestmentInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/portfolio_updates/PortfolioUpdatesScreenContract$Action;", "", "toString", "()Ljava/lang/String;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowUpcomingInvestmentInfo extends PortfolioUpdatesScreenContract$Action {

        @NotNull
        public static final Parcelable.Creator<ShowUpcomingInvestmentInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f95848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f95849c;
        public final LocalDate d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f95850g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowUpcomingInvestmentInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowUpcomingInvestmentInfo[i];
            }
        }

        public ShowUpcomingInvestmentInfo(String name, String str, String str2, String str3, String str4, String str5, LocalDate localDate) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f95847a = name;
            this.f95848b = str;
            this.f95849c = str2;
            this.d = localDate;
            this.e = str3;
            this.f = str4;
            this.f95850g = str5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ShowUpcomingInvestmentInfo)) {
                return false;
            }
            ShowUpcomingInvestmentInfo showUpcomingInvestmentInfo = (ShowUpcomingInvestmentInfo) obj2;
            return Intrinsics.f(this.f95847a, showUpcomingInvestmentInfo.f95847a) && Intrinsics.f(this.f95848b, showUpcomingInvestmentInfo.f95848b) && Intrinsics.f(this.f95849c, showUpcomingInvestmentInfo.f95849c) && Intrinsics.f(this.d, showUpcomingInvestmentInfo.d) && Intrinsics.f(this.e, showUpcomingInvestmentInfo.e) && Intrinsics.f(this.f, showUpcomingInvestmentInfo.f) && Intrinsics.f(this.f95850g, showUpcomingInvestmentInfo.f95850g);
        }

        public final int hashCode() {
            int iHashCode = this.f95847a.hashCode() * 31;
            String str = this.f95848b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f95849c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            LocalDate localDate = this.d;
            int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
            String str3 = this.e;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f95850g;
            return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95847a);
            dest.writeString(this.f95848b);
            dest.writeString(this.f95849c);
            dest.writeSerializable(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
            dest.writeString(this.f95850g);
        }
    }

    private PortfolioUpdatesScreenContract$Action() {
    }
}
