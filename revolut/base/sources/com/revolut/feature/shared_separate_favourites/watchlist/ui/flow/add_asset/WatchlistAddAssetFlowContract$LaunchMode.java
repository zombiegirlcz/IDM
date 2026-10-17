package com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/shared_separate_favourites/watchlist/ui/flow/add_asset/WatchlistAddAssetFlowContract$LaunchMode", "Landroid/os/Parcelable;", "SingleSelection", "DefaultWatchlistSelection", "WatchlistSelection", "Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/flow/add_asset/WatchlistAddAssetFlowContract$LaunchMode$DefaultWatchlistSelection;", "Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/flow/add_asset/WatchlistAddAssetFlowContract$LaunchMode$SingleSelection;", "Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/flow/add_asset/WatchlistAddAssetFlowContract$LaunchMode$WatchlistSelection;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WatchlistAddAssetFlowContract$LaunchMode extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/flow/add_asset/WatchlistAddAssetFlowContract$LaunchMode$DefaultWatchlistSelection;", "Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/flow/add_asset/WatchlistAddAssetFlowContract$LaunchMode;", "<init>", "()V", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultWatchlistSelection implements WatchlistAddAssetFlowContract$LaunchMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DefaultWatchlistSelection f86942a = new DefaultWatchlistSelection();

        @NotNull
        public static final Parcelable.Creator<DefaultWatchlistSelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DefaultWatchlistSelection.f86942a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DefaultWatchlistSelection[i];
            }
        }

        private DefaultWatchlistSelection() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/flow/add_asset/WatchlistAddAssetFlowContract$LaunchMode$SingleSelection;", "Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/flow/add_asset/WatchlistAddAssetFlowContract$LaunchMode;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SingleSelection implements WatchlistAddAssetFlowContract$LaunchMode {

        @NotNull
        public static final Parcelable.Creator<SingleSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86943a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SingleSelection(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SingleSelection[i];
            }
        }

        public SingleSelection(String str) {
            this.f86943a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SingleSelection) && Intrinsics.f(this.f86943a, ((SingleSelection) obj2).f86943a);
        }

        public final int hashCode() {
            String str = this.f86943a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86943a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/flow/add_asset/WatchlistAddAssetFlowContract$LaunchMode$WatchlistSelection;", "Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/flow/add_asset/WatchlistAddAssetFlowContract$LaunchMode;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WatchlistSelection implements WatchlistAddAssetFlowContract$LaunchMode {

        @NotNull
        public static final Parcelable.Creator<WatchlistSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86944a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WatchlistSelection(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WatchlistSelection[i];
            }
        }

        public WatchlistSelection(String watchlistId) {
            Intrinsics.checkNotNullParameter(watchlistId, "watchlistId");
            this.f86944a = watchlistId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WatchlistSelection) && Intrinsics.f(this.f86944a, ((WatchlistSelection) obj2).f86944a);
        }

        public final int hashCode() {
            return this.f86944a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86944a);
        }
    }
}
