package com.revolut.feature.statements.impl.ui.custom_statement.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.statements.api.documents_hub.period.StatementPeriodSelection;
import com.revolut.feature.statements.api.models.ProductSelection;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.TaxPeriod;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/feature/statements/impl/ui/custom_statement/screen/CustomStatementScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "LanguagePicker", "CurrencyPicker", "Products", "Categories", "TransactionDirections", "PeriodSelector", "Lcom/revolut/feature/statements/impl/ui/custom_statement/screen/CustomStatementScreenContract$ModalStep$Categories;", "Lcom/revolut/feature/statements/impl/ui/custom_statement/screen/CustomStatementScreenContract$ModalStep$CurrencyPicker;", "Lcom/revolut/feature/statements/impl/ui/custom_statement/screen/CustomStatementScreenContract$ModalStep$LanguagePicker;", "Lcom/revolut/feature/statements/impl/ui/custom_statement/screen/CustomStatementScreenContract$ModalStep$PeriodSelector;", "Lcom/revolut/feature/statements/impl/ui/custom_statement/screen/CustomStatementScreenContract$ModalStep$Products;", "Lcom/revolut/feature/statements/impl/ui/custom_statement/screen/CustomStatementScreenContract$ModalStep$TransactionDirections;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CustomStatementScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/custom_statement/screen/CustomStatementScreenContract$ModalStep$Categories;", "Lcom/revolut/feature/statements/impl/ui/custom_statement/screen/CustomStatementScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Categories implements CustomStatementScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Categories> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f88332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f88333b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Categories.class, parcel, arrayList, iE, 1);
                }
                return new Categories(arrayList, parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Categories[i];
            }
        }

        public Categories(List categories, List selectedCategories) {
            Intrinsics.checkNotNullParameter(categories, "categories");
            Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
            this.f88332a = categories;
            this.f88333b = selectedCategories;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Categories)) {
                return false;
            }
            Categories categories = (Categories) obj2;
            return Intrinsics.f(this.f88332a, categories.f88332a) && Intrinsics.f(this.f88333b, categories.f88333b);
        }

        public final int hashCode() {
            return this.f88333b.hashCode() + (this.f88332a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f88332a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeStringList(this.f88333b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/custom_statement/screen/CustomStatementScreenContract$ModalStep$CurrencyPicker;", "Lcom/revolut/feature/statements/impl/ui/custom_statement/screen/CustomStatementScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrencyPicker implements CustomStatementScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CurrencyPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f88334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f88335b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                xi0.b bVar = (xi0.b) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new CurrencyPicker(arrayList, bVar);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrencyPicker[i];
            }
        }

        public CurrencyPicker(List availableCurrencies, xi0.b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(availableCurrencies, "availableCurrencies");
            this.f88334a = currency;
            this.f88335b = availableCurrencies;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CurrencyPicker)) {
                return false;
            }
            CurrencyPicker currencyPicker = (CurrencyPicker) obj2;
            return Intrinsics.f(this.f88334a, currencyPicker.f88334a) && Intrinsics.f(this.f88335b, currencyPicker.f88335b);
        }

        public final int hashCode() {
            return this.f88335b.hashCode() + (this.f88334a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f88334a);
            Iterator itV = p.a.v(this.f88335b, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/custom_statement/screen/CustomStatementScreenContract$ModalStep$LanguagePicker;", "Lcom/revolut/feature/statements/impl/ui/custom_statement/screen/CustomStatementScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LanguagePicker implements CustomStatementScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<LanguagePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Locale f88336a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LanguagePicker((Locale) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LanguagePicker[i];
            }
        }

        public LanguagePicker(Locale language) {
            Intrinsics.checkNotNullParameter(language, "language");
            this.f88336a = language;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LanguagePicker) && Intrinsics.f(this.f88336a, ((LanguagePicker) obj2).f88336a);
        }

        public final int hashCode() {
            return this.f88336a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f88336a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/custom_statement/screen/CustomStatementScreenContract$ModalStep$PeriodSelector;", "Lcom/revolut/feature/statements/impl/ui/custom_statement/screen/CustomStatementScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PeriodSelector implements CustomStatementScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PeriodSelector> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StatementPeriod f88337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final StatementPeriodSelection f88338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TaxPeriod f88339c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PeriodSelector((StatementPeriod) parcel.readParcelable(PeriodSelector.class.getClassLoader()), (StatementPeriodSelection) parcel.readParcelable(PeriodSelector.class.getClassLoader()), (TaxPeriod) parcel.readParcelable(PeriodSelector.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PeriodSelector[i];
            }
        }

        public PeriodSelector(StatementPeriod availablePeriod, StatementPeriodSelection selectedPeriod, TaxPeriod taxPeriod) {
            Intrinsics.checkNotNullParameter(availablePeriod, "availablePeriod");
            Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
            Intrinsics.checkNotNullParameter(taxPeriod, "taxPeriod");
            this.f88337a = availablePeriod;
            this.f88338b = selectedPeriod;
            this.f88339c = taxPeriod;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PeriodSelector)) {
                return false;
            }
            PeriodSelector periodSelector = (PeriodSelector) obj2;
            return Intrinsics.f(this.f88337a, periodSelector.f88337a) && Intrinsics.f(this.f88338b, periodSelector.f88338b) && Intrinsics.f(this.f88339c, periodSelector.f88339c);
        }

        public final int hashCode() {
            return this.f88339c.hashCode() + ((this.f88338b.hashCode() + (this.f88337a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f88337a, i);
            dest.writeParcelable(this.f88338b, i);
            dest.writeParcelable(this.f88339c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/custom_statement/screen/CustomStatementScreenContract$ModalStep$Products;", "Lcom/revolut/feature/statements/impl/ui/custom_statement/screen/CustomStatementScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Products implements CustomStatementScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Products> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f88340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ProductSelection f88341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f88342c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Products.class, parcel, arrayList, iE, 1);
                }
                return new Products(arrayList, (ProductSelection) parcel.readParcelable(Products.class.getClassLoader()), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Products[i];
            }
        }

        public Products(List products, ProductSelection productSelection, List expandedProducts) {
            Intrinsics.checkNotNullParameter(products, "products");
            Intrinsics.checkNotNullParameter(productSelection, "productSelection");
            Intrinsics.checkNotNullParameter(expandedProducts, "expandedProducts");
            this.f88340a = products;
            this.f88341b = productSelection;
            this.f88342c = expandedProducts;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Products)) {
                return false;
            }
            Products products = (Products) obj2;
            return Intrinsics.f(this.f88340a, products.f88340a) && Intrinsics.f(this.f88341b, products.f88341b) && Intrinsics.f(this.f88342c, products.f88342c);
        }

        public final int hashCode() {
            return this.f88342c.hashCode() + ((this.f88341b.hashCode() + (this.f88340a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f88340a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeParcelable(this.f88341b, i);
            dest.writeStringList(this.f88342c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/custom_statement/screen/CustomStatementScreenContract$ModalStep$TransactionDirections;", "Lcom/revolut/feature/statements/impl/ui/custom_statement/screen/CustomStatementScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionDirections implements CustomStatementScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TransactionDirections> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f88343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f88344b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(TransactionDirections.class, parcel, arrayList, iE, 1);
                }
                return new TransactionDirections(arrayList, parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionDirections[i];
            }
        }

        public TransactionDirections(List transactionDirections, List selectedTransactionDirections) {
            Intrinsics.checkNotNullParameter(transactionDirections, "transactionDirections");
            Intrinsics.checkNotNullParameter(selectedTransactionDirections, "selectedTransactionDirections");
            this.f88343a = transactionDirections;
            this.f88344b = selectedTransactionDirections;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransactionDirections)) {
                return false;
            }
            TransactionDirections transactionDirections = (TransactionDirections) obj2;
            return Intrinsics.f(this.f88343a, transactionDirections.f88343a) && Intrinsics.f(this.f88344b, transactionDirections.f88344b);
        }

        public final int hashCode() {
            return this.f88344b.hashCode() + (this.f88343a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f88343a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeStringList(this.f88344b);
        }
    }
}
