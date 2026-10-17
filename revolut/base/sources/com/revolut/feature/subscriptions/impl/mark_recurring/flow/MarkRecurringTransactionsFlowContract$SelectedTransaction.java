package com.revolut.feature.subscriptions.impl.mark_recurring.flow;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/subscriptions/impl/mark_recurring/flow/MarkRecurringTransactionsFlowContract$SelectedTransaction", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MarkRecurringTransactionsFlowContract$SelectedTransaction implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<MarkRecurringTransactionsFlowContract$SelectedTransaction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89218b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarkRecurringTransactionsFlowContract$SelectedTransaction(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MarkRecurringTransactionsFlowContract$SelectedTransaction[i];
        }
    }

    public MarkRecurringTransactionsFlowContract$SelectedTransaction(String groupId, String str) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f89217a = groupId;
        this.f89218b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MarkRecurringTransactionsFlowContract$SelectedTransaction)) {
            return false;
        }
        MarkRecurringTransactionsFlowContract$SelectedTransaction markRecurringTransactionsFlowContract$SelectedTransaction = (MarkRecurringTransactionsFlowContract$SelectedTransaction) obj2;
        return Intrinsics.f(this.f89217a, markRecurringTransactionsFlowContract$SelectedTransaction.f89217a) && Intrinsics.f(this.f89218b, markRecurringTransactionsFlowContract$SelectedTransaction.f89218b);
    }

    public final int hashCode() {
        int iHashCode = this.f89217a.hashCode() * 31;
        String str = this.f89218b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f89217a);
        dest.writeString(this.f89218b);
    }
}
