package com.revolut.feature.salary_switch.impl.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/models/SalarySwitchPreview;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Account", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SalarySwitchPreview implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SalarySwitchPreview> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Account f85230b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/models/SalarySwitchPreview$Account;", "Landroid/os/Parcelable;", "Card", "Clabe", "Lcom/revolut/feature/salary_switch/impl/models/SalarySwitchPreview$Account$Card;", "Lcom/revolut/feature/salary_switch/impl/models/SalarySwitchPreview$Account$Clabe;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Account extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/models/SalarySwitchPreview$Account$Card;", "Lcom/revolut/feature/salary_switch/impl/models/SalarySwitchPreview$Account;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Card implements Account {

            @NotNull
            public static final Parcelable.Creator<Card> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f85231a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f85232b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f85233c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Card(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Card[i];
                }
            }

            public Card(String number, String maskedNumber, String token) {
                Intrinsics.checkNotNullParameter(number, "number");
                Intrinsics.checkNotNullParameter(maskedNumber, "maskedNumber");
                Intrinsics.checkNotNullParameter(token, "token");
                this.f85231a = number;
                this.f85232b = maskedNumber;
                this.f85233c = token;
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
                return Intrinsics.f(this.f85231a, card.f85231a) && Intrinsics.f(this.f85232b, card.f85232b) && Intrinsics.f(this.f85233c, card.f85233c);
            }

            @Override // com.revolut.feature.salary_switch.impl.models.SalarySwitchPreview.Account
            /* JADX INFO: renamed from: getNumber, reason: from getter */
            public final String getF85234a() {
                return this.f85231a;
            }

            public final int hashCode() {
                return this.f85233c.hashCode() + p.a.c(this.f85231a.hashCode() * 31, 31, this.f85232b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f85231a);
                dest.writeString(this.f85232b);
                dest.writeString(this.f85233c);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/models/SalarySwitchPreview$Account$Clabe;", "Lcom/revolut/feature/salary_switch/impl/models/SalarySwitchPreview$Account;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Clabe implements Account {

            @NotNull
            public static final Parcelable.Creator<Clabe> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f85234a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Clabe(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Clabe[i];
                }
            }

            public Clabe(String number) {
                Intrinsics.checkNotNullParameter(number, "number");
                this.f85234a = number;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Clabe) && Intrinsics.f(this.f85234a, ((Clabe) obj2).f85234a);
            }

            @Override // com.revolut.feature.salary_switch.impl.models.SalarySwitchPreview.Account
            /* JADX INFO: renamed from: getNumber, reason: from getter */
            public final String getF85234a() {
                return this.f85234a;
            }

            public final int hashCode() {
                return this.f85234a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f85234a);
            }
        }

        /* JADX INFO: renamed from: getNumber */
        String getF85234a();
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SalarySwitchPreview(parcel.readString(), (Account) parcel.readParcelable(SalarySwitchPreview.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SalarySwitchPreview[i];
        }
    }

    public SalarySwitchPreview(String bankName, Account account) {
        Intrinsics.checkNotNullParameter(bankName, "bankName");
        Intrinsics.checkNotNullParameter(account, "account");
        this.f85229a = bankName;
        this.f85230b = account;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SalarySwitchPreview)) {
            return false;
        }
        SalarySwitchPreview salarySwitchPreview = (SalarySwitchPreview) obj2;
        return Intrinsics.f(this.f85229a, salarySwitchPreview.f85229a) && Intrinsics.f(this.f85230b, salarySwitchPreview.f85230b);
    }

    public final int hashCode() {
        return this.f85230b.hashCode() + (this.f85229a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85229a);
        dest.writeParcelable(this.f85230b, i);
    }
}
