package com.revolut.feature.credit.loan.api.models.rev10;

import android.os.Parcel;
import android.os.Parcelable;
import ip0.v7;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q35.a0;
import q35.e0;
import q35.l;
import q35.t;
import wp5.y;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/Loan;", "Lq35/t;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Loan implements t, Parcelable {

    @NotNull
    public static final Parcelable.Creator<Loan> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f70110c;
    public final dj0.d d;
    public final LocalDate e;
    public final q35.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f70111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wi0.b f70112h;
    public final LoanState i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dj0.d f70113j;
    public final dj0.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dj0.d f70114l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dj0.d f70115m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final double f70116n;
    public final b95.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f70117p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f70118q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LoanInterestRate f70119r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q35.j f70120s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e0 f70121t;
    public final a0 u;
    public final l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LoanInsuranceState f70122w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final xi0.b f70123x;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Loan(parcel.readString(), parcel.readString(), (dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (q35.h) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (wi0.b) parcel.readSerializable(), (LoanState) parcel.readParcelable(Loan.class.getClassLoader()), (dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), parcel.readDouble(), b95.a.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), (LoanInterestRate) parcel.readParcelable(Loan.class.getClassLoader()), (q35.j) parcel.readSerializable(), (e0) parcel.readSerializable(), (a0) parcel.readSerializable(), (l) parcel.readSerializable(), (LoanInsuranceState) parcel.readParcelable(Loan.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Loan[i];
        }
    }

    public Loan(String id10, String str, dj0.d totalToRepay, dj0.d totalRepaid, LocalDate finalRepaymentDate, q35.h config, LocalDate disbursalDate, wi0.b countryCode, LoanState state, dj0.d principal, dj0.d outstandingPrincipal, dj0.d dVar, dj0.d dVar2, double d, b95.a product, int i, int i2, LoanInterestRate interestRate, q35.j jVar, e0 e0Var, a0 a0Var, l lVar, LoanInsuranceState loanInsuranceState) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(totalToRepay, "totalToRepay");
        Intrinsics.checkNotNullParameter(totalRepaid, "totalRepaid");
        Intrinsics.checkNotNullParameter(finalRepaymentDate, "finalRepaymentDate");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(disbursalDate, "disbursalDate");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(principal, "principal");
        Intrinsics.checkNotNullParameter(outstandingPrincipal, "outstandingPrincipal");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(interestRate, "interestRate");
        this.f70108a = id10;
        this.f70109b = str;
        this.f70110c = totalToRepay;
        this.d = totalRepaid;
        this.e = finalRepaymentDate;
        this.f = config;
        this.f70111g = disbursalDate;
        this.f70112h = countryCode;
        this.i = state;
        this.f70113j = principal;
        this.k = outstandingPrincipal;
        this.f70114l = dVar;
        this.f70115m = dVar2;
        this.f70116n = d;
        this.o = product;
        this.f70117p = i;
        this.f70118q = i2;
        this.f70119r = interestRate;
        this.f70120s = jVar;
        this.f70121t = e0Var;
        this.u = a0Var;
        this.v = lVar;
        this.f70122w = loanInsuranceState;
        this.f70123x = totalToRepay.f115083b;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: J, reason: from getter */
    public final int getF70118q() {
        return this.f70118q;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final e0 getF70121t() {
        return this.f70121t;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: N0, reason: from getter */
    public final dj0.d getD() {
        return this.d;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: R0, reason: from getter */
    public final dj0.d getK() {
        return this.k;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: T, reason: from getter */
    public final a0 getU() {
        return this.u;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: W, reason: from getter */
    public final dj0.d getF70114l() {
        return this.f70114l;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: a, reason: from getter */
    public final dj0.d getF70110c() {
        return this.f70110c;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getE() {
        return this.e;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: c, reason: from getter */
    public final dj0.d getF70113j() {
        return this.f70113j;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: c0, reason: from getter */
    public final int getF70117p() {
        return this.f70117p;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: d, reason: from getter */
    public final dj0.d getF70115m() {
        return this.f70115m;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: e, reason: from getter */
    public final LoanInsuranceState getF70122w() {
        return this.f70122w;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Loan)) {
            return false;
        }
        Loan loan = (Loan) obj2;
        return Intrinsics.f(this.f70108a, loan.f70108a) && Intrinsics.f(this.f70109b, loan.f70109b) && Intrinsics.f(this.f70110c, loan.f70110c) && Intrinsics.f(this.d, loan.d) && Intrinsics.f(this.e, loan.e) && Intrinsics.f(this.f, loan.f) && Intrinsics.f(this.f70111g, loan.f70111g) && Intrinsics.f(this.f70112h, loan.f70112h) && Intrinsics.f(this.i, loan.i) && Intrinsics.f(this.f70113j, loan.f70113j) && Intrinsics.f(this.k, loan.k) && Intrinsics.f(this.f70114l, loan.f70114l) && Intrinsics.f(this.f70115m, loan.f70115m) && Double.compare(this.f70116n, loan.f70116n) == 0 && this.o == loan.o && this.f70117p == loan.f70117p && this.f70118q == loan.f70118q && Intrinsics.f(this.f70119r, loan.f70119r) && Intrinsics.f(this.f70120s, loan.f70120s) && Intrinsics.f(this.f70121t, loan.f70121t) && Intrinsics.f(this.u, loan.u) && Intrinsics.f(this.v, loan.v) && Intrinsics.f(this.f70122w, loan.f70122w);
    }

    @Override // q35.t
    /* JADX INFO: renamed from: f0, reason: from getter */
    public final double getF70116n() {
        return this.f70116n;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: getConfig, reason: from getter */
    public final q35.h getF() {
        return this.f;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: getCountryCode, reason: from getter */
    public final wi0.b getF70112h() {
        return this.f70112h;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF70108a() {
        return this.f70108a;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF70109b() {
        return this.f70109b;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: getState, reason: from getter */
    public final LoanState getI() {
        return this.i;
    }

    public final int hashCode() {
        int iHashCode = this.f70108a.hashCode() * 31;
        String str = this.f70109b;
        int iC = v7.c(v7.c((this.i.hashCode() + p.a.c(y.a((this.f.hashCode() + y.a(v7.c(v7.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f70110c), 31, this.d), 31, this.e)) * 31, 31, this.f70111g), 31, this.f70112h.f297794a)) * 31, 31, this.f70113j), 31, this.k);
        dj0.d dVar = this.f70114l;
        int iHashCode2 = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.f70115m;
        int iHashCode3 = (this.f70119r.hashCode() + j6.a.b(this.f70118q, j6.a.b(this.f70117p, (this.o.hashCode() + m72.b.c((iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31, this.f70116n, 31)) * 31, 31), 31)) * 31;
        q35.j jVar = this.f70120s;
        int iHashCode4 = (iHashCode3 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        e0 e0Var = this.f70121t;
        int iHashCode5 = (iHashCode4 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        a0 a0Var = this.u;
        int iHashCode6 = (iHashCode5 + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        l lVar = this.v;
        int iHashCode7 = (iHashCode6 + (lVar == null ? 0 : Integer.hashCode(lVar.f241830a))) * 31;
        LoanInsuranceState loanInsuranceState = this.f70122w;
        return iHashCode7 + (loanInsuranceState != null ? loanInsuranceState.hashCode() : 0);
    }

    @Override // q35.t
    /* JADX INFO: renamed from: j, reason: from getter */
    public final q35.j getF70120s() {
        return this.f70120s;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: k0, reason: from getter */
    public final LoanInterestRate getF70119r() {
        return this.f70119r;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: l, reason: from getter */
    public final b95.a getO() {
        return this.o;
    }

    @Override // q35.t
    /* JADX INFO: renamed from: p0, reason: from getter */
    public final LocalDate getF70111g() {
        return this.f70111g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70108a);
        dest.writeString(this.f70109b);
        dest.writeSerializable(this.f70110c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f70111g);
        dest.writeSerializable(this.f70112h);
        dest.writeParcelable(this.i, i);
        dest.writeSerializable(this.f70113j);
        dest.writeSerializable(this.k);
        dest.writeSerializable(this.f70114l);
        dest.writeSerializable(this.f70115m);
        dest.writeDouble(this.f70116n);
        dest.writeString(this.o.name());
        dest.writeInt(this.f70117p);
        dest.writeInt(this.f70118q);
        dest.writeParcelable(this.f70119r, i);
        dest.writeSerializable(this.f70120s);
        dest.writeSerializable(this.f70121t);
        dest.writeSerializable(this.u);
        dest.writeSerializable(this.v);
        dest.writeParcelable(this.f70122w, i);
    }

    @Override // q35.t
    /* JADX INFO: renamed from: z, reason: from getter */
    public final l getV() {
        return this.v;
    }
}
