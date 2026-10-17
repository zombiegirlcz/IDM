package com.revolut.feature.wealth.account_closure.impl.ui.screens.consent;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import iug.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/wealth/account_closure/impl/ui/screens/consent/AccountClosureConsentScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "iug/f", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountClosureConsentScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AccountClosureConsentScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount f94926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f94927b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountClosureConsentScreenContract$InputData((TradingAccount) parcel.readParcelable(AccountClosureConsentScreenContract$InputData.class.getClassLoader()), f.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountClosureConsentScreenContract$InputData[i];
        }
    }

    public AccountClosureConsentScreenContract$InputData(TradingAccount account, f consentType) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(consentType, "consentType");
        this.f94926a = account;
        this.f94927b = consentType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountClosureConsentScreenContract$InputData)) {
            return false;
        }
        AccountClosureConsentScreenContract$InputData accountClosureConsentScreenContract$InputData = (AccountClosureConsentScreenContract$InputData) obj2;
        return Intrinsics.f(this.f94926a, accountClosureConsentScreenContract$InputData.f94926a) && this.f94927b == accountClosureConsentScreenContract$InputData.f94927b;
    }

    public final int hashCode() {
        return this.f94927b.hashCode() + (this.f94926a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94926a, i);
        dest.writeString(this.f94927b.name());
    }
}
