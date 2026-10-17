package com.revolut.feature.freelancer.impl.ui.acquiring_order.list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/acquiring_order/list/FreelancerAcquiringOrderListScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerAcquiringOrderListScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FreelancerAcquiringOrderListScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ou6.a f73693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AcquiringOrderFilter f73694b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerAcquiringOrderListScreenContract$InputData(ou6.a.valueOf(parcel.readString()), (AcquiringOrderFilter) parcel.readParcelable(FreelancerAcquiringOrderListScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerAcquiringOrderListScreenContract$InputData[i];
        }
    }

    public FreelancerAcquiringOrderListScreenContract$InputData(ou6.a mode, AcquiringOrderFilter acquiringOrderFilter) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f73693a = mode;
        this.f73694b = acquiringOrderFilter;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerAcquiringOrderListScreenContract$InputData)) {
            return false;
        }
        FreelancerAcquiringOrderListScreenContract$InputData freelancerAcquiringOrderListScreenContract$InputData = (FreelancerAcquiringOrderListScreenContract$InputData) obj2;
        return this.f73693a == freelancerAcquiringOrderListScreenContract$InputData.f73693a && Intrinsics.f(this.f73694b, freelancerAcquiringOrderListScreenContract$InputData.f73694b);
    }

    public final int hashCode() {
        int iHashCode = this.f73693a.hashCode() * 31;
        AcquiringOrderFilter acquiringOrderFilter = this.f73694b;
        return iHashCode + (acquiringOrderFilter == null ? 0 : acquiringOrderFilter.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73693a.name());
        dest.writeParcelable(this.f73694b, i);
    }
}
