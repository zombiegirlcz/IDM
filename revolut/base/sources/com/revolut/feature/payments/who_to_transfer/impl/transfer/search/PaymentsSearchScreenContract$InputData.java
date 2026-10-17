package com.revolut.feature.payments.who_to_transfer.impl.transfer.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestinationParcel;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/who_to_transfer/impl/transfer/search/PaymentsSearchScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentsSearchScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PaymentsSearchScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f80125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WhoToTransferFilter f80126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransferFlowType f80127c;
    public final boolean d;
    public final TransferDestinationParcel e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = d.e(PaymentsSearchScreenContract$InputData.class, parcel, linkedHashSet, iE, 1);
            }
            return new PaymentsSearchScreenContract$InputData((WhoToTransferFilter) parcel.readParcelable(PaymentsSearchScreenContract$InputData.class.getClassLoader()), (TransferDestinationParcel) parcel.readParcelable(PaymentsSearchScreenContract$InputData.class.getClassLoader()), (TransferFlowType) parcel.readParcelable(PaymentsSearchScreenContract$InputData.class.getClassLoader()), linkedHashSet, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentsSearchScreenContract$InputData[i];
        }
    }

    public PaymentsSearchScreenContract$InputData(WhoToTransferFilter whoToTransferFilter, TransferDestinationParcel transferDestinationParcel, TransferFlowType transferFlowType, Set availableFilters, boolean z) {
        Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
        Intrinsics.checkNotNullParameter(transferFlowType, "transferFlowType");
        this.f80125a = availableFilters;
        this.f80126b = whoToTransferFilter;
        this.f80127c = transferFlowType;
        this.d = z;
        this.e = transferDestinationParcel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentsSearchScreenContract$InputData)) {
            return false;
        }
        PaymentsSearchScreenContract$InputData paymentsSearchScreenContract$InputData = (PaymentsSearchScreenContract$InputData) obj2;
        return Intrinsics.f(this.f80125a, paymentsSearchScreenContract$InputData.f80125a) && Intrinsics.f(this.f80126b, paymentsSearchScreenContract$InputData.f80126b) && Intrinsics.f(this.f80127c, paymentsSearchScreenContract$InputData.f80127c) && this.d == paymentsSearchScreenContract$InputData.d && Intrinsics.f(this.e, paymentsSearchScreenContract$InputData.e);
    }

    public final int hashCode() {
        int iHashCode = this.f80125a.hashCode() * 31;
        WhoToTransferFilter whoToTransferFilter = this.f80126b;
        int iC = j6.a.c(d.c(this.f80127c, (iHashCode + (whoToTransferFilter == null ? 0 : whoToTransferFilter.hashCode())) * 31, 31), 31, this.d);
        TransferDestinationParcel transferDestinationParcel = this.e;
        return iC + (transferDestinationParcel != null ? transferDestinationParcel.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f80125a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.f80126b, i);
        dest.writeParcelable(this.f80127c, i);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeParcelable(this.e, i);
    }
}
