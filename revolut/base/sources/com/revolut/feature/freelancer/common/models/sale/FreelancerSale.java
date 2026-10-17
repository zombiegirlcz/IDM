package com.revolut.feature.freelancer.common.models.sale;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/sale/FreelancerSale;", "Landroid/os/Parcelable;", "<init>", "()V", "OrderSale", "Lcom/revolut/feature/freelancer/common/models/sale/FreelancerSale$OrderSale;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FreelancerSale implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/sale/FreelancerSale$OrderSale;", "Lcom/revolut/feature/freelancer/common/models/sale/FreelancerSale;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderSale extends FreelancerSale {

        @NotNull
        public static final Parcelable.Creator<OrderSale> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FreelancerOrder f73468a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OrderSale(FreelancerOrder.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderSale[i];
            }
        }

        public OrderSale(FreelancerOrder order) {
            Intrinsics.checkNotNullParameter(order, "order");
            this.f73468a = order;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OrderSale) && Intrinsics.f(this.f73468a, ((OrderSale) obj2).f73468a);
        }

        public final int hashCode() {
            return this.f73468a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f73468a.writeToParcel(dest, i);
        }
    }

    private FreelancerSale() {
    }
}
