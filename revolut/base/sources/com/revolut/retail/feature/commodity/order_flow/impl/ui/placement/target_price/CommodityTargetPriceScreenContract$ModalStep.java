package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wd6.e;
import wd6.h;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/retail/feature/commodity/order_flow/impl/ui/placement/target_price/CommodityTargetPriceScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Tutorial", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/target_price/CommodityTargetPriceScreenContract$ModalStep$Tutorial;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CommodityTargetPriceScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/target_price/CommodityTargetPriceScreenContract$ModalStep$Tutorial;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/target_price/CommodityTargetPriceScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Tutorial extends CommodityTargetPriceScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Tutorial> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f99917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f99918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xi0.b f99919c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Tutorial(h.valueOf(parcel.readString()), e.valueOf(parcel.readString()), (xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Tutorial[i];
            }
        }

        public Tutorial(h orderType, e exchangeMode, xi0.b orderBaseCurrency) {
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
            Intrinsics.checkNotNullParameter(orderBaseCurrency, "orderBaseCurrency");
            this.f99917a = orderType;
            this.f99918b = exchangeMode;
            this.f99919c = orderBaseCurrency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Tutorial)) {
                return false;
            }
            Tutorial tutorial = (Tutorial) obj2;
            return this.f99917a == tutorial.f99917a && this.f99918b == tutorial.f99918b && Intrinsics.f(this.f99919c, tutorial.f99919c);
        }

        public final int hashCode() {
            return this.f99919c.hashCode() + y.g(this.f99918b, this.f99917a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99917a.name());
            dest.writeString(this.f99918b.name());
            dest.writeSerializable(this.f99919c);
        }
    }

    private CommodityTargetPriceScreenContract$ModalStep() {
    }
}
