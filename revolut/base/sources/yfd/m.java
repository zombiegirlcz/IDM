package yfd;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset.SharedFavouritesAddAssetScreenContract$AssetSelectionInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f313218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f313219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedFavouritesAddAssetScreenContract$AssetSelectionInfo f313220c;
    public final String d;
    public final boolean e;
    public final List f;

    public m(Data watchlistAssetPairs, List selectedFavouritesItems, SharedFavouritesAddAssetScreenContract$AssetSelectionInfo sharedFavouritesAddAssetScreenContract$AssetSelectionInfo, String searchInput, boolean z, List footer) {
        Intrinsics.checkNotNullParameter(watchlistAssetPairs, "watchlistAssetPairs");
        Intrinsics.checkNotNullParameter(selectedFavouritesItems, "selectedFavouritesItems");
        Intrinsics.checkNotNullParameter(searchInput, "searchInput");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f313218a = watchlistAssetPairs;
        this.f313219b = selectedFavouritesItems;
        this.f313220c = sharedFavouritesAddAssetScreenContract$AssetSelectionInfo;
        this.d = searchInput;
        this.e = z;
        this.f = footer;
    }

    public static m a(m mVar, Data data, List list, String str, boolean z, List list2, int i) {
        if ((i & 1) != 0) {
            data = mVar.f313218a;
        }
        Data watchlistAssetPairs = data;
        if ((i & 2) != 0) {
            list = mVar.f313219b;
        }
        List selectedFavouritesItems = list;
        SharedFavouritesAddAssetScreenContract$AssetSelectionInfo sharedFavouritesAddAssetScreenContract$AssetSelectionInfo = mVar.f313220c;
        if ((i & 8) != 0) {
            str = mVar.d;
        }
        String searchInput = str;
        if ((i & 16) != 0) {
            z = mVar.e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            list2 = mVar.f;
        }
        List footer = list2;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(watchlistAssetPairs, "watchlistAssetPairs");
        Intrinsics.checkNotNullParameter(selectedFavouritesItems, "selectedFavouritesItems");
        Intrinsics.checkNotNullParameter(searchInput, "searchInput");
        Intrinsics.checkNotNullParameter(footer, "footer");
        return new m(watchlistAssetPairs, selectedFavouritesItems, sharedFavouritesAddAssetScreenContract$AssetSelectionInfo, searchInput, z3, footer);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f313218a, mVar.f313218a) && Intrinsics.f(this.f313219b, mVar.f313219b) && Intrinsics.f(this.f313220c, mVar.f313220c) && Intrinsics.f(this.d, mVar.d) && this.e == mVar.e && Intrinsics.f(this.f, mVar.f);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f313218a.hashCode() * 31, 31, this.f313219b);
        SharedFavouritesAddAssetScreenContract$AssetSelectionInfo sharedFavouritesAddAssetScreenContract$AssetSelectionInfo = this.f313220c;
        return this.f.hashCode() + j6.a.c(p.a.c((iD + (sharedFavouritesAddAssetScreenContract$AssetSelectionInfo == null ? 0 : sharedFavouritesAddAssetScreenContract$AssetSelectionInfo.hashCode())) * 31, 31, this.d), 31, this.e);
    }
}
