package com.revolut.feature.payments.groups.impl.ui_chat.group_transactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.kompot.common.IOData$Input;
import do3.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/groups/impl/ui_chat/group_transactions/GroupTransactionsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GroupTransactionsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<GroupTransactionsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f79361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentGroup f79362b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GroupTransactionsScreenContract$InputData((n) parcel.readSerializable(), (PaymentGroup) parcel.readParcelable(GroupTransactionsScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupTransactionsScreenContract$InputData[i];
        }
    }

    public GroupTransactionsScreenContract$InputData(n user, PaymentGroup group) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(group, "group");
        this.f79361a = user;
        this.f79362b = group;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GroupTransactionsScreenContract$InputData)) {
            return false;
        }
        GroupTransactionsScreenContract$InputData groupTransactionsScreenContract$InputData = (GroupTransactionsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f79361a, groupTransactionsScreenContract$InputData.f79361a) && Intrinsics.f(this.f79362b, groupTransactionsScreenContract$InputData.f79362b);
    }

    public final int hashCode() {
        return this.f79362b.hashCode() + (this.f79361a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f79361a);
        dest.writeParcelable(this.f79362b, i);
    }
}
