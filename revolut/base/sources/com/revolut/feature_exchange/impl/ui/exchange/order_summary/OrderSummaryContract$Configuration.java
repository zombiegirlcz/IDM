package com.revolut.feature_exchange.impl.ui.exchange.order_summary;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_exchange/impl/ui/exchange/order_summary/OrderSummaryContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrderSummaryContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OrderSummaryContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f96917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f96918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExchangeOrderDraft f96919c;
    public final ExchangeFeatureConfig d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            ExchangeOrderDraft exchangeOrderDraft;
            ExchangeFeatureConfig exchangeFeatureConfig;
            boolean z4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z6 = false;
            boolean z11 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z6 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z11 = z;
            }
            ExchangeOrderDraft exchangeOrderDraftCreateFromParcel = parcel.readInt() == 0 ? null : ExchangeOrderDraft.CREATOR.createFromParcel(parcel);
            ExchangeFeatureConfig exchangeFeatureConfig2 = (ExchangeFeatureConfig) parcel.readParcelable(OrderSummaryContract$Configuration.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z4 = z3;
                exchangeOrderDraft = exchangeOrderDraftCreateFromParcel;
                exchangeFeatureConfig = exchangeFeatureConfig2;
            } else {
                exchangeOrderDraft = exchangeOrderDraftCreateFromParcel;
                exchangeFeatureConfig = exchangeFeatureConfig2;
                z4 = z;
            }
            return new OrderSummaryContract$Configuration(z6, z11, exchangeOrderDraft, exchangeFeatureConfig, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OrderSummaryContract$Configuration[i];
        }
    }

    public OrderSummaryContract$Configuration(boolean z, boolean z3, ExchangeOrderDraft exchangeOrderDraft, ExchangeFeatureConfig exchangeFeatureConfig, boolean z4) {
        this.f96917a = z;
        this.f96918b = z3;
        this.f96919c = exchangeOrderDraft;
        this.d = exchangeFeatureConfig;
        this.e = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OrderSummaryContract$Configuration)) {
            return false;
        }
        OrderSummaryContract$Configuration orderSummaryContract$Configuration = (OrderSummaryContract$Configuration) obj2;
        return this.f96917a == orderSummaryContract$Configuration.f96917a && this.f96918b == orderSummaryContract$Configuration.f96918b && Intrinsics.f(this.f96919c, orderSummaryContract$Configuration.f96919c) && Intrinsics.f(this.d, orderSummaryContract$Configuration.d) && this.e == orderSummaryContract$Configuration.e;
    }

    public final int hashCode() {
        int iC = j6.a.c(Boolean.hashCode(this.f96917a) * 31, 31, this.f96918b);
        ExchangeOrderDraft exchangeOrderDraft = this.f96919c;
        int iHashCode = (iC + (exchangeOrderDraft == null ? 0 : exchangeOrderDraft.hashCode())) * 31;
        ExchangeFeatureConfig exchangeFeatureConfig = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (exchangeFeatureConfig != null ? exchangeFeatureConfig.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f96917a ? 1 : 0);
        dest.writeInt(this.f96918b ? 1 : 0);
        ExchangeOrderDraft exchangeOrderDraft = this.f96919c;
        if (exchangeOrderDraft == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            exchangeOrderDraft.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
    }

    public OrderSummaryContract$Configuration(boolean z, boolean z3, int i) {
        this((i & 1) == 0, (i & 2) != 0 ? false : z, null, null, (i & 4) != 0 ? false : z3);
    }
}
