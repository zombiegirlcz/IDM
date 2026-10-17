package com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.upcoming_payments;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Interval;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/impl/budgeting/ui/rev10/goals/upcoming_payments/UpcomingPaymentsContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UpcomingPaymentsContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<UpcomingPaymentsContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Interval f101526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f101527b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UpcomingPaymentsContract$InputData((Interval) parcel.readSerializable(), (AccountId) parcel.readParcelable(UpcomingPaymentsContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UpcomingPaymentsContract$InputData[i];
        }
    }

    public UpcomingPaymentsContract$InputData(Interval timeInterval, AccountId accountId) {
        Intrinsics.checkNotNullParameter(timeInterval, "timeInterval");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f101526a = timeInterval;
        this.f101527b = accountId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UpcomingPaymentsContract$InputData)) {
            return false;
        }
        UpcomingPaymentsContract$InputData upcomingPaymentsContract$InputData = (UpcomingPaymentsContract$InputData) obj2;
        return Intrinsics.f(this.f101526a, upcomingPaymentsContract$InputData.f101526a) && Intrinsics.f(this.f101527b, upcomingPaymentsContract$InputData.f101527b);
    }

    public final int hashCode() {
        return this.f101527b.hashCode() + (this.f101526a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f101526a);
        dest.writeParcelable(this.f101527b, i);
    }
}
