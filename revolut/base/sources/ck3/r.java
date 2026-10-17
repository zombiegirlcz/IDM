package ck3;

import aw0.n6;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.commodities.onboarding.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class r implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f24777a;

    public r(o itemsMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        this.f24777a = itemsMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f24760a, new cjj.j(4), new ccg.a(26), new cab.m(this, domainState, 4));
        Data data = domainState.f24760a;
        boolean z = data.getContent() != null;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.commodities_onboarding_title, null, null, 14);
        z0h.c cVar = (z0h.c) data.getContent();
        z0h.b bVar = cVar != null ? cVar.f318484a : null;
        if (bVar == null) {
            textLocalisedClause = null;
        } else {
            int i = q.f24776a[bVar.ordinal()];
            textLocalisedClause = new TextLocalisedClause(i != 1 ? (i == 2 || i == 3) ? R$string.commodities_onboarding_rl_subtitle : R$string.commodities_onboarding_subtitle : R$string.commodities_onboarding_jp_subtitle, null, null, 14);
        }
        return new i(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.commodities_onboarding_accept, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "ACCEPT_BUTTON_TAG", z, null, null, 972), new aw0.d(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), null, 39), textLocalisedClause2, textLocalisedClause, list);
    }
}
