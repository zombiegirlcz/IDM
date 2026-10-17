package com.revolut.retail.feature.stockdetails.impl.ui.screens.order_book;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/screens/order_book/StockOrderBookControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "UnableToTrade", "NoShares", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/order_book/StockOrderBookControllerContract$ModalStep$NoShares;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/order_book/StockOrderBookControllerContract$ModalStep$UnableToTrade;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StockOrderBookControllerContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/order_book/StockOrderBookControllerContract$ModalStep$NoShares;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/order_book/StockOrderBookControllerContract$ModalStep;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoShares extends StockOrderBookControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoShares f104036a = new NoShares();

        @NotNull
        public static final Parcelable.Creator<NoShares> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NoShares.f104036a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoShares[i];
            }
        }

        private NoShares() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/order_book/StockOrderBookControllerContract$ModalStep$UnableToTrade;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/order_book/StockOrderBookControllerContract$ModalStep;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UnableToTrade extends StockOrderBookControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnableToTrade f104037a = new UnableToTrade();

        @NotNull
        public static final Parcelable.Creator<UnableToTrade> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UnableToTrade.f104037a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnableToTrade[i];
            }
        }

        private UnableToTrade() {
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

    private StockOrderBookControllerContract$ModalStep() {
    }
}
