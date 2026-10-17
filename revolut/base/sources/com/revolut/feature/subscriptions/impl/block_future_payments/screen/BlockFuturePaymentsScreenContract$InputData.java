package com.revolut.feature.subscriptions.impl.block_future_payments.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/subscriptions/impl/block_future_payments/screen/BlockFuturePaymentsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BlockFuturePaymentsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BlockFuturePaymentsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f89183b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BlockFuturePaymentsScreenContract$InputData(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlockFuturePaymentsScreenContract$InputData[i];
        }
    }

    public BlockFuturePaymentsScreenContract$InputData(String paymentId, boolean z) {
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        this.f89182a = paymentId;
        this.f89183b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BlockFuturePaymentsScreenContract$InputData)) {
            return false;
        }
        BlockFuturePaymentsScreenContract$InputData blockFuturePaymentsScreenContract$InputData = (BlockFuturePaymentsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f89182a, blockFuturePaymentsScreenContract$InputData.f89182a) && this.f89183b == blockFuturePaymentsScreenContract$InputData.f89183b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f89183b) + (this.f89182a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f89182a);
        dest.writeInt(this.f89183b ? 1 : 0);
    }
}
