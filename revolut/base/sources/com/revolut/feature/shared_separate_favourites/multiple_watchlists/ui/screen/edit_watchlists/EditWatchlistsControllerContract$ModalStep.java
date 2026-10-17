package com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.Watchlist;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/shared_separate_favourites/multiple_watchlists/ui/screen/edit_watchlists/EditWatchlistsControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ConfirmWatchlistRemoval", "RenameWatchlist", "AddNewWatchlist", "Lcom/revolut/feature/shared_separate_favourites/multiple_watchlists/ui/screen/edit_watchlists/EditWatchlistsControllerContract$ModalStep$AddNewWatchlist;", "Lcom/revolut/feature/shared_separate_favourites/multiple_watchlists/ui/screen/edit_watchlists/EditWatchlistsControllerContract$ModalStep$ConfirmWatchlistRemoval;", "Lcom/revolut/feature/shared_separate_favourites/multiple_watchlists/ui/screen/edit_watchlists/EditWatchlistsControllerContract$ModalStep$RenameWatchlist;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EditWatchlistsControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/multiple_watchlists/ui/screen/edit_watchlists/EditWatchlistsControllerContract$ModalStep$AddNewWatchlist;", "Lcom/revolut/feature/shared_separate_favourites/multiple_watchlists/ui/screen/edit_watchlists/EditWatchlistsControllerContract$ModalStep;", "<init>", "()V", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddNewWatchlist implements EditWatchlistsControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddNewWatchlist f86921a = new AddNewWatchlist();

        @NotNull
        public static final Parcelable.Creator<AddNewWatchlist> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddNewWatchlist.f86921a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddNewWatchlist[i];
            }
        }

        private AddNewWatchlist() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/multiple_watchlists/ui/screen/edit_watchlists/EditWatchlistsControllerContract$ModalStep$ConfirmWatchlistRemoval;", "Lcom/revolut/feature/shared_separate_favourites/multiple_watchlists/ui/screen/edit_watchlists/EditWatchlistsControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmWatchlistRemoval implements EditWatchlistsControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ConfirmWatchlistRemoval> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Watchlist f86922a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConfirmWatchlistRemoval((Watchlist) parcel.readParcelable(ConfirmWatchlistRemoval.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmWatchlistRemoval[i];
            }
        }

        public ConfirmWatchlistRemoval(Watchlist watchlist) {
            Intrinsics.checkNotNullParameter(watchlist, "watchlist");
            this.f86922a = watchlist;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ConfirmWatchlistRemoval) && Intrinsics.f(this.f86922a, ((ConfirmWatchlistRemoval) obj2).f86922a);
        }

        public final int hashCode() {
            return this.f86922a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f86922a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/multiple_watchlists/ui/screen/edit_watchlists/EditWatchlistsControllerContract$ModalStep$RenameWatchlist;", "Lcom/revolut/feature/shared_separate_favourites/multiple_watchlists/ui/screen/edit_watchlists/EditWatchlistsControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RenameWatchlist implements EditWatchlistsControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RenameWatchlist> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Watchlist f86923a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RenameWatchlist((Watchlist) parcel.readParcelable(RenameWatchlist.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RenameWatchlist[i];
            }
        }

        public RenameWatchlist(Watchlist watchlist) {
            Intrinsics.checkNotNullParameter(watchlist, "watchlist");
            this.f86923a = watchlist;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RenameWatchlist) && Intrinsics.f(this.f86923a, ((RenameWatchlist) obj2).f86923a);
        }

        public final int hashCode() {
            return this.f86923a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f86923a, i);
        }
    }
}
