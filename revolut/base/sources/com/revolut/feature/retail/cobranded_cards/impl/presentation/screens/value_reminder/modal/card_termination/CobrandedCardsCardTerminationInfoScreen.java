package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.modal.card_termination;

import aii.q;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderCardInfoDetails;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import jii.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.v5;
import rd0.e;
import vc.s;
import z4l.j;
import z7b.a;
import z7b.b;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/value_reminder/modal/card_termination/CobrandedCardsCardTerminationInfoScreen;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Laii/q;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CobrandedCardsCardTerminationInfoScreen extends SimpleViewController<q> {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(CobrandedCardsCardTerminationInfoScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final CobrandedCardsValueReminderCardInfoDetails N;
    public final int O;
    public final h P;
    public final b Q;
    public final b R;
    public final j S;

    public CobrandedCardsCardTerminationInfoScreen(CobrandedCardsValueReminderCardInfoDetails cardInfoDetails) {
        Intrinsics.checkNotNullParameter(cardInfoDetails, "cardInfoDetails");
        this.N = cardInfoDetails;
        this.O = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        this.P = s.t(this, a.f);
        b bVar = new b();
        this.Q = bVar;
        this.R = bVar;
        this.S = new j(7, u.c(new PlainTextDelegate()), false);
    }

    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return this.R;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarBottomSheet navBarBottomSheet = d3().f174546c;
        CobrandedCardsValueReminderCardInfoDetails cobrandedCardsValueReminderCardInfoDetails = this.N;
        navBarBottomSheet.setHeaderModel(new lw0.a(new TextClause(cobrandedCardsValueReminderCardInfoDetails.f82466a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, 30));
        d3().f174545b.setText(new TextClause(cobrandedCardsValueReminderCardInfoDetails.f82468c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        ScreenContentRecyclerView screenContentRecyclerView = d3().d;
        j jVar = this.S;
        screenContentRecyclerView.setAdapter(jVar);
        screenContentRecyclerView.setLayoutManager(new LinearLayoutManager(m2()));
        screenContentRecyclerView.addItemDecoration(new o31.b());
        List listC = u.c(new PlainTextDelegate.Model("list_id_card_info_text", (Clause) null, (Clause) new TextClause(cobrandedCardsValueReminderCardInfoDetails.f82467b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        jVar.c(listC);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e.b(d3().f174545b.o), new z3f.b(this, null, 2), 3);
    }

    public final o d3() {
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.O;
    }
}
