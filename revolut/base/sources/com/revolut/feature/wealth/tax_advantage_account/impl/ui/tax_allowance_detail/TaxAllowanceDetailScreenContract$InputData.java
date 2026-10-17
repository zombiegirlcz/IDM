package com.revolut.feature.wealth.tax_advantage_account.impl.ui.tax_allowance_detail;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/tax_advantage_account/impl/ui/tax_allowance_detail/TaxAllowanceDetailScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_tax_advantage_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxAllowanceDetailScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TaxAllowanceDetailScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount.TaxAdvantage f95851a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TaxAllowanceDetailScreenContract$InputData((TradingAccount.TaxAdvantage) parcel.readParcelable(TaxAllowanceDetailScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxAllowanceDetailScreenContract$InputData[i];
        }
    }

    public TaxAllowanceDetailScreenContract$InputData(TradingAccount.TaxAdvantage taxAdvantageAccount) {
        Intrinsics.checkNotNullParameter(taxAdvantageAccount, "taxAdvantageAccount");
        this.f95851a = taxAdvantageAccount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof TaxAllowanceDetailScreenContract$InputData) && Intrinsics.f(this.f95851a, ((TaxAllowanceDetailScreenContract$InputData) obj2).f95851a);
    }

    public final int hashCode() {
        return this.f95851a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f95851a, i);
    }
}
