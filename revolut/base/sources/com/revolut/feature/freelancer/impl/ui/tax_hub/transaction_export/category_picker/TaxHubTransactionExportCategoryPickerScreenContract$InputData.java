package com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.category_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import ip0.v7;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/category_picker/TaxHubTransactionExportCategoryPickerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxHubTransactionExportCategoryPickerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TaxHubTransactionExportCategoryPickerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f74367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f74368b;

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
            return new TaxHubTransactionExportCategoryPickerScreenContract$InputData(linkedHashSet, linkedHashSet2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxHubTransactionExportCategoryPickerScreenContract$InputData[i];
        }
    }

    public TaxHubTransactionExportCategoryPickerScreenContract$InputData(Set availableCategories, Set selectedCategories) {
        Intrinsics.checkNotNullParameter(availableCategories, "availableCategories");
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        this.f74367a = availableCategories;
        this.f74368b = selectedCategories;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxHubTransactionExportCategoryPickerScreenContract$InputData)) {
            return false;
        }
        TaxHubTransactionExportCategoryPickerScreenContract$InputData taxHubTransactionExportCategoryPickerScreenContract$InputData = (TaxHubTransactionExportCategoryPickerScreenContract$InputData) obj2;
        return Intrinsics.f(this.f74367a, taxHubTransactionExportCategoryPickerScreenContract$InputData.f74367a) && Intrinsics.f(this.f74368b, taxHubTransactionExportCategoryPickerScreenContract$InputData.f74368b);
    }

    public final int hashCode() {
        return this.f74368b.hashCode() + (this.f74367a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f74367a, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        Iterator itV2 = n.v(this.f74368b, dest);
        while (itV2.hasNext()) {
            dest.writeSerializable((Serializable) itV2.next());
        }
    }
}
