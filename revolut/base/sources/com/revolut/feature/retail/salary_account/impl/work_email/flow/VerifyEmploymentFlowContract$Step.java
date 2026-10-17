package com.revolut.feature.retail.salary_account.impl.work_email.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/retail/salary_account/impl/work_email/flow/VerifyEmploymentFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "VerifyEmployment", "VerificationInProgress", "SalaryDetails", "PromotionInactive", "Lcom/revolut/feature/retail/salary_account/impl/work_email/flow/VerifyEmploymentFlowContract$Step$PromotionInactive;", "Lcom/revolut/feature/retail/salary_account/impl/work_email/flow/VerifyEmploymentFlowContract$Step$SalaryDetails;", "Lcom/revolut/feature/retail/salary_account/impl/work_email/flow/VerifyEmploymentFlowContract$Step$VerificationInProgress;", "Lcom/revolut/feature/retail/salary_account/impl/work_email/flow/VerifyEmploymentFlowContract$Step$VerifyEmployment;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class VerifyEmploymentFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/work_email/flow/VerifyEmploymentFlowContract$Step$PromotionInactive;", "Lcom/revolut/feature/retail/salary_account/impl/work_email/flow/VerifyEmploymentFlowContract$Step;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PromotionInactive extends VerifyEmploymentFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PromotionInactive f83063a = new PromotionInactive();

        @NotNull
        public static final Parcelable.Creator<PromotionInactive> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PromotionInactive.f83063a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PromotionInactive[i];
            }
        }

        private PromotionInactive() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/work_email/flow/VerifyEmploymentFlowContract$Step$SalaryDetails;", "Lcom/revolut/feature/retail/salary_account/impl/work_email/flow/VerifyEmploymentFlowContract$Step;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SalaryDetails extends VerifyEmploymentFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SalaryDetails f83064a = new SalaryDetails();

        @NotNull
        public static final Parcelable.Creator<SalaryDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SalaryDetails.f83064a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SalaryDetails[i];
            }
        }

        private SalaryDetails() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/work_email/flow/VerifyEmploymentFlowContract$Step$VerificationInProgress;", "Lcom/revolut/feature/retail/salary_account/impl/work_email/flow/VerifyEmploymentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VerificationInProgress extends VerifyEmploymentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<VerificationInProgress> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f83066b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VerificationInProgress(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VerificationInProgress[i];
            }
        }

        public VerificationInProgress(String str, String str2) {
            this.f83065a = str;
            this.f83066b = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof VerificationInProgress)) {
                return false;
            }
            VerificationInProgress verificationInProgress = (VerificationInProgress) obj2;
            return Intrinsics.f(this.f83065a, verificationInProgress.f83065a) && Intrinsics.f(this.f83066b, verificationInProgress.f83066b);
        }

        public final int hashCode() {
            String str = this.f83065a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f83066b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83065a);
            dest.writeString(this.f83066b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/work_email/flow/VerifyEmploymentFlowContract$Step$VerifyEmployment;", "Lcom/revolut/feature/retail/salary_account/impl/work_email/flow/VerifyEmploymentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VerifyEmployment extends VerifyEmploymentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<VerifyEmployment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f83067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f83068b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VerifyEmployment(parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VerifyEmployment[i];
            }
        }

        public VerifyEmployment(boolean z, String str) {
            this.f83067a = z;
            this.f83068b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof VerifyEmployment)) {
                return false;
            }
            VerifyEmployment verifyEmployment = (VerifyEmployment) obj2;
            return this.f83067a == verifyEmployment.f83067a && Intrinsics.f(this.f83068b, verifyEmployment.f83068b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f83067a) * 31;
            String str = this.f83068b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f83067a ? 1 : 0);
            dest.writeString(this.f83068b);
        }
    }

    private VerifyEmploymentFlowContract$Step() {
    }
}
