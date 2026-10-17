package com.revolut.retail.feature.api.budgeting.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Interval;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/api/budgeting/declaration/BudgetingFeatureConfig$UpcomingPayments$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_budgeting_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BudgetingFeatureConfig$UpcomingPayments$Destination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<BudgetingFeatureConfig$UpcomingPayments$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Interval f99214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f99215b;

    /* JADX INFO: loaded from: classes10.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BudgetingFeatureConfig$UpcomingPayments$Destination((Interval) parcel.readSerializable(), (AccountId) parcel.readParcelable(BudgetingFeatureConfig$UpcomingPayments$Destination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BudgetingFeatureConfig$UpcomingPayments$Destination[i];
        }
    }

    public BudgetingFeatureConfig$UpcomingPayments$Destination(Interval timeInterval, AccountId accountId) {
        Intrinsics.checkNotNullParameter(timeInterval, "timeInterval");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f99214a = timeInterval;
        this.f99215b = accountId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BudgetingFeatureConfig$UpcomingPayments$Destination)) {
            return false;
        }
        BudgetingFeatureConfig$UpcomingPayments$Destination budgetingFeatureConfig$UpcomingPayments$Destination = (BudgetingFeatureConfig$UpcomingPayments$Destination) obj2;
        return Intrinsics.f(this.f99214a, budgetingFeatureConfig$UpcomingPayments$Destination.f99214a) && Intrinsics.f(this.f99215b, budgetingFeatureConfig$UpcomingPayments$Destination.f99215b);
    }

    public final int hashCode() {
        return this.f99215b.hashCode() + (this.f99214a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f99214a);
        dest.writeParcelable(this.f99215b, i);
    }
}
