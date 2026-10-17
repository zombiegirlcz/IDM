package com.revolut.feature.wealth.account_closure.impl.ui.screens.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackOptions;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/account_closure/impl/ui/screens/feedback/AccountClosureFeedbackScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountClosureFeedbackScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AccountClosureFeedbackScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount f94953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountClosureFeedbackOptions f94955c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountClosureFeedbackScreenContract$InputData((TradingAccount) parcel.readParcelable(AccountClosureFeedbackScreenContract$InputData.class.getClassLoader()), parcel.readString(), (AccountClosureFeedbackOptions) parcel.readParcelable(AccountClosureFeedbackScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountClosureFeedbackScreenContract$InputData[i];
        }
    }

    public AccountClosureFeedbackScreenContract$InputData(TradingAccount account, String portfolioId, AccountClosureFeedbackOptions feedbackOptions) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(feedbackOptions, "feedbackOptions");
        this.f94953a = account;
        this.f94954b = portfolioId;
        this.f94955c = feedbackOptions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountClosureFeedbackScreenContract$InputData)) {
            return false;
        }
        AccountClosureFeedbackScreenContract$InputData accountClosureFeedbackScreenContract$InputData = (AccountClosureFeedbackScreenContract$InputData) obj2;
        return Intrinsics.f(this.f94953a, accountClosureFeedbackScreenContract$InputData.f94953a) && Intrinsics.f(this.f94954b, accountClosureFeedbackScreenContract$InputData.f94954b) && Intrinsics.f(this.f94955c, accountClosureFeedbackScreenContract$InputData.f94955c);
    }

    public final int hashCode() {
        return this.f94955c.hashCode() + p.a.c(this.f94953a.hashCode() * 31, 31, this.f94954b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94953a, i);
        dest.writeString(this.f94954b);
        dest.writeParcelable(this.f94955c, i);
    }
}
