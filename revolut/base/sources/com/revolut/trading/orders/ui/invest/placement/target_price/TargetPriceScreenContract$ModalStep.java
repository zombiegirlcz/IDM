package com.revolut.trading.orders.ui.invest.placement.target_price;

import android.os.Parcel;
import android.os.Parcelable;
import bfl.g;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.kompot.navigable.flow.FlowStep;
import k4l.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/trading/orders/ui/invest/placement/target_price/TargetPriceScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Tutorial", "Lcom/revolut/trading/orders/ui/invest/placement/target_price/TargetPriceScreenContract$ModalStep$Tutorial;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TargetPriceScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/target_price/TargetPriceScreenContract$ModalStep$Tutorial;", "Lcom/revolut/trading/orders/ui/invest/placement/target_price/TargetPriceScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Tutorial extends TargetPriceScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Tutorial> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f106999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r0 f107000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n f107001c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Tutorial(g.valueOf(parcel.readString()), r0.valueOf(parcel.readString()), (n) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Tutorial[i];
            }
        }

        public Tutorial(g tradeSide, r0 orderType, n instrument) {
            Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            this.f106999a = tradeSide;
            this.f107000b = orderType;
            this.f107001c = instrument;
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
            return this.f106999a == tutorial.f106999a && this.f107000b == tutorial.f107000b && Intrinsics.f(this.f107001c, tutorial.f107001c);
        }

        public final int hashCode() {
            return this.f107001c.hashCode() + d.f(this.f107000b, this.f106999a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106999a.name());
            dest.writeString(this.f107000b.name());
            dest.writeSerializable(this.f107001c);
        }
    }

    private TargetPriceScreenContract$ModalStep() {
    }
}
