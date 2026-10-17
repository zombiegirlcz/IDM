package com.revolut.feature.freelancer.impl.ui.acquiring_order.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrder$Id;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/acquiring_order/flow/FreelancerAcquiringOrderFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "OrderDetails", "OrderList", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/flow/FreelancerAcquiringOrderFlowContract$Step$OrderDetails;", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/flow/FreelancerAcquiringOrderFlowContract$Step$OrderList;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerAcquiringOrderFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/flow/FreelancerAcquiringOrderFlowContract$Step$OrderDetails;", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/flow/FreelancerAcquiringOrderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderDetails implements FreelancerAcquiringOrderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OrderDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73690a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OrderDetails(((AcquiringOrder$Id) parcel.readParcelable(OrderDetails.class.getClassLoader())).f73342a);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderDetails[i];
            }
        }

        public OrderDetails(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f73690a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OrderDetails) && Intrinsics.f(this.f73690a, ((OrderDetails) obj2).f73690a);
        }

        public final int hashCode() {
            return this.f73690a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(new AcquiringOrder$Id(this.f73690a), i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/flow/FreelancerAcquiringOrderFlowContract$Step$OrderList;", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/flow/FreelancerAcquiringOrderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderList implements FreelancerAcquiringOrderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OrderList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ou6.a f73691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AcquiringOrderFilter f73692b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OrderList(ou6.a.valueOf(parcel.readString()), (AcquiringOrderFilter) parcel.readParcelable(OrderList.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderList[i];
            }
        }

        public OrderList(ou6.a mode, AcquiringOrderFilter acquiringOrderFilter) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f73691a = mode;
            this.f73692b = acquiringOrderFilter;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OrderList)) {
                return false;
            }
            OrderList orderList = (OrderList) obj2;
            return this.f73691a == orderList.f73691a && Intrinsics.f(this.f73692b, orderList.f73692b);
        }

        public final int hashCode() {
            int iHashCode = this.f73691a.hashCode() * 31;
            AcquiringOrderFilter acquiringOrderFilter = this.f73692b;
            return iHashCode + (acquiringOrderFilter == null ? 0 : acquiringOrderFilter.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73691a.name());
            dest.writeParcelable(this.f73692b, i);
        }
    }
}
