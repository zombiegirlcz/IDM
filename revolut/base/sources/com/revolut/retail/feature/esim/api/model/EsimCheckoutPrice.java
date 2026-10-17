package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimCheckoutPrice;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimCheckoutPrice implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimCheckoutPrice> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Quote f100196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f100197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f100198c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimCheckoutPrice((Quote) parcel.readParcelable(EsimCheckoutPrice.class.getClassLoader()), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimCheckoutPrice[i];
        }
    }

    public EsimCheckoutPrice(Quote quote, d checkoutPrice, d originalPrice) {
        Intrinsics.checkNotNullParameter(checkoutPrice, "checkoutPrice");
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        this.f100196a = quote;
        this.f100197b = checkoutPrice;
        this.f100198c = originalPrice;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimCheckoutPrice)) {
            return false;
        }
        EsimCheckoutPrice esimCheckoutPrice = (EsimCheckoutPrice) obj2;
        return Intrinsics.f(this.f100196a, esimCheckoutPrice.f100196a) && Intrinsics.f(this.f100197b, esimCheckoutPrice.f100197b) && Intrinsics.f(this.f100198c, esimCheckoutPrice.f100198c);
    }

    public final int hashCode() {
        Quote quote = this.f100196a;
        return this.f100198c.hashCode() + v7.c((quote == null ? 0 : quote.hashCode()) * 31, 31, this.f100197b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f100196a, i);
        dest.writeSerializable(this.f100197b);
        dest.writeSerializable(this.f100198c);
    }
}
