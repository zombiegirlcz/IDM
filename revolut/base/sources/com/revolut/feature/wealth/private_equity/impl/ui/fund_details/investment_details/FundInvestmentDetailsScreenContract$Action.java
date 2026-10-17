package com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details;

import android.os.Parcel;
import android.os.Parcelable;
import kel.f;
import kel.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/wealth/private_equity/impl/ui/fund_details/investment_details/FundInvestmentDetailsScreenContract$Action", "Landroid/os/Parcelable;", "<init>", "()V", "ShowLockupPeriodInfo", "ShowAveragePriceInfo", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/investment_details/FundInvestmentDetailsScreenContract$Action$ShowAveragePriceInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/investment_details/FundInvestmentDetailsScreenContract$Action$ShowLockupPeriodInfo;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FundInvestmentDetailsScreenContract$Action implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/investment_details/FundInvestmentDetailsScreenContract$Action$ShowAveragePriceInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/investment_details/FundInvestmentDetailsScreenContract$Action;", "<init>", "()V", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowAveragePriceInfo extends FundInvestmentDetailsScreenContract$Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowAveragePriceInfo f95806a = new ShowAveragePriceInfo();

        @NotNull
        public static final Parcelable.Creator<ShowAveragePriceInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowAveragePriceInfo.f95806a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowAveragePriceInfo[i];
            }
        }

        private ShowAveragePriceInfo() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/investment_details/FundInvestmentDetailsScreenContract$Action$ShowLockupPeriodInfo;", "Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/investment_details/FundInvestmentDetailsScreenContract$Action;", "", "toString", "()Ljava/lang/String;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowLockupPeriodInfo extends FundInvestmentDetailsScreenContract$Action {

        @NotNull
        public static final Parcelable.Creator<ShowLockupPeriodInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f95807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f95808b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowLockupPeriodInfo(f.valueOf(parcel.readString()), (n) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowLockupPeriodInfo[i];
            }
        }

        public ShowLockupPeriodInfo(f lockupState, n holding) {
            Intrinsics.checkNotNullParameter(lockupState, "lockupState");
            Intrinsics.checkNotNullParameter(holding, "holding");
            this.f95807a = lockupState;
            this.f95808b = holding;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ShowLockupPeriodInfo)) {
                return false;
            }
            ShowLockupPeriodInfo showLockupPeriodInfo = (ShowLockupPeriodInfo) obj2;
            return this.f95807a == showLockupPeriodInfo.f95807a && Intrinsics.f(this.f95808b, showLockupPeriodInfo.f95808b);
        }

        public final int hashCode() {
            return this.f95808b.hashCode() + (this.f95807a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95807a.name());
            dest.writeSerializable(this.f95808b);
        }
    }

    private FundInvestmentDetailsScreenContract$Action() {
    }
}
