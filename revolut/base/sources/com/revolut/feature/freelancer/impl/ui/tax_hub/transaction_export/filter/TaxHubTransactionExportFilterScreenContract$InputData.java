package com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/filter/TaxHubTransactionExportFilterScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxHubTransactionExportFilterScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TaxHubTransactionExportFilterScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f74372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f74373b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TaxHubTransactionExportFilterScreenContract$InputData((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxHubTransactionExportFilterScreenContract$InputData[i];
        }
    }

    public TaxHubTransactionExportFilterScreenContract$InputData(LocalDate startDate, LocalDate endDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.f74372a = startDate;
        this.f74373b = endDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxHubTransactionExportFilterScreenContract$InputData)) {
            return false;
        }
        TaxHubTransactionExportFilterScreenContract$InputData taxHubTransactionExportFilterScreenContract$InputData = (TaxHubTransactionExportFilterScreenContract$InputData) obj2;
        return Intrinsics.f(this.f74372a, taxHubTransactionExportFilterScreenContract$InputData.f74372a) && Intrinsics.f(this.f74373b, taxHubTransactionExportFilterScreenContract$InputData.f74373b);
    }

    public final int hashCode() {
        return this.f74373b.hashCode() + (this.f74372a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f74372a);
        dest.writeSerializable(this.f74373b);
    }
}
