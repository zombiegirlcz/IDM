package com.revolut.feature.credit.loan.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n35.c;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/LoanRepaymentDayChangeTerms;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "n35/c", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanRepaymentDayChangeTerms implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoanRepaymentDayChangeTerms> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f70076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f70077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f70078c;
    public final d d;
    public final LocalDate e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f70079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f70080h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoanRepaymentDayChangeTerms((d) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), parcel.readInt(), c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanRepaymentDayChangeTerms[i];
        }
    }

    public LoanRepaymentDayChangeTerms(d monthlyRepayment, LocalDate firstRepaymentDate, d firstRepayment, d finalRepaymentAmount, LocalDate lastRepaymentDate, LocalDate localDate, int i, c repaymentType) {
        Intrinsics.checkNotNullParameter(monthlyRepayment, "monthlyRepayment");
        Intrinsics.checkNotNullParameter(firstRepaymentDate, "firstRepaymentDate");
        Intrinsics.checkNotNullParameter(firstRepayment, "firstRepayment");
        Intrinsics.checkNotNullParameter(finalRepaymentAmount, "finalRepaymentAmount");
        Intrinsics.checkNotNullParameter(lastRepaymentDate, "lastRepaymentDate");
        Intrinsics.checkNotNullParameter(repaymentType, "repaymentType");
        this.f70076a = monthlyRepayment;
        this.f70077b = firstRepaymentDate;
        this.f70078c = firstRepayment;
        this.d = finalRepaymentAmount;
        this.e = lastRepaymentDate;
        this.f = localDate;
        this.f70079g = i;
        this.f70080h = repaymentType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d getF70078c() {
        return this.f70078c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getF70077b() {
        return this.f70077b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getF70076a() {
        return this.f70076a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getF70079g() {
        return this.f70079g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanRepaymentDayChangeTerms)) {
            return false;
        }
        LoanRepaymentDayChangeTerms loanRepaymentDayChangeTerms = (LoanRepaymentDayChangeTerms) obj2;
        return Intrinsics.f(this.f70076a, loanRepaymentDayChangeTerms.f70076a) && Intrinsics.f(this.f70077b, loanRepaymentDayChangeTerms.f70077b) && Intrinsics.f(this.f70078c, loanRepaymentDayChangeTerms.f70078c) && Intrinsics.f(this.d, loanRepaymentDayChangeTerms.d) && Intrinsics.f(this.e, loanRepaymentDayChangeTerms.e) && Intrinsics.f(this.f, loanRepaymentDayChangeTerms.f) && this.f70079g == loanRepaymentDayChangeTerms.f70079g && this.f70080h == loanRepaymentDayChangeTerms.f70080h;
    }

    public final int hashCode() {
        int iA = y.a(v7.c(v7.c(y.a(this.f70076a.hashCode() * 31, 31, this.f70077b), 31, this.f70078c), 31, this.d), 31, this.e);
        LocalDate localDate = this.f;
        return this.f70080h.hashCode() + j6.a.b(this.f70079g, (iA + (localDate == null ? 0 : localDate.hashCode())) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f70076a);
        dest.writeSerializable(this.f70077b);
        dest.writeSerializable(this.f70078c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeInt(this.f70079g);
        dest.writeString(this.f70080h.name());
    }
}
