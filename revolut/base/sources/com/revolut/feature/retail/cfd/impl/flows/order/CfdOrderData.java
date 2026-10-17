package com.revolut.feature.retail.cfd.impl.flows.order;

import android.os.Parcel;
import android.os.Parcelable;
import bfl.g;
import com.revolut.feature.retail.cfd.impl.screens.common.ExpiryDate;
import com.revolut.feature.retail.cfd.impl.screens.order.utils.CfdOpenPositionsDelegate$OpenPositions;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/flows/order/CfdOrderData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CfdOrderData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CfdOrderData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f82169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e2b.a f82170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f82171c;
    public final CfdOpenPositionsDelegate$OpenPositions d;
    public final BigDecimal e;
    public final ExpiryDate f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CfdOrderData(g.valueOf(parcel.readString()), e2b.a.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), CfdOpenPositionsDelegate$OpenPositions.CREATOR.createFromParcel(parcel), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : ExpiryDate.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CfdOrderData[i];
        }
    }

    public CfdOrderData(g tradeSide, e2b.a orderType, BigDecimal quantity, CfdOpenPositionsDelegate$OpenPositions positions, BigDecimal targetRate, ExpiryDate expiryDate) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(targetRate, "targetRate");
        this.f82169a = tradeSide;
        this.f82170b = orderType;
        this.f82171c = quantity;
        this.d = positions;
        this.e = targetRate;
        this.f = expiryDate;
    }

    public static CfdOrderData a(CfdOrderData cfdOrderData, e2b.a aVar, BigDecimal quantity, CfdOpenPositionsDelegate$OpenPositions positions, BigDecimal targetRate, ExpiryDate expiryDate, int i) {
        e2b.a orderType = aVar;
        g tradeSide = cfdOrderData.f82169a;
        if ((i & 2) != 0) {
            orderType = cfdOrderData.f82170b;
        }
        if ((i & 4) != 0) {
            quantity = cfdOrderData.f82171c;
        }
        if ((i & 8) != 0) {
            positions = cfdOrderData.d;
        }
        if ((i & 16) != 0) {
            targetRate = cfdOrderData.e;
        }
        if ((i & 32) != 0) {
            expiryDate = cfdOrderData.f;
        }
        ExpiryDate expiryDate2 = expiryDate;
        cfdOrderData.getClass();
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(targetRate, "targetRate");
        BigDecimal bigDecimal = targetRate;
        CfdOpenPositionsDelegate$OpenPositions cfdOpenPositionsDelegate$OpenPositions = positions;
        return new CfdOrderData(tradeSide, orderType, quantity, cfdOpenPositionsDelegate$OpenPositions, bigDecimal, expiryDate2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CfdOrderData)) {
            return false;
        }
        CfdOrderData cfdOrderData = (CfdOrderData) obj2;
        return this.f82169a == cfdOrderData.f82169a && this.f82170b == cfdOrderData.f82170b && Intrinsics.f(this.f82171c, cfdOrderData.f82171c) && Intrinsics.f(this.d, cfdOrderData.d) && Intrinsics.f(this.e, cfdOrderData.e) && Intrinsics.f(this.f, cfdOrderData.f);
    }

    public final int hashCode() {
        int iD = t61.a.d(this.e, (this.d.hashCode() + t61.a.d(this.f82171c, (this.f82170b.hashCode() + (this.f82169a.hashCode() * 31)) * 31, 31)) * 31, 31);
        ExpiryDate expiryDate = this.f;
        return iD + (expiryDate == null ? 0 : expiryDate.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82169a.name());
        dest.writeString(this.f82170b.name());
        dest.writeSerializable(this.f82171c);
        this.d.writeToParcel(dest, i);
        dest.writeSerializable(this.e);
        ExpiryDate expiryDate = this.f;
        if (expiryDate == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            expiryDate.writeToParcel(dest, i);
        }
    }
}
