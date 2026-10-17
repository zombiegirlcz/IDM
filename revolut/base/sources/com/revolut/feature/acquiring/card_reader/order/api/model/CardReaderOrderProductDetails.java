package com.revolut.feature.acquiring.card_reader.order.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/order/api/model/CardReaderOrderProductDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_card_reader_order_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardReaderOrderProductDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardReaderOrderProductDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f60575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f60576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f60577c;
    public final double d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProductVAT f60578g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardReaderOrderProductDetails((d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt(), parcel.readDouble(), parcel.readString(), parcel.readInt() != 0, (ProductVAT) parcel.readParcelable(CardReaderOrderProductDetails.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardReaderOrderProductDetails[i];
        }
    }

    public CardReaderOrderProductDetails(d terminalPrice, d deliveryFee, int i, double d, String termsAndConditionsUrl, boolean z, ProductVAT vat) {
        Intrinsics.checkNotNullParameter(terminalPrice, "terminalPrice");
        Intrinsics.checkNotNullParameter(deliveryFee, "deliveryFee");
        Intrinsics.checkNotNullParameter(termsAndConditionsUrl, "termsAndConditionsUrl");
        Intrinsics.checkNotNullParameter(vat, "vat");
        this.f60575a = terminalPrice;
        this.f60576b = deliveryFee;
        this.f60577c = i;
        this.d = d;
        this.e = termsAndConditionsUrl;
        this.f = z;
        this.f60578g = vat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardReaderOrderProductDetails)) {
            return false;
        }
        CardReaderOrderProductDetails cardReaderOrderProductDetails = (CardReaderOrderProductDetails) obj2;
        return Intrinsics.f(this.f60575a, cardReaderOrderProductDetails.f60575a) && Intrinsics.f(this.f60576b, cardReaderOrderProductDetails.f60576b) && this.f60577c == cardReaderOrderProductDetails.f60577c && Double.compare(this.d, cardReaderOrderProductDetails.d) == 0 && Intrinsics.f(this.e, cardReaderOrderProductDetails.e) && this.f == cardReaderOrderProductDetails.f && Intrinsics.f(this.f60578g, cardReaderOrderProductDetails.f60578g);
    }

    public final int hashCode() {
        return this.f60578g.hashCode() + j6.a.c(p.a.c(b.c(j6.a.b(this.f60577c, v7.c(this.f60575a.hashCode() * 31, 31, this.f60576b), 31), this.d, 31), 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f60575a);
        dest.writeSerializable(this.f60576b);
        dest.writeInt(this.f60577c);
        dest.writeDouble(this.d);
        dest.writeString(this.e);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeParcelable(this.f60578g, i);
    }
}
