package com.revolut.feature_crypto_order_flow.impl.order_summary.mappers;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/feature_crypto_order_flow/impl/order_summary/mappers/OrderSummaryItemsMapper$Companion$AutoStakingWarmupParcel", "Landroid/os/Parcelable;", "<init>", "()V", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderSummaryItemsMapper$Companion$AutoStakingWarmupParcel implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OrderSummaryItemsMapper$Companion$AutoStakingWarmupParcel f96798a = new OrderSummaryItemsMapper$Companion$AutoStakingWarmupParcel();

    @NotNull
    public static final Parcelable.Creator<OrderSummaryItemsMapper$Companion$AutoStakingWarmupParcel> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return OrderSummaryItemsMapper$Companion$AutoStakingWarmupParcel.f96798a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OrderSummaryItemsMapper$Companion$AutoStakingWarmupParcel[i];
        }
    }

    private OrderSummaryItemsMapper$Companion$AutoStakingWarmupParcel() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
