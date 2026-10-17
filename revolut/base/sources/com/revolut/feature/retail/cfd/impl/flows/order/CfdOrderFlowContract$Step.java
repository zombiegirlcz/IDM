package com.revolut.feature.retail.cfd.impl.flows.order;

import android.os.Parcel;
import android.os.Parcelable;
import bfl.g;
import com.revolut.feature.retail.cfd.impl.screens.common.ExpiryDate;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategies;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k4l.n0;
import k4l.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/retail/cfd/impl/flows/order/CfdOrderFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Order", "Tutorial", "StopLimitScreen", "OrderReview", "Lcom/revolut/feature/retail/cfd/impl/flows/order/CfdOrderFlowContract$Step$Order;", "Lcom/revolut/feature/retail/cfd/impl/flows/order/CfdOrderFlowContract$Step$OrderReview;", "Lcom/revolut/feature/retail/cfd/impl/flows/order/CfdOrderFlowContract$Step$StopLimitScreen;", "Lcom/revolut/feature/retail/cfd/impl/flows/order/CfdOrderFlowContract$Step$Tutorial;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CfdOrderFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/flows/order/CfdOrderFlowContract$Step$Order;", "Lcom/revolut/feature/retail/cfd/impl/flows/order/CfdOrderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Order implements CfdOrderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Order> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f82174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e2b.a f82175b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Order((BigDecimal) parcel.readSerializable(), e2b.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Order[i];
            }
        }

        public Order(BigDecimal targetRate, e2b.a orderType) {
            Intrinsics.checkNotNullParameter(targetRate, "targetRate");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            this.f82174a = targetRate;
            this.f82175b = orderType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Order)) {
                return false;
            }
            Order order = (Order) obj2;
            return Intrinsics.f(this.f82174a, order.f82174a) && this.f82175b == order.f82175b;
        }

        public final int hashCode() {
            return this.f82175b.hashCode() + (this.f82174a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f82174a);
            dest.writeString(this.f82175b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/flows/order/CfdOrderFlowContract$Step$OrderReview;", "Lcom/revolut/feature/retail/cfd/impl/flows/order/CfdOrderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderReview implements CfdOrderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OrderReview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f82176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f82177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e2b.a f82178c;
        public final BigDecimal d;
        public final BigDecimal e;
        public final ExpiryDate f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f82179g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final TradingOrderExitStrategies f82180h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                g gVarValueOf = g.valueOf(parcel.readString());
                e2b.a aVarValueOf = e2b.a.valueOf(parcel.readString());
                BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
                BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
                ExpiryDate expiryDateCreateFromParcel = parcel.readInt() == 0 ? null : ExpiryDate.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(n0.valueOf(parcel.readString()));
                }
                return new OrderReview(bigDecimal, gVarValueOf, aVarValueOf, bigDecimal2, bigDecimal3, expiryDateCreateFromParcel, arrayList, (TradingOrderExitStrategies) parcel.readParcelable(OrderReview.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderReview[i];
            }
        }

        public OrderReview(BigDecimal draftMarginChange, g side, e2b.a orderTypeToShow, BigDecimal assetQuantity, BigDecimal targetRate, ExpiryDate expiryDate, List availableExitStrategies, TradingOrderExitStrategies tradingOrderExitStrategies) {
            Intrinsics.checkNotNullParameter(draftMarginChange, "draftMarginChange");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(orderTypeToShow, "orderTypeToShow");
            Intrinsics.checkNotNullParameter(assetQuantity, "assetQuantity");
            Intrinsics.checkNotNullParameter(targetRate, "targetRate");
            Intrinsics.checkNotNullParameter(availableExitStrategies, "availableExitStrategies");
            this.f82176a = draftMarginChange;
            this.f82177b = side;
            this.f82178c = orderTypeToShow;
            this.d = assetQuantity;
            this.e = targetRate;
            this.f = expiryDate;
            this.f82179g = availableExitStrategies;
            this.f82180h = tradingOrderExitStrategies;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OrderReview)) {
                return false;
            }
            OrderReview orderReview = (OrderReview) obj2;
            return Intrinsics.f(this.f82176a, orderReview.f82176a) && this.f82177b == orderReview.f82177b && this.f82178c == orderReview.f82178c && Intrinsics.f(this.d, orderReview.d) && Intrinsics.f(this.e, orderReview.e) && Intrinsics.f(this.f, orderReview.f) && Intrinsics.f(this.f82179g, orderReview.f82179g) && Intrinsics.f(this.f82180h, orderReview.f82180h);
        }

        public final int hashCode() {
            int iD = t61.a.d(this.e, t61.a.d(this.d, (this.f82178c.hashCode() + y.b(this.f82177b, this.f82176a.hashCode() * 31, 31)) * 31, 31), 31);
            ExpiryDate expiryDate = this.f;
            int iD2 = p.a.d((iD + (expiryDate == null ? 0 : expiryDate.hashCode())) * 31, 31, this.f82179g);
            TradingOrderExitStrategies tradingOrderExitStrategies = this.f82180h;
            return iD2 + (tradingOrderExitStrategies != null ? tradingOrderExitStrategies.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f82176a);
            dest.writeString(this.f82177b.name());
            dest.writeString(this.f82178c.name());
            dest.writeSerializable(this.d);
            dest.writeSerializable(this.e);
            ExpiryDate expiryDate = this.f;
            if (expiryDate == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                expiryDate.writeToParcel(dest, i);
            }
            Iterator itV = p.a.v(this.f82179g, dest);
            while (itV.hasNext()) {
                dest.writeString(((n0) itV.next()).name());
            }
            dest.writeParcelable(this.f82180h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/flows/order/CfdOrderFlowContract$Step$StopLimitScreen;", "Lcom/revolut/feature/retail/cfd/impl/flows/order/CfdOrderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StopLimitScreen implements CfdOrderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<StopLimitScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f82181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r0 f82182b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StopLimitScreen(r0.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StopLimitScreen[i];
            }
        }

        public StopLimitScreen(r0 orderType, boolean z) {
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            this.f82181a = z;
            this.f82182b = orderType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StopLimitScreen)) {
                return false;
            }
            StopLimitScreen stopLimitScreen = (StopLimitScreen) obj2;
            return this.f82181a == stopLimitScreen.f82181a && this.f82182b == stopLimitScreen.f82182b;
        }

        public final int hashCode() {
            return this.f82182b.hashCode() + (Boolean.hashCode(this.f82181a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f82181a ? 1 : 0);
            dest.writeString(this.f82182b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/flows/order/CfdOrderFlowContract$Step$Tutorial;", "Lcom/revolut/feature/retail/cfd/impl/flows/order/CfdOrderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Tutorial implements CfdOrderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Tutorial> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r0 f82183a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Tutorial(r0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Tutorial[i];
            }
        }

        public Tutorial(r0 orderType) {
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            this.f82183a = orderType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Tutorial) && this.f82183a == ((Tutorial) obj2).f82183a;
        }

        public final int hashCode() {
            return this.f82183a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82183a.name());
        }
    }
}
