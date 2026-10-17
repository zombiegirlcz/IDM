package com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import dj0.d;
import h30.l;
import ip0.v7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/repay_with_review/payment_review/CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f69611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f69612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f69613c;
    public final d d;
    public final OrderQuote e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData((b) parcel.readSerializable(), (b) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (d) parcel.readSerializable(), (OrderQuote) parcel.readParcelable(CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData[i];
        }
    }

    public CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData(b fromCurrency, b toCurrency, BigDecimal finalRate, d convertedAmount, OrderQuote orderQuote) {
        Intrinsics.checkNotNullParameter(fromCurrency, "fromCurrency");
        Intrinsics.checkNotNullParameter(toCurrency, "toCurrency");
        Intrinsics.checkNotNullParameter(finalRate, "finalRate");
        Intrinsics.checkNotNullParameter(convertedAmount, "convertedAmount");
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        this.f69611a = fromCurrency;
        this.f69612b = toCurrency;
        this.f69613c = finalRate;
        this.d = convertedAmount;
        this.e = orderQuote;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData)) {
            return false;
        }
        CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData = (CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData) obj2;
        return Intrinsics.f(this.f69611a, creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData.f69611a) && Intrinsics.f(this.f69612b, creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData.f69612b) && Intrinsics.f(this.f69613c, creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData.f69613c) && Intrinsics.f(this.d, creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData.d) && Intrinsics.f(this.e, creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(t61.a.d(this.f69613c, l.j(this.f69612b, this.f69611a.hashCode() * 31, 31), 31), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f69611a);
        dest.writeSerializable(this.f69612b);
        dest.writeSerializable(this.f69613c);
        dest.writeSerializable(this.d);
        dest.writeParcelable(this.e, i);
    }
}
