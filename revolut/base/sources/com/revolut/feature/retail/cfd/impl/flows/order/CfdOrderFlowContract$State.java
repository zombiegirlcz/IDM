package com.revolut.feature.retail.cfd.impl.flows.order;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/cfd/impl/flows/order/CfdOrderFlowContract$State", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CfdOrderFlowContract$State implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CfdOrderFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CfdOrderData f82173b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CfdOrderFlowContract$State(parcel.readString(), parcel.readInt() == 0 ? null : CfdOrderData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CfdOrderFlowContract$State[i];
        }
    }

    public CfdOrderFlowContract$State(String idempotencyKey, CfdOrderData cfdOrderData) {
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        this.f82172a = idempotencyKey;
        this.f82173b = cfdOrderData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CfdOrderFlowContract$State)) {
            return false;
        }
        CfdOrderFlowContract$State cfdOrderFlowContract$State = (CfdOrderFlowContract$State) obj2;
        return Intrinsics.f(this.f82172a, cfdOrderFlowContract$State.f82172a) && Intrinsics.f(this.f82173b, cfdOrderFlowContract$State.f82173b);
    }

    public final int hashCode() {
        int iHashCode = this.f82172a.hashCode() * 31;
        CfdOrderData cfdOrderData = this.f82173b;
        return iHashCode + (cfdOrderData == null ? 0 : cfdOrderData.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82172a);
        CfdOrderData cfdOrderData = this.f82173b;
        if (cfdOrderData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cfdOrderData.writeToParcel(dest, i);
        }
    }
}
