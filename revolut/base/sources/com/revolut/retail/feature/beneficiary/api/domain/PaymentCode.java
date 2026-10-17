package com.revolut.retail.feature.beneficiary.api.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared.beneficiary.api.domain.PaymentCodeType;
import com.revolut.retail.feature.beneficiary.api.domain.PaymentCodeVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/api/domain/PaymentCode;", "Landroid/os/Parcelable;", "EuropeanPaymentCodeV1", "EuropeanPaymentCodeV2", "SwissPaymentCodeV2", "Lcom/revolut/retail/feature/beneficiary/api/domain/PaymentCode$EuropeanPaymentCodeV1;", "Lcom/revolut/retail/feature/beneficiary/api/domain/PaymentCode$EuropeanPaymentCodeV2;", "Lcom/revolut/retail/feature/beneficiary/api/domain/PaymentCode$SwissPaymentCodeV2;", "feature_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PaymentCode implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentCodeType f99590a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/api/domain/PaymentCode$EuropeanPaymentCodeV1;", "Lcom/revolut/retail/feature/beneficiary/api/domain/PaymentCode;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EuropeanPaymentCodeV1 extends PaymentCode {

        @NotNull
        public static final Parcelable.Creator<EuropeanPaymentCodeV1> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PaymentCodeTransactor f99591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PaymentCodeAccount f99592c;
        public final String d;
        public final String e;
        public final double f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f99593g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f99594h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f99595j;
        public final String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f99596l;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EuropeanPaymentCodeV1(PaymentCodeTransactor.CREATOR.createFromParcel(parcel), PaymentCodeAccount.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EuropeanPaymentCodeV1[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public EuropeanPaymentCodeV1(PaymentCodeTransactor toTransactor, PaymentCodeAccount toAccount, String str, String currency, double d, String charsetType, String identification, String purpose, String referenceCode, String referenceText, String information) {
            Intrinsics.checkNotNullParameter(toTransactor, "toTransactor");
            Intrinsics.checkNotNullParameter(toAccount, "toAccount");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(charsetType, "charsetType");
            Intrinsics.checkNotNullParameter(identification, "identification");
            Intrinsics.checkNotNullParameter(purpose, "purpose");
            Intrinsics.checkNotNullParameter(referenceCode, "referenceCode");
            Intrinsics.checkNotNullParameter(referenceText, "referenceText");
            Intrinsics.checkNotNullParameter(information, "information");
            PaymentCodeType paymentCodeType = PaymentCodeType.EUROPEAN;
            PaymentCodeVersion.Companion companion = PaymentCodeVersion.INSTANCE;
            super(paymentCodeType);
            this.f99591b = toTransactor;
            this.f99592c = toAccount;
            this.d = str;
            this.e = currency;
            this.f = d;
            this.f99593g = charsetType;
            this.f99594h = identification;
            this.i = purpose;
            this.f99595j = referenceCode;
            this.k = referenceText;
            this.f99596l = information;
        }

        @Override // com.revolut.retail.feature.beneficiary.api.domain.PaymentCode
        /* JADX INFO: renamed from: a, reason: from getter */
        public final double getF() {
            return this.f;
        }

        @Override // com.revolut.retail.feature.beneficiary.api.domain.PaymentCode
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // com.revolut.retail.feature.beneficiary.api.domain.PaymentCode
        /* JADX INFO: renamed from: c, reason: from getter */
        public final PaymentCodeAccount getF99604c() {
            return this.f99592c;
        }

        @Override // com.revolut.retail.feature.beneficiary.api.domain.PaymentCode
        /* JADX INFO: renamed from: d, reason: from getter */
        public final PaymentCodeTransactor getF99603b() {
            return this.f99591b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EuropeanPaymentCodeV1)) {
                return false;
            }
            EuropeanPaymentCodeV1 europeanPaymentCodeV1 = (EuropeanPaymentCodeV1) obj2;
            return Intrinsics.f(this.f99591b, europeanPaymentCodeV1.f99591b) && Intrinsics.f(this.f99592c, europeanPaymentCodeV1.f99592c) && Intrinsics.f(this.d, europeanPaymentCodeV1.d) && Intrinsics.f(this.e, europeanPaymentCodeV1.e) && Double.compare(this.f, europeanPaymentCodeV1.f) == 0 && Intrinsics.f(this.f99593g, europeanPaymentCodeV1.f99593g) && Intrinsics.f(this.f99594h, europeanPaymentCodeV1.f99594h) && Intrinsics.f(this.i, europeanPaymentCodeV1.i) && Intrinsics.f(this.f99595j, europeanPaymentCodeV1.f99595j) && Intrinsics.f(this.k, europeanPaymentCodeV1.k) && Intrinsics.f(this.f99596l, europeanPaymentCodeV1.f99596l);
        }

        @Override // com.revolut.retail.feature.beneficiary.api.domain.PaymentCode
        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public final String getE() {
            return this.e;
        }

        public final int hashCode() {
            int iHashCode = (this.f99592c.hashCode() + (this.f99591b.hashCode() * 31)) * 31;
            String str = this.d;
            return this.f99596l.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(b.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), this.f, 31), 31, this.f99593g), 31, this.f99594h), 31, this.i), 31, this.f99595j), 31, this.k);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f99591b.writeToParcel(dest, i);
            this.f99592c.writeToParcel(dest, i);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeDouble(this.f);
            dest.writeString(this.f99593g);
            dest.writeString(this.f99594h);
            dest.writeString(this.i);
            dest.writeString(this.f99595j);
            dest.writeString(this.k);
            dest.writeString(this.f99596l);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/api/domain/PaymentCode$EuropeanPaymentCodeV2;", "Lcom/revolut/retail/feature/beneficiary/api/domain/PaymentCode;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EuropeanPaymentCodeV2 extends PaymentCode {

        @NotNull
        public static final Parcelable.Creator<EuropeanPaymentCodeV2> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PaymentCodeTransactor f99597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PaymentCodeAccount f99598c;
        public final String d;
        public final String e;
        public final double f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f99599g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f99600h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f99601j;
        public final String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f99602l;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EuropeanPaymentCodeV2(PaymentCodeTransactor.CREATOR.createFromParcel(parcel), PaymentCodeAccount.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EuropeanPaymentCodeV2[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public EuropeanPaymentCodeV2(PaymentCodeTransactor toTransactor, PaymentCodeAccount toAccount, String str, String currency, double d, String charsetType, String identification, String purpose, String referenceCode, String referenceText, String information) {
            Intrinsics.checkNotNullParameter(toTransactor, "toTransactor");
            Intrinsics.checkNotNullParameter(toAccount, "toAccount");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(charsetType, "charsetType");
            Intrinsics.checkNotNullParameter(identification, "identification");
            Intrinsics.checkNotNullParameter(purpose, "purpose");
            Intrinsics.checkNotNullParameter(referenceCode, "referenceCode");
            Intrinsics.checkNotNullParameter(referenceText, "referenceText");
            Intrinsics.checkNotNullParameter(information, "information");
            PaymentCodeType paymentCodeType = PaymentCodeType.EUROPEAN;
            PaymentCodeVersion.Companion companion = PaymentCodeVersion.INSTANCE;
            super(paymentCodeType);
            this.f99597b = toTransactor;
            this.f99598c = toAccount;
            this.d = str;
            this.e = currency;
            this.f = d;
            this.f99599g = charsetType;
            this.f99600h = identification;
            this.i = purpose;
            this.f99601j = referenceCode;
            this.k = referenceText;
            this.f99602l = information;
        }

        @Override // com.revolut.retail.feature.beneficiary.api.domain.PaymentCode
        /* JADX INFO: renamed from: a, reason: from getter */
        public final double getF() {
            return this.f;
        }

        @Override // com.revolut.retail.feature.beneficiary.api.domain.PaymentCode
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // com.revolut.retail.feature.beneficiary.api.domain.PaymentCode
        /* JADX INFO: renamed from: c, reason: from getter */
        public final PaymentCodeAccount getF99604c() {
            return this.f99598c;
        }

        @Override // com.revolut.retail.feature.beneficiary.api.domain.PaymentCode
        /* JADX INFO: renamed from: d, reason: from getter */
        public final PaymentCodeTransactor getF99603b() {
            return this.f99597b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EuropeanPaymentCodeV2)) {
                return false;
            }
            EuropeanPaymentCodeV2 europeanPaymentCodeV2 = (EuropeanPaymentCodeV2) obj2;
            return Intrinsics.f(this.f99597b, europeanPaymentCodeV2.f99597b) && Intrinsics.f(this.f99598c, europeanPaymentCodeV2.f99598c) && Intrinsics.f(this.d, europeanPaymentCodeV2.d) && Intrinsics.f(this.e, europeanPaymentCodeV2.e) && Double.compare(this.f, europeanPaymentCodeV2.f) == 0 && Intrinsics.f(this.f99599g, europeanPaymentCodeV2.f99599g) && Intrinsics.f(this.f99600h, europeanPaymentCodeV2.f99600h) && Intrinsics.f(this.i, europeanPaymentCodeV2.i) && Intrinsics.f(this.f99601j, europeanPaymentCodeV2.f99601j) && Intrinsics.f(this.k, europeanPaymentCodeV2.k) && Intrinsics.f(this.f99602l, europeanPaymentCodeV2.f99602l);
        }

        @Override // com.revolut.retail.feature.beneficiary.api.domain.PaymentCode
        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public final String getE() {
            return this.e;
        }

        public final int hashCode() {
            int iHashCode = (this.f99598c.hashCode() + (this.f99597b.hashCode() * 31)) * 31;
            String str = this.d;
            return this.f99602l.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(b.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), this.f, 31), 31, this.f99599g), 31, this.f99600h), 31, this.i), 31, this.f99601j), 31, this.k);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f99597b.writeToParcel(dest, i);
            this.f99598c.writeToParcel(dest, i);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeDouble(this.f);
            dest.writeString(this.f99599g);
            dest.writeString(this.f99600h);
            dest.writeString(this.i);
            dest.writeString(this.f99601j);
            dest.writeString(this.k);
            dest.writeString(this.f99602l);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/api/domain/PaymentCode$SwissPaymentCodeV2;", "Lcom/revolut/retail/feature/beneficiary/api/domain/PaymentCode;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SwissPaymentCodeV2 extends PaymentCode {

        @NotNull
        public static final Parcelable.Creator<SwissPaymentCodeV2> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PaymentCodeTransactor f99603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PaymentCodeAccount f99604c;
        public final String d;
        public final String e;
        public final double f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final PaymentCodeTransactor f99605g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final PaymentCodeTransactor f99606h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f99607j;
        public final String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f99608l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f99609m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f99610n;
        public final String o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final String f99611p;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Parcelable.Creator<PaymentCodeTransactor> creator = PaymentCodeTransactor.CREATOR;
                return new SwissPaymentCodeV2(creator.createFromParcel(parcel), PaymentCodeAccount.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SwissPaymentCodeV2[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public SwissPaymentCodeV2(PaymentCodeTransactor toTransactor, PaymentCodeAccount toAccount, String str, String currency, double d, PaymentCodeTransactor paymentCodeTransactor, PaymentCodeTransactor paymentCodeTransactor2, String codingType, String referenceType, String referenceCode, String message, String trailer, String billingInfo, String additionalInfo1, String additionalInfo2) {
            Intrinsics.checkNotNullParameter(toTransactor, "toTransactor");
            Intrinsics.checkNotNullParameter(toAccount, "toAccount");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(codingType, "codingType");
            Intrinsics.checkNotNullParameter(referenceType, "referenceType");
            Intrinsics.checkNotNullParameter(referenceCode, "referenceCode");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(trailer, "trailer");
            Intrinsics.checkNotNullParameter(billingInfo, "billingInfo");
            Intrinsics.checkNotNullParameter(additionalInfo1, "additionalInfo1");
            Intrinsics.checkNotNullParameter(additionalInfo2, "additionalInfo2");
            PaymentCodeType paymentCodeType = PaymentCodeType.SWISS;
            PaymentCodeVersion.Companion companion = PaymentCodeVersion.INSTANCE;
            super(paymentCodeType);
            this.f99603b = toTransactor;
            this.f99604c = toAccount;
            this.d = str;
            this.e = currency;
            this.f = d;
            this.f99605g = paymentCodeTransactor;
            this.f99606h = paymentCodeTransactor2;
            this.i = codingType;
            this.f99607j = referenceType;
            this.k = referenceCode;
            this.f99608l = message;
            this.f99609m = trailer;
            this.f99610n = billingInfo;
            this.o = additionalInfo1;
            this.f99611p = additionalInfo2;
        }

        @Override // com.revolut.retail.feature.beneficiary.api.domain.PaymentCode
        /* JADX INFO: renamed from: a, reason: from getter */
        public final double getF() {
            return this.f;
        }

        @Override // com.revolut.retail.feature.beneficiary.api.domain.PaymentCode
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // com.revolut.retail.feature.beneficiary.api.domain.PaymentCode
        /* JADX INFO: renamed from: c, reason: from getter */
        public final PaymentCodeAccount getF99604c() {
            return this.f99604c;
        }

        @Override // com.revolut.retail.feature.beneficiary.api.domain.PaymentCode
        /* JADX INFO: renamed from: d, reason: from getter */
        public final PaymentCodeTransactor getF99603b() {
            return this.f99603b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SwissPaymentCodeV2)) {
                return false;
            }
            SwissPaymentCodeV2 swissPaymentCodeV2 = (SwissPaymentCodeV2) obj2;
            return Intrinsics.f(this.f99603b, swissPaymentCodeV2.f99603b) && Intrinsics.f(this.f99604c, swissPaymentCodeV2.f99604c) && Intrinsics.f(this.d, swissPaymentCodeV2.d) && Intrinsics.f(this.e, swissPaymentCodeV2.e) && Double.compare(this.f, swissPaymentCodeV2.f) == 0 && Intrinsics.f(this.f99605g, swissPaymentCodeV2.f99605g) && Intrinsics.f(this.f99606h, swissPaymentCodeV2.f99606h) && Intrinsics.f(this.i, swissPaymentCodeV2.i) && Intrinsics.f(this.f99607j, swissPaymentCodeV2.f99607j) && Intrinsics.f(this.k, swissPaymentCodeV2.k) && Intrinsics.f(this.f99608l, swissPaymentCodeV2.f99608l) && Intrinsics.f(this.f99609m, swissPaymentCodeV2.f99609m) && Intrinsics.f(this.f99610n, swissPaymentCodeV2.f99610n) && Intrinsics.f(this.o, swissPaymentCodeV2.o) && Intrinsics.f(this.f99611p, swissPaymentCodeV2.f99611p);
        }

        @Override // com.revolut.retail.feature.beneficiary.api.domain.PaymentCode
        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public final String getE() {
            return this.e;
        }

        public final int hashCode() {
            int iHashCode = (this.f99604c.hashCode() + (this.f99603b.hashCode() * 31)) * 31;
            String str = this.d;
            int iC = b.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), this.f, 31);
            PaymentCodeTransactor paymentCodeTransactor = this.f99605g;
            int iHashCode2 = (iC + (paymentCodeTransactor == null ? 0 : paymentCodeTransactor.hashCode())) * 31;
            PaymentCodeTransactor paymentCodeTransactor2 = this.f99606h;
            return this.f99611p.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c((iHashCode2 + (paymentCodeTransactor2 != null ? paymentCodeTransactor2.hashCode() : 0)) * 31, 31, this.i), 31, this.f99607j), 31, this.k), 31, this.f99608l), 31, this.f99609m), 31, this.f99610n), 31, this.o);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f99603b.writeToParcel(dest, i);
            this.f99604c.writeToParcel(dest, i);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeDouble(this.f);
            PaymentCodeTransactor paymentCodeTransactor = this.f99605g;
            if (paymentCodeTransactor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                paymentCodeTransactor.writeToParcel(dest, i);
            }
            PaymentCodeTransactor paymentCodeTransactor2 = this.f99606h;
            if (paymentCodeTransactor2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                paymentCodeTransactor2.writeToParcel(dest, i);
            }
            dest.writeString(this.i);
            dest.writeString(this.f99607j);
            dest.writeString(this.k);
            dest.writeString(this.f99608l);
            dest.writeString(this.f99609m);
            dest.writeString(this.f99610n);
            dest.writeString(this.o);
            dest.writeString(this.f99611p);
        }
    }

    public PaymentCode(PaymentCodeType paymentCodeType) {
        this.f99590a = paymentCodeType;
    }

    /* JADX INFO: renamed from: a */
    public abstract double getF();

    /* JADX INFO: renamed from: b */
    public abstract String getD();

    /* JADX INFO: renamed from: c */
    public abstract PaymentCodeAccount getF99604c();

    /* JADX INFO: renamed from: d */
    public abstract PaymentCodeTransactor getF99603b();

    /* JADX INFO: renamed from: getCurrency */
    public abstract String getE();
}
