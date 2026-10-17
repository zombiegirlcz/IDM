package com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xo1.g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pay_bills_taxes/impl/ui_catalogue/flow/BillsCatalogueFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BillsCatalogueFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BillsCatalogueFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f78742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xo1.b f78743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78744c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BillsCatalogueFlowContract$InputData(g.valueOf(parcel.readString()), xo1.b.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BillsCatalogueFlowContract$InputData[i];
        }
    }

    public BillsCatalogueFlowContract$InputData(g paymentMethod, xo1.b category, String str) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(category, "category");
        this.f78742a = paymentMethod;
        this.f78743b = category;
        this.f78744c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BillsCatalogueFlowContract$InputData)) {
            return false;
        }
        BillsCatalogueFlowContract$InputData billsCatalogueFlowContract$InputData = (BillsCatalogueFlowContract$InputData) obj2;
        return this.f78742a == billsCatalogueFlowContract$InputData.f78742a && this.f78743b == billsCatalogueFlowContract$InputData.f78743b && Intrinsics.f(this.f78744c, billsCatalogueFlowContract$InputData.f78744c);
    }

    public final int hashCode() {
        int iHashCode = (this.f78743b.hashCode() + (this.f78742a.hashCode() * 31)) * 31;
        String str = this.f78744c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78742a.name());
        dest.writeString(this.f78743b.name());
        dest.writeString(this.f78744c);
    }
}
