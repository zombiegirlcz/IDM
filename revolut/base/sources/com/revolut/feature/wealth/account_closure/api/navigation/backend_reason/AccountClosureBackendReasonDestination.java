package com.revolut.feature.wealth.account_closure.api.navigation.backend_reason;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureBackendRequestedDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/navigation/backend_reason/AccountClosureBackendReasonDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountClosureBackendReasonDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<AccountClosureBackendReasonDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountClosureBackendRequestedDetails f94893a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountClosureBackendReasonDestination((AccountClosureBackendRequestedDetails) parcel.readParcelable(AccountClosureBackendReasonDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountClosureBackendReasonDestination[i];
        }
    }

    public AccountClosureBackendReasonDestination(AccountClosureBackendRequestedDetails details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f94893a = details;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AccountClosureBackendRequestedDetails getF94893a() {
        return this.f94893a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof AccountClosureBackendReasonDestination) && Intrinsics.f(this.f94893a, ((AccountClosureBackendReasonDestination) obj2).f94893a);
    }

    public final int hashCode() {
        return this.f94893a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94893a, i);
    }
}
