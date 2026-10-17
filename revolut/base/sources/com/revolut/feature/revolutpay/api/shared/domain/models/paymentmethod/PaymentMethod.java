package com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.CardPaymentAvailability;
import ip0.v7;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0004\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PaymentMethod;", "Landroid/os/Parcelable;", "Companion", "Card", "BankAccount", "RevolutAccount", "Pocket", "a", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PaymentMethod$BankAccount;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PaymentMethod$Card;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PaymentMethod$Pocket;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PaymentMethod$RevolutAccount;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PaymentMethod extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f84397a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PaymentMethod$BankAccount;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PaymentMethod;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @yhm.d
    public static final /* data */ class BankAccount implements PaymentMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84369b;

        @NotNull
        public static final Parcelable.Creator<BankAccount> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BankAccount(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BankAccount[i];
            }
        }

        public BankAccount(String id10, String accountNumber) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.f84368a = id10;
            this.f84369b = accountNumber;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BankAccount)) {
                return false;
            }
            BankAccount bankAccount = (BankAccount) obj2;
            return Intrinsics.f(this.f84368a, bankAccount.f84368a) && Intrinsics.f(this.f84369b, bankAccount.f84369b);
        }

        @Override // com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF84393a() {
            return this.f84368a;
        }

        public final int hashCode() {
            return this.f84369b.hashCode() + (this.f84368a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84368a);
            dest.writeString(this.f84369b);
        }

        @Override // com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod
        public final boolean x2() {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PaymentMethod$Card;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PaymentMethod;", "", "toString", "()Ljava/lang/String;", "Companion", "com/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/c", "a", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Card implements PaymentMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f84372c;
        public final c d;
        public final int e;
        public final int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final BillingAddress f84373g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f84374h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f84375j;

        @NotNull
        public static final Parcelable.Creator<Card> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Card(parcel.readString(), parcel.readString(), parcel.readString(), c.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : BillingAddress.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Card[i];
            }
        }

        public Card(String id10, String str, String lastFour, c brand, int i, int i2, BillingAddress billingAddress, boolean z, String str2, String str3) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(lastFour, "lastFour");
            Intrinsics.checkNotNullParameter(brand, "brand");
            this.f84370a = id10;
            this.f84371b = str;
            this.f84372c = lastFour;
            this.d = brand;
            this.e = i;
            this.f = i2;
            this.f84373g = billingAddress;
            this.f84374h = z;
            this.i = str2;
            this.f84375j = str3;
        }

        public final boolean a(CardPaymentAvailability cardPaymentAvailability) {
            Intrinsics.checkNotNullParameter(cardPaymentAvailability, "cardPaymentAvailability");
            if ((cardPaymentAvailability instanceof CardPaymentAvailability.NotAvailable) || (cardPaymentAvailability instanceof CardPaymentAvailability.DisabledAtMerchant)) {
                return false;
            }
            if (cardPaymentAvailability instanceof CardPaymentAvailability.Available) {
                return ((CardPaymentAvailability.Available) cardPaymentAvailability).f84362a.contains(this.d);
            }
            throw new NoWhenBranchMatchedException();
        }

        public final boolean b(LocalDate nowDate) {
            Intrinsics.checkNotNullParameter(nowDate, "nowDate");
            LocalDate localDateOf = LocalDate.of(this.f, this.e, 1);
            Intrinsics.checkNotNullExpressionValue(localDateOf, "of(...)");
            return nowDate.compareTo((ChronoLocalDate) oc.c.O(localDateOf)) > 0;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Card)) {
                return false;
            }
            Card card = (Card) obj2;
            return Intrinsics.f(this.f84370a, card.f84370a) && Intrinsics.f(this.f84371b, card.f84371b) && Intrinsics.f(this.f84372c, card.f84372c) && this.d == card.d && this.e == card.e && this.f == card.f && Intrinsics.f(this.f84373g, card.f84373g) && this.f84374h == card.f84374h && Intrinsics.f(this.i, card.i) && Intrinsics.f(this.f84375j, card.f84375j);
        }

        @Override // com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF84393a() {
            return this.f84370a;
        }

        public final int hashCode() {
            int iHashCode = this.f84370a.hashCode() * 31;
            String str = this.f84371b;
            int iB = j6.a.b(this.f, j6.a.b(this.e, (this.d.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f84372c)) * 31, 31), 31);
            BillingAddress billingAddress = this.f84373g;
            int iC = j6.a.c((iB + (billingAddress == null ? 0 : billingAddress.hashCode())) * 31, 31, this.f84374h);
            String str2 = this.i;
            int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f84375j;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84370a);
            dest.writeString(this.f84371b);
            dest.writeString(this.f84372c);
            dest.writeString(this.d.name());
            dest.writeInt(this.e);
            dest.writeInt(this.f);
            BillingAddress billingAddress = this.f84373g;
            if (billingAddress == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                billingAddress.writeToParcel(dest, i);
            }
            dest.writeInt(this.f84374h ? 1 : 0);
            dest.writeString(this.i);
            dest.writeString(this.f84375j);
        }

        @Override // com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod
        public final boolean x2() {
            if (!this.f84374h) {
                return false;
            }
            String str = this.i;
            if (str == null) {
                str = "";
            }
            return str.length() != (d.f84406a[this.d.ordinal()] == 1 ? 4 : 3);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0006\u0006\u0007\b\t\n\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PaymentMethod$Pocket;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PaymentMethod;", "", "toString", "()Ljava/lang/String;", "Companion", "com/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/i", "com/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/h", "com/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/f", "com/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/e", "PocketDetails", "a", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pocket implements PaymentMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i f84378c;
        public final h d;
        public final boolean e;
        public final j f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final e f84379g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final f f84380h;
        public final dj0.d i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final dj0.d f84381j;
        public final String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f84382l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final PocketDetails f84383m;

        @NotNull
        public static final Parcelable.Creator<Pocket> CREATOR = new b();

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PaymentMethod$Pocket$PocketDetails;", "Landroid/os/Parcelable;", "Empty", "Pockets", "Savings", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PaymentMethod$Pocket$PocketDetails$Empty;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PaymentMethod$Pocket$PocketDetails$Pockets;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PaymentMethod$Pocket$PocketDetails$Savings;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface PocketDetails extends Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PaymentMethod$Pocket$PocketDetails$Empty;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PaymentMethod$Pocket$PocketDetails;", "<init>", "()V", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Empty implements PocketDetails {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Empty f84384a = new Empty();

                @NotNull
                public static final Parcelable.Creator<Empty> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Empty.f84384a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Empty[i];
                    }
                }

                private Empty() {
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

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PaymentMethod$Pocket$PocketDetails$Pockets;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PaymentMethod$Pocket$PocketDetails;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Pockets implements PocketDetails {

                @NotNull
                public static final Parcelable.Creator<Pockets> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f84385a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Pockets(parcel.readInt());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Pockets[i];
                    }
                }

                public Pockets(int i) {
                    this.f84385a = i;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Pockets) && this.f84385a == ((Pockets) obj2).f84385a;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.f84385a);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(this.f84385a);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PaymentMethod$Pocket$PocketDetails$Savings;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PaymentMethod$Pocket$PocketDetails;", "", "toString", "()Ljava/lang/String;", "Companion", "com/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/g", "EarningRates", "a", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Savings implements PocketDetails {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final g f84386a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final EarningRates f84387b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f84388c;

                @NotNull
                public static final Parcelable.Creator<Savings> CREATOR = new b();

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PaymentMethod$Pocket$PocketDetails$Savings$EarningRates;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Rate", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class EarningRates implements Parcelable {

                    @NotNull
                    public static final Parcelable.Creator<EarningRates> CREATOR = new a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Rate f84389a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Rate f84390b;

                    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PaymentMethod$Pocket$PocketDetails$Savings$EarningRates$Rate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                    public static final /* data */ class Rate implements Parcelable {

                        @NotNull
                        public static final Parcelable.Creator<Rate> CREATOR = new a();

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final double f84391a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final String f84392b;

                        public static final class a implements Parcelable.Creator {
                            @Override // android.os.Parcelable.Creator
                            public final Object createFromParcel(Parcel parcel) {
                                Intrinsics.checkNotNullParameter(parcel, "parcel");
                                return new Rate(parcel.readDouble(), parcel.readString());
                            }

                            @Override // android.os.Parcelable.Creator
                            public final Object[] newArray(int i) {
                                return new Rate[i];
                            }
                        }

                        public Rate(double d, String name) {
                            Intrinsics.checkNotNullParameter(name, "name");
                            this.f84391a = d;
                            this.f84392b = name;
                        }

                        @Override // android.os.Parcelable
                        public final int describeContents() {
                            return 0;
                        }

                        public final boolean equals(Object obj2) {
                            if (this == obj2) {
                                return true;
                            }
                            if (!(obj2 instanceof Rate)) {
                                return false;
                            }
                            Rate rate = (Rate) obj2;
                            return Double.compare(this.f84391a, rate.f84391a) == 0 && Intrinsics.f(this.f84392b, rate.f84392b);
                        }

                        public final int hashCode() {
                            return this.f84392b.hashCode() + (Double.hashCode(this.f84391a) * 31);
                        }

                        @Override // android.os.Parcelable
                        public final void writeToParcel(Parcel dest, int i) {
                            Intrinsics.checkNotNullParameter(dest, "dest");
                            dest.writeDouble(this.f84391a);
                            dest.writeString(this.f84392b);
                        }
                    }

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            Parcelable.Creator<Rate> creator = Rate.CREATOR;
                            return new EarningRates(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new EarningRates[i];
                        }
                    }

                    public EarningRates(Rate primaryRate, Rate rate) {
                        Intrinsics.checkNotNullParameter(primaryRate, "primaryRate");
                        this.f84389a = primaryRate;
                        this.f84390b = rate;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (!(obj2 instanceof EarningRates)) {
                            return false;
                        }
                        EarningRates earningRates = (EarningRates) obj2;
                        return Intrinsics.f(this.f84389a, earningRates.f84389a) && Intrinsics.f(this.f84390b, earningRates.f84390b);
                    }

                    public final int hashCode() {
                        int iHashCode = this.f84389a.hashCode() * 31;
                        Rate rate = this.f84390b;
                        return iHashCode + (rate == null ? 0 : rate.hashCode());
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        this.f84389a.writeToParcel(dest, i);
                        Rate rate = this.f84390b;
                        if (rate == null) {
                            dest.writeInt(0);
                        } else {
                            dest.writeInt(1);
                            rate.writeToParcel(dest, i);
                        }
                    }
                }

                public static final class b implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Savings(g.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : EarningRates.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Savings[i];
                    }
                }

                public Savings(g savingsAccountProvider, EarningRates earningRates, boolean z) {
                    Intrinsics.checkNotNullParameter(savingsAccountProvider, "savingsAccountProvider");
                    this.f84386a = savingsAccountProvider;
                    this.f84387b = earningRates;
                    this.f84388c = z;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Savings)) {
                        return false;
                    }
                    Savings savings = (Savings) obj2;
                    return this.f84386a == savings.f84386a && Intrinsics.f(this.f84387b, savings.f84387b) && this.f84388c == savings.f84388c;
                }

                public final int hashCode() {
                    int iHashCode = this.f84386a.hashCode() * 31;
                    EarningRates earningRates = this.f84387b;
                    return Boolean.hashCode(this.f84388c) + ((iHashCode + (earningRates == null ? 0 : earningRates.hashCode())) * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f84386a.name());
                    EarningRates earningRates = this.f84387b;
                    if (earningRates == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        earningRates.writeToParcel(dest, i);
                    }
                    dest.writeInt(this.f84388c ? 1 : 0);
                }
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                i iVarValueOf = i.valueOf(parcel.readString());
                h hVarValueOf = h.valueOf(parcel.readString());
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                j jVarValueOf = j.valueOf(parcel.readString());
                e eVarValueOf = e.valueOf(parcel.readString());
                f fVarValueOf = f.valueOf(parcel.readString());
                dj0.d dVar = (dj0.d) parcel.readSerializable();
                dj0.d dVar2 = (dj0.d) parcel.readSerializable();
                boolean z4 = true;
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z4 = z;
                }
                return new Pocket(string, string2, iVarValueOf, hVarValueOf, z3, jVarValueOf, eVarValueOf, fVarValueOf, dVar, dVar2, string3, z4, (PocketDetails) parcel.readParcelable(Pocket.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pocket[i];
            }
        }

        public Pocket(String id10, String revolutAccountId, i type, h subtype, boolean z, j walletType, e assetType, f group, dj0.d balance, dj0.d balanceInRequestedCurrency, String str, boolean z3, PocketDetails pocketDetails) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(revolutAccountId, "revolutAccountId");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(subtype, "subtype");
            Intrinsics.checkNotNullParameter(walletType, "walletType");
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(balance, "balance");
            Intrinsics.checkNotNullParameter(balanceInRequestedCurrency, "balanceInRequestedCurrency");
            Intrinsics.checkNotNullParameter(pocketDetails, "pocketDetails");
            this.f84376a = id10;
            this.f84377b = revolutAccountId;
            this.f84378c = type;
            this.d = subtype;
            this.e = z;
            this.f = walletType;
            this.f84379g = assetType;
            this.f84380h = group;
            this.i = balance;
            this.f84381j = balanceInRequestedCurrency;
            this.k = str;
            this.f84382l = z3;
            this.f84383m = pocketDetails;
        }

        public static Pocket a(Pocket pocket, dj0.d balance) {
            String id10 = pocket.f84376a;
            String revolutAccountId = pocket.f84377b;
            i type = pocket.f84378c;
            h subtype = pocket.d;
            boolean z = pocket.e;
            j walletType = pocket.f;
            e assetType = pocket.f84379g;
            f group = pocket.f84380h;
            dj0.d balanceInRequestedCurrency = pocket.f84381j;
            String str = pocket.k;
            boolean z3 = pocket.f84382l;
            PocketDetails pocketDetails = pocket.f84383m;
            pocket.getClass();
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(revolutAccountId, "revolutAccountId");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(subtype, "subtype");
            Intrinsics.checkNotNullParameter(walletType, "walletType");
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(balance, "balance");
            Intrinsics.checkNotNullParameter(balanceInRequestedCurrency, "balanceInRequestedCurrency");
            Intrinsics.checkNotNullParameter(pocketDetails, "pocketDetails");
            return new Pocket(id10, revolutAccountId, type, subtype, z, walletType, assetType, group, balance, balanceInRequestedCurrency, str, z3, pocketDetails);
        }

        public final boolean b() {
            return this.f84378c == i.MERCHANT || this.d == h.PRO_REGULAR;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Pocket)) {
                return false;
            }
            Pocket pocket = (Pocket) obj2;
            return Intrinsics.f(this.f84376a, pocket.f84376a) && Intrinsics.f(this.f84377b, pocket.f84377b) && this.f84378c == pocket.f84378c && this.d == pocket.d && this.e == pocket.e && this.f == pocket.f && this.f84379g == pocket.f84379g && this.f84380h == pocket.f84380h && Intrinsics.f(this.i, pocket.i) && Intrinsics.f(this.f84381j, pocket.f84381j) && Intrinsics.f(this.k, pocket.k) && this.f84382l == pocket.f84382l && Intrinsics.f(this.f84383m, pocket.f84383m);
        }

        @Override // com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF84393a() {
            return this.f84376a;
        }

        public final int hashCode() {
            int iC = v7.c(v7.c((this.f84380h.hashCode() + ((this.f84379g.hashCode() + ((this.f.hashCode() + j6.a.c((this.d.hashCode() + ((this.f84378c.hashCode() + p.a.c(this.f84376a.hashCode() * 31, 31, this.f84377b)) * 31)) * 31, 31, this.e)) * 31)) * 31)) * 31, 31, this.i), 31, this.f84381j);
            String str = this.k;
            return this.f84383m.hashCode() + j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f84382l);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84376a);
            dest.writeString(this.f84377b);
            dest.writeString(this.f84378c.name());
            dest.writeString(this.d.name());
            dest.writeInt(this.e ? 1 : 0);
            dest.writeString(this.f.name());
            dest.writeString(this.f84379g.name());
            dest.writeString(this.f84380h.name());
            dest.writeSerializable(this.i);
            dest.writeSerializable(this.f84381j);
            dest.writeString(this.k);
            dest.writeInt(this.f84382l ? 1 : 0);
            dest.writeParcelable(this.f84383m, i);
        }

        @Override // com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod
        public final boolean x2() {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PaymentMethod$RevolutAccount;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PaymentMethod;", "", "toString", "()Ljava/lang/String;", "Companion", "Wallet", "a", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevolutAccount implements PaymentMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f84394b;

        @NotNull
        public static final Parcelable.Creator<RevolutAccount> CREATOR = new b();

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/PaymentMethod$RevolutAccount$Wallet;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "com/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/j", "a", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Wallet implements Parcelable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final j f84395a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Map f84396b;

            @NotNull
            public static final Parcelable.Creator<Wallet> CREATOR = new b();

            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    j jVarValueOf = j.valueOf(parcel.readString());
                    int i = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        f fVarValueOf = f.valueOf(parcel.readString());
                        int i3 = parcel.readInt();
                        ArrayList arrayList = new ArrayList(i3);
                        int iA = 0;
                        while (iA != i3) {
                            iA = org.bouncycastle.jcajce.provider.digest.a.a(Pocket.CREATOR, parcel, arrayList, iA, 1);
                        }
                        linkedHashMap.put(fVarValueOf, arrayList);
                    }
                    return new Wallet(jVarValueOf, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Wallet[i];
                }
            }

            public Wallet(j type, Map pockets) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                this.f84395a = type;
                this.f84396b = pockets;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Wallet)) {
                    return false;
                }
                Wallet wallet = (Wallet) obj2;
                return this.f84395a == wallet.f84395a && Intrinsics.f(this.f84396b, wallet.f84396b);
            }

            public final int hashCode() {
                return this.f84396b.hashCode() + (this.f84395a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f84395a.name());
                Iterator itZ = j6.a.z(this.f84396b, dest);
                while (itZ.hasNext()) {
                    Map.Entry entry = (Map.Entry) itZ.next();
                    dest.writeString(((f) entry.getKey()).name());
                    Iterator itV = p.a.v((List) entry.getValue(), dest);
                    while (itV.hasNext()) {
                        ((Pocket) itV.next()).writeToParcel(dest, i);
                    }
                }
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(j.valueOf(parcel.readString()), Wallet.CREATOR.createFromParcel(parcel));
                }
                return new RevolutAccount(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevolutAccount[i];
            }
        }

        public RevolutAccount(String id10, Map wallets) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(wallets, "wallets");
            this.f84393a = id10;
            this.f84394b = wallets;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RevolutAccount)) {
                return false;
            }
            RevolutAccount revolutAccount = (RevolutAccount) obj2;
            return Intrinsics.f(this.f84393a, revolutAccount.f84393a) && this.f84394b.equals(revolutAccount.f84394b);
        }

        @Override // com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF84393a() {
            return this.f84393a;
        }

        public final int hashCode() {
            return this.f84394b.hashCode() + (this.f84393a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84393a);
            Iterator itT = o.t(this.f84394b, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString(((j) entry.getKey()).name());
                ((Wallet) entry.getValue()).writeToParcel(dest, i);
            }
        }

        @Override // com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod
        public final boolean x2() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f84397a = new Companion();

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: getId */
    String getF84393a();

    boolean x2();
}
