package com.revolut.feature.trade_rev_points.impl.ui.screen.unlinking;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u2f.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trade_rev_points/impl/ui/screen/unlinking/TradeRevPointsAccountUnlinkingScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TradeRevPointsAccountUnlinkingScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TradeRevPointsAccountUnlinkingScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f91178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91180c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TradeRevPointsAccountUnlinkingScreenContract$InputData(parcel.readString(), parcel.readString(), j.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TradeRevPointsAccountUnlinkingScreenContract$InputData[i];
        }
    }

    public TradeRevPointsAccountUnlinkingScreenContract$InputData(String agentId, String name, j product) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f91178a = product;
        this.f91179b = agentId;
        this.f91180c = name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TradeRevPointsAccountUnlinkingScreenContract$InputData)) {
            return false;
        }
        TradeRevPointsAccountUnlinkingScreenContract$InputData tradeRevPointsAccountUnlinkingScreenContract$InputData = (TradeRevPointsAccountUnlinkingScreenContract$InputData) obj2;
        return this.f91178a == tradeRevPointsAccountUnlinkingScreenContract$InputData.f91178a && Intrinsics.f(this.f91179b, tradeRevPointsAccountUnlinkingScreenContract$InputData.f91179b) && Intrinsics.f(this.f91180c, tradeRevPointsAccountUnlinkingScreenContract$InputData.f91180c);
    }

    public final int hashCode() {
        return this.f91180c.hashCode() + p.a.c(this.f91178a.hashCode() * 31, 31, this.f91179b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91178a.name());
        dest.writeString(this.f91179b);
        dest.writeString(this.f91180c);
    }
}
