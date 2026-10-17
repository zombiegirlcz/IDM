package com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlowContract$LaunchMode;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared_separate_favourites/watchlist/ui/flow/add_asset/WatchlistAddAssetFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WatchlistAddAssetFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WatchlistAddAssetFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CombinedWatchlistContext f86939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WatchlistAddAssetFlowContract$LaunchMode f86940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f86941c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WatchlistAddAssetFlowContract$InputData((CombinedWatchlistContext) parcel.readParcelable(WatchlistAddAssetFlowContract$InputData.class.getClassLoader()), (WatchlistAddAssetFlowContract$LaunchMode) parcel.readParcelable(WatchlistAddAssetFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WatchlistAddAssetFlowContract$InputData[i];
        }
    }

    public WatchlistAddAssetFlowContract$InputData(CombinedWatchlistContext context, WatchlistAddAssetFlowContract$LaunchMode launchMode, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        this.f86939a = context;
        this.f86940b = launchMode;
        this.f86941c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WatchlistAddAssetFlowContract$InputData)) {
            return false;
        }
        WatchlistAddAssetFlowContract$InputData watchlistAddAssetFlowContract$InputData = (WatchlistAddAssetFlowContract$InputData) obj2;
        return Intrinsics.f(this.f86939a, watchlistAddAssetFlowContract$InputData.f86939a) && Intrinsics.f(this.f86940b, watchlistAddAssetFlowContract$InputData.f86940b) && this.f86941c == watchlistAddAssetFlowContract$InputData.f86941c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86941c) + ((this.f86940b.hashCode() + (this.f86939a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f86939a, i);
        dest.writeParcelable(this.f86940b, i);
        dest.writeInt(this.f86941c ? 1 : 0);
    }

    public /* synthetic */ WatchlistAddAssetFlowContract$InputData(CombinedWatchlistContext combinedWatchlistContext, WatchlistAddAssetFlowContract$LaunchMode watchlistAddAssetFlowContract$LaunchMode, int i) {
        this(combinedWatchlistContext, (i & 2) != 0 ? WatchlistAddAssetFlowContract$LaunchMode.DefaultWatchlistSelection.f86942a : watchlistAddAssetFlowContract$LaunchMode, (i & 4) == 0);
    }
}
