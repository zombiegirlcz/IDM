package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/dashboard/AnalyticsDashboardContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "BudgetAccountPicker", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/dashboard/AnalyticsDashboardContract$ModalStep$BudgetAccountPicker;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AnalyticsDashboardContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/dashboard/AnalyticsDashboardContract$ModalStep$BudgetAccountPicker;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/dashboard/AnalyticsDashboardContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BudgetAccountPicker extends AnalyticsDashboardContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BudgetAccountPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f87524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnalyticsDashboardContract$DashboardUserData f87525b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(AnalyticsDashboardContract$BudgetPickerAccount.CREATOR, parcel, arrayList, iA, 1);
                }
                return new BudgetAccountPicker(arrayList, parcel.readInt() == 0 ? null : AnalyticsDashboardContract$DashboardUserData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BudgetAccountPicker[i];
            }
        }

        public BudgetAccountPicker(ArrayList accounts, AnalyticsDashboardContract$DashboardUserData analyticsDashboardContract$DashboardUserData) {
            Intrinsics.checkNotNullParameter(accounts, "accounts");
            this.f87524a = accounts;
            this.f87525b = analyticsDashboardContract$DashboardUserData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BudgetAccountPicker)) {
                return false;
            }
            BudgetAccountPicker budgetAccountPicker = (BudgetAccountPicker) obj2;
            return this.f87524a.equals(budgetAccountPicker.f87524a) && Intrinsics.f(this.f87525b, budgetAccountPicker.f87525b);
        }

        public final int hashCode() {
            int iHashCode = this.f87524a.hashCode() * 31;
            AnalyticsDashboardContract$DashboardUserData analyticsDashboardContract$DashboardUserData = this.f87525b;
            return iHashCode + (analyticsDashboardContract$DashboardUserData == null ? 0 : analyticsDashboardContract$DashboardUserData.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f87524a, dest);
            while (itY.hasNext()) {
                ((AnalyticsDashboardContract$BudgetPickerAccount) itY.next()).writeToParcel(dest, i);
            }
            AnalyticsDashboardContract$DashboardUserData analyticsDashboardContract$DashboardUserData = this.f87525b;
            if (analyticsDashboardContract$DashboardUserData == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                analyticsDashboardContract$DashboardUserData.writeToParcel(dest, i);
            }
        }
    }

    private AnalyticsDashboardContract$ModalStep() {
    }
}
