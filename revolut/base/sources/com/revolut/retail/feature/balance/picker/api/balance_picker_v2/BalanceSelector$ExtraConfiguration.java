package com.revolut.retail.feature.balance.picker.api.balance_picker_v2;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import g1j.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$ExtraConfiguration", "Landroid/os/Parcelable;", "ShowDisclaimerForCryptoAndCommodity", "ShowDisclaimerForExchange", "ShowDisclaimerForInvestCashHolding", "ShowDisclaimerForSavings", "AdditionalCurrenciesButton", "CustomPersonalSectionOrder", "SearchEnabled", "CountryProfilesEnabled", "Lcom/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$ExtraConfiguration$AdditionalCurrenciesButton;", "Lcom/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$ExtraConfiguration$CountryProfilesEnabled;", "Lcom/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$ExtraConfiguration$CustomPersonalSectionOrder;", "Lcom/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$ExtraConfiguration$SearchEnabled;", "Lcom/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$ExtraConfiguration$ShowDisclaimerForCryptoAndCommodity;", "Lcom/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$ExtraConfiguration$ShowDisclaimerForExchange;", "Lcom/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$ExtraConfiguration$ShowDisclaimerForInvestCashHolding;", "Lcom/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$ExtraConfiguration$ShowDisclaimerForSavings;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BalanceSelector$ExtraConfiguration extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$ExtraConfiguration$AdditionalCurrenciesButton;", "Lcom/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$ExtraConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdditionalCurrenciesButton implements BalanceSelector$ExtraConfiguration {

        @NotNull
        public static final Parcelable.Creator<AdditionalCurrenciesButton> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f99369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f99370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f99371c;
        public final Set d;
        public final Set e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iA = 0;
                int iA2 = 0;
                while (iA2 != i) {
                    iA2 = o.a(parcel, linkedHashSet, iA2, 1);
                }
                int i2 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i2);
                int iA3 = 0;
                while (iA3 != i2) {
                    iA3 = o.a(parcel, linkedHashSet2, iA3, 1);
                }
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(i3);
                int iA4 = 0;
                while (iA4 != i3) {
                    iA4 = o.a(parcel, linkedHashSet3, iA4, 1);
                }
                int i5 = parcel.readInt();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet(i5);
                int iA5 = 0;
                while (iA5 != i5) {
                    iA5 = o.a(parcel, linkedHashSet4, iA5, 1);
                }
                int i6 = parcel.readInt();
                LinkedHashSet linkedHashSet5 = new LinkedHashSet(i6);
                while (iA != i6) {
                    iA = o.a(parcel, linkedHashSet5, iA, 1);
                }
                return new AdditionalCurrenciesButton(linkedHashSet, linkedHashSet2, linkedHashSet3, linkedHashSet4, linkedHashSet5);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalCurrenciesButton[i];
            }
        }

        public AdditionalCurrenciesButton(Set personalFiatCurrencies, Set cryptoCurrencies, Set jointCurrencies, Set proCurrencies, Set commodityCurrencies) {
            Intrinsics.checkNotNullParameter(personalFiatCurrencies, "personalFiatCurrencies");
            Intrinsics.checkNotNullParameter(cryptoCurrencies, "cryptoCurrencies");
            Intrinsics.checkNotNullParameter(jointCurrencies, "jointCurrencies");
            Intrinsics.checkNotNullParameter(proCurrencies, "proCurrencies");
            Intrinsics.checkNotNullParameter(commodityCurrencies, "commodityCurrencies");
            this.f99369a = personalFiatCurrencies;
            this.f99370b = cryptoCurrencies;
            this.f99371c = jointCurrencies;
            this.d = proCurrencies;
            this.e = commodityCurrencies;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AdditionalCurrenciesButton)) {
                return false;
            }
            AdditionalCurrenciesButton additionalCurrenciesButton = (AdditionalCurrenciesButton) obj2;
            return Intrinsics.f(this.f99369a, additionalCurrenciesButton.f99369a) && Intrinsics.f(this.f99370b, additionalCurrenciesButton.f99370b) && Intrinsics.f(this.f99371c, additionalCurrenciesButton.f99371c) && Intrinsics.f(this.d, additionalCurrenciesButton.d) && Intrinsics.f(this.e, additionalCurrenciesButton.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + p.a.f(p.a.f(p.a.f(this.f99369a.hashCode() * 31, 31, this.f99370b), 31, this.f99371c), 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f99369a, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
            Iterator itV2 = n.v(this.f99370b, dest);
            while (itV2.hasNext()) {
                dest.writeString((String) itV2.next());
            }
            Iterator itV3 = n.v(this.f99371c, dest);
            while (itV3.hasNext()) {
                dest.writeString((String) itV3.next());
            }
            Iterator itV4 = n.v(this.d, dest);
            while (itV4.hasNext()) {
                dest.writeString((String) itV4.next());
            }
            Iterator itV5 = n.v(this.e, dest);
            while (itV5.hasNext()) {
                dest.writeString((String) itV5.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$ExtraConfiguration$CountryProfilesEnabled;", "Lcom/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$ExtraConfiguration;", "<init>", "()V", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CountryProfilesEnabled implements BalanceSelector$ExtraConfiguration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CountryProfilesEnabled f99372a = new CountryProfilesEnabled();

        @NotNull
        public static final Parcelable.Creator<CountryProfilesEnabled> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CountryProfilesEnabled.f99372a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountryProfilesEnabled[i];
            }
        }

        private CountryProfilesEnabled() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$ExtraConfiguration$CustomPersonalSectionOrder;", "Lcom/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$ExtraConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomPersonalSectionOrder implements BalanceSelector$ExtraConfiguration {

        @NotNull
        public static final Parcelable.Creator<CustomPersonalSectionOrder> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f99373a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(c.valueOf(parcel.readString()));
                }
                return new CustomPersonalSectionOrder(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomPersonalSectionOrder[i];
            }
        }

        public CustomPersonalSectionOrder(List order) {
            Intrinsics.checkNotNullParameter(order, "order");
            this.f99373a = order;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CustomPersonalSectionOrder) && Intrinsics.f(this.f99373a, ((CustomPersonalSectionOrder) obj2).f99373a);
        }

        public final int hashCode() {
            return this.f99373a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f99373a, dest);
            while (itV.hasNext()) {
                dest.writeString(((c) itV.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$ExtraConfiguration$SearchEnabled;", "Lcom/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$ExtraConfiguration;", "<init>", "()V", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SearchEnabled implements BalanceSelector$ExtraConfiguration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SearchEnabled f99374a = new SearchEnabled();

        @NotNull
        public static final Parcelable.Creator<SearchEnabled> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SearchEnabled.f99374a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SearchEnabled[i];
            }
        }

        private SearchEnabled() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$ExtraConfiguration$ShowDisclaimerForCryptoAndCommodity;", "Lcom/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$ExtraConfiguration;", "<init>", "()V", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowDisclaimerForCryptoAndCommodity implements BalanceSelector$ExtraConfiguration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowDisclaimerForCryptoAndCommodity f99375a = new ShowDisclaimerForCryptoAndCommodity();

        @NotNull
        public static final Parcelable.Creator<ShowDisclaimerForCryptoAndCommodity> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowDisclaimerForCryptoAndCommodity.f99375a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowDisclaimerForCryptoAndCommodity[i];
            }
        }

        private ShowDisclaimerForCryptoAndCommodity() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$ExtraConfiguration$ShowDisclaimerForExchange;", "Lcom/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$ExtraConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowDisclaimerForExchange implements BalanceSelector$ExtraConfiguration {

        @NotNull
        public static final Parcelable.Creator<ShowDisclaimerForExchange> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f99376a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowDisclaimerForExchange((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowDisclaimerForExchange[i];
            }
        }

        public ShowDisclaimerForExchange(b targetCurrency) {
            Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
            this.f99376a = targetCurrency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowDisclaimerForExchange) && Intrinsics.f(this.f99376a, ((ShowDisclaimerForExchange) obj2).f99376a);
        }

        public final int hashCode() {
            return this.f99376a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99376a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$ExtraConfiguration$ShowDisclaimerForInvestCashHolding;", "Lcom/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$ExtraConfiguration;", "<init>", "()V", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowDisclaimerForInvestCashHolding implements BalanceSelector$ExtraConfiguration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowDisclaimerForInvestCashHolding f99377a = new ShowDisclaimerForInvestCashHolding();

        @NotNull
        public static final Parcelable.Creator<ShowDisclaimerForInvestCashHolding> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowDisclaimerForInvestCashHolding.f99377a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowDisclaimerForInvestCashHolding[i];
            }
        }

        private ShowDisclaimerForInvestCashHolding() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$ExtraConfiguration$ShowDisclaimerForSavings;", "Lcom/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$ExtraConfiguration;", "<init>", "()V", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowDisclaimerForSavings implements BalanceSelector$ExtraConfiguration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowDisclaimerForSavings f99378a = new ShowDisclaimerForSavings();

        @NotNull
        public static final Parcelable.Creator<ShowDisclaimerForSavings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowDisclaimerForSavings.f99378a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowDisclaimerForSavings[i];
            }
        }

        private ShowDisclaimerForSavings() {
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
}
