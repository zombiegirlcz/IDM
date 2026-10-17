package com.revolut.feature.statements.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import io3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/api/navigation/AccountConfirmationSelectionDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountConfirmationSelectionDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<AccountConfirmationSelectionDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f88232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f88233b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountConfirmationSelectionDestination((AccountId) parcel.readParcelable(AccountConfirmationSelectionDestination.class.getClassLoader()), parcel.readInt() == 0 ? null : l.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountConfirmationSelectionDestination[i];
        }
    }

    public AccountConfirmationSelectionDestination(AccountId accountId, l lVar) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f88232a = accountId;
        this.f88233b = lVar;
    }

    /* JADX INFO: renamed from: X4, reason: from getter */
    public final l getF88233b() {
        return this.f88233b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountConfirmationSelectionDestination)) {
            return false;
        }
        AccountConfirmationSelectionDestination accountConfirmationSelectionDestination = (AccountConfirmationSelectionDestination) obj2;
        return Intrinsics.f(this.f88232a, accountConfirmationSelectionDestination.f88232a) && this.f88233b == accountConfirmationSelectionDestination.f88233b;
    }

    /* JADX INFO: renamed from: getAccountId, reason: from getter */
    public final AccountId getF88232a() {
        return this.f88232a;
    }

    public final int hashCode() {
        int iHashCode = this.f88232a.hashCode() * 31;
        l lVar = this.f88233b;
        return iHashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f88232a, i);
        l lVar = this.f88233b;
        if (lVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(lVar.name());
        }
    }
}
