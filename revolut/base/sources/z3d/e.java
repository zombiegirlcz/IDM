package z3d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f319253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f319254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f319255c;
    public final FavouritesAssetTypeKey d;
    public final f e;

    public e(String from, String to6, DateTime addedTime, FavouritesAssetTypeKey assetType, f syncState) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(addedTime, "addedTime");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(syncState, "syncState");
        this.f319253a = from;
        this.f319254b = to6;
        this.f319255c = addedTime;
        this.d = assetType;
        this.e = syncState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f319253a, eVar.f319253a) && Intrinsics.f(this.f319254b, eVar.f319254b) && Intrinsics.f(this.f319255c, eVar.f319255c) && Intrinsics.f(this.d, eVar.d) && this.e == eVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(m72.b.f(this.f319255c, p.a.c(this.f319253a.hashCode() * 31, 31, this.f319254b), 31), 31, this.d.f86866a);
    }
}
