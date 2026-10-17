package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.exchange_action;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.exchange.models.ExchangeOrder;
import dj0.d;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v1.c;
import wd6.e;
import wd6.h;
import wd6.i;
import wp5.y;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/exchange_action/CommodityExchangeResult;", "Landroid/os/Parcelable;", "<init>", "()V", "Success", "Pending", "PocketActivationRequired", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/exchange_action/CommodityExchangeResult$Pending;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/exchange_action/CommodityExchangeResult$PocketActivationRequired;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/exchange_action/CommodityExchangeResult$Success;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CommodityExchangeResult implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/exchange_action/CommodityExchangeResult$Pending;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/exchange_action/CommodityExchangeResult;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pending extends CommodityExchangeResult {

        @NotNull
        public static final Parcelable.Creator<Pending> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f99871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f99872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f99873c;
        public final i d;
        public final h e;
        public final ExchangeOrder.Active f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pending((b) parcel.readSerializable(), (b) parcel.readSerializable(), e.valueOf(parcel.readString()), i.valueOf(parcel.readString()), h.valueOf(parcel.readString()), (ExchangeOrder.Active) parcel.readParcelable(Pending.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pending[i];
            }
        }

        public Pending(b baseOrderCurrency, b counterOrderCurrency, e exchangeMode, i exchangePocketType, h orderType, ExchangeOrder.Active pendingOrder) {
            Intrinsics.checkNotNullParameter(baseOrderCurrency, "baseOrderCurrency");
            Intrinsics.checkNotNullParameter(counterOrderCurrency, "counterOrderCurrency");
            Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
            Intrinsics.checkNotNullParameter(exchangePocketType, "exchangePocketType");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(pendingOrder, "pendingOrder");
            this.f99871a = baseOrderCurrency;
            this.f99872b = counterOrderCurrency;
            this.f99873c = exchangeMode;
            this.d = exchangePocketType;
            this.e = orderType;
            this.f = pendingOrder;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Pending)) {
                return false;
            }
            Pending pending = (Pending) obj2;
            return Intrinsics.f(this.f99871a, pending.f99871a) && Intrinsics.f(this.f99872b, pending.f99872b) && this.f99873c == pending.f99873c && this.d == pending.d && this.e == pending.e && Intrinsics.f(this.f, pending.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + c.b(this.e, (this.d.hashCode() + y.g(this.f99873c, l.j(this.f99872b, this.f99871a.hashCode() * 31, 31), 31)) * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99871a);
            dest.writeSerializable(this.f99872b);
            dest.writeString(this.f99873c.name());
            dest.writeString(this.d.name());
            dest.writeString(this.e.name());
            dest.writeParcelable(this.f, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/exchange_action/CommodityExchangeResult$PocketActivationRequired;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/exchange_action/CommodityExchangeResult;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PocketActivationRequired extends CommodityExchangeResult {

        @NotNull
        public static final Parcelable.Creator<PocketActivationRequired> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f99874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f99875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f99876c;
        public final i d;
        public final h e;
        public final b f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f99877g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PocketActivationRequired((b) parcel.readSerializable(), (b) parcel.readSerializable(), e.valueOf(parcel.readString()), i.valueOf(parcel.readString()), h.valueOf(parcel.readString()), (b) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PocketActivationRequired[i];
            }
        }

        public PocketActivationRequired(b baseOrderCurrency, b counterOrderCurrency, e exchangeMode, i exchangePocketType, h orderType, b pocketCurrency, String str) {
            Intrinsics.checkNotNullParameter(baseOrderCurrency, "baseOrderCurrency");
            Intrinsics.checkNotNullParameter(counterOrderCurrency, "counterOrderCurrency");
            Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
            Intrinsics.checkNotNullParameter(exchangePocketType, "exchangePocketType");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
            this.f99874a = baseOrderCurrency;
            this.f99875b = counterOrderCurrency;
            this.f99876c = exchangeMode;
            this.d = exchangePocketType;
            this.e = orderType;
            this.f = pocketCurrency;
            this.f99877g = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PocketActivationRequired)) {
                return false;
            }
            PocketActivationRequired pocketActivationRequired = (PocketActivationRequired) obj2;
            return Intrinsics.f(this.f99874a, pocketActivationRequired.f99874a) && Intrinsics.f(this.f99875b, pocketActivationRequired.f99875b) && this.f99876c == pocketActivationRequired.f99876c && this.d == pocketActivationRequired.d && this.e == pocketActivationRequired.e && Intrinsics.f(this.f, pocketActivationRequired.f) && Intrinsics.f(this.f99877g, pocketActivationRequired.f99877g);
        }

        public final int hashCode() {
            int iJ = l.j(this.f, c.b(this.e, (this.d.hashCode() + y.g(this.f99876c, l.j(this.f99875b, this.f99874a.hashCode() * 31, 31), 31)) * 31, 31), 31);
            String str = this.f99877g;
            return iJ + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99874a);
            dest.writeSerializable(this.f99875b);
            dest.writeString(this.f99876c.name());
            dest.writeString(this.d.name());
            dest.writeString(this.e.name());
            dest.writeSerializable(this.f);
            dest.writeString(this.f99877g);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/exchange_action/CommodityExchangeResult$Success;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/exchange_action/CommodityExchangeResult;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Success extends CommodityExchangeResult {

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f99878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f99879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f99880c;
        public final i d;
        public final h e;
        public final d f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final d f99881g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Success((b) parcel.readSerializable(), (b) parcel.readSerializable(), e.valueOf(parcel.readString()), i.valueOf(parcel.readString()), h.valueOf(parcel.readString()), (d) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Success[i];
            }
        }

        public Success(b baseOrderCurrency, b counterOrderCurrency, e exchangeMode, i exchangePocketType, h orderType, d dVar, d dVar2) {
            Intrinsics.checkNotNullParameter(baseOrderCurrency, "baseOrderCurrency");
            Intrinsics.checkNotNullParameter(counterOrderCurrency, "counterOrderCurrency");
            Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
            Intrinsics.checkNotNullParameter(exchangePocketType, "exchangePocketType");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            this.f99878a = baseOrderCurrency;
            this.f99879b = counterOrderCurrency;
            this.f99880c = exchangeMode;
            this.d = exchangePocketType;
            this.e = orderType;
            this.f = dVar;
            this.f99881g = dVar2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Success)) {
                return false;
            }
            Success success = (Success) obj2;
            return Intrinsics.f(this.f99878a, success.f99878a) && Intrinsics.f(this.f99879b, success.f99879b) && this.f99880c == success.f99880c && this.d == success.d && this.e == success.e && Intrinsics.f(this.f, success.f) && Intrinsics.f(this.f99881g, success.f99881g);
        }

        public final int hashCode() {
            int iB = c.b(this.e, (this.d.hashCode() + y.g(this.f99880c, l.j(this.f99879b, this.f99878a.hashCode() * 31, 31), 31)) * 31, 31);
            d dVar = this.f;
            int iHashCode = (iB + (dVar == null ? 0 : dVar.hashCode())) * 31;
            d dVar2 = this.f99881g;
            return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99878a);
            dest.writeSerializable(this.f99879b);
            dest.writeString(this.f99880c.name());
            dest.writeString(this.d.name());
            dest.writeString(this.e.name());
            dest.writeSerializable(this.f);
            dest.writeSerializable(this.f99881g);
        }
    }

    private CommodityExchangeResult() {
    }
}
