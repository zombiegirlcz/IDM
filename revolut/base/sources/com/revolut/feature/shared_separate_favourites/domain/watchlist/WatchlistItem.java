package com.revolut.feature.shared_separate_favourites.domain.watchlist;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.chart.ChartRate;
import cp5.d;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ogd.i;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import xi0.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/domain/watchlist/WatchlistItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WatchlistItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WatchlistItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FavouritesAssetDetails f86898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f86899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f86900c;
    public final BigDecimal d;
    public final DateTime e;
    public final ChartRate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BigDecimal f86901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f86902h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WatchlistItem(FavouritesAssetDetails.CREATOR.createFromParcel(parcel), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (DateTime) parcel.readSerializable(), parcel.readInt() == 0 ? null : ChartRate.CREATOR.createFromParcel(parcel), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WatchlistItem[i];
        }
    }

    public WatchlistItem(FavouritesAssetDetails from, String to6, BigDecimal bigDecimal, BigDecimal bigDecimal2, DateTime addedTime, ChartRate chartRate, BigDecimal bigDecimal3) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "toSymbol");
        Intrinsics.checkNotNullParameter(addedTime, "addedTime");
        this.f86898a = from;
        this.f86899b = to6;
        this.f86900c = bigDecimal;
        this.d = bigDecimal2;
        this.e = addedTime;
        this.f = chartRate;
        this.f86901g = bigDecimal3;
        i.Companion.getClass();
        Intrinsics.checkNotNullParameter(this, "item");
        FavouritesAssetTypeKey key = from.d;
        String from2 = from.f86863a;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(from2, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        b.Companion.getClass();
        this.f86902h = d.d(new Pair(xi0.a.a(from2), xi0.a.a(to6)));
    }

    public static WatchlistItem a(WatchlistItem watchlistItem, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        FavouritesAssetDetails from = watchlistItem.f86898a;
        String toSymbol = watchlistItem.f86899b;
        DateTime addedTime = watchlistItem.e;
        ChartRate chartRate = watchlistItem.f;
        watchlistItem.getClass();
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(toSymbol, "toSymbol");
        Intrinsics.checkNotNullParameter(addedTime, "addedTime");
        return new WatchlistItem(from, toSymbol, bigDecimal, bigDecimal2, addedTime, chartRate, bigDecimal3);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final FavouritesAssetDetails getF86898a() {
        return this.f86898a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF86899b() {
        return this.f86899b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WatchlistItem)) {
            return false;
        }
        WatchlistItem watchlistItem = (WatchlistItem) obj2;
        return Intrinsics.f(this.f86898a, watchlistItem.f86898a) && Intrinsics.f(this.f86899b, watchlistItem.f86899b) && Intrinsics.f(this.f86900c, watchlistItem.f86900c) && Intrinsics.f(this.d, watchlistItem.d) && Intrinsics.f(this.e, watchlistItem.e) && Intrinsics.f(this.f, watchlistItem.f) && Intrinsics.f(this.f86901g, watchlistItem.f86901g);
    }

    public final String getId() {
        i.Companion.getClass();
        Intrinsics.checkNotNullParameter(this, "item");
        FavouritesAssetDetails favouritesAssetDetails = this.f86898a;
        FavouritesAssetTypeKey key = favouritesAssetDetails.d;
        String from = favouritesAssetDetails.f86863a;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(from, "from");
        String to6 = this.f86899b;
        Intrinsics.checkNotNullParameter(to6, "to");
        b.Companion.getClass();
        d.d(new Pair(xi0.a.a(from), xi0.a.a(to6)));
        return com.google.android.gms.internal.mlkit_vision_face.a.p(key.f86866a, "-", from, "-", to6);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f86898a.hashCode() * 31, 31, this.f86899b);
        BigDecimal bigDecimal = this.f86900c;
        int iHashCode = (iC + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.d;
        int iF = m72.b.f(this.e, (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31, 31);
        ChartRate chartRate = this.f;
        int iHashCode2 = (iF + (chartRate == null ? 0 : chartRate.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.f86901g;
        return iHashCode2 + (bigDecimal3 != null ? bigDecimal3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f86898a.writeToParcel(dest, i);
        dest.writeString(this.f86899b);
        dest.writeSerializable(this.f86900c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        ChartRate chartRate = this.f;
        if (chartRate == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            chartRate.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.f86901g);
    }
}
