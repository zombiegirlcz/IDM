package com.revolut.feature.bank_account_switching.impl.ui.review.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/review/domain/BankInformation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "AccountNumber", "Iban", "Uk", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BankInformation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BankInformation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountNumber f63974c;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/review/domain/BankInformation$AccountNumber;", "Landroid/os/Parcelable;", "Lcom/revolut/feature/bank_account_switching/impl/ui/review/domain/BankInformation$Iban;", "Lcom/revolut/feature/bank_account_switching/impl/ui/review/domain/BankInformation$Uk;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface AccountNumber extends Parcelable {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/review/domain/BankInformation$Iban;", "Lcom/revolut/feature/bank_account_switching/impl/ui/review/domain/BankInformation$AccountNumber;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Iban implements AccountNumber {

        @NotNull
        public static final Parcelable.Creator<Iban> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63975a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Iban(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Iban[i];
            }
        }

        public Iban(String iban) {
            Intrinsics.checkNotNullParameter(iban, "iban");
            this.f63975a = iban;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Iban) && Intrinsics.f(this.f63975a, ((Iban) obj2).f63975a);
        }

        public final int hashCode() {
            return this.f63975a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63975a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/review/domain/BankInformation$Uk;", "Lcom/revolut/feature/bank_account_switching/impl/ui/review/domain/BankInformation$AccountNumber;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Uk implements AccountNumber {

        @NotNull
        public static final Parcelable.Creator<Uk> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f63977b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Uk(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Uk[i];
            }
        }

        public Uk(String sortingCode, String accountNumber) {
            Intrinsics.checkNotNullParameter(sortingCode, "sortingCode");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.f63976a = sortingCode;
            this.f63977b = accountNumber;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Uk)) {
                return false;
            }
            Uk uk3 = (Uk) obj2;
            return Intrinsics.f(this.f63976a, uk3.f63976a) && Intrinsics.f(this.f63977b, uk3.f63977b);
        }

        public final int hashCode() {
            return this.f63977b.hashCode() + (this.f63976a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63976a);
            dest.writeString(this.f63977b);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BankInformation(parcel.readString(), parcel.readString(), (AccountNumber) parcel.readParcelable(BankInformation.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BankInformation[i];
        }
    }

    public BankInformation(String name, String logoUrl, AccountNumber accountNumber) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        this.f63972a = name;
        this.f63973b = logoUrl;
        this.f63974c = accountNumber;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BankInformation)) {
            return false;
        }
        BankInformation bankInformation = (BankInformation) obj2;
        return Intrinsics.f(this.f63972a, bankInformation.f63972a) && Intrinsics.f(this.f63973b, bankInformation.f63973b) && Intrinsics.f(this.f63974c, bankInformation.f63974c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f63972a.hashCode() * 31, 31, this.f63973b);
        AccountNumber accountNumber = this.f63974c;
        return iC + (accountNumber == null ? 0 : accountNumber.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63972a);
        dest.writeString(this.f63973b);
        dest.writeParcelable(this.f63974c, i);
    }
}
