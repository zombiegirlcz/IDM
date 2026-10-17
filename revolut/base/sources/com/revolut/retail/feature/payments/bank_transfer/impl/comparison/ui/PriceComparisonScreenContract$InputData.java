package com.revolut.retail.feature.payments.bank_transfer.impl.comparison.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/payments/bank_transfer/impl/comparison/ui/PriceComparisonScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PriceComparisonScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PriceComparisonScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f101995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f101996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f101997c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PriceComparisonScreenContract$InputData((b) parcel.readSerializable(), (wi0.b) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PriceComparisonScreenContract$InputData[i];
        }
    }

    public PriceComparisonScreenContract$InputData(b senderCurrency, wi0.b recipientCountry, d recipientMoney) {
        Intrinsics.checkNotNullParameter(senderCurrency, "senderCurrency");
        Intrinsics.checkNotNullParameter(recipientCountry, "recipientCountry");
        Intrinsics.checkNotNullParameter(recipientMoney, "recipientMoney");
        this.f101995a = senderCurrency;
        this.f101996b = recipientCountry;
        this.f101997c = recipientMoney;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PriceComparisonScreenContract$InputData)) {
            return false;
        }
        PriceComparisonScreenContract$InputData priceComparisonScreenContract$InputData = (PriceComparisonScreenContract$InputData) obj2;
        return Intrinsics.f(this.f101995a, priceComparisonScreenContract$InputData.f101995a) && Intrinsics.f(this.f101996b, priceComparisonScreenContract$InputData.f101996b) && Intrinsics.f(this.f101997c, priceComparisonScreenContract$InputData.f101997c);
    }

    public final int hashCode() {
        return this.f101997c.hashCode() + p.a.c(this.f101995a.hashCode() * 31, 31, this.f101996b.f297794a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f101995a);
        dest.writeSerializable(this.f101996b);
        dest.writeSerializable(this.f101997c);
    }
}
