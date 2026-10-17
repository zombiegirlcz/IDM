package com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import ehe.n;
import ip0.v7;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/filter/TaxHubTransactionExportFilterScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CategoryPicker", "CurrencyPicker", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/filter/TaxHubTransactionExportFilterScreenContract$ModalStep$CategoryPicker;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/filter/TaxHubTransactionExportFilterScreenContract$ModalStep$CurrencyPicker;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TaxHubTransactionExportFilterScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/filter/TaxHubTransactionExportFilterScreenContract$ModalStep$CategoryPicker;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/filter/TaxHubTransactionExportFilterScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CategoryPicker implements TaxHubTransactionExportFilterScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CategoryPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f74374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f74375b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iD = 0;
                int iD2 = 0;
                while (iD2 != i) {
                    iD2 = v7.d(parcel, linkedHashSet, iD2, 1);
                }
                int i2 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i2);
                while (iD != i2) {
                    iD = v7.d(parcel, linkedHashSet2, iD, 1);
                }
                return new CategoryPicker(linkedHashSet, linkedHashSet2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CategoryPicker[i];
            }
        }

        public CategoryPicker(Set availableCategories, Set selectedCategories) {
            Intrinsics.checkNotNullParameter(availableCategories, "availableCategories");
            Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
            this.f74374a = availableCategories;
            this.f74375b = selectedCategories;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CategoryPicker)) {
                return false;
            }
            CategoryPicker categoryPicker = (CategoryPicker) obj2;
            return Intrinsics.f(this.f74374a, categoryPicker.f74374a) && Intrinsics.f(this.f74375b, categoryPicker.f74375b);
        }

        public final int hashCode() {
            return this.f74375b.hashCode() + (this.f74374a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f74374a, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            Iterator itV2 = n.v(this.f74375b, dest);
            while (itV2.hasNext()) {
                dest.writeSerializable((Serializable) itV2.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/filter/TaxHubTransactionExportFilterScreenContract$ModalStep$CurrencyPicker;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/filter/TaxHubTransactionExportFilterScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrencyPicker implements TaxHubTransactionExportFilterScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CurrencyPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f74376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f74377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map f74378c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iD = 0;
                while (iD != i) {
                    iD = v7.d(parcel, linkedHashSet, iD, 1);
                }
                int i2 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i2);
                int iD2 = 0;
                while (iD2 != i2) {
                    iD2 = v7.d(parcel, linkedHashSet2, iD2, 1);
                }
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
                for (int i5 = 0; i5 != i3; i5++) {
                    linkedHashMap.put(parcel.readSerializable(), parcel.readSerializable());
                }
                return new CurrencyPicker(linkedHashSet, linkedHashSet2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrencyPicker[i];
            }
        }

        public CurrencyPicker(Set availableCurrencies, Set selectedCurrencies, Map balances) {
            Intrinsics.checkNotNullParameter(availableCurrencies, "availableCurrencies");
            Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
            Intrinsics.checkNotNullParameter(balances, "balances");
            this.f74376a = availableCurrencies;
            this.f74377b = selectedCurrencies;
            this.f74378c = balances;
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
            return Intrinsics.f(this.f74376a, currencyPicker.f74376a) && Intrinsics.f(this.f74377b, currencyPicker.f74377b) && Intrinsics.f(this.f74378c, currencyPicker.f74378c);
        }

        public final int hashCode() {
            return this.f74378c.hashCode() + p.a.f(this.f74376a.hashCode() * 31, 31, this.f74377b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f74376a, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            Iterator itV2 = n.v(this.f74377b, dest);
            while (itV2.hasNext()) {
                dest.writeSerializable((Serializable) itV2.next());
            }
            Iterator itZ = j6.a.z(this.f74378c, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeSerializable((Serializable) entry.getKey());
                dest.writeSerializable((Serializable) entry.getValue());
            }
        }
    }
}
