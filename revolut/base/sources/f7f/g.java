package f7f;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.portfolio_actions.models.ManagedPortfolioDetailsActionParcel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements n {
    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<alc.d> list = domainState.f132603a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (alc.d dVar : list) {
            elc.a aVarA = boc.b.a(dVar);
            arrayList.add(new RowDelegate.Model(j6.a.q("action_item_", dVar.name()), new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.j(aVarA.f127285a, new Color.Solid(R$attr.uikit_colorAccent), new Color.Solid(R$attr.uikit_colorAccent_10)), null, null, false, null, false, 62), new TextLocalisedClause(aVarA.f127286b, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new ManagedPortfolioDetailsActionParcel(dVar), null, 0, 0, 0, 0, 532676600));
        }
        int i = R$attr.uikit_dp24;
        yp0.b.k(arrayList, i, i, 0, 0, 28);
        return new e(arrayList);
    }
}
