package com.revolut.feature.shared_separate_favourites.combined_watchlist.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared_separate_favourites/combined_watchlist/flow/CombinedWatchlistHomeFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CombinedWatchlistHomeFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CombinedWatchlistHomeFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CombinedWatchlistContext f86797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f86798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f86799c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CombinedWatchlistHomeFlowContract$InputData((CombinedWatchlistContext) parcel.readParcelable(CombinedWatchlistHomeFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CombinedWatchlistHomeFlowContract$InputData[i];
        }
    }

    public CombinedWatchlistHomeFlowContract$InputData(CombinedWatchlistContext context, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f86797a = context;
        this.f86798b = z;
        this.f86799c = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CombinedWatchlistHomeFlowContract$InputData)) {
            return false;
        }
        CombinedWatchlistHomeFlowContract$InputData combinedWatchlistHomeFlowContract$InputData = (CombinedWatchlistHomeFlowContract$InputData) obj2;
        return Intrinsics.f(this.f86797a, combinedWatchlistHomeFlowContract$InputData.f86797a) && this.f86798b == combinedWatchlistHomeFlowContract$InputData.f86798b && this.f86799c == combinedWatchlistHomeFlowContract$InputData.f86799c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86799c) + j6.a.c(this.f86797a.hashCode() * 31, 31, this.f86798b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f86797a, i);
        dest.writeInt(this.f86798b ? 1 : 0);
        dest.writeInt(this.f86799c ? 1 : 0);
    }
}
