package com.revolut.retail.feature.payments.bank_transfer.impl.comparison.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/comparison/navigation/PriceComparisonDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PriceComparisonDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<PriceComparisonDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f101992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f101993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f101994c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PriceComparisonDestination((b) parcel.readSerializable(), (wi0.b) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PriceComparisonDestination[i];
        }
    }

    public PriceComparisonDestination(b senderCurrency, wi0.b recipientCountry, d recipientMoney) {
        Intrinsics.checkNotNullParameter(senderCurrency, "senderCurrency");
        Intrinsics.checkNotNullParameter(recipientCountry, "recipientCountry");
        Intrinsics.checkNotNullParameter(recipientMoney, "recipientMoney");
        this.f101992a = senderCurrency;
        this.f101993b = recipientCountry;
        this.f101994c = recipientMoney;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final wi0.b getF101993b() {
        return this.f101993b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getF101994c() {
        return this.f101994c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getF101992a() {
        return this.f101992a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PriceComparisonDestination)) {
            return false;
        }
        PriceComparisonDestination priceComparisonDestination = (PriceComparisonDestination) obj2;
        return Intrinsics.f(this.f101992a, priceComparisonDestination.f101992a) && Intrinsics.f(this.f101993b, priceComparisonDestination.f101993b) && Intrinsics.f(this.f101994c, priceComparisonDestination.f101994c);
    }

    public final int hashCode() {
        return this.f101994c.hashCode() + p.a.c(this.f101992a.hashCode() * 31, 31, this.f101993b.f297794a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f101992a);
        dest.writeSerializable(this.f101993b);
        dest.writeSerializable(this.f101994c);
    }
}
