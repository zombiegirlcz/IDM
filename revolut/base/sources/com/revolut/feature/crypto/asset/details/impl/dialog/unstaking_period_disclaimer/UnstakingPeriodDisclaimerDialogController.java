package com.revolut.feature.crypto.asset.details.impl.dialog.unstaking_period_disclaimer;

import a07.d;
import ad5.a;
import aii.q;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.e;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.staking.api.R$plurals;
import com.revolut.feature.staking.api.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.v5;
import o31.b;
import vc.s;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto/asset/details/impl/dialog/unstaking_period_disclaimer/UnstakingPeriodDisclaimerDialogController;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Laii/q;", "feature_crypto_asset_details_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UnstakingPeriodDisclaimerDialogController extends SimpleViewController<q> {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(UnstakingPeriodDisclaimerDialogController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final int N;
    public final int O = R$layout.screen_bottom_sheet_base;
    public final h P = s.t(this, a.f);
    public final j Q = new j(7, u.c(new PlainTextDelegate()), false);

    public UnstakingPeriodDisclaimerDialogController(int i) {
        this.N = i;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174514c.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.staking_details_unstaking_period_dialog_title, null, null, 14), null, null, null, false, 30));
        ScreenContentRecyclerView screenContentRecyclerView = d3().d;
        j jVar = this.Q;
        screenContentRecyclerView.setAdapter(jVar);
        screenContentRecyclerView.setLayoutManager(new LinearLayoutManager(m2()));
        screenContentRecyclerView.setVisibility(0);
        screenContentRecyclerView.addItemDecoration(new b());
        PlainTextDelegate.Model model = new PlainTextDelegate.Model("UNSTAKING_PERIOD_DISCLAIMER_BREAKDOWN", (Clause) null, (Clause) new TextLocalisedQuantityClause(R$plurals.staking_details_unstaking_period_dialog_breakdown, Integer.valueOf(this.N), (List) null, (Style) null, 28), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        jVar.c(u.c(model));
        d3().f174513b.setModel(new e(false, null, null, new n6(new TextLocalisedClause(R$string.staking_details_unstaking_period_dialog_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174513b.f), new d(this, null, 17), 3);
    }

    public final jii.e d3() {
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.e) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.O;
    }
}
