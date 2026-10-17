package com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared_separate_favourites/multiple_watchlists/ui/flow/MultipleWatchlistsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultipleWatchlistsFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<MultipleWatchlistsFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CombinedWatchlistContext f86907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f86908b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MultipleWatchlistsFlowContract$InputData((CombinedWatchlistContext) parcel.readParcelable(MultipleWatchlistsFlowContract$InputData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MultipleWatchlistsFlowContract$InputData[i];
        }
    }

    public MultipleWatchlistsFlowContract$InputData(CombinedWatchlistContext watchlistContext, String str) {
        Intrinsics.checkNotNullParameter(watchlistContext, "watchlistContext");
        this.f86907a = watchlistContext;
        this.f86908b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MultipleWatchlistsFlowContract$InputData)) {
            return false;
        }
        MultipleWatchlistsFlowContract$InputData multipleWatchlistsFlowContract$InputData = (MultipleWatchlistsFlowContract$InputData) obj2;
        return Intrinsics.f(this.f86907a, multipleWatchlistsFlowContract$InputData.f86907a) && Intrinsics.f(this.f86908b, multipleWatchlistsFlowContract$InputData.f86908b);
    }

    public final int hashCode() {
        int iHashCode = this.f86907a.hashCode() * 31;
        String str = this.f86908b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f86907a, i);
        dest.writeString(this.f86908b);
    }
}
