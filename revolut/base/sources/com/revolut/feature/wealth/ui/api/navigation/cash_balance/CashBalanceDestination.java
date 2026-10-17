package com.revolut.feature.wealth.ui.api.navigation.cash_balance;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/navigation/cash_balance/CashBalanceDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CashBalanceDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CashBalanceDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccountType f95918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95919b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CashBalanceDestination((TradingAccountType) parcel.readParcelable(CashBalanceDestination.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CashBalanceDestination[i];
        }
    }

    public CashBalanceDestination(TradingAccountType accountType, String portfolioId) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f95918a = accountType;
        this.f95919b = portfolioId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TradingAccountType getF95918a() {
        return this.f95918a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CashBalanceDestination)) {
            return false;
        }
        CashBalanceDestination cashBalanceDestination = (CashBalanceDestination) obj2;
        return Intrinsics.f(this.f95918a, cashBalanceDestination.f95918a) && Intrinsics.f(this.f95919b, cashBalanceDestination.f95919b);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getF95919b() {
        return this.f95919b;
    }

    public final int hashCode() {
        return this.f95919b.hashCode() + (this.f95918a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f95918a, i);
        dest.writeString(this.f95919b);
    }
}
