package bgd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.common.screen.asset_type_chooser.SharedFavouritesAssetTypeChooserScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.ArrayList;
import java.util.List;
import jki.j;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import skm.a2;
import yji.l;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends jki.g implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SharedFavouritesAssetTypeChooserScreenContract$InputData f15178p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ghd.c f15179q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f15180r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a2 f15181s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j f15182t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SharedFavouritesAssetTypeChooserScreenContract$InputData inputData, p stateMapper, ghd.c watchlistDialogFactory, j60.a bottomDialog) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(watchlistDialogFactory, "watchlistDialogFactory");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        this.f15178p = inputData;
        this.f15179q = watchlistDialogFactory;
        this.f15180r = bottomDialog;
        this.f15182t = j.f175191a;
    }

    @Override // yji.l
    public final void I1() {
        SharedFavouritesAssetTypeChooserScreenContract$InputData sharedFavouritesAssetTypeChooserScreenContract$InputData = this.f15178p;
        List list = sharedFavouritesAssetTypeChooserScreenContract$InputData.f86830a;
        List assetTypeKeys = sharedFavouritesAssetTypeChooserScreenContract$InputData.f86830a;
        if (list.size() == 1) {
            v2(new d((FavouritesAssetTypeKey) d0.b0(assetTypeKeys)));
            return;
        }
        ghd.b bVar = ghd.c.Companion;
        ghd.d dVar = (ghd.d) this.f15179q;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(assetTypeKeys, "assetTypeKeys");
        List listE = oc.c.e(null, assetTypeKeys);
        t tVar = new t(new TextLocalisedClause(R$string.shared_watchlist_add_asset_type_title, null, null, 14), null, null, 30);
        List<FavouritesAssetTypeKey> list2 = listE;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (FavouritesAssetTypeKey favouritesAssetTypeKey : list2) {
            String strQ = j6.a.q("ASSET_TYPE_CHOOSER_DIALOG_LIST_ITEM_", favouritesAssetTypeKey.f86866a);
            n3d.d dVar2 = (n3d.d) dVar.f143905a;
            arrayList.add(new RowDelegate.Model(strQ, LayeredImage.Companion.b(LayeredImage.INSTANCE, dVar2.b(favouritesAssetTypeKey), Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 11.0f, null, null, 48), null, null, new TextLocalisedClause(dVar2.c(favouritesAssetTypeKey), null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, null, null, 0, null, false, false, null, null, null, null, null, favouritesAssetTypeKey, null, 0, 0, 0, 0, 1056964588));
        }
        y yVar = new y(arrayList, tVar, null, null, null, null, 1020);
        j60.a aVar = this.f15180r;
        aVar.x(yVar);
        this.f15181s = l.b1(this, rd0.e.b(aVar.E()), null, new g(this, null), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f15182t;
    }
}
