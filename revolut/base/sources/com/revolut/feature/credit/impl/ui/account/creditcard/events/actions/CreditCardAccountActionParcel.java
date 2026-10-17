package com.revolut.feature.credit.impl.ui.account.creditcard.events.actions;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;
import yw4.l;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\"À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel;", "Landroid/os/Parcelable;", "Details", "Repay", "SetupAutoPay", "AutoPaySettings", "Statement", "GetHelp", "BalanceTransfer", "DisplayAmount", "Instalment", "AdditionalCards", "AdditionalCardsOnboarding", "Settings", "ChangeDueDate", "Insurance", "AddInsurance", "Move", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$AddInsurance;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$AdditionalCards;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$AdditionalCardsOnboarding;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$AutoPaySettings;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$BalanceTransfer;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$ChangeDueDate;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$Details;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$DisplayAmount;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$GetHelp;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$Instalment;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$Insurance;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$Move;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$Repay;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$Settings;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$SetupAutoPay;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$Statement;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardAccountActionParcel extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$AddInsurance;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel;", "", "toString", "()Ljava/lang/String;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddInsurance implements CreditCardAccountActionParcel {

        @NotNull
        public static final Parcelable.Creator<AddInsurance> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70022a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddInsurance(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddInsurance[i];
            }
        }

        public AddInsurance(String facilityId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f70022a = facilityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddInsurance) && Intrinsics.f(this.f70022a, ((AddInsurance) obj2).f70022a);
        }

        public final int hashCode() {
            return this.f70022a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70022a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$AdditionalCards;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel;", "", "toString", "()Ljava/lang/String;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdditionalCards implements CreditCardAccountActionParcel {

        @NotNull
        public static final Parcelable.Creator<AdditionalCards> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70023a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AdditionalCards(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalCards[i];
            }
        }

        public AdditionalCards(String facilityId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f70023a = facilityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AdditionalCards) && Intrinsics.f(this.f70023a, ((AdditionalCards) obj2).f70023a);
        }

        public final int hashCode() {
            return this.f70023a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70023a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$AdditionalCardsOnboarding;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel;", "", "toString", "()Ljava/lang/String;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdditionalCardsOnboarding implements CreditCardAccountActionParcel {

        @NotNull
        public static final Parcelable.Creator<AdditionalCardsOnboarding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70024a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AdditionalCardsOnboarding(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalCardsOnboarding[i];
            }
        }

        public AdditionalCardsOnboarding(String facilityId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f70024a = facilityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AdditionalCardsOnboarding) && Intrinsics.f(this.f70024a, ((AdditionalCardsOnboarding) obj2).f70024a);
        }

        public final int hashCode() {
            return this.f70024a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70024a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$AutoPaySettings;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel;", "", "toString", "()Ljava/lang/String;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AutoPaySettings implements CreditCardAccountActionParcel {

        @NotNull
        public static final Parcelable.Creator<AutoPaySettings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70025a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AutoPaySettings(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutoPaySettings[i];
            }
        }

        public AutoPaySettings(String facilityId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f70025a = facilityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AutoPaySettings) && Intrinsics.f(this.f70025a, ((AutoPaySettings) obj2).f70025a);
        }

        public final int hashCode() {
            return this.f70025a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70025a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$BalanceTransfer;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel;", "", "toString", "()Ljava/lang/String;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BalanceTransfer implements CreditCardAccountActionParcel {

        @NotNull
        public static final Parcelable.Creator<BalanceTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f70027b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BalanceTransfer(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BalanceTransfer[i];
            }
        }

        public BalanceTransfer(String facilityId, String pocketId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            this.f70026a = facilityId;
            this.f70027b = pocketId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BalanceTransfer)) {
                return false;
            }
            BalanceTransfer balanceTransfer = (BalanceTransfer) obj2;
            return Intrinsics.f(this.f70026a, balanceTransfer.f70026a) && Intrinsics.f(this.f70027b, balanceTransfer.f70027b);
        }

        public final int hashCode() {
            return this.f70027b.hashCode() + (this.f70026a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70026a);
            dest.writeString(this.f70027b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$ChangeDueDate;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel;", "", "toString", "()Ljava/lang/String;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChangeDueDate implements CreditCardAccountActionParcel {

        @NotNull
        public static final Parcelable.Creator<ChangeDueDate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70028a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangeDueDate(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangeDueDate[i];
            }
        }

        public ChangeDueDate(String facilityId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f70028a = facilityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChangeDueDate) && Intrinsics.f(this.f70028a, ((ChangeDueDate) obj2).f70028a);
        }

        public final int hashCode() {
            return this.f70028a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70028a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$Details;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel;", "", "toString", "()Ljava/lang/String;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details implements CreditCardAccountActionParcel {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f70030b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Details(parcel.readString(), l.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(String facilityId, l accessLevel) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(accessLevel, "accessLevel");
            this.f70029a = facilityId;
            this.f70030b = accessLevel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Details)) {
                return false;
            }
            Details details = (Details) obj2;
            return Intrinsics.f(this.f70029a, details.f70029a) && this.f70030b == details.f70030b;
        }

        public final int hashCode() {
            return this.f70030b.hashCode() + (this.f70029a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70029a);
            dest.writeString(this.f70030b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$DisplayAmount;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel;", "", "toString", "()Ljava/lang/String;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DisplayAmount implements CreditCardAccountActionParcel {

        @NotNull
        public static final Parcelable.Creator<DisplayAmount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f70032b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DisplayAmount(parcel.readString(), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DisplayAmount[i];
            }
        }

        public DisplayAmount(String facilityId, b currency) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f70031a = facilityId;
            this.f70032b = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DisplayAmount)) {
                return false;
            }
            DisplayAmount displayAmount = (DisplayAmount) obj2;
            return Intrinsics.f(this.f70031a, displayAmount.f70031a) && Intrinsics.f(this.f70032b, displayAmount.f70032b);
        }

        public final int hashCode() {
            return this.f70032b.hashCode() + (this.f70031a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70031a);
            dest.writeSerializable(this.f70032b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$GetHelp;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel;", "", "toString", "()Ljava/lang/String;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GetHelp implements CreditCardAccountActionParcel {

        @NotNull
        public static final Parcelable.Creator<GetHelp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70033a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GetHelp(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GetHelp[i];
            }
        }

        public GetHelp(String facilityId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f70033a = facilityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GetHelp) && Intrinsics.f(this.f70033a, ((GetHelp) obj2).f70033a);
        }

        public final int hashCode() {
            return this.f70033a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70033a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$Instalment;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel;", "", "toString", "()Ljava/lang/String;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Instalment implements CreditCardAccountActionParcel {

        @NotNull
        public static final Parcelable.Creator<Instalment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70034a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Instalment(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Instalment[i];
            }
        }

        public Instalment(String facilityId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f70034a = facilityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Instalment) && Intrinsics.f(this.f70034a, ((Instalment) obj2).f70034a);
        }

        public final int hashCode() {
            return this.f70034a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70034a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$Insurance;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel;", "", "toString", "()Ljava/lang/String;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Insurance implements CreditCardAccountActionParcel {

        @NotNull
        public static final Parcelable.Creator<Insurance> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f70036b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Insurance(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Insurance[i];
            }
        }

        public Insurance(String facilityId, String policyId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(policyId, "policyId");
            this.f70035a = facilityId;
            this.f70036b = policyId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Insurance)) {
                return false;
            }
            Insurance insurance = (Insurance) obj2;
            return Intrinsics.f(this.f70035a, insurance.f70035a) && Intrinsics.f(this.f70036b, insurance.f70036b);
        }

        public final int hashCode() {
            return this.f70036b.hashCode() + (this.f70035a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70035a);
            dest.writeString(this.f70036b);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$Move;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel;", "Overdue", "Available", "Forbearance", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$Move$Available;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$Move$Forbearance;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$Move$Overdue;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Move extends CreditCardAccountActionParcel {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$Move$Available;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$Move;", "", "toString", "()Ljava/lang/String;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Available implements Move {

            @NotNull
            public static final Parcelable.Creator<Available> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f70037a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Available(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Available[i];
                }
            }

            public Available(String pocketId) {
                Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                this.f70037a = pocketId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Available) && Intrinsics.f(this.f70037a, ((Available) obj2).f70037a);
            }

            public final int hashCode() {
                return this.f70037a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f70037a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$Move$Forbearance;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$Move;", "", "toString", "()Ljava/lang/String;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Forbearance implements Move {

            @NotNull
            public static final Parcelable.Creator<Forbearance> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final wi0.b f70038a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Forbearance((wi0.b) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Forbearance[i];
                }
            }

            public Forbearance(wi0.b countryCode) {
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                this.f70038a = countryCode;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Forbearance) && Intrinsics.f(this.f70038a, ((Forbearance) obj2).f70038a);
            }

            public final int hashCode() {
                return this.f70038a.f297794a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f70038a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$Move$Overdue;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$Move;", "", "toString", "()Ljava/lang/String;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Overdue implements Move {

            @NotNull
            public static final Parcelable.Creator<Overdue> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f70039a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final d f70040b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final wi0.b f70041c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Overdue((d) parcel.readSerializable(), parcel.readString(), (wi0.b) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Overdue[i];
                }
            }

            public Overdue(d amount, String pocketId, wi0.b countryCode) {
                Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                this.f70039a = pocketId;
                this.f70040b = amount;
                this.f70041c = countryCode;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Overdue)) {
                    return false;
                }
                Overdue overdue = (Overdue) obj2;
                return Intrinsics.f(this.f70039a, overdue.f70039a) && Intrinsics.f(this.f70040b, overdue.f70040b) && Intrinsics.f(this.f70041c, overdue.f70041c);
            }

            public final int hashCode() {
                return this.f70041c.f297794a.hashCode() + v7.c(this.f70039a.hashCode() * 31, 31, this.f70040b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f70039a);
                dest.writeSerializable(this.f70040b);
                dest.writeSerializable(this.f70041c);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$Repay;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel;", "", "toString", "()Ljava/lang/String;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Repay implements CreditCardAccountActionParcel {

        @NotNull
        public static final Parcelable.Creator<Repay> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f70043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f70044c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Repay((d) parcel.readSerializable(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Repay[i];
            }
        }

        public Repay(d dVar, String facilityId, String str) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f70042a = facilityId;
            this.f70043b = dVar;
            this.f70044c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Repay)) {
                return false;
            }
            Repay repay = (Repay) obj2;
            return Intrinsics.f(this.f70042a, repay.f70042a) && Intrinsics.f(this.f70043b, repay.f70043b) && Intrinsics.f(this.f70044c, repay.f70044c);
        }

        public final int hashCode() {
            int iHashCode = this.f70042a.hashCode() * 31;
            d dVar = this.f70043b;
            int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
            String str = this.f70044c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70042a);
            dest.writeSerializable(this.f70043b);
            dest.writeString(this.f70044c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$Settings;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel;", "", "toString", "()Ljava/lang/String;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Settings implements CreditCardAccountActionParcel {

        @NotNull
        public static final Parcelable.Creator<Settings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70045a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Settings(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Settings[i];
            }
        }

        public Settings(String facilityId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f70045a = facilityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Settings) && Intrinsics.f(this.f70045a, ((Settings) obj2).f70045a);
        }

        public final int hashCode() {
            return this.f70045a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70045a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$SetupAutoPay;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel;", "", "toString", "()Ljava/lang/String;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetupAutoPay implements CreditCardAccountActionParcel {

        @NotNull
        public static final Parcelable.Creator<SetupAutoPay> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70046a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SetupAutoPay(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SetupAutoPay[i];
            }
        }

        public SetupAutoPay(String facilityId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f70046a = facilityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SetupAutoPay) && Intrinsics.f(this.f70046a, ((SetupAutoPay) obj2).f70046a);
        }

        public final int hashCode() {
            return this.f70046a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70046a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel$Statement;", "Lcom/revolut/feature/credit/impl/ui/account/creditcard/events/actions/CreditCardAccountActionParcel;", "", "toString", "()Ljava/lang/String;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Statement implements CreditCardAccountActionParcel {

        @NotNull
        public static final Parcelable.Creator<Statement> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70047a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Statement(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Statement[i];
            }
        }

        public Statement(String facilityId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f70047a = facilityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Statement) && Intrinsics.f(this.f70047a, ((Statement) obj2).f70047a);
        }

        public final int hashCode() {
            return this.f70047a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70047a);
        }
    }
}
