package com.revolut.feature.retail.salary_account.impl.flow.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "SalaryHub", "MoveSalary", "IncomeInsuranceClaim", "Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$InputData$IncomeInsuranceClaim;", "Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$InputData$MoveSalary;", "Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$InputData$SalaryHub;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SalaryAccountFlowContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$InputData$IncomeInsuranceClaim;", "Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$InputData;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IncomeInsuranceClaim implements SalaryAccountFlowContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final IncomeInsuranceClaim f82966a = new IncomeInsuranceClaim();

        @NotNull
        public static final Parcelable.Creator<IncomeInsuranceClaim> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IncomeInsuranceClaim.f82966a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IncomeInsuranceClaim[i];
            }
        }

        private IncomeInsuranceClaim() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$InputData$MoveSalary;", "Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$InputData;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MoveSalary implements SalaryAccountFlowContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MoveSalary f82967a = new MoveSalary();

        @NotNull
        public static final Parcelable.Creator<MoveSalary> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MoveSalary.f82967a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveSalary[i];
            }
        }

        private MoveSalary() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$InputData$SalaryHub;", "Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$InputData;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SalaryHub implements SalaryAccountFlowContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SalaryHub f82968a = new SalaryHub();

        @NotNull
        public static final Parcelable.Creator<SalaryHub> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SalaryHub.f82968a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SalaryHub[i];
            }
        }

        private SalaryHub() {
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
