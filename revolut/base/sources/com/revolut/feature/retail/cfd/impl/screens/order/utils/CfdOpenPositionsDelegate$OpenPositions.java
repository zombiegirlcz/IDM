package com.revolut.feature.retail.cfd.impl.screens.order.utils;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/cfd/impl/screens/order/utils/CfdOpenPositionsDelegate$OpenPositions", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CfdOpenPositionsDelegate$OpenPositions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CfdOpenPositionsDelegate$OpenPositions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f82237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f82238b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CfdOpenPositionsDelegate$OpenPositions((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CfdOpenPositionsDelegate$OpenPositions[i];
        }
    }

    public CfdOpenPositionsDelegate$OpenPositions(BigDecimal longQuantity, BigDecimal shortQuantity) {
        Intrinsics.checkNotNullParameter(longQuantity, "longQuantity");
        Intrinsics.checkNotNullParameter(shortQuantity, "shortQuantity");
        this.f82237a = longQuantity;
        this.f82238b = shortQuantity;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CfdOpenPositionsDelegate$OpenPositions)) {
            return false;
        }
        CfdOpenPositionsDelegate$OpenPositions cfdOpenPositionsDelegate$OpenPositions = (CfdOpenPositionsDelegate$OpenPositions) obj2;
        return Intrinsics.f(this.f82237a, cfdOpenPositionsDelegate$OpenPositions.f82237a) && Intrinsics.f(this.f82238b, cfdOpenPositionsDelegate$OpenPositions.f82238b);
    }

    public final int hashCode() {
        return this.f82238b.hashCode() + (this.f82237a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f82237a);
        dest.writeSerializable(this.f82238b);
    }
}
