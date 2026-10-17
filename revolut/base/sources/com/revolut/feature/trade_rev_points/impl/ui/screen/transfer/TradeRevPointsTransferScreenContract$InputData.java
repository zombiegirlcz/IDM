package com.revolut.feature.trade_rev_points.impl.ui.screen.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsAccount;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u2f.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trade_rev_points/impl/ui/screen/transfer/TradeRevPointsTransferScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TradeRevPointsTransferScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TradeRevPointsTransferScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f91159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TradeRevPointsAccount f91160c;
    public final Integer d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TradeRevPointsTransferScreenContract$InputData(parcel.readString(), j.valueOf(parcel.readString()), (TradeRevPointsAccount) parcel.readParcelable(TradeRevPointsTransferScreenContract$InputData.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TradeRevPointsTransferScreenContract$InputData[i];
        }
    }

    public TradeRevPointsTransferScreenContract$InputData(String agentId, j product, TradeRevPointsAccount account, Integer num) {
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(account, "account");
        this.f91158a = agentId;
        this.f91159b = product;
        this.f91160c = account;
        this.d = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TradeRevPointsTransferScreenContract$InputData)) {
            return false;
        }
        TradeRevPointsTransferScreenContract$InputData tradeRevPointsTransferScreenContract$InputData = (TradeRevPointsTransferScreenContract$InputData) obj2;
        return Intrinsics.f(this.f91158a, tradeRevPointsTransferScreenContract$InputData.f91158a) && this.f91159b == tradeRevPointsTransferScreenContract$InputData.f91159b && Intrinsics.f(this.f91160c, tradeRevPointsTransferScreenContract$InputData.f91160c) && Intrinsics.f(this.d, tradeRevPointsTransferScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f91160c.hashCode() + ((this.f91159b.hashCode() + (this.f91158a.hashCode() * 31)) * 31)) * 31;
        Integer num = this.d;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91158a);
        dest.writeString(this.f91159b.name());
        dest.writeParcelable(this.f91160c, i);
        Integer num = this.d;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }
}
