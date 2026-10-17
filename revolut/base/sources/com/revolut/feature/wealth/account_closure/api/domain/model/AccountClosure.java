package com.revolut.feature.wealth.account_closure.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ltg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosure;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountClosure implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AccountClosure> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountClosureFeedback f94850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f94851c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountClosure(parcel.readString(), AccountClosureFeedback.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountClosure[i];
        }
    }

    public AccountClosure(String portfolioId, AccountClosureFeedback accountClosureFeedback, b bVar) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(accountClosureFeedback, "accountClosureFeedback");
        this.f94849a = portfolioId;
        this.f94850b = accountClosureFeedback;
        this.f94851c = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountClosure)) {
            return false;
        }
        AccountClosure accountClosure = (AccountClosure) obj2;
        return Intrinsics.f(this.f94849a, accountClosure.f94849a) && Intrinsics.f(this.f94850b, accountClosure.f94850b) && this.f94851c == accountClosure.f94851c;
    }

    public final int hashCode() {
        int iHashCode = (this.f94850b.hashCode() + (this.f94849a.hashCode() * 31)) * 31;
        b bVar = this.f94851c;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94849a);
        this.f94850b.writeToParcel(dest, i);
        b bVar = this.f94851c;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
    }
}
