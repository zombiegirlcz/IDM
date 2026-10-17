package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/dashboard/AnalyticsDashboardContract$BudgetPickerAccount", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AnalyticsDashboardContract$BudgetPickerAccount implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AnalyticsDashboardContract$BudgetPickerAccount> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f87516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f87517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f87518c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AnalyticsDashboardContract$BudgetPickerAccount((AccountId) parcel.readParcelable(AnalyticsDashboardContract$BudgetPickerAccount.class.getClassLoader()), parcel.readInt() != 0, (Clause) parcel.readParcelable(AnalyticsDashboardContract$BudgetPickerAccount.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnalyticsDashboardContract$BudgetPickerAccount[i];
        }
    }

    public AnalyticsDashboardContract$BudgetPickerAccount(AccountId accountId, boolean z, Clause clause) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f87516a = accountId;
        this.f87517b = z;
        this.f87518c = clause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AnalyticsDashboardContract$BudgetPickerAccount)) {
            return false;
        }
        AnalyticsDashboardContract$BudgetPickerAccount analyticsDashboardContract$BudgetPickerAccount = (AnalyticsDashboardContract$BudgetPickerAccount) obj2;
        return Intrinsics.f(this.f87516a, analyticsDashboardContract$BudgetPickerAccount.f87516a) && this.f87517b == analyticsDashboardContract$BudgetPickerAccount.f87517b && Intrinsics.f(this.f87518c, analyticsDashboardContract$BudgetPickerAccount.f87518c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f87516a.hashCode() * 31, 31, this.f87517b);
        Clause clause = this.f87518c;
        return iC + (clause == null ? 0 : clause.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f87516a, i);
        dest.writeInt(this.f87517b ? 1 : 0);
        dest.writeParcelable(this.f87518c, i);
    }
}
