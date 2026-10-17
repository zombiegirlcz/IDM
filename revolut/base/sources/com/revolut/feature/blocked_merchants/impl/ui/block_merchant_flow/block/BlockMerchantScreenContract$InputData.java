package com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.block;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kr2.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/block/BlockMerchantScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_blocked_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BlockMerchantScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BlockMerchantScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f64240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f64241b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BlockMerchantScreenContract$InputData((d) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlockMerchantScreenContract$InputData[i];
        }
    }

    public BlockMerchantScreenContract$InputData(d blockMerchantIntent, boolean z) {
        Intrinsics.checkNotNullParameter(blockMerchantIntent, "blockMerchantIntent");
        this.f64240a = blockMerchantIntent;
        this.f64241b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BlockMerchantScreenContract$InputData)) {
            return false;
        }
        BlockMerchantScreenContract$InputData blockMerchantScreenContract$InputData = (BlockMerchantScreenContract$InputData) obj2;
        return Intrinsics.f(this.f64240a, blockMerchantScreenContract$InputData.f64240a) && this.f64241b == blockMerchantScreenContract$InputData.f64241b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64241b) + (this.f64240a.f188642a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f64240a);
        dest.writeInt(this.f64241b ? 1 : 0);
    }
}
