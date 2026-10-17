package com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/flow/TaxHubTransactionExportFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxHubTransactionExportFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TaxHubTransactionExportFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f74383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f74384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f74385c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TaxHubTransactionExportFlowContract$InputData(parcel.readString(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxHubTransactionExportFlowContract$InputData[i];
        }
    }

    public TaxHubTransactionExportFlowContract$InputData(String str, LocalDate localDate, LocalDate localDate2) {
        this.f74383a = localDate;
        this.f74384b = localDate2;
        this.f74385c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxHubTransactionExportFlowContract$InputData)) {
            return false;
        }
        TaxHubTransactionExportFlowContract$InputData taxHubTransactionExportFlowContract$InputData = (TaxHubTransactionExportFlowContract$InputData) obj2;
        return Intrinsics.f(this.f74383a, taxHubTransactionExportFlowContract$InputData.f74383a) && Intrinsics.f(this.f74384b, taxHubTransactionExportFlowContract$InputData.f74384b) && Intrinsics.f(this.f74385c, taxHubTransactionExportFlowContract$InputData.f74385c);
    }

    public final int hashCode() {
        LocalDate localDate = this.f74383a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.f74384b;
        int iHashCode2 = (iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        String str = this.f74385c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f74383a);
        dest.writeSerializable(this.f74384b);
        dest.writeString(this.f74385c);
    }
}
