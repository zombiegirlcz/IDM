package com.revolut.feature.credit.card.api.models.creditcard;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import h30.l;
import ip0.v7;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ll4.n;
import org.jetbrains.annotations.NotNull;
import wp5.y;
import xi0.b;
import yw4.q;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/creditcard/CreditCardPaymentDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Rates", "ll4/n", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardPaymentDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardPaymentDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f68737c;
    public final d d;
    public final d e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f68738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f68739h;
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f68740j;
    public final d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f68741l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f68742m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LocalDate f68743n;
    public final LocalDate o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LocalDate f68744p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xw4.a f68745q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f68746r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f68747s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f68748t;
    public final q u;
    public final Rates v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n f68749w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f68750x;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/creditcard/CreditCardPaymentDetails$Rates;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Rates implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Rates> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f68752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f68753c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Rates(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Rates[i];
            }
        }

        public Rates(String withdrawal, String transfer, String str, String purchase) {
            Intrinsics.checkNotNullParameter(withdrawal, "withdrawal");
            Intrinsics.checkNotNullParameter(transfer, "transfer");
            Intrinsics.checkNotNullParameter(purchase, "purchase");
            this.f68751a = withdrawal;
            this.f68752b = transfer;
            this.f68753c = str;
            this.d = purchase;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Rates)) {
                return false;
            }
            Rates rates = (Rates) obj2;
            return Intrinsics.f(this.f68751a, rates.f68751a) && Intrinsics.f(this.f68752b, rates.f68752b) && Intrinsics.f(this.f68753c, rates.f68753c) && Intrinsics.f(this.d, rates.d);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f68751a.hashCode() * 31, 31, this.f68752b);
            String str = this.f68753c;
            return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68751a);
            dest.writeString(this.f68752b);
            dest.writeString(this.f68753c);
            dest.writeString(this.d);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            b bVar = (b) parcel.readSerializable();
            d dVar = (d) parcel.readSerializable();
            d dVar2 = (d) parcel.readSerializable();
            d dVar3 = (d) parcel.readSerializable();
            d dVar4 = (d) parcel.readSerializable();
            d dVar5 = (d) parcel.readSerializable();
            d dVar6 = (d) parcel.readSerializable();
            d dVar7 = (d) parcel.readSerializable();
            d dVar8 = (d) parcel.readSerializable();
            d dVar9 = (d) parcel.readSerializable();
            d dVar10 = (d) parcel.readSerializable();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            LocalDate localDate2 = (LocalDate) parcel.readSerializable();
            LocalDate localDate3 = (LocalDate) parcel.readSerializable();
            xw4.a aVarValueOf = xw4.a.valueOf(parcel.readString());
            boolean z4 = false;
            boolean z6 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z6 = z;
            }
            return new CreditCardPaymentDetails(string, string2, bVar, dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, localDate, localDate2, localDate3, aVarValueOf, z4, z6, (d) parcel.readSerializable(), q.valueOf(parcel.readString()), Rates.CREATOR.createFromParcel(parcel), n.valueOf(parcel.readString()), parcel.readInt() != 0 ? z3 : false);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardPaymentDetails[i];
        }
    }

    public CreditCardPaymentDetails(String facilityId, String pocketId, b creditCardCurrency, d availableMoney, d preferredRepaymentAmount, d minimumRepayment, d statementBalance, d remainingBalance, d overdueAmount, d dVar, d overLimitAmount, d limitAmount, d maxAllowedPayment, LocalDate statementDue, LocalDate localDate, LocalDate repaymentDueDate, xw4.a paymentState, boolean z, boolean z3, d interest, q facilityState, Rates rates, n autopayAvailability, boolean z4) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(creditCardCurrency, "creditCardCurrency");
        Intrinsics.checkNotNullParameter(availableMoney, "availableMoney");
        Intrinsics.checkNotNullParameter(preferredRepaymentAmount, "preferredRepaymentAmount");
        Intrinsics.checkNotNullParameter(minimumRepayment, "minimumRepayment");
        Intrinsics.checkNotNullParameter(statementBalance, "statementBalance");
        Intrinsics.checkNotNullParameter(remainingBalance, "remainingBalance");
        Intrinsics.checkNotNullParameter(overdueAmount, "overdueAmount");
        Intrinsics.checkNotNullParameter(overLimitAmount, "overLimitAmount");
        Intrinsics.checkNotNullParameter(limitAmount, "limitAmount");
        Intrinsics.checkNotNullParameter(maxAllowedPayment, "maxAllowedPayment");
        Intrinsics.checkNotNullParameter(statementDue, "statementDue");
        Intrinsics.checkNotNullParameter(repaymentDueDate, "repaymentDueDate");
        Intrinsics.checkNotNullParameter(paymentState, "paymentState");
        Intrinsics.checkNotNullParameter(interest, "interest");
        Intrinsics.checkNotNullParameter(facilityState, "facilityState");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(autopayAvailability, "autopayAvailability");
        this.f68735a = facilityId;
        this.f68736b = pocketId;
        this.f68737c = creditCardCurrency;
        this.d = availableMoney;
        this.e = preferredRepaymentAmount;
        this.f = minimumRepayment;
        this.f68738g = statementBalance;
        this.f68739h = remainingBalance;
        this.i = overdueAmount;
        this.f68740j = dVar;
        this.k = overLimitAmount;
        this.f68741l = limitAmount;
        this.f68742m = maxAllowedPayment;
        this.f68743n = statementDue;
        this.o = localDate;
        this.f68744p = repaymentDueDate;
        this.f68745q = paymentState;
        this.f68746r = z;
        this.f68747s = z3;
        this.f68748t = interest;
        this.u = facilityState;
        this.v = rates;
        this.f68749w = autopayAvailability;
        this.f68750x = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardPaymentDetails)) {
            return false;
        }
        CreditCardPaymentDetails creditCardPaymentDetails = (CreditCardPaymentDetails) obj2;
        return Intrinsics.f(this.f68735a, creditCardPaymentDetails.f68735a) && Intrinsics.f(this.f68736b, creditCardPaymentDetails.f68736b) && Intrinsics.f(this.f68737c, creditCardPaymentDetails.f68737c) && Intrinsics.f(this.d, creditCardPaymentDetails.d) && Intrinsics.f(this.e, creditCardPaymentDetails.e) && Intrinsics.f(this.f, creditCardPaymentDetails.f) && Intrinsics.f(this.f68738g, creditCardPaymentDetails.f68738g) && Intrinsics.f(this.f68739h, creditCardPaymentDetails.f68739h) && Intrinsics.f(this.i, creditCardPaymentDetails.i) && Intrinsics.f(this.f68740j, creditCardPaymentDetails.f68740j) && Intrinsics.f(this.k, creditCardPaymentDetails.k) && Intrinsics.f(this.f68741l, creditCardPaymentDetails.f68741l) && Intrinsics.f(this.f68742m, creditCardPaymentDetails.f68742m) && Intrinsics.f(this.f68743n, creditCardPaymentDetails.f68743n) && Intrinsics.f(this.o, creditCardPaymentDetails.o) && Intrinsics.f(this.f68744p, creditCardPaymentDetails.f68744p) && this.f68745q == creditCardPaymentDetails.f68745q && this.f68746r == creditCardPaymentDetails.f68746r && this.f68747s == creditCardPaymentDetails.f68747s && Intrinsics.f(this.f68748t, creditCardPaymentDetails.f68748t) && this.u == creditCardPaymentDetails.u && Intrinsics.f(this.v, creditCardPaymentDetails.v) && this.f68749w == creditCardPaymentDetails.f68749w && this.f68750x == creditCardPaymentDetails.f68750x;
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(v7.c(v7.c(v7.c(v7.c(l.j(this.f68737c, p.a.c(this.f68735a.hashCode() * 31, 31, this.f68736b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.f68738g), 31, this.f68739h), 31, this.i);
        d dVar = this.f68740j;
        int iA = y.a(v7.c(v7.c(v7.c((iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.k), 31, this.f68741l), 31, this.f68742m), 31, this.f68743n);
        LocalDate localDate = this.o;
        return Boolean.hashCode(this.f68750x) + ((this.f68749w.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + v7.c(j6.a.c(j6.a.c((this.f68745q.hashCode() + y.a((iA + (localDate != null ? localDate.hashCode() : 0)) * 31, 31, this.f68744p)) * 31, 31, this.f68746r), 31, this.f68747s), 31, this.f68748t)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68735a);
        dest.writeString(this.f68736b);
        dest.writeSerializable(this.f68737c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f68738g);
        dest.writeSerializable(this.f68739h);
        dest.writeSerializable(this.i);
        dest.writeSerializable(this.f68740j);
        dest.writeSerializable(this.k);
        dest.writeSerializable(this.f68741l);
        dest.writeSerializable(this.f68742m);
        dest.writeSerializable(this.f68743n);
        dest.writeSerializable(this.o);
        dest.writeSerializable(this.f68744p);
        dest.writeString(this.f68745q.name());
        dest.writeInt(this.f68746r ? 1 : 0);
        dest.writeInt(this.f68747s ? 1 : 0);
        dest.writeSerializable(this.f68748t);
        dest.writeString(this.u.name());
        this.v.writeToParcel(dest, i);
        dest.writeString(this.f68749w.name());
        dest.writeInt(this.f68750x ? 1 : 0);
    }
}
