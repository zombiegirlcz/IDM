package com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/shared_separate_favourites/watchlist/ui/screen/watchlist/WatchlistHomeScreenContract$InputData", "Landroid/os/Parcelable;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WatchlistHomeScreenContract$InputData implements Parcelable, IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WatchlistHomeScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CombinedWatchlistContext f86973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f86974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f86975c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WatchlistHomeScreenContract$InputData((CombinedWatchlistContext) parcel.readParcelable(WatchlistHomeScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WatchlistHomeScreenContract$InputData[i];
        }
    }

    public WatchlistHomeScreenContract$InputData(CombinedWatchlistContext context, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f86973a = context;
        this.f86974b = z;
        this.f86975c = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WatchlistHomeScreenContract$InputData)) {
            return false;
        }
        WatchlistHomeScreenContract$InputData watchlistHomeScreenContract$InputData = (WatchlistHomeScreenContract$InputData) obj2;
        return Intrinsics.f(this.f86973a, watchlistHomeScreenContract$InputData.f86973a) && this.f86974b == watchlistHomeScreenContract$InputData.f86974b && this.f86975c == watchlistHomeScreenContract$InputData.f86975c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86975c) + j6.a.c(this.f86973a.hashCode() * 31, 31, this.f86974b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f86973a, i);
        dest.writeInt(this.f86974b ? 1 : 0);
        dest.writeInt(this.f86975c ? 1 : 0);
    }
}
