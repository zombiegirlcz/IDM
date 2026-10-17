package com.revolut.retail.trading.core.domain.account_closure;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/account_closure/AccountClosureBackendRequested;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountClosureBackendRequested implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AccountClosureBackendRequested> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f104483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountClosureBackendRequestedDetails f104484b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountClosureBackendRequested(parcel.readInt() != 0, parcel.readInt() == 0 ? null : AccountClosureBackendRequestedDetails.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountClosureBackendRequested[i];
        }
    }

    public AccountClosureBackendRequested(boolean z, AccountClosureBackendRequestedDetails accountClosureBackendRequestedDetails) {
        this.f104483a = z;
        this.f104484b = accountClosureBackendRequestedDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountClosureBackendRequested)) {
            return false;
        }
        AccountClosureBackendRequested accountClosureBackendRequested = (AccountClosureBackendRequested) obj2;
        return this.f104483a == accountClosureBackendRequested.f104483a && Intrinsics.f(this.f104484b, accountClosureBackendRequested.f104484b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f104483a) * 31;
        AccountClosureBackendRequestedDetails accountClosureBackendRequestedDetails = this.f104484b;
        return iHashCode + (accountClosureBackendRequestedDetails == null ? 0 : accountClosureBackendRequestedDetails.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f104483a ? 1 : 0);
        AccountClosureBackendRequestedDetails accountClosureBackendRequestedDetails = this.f104484b;
        if (accountClosureBackendRequestedDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            accountClosureBackendRequestedDetails.writeToParcel(dest, i);
        }
    }
}
