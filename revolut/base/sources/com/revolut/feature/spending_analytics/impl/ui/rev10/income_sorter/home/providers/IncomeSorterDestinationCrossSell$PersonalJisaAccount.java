package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.providers;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/home/providers/IncomeSorterDestinationCrossSell$PersonalJisaAccount", "Landroid/os/Parcelable;", "Available", "Created", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/home/providers/IncomeSorterDestinationCrossSell$PersonalJisaAccount$Available;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/home/providers/IncomeSorterDestinationCrossSell$PersonalJisaAccount$Created;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface IncomeSorterDestinationCrossSell$PersonalJisaAccount extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/home/providers/IncomeSorterDestinationCrossSell$PersonalJisaAccount$Available;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/home/providers/IncomeSorterDestinationCrossSell$PersonalJisaAccount;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Available implements IncomeSorterDestinationCrossSell$PersonalJisaAccount {

        @NotNull
        public static final Parcelable.Creator<Available> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TradingAccountAvailableToOnboard f87828a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Available((TradingAccountAvailableToOnboard) parcel.readParcelable(Available.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Available[i];
            }
        }

        public Available(TradingAccountAvailableToOnboard account) {
            Intrinsics.checkNotNullParameter(account, "account");
            this.f87828a = account;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Available) && Intrinsics.f(this.f87828a, ((Available) obj2).f87828a);
        }

        public final int hashCode() {
            return this.f87828a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87828a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/home/providers/IncomeSorterDestinationCrossSell$PersonalJisaAccount$Created;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/home/providers/IncomeSorterDestinationCrossSell$PersonalJisaAccount;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Created implements IncomeSorterDestinationCrossSell$PersonalJisaAccount {

        @NotNull
        public static final Parcelable.Creator<Created> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TradingAccount.TaxAdvantage.JIsa.Personal f87829a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Created((TradingAccount.TaxAdvantage.JIsa.Personal) parcel.readParcelable(Created.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Created[i];
            }
        }

        public Created(TradingAccount.TaxAdvantage.JIsa.Personal account) {
            Intrinsics.checkNotNullParameter(account, "account");
            this.f87829a = account;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Created) && Intrinsics.f(this.f87829a, ((Created) obj2).f87829a);
        }

        public final int hashCode() {
            return this.f87829a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87829a, i);
        }
    }
}
