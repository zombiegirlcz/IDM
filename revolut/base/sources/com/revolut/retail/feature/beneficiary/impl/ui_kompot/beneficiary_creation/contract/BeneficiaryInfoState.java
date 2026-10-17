package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.beneficiary.api.common.BeneficiaryRouteType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s4j.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/BeneficiaryInfoState;", "Landroid/os/Parcelable;", "BankRecipient", "MobileWallet", "PaymentVendor", "CreditCardBeneficiary", "s4j/b", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/BeneficiaryInfoState$BankRecipient;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/BeneficiaryInfoState$CreditCardBeneficiary;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/BeneficiaryInfoState$MobileWallet;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/BeneficiaryInfoState$PaymentVendor;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BeneficiaryInfoState implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f99703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BeneficiaryRouteType f99704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f99705c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/BeneficiaryInfoState$BankRecipient;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/BeneficiaryInfoState;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BankRecipient extends BeneficiaryInfoState {

        @NotNull
        public static final Parcelable.Creator<BankRecipient> CREATOR = new a();
        public final Field$Country d;
        public final Field$Currency e;
        public final Field$RouteSelector f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f99706g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final b f99707h;
        public final Field$ExpansionDefinition i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Field$Country field$CountryCreateFromParcel = Field$Country.CREATOR.createFromParcel(parcel);
                Field$Currency field$CurrencyCreateFromParcel = Field$Currency.CREATOR.createFromParcel(parcel);
                Field$RouteSelector field$RouteSelectorCreateFromParcel = Field$RouteSelector.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(BankRecipient.class, parcel, arrayList, iE, 1);
                }
                return new BankRecipient(field$CountryCreateFromParcel, field$CurrencyCreateFromParcel, field$RouteSelectorCreateFromParcel, arrayList, b.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Field$ExpansionDefinition.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BankRecipient[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BankRecipient(Field$Country country, Field$Currency currency, Field$RouteSelector routeSelector, List backendDefinitions, b accountType, Field$ExpansionDefinition field$ExpansionDefinition) {
            super(backendDefinitions, BeneficiaryRouteType.BANK.f99587a, accountType);
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(routeSelector, "routeSelector");
            Intrinsics.checkNotNullParameter(backendDefinitions, "backendDefinitions");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            this.d = country;
            this.e = currency;
            this.f = routeSelector;
            this.f99706g = backendDefinitions;
            this.f99707h = accountType;
            this.i = field$ExpansionDefinition;
        }

        public static BankRecipient z(BankRecipient bankRecipient, Field$Country field$Country, Field$Currency field$Currency, Field$RouteSelector field$RouteSelector, List backendDefinitions, b bVar, Field$ExpansionDefinition field$ExpansionDefinition, int i) {
            if ((i & 1) != 0) {
                field$Country = bankRecipient.d;
            }
            Field$Country country = field$Country;
            if ((i & 2) != 0) {
                field$Currency = bankRecipient.e;
            }
            Field$Currency currency = field$Currency;
            if ((i & 4) != 0) {
                field$RouteSelector = bankRecipient.f;
            }
            Field$RouteSelector routeSelector = field$RouteSelector;
            if ((i & 16) != 0) {
                bVar = bankRecipient.f99707h;
            }
            b accountType = bVar;
            if ((i & 32) != 0) {
                field$ExpansionDefinition = bankRecipient.i;
            }
            bankRecipient.getClass();
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(routeSelector, "routeSelector");
            Intrinsics.checkNotNullParameter(backendDefinitions, "backendDefinitions");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            return new BankRecipient(country, currency, routeSelector, backendDefinitions, accountType, field$ExpansionDefinition);
        }

        @Override // com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getF99705c() {
            return this.f99707h;
        }

        @Override // com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState
        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getF99711g() {
            return this.f99706g;
        }

        @Override // com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Field$Country getD() {
            return this.d;
        }

        @Override // com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Field$Currency getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState
        /* JADX INFO: renamed from: e, reason: from getter */
        public final Field$RouteSelector getF() {
            return this.f;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BankRecipient)) {
                return false;
            }
            BankRecipient bankRecipient = (BankRecipient) obj2;
            return Intrinsics.f(this.d, bankRecipient.d) && Intrinsics.f(this.e, bankRecipient.e) && Intrinsics.f(this.f, bankRecipient.f) && Intrinsics.f(this.f99706g, bankRecipient.f99706g) && this.f99707h == bankRecipient.f99707h && Intrinsics.f(this.i, bankRecipient.i);
        }

        public final int hashCode() {
            int iHashCode = (this.f99707h.hashCode() + p.a.d((this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31, 31, this.f99706g)) * 31;
            Field$ExpansionDefinition field$ExpansionDefinition = this.i;
            return iHashCode + (field$ExpansionDefinition == null ? 0 : field$ExpansionDefinition.f99729a.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.d.writeToParcel(dest, i);
            this.e.writeToParcel(dest, i);
            this.f.writeToParcel(dest, i);
            Iterator itV = p.a.v(this.f99706g, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeString(this.f99707h.name());
            Field$ExpansionDefinition field$ExpansionDefinition = this.i;
            if (field$ExpansionDefinition == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                field$ExpansionDefinition.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/BeneficiaryInfoState$CreditCardBeneficiary;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/BeneficiaryInfoState;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditCardBeneficiary extends BeneficiaryInfoState {

        @NotNull
        public static final Parcelable.Creator<CreditCardBeneficiary> CREATOR = new a();
        public final Field$Country d;
        public final Field$Currency e;
        public final Field$RouteSelector f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f99708g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Field$Country field$CountryCreateFromParcel = Field$Country.CREATOR.createFromParcel(parcel);
                Field$Currency field$CurrencyCreateFromParcel = Field$Currency.CREATOR.createFromParcel(parcel);
                Field$RouteSelector field$RouteSelectorCreateFromParcel = Field$RouteSelector.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(CreditCardBeneficiary.class, parcel, arrayList, iE, 1);
                }
                return new CreditCardBeneficiary(field$CountryCreateFromParcel, field$CurrencyCreateFromParcel, field$RouteSelectorCreateFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditCardBeneficiary[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreditCardBeneficiary(Field$Country country, Field$Currency currency, Field$RouteSelector routeSelector, List backendDefinitions) {
            super(backendDefinitions, BeneficiaryRouteType.BANK.f99587a, b.Personal);
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(routeSelector, "routeSelector");
            Intrinsics.checkNotNullParameter(backendDefinitions, "backendDefinitions");
            this.d = country;
            this.e = currency;
            this.f = routeSelector;
            this.f99708g = backendDefinitions;
        }

        public static CreditCardBeneficiary z(CreditCardBeneficiary creditCardBeneficiary, Field$Currency currency, Field$RouteSelector routeSelector, List backendDefinitions, int i) {
            Field$Country country = creditCardBeneficiary.d;
            if ((i & 2) != 0) {
                currency = creditCardBeneficiary.e;
            }
            if ((i & 4) != 0) {
                routeSelector = creditCardBeneficiary.f;
            }
            creditCardBeneficiary.getClass();
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(routeSelector, "routeSelector");
            Intrinsics.checkNotNullParameter(backendDefinitions, "backendDefinitions");
            return new CreditCardBeneficiary(country, currency, routeSelector, backendDefinitions);
        }

        @Override // com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState
        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getF99711g() {
            return this.f99708g;
        }

        @Override // com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Field$Country getD() {
            return this.d;
        }

        @Override // com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Field$Currency getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState
        /* JADX INFO: renamed from: e, reason: from getter */
        public final Field$RouteSelector getF() {
            return this.f;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreditCardBeneficiary)) {
                return false;
            }
            CreditCardBeneficiary creditCardBeneficiary = (CreditCardBeneficiary) obj2;
            return Intrinsics.f(this.d, creditCardBeneficiary.d) && Intrinsics.f(this.e, creditCardBeneficiary.e) && Intrinsics.f(this.f, creditCardBeneficiary.f) && Intrinsics.f(this.f99708g, creditCardBeneficiary.f99708g);
        }

        public final int hashCode() {
            return this.f99708g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.d.writeToParcel(dest, i);
            this.e.writeToParcel(dest, i);
            this.f.writeToParcel(dest, i);
            Iterator itV = p.a.v(this.f99708g, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/BeneficiaryInfoState$MobileWallet;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/BeneficiaryInfoState;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobileWallet extends BeneficiaryInfoState {

        @NotNull
        public static final Parcelable.Creator<MobileWallet> CREATOR = new a();
        public final Field$Country d;
        public final Field$Currency e;
        public final Field$RouteSelector f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f99709g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final BeneficiaryRouteType.MobileWallet f99710h;
        public final b i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Field$Country field$CountryCreateFromParcel = Field$Country.CREATOR.createFromParcel(parcel);
                Field$Currency field$CurrencyCreateFromParcel = Field$Currency.CREATOR.createFromParcel(parcel);
                Field$RouteSelector field$RouteSelectorCreateFromParcel = Field$RouteSelector.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(MobileWallet.class, parcel, arrayList, iE, 1);
                }
                return new MobileWallet(field$CountryCreateFromParcel, field$CurrencyCreateFromParcel, field$RouteSelectorCreateFromParcel, arrayList, (BeneficiaryRouteType.MobileWallet) parcel.readParcelable(MobileWallet.class.getClassLoader()), b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MobileWallet[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MobileWallet(Field$Country country, Field$Currency currency, Field$RouteSelector routeSelector, List backendDefinitions, BeneficiaryRouteType.MobileWallet routeType, b accountType) {
            super(backendDefinitions, routeType, accountType);
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(routeSelector, "routeSelector");
            Intrinsics.checkNotNullParameter(backendDefinitions, "backendDefinitions");
            Intrinsics.checkNotNullParameter(routeType, "routeType");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            this.d = country;
            this.e = currency;
            this.f = routeSelector;
            this.f99709g = backendDefinitions;
            this.f99710h = routeType;
            this.i = accountType;
        }

        public static MobileWallet z(MobileWallet mobileWallet, Field$Country field$Country, Field$Currency field$Currency, Field$RouteSelector field$RouteSelector, List backendDefinitions, b bVar, int i) {
            if ((i & 1) != 0) {
                field$Country = mobileWallet.d;
            }
            Field$Country country = field$Country;
            if ((i & 2) != 0) {
                field$Currency = mobileWallet.e;
            }
            Field$Currency currency = field$Currency;
            if ((i & 4) != 0) {
                field$RouteSelector = mobileWallet.f;
            }
            Field$RouteSelector routeSelector = field$RouteSelector;
            BeneficiaryRouteType.MobileWallet routeType = mobileWallet.f99710h;
            if ((i & 32) != 0) {
                bVar = mobileWallet.i;
            }
            b accountType = bVar;
            mobileWallet.getClass();
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(routeSelector, "routeSelector");
            Intrinsics.checkNotNullParameter(backendDefinitions, "backendDefinitions");
            Intrinsics.checkNotNullParameter(routeType, "routeType");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            return new MobileWallet(country, currency, routeSelector, backendDefinitions, routeType, accountType);
        }

        @Override // com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getF99705c() {
            return this.i;
        }

        @Override // com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState
        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getF99711g() {
            return this.f99709g;
        }

        @Override // com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Field$Country getD() {
            return this.d;
        }

        @Override // com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Field$Currency getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState
        /* JADX INFO: renamed from: e, reason: from getter */
        public final Field$RouteSelector getF() {
            return this.f;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MobileWallet)) {
                return false;
            }
            MobileWallet mobileWallet = (MobileWallet) obj2;
            return Intrinsics.f(this.d, mobileWallet.d) && Intrinsics.f(this.e, mobileWallet.e) && Intrinsics.f(this.f, mobileWallet.f) && Intrinsics.f(this.f99709g, mobileWallet.f99709g) && Intrinsics.f(this.f99710h, mobileWallet.f99710h) && this.i == mobileWallet.i;
        }

        public final int hashCode() {
            return this.i.hashCode() + p.a.c(p.a.d((this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31, 31, this.f99709g), 31, this.f99710h.f99588a);
        }

        @Override // com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState
        /* JADX INFO: renamed from: j */
        public final BeneficiaryRouteType getF99704b() {
            return this.f99710h;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.d.writeToParcel(dest, i);
            this.e.writeToParcel(dest, i);
            this.f.writeToParcel(dest, i);
            Iterator itV = p.a.v(this.f99709g, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeParcelable(this.f99710h, i);
            dest.writeString(this.i.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/BeneficiaryInfoState$PaymentVendor;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/BeneficiaryInfoState;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentVendor extends BeneficiaryInfoState {

        @NotNull
        public static final Parcelable.Creator<PaymentVendor> CREATOR = new a();
        public final Field$Country d;
        public final Field$Currency e;
        public final Field$RouteSelector f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f99711g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final BeneficiaryRouteType.PaymentVendorType f99712h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Field$Country field$CountryCreateFromParcel = Field$Country.CREATOR.createFromParcel(parcel);
                Field$Currency field$CurrencyCreateFromParcel = Field$Currency.CREATOR.createFromParcel(parcel);
                Field$RouteSelector field$RouteSelectorCreateFromParcel = Field$RouteSelector.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(PaymentVendor.class, parcel, arrayList, iE, 1);
                }
                return new PaymentVendor(field$CountryCreateFromParcel, field$CurrencyCreateFromParcel, field$RouteSelectorCreateFromParcel, arrayList, (BeneficiaryRouteType.PaymentVendorType) parcel.readParcelable(PaymentVendor.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentVendor[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentVendor(Field$Country country, Field$Currency currency, Field$RouteSelector routeSelector, List backendDefinitions, BeneficiaryRouteType.PaymentVendorType routeType) {
            super(backendDefinitions, routeType, b.Personal);
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(routeSelector, "routeSelector");
            Intrinsics.checkNotNullParameter(backendDefinitions, "backendDefinitions");
            Intrinsics.checkNotNullParameter(routeType, "routeType");
            this.d = country;
            this.e = currency;
            this.f = routeSelector;
            this.f99711g = backendDefinitions;
            this.f99712h = routeType;
        }

        public static PaymentVendor z(PaymentVendor paymentVendor, Field$Country field$Country, Field$Currency field$Currency, Field$RouteSelector field$RouteSelector, List backendDefinitions, int i) {
            if ((i & 1) != 0) {
                field$Country = paymentVendor.d;
            }
            Field$Country country = field$Country;
            if ((i & 2) != 0) {
                field$Currency = paymentVendor.e;
            }
            Field$Currency currency = field$Currency;
            if ((i & 4) != 0) {
                field$RouteSelector = paymentVendor.f;
            }
            Field$RouteSelector routeSelector = field$RouteSelector;
            BeneficiaryRouteType.PaymentVendorType routeType = paymentVendor.f99712h;
            paymentVendor.getClass();
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(routeSelector, "routeSelector");
            Intrinsics.checkNotNullParameter(backendDefinitions, "backendDefinitions");
            Intrinsics.checkNotNullParameter(routeType, "routeType");
            return new PaymentVendor(country, currency, routeSelector, backendDefinitions, routeType);
        }

        @Override // com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState
        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getF99711g() {
            return this.f99711g;
        }

        @Override // com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Field$Country getD() {
            return this.d;
        }

        @Override // com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Field$Currency getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState
        /* JADX INFO: renamed from: e, reason: from getter */
        public final Field$RouteSelector getF() {
            return this.f;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PaymentVendor)) {
                return false;
            }
            PaymentVendor paymentVendor = (PaymentVendor) obj2;
            return Intrinsics.f(this.d, paymentVendor.d) && Intrinsics.f(this.e, paymentVendor.e) && Intrinsics.f(this.f, paymentVendor.f) && Intrinsics.f(this.f99711g, paymentVendor.f99711g) && Intrinsics.f(this.f99712h, paymentVendor.f99712h);
        }

        public final int hashCode() {
            return this.f99712h.f99589a.hashCode() + p.a.d((this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31, 31, this.f99711g);
        }

        @Override // com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState
        /* JADX INFO: renamed from: j */
        public final BeneficiaryRouteType getF99704b() {
            return this.f99712h;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.d.writeToParcel(dest, i);
            this.e.writeToParcel(dest, i);
            this.f.writeToParcel(dest, i);
            Iterator itV = p.a.v(this.f99711g, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeParcelable(this.f99712h, i);
        }
    }

    public BeneficiaryInfoState(List list, BeneficiaryRouteType beneficiaryRouteType, b bVar) {
        this.f99703a = list;
        this.f99704b = beneficiaryRouteType;
        this.f99705c = bVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public b getF99705c() {
        return this.f99705c;
    }

    /* JADX INFO: renamed from: b */
    public abstract List getF99711g();

    /* JADX INFO: renamed from: c */
    public abstract Field$Country getD();

    /* JADX INFO: renamed from: d */
    public abstract Field$Currency getE();

    /* JADX INFO: renamed from: e */
    public abstract Field$RouteSelector getF();

    /* JADX INFO: renamed from: j, reason: from getter */
    public BeneficiaryRouteType getF99704b() {
        return this.f99704b;
    }
}
