package com.revolut.feature.shared_separate_favourites.multiple_watchlists.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/multiple_watchlists/declaration/WatchlistsSelectorDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WatchlistsSelectorDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<WatchlistsSelectorDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pair f86905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FavouritesAssetTypeKey f86906b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WatchlistsSelectorDestination((FavouritesAssetTypeKey) parcel.readParcelable(WatchlistsSelectorDestination.class.getClassLoader()), (Pair) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WatchlistsSelectorDestination[i];
        }
    }

    public WatchlistsSelectorDestination(FavouritesAssetTypeKey assetTypeKey, Pair assetIdPair) {
        Intrinsics.checkNotNullParameter(assetIdPair, "assetIdPair");
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        this.f86905a = assetIdPair;
        this.f86906b = assetTypeKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WatchlistsSelectorDestination)) {
            return false;
        }
        WatchlistsSelectorDestination watchlistsSelectorDestination = (WatchlistsSelectorDestination) obj2;
        return Intrinsics.f(this.f86905a, watchlistsSelectorDestination.f86905a) && Intrinsics.f(this.f86906b, watchlistsSelectorDestination.f86906b);
    }

    public final int hashCode() {
        return this.f86906b.f86866a.hashCode() + (this.f86905a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f86905a);
        dest.writeParcelable(this.f86906b, i);
    }
}
