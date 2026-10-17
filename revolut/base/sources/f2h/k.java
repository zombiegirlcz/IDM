package f2h;

import aw0.n6;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.feature.wealth.asset.selection.impl.ui.flow.AssetSelectionFlowControllerContract$DomainState;
import com.revolut.feature.wealth.asset.selection.impl.ui.flow.AssetSelectionFlowControllerContract$Page;
import com.revolut.retail.wealth.resources.R$string;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        int i;
        AssetSelectionFlowControllerContract$DomainState domainState = (AssetSelectionFlowControllerContract$DomainState) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Clause textLocalisedClause = domainState.f95386a;
        if (textLocalisedClause == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_stocks_search, null, null, 14);
        }
        lw0.a aVar = new lw0.a(textLocalisedClause, null, null, null, false, 30);
        ArrayList<AssetSelectionFlowControllerContract$Page> arrayList = domainState.e;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (AssetSelectionFlowControllerContract$Page assetSelectionFlowControllerContract$Page : arrayList) {
            if (assetSelectionFlowControllerContract$Page instanceof AssetSelectionFlowControllerContract$Page.Cash) {
                i = R$string.wealth_asset_selection_category_cash_pockets;
            } else if (assetSelectionFlowControllerContract$Page instanceof AssetSelectionFlowControllerContract$Page.Stock) {
                i = R$string.wealth_asset_selection_category_stocks;
            } else if (assetSelectionFlowControllerContract$Page instanceof AssetSelectionFlowControllerContract$Page.Etp) {
                i = R$string.wealth_asset_selection_category_etfs;
            } else if (assetSelectionFlowControllerContract$Page instanceof AssetSelectionFlowControllerContract$Page.Bond) {
                i = R$string.wealth_asset_selection_category_bonds;
            } else {
                if (!(assetSelectionFlowControllerContract$Page instanceof AssetSelectionFlowControllerContract$Page.Cfd)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.wealth_asset_selection_category_cfds;
            }
            arrayList2.add(new q(assetSelectionFlowControllerContract$Page.getF94249a(), new t(new TextLocalisedClause(i, null, null, 14)), 58));
        }
        return new f(aVar, arrayList2, domainState.d, domainState.f95387b ? new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.wealth_action_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55) : null);
    }
}
