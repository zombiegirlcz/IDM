package com.revolut.feature.rev_points.impl.ui.advent.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/rev_points/impl/ui/advent/flow/RevPointsAdventRewardsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsAdventRewardsFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevPointsAdventRewardsFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f83766c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsAdventRewardsFlowContract$InputData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsAdventRewardsFlowContract$InputData[i];
        }
    }

    public RevPointsAdventRewardsFlowContract$InputData(String linkOutId, String wrappedArticleId, String unwrappedArticleId) {
        Intrinsics.checkNotNullParameter(linkOutId, "linkOutId");
        Intrinsics.checkNotNullParameter(wrappedArticleId, "wrappedArticleId");
        Intrinsics.checkNotNullParameter(unwrappedArticleId, "unwrappedArticleId");
        this.f83764a = linkOutId;
        this.f83765b = wrappedArticleId;
        this.f83766c = unwrappedArticleId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsAdventRewardsFlowContract$InputData)) {
            return false;
        }
        RevPointsAdventRewardsFlowContract$InputData revPointsAdventRewardsFlowContract$InputData = (RevPointsAdventRewardsFlowContract$InputData) obj2;
        return Intrinsics.f(this.f83764a, revPointsAdventRewardsFlowContract$InputData.f83764a) && Intrinsics.f(this.f83765b, revPointsAdventRewardsFlowContract$InputData.f83765b) && Intrinsics.f(this.f83766c, revPointsAdventRewardsFlowContract$InputData.f83766c);
    }

    public final int hashCode() {
        return this.f83766c.hashCode() + p.a.c(this.f83764a.hashCode() * 31, 31, this.f83765b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f83764a);
        dest.writeString(this.f83765b);
        dest.writeString(this.f83766c);
    }
}
