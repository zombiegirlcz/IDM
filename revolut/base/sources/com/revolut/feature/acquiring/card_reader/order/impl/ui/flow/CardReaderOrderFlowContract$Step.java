package com.revolut.feature.acquiring.card_reader.order.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/acquiring/card_reader/order/impl/ui/flow/CardReaderOrderFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ProductDetails", "DeliveryAddress", "Vat", "Checkout", "Lcom/revolut/feature/acquiring/card_reader/order/impl/ui/flow/CardReaderOrderFlowContract$Step$Checkout;", "Lcom/revolut/feature/acquiring/card_reader/order/impl/ui/flow/CardReaderOrderFlowContract$Step$DeliveryAddress;", "Lcom/revolut/feature/acquiring/card_reader/order/impl/ui/flow/CardReaderOrderFlowContract$Step$ProductDetails;", "Lcom/revolut/feature/acquiring/card_reader/order/impl/ui/flow/CardReaderOrderFlowContract$Step$Vat;", "feature_acquiring_card_reader_order_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardReaderOrderFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/order/impl/ui/flow/CardReaderOrderFlowContract$Step$Checkout;", "Lcom/revolut/feature/acquiring/card_reader/order/impl/ui/flow/CardReaderOrderFlowContract$Step;", "<init>", "()V", "feature_acquiring_card_reader_order_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Checkout extends CardReaderOrderFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Checkout f60592a = new Checkout();

        @NotNull
        public static final Parcelable.Creator<Checkout> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Checkout.f60592a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checkout[i];
            }
        }

        private Checkout() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/order/impl/ui/flow/CardReaderOrderFlowContract$Step$DeliveryAddress;", "Lcom/revolut/feature/acquiring/card_reader/order/impl/ui/flow/CardReaderOrderFlowContract$Step;", "<init>", "()V", "feature_acquiring_card_reader_order_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DeliveryAddress extends CardReaderOrderFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DeliveryAddress f60593a = new DeliveryAddress();

        @NotNull
        public static final Parcelable.Creator<DeliveryAddress> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DeliveryAddress.f60593a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeliveryAddress[i];
            }
        }

        private DeliveryAddress() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/order/impl/ui/flow/CardReaderOrderFlowContract$Step$ProductDetails;", "Lcom/revolut/feature/acquiring/card_reader/order/impl/ui/flow/CardReaderOrderFlowContract$Step;", "<init>", "()V", "feature_acquiring_card_reader_order_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProductDetails extends CardReaderOrderFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductDetails f60594a = new ProductDetails();

        @NotNull
        public static final Parcelable.Creator<ProductDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProductDetails.f60594a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductDetails[i];
            }
        }

        private ProductDetails() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/order/impl/ui/flow/CardReaderOrderFlowContract$Step$Vat;", "Lcom/revolut/feature/acquiring/card_reader/order/impl/ui/flow/CardReaderOrderFlowContract$Step;", "<init>", "()V", "feature_acquiring_card_reader_order_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Vat extends CardReaderOrderFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Vat f60595a = new Vat();

        @NotNull
        public static final Parcelable.Creator<Vat> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Vat.f60595a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Vat[i];
            }
        }

        private Vat() {
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

    private CardReaderOrderFlowContract$Step() {
    }
}
