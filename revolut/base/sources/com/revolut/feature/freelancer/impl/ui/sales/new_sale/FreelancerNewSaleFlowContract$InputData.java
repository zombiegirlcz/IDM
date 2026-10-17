package com.revolut.feature.freelancer.impl.ui.sales.new_sale;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import cs6.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/sales/new_sale/FreelancerNewSaleFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerNewSaleFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FreelancerNewSaleFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f74142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f74143b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerNewSaleFlowContract$InputData(c.valueOf(parcel.readString()), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerNewSaleFlowContract$InputData[i];
        }
    }

    public FreelancerNewSaleFlowContract$InputData(c saleType, b bVar) {
        Intrinsics.checkNotNullParameter(saleType, "saleType");
        this.f74142a = bVar;
        this.f74143b = saleType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerNewSaleFlowContract$InputData)) {
            return false;
        }
        FreelancerNewSaleFlowContract$InputData freelancerNewSaleFlowContract$InputData = (FreelancerNewSaleFlowContract$InputData) obj2;
        return Intrinsics.f(this.f74142a, freelancerNewSaleFlowContract$InputData.f74142a) && this.f74143b == freelancerNewSaleFlowContract$InputData.f74143b;
    }

    public final int hashCode() {
        b bVar = this.f74142a;
        return this.f74143b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f74142a);
        dest.writeString(this.f74143b.name());
    }
}
