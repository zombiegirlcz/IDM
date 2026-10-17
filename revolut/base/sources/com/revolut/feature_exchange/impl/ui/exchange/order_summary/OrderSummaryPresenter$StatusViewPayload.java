package com.revolut.feature_exchange.impl.ui.exchange.order_summary;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.exchange.models.ExchangeOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qua.p;
import wd6.h;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_exchange/impl/ui/exchange/order_summary/OrderSummaryPresenter$StatusViewPayload", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrderSummaryPresenter$StatusViewPayload implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OrderSummaryPresenter$StatusViewPayload> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f96920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f96921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f96922c;
    public final ExchangeOrder.Active d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderSummaryPresenter$StatusViewPayload(h.valueOf(parcel.readString()), (b) parcel.readSerializable(), (p) parcel.readSerializable(), (ExchangeOrder.Active) parcel.readParcelable(OrderSummaryPresenter$StatusViewPayload.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OrderSummaryPresenter$StatusViewPayload[i];
        }
    }

    public OrderSummaryPresenter$StatusViewPayload(h orderType, b bVar, p pVar, ExchangeOrder.Active active) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.f96920a = orderType;
        this.f96921b = bVar;
        this.f96922c = pVar;
        this.d = active;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OrderSummaryPresenter$StatusViewPayload)) {
            return false;
        }
        OrderSummaryPresenter$StatusViewPayload orderSummaryPresenter$StatusViewPayload = (OrderSummaryPresenter$StatusViewPayload) obj2;
        return this.f96920a == orderSummaryPresenter$StatusViewPayload.f96920a && Intrinsics.f(this.f96921b, orderSummaryPresenter$StatusViewPayload.f96921b) && Intrinsics.f(this.f96922c, orderSummaryPresenter$StatusViewPayload.f96922c) && Intrinsics.f(this.d, orderSummaryPresenter$StatusViewPayload.d);
    }

    public final int hashCode() {
        int iHashCode = this.f96920a.hashCode() * 31;
        b bVar = this.f96921b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        p pVar = this.f96922c;
        int iHashCode3 = (iHashCode2 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        ExchangeOrder.Active active = this.d;
        return iHashCode3 + (active != null ? active.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f96920a.name());
        dest.writeSerializable(this.f96921b);
        dest.writeSerializable(this.f96922c);
        dest.writeParcelable(this.d, i);
    }

    public /* synthetic */ OrderSummaryPresenter$StatusViewPayload(h hVar, b bVar, p pVar, ExchangeOrder.Active active, int i) {
        this(hVar, bVar, (i & 4) != 0 ? null : pVar, (i & 8) != 0 ? null : active);
    }
}
