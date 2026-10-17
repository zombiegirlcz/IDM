package com.revolut.domain.models.openbanking;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import h30.l;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;
import xi0.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/openbanking/OpenBankingPayment;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OpenBankingPayment implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OpenBankingPayment> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentConsentType f60385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f60387c;
    public final Instant d;
    public final PaymentFrequency e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f60388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f60389h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f60390j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f60391l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final OpenBankingAccountData f60392m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f60393n;
    public final OpenBankingAccountData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Provider f60394p;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            PaymentFrequency paymentFrequency;
            Provider providerCreateFromParcel;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            PaymentConsentType paymentConsentTypeValueOf = PaymentConsentType.valueOf(parcel.readString());
            String string = parcel.readString();
            b bVar = (b) parcel.readSerializable();
            Instant instant = (Instant) parcel.readSerializable();
            PaymentFrequency paymentFrequencyValueOf = parcel.readInt() == 0 ? null : PaymentFrequency.valueOf(parcel.readString());
            Instant instant2 = (Instant) parcel.readSerializable();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            d dVar = (d) parcel.readSerializable();
            OpenBankingAccountData openBankingAccountData = (OpenBankingAccountData) parcel.readParcelable(OpenBankingPayment.class.getClassLoader());
            String string6 = parcel.readString();
            OpenBankingAccountData openBankingAccountData2 = (OpenBankingAccountData) parcel.readParcelable(OpenBankingPayment.class.getClassLoader());
            if (parcel.readInt() == 0) {
                providerCreateFromParcel = null;
                paymentFrequency = paymentFrequencyValueOf;
            } else {
                paymentFrequency = paymentFrequencyValueOf;
                providerCreateFromParcel = Provider.CREATOR.createFromParcel(parcel);
            }
            return new OpenBankingPayment(paymentConsentTypeValueOf, string, bVar, instant, paymentFrequency, instant2, numValueOf, string2, string3, string4, string5, dVar, openBankingAccountData, string6, openBankingAccountData2, providerCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OpenBankingPayment[i];
        }
    }

    public OpenBankingPayment(PaymentConsentType type, String str, b currency, Instant instant, PaymentFrequency paymentFrequency, Instant instant2, Integer num, String str2, String str3, String str4, String merchant, d amount, OpenBankingAccountData creditor, String str5, OpenBankingAccountData openBankingAccountData, Provider provider) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(creditor, "creditor");
        this.f60385a = type;
        this.f60386b = str;
        this.f60387c = currency;
        this.d = instant;
        this.e = paymentFrequency;
        this.f = instant2;
        this.f60388g = num;
        this.f60389h = str2;
        this.i = str3;
        this.f60390j = str4;
        this.k = merchant;
        this.f60391l = amount;
        this.f60392m = creditor;
        this.f60393n = str5;
        this.o = openBankingAccountData;
        this.f60394p = provider;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OpenBankingPayment)) {
            return false;
        }
        OpenBankingPayment openBankingPayment = (OpenBankingPayment) obj2;
        return this.f60385a == openBankingPayment.f60385a && Intrinsics.f(this.f60386b, openBankingPayment.f60386b) && Intrinsics.f(this.f60387c, openBankingPayment.f60387c) && Intrinsics.f(this.d, openBankingPayment.d) && this.e == openBankingPayment.e && Intrinsics.f(this.f, openBankingPayment.f) && Intrinsics.f(this.f60388g, openBankingPayment.f60388g) && Intrinsics.f(this.f60389h, openBankingPayment.f60389h) && Intrinsics.f(this.i, openBankingPayment.i) && Intrinsics.f(this.f60390j, openBankingPayment.f60390j) && Intrinsics.f(this.k, openBankingPayment.k) && Intrinsics.f(this.f60391l, openBankingPayment.f60391l) && Intrinsics.f(this.f60392m, openBankingPayment.f60392m) && Intrinsics.f(this.f60393n, openBankingPayment.f60393n) && Intrinsics.f(this.o, openBankingPayment.o) && Intrinsics.f(this.f60394p, openBankingPayment.f60394p);
    }

    public final int hashCode() {
        int iHashCode = this.f60385a.hashCode() * 31;
        String str = this.f60386b;
        int iJ = l.j(this.f60387c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        Instant instant = this.d;
        int iHashCode2 = (iJ + (instant == null ? 0 : instant.hashCode())) * 31;
        PaymentFrequency paymentFrequency = this.e;
        int iHashCode3 = (iHashCode2 + (paymentFrequency == null ? 0 : paymentFrequency.hashCode())) * 31;
        Instant instant2 = this.f;
        int iHashCode4 = (iHashCode3 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        Integer num = this.f60388g;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f60389h;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f60390j;
        int iHashCode8 = (this.f60392m.hashCode() + v7.c(p.a.c((iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.k), 31, this.f60391l)) * 31;
        String str5 = this.f60393n;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        OpenBankingAccountData openBankingAccountData = this.o;
        int iHashCode10 = (iHashCode9 + (openBankingAccountData == null ? 0 : openBankingAccountData.hashCode())) * 31;
        Provider provider = this.f60394p;
        return iHashCode10 + (provider != null ? provider.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60385a.name());
        dest.writeString(this.f60386b);
        dest.writeSerializable(this.f60387c);
        dest.writeSerializable(this.d);
        PaymentFrequency paymentFrequency = this.e;
        if (paymentFrequency == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(paymentFrequency.name());
        }
        dest.writeSerializable(this.f);
        Integer num = this.f60388g;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeString(this.f60389h);
        dest.writeString(this.i);
        dest.writeString(this.f60390j);
        dest.writeString(this.k);
        dest.writeSerializable(this.f60391l);
        dest.writeParcelable(this.f60392m, i);
        dest.writeString(this.f60393n);
        dest.writeParcelable(this.o, i);
        Provider provider = this.f60394p;
        if (provider == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            provider.writeToParcel(dest, i);
        }
    }
}
