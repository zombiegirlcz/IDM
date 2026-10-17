package com.revolut.feature.pay_later.impl.ui.purchasecalculator;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pay_later/impl/ui/purchasecalculator/PurchaseCalculatorControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PurchaseCalculatorControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PurchaseCalculatorControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f78904b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PurchaseCalculatorControllerContract$InputData(parcel.readInt(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PurchaseCalculatorControllerContract$InputData[i];
        }
    }

    public PurchaseCalculatorControllerContract$InputData(int i, b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f78903a = i;
        this.f78904b = currency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PurchaseCalculatorControllerContract$InputData)) {
            return false;
        }
        PurchaseCalculatorControllerContract$InputData purchaseCalculatorControllerContract$InputData = (PurchaseCalculatorControllerContract$InputData) obj2;
        return this.f78903a == purchaseCalculatorControllerContract$InputData.f78903a && Intrinsics.f(this.f78904b, purchaseCalculatorControllerContract$InputData.f78904b);
    }

    public final int hashCode() {
        return this.f78904b.hashCode() + (Integer.hashCode(this.f78903a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f78903a);
        dest.writeSerializable(this.f78904b);
    }
}
