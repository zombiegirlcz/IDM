package com.revolut.feature.subscriptions.impl.mark_recurring;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/subscriptions/impl/mark_recurring/MarkRecurringTransactionsContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MarkRecurringTransactionsContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarkRecurringTransactionsContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f89215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89216b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarkRecurringTransactionsContract$Configuration((AccountId) parcel.readParcelable(MarkRecurringTransactionsContract$Configuration.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MarkRecurringTransactionsContract$Configuration[i];
        }
    }

    public MarkRecurringTransactionsContract$Configuration(AccountId accountId, String str) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f89215a = accountId;
        this.f89216b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MarkRecurringTransactionsContract$Configuration)) {
            return false;
        }
        MarkRecurringTransactionsContract$Configuration markRecurringTransactionsContract$Configuration = (MarkRecurringTransactionsContract$Configuration) obj2;
        return Intrinsics.f(this.f89215a, markRecurringTransactionsContract$Configuration.f89215a) && Intrinsics.f(this.f89216b, markRecurringTransactionsContract$Configuration.f89216b);
    }

    public final int hashCode() {
        int iHashCode = this.f89215a.hashCode() * 31;
        String str = this.f89216b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f89215a, i);
        dest.writeString(this.f89216b);
    }
}
