package com.revolut.feature.wealth.ui.impl.cash_balance;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import hx7.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/ui/impl/cash_balance/CashBalanceControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CashBalanceControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CashBalanceControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccountType f95951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95952b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CashBalanceControllerContract$InputData((TradingAccountType) parcel.readParcelable(CashBalanceControllerContract$InputData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CashBalanceControllerContract$InputData[i];
        }
    }

    public CashBalanceControllerContract$InputData(TradingAccountType accountType, String portfolioId) throws Throwable {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f95951a = accountType;
        this.f95952b = portfolioId;
        if (Intrinsics.f(accountType, TradingAccountType.Gia.f105270a) || Intrinsics.f(accountType, TradingAccountType.Taa.f105275a)) {
            return;
        }
        e.n(new IllegalArgumentException(accountType + " isn't supported in CashBalance"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CashBalanceControllerContract$InputData)) {
            return false;
        }
        CashBalanceControllerContract$InputData cashBalanceControllerContract$InputData = (CashBalanceControllerContract$InputData) obj2;
        return Intrinsics.f(this.f95951a, cashBalanceControllerContract$InputData.f95951a) && Intrinsics.f(this.f95952b, cashBalanceControllerContract$InputData.f95952b);
    }

    public final int hashCode() {
        return this.f95952b.hashCode() + (this.f95951a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f95951a, i);
        dest.writeString(this.f95952b);
    }
}
