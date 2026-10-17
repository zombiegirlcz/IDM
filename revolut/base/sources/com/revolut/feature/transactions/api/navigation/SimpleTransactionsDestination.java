package com.revolut.feature.transactions.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.i7;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/SimpleTransactionsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SimpleTransactionsDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<SimpleTransactionsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f91977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f91978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i7 f91979c;
    public final AccountId d;
    public final boolean e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Clause clause = (Clause) parcel.readParcelable(SimpleTransactionsDestination.class.getClassLoader());
            Clause clause2 = (Clause) parcel.readParcelable(SimpleTransactionsDestination.class.getClassLoader());
            i7 i7Var = (i7) parcel.readSerializable();
            AccountId accountId = (AccountId) parcel.readParcelable(SimpleTransactionsDestination.class.getClassLoader());
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new SimpleTransactionsDestination(clause, clause2, i7Var, accountId, z3, parcel.readInt() == 0 ? z : true);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SimpleTransactionsDestination[i];
        }
    }

    public SimpleTransactionsDestination(Clause title, Clause subtitle, i7 filter, AccountId accountId, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f91977a = title;
        this.f91978b = subtitle;
        this.f91979c = filter;
        this.d = accountId;
        this.e = z;
        this.f = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SimpleTransactionsDestination)) {
            return false;
        }
        SimpleTransactionsDestination simpleTransactionsDestination = (SimpleTransactionsDestination) obj2;
        return Intrinsics.f(this.f91977a, simpleTransactionsDestination.f91977a) && Intrinsics.f(this.f91978b, simpleTransactionsDestination.f91978b) && Intrinsics.f(this.f91979c, simpleTransactionsDestination.f91979c) && Intrinsics.f(this.d, simpleTransactionsDestination.d) && this.e == simpleTransactionsDestination.e && this.f == simpleTransactionsDestination.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(l.b(this.d, (this.f91979c.hashCode() + p.a.a(this.f91977a.hashCode() * 31, 31, this.f91978b)) * 31, 31), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91977a, i);
        dest.writeParcelable(this.f91978b, i);
        dest.writeSerializable(this.f91979c);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
    }
}
