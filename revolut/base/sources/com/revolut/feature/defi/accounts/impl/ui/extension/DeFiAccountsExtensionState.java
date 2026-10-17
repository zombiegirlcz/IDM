package com.revolut.feature.defi.accounts.impl.ui.extension;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.api.model.ChosenBackground;
import com.revolut.feature.tab.crypto.api.extensions.account.AccountsExtensionContract$AccountsState;
import java.util.List;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z16.b;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/defi/accounts/impl/ui/extension/DeFiAccountsExtensionState;", "Lcom/revolut/feature/tab/crypto/api/extensions/account/AccountsExtensionContract$AccountsState;", "", "toString", "()Ljava/lang/String;", "Companion", "b", "feature_defi_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiAccountsExtensionState implements AccountsExtensionContract$AccountsState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f71651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f71652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f71653c;
    public final xi0.b d;
    public final ChosenBackground e;
    public final Clause f;

    @NotNull
    public static final Parcelable.Creator<DeFiAccountsExtensionState> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new DeFiAccountsExtensionState(null, 63);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiAccountsExtensionState[i];
        }
    }

    public DeFiAccountsExtensionState() {
        this(null, 63);
    }

    public static DeFiAccountsExtensionState a(DeFiAccountsExtensionState deFiAccountsExtensionState, Data data, Data data2, b bVar, xi0.b bVar2, ChosenBackground chosenBackground, Clause clause, int i) {
        if ((i & 1) != 0) {
            data = deFiAccountsExtensionState.f71651a;
        }
        Data accountData = data;
        if ((i & 2) != 0) {
            data2 = deFiAccountsExtensionState.f71652b;
        }
        Data ratesData = data2;
        if ((i & 4) != 0) {
            bVar = deFiAccountsExtensionState.f71653c;
        }
        b bVar3 = bVar;
        if ((i & 8) != 0) {
            bVar2 = deFiAccountsExtensionState.d;
        }
        xi0.b bVar4 = bVar2;
        if ((i & 16) != 0) {
            chosenBackground = deFiAccountsExtensionState.e;
        }
        ChosenBackground chosenBackground2 = chosenBackground;
        if ((i & 32) != 0) {
            clause = deFiAccountsExtensionState.f;
        }
        deFiAccountsExtensionState.getClass();
        Intrinsics.checkNotNullParameter(accountData, "accountData");
        Intrinsics.checkNotNullParameter(ratesData, "ratesData");
        return new DeFiAccountsExtensionState(accountData, ratesData, bVar3, bVar4, chosenBackground2, clause);
    }

    @Override // com.revolut.feature.tab.crypto.api.extensions.account.AccountsExtensionContract$AccountsState
    public final boolean a7(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return Intrinsics.f(accountId, "DEFI_ACCOUNT_ID");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiAccountsExtensionState)) {
            return false;
        }
        DeFiAccountsExtensionState deFiAccountsExtensionState = (DeFiAccountsExtensionState) obj2;
        return Intrinsics.f(this.f71651a, deFiAccountsExtensionState.f71651a) && Intrinsics.f(this.f71652b, deFiAccountsExtensionState.f71652b) && Intrinsics.f(this.f71653c, deFiAccountsExtensionState.f71653c) && Intrinsics.f(this.d, deFiAccountsExtensionState.d) && Intrinsics.f(this.e, deFiAccountsExtensionState.e) && Intrinsics.f(this.f, deFiAccountsExtensionState.f);
    }

    public final int hashCode() {
        int iC = e.c(this.f71652b, this.f71651a.hashCode() * 31, 31);
        b bVar = this.f71653c;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        xi0.b bVar2 = this.d;
        int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        ChosenBackground chosenBackground = this.e;
        int iHashCode3 = (iHashCode2 + (chosenBackground == null ? 0 : chosenBackground.hashCode())) * 31;
        Clause clause = this.f;
        return iHashCode3 + (clause != null ? clause.hashCode() : 0);
    }

    @Override // com.revolut.feature.tab.crypto.api.extensions.account.AccountsExtensionContract$AccountsState
    public final List v6() {
        return u.c("DEFI_ACCOUNT_ID");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
    }

    public DeFiAccountsExtensionState(Data accountData, Data ratesData, b bVar, xi0.b bVar2, ChosenBackground chosenBackground, Clause clause) {
        Intrinsics.checkNotNullParameter(accountData, "accountData");
        Intrinsics.checkNotNullParameter(ratesData, "ratesData");
        this.f71651a = accountData;
        this.f71652b = ratesData;
        this.f71653c = bVar;
        this.d = bVar2;
        this.e = chosenBackground;
        this.f = clause;
    }

    public /* synthetic */ DeFiAccountsExtensionState(Data data, int i) {
        this((i & 1) != 0 ? new Data(null, null, true, 3, null) : data, new Data(null, null, true, 3, null), null, null, null, null);
    }
}
