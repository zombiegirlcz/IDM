package com.revolut.feature.tab.crypto.impl.ui.v2.accounts.crypto;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.api.model.ChosenBackground;
import com.revolut.feature.tab.crypto.api.extensions.account.AccountsExtensionContract$AccountsState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sh5.c;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/tab/crypto/impl/ui/v2/accounts/crypto/CryptoAccountsState;", "Lcom/revolut/feature/tab/crypto/api/extensions/account/AccountsExtensionContract$AccountsState;", "", "toString", "()Ljava/lang/String;", "Companion", "b", "feature_tab_crypto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoAccountsState implements AccountsExtensionContract$AccountsState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ake.a f89817a;

    @NotNull
    public static final Parcelable.Creator<CryptoAccountsState> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            CryptoHeaderData cryptoHeaderData = (CryptoHeaderData) j6.a.f(parcel, "source", CryptoHeaderData.class);
            return new CryptoAccountsState(new ake.a(new Data(cryptoHeaderData, null, cryptoHeaderData == null, 2, null), (ChosenBackground) parcel.readParcelable(ChosenBackground.class.getClassLoader()), new c((Clause) parcel.readParcelable(Clause.class.getClassLoader()), null), 1002));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoAccountsState[i];
        }
    }

    public CryptoAccountsState() {
        this(0);
    }

    @Override // com.revolut.feature.tab.crypto.api.extensions.account.AccountsExtensionContract$AccountsState
    public final boolean a7(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return Intrinsics.f(accountId, "ACCOUNT_SELECTION_RETAIL_CRYPTO_LIST_ID");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CryptoAccountsState) && Intrinsics.f(this.f89817a, ((CryptoAccountsState) obj2).f89817a);
    }

    public final int hashCode() {
        return this.f89817a.hashCode();
    }

    @Override // com.revolut.feature.tab.crypto.api.extensions.account.AccountsExtensionContract$AccountsState
    public final List v6() {
        return u.c("ACCOUNT_SELECTION_RETAIL_CRYPTO_LIST_ID");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        ake.a aVar = this.f89817a;
        dest.writeParcelable((Parcelable) aVar.f5802a.getContent(), 0);
        dest.writeParcelable(aVar.f5804c, 0);
        dest.writeParcelable(aVar.e.f263435a, 0);
    }

    public CryptoAccountsState(ake.a domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        this.f89817a = domainState;
    }

    public /* synthetic */ CryptoAccountsState(int i) {
        this(new ake.a(null, null, null, 1023));
    }
}
