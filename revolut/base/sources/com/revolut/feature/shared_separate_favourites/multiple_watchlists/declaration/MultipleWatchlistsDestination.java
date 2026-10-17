package com.revolut.feature.shared_separate_favourites.multiple_watchlists.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/multiple_watchlists/declaration/MultipleWatchlistsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultipleWatchlistsDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<MultipleWatchlistsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CombinedWatchlistContext f86903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f86904b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MultipleWatchlistsDestination((CombinedWatchlistContext) parcel.readParcelable(MultipleWatchlistsDestination.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MultipleWatchlistsDestination[i];
        }
    }

    public MultipleWatchlistsDestination(CombinedWatchlistContext context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f86903a = context;
        this.f86904b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MultipleWatchlistsDestination)) {
            return false;
        }
        MultipleWatchlistsDestination multipleWatchlistsDestination = (MultipleWatchlistsDestination) obj2;
        return Intrinsics.f(this.f86903a, multipleWatchlistsDestination.f86903a) && Intrinsics.f(this.f86904b, multipleWatchlistsDestination.f86904b);
    }

    public final int hashCode() {
        int iHashCode = this.f86903a.hashCode() * 31;
        String str = this.f86904b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f86903a, i);
        dest.writeString(this.f86904b);
    }
}
