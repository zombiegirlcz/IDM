package q7j;

import cli.j;
import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.commodity.order_flow.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kp0.m;
import lk7.p;
import o7j.s;
import o7j.w;
import wd6.h;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f242867a;

    public g(c inputMapper) {
        Intrinsics.checkNotNullParameter(inputMapper, "inputMapper");
        this.f242867a = inputMapper;
    }

    public static TextLocalisedClause a(wd6.e eVar, int i, int i2) {
        int i3 = f.f242866b[eVar.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = i2;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClauseA;
        o7j.j domainState = (o7j.j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        h hVar = domainState.f222864b;
        Data data = domainState.f222866g;
        Data data2 = domainState.f;
        wd6.e eVar = domainState.e;
        switch (f.f242865a[hVar.ordinal()]) {
            case 1:
                textLocalisedClauseA = a(eVar, R$string.wealth_commodities_order_flow_limit_screen_title_buy, R$string.wealth_commodities_order_flow_limit_screen_title_sell);
                break;
            case 2:
                textLocalisedClauseA = a(eVar, R$string.wealth_commodities_order_flow_stop_screen_title_buy, R$string.wealth_commodities_order_flow_stop_screen_title_sell);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                throw new IllegalStateException("Order settings are not supported for order type = " + domainState.f222864b);
            default:
                throw new NoWhenBranchMatchedException();
        }
        List listC = u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "INFO", new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, 124));
        return new w((o7j.u) iii.c.f(data2, new q75.n(17), new m(textLocalisedClauseA, listC, 29), new p(textLocalisedClauseA, 21, domainState, listC)), (List) iii.c.f(t1.t(data2, data), new q75.n(this, 18), new q34.a(23), new ox2.d(domainState, this, 29)), new s(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), ((Boolean) iii.c.f(data, new q75.n(16), new q34.a(22), new p40.n(this, domainState, 28))).booleanValue()));
    }
}
