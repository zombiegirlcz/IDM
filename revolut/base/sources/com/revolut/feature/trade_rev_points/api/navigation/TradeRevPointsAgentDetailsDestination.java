package com.revolut.feature.trade_rev_points.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1c.e0;
import org.jetbrains.annotations.NotNull;
import u2f.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/api/navigation/TradeRevPointsAgentDetailsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_trade_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TradeRevPointsAgentDetailsDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<TradeRevPointsAgentDetailsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f91108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f91109c;
    public final TransitionAnimation d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TradeRevPointsAgentDetailsDestination(parcel.readString(), j.valueOf(parcel.readString()), e0.valueOf(parcel.readString()), (TransitionAnimation) parcel.readParcelable(TradeRevPointsAgentDetailsDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TradeRevPointsAgentDetailsDestination[i];
        }
    }

    public TradeRevPointsAgentDetailsDestination(String agentId, j product, e0 revPointsBottomSheetContext, TransitionAnimation transitionAnimation) {
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(revPointsBottomSheetContext, "revPointsBottomSheetContext");
        this.f91107a = agentId;
        this.f91108b = product;
        this.f91109c = revPointsBottomSheetContext;
        this.d = transitionAnimation;
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final TransitionAnimation getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TradeRevPointsAgentDetailsDestination)) {
            return false;
        }
        TradeRevPointsAgentDetailsDestination tradeRevPointsAgentDetailsDestination = (TradeRevPointsAgentDetailsDestination) obj2;
        return Intrinsics.f(this.f91107a, tradeRevPointsAgentDetailsDestination.f91107a) && this.f91108b == tradeRevPointsAgentDetailsDestination.f91108b && this.f91109c == tradeRevPointsAgentDetailsDestination.f91109c && Intrinsics.f(this.d, tradeRevPointsAgentDetailsDestination.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f91109c.hashCode() + ((this.f91108b.hashCode() + (this.f91107a.hashCode() * 31)) * 31)) * 31;
        TransitionAnimation transitionAnimation = this.d;
        return iHashCode + (transitionAnimation == null ? 0 : transitionAnimation.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91107a);
        dest.writeString(this.f91108b.name());
        dest.writeString(this.f91109c.name());
        dest.writeParcelable(this.d, i);
    }
}
