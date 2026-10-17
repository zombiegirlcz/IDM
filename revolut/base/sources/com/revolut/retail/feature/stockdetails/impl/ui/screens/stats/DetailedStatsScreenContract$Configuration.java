package com.revolut.retail.feature.stockdetails.impl.ui.screens.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.StatsScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/screens/stats/DetailedStatsScreenContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DetailedStatsScreenContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DetailedStatsScreenContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatsScreen f104045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f104046b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DetailedStatsScreenContract$Configuration((StatsScreen) parcel.readParcelable(DetailedStatsScreenContract$Configuration.class.getClassLoader()), (n) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DetailedStatsScreenContract$Configuration[i];
        }
    }

    public DetailedStatsScreenContract$Configuration(StatsScreen screen, n instrument) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f104045a = screen;
        this.f104046b = instrument;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DetailedStatsScreenContract$Configuration)) {
            return false;
        }
        DetailedStatsScreenContract$Configuration detailedStatsScreenContract$Configuration = (DetailedStatsScreenContract$Configuration) obj2;
        return Intrinsics.f(this.f104045a, detailedStatsScreenContract$Configuration.f104045a) && Intrinsics.f(this.f104046b, detailedStatsScreenContract$Configuration.f104046b);
    }

    public final int hashCode() {
        return this.f104046b.hashCode() + (this.f104045a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f104045a, i);
        dest.writeSerializable(this.f104046b);
    }
}
