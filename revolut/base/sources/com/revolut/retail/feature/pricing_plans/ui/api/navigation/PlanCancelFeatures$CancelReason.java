package com.revolut.retail.feature.pricing_plans.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import hha.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanCancelFeatures$CancelReason", "Landroid/os/Parcelable;", "<init>", "()V", "CloseAccount", "StandardPlan", "LowerPaidPlan", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanCancelFeatures$CancelReason$CloseAccount;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanCancelFeatures$CancelReason$LowerPaidPlan;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanCancelFeatures$CancelReason$StandardPlan;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PlanCancelFeatures$CancelReason implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanCancelFeatures$CancelReason$CloseAccount;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanCancelFeatures$CancelReason;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CloseAccount extends PlanCancelFeatures$CancelReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CloseAccount f102909a = new CloseAccount();

        @NotNull
        public static final Parcelable.Creator<CloseAccount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CloseAccount.f102909a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CloseAccount[i];
            }
        }

        private CloseAccount() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanCancelFeatures$CancelReason$LowerPaidPlan;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanCancelFeatures$CancelReason;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LowerPaidPlan extends PlanCancelFeatures$CancelReason {

        @NotNull
        public static final Parcelable.Creator<LowerPaidPlan> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f102911b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LowerPaidPlan(parcel.readString(), i.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LowerPaidPlan[i];
            }
        }

        public LowerPaidPlan(String planId, i selectedBilling) {
            Intrinsics.checkNotNullParameter(planId, "planId");
            Intrinsics.checkNotNullParameter(selectedBilling, "selectedBilling");
            this.f102910a = planId;
            this.f102911b = selectedBilling;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LowerPaidPlan)) {
                return false;
            }
            LowerPaidPlan lowerPaidPlan = (LowerPaidPlan) obj2;
            return Intrinsics.f(this.f102910a, lowerPaidPlan.f102910a) && this.f102911b == lowerPaidPlan.f102911b;
        }

        public final int hashCode() {
            return this.f102911b.hashCode() + (this.f102910a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102910a);
            dest.writeString(this.f102911b.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanCancelFeatures$CancelReason$StandardPlan;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanCancelFeatures$CancelReason;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StandardPlan extends PlanCancelFeatures$CancelReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StandardPlan f102912a = new StandardPlan();

        @NotNull
        public static final Parcelable.Creator<StandardPlan> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StandardPlan.f102912a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StandardPlan[i];
            }
        }

        private StandardPlan() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private PlanCancelFeatures$CancelReason() {
    }
}
