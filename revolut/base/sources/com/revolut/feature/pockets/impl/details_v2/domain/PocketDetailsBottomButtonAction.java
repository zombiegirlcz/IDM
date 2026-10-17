package com.revolut.feature.pockets.impl.details_v2.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.checkout.models.CheckoutParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/pockets/impl/details_v2/domain/PocketDetailsBottomButtonAction;", "Landroid/os/Parcelable;", "OrderCard", "Lcom/revolut/feature/pockets/impl/details_v2/domain/PocketDetailsBottomButtonAction$OrderCard;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PocketDetailsBottomButtonAction extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pockets/impl/details_v2/domain/PocketDetailsBottomButtonAction$OrderCard;", "Lcom/revolut/feature/pockets/impl/details_v2/domain/PocketDetailsBottomButtonAction;", "", "toString", "()Ljava/lang/String;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderCard implements PocketDetailsBottomButtonAction {

        @NotNull
        public static final Parcelable.Creator<OrderCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheckoutOrder f80801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CheckoutParams f80802b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OrderCard((CheckoutOrder) parcel.readParcelable(OrderCard.class.getClassLoader()), (CheckoutParams) parcel.readParcelable(OrderCard.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderCard[i];
            }
        }

        public OrderCard(CheckoutOrder checkoutOrder, CheckoutParams checkoutParams) {
            Intrinsics.checkNotNullParameter(checkoutOrder, "checkoutOrder");
            this.f80801a = checkoutOrder;
            this.f80802b = checkoutParams;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OrderCard)) {
                return false;
            }
            OrderCard orderCard = (OrderCard) obj2;
            return Intrinsics.f(this.f80801a, orderCard.f80801a) && Intrinsics.f(this.f80802b, orderCard.f80802b);
        }

        public final int hashCode() {
            int iHashCode = this.f80801a.hashCode() * 31;
            CheckoutParams checkoutParams = this.f80802b;
            return iHashCode + (checkoutParams == null ? 0 : checkoutParams.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80801a, i);
            dest.writeParcelable(this.f80802b, i);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public OrderCard() {
            this(CheckoutOrder.f65846g, null);
            CheckoutOrder.INSTANCE.getClass();
        }
    }
}
