package com.revolut.feature.transaction_list.impl.ui.recurring_transfers;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import fva.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transaction_list/impl/ui/recurring_transfers/RecurringTransfersScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transaction_list_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecurringTransfersScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RecurringTransfersScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f91946c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecurringTransfersScreenContract$InputData(k.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RecurringTransfersScreenContract$InputData[i];
        }
    }

    public RecurringTransfersScreenContract$InputData(k receiverType, String receiverAccountId, String moveMoneyAccountId) {
        Intrinsics.checkNotNullParameter(receiverAccountId, "receiverAccountId");
        Intrinsics.checkNotNullParameter(moveMoneyAccountId, "moveMoneyAccountId");
        Intrinsics.checkNotNullParameter(receiverType, "receiverType");
        this.f91944a = receiverAccountId;
        this.f91945b = moveMoneyAccountId;
        this.f91946c = receiverType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RecurringTransfersScreenContract$InputData)) {
            return false;
        }
        RecurringTransfersScreenContract$InputData recurringTransfersScreenContract$InputData = (RecurringTransfersScreenContract$InputData) obj2;
        return Intrinsics.f(this.f91944a, recurringTransfersScreenContract$InputData.f91944a) && Intrinsics.f(this.f91945b, recurringTransfersScreenContract$InputData.f91945b) && this.f91946c == recurringTransfersScreenContract$InputData.f91946c;
    }

    public final int hashCode() {
        return this.f91946c.hashCode() + p.a.c(this.f91944a.hashCode() * 31, 31, this.f91945b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91944a);
        dest.writeString(this.f91945b);
        dest.writeString(this.f91946c.name());
    }
}
