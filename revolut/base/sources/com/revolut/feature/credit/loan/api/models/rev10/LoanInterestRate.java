package com.revolut.feature.credit.loan.api.models.rev10;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanInterestRate;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "Fixed", "TemporaryFixed", "Variable", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanInterestRate$Fixed;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanInterestRate$TemporaryFixed;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanInterestRate$Variable;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LoanInterestRate extends Parcelable, Serializable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanInterestRate$Fixed;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanInterestRate;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Fixed implements LoanInterestRate {

        @NotNull
        public static final Parcelable.Creator<Fixed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f70165b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Fixed(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Fixed[i];
            }
        }

        public Fixed(String totalRate, String str) {
            Intrinsics.checkNotNullParameter(totalRate, "totalRate");
            this.f70164a = totalRate;
            this.f70165b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Fixed)) {
                return false;
            }
            Fixed fixed = (Fixed) obj2;
            return Intrinsics.f(this.f70164a, fixed.f70164a) && Intrinsics.f(this.f70165b, fixed.f70165b);
        }

        public final int hashCode() {
            int iHashCode = this.f70164a.hashCode() * 31;
            String str = this.f70165b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // com.revolut.feature.credit.loan.api.models.rev10.LoanInterestRate
        /* JADX INFO: renamed from: l2, reason: from getter */
        public final String getF70169a() {
            return this.f70164a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70164a);
            dest.writeString(this.f70165b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanInterestRate$TemporaryFixed;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanInterestRate;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/credit/loan/api/models/rev10/f", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TemporaryFixed implements LoanInterestRate {

        @NotNull
        public static final Parcelable.Creator<TemporaryFixed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f70167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f70168c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TemporaryFixed(parcel.readString(), f.valueOf(parcel.readString()), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TemporaryFixed[i];
            }
        }

        public TemporaryFixed(String totalRate, f fixedRatePeriodType, LocalDate localDate) {
            Intrinsics.checkNotNullParameter(totalRate, "totalRate");
            Intrinsics.checkNotNullParameter(fixedRatePeriodType, "fixedRatePeriodType");
            this.f70166a = totalRate;
            this.f70167b = fixedRatePeriodType;
            this.f70168c = localDate;
        }

        public final int a() {
            int i = g.f70207a[this.f70167b.ordinal()];
            if (i == 1) {
                return 3;
            }
            if (i == 2) {
                return 5;
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TemporaryFixed)) {
                return false;
            }
            TemporaryFixed temporaryFixed = (TemporaryFixed) obj2;
            return Intrinsics.f(this.f70166a, temporaryFixed.f70166a) && this.f70167b == temporaryFixed.f70167b && Intrinsics.f(this.f70168c, temporaryFixed.f70168c);
        }

        public final int hashCode() {
            int iHashCode = (this.f70167b.hashCode() + (this.f70166a.hashCode() * 31)) * 31;
            LocalDate localDate = this.f70168c;
            return iHashCode + (localDate == null ? 0 : localDate.hashCode());
        }

        @Override // com.revolut.feature.credit.loan.api.models.rev10.LoanInterestRate
        /* JADX INFO: renamed from: l2, reason: from getter */
        public final String getF70169a() {
            return this.f70166a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70166a);
            dest.writeString(this.f70167b.name());
            dest.writeSerializable(this.f70168c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanInterestRate$Variable;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanInterestRate;", "", "toString", "()Ljava/lang/String;", "BaseRate", "com/revolut/feature/credit/loan/api/models/rev10/i", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Variable implements LoanInterestRate {

        @NotNull
        public static final Parcelable.Creator<Variable> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BaseRate f70170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f70171c;
        public final LocalDate d;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanInterestRate$Variable$BaseRate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class BaseRate implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<BaseRate> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f70172a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final LocalDate f70173b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f70174c;
            public final i d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new BaseRate(parcel.readString(), (LocalDate) parcel.readSerializable(), parcel.readString(), i.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new BaseRate[i];
                }
            }

            public BaseRate(String id10, LocalDate effectiveDate, String rate, i rateType) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(effectiveDate, "effectiveDate");
                Intrinsics.checkNotNullParameter(rate, "rate");
                Intrinsics.checkNotNullParameter(rateType, "rateType");
                this.f70172a = id10;
                this.f70173b = effectiveDate;
                this.f70174c = rate;
                this.d = rateType;
            }

            public final int a() {
                int i = h.f70208a[this.d.ordinal()];
                if (i == 1) {
                    return 3;
                }
                if (i == 2) {
                    return 6;
                }
                throw new NoWhenBranchMatchedException();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof BaseRate)) {
                    return false;
                }
                BaseRate baseRate = (BaseRate) obj2;
                return Intrinsics.f(this.f70172a, baseRate.f70172a) && Intrinsics.f(this.f70173b, baseRate.f70173b) && Intrinsics.f(this.f70174c, baseRate.f70174c) && this.d == baseRate.d;
            }

            public final int hashCode() {
                return this.d.hashCode() + p.a.c(y.a(this.f70172a.hashCode() * 31, 31, this.f70173b), 31, this.f70174c);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f70172a);
                dest.writeSerializable(this.f70173b);
                dest.writeString(this.f70174c);
                dest.writeString(this.d.name());
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Variable(parcel.readString(), parcel.readInt() == 0 ? null : BaseRate.CREATOR.createFromParcel(parcel), parcel.readString(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Variable[i];
            }
        }

        public Variable(String totalRate, BaseRate baseRate, String str, LocalDate localDate) {
            Intrinsics.checkNotNullParameter(totalRate, "totalRate");
            this.f70169a = totalRate;
            this.f70170b = baseRate;
            this.f70171c = str;
            this.d = localDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Variable)) {
                return false;
            }
            Variable variable = (Variable) obj2;
            return Intrinsics.f(this.f70169a, variable.f70169a) && Intrinsics.f(this.f70170b, variable.f70170b) && Intrinsics.f(this.f70171c, variable.f70171c) && Intrinsics.f(this.d, variable.d);
        }

        public final int hashCode() {
            int iHashCode = this.f70169a.hashCode() * 31;
            BaseRate baseRate = this.f70170b;
            int iHashCode2 = (iHashCode + (baseRate == null ? 0 : baseRate.hashCode())) * 31;
            String str = this.f70171c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            LocalDate localDate = this.d;
            return iHashCode3 + (localDate != null ? localDate.hashCode() : 0);
        }

        @Override // com.revolut.feature.credit.loan.api.models.rev10.LoanInterestRate
        /* JADX INFO: renamed from: l2, reason: from getter */
        public final String getF70169a() {
            return this.f70169a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70169a);
            BaseRate baseRate = this.f70170b;
            if (baseRate == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                baseRate.writeToParcel(dest, i);
            }
            dest.writeString(this.f70171c);
            dest.writeSerializable(this.d);
        }
    }

    static boolean y9(wi0.b country) {
        Intrinsics.checkNotNullParameter(country, "country");
        wi0.b.Companion.getClass();
        return !Intrinsics.f(country, wi0.b.L0);
    }

    /* JADX INFO: renamed from: l2 */
    String getF70169a();
}
