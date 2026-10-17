package com.revolut.feature.shared_separate_favourites.domain.combined_watchlist;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/domain/combined_watchlist/CombinedWatchlistContext;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CombinedWatchlistContext implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CombinedWatchlistContext> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f86890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f86891c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(FavouritesAssetTypeKey.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i3);
            for (int i5 = 0; i5 != i3; i5++) {
                linkedHashSet2.add(FavouritesAssetTypeKey.CREATOR.createFromParcel(parcel));
            }
            return new CombinedWatchlistContext(string, linkedHashSet, linkedHashSet2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CombinedWatchlistContext[i];
        }
    }

    public CombinedWatchlistContext(String orderingKey, Set watchlistAssetTypeKeys, Set alertsAssetTypeKeys) {
        Intrinsics.checkNotNullParameter(orderingKey, "orderingKey");
        Intrinsics.checkNotNullParameter(watchlistAssetTypeKeys, "watchlistAssetTypeKeys");
        Intrinsics.checkNotNullParameter(alertsAssetTypeKeys, "alertsAssetTypeKeys");
        this.f86889a = orderingKey;
        this.f86890b = watchlistAssetTypeKeys;
        this.f86891c = alertsAssetTypeKeys;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CombinedWatchlistContext)) {
            return false;
        }
        CombinedWatchlistContext combinedWatchlistContext = (CombinedWatchlistContext) obj2;
        return Intrinsics.f(this.f86889a, combinedWatchlistContext.f86889a) && Intrinsics.f(this.f86890b, combinedWatchlistContext.f86890b) && Intrinsics.f(this.f86891c, combinedWatchlistContext.f86891c);
    }

    public final int hashCode() {
        return this.f86891c.hashCode() + p.a.f(this.f86889a.hashCode() * 31, 31, this.f86890b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86889a);
        Iterator itV = n.v(this.f86890b, dest);
        while (itV.hasNext()) {
            ((FavouritesAssetTypeKey) itV.next()).writeToParcel(dest, i);
        }
        Iterator itV2 = n.v(this.f86891c, dest);
        while (itV2.hasNext()) {
            ((FavouritesAssetTypeKey) itV2.next()).writeToParcel(dest, i);
        }
    }
}
