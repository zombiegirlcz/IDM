package m9h;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cryptocommodity_invest.api.CryptoInvestFeatureConfig;
import com.revolut.feature.trading.api.declaration.CollectionFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import k5e.k;
import k9h.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import la8.j;
import nel.n;
import pfm.h;
import rp0.t;
import rp0.y;
import vkm.d;
import x8h.g;
import xzg.o;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends k0h.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f203784l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j60.a f203785m;

    public b(e presentationModel, j60.a bottomExpandableDialogControllerExtension) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        this.f203784l = presentationModel;
        this.f203785m = bottomExpandableDialogControllerExtension;
    }

    @Override // k0h.a
    public final h Z2() {
        h hVar = new h(new i1i.a(this, 13), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // k0h.a
    public final d b3(String collection, o collectionsAssetType) {
        Intrinsics.checkNotNullParameter(collection, "key");
        Intrinsics.checkNotNullParameter(collectionsAssetType, "assetType");
        e eVar = this.f203784l;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(collectionsAssetType, "assetType");
        g gVar = eVar.f182338a;
        List collections = u.c(collection);
        Intrinsics.checkNotNullParameter(collections, "collections");
        Intrinsics.checkNotNullParameter(collectionsAssetType, "collectionsAssetType");
        return rd0.e.b(pd.b.r(nim.a.w(gVar.f303339a.a(collections, collectionsAssetType), new k9h.d(0)), new k(eVar, 15)));
    }

    @Override // k0h.a
    public final h c3(xzg.d collection) {
        FeatureConfig collectionFeatureConfig;
        Intrinsics.checkNotNullParameter(collection, "collection");
        o oVar = collection.f309977b;
        String str = collection.f309976a;
        int i = a.f203783a[oVar.ordinal()];
        if (i == 1) {
            collectionFeatureConfig = new CollectionFeatureConfig(str);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            collectionFeatureConfig = new CryptoInvestFeatureConfig.CollectionDetails(str);
        }
        h hVar = new h(new j(this, new FeatureCommand(collectionFeatureConfig), 8), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // k0h.a
    public final h d3(n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        h hVar = new h(new j(this, new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new AssetDetailsDestination(instrument.f214596b, null, false, null, null, null, 54), false, (Integer) null, 0, 61)), 8), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // k0h.a
    public final efm.b e3() {
        t tVar = new t(new TextLocalisedClause(R$string.wealth_trading_widget_collections_info_dialog_header, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_widget_collections_info_dialog_description, null, null, 14), null, 28);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("COLLECTIONS_INFO_DIALOG_ACTION_BUTTON", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, 0, R$attr.uikit_dp16, 0, 0, 13);
        return this.f203785m.G(new y(u.c(model), tVar, null, null, null, null, 1020));
    }
}
