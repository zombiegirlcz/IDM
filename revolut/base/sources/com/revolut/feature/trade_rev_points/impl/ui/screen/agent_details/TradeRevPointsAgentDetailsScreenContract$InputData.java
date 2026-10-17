package com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1c.e0;
import org.jetbrains.annotations.NotNull;
import u2f.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trade_rev_points/impl/ui/screen/agent_details/TradeRevPointsAgentDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TradeRevPointsAgentDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TradeRevPointsAgentDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f91138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f91139c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TradeRevPointsAgentDetailsScreenContract$InputData(parcel.readString(), j.valueOf(parcel.readString()), e0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TradeRevPointsAgentDetailsScreenContract$InputData[i];
        }
    }

    public TradeRevPointsAgentDetailsScreenContract$InputData(String agentId, j product, e0 revPointsBottomSheetContext) {
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(revPointsBottomSheetContext, "revPointsBottomSheetContext");
        this.f91137a = agentId;
        this.f91138b = product;
        this.f91139c = revPointsBottomSheetContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TradeRevPointsAgentDetailsScreenContract$InputData)) {
            return false;
        }
        TradeRevPointsAgentDetailsScreenContract$InputData tradeRevPointsAgentDetailsScreenContract$InputData = (TradeRevPointsAgentDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f91137a, tradeRevPointsAgentDetailsScreenContract$InputData.f91137a) && this.f91138b == tradeRevPointsAgentDetailsScreenContract$InputData.f91138b && this.f91139c == tradeRevPointsAgentDetailsScreenContract$InputData.f91139c;
    }

    public final int hashCode() {
        return this.f91139c.hashCode() + ((this.f91138b.hashCode() + (this.f91137a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91137a);
        dest.writeString(this.f91138b.name());
        dest.writeString(this.f91139c.name());
    }
}
