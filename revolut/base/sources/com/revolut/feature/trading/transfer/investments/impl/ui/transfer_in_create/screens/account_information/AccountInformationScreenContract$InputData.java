package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import u8f.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/screens/account_information/AccountInformationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountInformationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AccountInformationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferBroker f91589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingAccount f91590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f91591c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountInformationScreenContract$InputData((TransferBroker) parcel.readParcelable(AccountInformationScreenContract$InputData.class.getClassLoader()), (TradingAccount) parcel.readParcelable(AccountInformationScreenContract$InputData.class.getClassLoader()), d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountInformationScreenContract$InputData[i];
        }
    }

    public AccountInformationScreenContract$InputData(TransferBroker broker, TradingAccount tradingAccount, d direction) {
        Intrinsics.checkNotNullParameter(broker, "broker");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f91589a = broker;
        this.f91590b = tradingAccount;
        this.f91591c = direction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountInformationScreenContract$InputData)) {
            return false;
        }
        AccountInformationScreenContract$InputData accountInformationScreenContract$InputData = (AccountInformationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f91589a, accountInformationScreenContract$InputData.f91589a) && Intrinsics.f(this.f91590b, accountInformationScreenContract$InputData.f91590b) && this.f91591c == accountInformationScreenContract$InputData.f91591c;
    }

    public final int hashCode() {
        return this.f91591c.hashCode() + o.b(this.f91590b, this.f91589a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91589a, i);
        dest.writeParcelable(this.f91590b, i);
        dest.writeString(this.f91591c.name());
    }
}
