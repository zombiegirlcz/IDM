package com.revolut.feature.recurringbuys.impl.ui.kompot.payment_history;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/recurringbuys/impl/ui/kompot/payment_history/PaymentHistoryContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_recurring_buys_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentHistoryContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PaymentHistoryContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f81662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f81664c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentHistoryContract$InputData(parcel.readString(), parcel.readString(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentHistoryContract$InputData[i];
        }
    }

    public PaymentHistoryContract$InputData(String recurringBuyId, String receiverPocketId, b destinationPocketCurrency) {
        Intrinsics.checkNotNullParameter(destinationPocketCurrency, "destinationPocketCurrency");
        Intrinsics.checkNotNullParameter(recurringBuyId, "recurringBuyId");
        Intrinsics.checkNotNullParameter(receiverPocketId, "receiverPocketId");
        this.f81662a = destinationPocketCurrency;
        this.f81663b = recurringBuyId;
        this.f81664c = receiverPocketId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentHistoryContract$InputData)) {
            return false;
        }
        PaymentHistoryContract$InputData paymentHistoryContract$InputData = (PaymentHistoryContract$InputData) obj2;
        return Intrinsics.f(this.f81662a, paymentHistoryContract$InputData.f81662a) && Intrinsics.f(this.f81663b, paymentHistoryContract$InputData.f81663b) && Intrinsics.f(this.f81664c, paymentHistoryContract$InputData.f81664c);
    }

    public final int hashCode() {
        return this.f81664c.hashCode() + p.a.c(this.f81662a.hashCode() * 31, 31, this.f81663b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f81662a);
        dest.writeString(this.f81663b);
        dest.writeString(this.f81664c);
    }
}
