package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$BackendDefinition;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$Country;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$Currency;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$ExpansionDefinition;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$RouteSelector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/AccountFieldsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "DetailsSuggestion", "CurrencyPicker", "CountryPicker", "RouteSelector", "DefinitionSelector", "SearchList", "ExpansionSelector", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/AccountFieldsScreenContract$ModalStep$CountryPicker;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/AccountFieldsScreenContract$ModalStep$CurrencyPicker;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/AccountFieldsScreenContract$ModalStep$DefinitionSelector;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/AccountFieldsScreenContract$ModalStep$DetailsSuggestion;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/AccountFieldsScreenContract$ModalStep$ExpansionSelector;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/AccountFieldsScreenContract$ModalStep$RouteSelector;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/AccountFieldsScreenContract$ModalStep$SearchList;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AccountFieldsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/AccountFieldsScreenContract$ModalStep$CountryPicker;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/AccountFieldsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CountryPicker implements AccountFieldsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CountryPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field$Country f99674a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CountryPicker(Field$Country.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountryPicker[i];
            }
        }

        public CountryPicker(Field$Country countryField) {
            Intrinsics.checkNotNullParameter(countryField, "countryField");
            this.f99674a = countryField;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CountryPicker) && Intrinsics.f(this.f99674a, ((CountryPicker) obj2).f99674a);
        }

        public final int hashCode() {
            return this.f99674a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f99674a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/AccountFieldsScreenContract$ModalStep$CurrencyPicker;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/AccountFieldsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrencyPicker implements AccountFieldsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CurrencyPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field$Currency f99675a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CurrencyPicker(Field$Currency.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrencyPicker[i];
            }
        }

        public CurrencyPicker(Field$Currency currencyField) {
            Intrinsics.checkNotNullParameter(currencyField, "currencyField");
            this.f99675a = currencyField;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CurrencyPicker) && Intrinsics.f(this.f99675a, ((CurrencyPicker) obj2).f99675a);
        }

        public final int hashCode() {
            return this.f99675a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f99675a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/AccountFieldsScreenContract$ModalStep$DefinitionSelector;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/AccountFieldsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DefinitionSelector implements AccountFieldsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DefinitionSelector> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field$BackendDefinition.DropdownDefinition f99676a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DefinitionSelector(Field$BackendDefinition.DropdownDefinition.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DefinitionSelector[i];
            }
        }

        public DefinitionSelector(Field$BackendDefinition.DropdownDefinition dropdownDefinition) {
            Intrinsics.checkNotNullParameter(dropdownDefinition, "dropdownDefinition");
            this.f99676a = dropdownDefinition;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DefinitionSelector) && Intrinsics.f(this.f99676a, ((DefinitionSelector) obj2).f99676a);
        }

        public final int hashCode() {
            return this.f99676a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f99676a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/AccountFieldsScreenContract$ModalStep$DetailsSuggestion;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/AccountFieldsScreenContract$ModalStep;", "<init>", "()V", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DetailsSuggestion implements AccountFieldsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DetailsSuggestion f99677a = new DetailsSuggestion();

        @NotNull
        public static final Parcelable.Creator<DetailsSuggestion> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DetailsSuggestion.f99677a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DetailsSuggestion[i];
            }
        }

        private DetailsSuggestion() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/AccountFieldsScreenContract$ModalStep$ExpansionSelector;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/AccountFieldsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExpansionSelector implements AccountFieldsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ExpansionSelector> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field$ExpansionDefinition f99678a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExpansionSelector(Field$ExpansionDefinition.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExpansionSelector[i];
            }
        }

        public ExpansionSelector(Field$ExpansionDefinition expansionField) {
            Intrinsics.checkNotNullParameter(expansionField, "expansionField");
            this.f99678a = expansionField;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExpansionSelector) && Intrinsics.f(this.f99678a, ((ExpansionSelector) obj2).f99678a);
        }

        public final int hashCode() {
            return this.f99678a.f99729a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f99678a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/AccountFieldsScreenContract$ModalStep$RouteSelector;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/AccountFieldsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RouteSelector implements AccountFieldsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RouteSelector> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field$RouteSelector f99679a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RouteSelector(Field$RouteSelector.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RouteSelector[i];
            }
        }

        public RouteSelector(Field$RouteSelector routeSelector) {
            Intrinsics.checkNotNullParameter(routeSelector, "routeSelector");
            this.f99679a = routeSelector;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RouteSelector) && Intrinsics.f(this.f99679a, ((RouteSelector) obj2).f99679a);
        }

        public final int hashCode() {
            return this.f99679a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f99679a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/AccountFieldsScreenContract$ModalStep$SearchList;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/AccountFieldsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SearchList implements AccountFieldsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SearchList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field$BackendDefinition.SearchList f99680a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SearchList(Field$BackendDefinition.SearchList.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SearchList[i];
            }
        }

        public SearchList(Field$BackendDefinition.SearchList searchList) {
            Intrinsics.checkNotNullParameter(searchList, "searchList");
            this.f99680a = searchList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SearchList) && Intrinsics.f(this.f99680a, ((SearchList) obj2).f99680a);
        }

        public final int hashCode() {
            return this.f99680a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f99680a.writeToParcel(dest, i);
        }
    }
}
