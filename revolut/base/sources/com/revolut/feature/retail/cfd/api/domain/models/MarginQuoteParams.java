package com.revolut.feature.retail.cfd.api.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import bfl.g;
import f8l.e;
import h30.l;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;
import xi0.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/domain/models/MarginQuoteParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MarginQuoteParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarginQuoteParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f82117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f82118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f82119c;
    public final b d;
    public final b e;
    public final BigDecimal f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BigDecimal f82120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BigDecimal f82121h;
    public final BigDecimal i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarginQuoteParams(e.valueOf(parcel.readString()), g.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), (b) parcel.readSerializable(), (b) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MarginQuoteParams[i];
        }
    }

    public MarginQuoteParams(e orderType, g side, BigDecimal marginRate, b counterCurrency, b assetCurrency, BigDecimal assetQuantity, BigDecimal openLongQty, BigDecimal openShortQty, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(marginRate, "marginRate");
        Intrinsics.checkNotNullParameter(counterCurrency, "counterCurrency");
        Intrinsics.checkNotNullParameter(assetCurrency, "assetCurrency");
        Intrinsics.checkNotNullParameter(assetQuantity, "assetQuantity");
        Intrinsics.checkNotNullParameter(openLongQty, "openLongQty");
        Intrinsics.checkNotNullParameter(openShortQty, "openShortQty");
        this.f82117a = orderType;
        this.f82118b = side;
        this.f82119c = marginRate;
        this.d = counterCurrency;
        this.e = assetCurrency;
        this.f = assetQuantity;
        this.f82120g = openLongQty;
        this.f82121h = openShortQty;
        this.i = bigDecimal;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MarginQuoteParams)) {
            return false;
        }
        MarginQuoteParams marginQuoteParams = (MarginQuoteParams) obj2;
        return this.f82117a == marginQuoteParams.f82117a && this.f82118b == marginQuoteParams.f82118b && Intrinsics.f(this.f82119c, marginQuoteParams.f82119c) && Intrinsics.f(this.d, marginQuoteParams.d) && Intrinsics.f(this.e, marginQuoteParams.e) && Intrinsics.f(this.f, marginQuoteParams.f) && Intrinsics.f(this.f82120g, marginQuoteParams.f82120g) && Intrinsics.f(this.f82121h, marginQuoteParams.f82121h) && Intrinsics.f(this.i, marginQuoteParams.i);
    }

    public final int hashCode() {
        int iD = t61.a.d(this.f82121h, t61.a.d(this.f82120g, t61.a.d(this.f, l.j(this.e, l.j(this.d, t61.a.d(this.f82119c, y.b(this.f82118b, this.f82117a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        BigDecimal bigDecimal = this.i;
        return iD + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82117a.name());
        dest.writeString(this.f82118b.name());
        dest.writeSerializable(this.f82119c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f82120g);
        dest.writeSerializable(this.f82121h);
        dest.writeSerializable(this.i);
    }
}
