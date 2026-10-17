package com.revolut.feature.pay_bills_taxes.impl.ui.screen.form;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.Bill;
import com.revolut.feature.apm.bills.core.api.model.form.BillFormV2;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xo1.g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pay_bills_taxes/impl/ui/screen/form/FormScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FormScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FormScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f78716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillFormV2 f78717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bill f78718c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FormScreenContract$InputData(g.valueOf(parcel.readString()), (BillFormV2) parcel.readParcelable(FormScreenContract$InputData.class.getClassLoader()), (Bill) parcel.readParcelable(FormScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FormScreenContract$InputData[i];
        }
    }

    public FormScreenContract$InputData(g paymentMethod, BillFormV2 form, Bill bill) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(form, "form");
        this.f78716a = paymentMethod;
        this.f78717b = form;
        this.f78718c = bill;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FormScreenContract$InputData)) {
            return false;
        }
        FormScreenContract$InputData formScreenContract$InputData = (FormScreenContract$InputData) obj2;
        return this.f78716a == formScreenContract$InputData.f78716a && Intrinsics.f(this.f78717b, formScreenContract$InputData.f78717b) && Intrinsics.f(this.f78718c, formScreenContract$InputData.f78718c);
    }

    public final int hashCode() {
        int iHashCode = (this.f78717b.hashCode() + (this.f78716a.hashCode() * 31)) * 31;
        Bill bill = this.f78718c;
        return iHashCode + (bill == null ? 0 : bill.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78716a.name());
        dest.writeParcelable(this.f78717b, i);
        dest.writeParcelable(this.f78718c, i);
    }
}
