package com.revolut.feature.rev_points.giftcards.impl.ui.flow.home;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.giftcards.api.R$string;
import com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.RevPointsGiftcardsHomePagerFlowContract$PagerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import psl.m;
import pv7.t;
import pwb.f;
import pwb.i;
import pwb.l;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements n {
    @Override // cli.n
    public final o c(j jVar) {
        String str;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        i iVar = new i((List) iii.c.f(domainState.f240380c, new pui.a(23), new m(29), new t(this, 2)));
        pwb.j jVar2 = new pwb.j(v.k(new FloatingBottomBarView.Item("HOME_TABS_DISCOVER_ID", new TextLocalisedClause(R$string.gift_cards_home_tabs_discover, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_gift_legacy, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, 24), new FloatingBottomBarView.Item("HOME_TABS_MY_CARDS_ID", new TextLocalisedClause(R$string.gift_cards_home_tabs_my_cards, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_wallet, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, 24)));
        String str2 = domainState.f240379b;
        if (Intrinsics.f(str2, RevPointsGiftcardsHomePagerFlowContract$PagerItem.MyCards.f83676a.getF94249a())) {
            str = "HOME_TABS_MY_CARDS_ID";
        } else {
            Intrinsics.f(str2, new RevPointsGiftcardsHomePagerFlowContract$PagerItem.Discover(false).getF94249a());
            str = "HOME_TABS_DISCOVER_ID";
        }
        return new l(iVar, jVar2, str);
    }
}
