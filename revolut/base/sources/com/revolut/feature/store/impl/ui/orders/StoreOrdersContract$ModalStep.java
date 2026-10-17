package com.revolut.feature.store.impl.ui.orders;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shops.api.navigation.descriptor.ShopsItemsDetailsController$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/store/impl/ui/orders/StoreOrdersContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ItemDetails", "Lcom/revolut/feature/store/impl/ui/orders/StoreOrdersContract$ModalStep$ItemDetails;", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StoreOrdersContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/impl/ui/orders/StoreOrdersContract$ModalStep$ItemDetails;", "Lcom/revolut/feature/store/impl/ui/orders/StoreOrdersContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ItemDetails implements StoreOrdersContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ItemDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ShopsItemsDetailsController$InputData f88708a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ItemDetails((ShopsItemsDetailsController$InputData) parcel.readParcelable(ItemDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ItemDetails[i];
            }
        }

        public ItemDetails(ShopsItemsDetailsController$InputData input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f88708a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ItemDetails) && Intrinsics.f(this.f88708a, ((ItemDetails) obj2).f88708a);
        }

        public final int hashCode() {
            return this.f88708a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f88708a, i);
        }
    }
}
