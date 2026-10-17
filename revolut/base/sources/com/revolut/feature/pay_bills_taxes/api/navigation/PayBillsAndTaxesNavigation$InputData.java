package com.revolut.feature.pay_bills_taxes.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pay_bills_taxes/api/navigation/PayBillsAndTaxesNavigation$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PayBillsAndTaxesNavigation$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PayBillsAndTaxesNavigation$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f78682b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PayBillsAndTaxesNavigation$InputData(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PayBillsAndTaxesNavigation$InputData[i];
        }
    }

    public PayBillsAndTaxesNavigation$InputData() {
        this((String) null, 3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PayBillsAndTaxesNavigation$InputData)) {
            return false;
        }
        PayBillsAndTaxesNavigation$InputData payBillsAndTaxesNavigation$InputData = (PayBillsAndTaxesNavigation$InputData) obj2;
        return Intrinsics.f(this.f78681a, payBillsAndTaxesNavigation$InputData.f78681a) && this.f78682b == payBillsAndTaxesNavigation$InputData.f78682b;
    }

    public final int hashCode() {
        String str = this.f78681a;
        return Boolean.hashCode(this.f78682b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78681a);
        dest.writeInt(this.f78682b ? 1 : 0);
    }

    public PayBillsAndTaxesNavigation$InputData(String str, boolean z) {
        this.f78681a = str;
        this.f78682b = z;
    }

    public /* synthetic */ PayBillsAndTaxesNavigation$InputData(String str, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) == 0);
    }
}
