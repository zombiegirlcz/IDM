package com.revolut.feature.shared_separate_favourites.domain.watchlist;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/domain/watchlist/Watchlist;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Watchlist implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Watchlist> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f86896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f86897c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(WatchlistItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new Watchlist(arrayList, z, string, string2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Watchlist[i];
        }
    }

    public Watchlist(List items, boolean z, String id10, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f86895a = id10;
        this.f86896b = name;
        this.f86897c = z;
        this.d = items;
    }

    public static Watchlist a(Watchlist watchlist, List items) {
        String id10 = watchlist.f86895a;
        String name = watchlist.f86896b;
        boolean z = watchlist.f86897c;
        watchlist.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(items, "items");
        return new Watchlist(items, z, id10, name);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Watchlist)) {
            return false;
        }
        Watchlist watchlist = (Watchlist) obj2;
        return Intrinsics.f(this.f86895a, watchlist.f86895a) && Intrinsics.f(this.f86896b, watchlist.f86896b) && this.f86897c == watchlist.f86897c && Intrinsics.f(this.d, watchlist.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(p.a.c(this.f86895a.hashCode() * 31, 31, this.f86896b), 31, this.f86897c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86895a);
        dest.writeString(this.f86896b);
        dest.writeInt(this.f86897c ? 1 : 0);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            ((WatchlistItem) itV.next()).writeToParcel(dest, i);
        }
    }
}
