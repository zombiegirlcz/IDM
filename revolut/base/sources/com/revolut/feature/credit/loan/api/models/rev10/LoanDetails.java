package com.revolut.feature.credit.loan.api.models.rev10;

import android.os.Parcel;
import android.os.Parcelable;
import ip0.v7;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q35.a0;
import q35.e0;
import q35.l;
import q35.t;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanDetails;", "Lq35/t;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanDetails implements t, Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoanDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Loan f70144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f70145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f70146c;
    public final dj0.d d;
    public final LoanAccrual e;
    public final LoanAccrual f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LoanAccrual f70147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f70148h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LoanAutoPayRepaymentSource f70149j;
    public final LoanBackupCardPaymentSource k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f70150l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LoanUnavailableFeatures f70151m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LoanRepaymentConfig f70152n;
    public final String o;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Loan loanCreateFromParcel = Loan.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            dj0.d dVar = (dj0.d) parcel.readSerializable();
            Parcelable.Creator<LoanAccrual> creator = LoanAccrual.CREATOR;
            LoanAccrual loanAccrualCreateFromParcel = creator.createFromParcel(parcel);
            LoanAccrual loanAccrualCreateFromParcel2 = creator.createFromParcel(parcel);
            LoanAccrual loanAccrualCreateFromParcel3 = creator.createFromParcel(parcel);
            dj0.d dVar2 = (dj0.d) parcel.readSerializable();
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            LoanAutoPayRepaymentSource loanAutoPayRepaymentSourceCreateFromParcel = parcel.readInt() == 0 ? null : LoanAutoPayRepaymentSource.CREATOR.createFromParcel(parcel);
            LoanBackupCardPaymentSource loanBackupCardPaymentSourceCreateFromParcel = parcel.readInt() != 0 ? LoanBackupCardPaymentSource.CREATOR.createFromParcel(parcel) : null;
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            while (true) {
                boolean z3 = z;
                if (iA == i3) {
                    return new LoanDetails(loanCreateFromParcel, i, i2, dVar, loanAccrualCreateFromParcel, loanAccrualCreateFromParcel2, loanAccrualCreateFromParcel3, dVar2, z3, loanAutoPayRepaymentSourceCreateFromParcel, loanBackupCardPaymentSourceCreateFromParcel, arrayList, LoanUnavailableFeatures.CREATOR.createFromParcel(parcel), LoanRepaymentConfig.CREATOR.createFromParcel(parcel), parcel.readString());
                }
                iA = org.bouncycastle.jcajce.provider.digest.a.a(LoanBorrower.CREATOR, parcel, arrayList, iA, 1);
                z = z3;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanDetails[i];
        }
    }

    public LoanDetails(Loan loan, int i, int i2, dj0.d outstandingBalance, LoanAccrual accruedInterest, LoanAccrual accruedFee, LoanAccrual oneTimeFee, dj0.d monthlyRepayment, boolean z, LoanAutoPayRepaymentSource loanAutoPayRepaymentSource, LoanBackupCardPaymentSource loanBackupCardPaymentSource, List borrowers, LoanUnavailableFeatures unavailableFeatures, LoanRepaymentConfig repaymentConfig, String str) {
        Intrinsics.checkNotNullParameter(loan, "loan");
        Intrinsics.checkNotNullParameter(outstandingBalance, "outstandingBalance");
        Intrinsics.checkNotNullParameter(accruedInterest, "accruedInterest");
        Intrinsics.checkNotNullParameter(accruedFee, "accruedFee");
        Intrinsics.checkNotNullParameter(oneTimeFee, "oneTimeFee");
        Intrinsics.checkNotNullParameter(monthlyRepayment, "monthlyRepayment");
        Intrinsics.checkNotNullParameter(borrowers, "borrowers");
        Intrinsics.checkNotNullParameter(unavailableFeatures, "unavailableFeatures");
        Intrinsics.checkNotNullParameter(repaymentConfig, "repaymentConfig");
        this.f70144a = loan;
        this.f70145b = i;
        this.f70146c = i2;
        this.d = outstandingBalance;
        this.e = accruedInterest;
        this.f = accruedFee;
        this.f70147g = oneTimeFee;
        this.f70148h = monthlyRepayment;
        this.i = z;
        this.f70149j = loanAutoPayRepaymentSource;
        this.k = loanBackupCardPaymentSource;
        this.f70150l = borrowers;
        this.f70151m = unavailableFeatures;
        this.f70152n = repaymentConfig;
        this.o = str;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: J */
    public final int getF70118q() {
        return this.f70144a.f70118q;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: J0 */
    public final e0 getF70121t() {
        return this.f70144a.f70121t;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: N0 */
    public final dj0.d getD() {
        return this.f70144a.d;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: R0 */
    public final dj0.d getK() {
        return this.f70144a.k;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: T */
    public final a0 getU() {
        return this.f70144a.u;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: W */
    public final dj0.d getF70114l() {
        return this.f70144a.f70114l;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: a */
    public final dj0.d getF70110c() {
        return this.f70144a.f70110c;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: b */
    public final LocalDate getE() {
        return this.f70144a.e;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: c */
    public final dj0.d getF70113j() {
        return this.f70144a.f70113j;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: c0 */
    public final int getF70117p() {
        return this.f70144a.f70117p;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: d */
    public final dj0.d getF70115m() {
        return this.f70144a.f70115m;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: e */
    public final LoanInsuranceState getF70122w() {
        return this.f70144a.f70122w;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanDetails)) {
            return false;
        }
        LoanDetails loanDetails = (LoanDetails) obj2;
        return Intrinsics.f(this.f70144a, loanDetails.f70144a) && this.f70145b == loanDetails.f70145b && this.f70146c == loanDetails.f70146c && Intrinsics.f(this.d, loanDetails.d) && Intrinsics.f(this.e, loanDetails.e) && Intrinsics.f(this.f, loanDetails.f) && Intrinsics.f(this.f70147g, loanDetails.f70147g) && Intrinsics.f(this.f70148h, loanDetails.f70148h) && this.i == loanDetails.i && Intrinsics.f(this.f70149j, loanDetails.f70149j) && Intrinsics.f(this.k, loanDetails.k) && Intrinsics.f(this.f70150l, loanDetails.f70150l) && Intrinsics.f(this.f70151m, loanDetails.f70151m) && Intrinsics.f(this.f70152n, loanDetails.f70152n) && Intrinsics.f(this.o, loanDetails.o);
    }

    @Override // q35.t
    /* JADX INFO: renamed from: f0 */
    public final double getF70116n() {
        return this.f70144a.f70116n;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: getConfig */
    public final q35.h getF() {
        return this.f70144a.f;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: getCountryCode */
    public final wi0.b getF70112h() {
        return this.f70144a.f70112h;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: getId */
    public final String getF70108a() {
        return this.f70144a.f70108a;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: getName */
    public final String getF70109b() {
        return this.f70144a.f70109b;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: getState */
    public final LoanState getI() {
        return this.f70144a.i;
    }

    public final int hashCode() {
        int iC = j6.a.c(v7.c((this.f70147g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + v7.c(j6.a.b(this.f70146c, j6.a.b(this.f70145b, this.f70144a.hashCode() * 31, 31), 31), 31, this.d)) * 31)) * 31)) * 31, 31, this.f70148h), 31, this.i);
        LoanAutoPayRepaymentSource loanAutoPayRepaymentSource = this.f70149j;
        int iHashCode = (iC + (loanAutoPayRepaymentSource == null ? 0 : loanAutoPayRepaymentSource.hashCode())) * 31;
        LoanBackupCardPaymentSource loanBackupCardPaymentSource = this.k;
        int iHashCode2 = (this.f70152n.hashCode() + ((this.f70151m.hashCode() + p.a.d((iHashCode + (loanBackupCardPaymentSource == null ? 0 : loanBackupCardPaymentSource.hashCode())) * 31, 31, this.f70150l)) * 31)) * 31;
        String str = this.o;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // q35.t
    /* JADX INFO: renamed from: j */
    public final q35.j getF70120s() {
        return this.f70144a.f70120s;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: k0 */
    public final LoanInterestRate getF70119r() {
        return this.f70144a.f70119r;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: l */
    public final b95.a getO() {
        return this.f70144a.o;
    }

    @Override // q35.t
    public final dj0.d n1() {
        return this.f70144a.n1();
    }

    public final LoanBorrower o1() {
        Object obj2 = null;
        LoanAutoPayRepaymentSource loanAutoPayRepaymentSource = this.f70149j;
        if (loanAutoPayRepaymentSource == null) {
            return null;
        }
        Iterator it8 = this.f70150l.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (Intrinsics.f(((LoanBorrower) next).e.f70143c, loanAutoPayRepaymentSource.f70126a)) {
                obj2 = next;
                break;
            }
        }
        return (LoanBorrower) obj2;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: p0 */
    public final LocalDate getF70111g() {
        return this.f70144a.f70111g;
    }

    public final boolean p1() {
        return this.f70144a.getO() == b95.a.MORTGAGE_LOAN;
    }

    public final boolean q1() {
        return this.f70144a.getF().f241819b == q35.e.SEPA;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f70144a.writeToParcel(dest, i);
        dest.writeInt(this.f70145b);
        dest.writeInt(this.f70146c);
        dest.writeSerializable(this.d);
        this.e.writeToParcel(dest, i);
        this.f.writeToParcel(dest, i);
        this.f70147g.writeToParcel(dest, i);
        dest.writeSerializable(this.f70148h);
        dest.writeInt(this.i ? 1 : 0);
        LoanAutoPayRepaymentSource loanAutoPayRepaymentSource = this.f70149j;
        if (loanAutoPayRepaymentSource == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            loanAutoPayRepaymentSource.writeToParcel(dest, i);
        }
        LoanBackupCardPaymentSource loanBackupCardPaymentSource = this.k;
        if (loanBackupCardPaymentSource == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            loanBackupCardPaymentSource.writeToParcel(dest, i);
        }
        Iterator itV = p.a.v(this.f70150l, dest);
        while (itV.hasNext()) {
            ((LoanBorrower) itV.next()).writeToParcel(dest, i);
        }
        this.f70151m.writeToParcel(dest, i);
        this.f70152n.writeToParcel(dest, i);
        dest.writeString(this.o);
    }

    @Override // q35.t
    /* JADX INFO: renamed from: z */
    public final l getV() {
        return this.f70144a.v;
    }
}
