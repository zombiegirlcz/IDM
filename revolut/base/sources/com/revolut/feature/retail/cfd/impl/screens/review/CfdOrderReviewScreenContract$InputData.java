package com.revolut.feature.retail.cfd.impl.screens.review;

import a10.b;
import android.os.Parcel;
import android.os.Parcelable;
import bfl.g;
import com.revolut.feature.retail.cfd.impl.screens.common.ExpiryDate;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategies;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k4l.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/cfd/impl/screens/review/CfdOrderReviewScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CfdOrderReviewScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CfdOrderReviewScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f82277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f82278c;
    public final String d;
    public final String e;
    public final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BigDecimal f82279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e2b.a f82280h;
    public final BigDecimal i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ExpiryDate f82281j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TradingOrderExitStrategies f82282l;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            n nVar = (n) parcel.readSerializable();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            g gVarValueOf = g.valueOf(parcel.readString());
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            e2b.a aVarValueOf = e2b.a.valueOf(parcel.readString());
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            ExpiryDate expiryDateCreateFromParcel = parcel.readInt() == 0 ? null : ExpiryDate.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(n0.valueOf(parcel.readString()));
            }
            return new CfdOrderReviewScreenContract$InputData(string, bigDecimal, nVar, string2, string3, gVarValueOf, bigDecimal2, aVarValueOf, bigDecimal3, expiryDateCreateFromParcel, arrayList, (TradingOrderExitStrategies) parcel.readParcelable(CfdOrderReviewScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CfdOrderReviewScreenContract$InputData[i];
        }
    }

    public CfdOrderReviewScreenContract$InputData(String portfolioId, BigDecimal bigDecimal, n instrument, String operationId, String str, g side, BigDecimal assetQuantity, e2b.a orderType, BigDecimal targetRate, ExpiryDate expiryDate, List availableExitStrategies, TradingOrderExitStrategies tradingOrderExitStrategies) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(operationId, "operationId");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(assetQuantity, "assetQuantity");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(targetRate, "targetRate");
        Intrinsics.checkNotNullParameter(availableExitStrategies, "availableExitStrategies");
        this.f82276a = portfolioId;
        this.f82277b = bigDecimal;
        this.f82278c = instrument;
        this.d = operationId;
        this.e = str;
        this.f = side;
        this.f82279g = assetQuantity;
        this.f82280h = orderType;
        this.i = targetRate;
        this.f82281j = expiryDate;
        this.k = availableExitStrategies;
        this.f82282l = tradingOrderExitStrategies;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CfdOrderReviewScreenContract$InputData)) {
            return false;
        }
        CfdOrderReviewScreenContract$InputData cfdOrderReviewScreenContract$InputData = (CfdOrderReviewScreenContract$InputData) obj2;
        return Intrinsics.f(this.f82276a, cfdOrderReviewScreenContract$InputData.f82276a) && Intrinsics.f(this.f82277b, cfdOrderReviewScreenContract$InputData.f82277b) && Intrinsics.f(this.f82278c, cfdOrderReviewScreenContract$InputData.f82278c) && Intrinsics.f(this.d, cfdOrderReviewScreenContract$InputData.d) && Intrinsics.f(this.e, cfdOrderReviewScreenContract$InputData.e) && this.f == cfdOrderReviewScreenContract$InputData.f && Intrinsics.f(this.f82279g, cfdOrderReviewScreenContract$InputData.f82279g) && this.f82280h == cfdOrderReviewScreenContract$InputData.f82280h && Intrinsics.f(this.i, cfdOrderReviewScreenContract$InputData.i) && Intrinsics.f(this.f82281j, cfdOrderReviewScreenContract$InputData.f82281j) && Intrinsics.f(this.k, cfdOrderReviewScreenContract$InputData.k) && Intrinsics.f(this.f82282l, cfdOrderReviewScreenContract$InputData.f82282l);
    }

    public final int hashCode() {
        int iHashCode = this.f82276a.hashCode() * 31;
        BigDecimal bigDecimal = this.f82277b;
        int iC = p.a.c(b.d(this.f82278c, (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31, 31), 31, this.d);
        String str = this.e;
        int iD = t61.a.d(this.i, (this.f82280h.hashCode() + t61.a.d(this.f82279g, y.b(this.f, (iC + (str == null ? 0 : str.hashCode())) * 31, 31), 31)) * 31, 31);
        ExpiryDate expiryDate = this.f82281j;
        int iD2 = p.a.d((iD + (expiryDate == null ? 0 : expiryDate.hashCode())) * 31, 31, this.k);
        TradingOrderExitStrategies tradingOrderExitStrategies = this.f82282l;
        return iD2 + (tradingOrderExitStrategies != null ? tradingOrderExitStrategies.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82276a);
        dest.writeSerializable(this.f82277b);
        dest.writeSerializable(this.f82278c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f.name());
        dest.writeSerializable(this.f82279g);
        dest.writeString(this.f82280h.name());
        dest.writeSerializable(this.i);
        ExpiryDate expiryDate = this.f82281j;
        if (expiryDate == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            expiryDate.writeToParcel(dest, i);
        }
        Iterator itV = p.a.v(this.k, dest);
        while (itV.hasNext()) {
            dest.writeString(((n0) itV.next()).name());
        }
        dest.writeParcelable(this.f82282l, i);
    }
}
