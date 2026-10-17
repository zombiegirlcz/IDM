package com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/retail/salary_account/impl/switch_assistant/payroll_platform/work_email_input/PayrollPlatformEmailInputContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "UpdatePayrollPlatform", "AccountToWorkEmail", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/payroll_platform/work_email_input/PayrollPlatformEmailInputContract$InputData$AccountToWorkEmail;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/payroll_platform/work_email_input/PayrollPlatformEmailInputContract$InputData$UpdatePayrollPlatform;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PayrollPlatformEmailInputContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/payroll_platform/work_email_input/PayrollPlatformEmailInputContract$InputData$AccountToWorkEmail;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/payroll_platform/work_email_input/PayrollPlatformEmailInputContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountToWorkEmail implements PayrollPlatformEmailInputContract$InputData {

        @NotNull
        public static final Parcelable.Creator<AccountToWorkEmail> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83057a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountToWorkEmail(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountToWorkEmail[i];
            }
        }

        public AccountToWorkEmail(String requestId) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            this.f83057a = requestId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountToWorkEmail) && Intrinsics.f(this.f83057a, ((AccountToWorkEmail) obj2).f83057a);
        }

        public final int hashCode() {
            return this.f83057a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83057a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/payroll_platform/work_email_input/PayrollPlatformEmailInputContract$InputData$UpdatePayrollPlatform;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/payroll_platform/work_email_input/PayrollPlatformEmailInputContract$InputData;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UpdatePayrollPlatform implements PayrollPlatformEmailInputContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UpdatePayrollPlatform f83058a = new UpdatePayrollPlatform();

        @NotNull
        public static final Parcelable.Creator<UpdatePayrollPlatform> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UpdatePayrollPlatform.f83058a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdatePayrollPlatform[i];
            }
        }

        private UpdatePayrollPlatform() {
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
