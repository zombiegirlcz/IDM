package com.revolut.feature.apm.bills.pagopa.impl.ui.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.pagopa.api.models.PagoPABill;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/bills/pagopa/impl/ui/confirmation/PagoPABillConfirmationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_pagopa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PagoPABillConfirmationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PagoPABillConfirmationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PagoPABill f61492a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PagoPABillConfirmationScreenContract$InputData((PagoPABill) parcel.readParcelable(PagoPABillConfirmationScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PagoPABillConfirmationScreenContract$InputData[i];
        }
    }

    public PagoPABillConfirmationScreenContract$InputData(PagoPABill pagoPaBill) {
        Intrinsics.checkNotNullParameter(pagoPaBill, "pagoPaBill");
        this.f61492a = pagoPaBill;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PagoPABillConfirmationScreenContract$InputData) && Intrinsics.f(this.f61492a, ((PagoPABillConfirmationScreenContract$InputData) obj2).f61492a);
    }

    public final int hashCode() {
        return this.f61492a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f61492a, i);
    }
}
