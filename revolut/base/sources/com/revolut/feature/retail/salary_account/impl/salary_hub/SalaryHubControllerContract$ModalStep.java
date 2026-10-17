package com.revolut.feature.retail.salary_account.impl.salary_hub;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/retail/salary_account/impl/salary_hub/SalaryHubControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SwitchSalary", "PrioritySupport", "Lcom/revolut/feature/retail/salary_account/impl/salary_hub/SalaryHubControllerContract$ModalStep$PrioritySupport;", "Lcom/revolut/feature/retail/salary_account/impl/salary_hub/SalaryHubControllerContract$ModalStep$SwitchSalary;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SalaryHubControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/salary_hub/SalaryHubControllerContract$ModalStep$PrioritySupport;", "Lcom/revolut/feature/retail/salary_account/impl/salary_hub/SalaryHubControllerContract$ModalStep;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PrioritySupport implements SalaryHubControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PrioritySupport f82989a = new PrioritySupport();

        @NotNull
        public static final Parcelable.Creator<PrioritySupport> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PrioritySupport.f82989a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrioritySupport[i];
            }
        }

        private PrioritySupport() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/salary_hub/SalaryHubControllerContract$ModalStep$SwitchSalary;", "Lcom/revolut/feature/retail/salary_account/impl/salary_hub/SalaryHubControllerContract$ModalStep;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SwitchSalary implements SalaryHubControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SwitchSalary f82990a = new SwitchSalary();

        @NotNull
        public static final Parcelable.Creator<SwitchSalary> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SwitchSalary.f82990a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SwitchSalary[i];
            }
        }

        private SwitchSalary() {
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
}
