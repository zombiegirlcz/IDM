package com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/shared_separate_favourites/watchlist/ui/flow/add_asset/WatchlistAddAssetFlowContract$Step", "Lcom/revolut/kompot/navigable/vc/pager/FixedIdPagerItem;", "<init>", "()V", "Loading", "Loaded", "Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/flow/add_asset/WatchlistAddAssetFlowContract$Step$Loaded;", "Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/flow/add_asset/WatchlistAddAssetFlowContract$Step$Loading;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WatchlistAddAssetFlowContract$Step implements FixedIdPagerItem {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/flow/add_asset/WatchlistAddAssetFlowContract$Step$Loaded;", "Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/flow/add_asset/WatchlistAddAssetFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Loaded extends WatchlistAddAssetFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Loaded> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FavouritesAssetTypeKey f86945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86946b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Loaded((FavouritesAssetTypeKey) parcel.readParcelable(Loaded.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Loaded[i];
            }
        }

        public Loaded(FavouritesAssetTypeKey key, String id10) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f86945a = key;
            this.f86946b = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj2;
            return Intrinsics.f(this.f86945a, loaded.f86945a) && Intrinsics.f(this.f86946b, loaded.f86946b);
        }

        @Override // com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem, com.revolut.kompot.navigable.vc.pager.PagerItem
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF86946b() {
            return this.f86946b;
        }

        public final int hashCode() {
            return this.f86946b.hashCode() + (this.f86945a.f86866a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f86945a, i);
            dest.writeString(this.f86946b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/flow/add_asset/WatchlistAddAssetFlowContract$Step$Loading;", "Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/flow/add_asset/WatchlistAddAssetFlowContract$Step;", "<init>", "()V", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Loading extends WatchlistAddAssetFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Loading f86947a = new Loading();

        @NotNull
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Loading.f86947a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Loading[i];
            }
        }

        private Loading() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private WatchlistAddAssetFlowContract$Step() {
    }
}
