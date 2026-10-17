package c2i;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.feature_exchange.impl.R$string;
import g1i.d0;
import g1i.m0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f20806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f20807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wd6.h f20808c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ p(boolean z, t tVar, wd6.h hVar, boolean z3) {
        this.f20806a = z;
        this.f20807b = tVar;
        this.f20808c = hVar;
        this.d = z3;
    }

    @Override // kfm.a
    public final void run() {
        int i;
        t tVar = this.f20807b;
        j jVar = tVar.f20812p;
        xpi.g gVar = tVar.f20814r;
        if (this.f20806a) {
            ((xpi.c) gVar).d0(f0.f322471a);
            return;
        }
        if (((d0) jVar).C3() || (((m0) ((d0) jVar).e).w0().get() instanceof ExchangeFeatureConfig.FreelancerSell)) {
            return;
        }
        i iVar = tVar.o;
        AnalyticsContext analyticsContext = tVar.f96931n;
        ((com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog.b) iVar).getClass();
        wd6.h orderType = this.f20808c;
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        ImageClause imageClause = new ImageClause(this.d ? R$drawable.uikit_icn_16_chevron_up_small : R$drawable.uikit_icn_16_chevron_down_small, Integer.valueOf(R$attr.uikit_colorAccent), (Float) null, (Float) null, 28);
        switch (n.f20803a[orderType.ordinal()]) {
            case 1:
                i = R$string.fx_orders_market_order;
                break;
            case 2:
                i = R$string.fx_orders_limit_order;
                break;
            case 3:
                i = R$string.fx_orders_stop_order;
                break;
            case 4:
                i = R$string.fx_orders_recurring_buy;
                break;
            case 5:
            case 6:
            case 7:
                throw new IllegalStateException("TP/SL not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
        List listK = v.k(imageClause, new TextLocalisedClause(i, null, new Click(30, (Integer) null, (Object) null, "ORDER_TYPE", false), 10));
        m70.a.t(t0.f186434a);
        ((xpi.c) gVar).d0(u.c(new TextNavBarMenuItem("ORDER_TYPE", new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, analyticsContext, 4)));
    }
}
