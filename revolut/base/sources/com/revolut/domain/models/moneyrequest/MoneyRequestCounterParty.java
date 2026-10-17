package com.revolut.domain.models.moneyrequest;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/MoneyRequestCounterParty;", "Landroid/os/Parcelable;", "Revolut", "Apm", "BankBeneficiary", "Lcom/revolut/domain/models/moneyrequest/MoneyRequestCounterParty$Apm;", "Lcom/revolut/domain/models/moneyrequest/MoneyRequestCounterParty$BankBeneficiary;", "Lcom/revolut/domain/models/moneyrequest/MoneyRequestCounterParty$Revolut;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MoneyRequestCounterParty extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/MoneyRequestCounterParty$Apm;", "Lcom/revolut/domain/models/moneyrequest/MoneyRequestCounterParty;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Apm implements MoneyRequestCounterParty {

        @NotNull
        public static final Parcelable.Creator<Apm> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f60338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f60339c;
        public final String d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Apm(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Apm[i];
            }
        }

        public Apm(String str, String str2, String str3, String str4, String str5) {
            this.f60337a = str;
            this.f60338b = str2;
            this.f60339c = str3;
            this.d = str4;
            this.e = str5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Apm)) {
                return false;
            }
            Apm apm = (Apm) obj2;
            return Intrinsics.f(this.f60337a, apm.f60337a) && Intrinsics.f(this.f60338b, apm.f60338b) && Intrinsics.f(this.f60339c, apm.f60339c) && Intrinsics.f(this.d, apm.d) && Intrinsics.f(this.e, apm.e);
        }

        @Override // com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty
        /* JADX INFO: renamed from: getCode */
        public final String getE() {
            return null;
        }

        @Override // com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty
        /* JADX INFO: renamed from: getCountry */
        public final String getD() {
            return null;
        }

        @Override // com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty
        /* JADX INFO: renamed from: getEmail, reason: from getter */
        public final String getF60345c() {
            return this.f60339c;
        }

        @Override // com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF60343a() {
            return this.f60337a;
        }

        @Override // com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty
        /* JADX INFO: renamed from: getPhone, reason: from getter */
        public final String getF60344b() {
            return this.f60338b;
        }

        public final int hashCode() {
            String str = this.f60337a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f60338b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f60339c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60337a);
            dest.writeString(this.f60338b);
            dest.writeString(this.f60339c);
            dest.writeString(this.d);
            dest.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/MoneyRequestCounterParty$BankBeneficiary;", "Lcom/revolut/domain/models/moneyrequest/MoneyRequestCounterParty;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BankBeneficiary implements MoneyRequestCounterParty {

        @NotNull
        public static final Parcelable.Creator<BankBeneficiary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f60341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f60342c;
        public final String d;
        public final String e;
        public final String f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BankBeneficiary(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BankBeneficiary[i];
            }
        }

        public BankBeneficiary(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f60340a = str;
            this.f60341b = str2;
            this.f60342c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            do3.a aVar = do3.b.Companion;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BankBeneficiary)) {
                return false;
            }
            BankBeneficiary bankBeneficiary = (BankBeneficiary) obj2;
            return Intrinsics.f(this.f60340a, bankBeneficiary.f60340a) && Intrinsics.f(this.f60341b, bankBeneficiary.f60341b) && Intrinsics.f(this.f60342c, bankBeneficiary.f60342c) && Intrinsics.f(this.d, bankBeneficiary.d) && Intrinsics.f(this.e, bankBeneficiary.e) && Intrinsics.f(this.f, bankBeneficiary.f);
        }

        @Override // com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty
        /* JADX INFO: renamed from: getCode */
        public final String getE() {
            return null;
        }

        @Override // com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty
        /* JADX INFO: renamed from: getCountry */
        public final String getD() {
            return null;
        }

        @Override // com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty
        /* JADX INFO: renamed from: getEmail, reason: from getter */
        public final String getF60345c() {
            return this.f60342c;
        }

        @Override // com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF60343a() {
            return this.f60340a;
        }

        @Override // com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty
        /* JADX INFO: renamed from: getPhone, reason: from getter */
        public final String getF60344b() {
            return this.f60341b;
        }

        public final int hashCode() {
            String str = this.f60340a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f60341b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f60342c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f;
            return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60340a);
            dest.writeString(this.f60341b);
            dest.writeString(this.f60342c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/MoneyRequestCounterParty$Revolut;", "Lcom/revolut/domain/models/moneyrequest/MoneyRequestCounterParty;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Revolut implements MoneyRequestCounterParty {

        @NotNull
        public static final Parcelable.Creator<Revolut> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f60344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f60345c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f60346g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f60347h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f60348j;
        public final do3.b k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f60349l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final do3.c f60350m;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Revolut(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), do3.b.valueOf(parcel.readString()), parcel.readString(), do3.c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Revolut[i];
            }
        }

        public Revolut(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, do3.b appMode, String str11, do3.c customerType) {
            Intrinsics.checkNotNullParameter(appMode, "appMode");
            Intrinsics.checkNotNullParameter(customerType, "customerType");
            this.f60343a = str;
            this.f60344b = str2;
            this.f60345c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.f60346g = str7;
            this.f60347h = str8;
            this.i = str9;
            this.f60348j = str10;
            this.k = appMode;
            this.f60349l = str11;
            this.f60350m = customerType;
        }

        public static Revolut a(Revolut revolut, String str, String str2) {
            String str3 = revolut.f60343a;
            String str4 = revolut.f60344b;
            String str5 = revolut.f60345c;
            String str6 = revolut.d;
            String str7 = revolut.e;
            String str8 = revolut.f;
            String str9 = revolut.f60346g;
            String str10 = revolut.f60348j;
            do3.b appMode = revolut.k;
            String str11 = revolut.f60349l;
            do3.c customerType = revolut.f60350m;
            Intrinsics.checkNotNullParameter(appMode, "appMode");
            Intrinsics.checkNotNullParameter(customerType, "customerType");
            return new Revolut(str3, str4, str5, str6, str7, str8, str9, str, str2, str10, appMode, str11, customerType);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final do3.b getK() {
            return this.k;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final do3.c getF60350m() {
            return this.f60350m;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getI() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getF60346g() {
            return this.f60346g;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Revolut)) {
                return false;
            }
            Revolut revolut = (Revolut) obj2;
            return Intrinsics.f(this.f60343a, revolut.f60343a) && Intrinsics.f(this.f60344b, revolut.f60344b) && Intrinsics.f(this.f60345c, revolut.f60345c) && Intrinsics.f(this.d, revolut.d) && Intrinsics.f(this.e, revolut.e) && Intrinsics.f(this.f, revolut.f) && Intrinsics.f(this.f60346g, revolut.f60346g) && Intrinsics.f(this.f60347h, revolut.f60347h) && Intrinsics.f(this.i, revolut.i) && Intrinsics.f(this.f60348j, revolut.f60348j) && this.k == revolut.k && Intrinsics.f(this.f60349l, revolut.f60349l) && this.f60350m == revolut.f60350m;
        }

        @Override // com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty
        /* JADX INFO: renamed from: getCode, reason: from getter */
        public final String getE() {
            return this.e;
        }

        @Override // com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty
        /* JADX INFO: renamed from: getCountry, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty
        /* JADX INFO: renamed from: getEmail, reason: from getter */
        public final String getF60345c() {
            return this.f60345c;
        }

        /* JADX INFO: renamed from: getFirstName, reason: from getter */
        public final String getF60347h() {
            return this.f60347h;
        }

        @Override // com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF60343a() {
            return this.f60343a;
        }

        @Override // com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty
        /* JADX INFO: renamed from: getPhone, reason: from getter */
        public final String getF60344b() {
            return this.f60344b;
        }

        public final int hashCode() {
            String str = this.f60343a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f60344b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f60345c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f60346g;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.f60347h;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.i;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.f60348j;
            int iHashCode10 = (this.k.hashCode() + ((iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31)) * 31;
            String str11 = this.f60349l;
            return this.f60350m.hashCode() + ((iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getF() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60343a);
            dest.writeString(this.f60344b);
            dest.writeString(this.f60345c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
            dest.writeString(this.f60346g);
            dest.writeString(this.f60347h);
            dest.writeString(this.i);
            dest.writeString(this.f60348j);
            dest.writeString(this.k.name());
            dest.writeString(this.f60349l);
            dest.writeString(this.f60350m.name());
        }
    }

    /* JADX INFO: renamed from: getCode */
    String getE();

    /* JADX INFO: renamed from: getCountry */
    String getD();

    /* JADX INFO: renamed from: getEmail */
    String getF60345c();

    /* JADX INFO: renamed from: getId */
    String getF60343a();

    /* JADX INFO: renamed from: getPhone */
    String getF60344b();
}
