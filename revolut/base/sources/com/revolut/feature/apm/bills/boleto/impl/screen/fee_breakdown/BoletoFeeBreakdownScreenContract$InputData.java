package com.revolut.feature.apm.bills.boleto.impl.screen.fee_breakdown;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.search.boleto.BillBoletoFees;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/bills/boleto/impl/screen/fee_breakdown/BoletoFeeBreakdownScreenContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_boleto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BoletoFeeBreakdownScreenContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BoletoFeeBreakdownScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillBoletoFees f61186a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BoletoFeeBreakdownScreenContract$InputData((BillBoletoFees) parcel.readParcelable(BoletoFeeBreakdownScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BoletoFeeBreakdownScreenContract$InputData[i];
        }
    }

    public BoletoFeeBreakdownScreenContract$InputData(BillBoletoFees billBoletoFees) {
        this.f61186a = billBoletoFees;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof BoletoFeeBreakdownScreenContract$InputData) && Intrinsics.f(this.f61186a, ((BoletoFeeBreakdownScreenContract$InputData) obj2).f61186a);
    }

    public final int hashCode() {
        BillBoletoFees billBoletoFees = this.f61186a;
        if (billBoletoFees == null) {
            return 0;
        }
        return billBoletoFees.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f61186a, i);
    }
}
