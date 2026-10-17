package com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "EmailValidation", "EmailVerification", "EmailReview", "EmailRejected", "ResendEmailBottomSheet", "StudentStatus", "HideStudent", "IntroProductArticle", "GraduateStudent", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step$EmailRejected;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step$EmailReview;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step$EmailValidation;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step$EmailVerification;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step$GraduateStudent;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step$HideStudent;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step$IntroProductArticle;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step$ResendEmailBottomSheet;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step$StudentStatus;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StudentVerificationFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step$EmailRejected;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EmailRejected extends StudentVerificationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EmailRejected> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103274a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EmailRejected(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EmailRejected[i];
            }
        }

        public EmailRejected(String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            this.f103274a = email;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EmailRejected) && Intrinsics.f(this.f103274a, ((EmailRejected) obj2).f103274a);
        }

        public final int hashCode() {
            return this.f103274a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103274a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step$EmailReview;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EmailReview extends StudentVerificationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EmailReview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103275a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EmailReview(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EmailReview[i];
            }
        }

        public EmailReview(String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            this.f103275a = email;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EmailReview) && Intrinsics.f(this.f103275a, ((EmailReview) obj2).f103275a);
        }

        public final int hashCode() {
            return this.f103275a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103275a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step$EmailValidation;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EmailValidation extends StudentVerificationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EmailValidation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f103277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f103278c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EmailValidation(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EmailValidation[i];
            }
        }

        public EmailValidation() {
            this(null, 7);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EmailValidation)) {
                return false;
            }
            EmailValidation emailValidation = (EmailValidation) obj2;
            return Intrinsics.f(this.f103276a, emailValidation.f103276a) && this.f103277b == emailValidation.f103277b && this.f103278c == emailValidation.f103278c;
        }

        public final int hashCode() {
            String str = this.f103276a;
            return Boolean.hashCode(this.f103278c) + j6.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f103277b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103276a);
            dest.writeInt(this.f103277b ? 1 : 0);
            dest.writeInt(this.f103278c ? 1 : 0);
        }

        public EmailValidation(String str, boolean z, boolean z3) {
            this.f103276a = str;
            this.f103277b = z;
            this.f103278c = z3;
        }

        public /* synthetic */ EmailValidation(String str, int i) {
            this((i & 1) != 0 ? null : str, (i & 2) == 0, (i & 4) != 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step$EmailVerification;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EmailVerification extends StudentVerificationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EmailVerification> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f103280b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EmailVerification(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EmailVerification[i];
            }
        }

        public EmailVerification(String email, String str) {
            Intrinsics.checkNotNullParameter(email, "email");
            this.f103279a = email;
            this.f103280b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EmailVerification)) {
                return false;
            }
            EmailVerification emailVerification = (EmailVerification) obj2;
            return Intrinsics.f(this.f103279a, emailVerification.f103279a) && Intrinsics.f(this.f103280b, emailVerification.f103280b);
        }

        public final int hashCode() {
            int iHashCode = this.f103279a.hashCode() * 31;
            String str = this.f103280b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103279a);
            dest.writeString(this.f103280b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step$GraduateStudent;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GraduateStudent extends StudentVerificationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GraduateStudent f103281a = new GraduateStudent();

        @NotNull
        public static final Parcelable.Creator<GraduateStudent> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GraduateStudent.f103281a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GraduateStudent[i];
            }
        }

        private GraduateStudent() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step$HideStudent;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HideStudent extends StudentVerificationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HideStudent f103282a = new HideStudent();

        @NotNull
        public static final Parcelable.Creator<HideStudent> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HideStudent.f103282a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HideStudent[i];
            }
        }

        private HideStudent() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step$IntroProductArticle;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IntroProductArticle extends StudentVerificationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final IntroProductArticle f103283a = new IntroProductArticle();

        @NotNull
        public static final Parcelable.Creator<IntroProductArticle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IntroProductArticle.f103283a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IntroProductArticle[i];
            }
        }

        private IntroProductArticle() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step$ResendEmailBottomSheet;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ResendEmailBottomSheet extends StudentVerificationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ResendEmailBottomSheet f103284a = new ResendEmailBottomSheet();

        @NotNull
        public static final Parcelable.Creator<ResendEmailBottomSheet> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ResendEmailBottomSheet.f103284a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ResendEmailBottomSheet[i];
            }
        }

        private ResendEmailBottomSheet() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step$StudentStatus;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student_verification/StudentVerificationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StudentStatus extends StudentVerificationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<StudentStatus> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Instant f103285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f103286b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StudentStatus(parcel.readString(), (Instant) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StudentStatus[i];
            }
        }

        public StudentStatus(String str, Instant instant) {
            this.f103285a = instant;
            this.f103286b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StudentStatus)) {
                return false;
            }
            StudentStatus studentStatus = (StudentStatus) obj2;
            return Intrinsics.f(this.f103285a, studentStatus.f103285a) && Intrinsics.f(this.f103286b, studentStatus.f103286b);
        }

        public final int hashCode() {
            Instant instant = this.f103285a;
            int iHashCode = (instant == null ? 0 : instant.hashCode()) * 31;
            String str = this.f103286b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f103285a);
            dest.writeString(this.f103286b);
        }
    }

    private StudentVerificationFlowContract$Step() {
    }
}
