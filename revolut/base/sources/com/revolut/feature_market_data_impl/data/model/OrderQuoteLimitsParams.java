package com.revolut.feature_market_data_impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_impl/data/model/OrderQuoteLimitsParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrderQuoteLimitsParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OrderQuoteLimitsParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pair f97104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f97106c;
    public final long d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderQuoteLimitsParams((Pair) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OrderQuoteLimitsParams[i];
        }
    }

    public OrderQuoteLimitsParams(Pair ccyPair, String side, String orderSide, long j2) {
        Intrinsics.checkNotNullParameter(ccyPair, "ccyPair");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        this.f97104a = ccyPair;
        this.f97105b = side;
        this.f97106c = orderSide;
        this.d = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OrderQuoteLimitsParams)) {
            return false;
        }
        OrderQuoteLimitsParams orderQuoteLimitsParams = (OrderQuoteLimitsParams) obj2;
        return Intrinsics.f(this.f97104a, orderQuoteLimitsParams.f97104a) && Intrinsics.f(this.f97105b, orderQuoteLimitsParams.f97105b) && Intrinsics.f(this.f97106c, orderQuoteLimitsParams.f97106c) && this.d == orderQuoteLimitsParams.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + p.a.c(p.a.c(this.f97104a.hashCode() * 31, 31, this.f97105b), 31, this.f97106c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f97104a);
        dest.writeString(this.f97105b);
        dest.writeString(this.f97106c);
        dest.writeLong(this.d);
    }
}
