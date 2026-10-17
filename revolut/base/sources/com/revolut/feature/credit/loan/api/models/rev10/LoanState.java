package com.revolut.feature.credit.loan.api.models.rev10;

import android.os.Parcel;
import android.os.Parcelable;
import ip0.v7;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanState;", "Landroid/os/Parcelable;", "Healthy", "Overdue", "Outstanding", "Forbearance", "Cancelled", "Terminated", "Planned", "Repaid", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanState$Cancelled;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanState$Forbearance;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanState$Healthy;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanState$Outstanding;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanState$Overdue;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanState$Planned;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanState$Repaid;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanState$Terminated;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LoanState extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanState$Cancelled;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanState;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cancelled implements LoanState {

        @NotNull
        public static final Parcelable.Creator<Cancelled> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f70185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LoanAccrual f70186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f70187c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Cancelled((dj0.d) parcel.readSerializable(), LoanAccrual.CREATOR.createFromParcel(parcel), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cancelled[i];
            }
        }

        public Cancelled(dj0.d principal, LoanAccrual accruedInterest, LocalDate dueDate) {
            Intrinsics.checkNotNullParameter(principal, "principal");
            Intrinsics.checkNotNullParameter(accruedInterest, "accruedInterest");
            Intrinsics.checkNotNullParameter(dueDate, "dueDate");
            this.f70185a = principal;
            this.f70186b = accruedInterest;
            this.f70187c = dueDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Cancelled)) {
                return false;
            }
            Cancelled cancelled = (Cancelled) obj2;
            return Intrinsics.f(this.f70185a, cancelled.f70185a) && Intrinsics.f(this.f70186b, cancelled.f70186b) && Intrinsics.f(this.f70187c, cancelled.f70187c);
        }

        public final int hashCode() {
            return this.f70187c.hashCode() + ((this.f70186b.hashCode() + (this.f70185a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f70185a);
            this.f70186b.writeToParcel(dest, i);
            dest.writeSerializable(this.f70187c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanState$Forbearance;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanState;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/credit/loan/api/models/rev10/j", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Forbearance implements LoanState {

        @NotNull
        public static final Parcelable.Creator<Forbearance> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f70188a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Forbearance(j.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Forbearance[i];
            }
        }

        public Forbearance(j type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f70188a = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Forbearance) && this.f70188a == ((Forbearance) obj2).f70188a;
        }

        public final int hashCode() {
            return this.f70188a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70188a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanState$Healthy;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanState;", "<init>", "()V", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Healthy implements LoanState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Healthy f70189a = new Healthy();

        @NotNull
        public static final Parcelable.Creator<Healthy> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Healthy.f70189a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Healthy[i];
            }
        }

        private Healthy() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanState$Outstanding;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanState;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Outstanding implements LoanState {

        @NotNull
        public static final Parcelable.Creator<Outstanding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f70190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dj0.d f70191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dj0.d f70192c;
        public final LoanAccrual d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Outstanding((dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), LoanAccrual.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Outstanding[i];
            }
        }

        public Outstanding(dj0.d total, dj0.d principal, dj0.d dVar, LoanAccrual accruedInterest) {
            Intrinsics.checkNotNullParameter(total, "total");
            Intrinsics.checkNotNullParameter(principal, "principal");
            Intrinsics.checkNotNullParameter(accruedInterest, "accruedInterest");
            this.f70190a = total;
            this.f70191b = principal;
            this.f70192c = dVar;
            this.d = accruedInterest;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Outstanding)) {
                return false;
            }
            Outstanding outstanding = (Outstanding) obj2;
            return Intrinsics.f(this.f70190a, outstanding.f70190a) && Intrinsics.f(this.f70191b, outstanding.f70191b) && Intrinsics.f(this.f70192c, outstanding.f70192c) && Intrinsics.f(this.d, outstanding.d);
        }

        public final int hashCode() {
            int iC = v7.c(this.f70190a.hashCode() * 31, 31, this.f70191b);
            dj0.d dVar = this.f70192c;
            return this.d.hashCode() + ((iC + (dVar == null ? 0 : dVar.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f70190a);
            dest.writeSerializable(this.f70191b);
            dest.writeSerializable(this.f70192c);
            this.d.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanState$Overdue;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanState;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/credit/loan/api/models/rev10/k", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Overdue implements LoanState {

        @NotNull
        public static final Parcelable.Creator<Overdue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f70193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dj0.d f70194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dj0.d f70195c;
        public final LoanAccrual d;
        public final LoanAccrual e;
        public final k f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                dj0.d dVar = (dj0.d) parcel.readSerializable();
                dj0.d dVar2 = (dj0.d) parcel.readSerializable();
                dj0.d dVar3 = (dj0.d) parcel.readSerializable();
                Parcelable.Creator<LoanAccrual> creator = LoanAccrual.CREATOR;
                return new Overdue(dVar, dVar2, dVar3, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), k.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Overdue[i];
            }
        }

        public Overdue(dj0.d total, dj0.d principal, dj0.d dVar, LoanAccrual accruedInterest, LoanAccrual loanAccrual, k latePaymentRisk) {
            Intrinsics.checkNotNullParameter(total, "total");
            Intrinsics.checkNotNullParameter(principal, "principal");
            Intrinsics.checkNotNullParameter(accruedInterest, "accruedInterest");
            Intrinsics.checkNotNullParameter(latePaymentRisk, "latePaymentRisk");
            this.f70193a = total;
            this.f70194b = principal;
            this.f70195c = dVar;
            this.d = accruedInterest;
            this.e = loanAccrual;
            this.f = latePaymentRisk;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Overdue)) {
                return false;
            }
            Overdue overdue = (Overdue) obj2;
            return Intrinsics.f(this.f70193a, overdue.f70193a) && Intrinsics.f(this.f70194b, overdue.f70194b) && Intrinsics.f(this.f70195c, overdue.f70195c) && Intrinsics.f(this.d, overdue.d) && Intrinsics.f(this.e, overdue.e) && this.f == overdue.f;
        }

        public final int hashCode() {
            int iC = v7.c(this.f70193a.hashCode() * 31, 31, this.f70194b);
            dj0.d dVar = this.f70195c;
            int iHashCode = (this.d.hashCode() + ((iC + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31;
            LoanAccrual loanAccrual = this.e;
            return this.f.hashCode() + ((iHashCode + (loanAccrual != null ? loanAccrual.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f70193a);
            dest.writeSerializable(this.f70194b);
            dest.writeSerializable(this.f70195c);
            this.d.writeToParcel(dest, i);
            LoanAccrual loanAccrual = this.e;
            if (loanAccrual == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                loanAccrual.writeToParcel(dest, i);
            }
            dest.writeString(this.f.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanState$Planned;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanState;", "<init>", "()V", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Planned implements LoanState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Planned f70196a = new Planned();

        @NotNull
        public static final Parcelable.Creator<Planned> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Planned.f70196a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Planned[i];
            }
        }

        private Planned() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanState$Repaid;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanState;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Repaid implements LoanState {

        @NotNull
        public static final Parcelable.Creator<Repaid> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f70197a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Repaid((LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Repaid[i];
            }
        }

        public Repaid(LocalDate repaidDate) {
            Intrinsics.checkNotNullParameter(repaidDate, "repaidDate");
            this.f70197a = repaidDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Repaid) && Intrinsics.f(this.f70197a, ((Repaid) obj2).f70197a);
        }

        public final int hashCode() {
            return this.f70197a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f70197a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanState$Terminated;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanState;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Terminated implements LoanState {

        @NotNull
        public static final Parcelable.Creator<Terminated> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f70198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LoanAccrual f70199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f70200c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Terminated((dj0.d) parcel.readSerializable(), parcel.readInt() == 0 ? null : LoanAccrual.CREATOR.createFromParcel(parcel), (LocalDate) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Terminated[i];
            }
        }

        public Terminated(dj0.d lateTotal, LoanAccrual loanAccrual, LocalDate terminationDate, String str) {
            Intrinsics.checkNotNullParameter(lateTotal, "lateTotal");
            Intrinsics.checkNotNullParameter(terminationDate, "terminationDate");
            this.f70198a = lateTotal;
            this.f70199b = loanAccrual;
            this.f70200c = terminationDate;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Terminated)) {
                return false;
            }
            Terminated terminated = (Terminated) obj2;
            return Intrinsics.f(this.f70198a, terminated.f70198a) && Intrinsics.f(this.f70199b, terminated.f70199b) && Intrinsics.f(this.f70200c, terminated.f70200c) && Intrinsics.f(this.d, terminated.d);
        }

        public final int hashCode() {
            int iHashCode = this.f70198a.hashCode() * 31;
            LoanAccrual loanAccrual = this.f70199b;
            int iA = y.a((iHashCode + (loanAccrual == null ? 0 : loanAccrual.hashCode())) * 31, 31, this.f70200c);
            String str = this.d;
            return iA + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f70198a);
            LoanAccrual loanAccrual = this.f70199b;
            if (loanAccrual == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                loanAccrual.writeToParcel(dest, i);
            }
            dest.writeSerializable(this.f70200c);
            dest.writeString(this.d);
        }
    }
}
