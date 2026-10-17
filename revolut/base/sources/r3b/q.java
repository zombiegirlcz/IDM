package r3b;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.cfd.impl.R$string;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.d7;
import org.jetbrains.annotations.NotNull;
import q87.z;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t3b.a f251259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t3b.f f251260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fsl.k f251261c;
    public final t3b.l d;
    public final d1h.h e;
    public final t5d.d f;

    public q(t3b.a cfdHomeHeaderMapper, t3b.f cfdPositionsMapper, fsl.k ordersMapper, t3b.l maintenanceMarginWidgetInHomeScreenMapper, d1h.h disclaimerMapper, t5d.d swipeAssetTradeActionsMapper) {
        Intrinsics.checkNotNullParameter(cfdHomeHeaderMapper, "cfdHomeHeaderMapper");
        Intrinsics.checkNotNullParameter(cfdPositionsMapper, "cfdPositionsMapper");
        Intrinsics.checkNotNullParameter(ordersMapper, "ordersMapper");
        Intrinsics.checkNotNullParameter(maintenanceMarginWidgetInHomeScreenMapper, "maintenanceMarginWidgetInHomeScreenMapper");
        Intrinsics.checkNotNullParameter(disclaimerMapper, "disclaimerMapper");
        Intrinsics.checkNotNullParameter(swipeAssetTradeActionsMapper, "swipeAssetTradeActionsMapper");
        this.f251259a = cfdHomeHeaderMapper;
        this.f251260b = cfdPositionsMapper;
        this.f251261c = ordersMapper;
        this.d = maintenanceMarginWidgetInHomeScreenMapper;
        this.e = disclaimerMapper;
        this.f = swipeAssetTradeActionsMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i state = (i) jVar;
        Intrinsics.checkNotNullParameter(state, "domainState");
        Data data = state.f251241a;
        Data data2 = state.f251242b;
        Data data3 = state.f251246j;
        tx0.r rVar = null;
        List listE0 = (data == null || data2 == null || data3 == null) ? null : d0.E0(((gah.g) this.e).c(state.k, d7.DISCLAIMER), (Collection) iii.c.f(t1.u(data, data2, data3), new r2d.d(this, 16), new qz9.u(19), new z(this, state, 23)));
        if (listE0 == null) {
            listE0 = f0.f322471a;
        }
        t3b.e eVar = (t3b.e) this.f251259a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        int i = R$drawable.uikit_icn_24_back_button_arrow;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_margin_cfd_home_margin, null, null, 14);
        List listL = zhm.v.l(state.f251245h ? IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "CFD_ANALYTICS_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_bar_chart, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124) : null);
        Data data4 = state.f251241a;
        if (data4 != null && data2 != null) {
            rVar = (tx0.r) iii.c.f(t1.t(data4, data2), new t3b.b(eVar, 0), new t3b.c(eVar, 0), new si5.c(state, eVar, 9));
        }
        return new o(new m(i, textLocalisedClause, listL, rVar), listE0);
    }
}
