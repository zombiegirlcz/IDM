package com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared_separate_favourites/multiple_watchlists/ui/screen/watchlists_selector/WatchlistsSelectorScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WatchlistsSelectorScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WatchlistsSelectorScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pair f86931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FavouritesAssetTypeKey f86932b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WatchlistsSelectorScreenContract$InputData((FavouritesAssetTypeKey) parcel.readParcelable(WatchlistsSelectorScreenContract$InputData.class.getClassLoader()), (Pair) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WatchlistsSelectorScreenContract$InputData[i];
        }
    }

    public WatchlistsSelectorScreenContract$InputData(FavouritesAssetTypeKey assetTypeKey, Pair assetIdPair) {
        Intrinsics.checkNotNullParameter(assetIdPair, "assetIdPair");
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        this.f86931a = assetIdPair;
        this.f86932b = assetTypeKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WatchlistsSelectorScreenContract$InputData)) {
            return false;
        }
        WatchlistsSelectorScreenContract$InputData watchlistsSelectorScreenContract$InputData = (WatchlistsSelectorScreenContract$InputData) obj2;
        return Intrinsics.f(this.f86931a, watchlistsSelectorScreenContract$InputData.f86931a) && Intrinsics.f(this.f86932b, watchlistsSelectorScreenContract$InputData.f86932b);
    }

    public final int hashCode() {
        return this.f86932b.f86866a.hashCode() + (this.f86931a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f86931a);
        dest.writeParcelable(this.f86932b, i);
    }
}
