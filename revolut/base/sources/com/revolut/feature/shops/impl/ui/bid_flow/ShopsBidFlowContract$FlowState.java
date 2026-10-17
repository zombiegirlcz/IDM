package com.revolut.feature.shops.impl.ui.bid_flow;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shops/impl/ui/bid_flow/ShopsBidFlowContract$FlowState", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShopsBidFlowContract$FlowState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ShopsBidFlowContract$FlowState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f87130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f87131b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShopsBidFlowContract$FlowState(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShopsBidFlowContract$FlowState[i];
        }
    }

    public ShopsBidFlowContract$FlowState() {
        this(0);
    }

    public static ShopsBidFlowContract$FlowState a(ShopsBidFlowContract$FlowState shopsBidFlowContract$FlowState, boolean z) {
        Double d = shopsBidFlowContract$FlowState.f87131b;
        shopsBidFlowContract$FlowState.getClass();
        return new ShopsBidFlowContract$FlowState(d, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShopsBidFlowContract$FlowState)) {
            return false;
        }
        ShopsBidFlowContract$FlowState shopsBidFlowContract$FlowState = (ShopsBidFlowContract$FlowState) obj2;
        return this.f87130a == shopsBidFlowContract$FlowState.f87130a && Intrinsics.f(this.f87131b, shopsBidFlowContract$FlowState.f87131b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f87130a) * 31;
        Double d = this.f87131b;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f87130a ? 1 : 0);
        Double d = this.f87131b;
        if (d == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
        }
    }

    public ShopsBidFlowContract$FlowState(Double d, boolean z) {
        this.f87130a = z;
        this.f87131b = d;
    }

    public /* synthetic */ ShopsBidFlowContract$FlowState(int i) {
        this(null, false);
    }
}
