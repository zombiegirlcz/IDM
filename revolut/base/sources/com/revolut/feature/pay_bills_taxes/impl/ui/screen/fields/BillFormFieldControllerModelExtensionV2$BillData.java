package com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.Bill;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xo1.g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pay_bills_taxes/impl/ui/screen/fields/BillFormFieldControllerModelExtensionV2$BillData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BillFormFieldControllerModelExtensionV2$BillData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BillFormFieldControllerModelExtensionV2$BillData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bill f78710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f78711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f78712c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Bill bill = (Bill) j6.a.f(parcel, "parcel", BillFormFieldControllerModelExtensionV2$BillData.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(BillFormFieldControllerModelExtensionV2$BillData.class, parcel, arrayList, iE, 1);
            }
            return new BillFormFieldControllerModelExtensionV2$BillData(bill, arrayList, g.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BillFormFieldControllerModelExtensionV2$BillData[i];
        }
    }

    public BillFormFieldControllerModelExtensionV2$BillData(Bill bill, List inputs, g paymentMethod) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.f78710a = bill;
        this.f78711b = inputs;
        this.f78712c = paymentMethod;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BillFormFieldControllerModelExtensionV2$BillData)) {
            return false;
        }
        BillFormFieldControllerModelExtensionV2$BillData billFormFieldControllerModelExtensionV2$BillData = (BillFormFieldControllerModelExtensionV2$BillData) obj2;
        return Intrinsics.f(this.f78710a, billFormFieldControllerModelExtensionV2$BillData.f78710a) && Intrinsics.f(this.f78711b, billFormFieldControllerModelExtensionV2$BillData.f78711b) && this.f78712c == billFormFieldControllerModelExtensionV2$BillData.f78712c;
    }

    public final int hashCode() {
        Bill bill = this.f78710a;
        return this.f78712c.hashCode() + p.a.d((bill == null ? 0 : bill.hashCode()) * 31, 31, this.f78711b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f78710a, i);
        Iterator itV = p.a.v(this.f78711b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeString(this.f78712c.name());
    }
}
