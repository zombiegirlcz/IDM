package com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.currency_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/currency_picker/TaxHubTransactionExportCurrencyPickerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxHubTransactionExportCurrencyPickerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TaxHubTransactionExportCurrencyPickerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f74369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f74370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f74371c;

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
            return new TaxHubTransactionExportCurrencyPickerScreenContract$InputData(linkedHashSet, linkedHashSet2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxHubTransactionExportCurrencyPickerScreenContract$InputData[i];
        }
    }

    public TaxHubTransactionExportCurrencyPickerScreenContract$InputData(Set availableCurrencies, Set selectedCurrencies, Map balances) {
        Intrinsics.checkNotNullParameter(availableCurrencies, "availableCurrencies");
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        Intrinsics.checkNotNullParameter(balances, "balances");
        this.f74369a = availableCurrencies;
        this.f74370b = selectedCurrencies;
        this.f74371c = balances;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxHubTransactionExportCurrencyPickerScreenContract$InputData)) {
            return false;
        }
        TaxHubTransactionExportCurrencyPickerScreenContract$InputData taxHubTransactionExportCurrencyPickerScreenContract$InputData = (TaxHubTransactionExportCurrencyPickerScreenContract$InputData) obj2;
        return Intrinsics.f(this.f74369a, taxHubTransactionExportCurrencyPickerScreenContract$InputData.f74369a) && Intrinsics.f(this.f74370b, taxHubTransactionExportCurrencyPickerScreenContract$InputData.f74370b) && Intrinsics.f(this.f74371c, taxHubTransactionExportCurrencyPickerScreenContract$InputData.f74371c);
    }

    public final int hashCode() {
        return this.f74371c.hashCode() + p.a.f(this.f74369a.hashCode() * 31, 31, this.f74370b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f74369a, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        Iterator itV2 = n.v(this.f74370b, dest);
        while (itV2.hasNext()) {
            dest.writeSerializable((Serializable) itV2.next());
        }
        Iterator itZ = j6.a.z(this.f74371c, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeSerializable((Serializable) entry.getKey());
            dest.writeSerializable((Serializable) entry.getValue());
        }
    }
}
